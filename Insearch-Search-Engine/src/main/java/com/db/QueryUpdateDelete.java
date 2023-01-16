package com.db;

import java.sql.*;

public class QueryUpdateDelete {
    public void setQuery(String Query) {
        Connection con = null;
        Statement st = null;

        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate(Query);
            System.out.println("Inserted Successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }

        finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}