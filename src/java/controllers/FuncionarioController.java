/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import models.FuncionarioModel;

/**
 *
 * @author Bruno
 */
public class FuncionarioController {

    public FuncionarioModel funcionario;
    public String redirect;

    public ArrayList fetchAll() throws Exception {
        funcionario = new FuncionarioModel();
        ArrayList<Object> array = new ArrayList<>();

        try {
            array = funcionario.fetchAll();
        } catch (Exception e) {
            System.out.print(e);
        }

        return array;
    }

    public String redirect() {
        return this.redirect;
    }
}
