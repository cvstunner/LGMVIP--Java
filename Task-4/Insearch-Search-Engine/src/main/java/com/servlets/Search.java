package com.servlets;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.google.gson.*;
import org.json.JSONObject;
import java.sql.*;
import com.db.QueryExecute;

// Servlet for URL pattern /query
public class Search extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static int serialPageID = 0;
    private String query = "";
    private int count = 0;
    JSONObject resObj = new JSONObject();
    private Gson gson = new Gson();
    ResultSet rs = null;
       
    // Public Class Constructor
    public Search() {
        super();
    }
    
    private boolean isCompletelyWritten(File file) {
        RandomAccessFile stream = null;
        try {
            stream = new RandomAccessFile(file, "rw");
            return true;
        } catch (Exception e) {
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                }
            }
        }
        return false;
    }

    // Handling requests from client
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println(req.getParameter("q"));
        query = req.getParameter("q").replaceAll(" ", "* ") + "*";
    	System.out.println("Ok");
        QueryExecute queryExecute = new QueryExecute();
        String htmlText = "";
        try {
            rs = queryExecute.getData("SELECT urlid, url, title, description FROM BigData WHERE MATCH(url, title, keywords, description) AGAINST(? IN BOOLEAN MODE);", new Object[]{query});
            while(rs.next()) {
                System.out.println(rs.getString("url"));
                resObj.put(String.valueOf(count), rs.getString("url"));
                htmlText = htmlText 
                + "         <div>\r\n"
                + "             <div class=\"link-wrpr\">\r\n"
                + "                 <p>" + rs.getString("url") + "</p>\r\n"
                + "             </div>\r\n"
                + "             <div class=\"title-wrpr\">\r\n"
                + "                 <a href=\"" + rs.getString("url") + "\">" + rs.getString("title") + "</a>\r\n"
                + "             </div>\r\n"
                + "             <div class=\"dscp-wrpr\">\r\n"
                + "                 <p>" + rs.getString("description") + "</p>\r\n"
                + "             </div>\r\n"
                + "         </div>\r\n";
                count++;
                if(count == 9){
                    break;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Crawl");
        }
          
          String html = "<!DOCTYPE html>\r\n"
          		+ "<html lang=\"en\">\r\n"
          		+ "<head>\r\n"
          		+ "	<meta charset=\"UTF-8\">\r\n"
          		+ "	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
          		+ "	<title>Insearch</title>\r\n"
          		+ "	<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/results.css?version=5\">    \r\n"
          		+ "</head>\r\n"
          		+ "<body id=\"body\">\r\n"
          		+ "	<header>\r\n"
          		+ "		<nav>\r\n"
          		+ "            <form id=\"search-form\" action=\"../search\" method=\"get\" onsubmit=\"event.preventDefault();search_form_submitted()\">\r\n"
          		+ "                <a href=\"../\" id=\"logo-wrpr\">\r\n"
          		+ "                    <p>Insearch</p>\r\n"
          		+ "                </a>\r\n"
          		+ "                <div id=\"srch-input-wrpr\">\r\n"
          		+ "                    <div id=\"srch-input-sub-wrpr\">\r\n"
          		+ "                        <input id=\"srch-input\" type=\"text\" name=\"q\" placeholder=\"Insearch of ...\" autocomplete=\"off\">\r\n"
          		+ "                        <div id=\"srch-hist-wrpr\">\r\n"
          		+ "                        </div>\r\n"
          		+ "                    </div>\r\n"
          		+ "                </div>\r\n"
          		+ "            </form>\r\n"
          		+ "            <div>\r\n"
          		+ "                <div id=\"settings-icon-wrpr\"  onclick=\"settings_icon_clicked()\" name=\"hidden\">\r\n"
          		+ "                    <div class=\"settings-icon\"></div>\r\n"
          		+ "                </div>\r\n"
          		+ "                <span id=\"acc-icon-wrpr\" onclick=\"acc_icon_clicked()\" name=\"hidden\">\r\n"
          		+ "                    <div id=\"acc-icon\"></div>\r\n"
          		+ "                </span>\r\n"
          		+ "            </div>\r\n"
          		+ "		</nav>\r\n"
          		+ "	</header>\r\n"
          		+ "    <div id=\"sidebar-bg\" onclick=\"sidebar_close_icon_clicked()\"></div>\r\n"
          		+ "    <section class=\"sidebar\" id=\"settings-sidebar\">\r\n"
          		+ "        <nav>\r\n"
          		+ "            <div>\r\n"
          		+ "                <div>\r\n"
          		+ "                    <div>\r\n"
          		+ "                        <div class=\"settings-icon settings-sidebar-icon\" class=\"settings-sidebar-icon\"></div>\r\n"
          		+ "                        <p>Settings</p>\r\n"
          		+ "                    </div>\r\n"
          		+ "                    <span>\r\n"
          		+ "                        <p onclick=\"settings_icon_clicked()\">X</p>\r\n"
          		+ "                    </span>\r\n"
          		+ "                </div>\r\n"
          		+ "                <hr>\r\n"
          		+ "                <div class=\"settings-sidebar-items\">\r\n"
          		+ "                    <div>   \r\n"
          		+ "                        <p>History</p>\r\n"
          		+ "                        <label class=\"toggle-btn\" for=\"history-toggle\">\r\n"
          		+ "                            <input id=\"history-toggle\" type=\"checkbox\" onclick=\"toggle_btn_clicked()\" checked>\r\n"
          		+ "                            <span class=\"toggle-btn-fg\"></span>\r\n"
          		+ "                        </label>\r\n"
          		+ "                    </div>\r\n"
          		+ "                    <div>\r\n"
          		+ "                        <p>Delete Searches</p>\r\n"
          		+ "                        <button onclick=\"del_hist_btn_clicked()\">delete</button>\r\n"
          		+ "                    </div>\r\n"
          		+ "                </div>\r\n"
          		+ "                <hr>\r\n"
          		+ "            </div>\r\n"
          		+ "        </nav>\r\n"
          		+ "    </section>\r\n"
          		+ "    <section class=\"sidebar\" id=\"acc-sidebar\">\r\n"
          		+ "        <nav>\r\n"
          		+ "            <div>\r\n"
          		+ "                <div>\r\n"
          		+ "                    <div>\r\n"
          		+ "                        <div class=\"settings-icon settings-sidebar-icon\" class=\"settings-sidebar-icon\"></div>\r\n"
          		+ "                        <p>Accounts</p>\r\n"
          		+ "                    </div>\r\n"
          		+ "                    <span>\r\n"
          		+ "                        <p onclick=\"acc_icon_clicked()\">X</p>\r\n"
          		+ "                    </span>\r\n"
          		+ "                </div>\r\n"
          		+ "                <hr>\r\n"
          		+ "                <div class=\"settings-sidebar-items acc-sidebar-items\">\r\n"
          		+ "                    <div>   \r\n"
          		+ "                        <p>chetanshigwan789@gmail.com</p>\r\n"
          		+ "                    </div>\r\n"
          		+ "                    <div>\r\n"
          		+ "                        <button>log out</button>\r\n"
          		+ "                    </div>\r\n"
          		+ "                </div>\r\n"
          		+ "                <hr>\r\n"
          		+ "            </div>\r\n"
          		+ "        </nav>\r\n"
          		+ "    </section>\r\n"
          		+ "	<main>\r\n"
          		+ "		<div id=\"srch-results-wrpr\">\r\n"
          		+ htmlText
          		+ "		</div>\r\n"
          		+ "	</main>\r\n"
          		+ "	<script type=\"text/javascript\" src=\"../js/results.js\"></script>\r\n"
          		+ "</body>\r\n"
          		+ "</html>";
 
        serialPageID++;
        FileWriter fw = new FileWriter(getServletContext().getRealPath("/html") + "\\results"+ serialPageID +".jsp");
        System.out.println(getServletContext().getRealPath("/html"));
        fw.write(html);
        fw.flush();
        fw.close();
    final AsyncContext asyncContext = req.startAsync(req, res);
        new Thread() {
          @Override
          public void run() {
            try {
                ServletResponse response = asyncContext.getResponse();
                File file = new File(getServletContext().getRealPath("/html") + "\\results"+ serialPageID +".jsp");
                res.setContentType("text/html");
                res.setCharacterEncoding("UTF-8");
                while(isCompletelyWritten(file)){
                    System.out.println("completed!");
                    asyncContext.complete();	
                    Thread.sleep(100);
                    break;
                }
            }   
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
          }
        }.start();
        res.setStatus(200);
        res.sendRedirect("/Insearch-Search-Engine/html/results"+ serialPageID +".jsp");
    }
}