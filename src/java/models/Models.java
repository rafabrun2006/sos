/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Bruno
 */
import com.mysql.jdbc.PreparedStatement;
import controllers.ConnectionController;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Models {

    protected String _sql;
    protected String _table;
    protected String _primary;
    public int resultQuery;

    public Models(){
        System.out.println(_sql);
    }
    
    public ResultSet resultSet() {

        ResultSet rs = null;

        ConnectionController conn = new ConnectionController();
        _sql = "SELECT * FROM " + _table;
        System.out.print(_sql);
        
        try {
            Statement stmt = conn.odbcConnection().createStatement();
            rs = stmt.executeQuery(_sql);

            return rs;
        } catch (Exception e) {
            System.out.println("Model Error: " + e);
        }

        return rs;
    }

    public ResultSet findBy(ArrayList dataArray) {

        ResultSet rs = null;

        _sql = "SELECT * FROM " + this._table + this.mountWhere(dataArray);
        System.out.println(_sql);
        ConnectionController conn = new ConnectionController();

        try {
            Statement stmt = conn.odbcConnection().createStatement();
            rs = stmt.executeQuery(this._sql);

            return rs;
        } catch (Exception e) {
            System.out.println("Model Error: " + e);
        }

        return rs;
    }

    protected String mountWhere(ArrayList dataArray) {

        String sql = " WHERE ";
        
        for (Object item : dataArray) {

            if (dataArray.indexOf(item) == 0) {
                sql += "" + item;
            } else {
                sql +=" AND " + item;
            }
        }

        return "" + sql;
    }
    
    public Boolean delete(int id){
        
        PreparedStatement stmt = null;
        ConnectionController conn = new ConnectionController();
        
        try{
            _sql = "DELETE FROM " + _table + " WHERE " + _primary + " = " + id;
            
            stmt = (PreparedStatement) conn.odbcConnection().prepareStatement(_sql);
            stmt.executeUpdate();
            stmt.close();
            
            return true;
        }catch(Exception e){
            System.out.print(e);
            return false;
        }
        
    }
}
