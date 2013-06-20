/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Bruno
 */
import controllers.ConnectionController;
import java.sql.ResultSet;
import java.sql.Statement;

public class Models {

    private String _sql;
    public String _table;
    private String _primary;

    public ResultSet resultSet() {
        
        ResultSet rs = null;
        
        ConnectionController conn = new ConnectionController();
        _sql = "SELECT * FROM " + _table;

        try {
            Statement stmt = conn.odbcConnection().createStatement();
            rs = stmt.executeQuery(_sql);

            return rs;

        } catch (Exception e) {
            System.out.println("Model Error: " + e);
        }

        return rs;
    }
}
