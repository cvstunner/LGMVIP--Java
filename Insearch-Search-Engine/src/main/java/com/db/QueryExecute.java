package com.db;

import java.sql.*;

interface sqlOperations{
    void setData(String Query, Object[] parameters);
    ResultSet getData(String Query, Object[] parameters);
    void setParameters(PreparedStatement statement, Object[] parameters) throws SQLException;
}

public class QueryExecute implements sqlOperations{
    @Override
    public void setParameters(PreparedStatement statement, Object[] parameters) throws SQLException {
        for (int i=0; i < parameters.length; i++) {
            statement.setObject(i+1, parameters[i]);
        }
    }

    @Override
    public void setData(String Query, Object[] parameters) {
        Connection con = null;
        PreparedStatement  st = null;

        try {
            con = ConnectionProvider.getCon();
            st = con.prepareStatement(Query);
            setParameters(st, parameters);
            st.executeUpdate();
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

    public ResultSet getData(String Query, Object[] parameters) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            con = ConnectionProvider.getCon();
            st = con.prepareStatement(Query);
            setParameters(st, parameters);
            rs = st.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("gd");
        }
        return rs;
    }
}