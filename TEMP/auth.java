package com.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import com.google.gson.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.tomcat.jakartaee.commons.io.IOUtils;
import org.json.JSONObject;

class User {
	public String username;
	public String password;
}

public class auth extends HttpServlet {
//    private Gson gson = new Gson();
	private static final long serialVersionUID = 1L;
       
    public auth() {
        super();
    }

    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// System.out.println("request: " + new Gson().fromJson(req.getReader(), auth.class));

		// System.out.println("request: " + IOUtils.toString(req.getReader()));
		// System.out.println("request: " + req.getReader().lines().reduce("", String::concat));
//        InputStream inputStream = req.getInputStream();
        User user = new Gson().fromJson(req.getReader(), User.class);
		// String body = new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.joining("\n"));
//		System.out.println("request: " + body);
        // JSONObject resObj = new JSONObject();
	// 	System.out.println(user.username + " " + user.password);
		
	// 	resObj.put("username", user.username);	
	// 	resObj.put("password", user.password);

	    res.setContentType("application/json");
	    res.setCharacterEncoding("UTF-8");
	    // String userJsonString =  new Gson().toJson(user);
	    // res.getWriter().write(userJsonString);
	    res.setStatus(200);
	    res.sendRedirect("https://api.exchangerate.host/latest?base=USD");
	}

}
