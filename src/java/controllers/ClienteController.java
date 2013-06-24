/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import models.ClienteModel;

/**
 *
 * @author Bruno
 */
public class ClienteController {

    public ClienteModel cliente;
    public String redirect;

    public ArrayList fetchAll() throws Exception {
        cliente = new ClienteModel();
        ArrayList<Object> array = new ArrayList<>();

        try {
            array = cliente.fetchAll();
        } catch (Exception e) {
            System.out.print(e);
        }

        return array;
    }

    public String redirect() {
        return this.redirect;
    }
}
