package com.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.google.gson.*;


class GetData {
    public String username;
    public String password;
}

// Servlet for URL pattern /query
public class Query extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private String api_URL = "";
    private String base = "";
       
    // Public Class Constructor
    public Query() {
        super();
    }

    // Handling requests from client
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // base = req.getParameter("base");
    	System.out.println("Ok");
        api_URL = "https://api.exchangerate.host/latest?base=" + "USA";
    	res.setContentType("application/json");
    	res.setCharacterEncoding("UTF-8");
    	res.setStatus(200);
    	res.sendRedirect(api_URL);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        GetData getData = new Gson().fromJson(req.getReader(), GetData.class);
        String userJsonString =  new Gson().toJson(getData);
        res.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");
        res.setStatus(200);
        res.getWriter().write(userJsonString);
    }
}
