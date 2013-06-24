/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import library.MensagemHelper;
import models.OrdemServicoModel;

/**
 *
 * @author Bruno
 */
public class OrdemServicoController {

    public String redirect;
    public OrdemServicoModel servicoModel = new OrdemServicoModel();

    public OrdemServicoController() {
        //Todo
    }

    public ArrayList fetchAll() throws Exception {
        ArrayList<Object> array = new ArrayList<>();

        try {
            array = this.servicoModel.fetchAll();
        } catch (Exception e) {
            System.out.print(e);
        }

        return array;
    }

    public Boolean save(HttpServletRequest request) throws ExceptionInInitializerError {

        OrdemServicoModel model = new OrdemServicoModel();

        try {

            if (!request.getParameter("codigo").isEmpty()) {
                model.setCodigo(Integer.parseInt(request.getParameter("codigo")));
            }

            model.setCod_cliente(Integer.parseInt(request.getParameter("cod_cliente")));
            model.setCod_equipamento(Integer.parseInt(request.getParameter("cod_equipamento")));
            model.setCod_peca_estoque(Integer.parseInt(request.getParameter("cod_peca_estoque")));
            model.setCod_servico(Integer.parseInt(request.getParameter("cod_servico")));
            model.setData_abertura(request.getParameter("data_abertura"));
            model.setData_encerramento(request.getParameter("data_encerramento"));
            model.setDefeito_constatado(request.getParameter("defeito_constatado"));
            model.setDefeito_informado(request.getParameter("defeito_informado"));
            model.setMatr_funcionario(Integer.parseInt(request.getParameter("matr_funcionario")));
            model.setObservacao(request.getParameter("observacao"));
            model.setSituacao_atual(request.getParameter("situacao_atual"));
            model.setSituacao_orcamento(request.getParameter("situacao_orcamento"));
            model.setTipo_servico(request.getParameter("tipo_servico"));
            model.setValor(Double.parseDouble(request.getParameter("valor")));
            model.save(model);

            request.getSession().setAttribute("mensagem", "Dados inseridos com sucesso!");

            return true;

        } catch (Exception e) {
            System.out.print(e);
            return false;
        }
    }

    public String redirect() {
        return this.redirect;
    }

    public boolean delete(HttpServletRequest request) {

        try {
            this.servicoModel.setCodigo(Integer.parseInt(request.getParameter("codigo")));
            this.servicoModel.delete(servicoModel);

            return true;
        } catch (Exception e) {
            System.out.print(e);
            return false;
        }

    }
}
