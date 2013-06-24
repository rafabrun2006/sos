/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.ResultSet;
import java.util.ArrayList;
import models.Models;
/**
 *
 * @author Bruno
 */
public abstract class AbstractModel extends Models{
    
    
    public void construct(){
        super._table = "tableName";
        super._primary = "primaryName";
    }
    
    public ArrayList fetchAll() throws Exception{
        
        ArrayList<Class> classe = new ArrayList<>();
        
        ResultSet rs = this.resultSet();
        
        while(rs.next()){
            
            //Class classForUse = new Class<String>();
            //classForUse.set(rs.getString("attrTable"));
            //Sets attributes for use class
            //classe.add(classForUse);
        }
        
        return classe;
    }
    
}
