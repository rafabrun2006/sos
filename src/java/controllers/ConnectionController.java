/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.sun.faces.config.WebConfiguration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Configs.Database;

/**
 *
 * @author Bruno
 */
public class ConnectionController {

    private String url = null;
    private String classForName = null;
    private Connection conn;

    public Connection odbcConnection() throws SQLException {

        this.url = "jdbc:" + Configs.Database._ODBC_DRIVER + "://localhost/" + Configs.Database._ODBC_DB;
        this.classForName = "com." + Configs.Database._ODBC_DRIVER + ".jdbc.Driver";

        try {
            Class.forName(this.classForName).newInstance();

            this.conn = DriverManager.getConnection(this.url, Configs.Database._ODBC_USER, Configs.Database._ODBC_PASSWORD);

        } catch (Exception e) {
            System.out.println("SQLError: " + e);
        }

        return this.conn;
    }
}
