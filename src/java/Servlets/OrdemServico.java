/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import controllers.OrdemServicoController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bruno
 */
@WebServlet(name = "ordem-servico", urlPatterns = {"/ordem-servico"})
public class OrdemServico extends HttpServlet {

    public HttpServletRequest request;
    public HttpServletResponse response;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            OrdemServicoController ordemServico = new OrdemServicoController();
            switch (request.getParameter("option")) {
                case "cadastro":
                    if (ordemServico.save(request)) {
                        response.sendRedirect("index.jsp?url=os/os.jsp&msg=1");
                    }
                    break;
                case "alterar":
                    if (ordemServico.save(request)) {
                        response.sendRedirect("index.jsp?url=os/os.jsp&msg=2");
                    }
                    break;
                case "excluir":
                    if (ordemServico.delete(request)) {
                        response.sendRedirect("index.jsp?url=os/os.jsp&msg=3");
                    }
                    break;
                default:
                    out.println("Nenhuma operação enviada para esta Servlet<br><br>");
                    out.println("<a href='index.jsp'>Voltar</a>");
            }

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
