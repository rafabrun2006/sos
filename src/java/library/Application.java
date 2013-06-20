package library;


import java.lang.reflect.Method;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bruno
 */
public class Application {

    public Object Controller;
    public Object Action;
    private Object classe;

    public Object getController() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class classe = Class.forName(this.Controller + "Controller");
        Object instance = classe.newInstance();
        this.classe = instance;
        return this.classe;
    }

    public void setController(String Controller) {
        this.Controller = Controller;
    }

    public Object getAction() {
        return this.Action;
    }

    public void setAction(String Action) {
        this.Action = Action;
    }
}
