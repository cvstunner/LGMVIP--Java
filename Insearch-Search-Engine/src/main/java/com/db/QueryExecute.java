package com.db;  

import java.sql.*;
import javax.swing.JOptionPane;

public class QueryExecute {

    QueryExecute(){
        returned = infoGetter(); 
    }

    public ResultSet getData(String Query) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            rs = st.executeQuery(Query);

            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }

        return null;
    }

    //Getter Methods
    String returned[] = new String[5]; 

    public String getName() {
        return returned[0];
    }

    public String getAge() {
        return returned[1];
    }

    public String getGender() {
        return returned[2];
    }

    public String getPhoneString() {
        return returned[3];
    }
    
    public String getEmail() {
        return returned[4];
    }

    public String[] infoGetter() {
//        LoginPage loginPage = new LoginPage();
//        String phone = loginPage.getUserPhone();
        String getInfoQuery = "select * from ManageUsers where phone = '" + "" + "'";

        try {
            ResultSet rs = getData(getInfoQuery);

            if (rs.next()) {
                returned[0] = rs.getString("Name");
                returned[1] = rs.getString("Age");
                returned[2] = rs.getString("Gender");
                returned[3] = rs.getString("Phone");
                returned[4] = rs.getString("Email");
            }
            // rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return returned;
    }
}