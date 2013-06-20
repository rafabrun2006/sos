/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author Bruno
 */
public class Controllers {

    public String redirect;

    public static void main(String args[]) {
        library.Factory factory = new library.Factory();
        
        factory.initInstanceClass("controllers.FuncionarioController");
        //System.out.print(factory.instanceClassGetAttr("data"));
    }
}
