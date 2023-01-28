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

// Servlet for URL pattern /api/user
public class User extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private int userid = 0;
    private int hist_status = 0;
    private int count = 0;
    private JSONObject resObj;
    private Gson gson = new Gson();
    ResultSet rs = null;
    QueryExecute queryExecute = new QueryExecute();
       
    // Public Class Constructor
    public User() {
        super();
    }

    // Handling requests from client
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        userid = Integer.parseInt(req.getParameter("uid"));
    	res.setContentType("application/json");
    	res.setCharacterEncoding("UTF-8");
    	resObj = new JSONObject();
        try {
            rs = queryExecute.getData("SELECT userid, hist_status FROM users WHERE userid = ?;", new Object[]{userid});
            if(rs.next()) {
            	do {
                    System.out.println(rs.getString("hist_status"));
                    resObj.put("hist_status", rs.getString("hist_status"));
                }
                while(rs.next());
            	res.setStatus(200);
            }
            else {
            	res.setStatus(404);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

	    String userJsonString = new Gson().toJson(resObj);
	    System.out.println(userJsonString);
	    res.getWriter().write(userJsonString);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        userid = Integer.parseInt(req.getParameter("uid"));
        hist_status = Integer.parseInt(req.getParameter("hs"));
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");
        try {
            queryExecute.setData("UPDATE users SET hist_status = ? where userid = ?;", new Object[]{hist_status, userid});
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Crawl");
        }
        res.setStatus(200);
    }
}