/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boarding.brdrsbllsys.conn;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class DBConnection {

    private static DBConnection dBConnection;

    static public DBConnection getDBConnection() {
        if (null == dBConnection) {
            dBConnection = new DBConnection();
        }
        return dBConnection;
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        FileReader fileReader = null;
        Connection connection = null;
        try {
            fileReader = new FileReader("settings/dbProperties.properties");

            Class.forName("com.mysql.jdbc.Driver");
            Properties properties = new Properties();
            properties.load(fileReader);
            String url = "jdbc:mysql://" + properties.getProperty("ip") + "/" + properties.getProperty("database");
            connection = DriverManager.getConnection(url, properties.getProperty("username"), properties.getProperty("password"));
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
