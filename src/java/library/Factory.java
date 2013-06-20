package library;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bruno
 */
public class Factory {

    public Object instanceClass = null;

    public void initInstanceClass(String className) {
        try {
            instanceClass = Class.forName(className).newInstance();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Object instanceClassMethods() {

        Object classMethods = this.instanceClass;

        if (classMethods.equals(classMethods)) {
            return classMethods.getClass().getMethods();
        } else {
            return classMethods = null;
        }
    }

    public Object instanceClassGetAttr(String Attr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {

        Object classAttr = this.instanceClass;
        
        return classAttr.getClass().getField(Attr).get(classAttr);
    }
}