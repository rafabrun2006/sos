/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.http.HttpSession;
import models.AcessoModel;
import models.FuncionarioModel;

/**
 *
 * @author Bruno
 */
public class AcessoController {

    /**
     * 
     * @param user = null
     * @param password = null
     * @param session
     * @return
     * @throws Exception 
     */
    public FuncionarioModel validate(String user, String password, HttpSession session) throws Exception {
        AcessoModel acesso = new AcessoModel();
        
        acesso.setEmail(user);
        acesso.setSenha(password);

        FuncionarioModel funcionario = acesso.validate(acesso);

        return funcionario;
    }

    /**
     *
     * @param session
     * @return true or false
     */
    public Boolean isSession(HttpSession session) {
        
        try {
            if (session.getAttribute("email") != null) {
                return true;
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        
        return false;
    }

    public AcessoModel getSession(HttpSession session) {
        AcessoModel acesso = (AcessoModel) session.getAttribute("session");

        return acesso;
    }
}
