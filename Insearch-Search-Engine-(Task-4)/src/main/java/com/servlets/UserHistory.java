package com.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.google.gson.*;
import org.json.JSONObject;
import java.sql.*;
import com.db.QueryExecute;

// Servlet for URL pattern /api/user/history
public class UserHistory extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private int userid = 0;
    private int count = 0;
    private JSONObject resObj;
    private Gson gson = new Gson();
    ResultSet rs = null;
    QueryExecute queryExecute = new QueryExecute();
       
    // Public Class Constructor
    public UserHistory() {
        super();
    }

    // Handling requests from client
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println(req.getParameter("uid"));
        userid = Integer.parseInt(req.getParameter("uid"));
    	res.setContentType("application/json");
    	res.setCharacterEncoding("UTF-8");
    	resObj = new JSONObject();

        try {
            rs = queryExecute.getData("SELECT * FROM user_history WHERE EXISTS(SELECT hist_status FROM users WHERE userid = ? AND hist_status = true) AND userid = ?;", new Object[]{userid, userid});
            if(rs.next()) {
            	do {
                    System.out.println(rs.getString("query"));
                    resObj.put(String.valueOf(rs.getString("histid")), rs.getString("query"));
                }
                while(rs.next());
            	res.setStatus(200);
            }
            else {
            	res.setStatus(201);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Crawl");
        }

	    String userJsonString = new Gson().toJson(resObj);
	    System.out.println(userJsonString);
	    res.getWriter().write(userJsonString);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println(req.getParameter("uid"));
        userid = Integer.parseInt(req.getParameter("uid"));
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");
        GetData getData = new Gson().fromJson(req.getReader(), GetData.class);

        try {
            queryExecute.setData("INSERT INTO user_history (query, userid) SELECT ?, ? WHERE NOT EXISTS(SELECT query FROM user_history WHERE query = ?);", new Object[]{getData.query, userid, getData.query});
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Crawl");
        }

        res.setStatus(200); 
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println(req.getParameter("uid"));
        userid = Integer.parseInt(req.getParameter("uid"));
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");

        try {
            queryExecute.setData("DELETE FROM user_history WHERE userid = ?;", new Object[]{userid});
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Crawl");
        }
        res.setStatus(200);
    }

}

class GetData {
    public String query;
}