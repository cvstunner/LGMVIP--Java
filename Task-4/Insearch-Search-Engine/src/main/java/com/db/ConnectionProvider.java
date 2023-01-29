package com.db;

import java.sql.*;

public class ConnectionProvider {
    Connection con = null;

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Insearch", "root", "");
            return con;
        }
        catch (Exception e) {
            e.printStackTrace(); 
            return null;
        }
    }
}