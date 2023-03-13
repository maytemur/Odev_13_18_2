package com.notepet;
import java.sql.*;
import java.sql.Driver;
/**
 *
 * @author Mustafa
 */
public class database_connect {
    public  Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        String url="jdbc:mysql://localhost:1500/portaldatabase";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, "root", "root");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return conn;
         }/** Creates a new instance of database_connect */
}