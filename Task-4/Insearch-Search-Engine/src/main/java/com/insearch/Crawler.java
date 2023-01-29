package com.insearch;

import java.io.*;
import java.io.IOException; 
import org.jsoup.Jsoup; 
import org.jsoup.nodes.Document; 
import com.db.QueryExecute;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.ResultSet;

public class Crawler{
	public static void indexURL() throws IOException{
		String url = "";
		String path = new File("src/main/resources/links/links.csv").getAbsolutePath();
		BufferedReader file = new BufferedReader(new FileReader(path));
		QueryExecute query = new QueryExecute();
		while((url = file.readLine()) != null){
			System.out.println(url);
			String keywords = "";
			String description = "";
			String title = "";
			Document doc = null;
			try{
				doc = Jsoup.connect(url).get();
			}
			catch (Exception e) {
				System.out.println(url+" down!");
				continue;
			}
			try{
				if (doc.title() != null){
					title = doc.title();
					System.out.println("title: " + title);
				}
			}
			catch (Exception e) {
				System.out.println(url + " title doesn't exist!");
			}
			try{
				if (doc.select("meta[name=keywords]").first() != null){
					keywords = doc.select("meta[name=keywords]").first().attr("content");
					System.out.println("keywords: " + keywords);
				}
			}
			catch (Exception e) {
				System.out.println(url + " keywords doesn't exist!");
			}
			try{
				if (doc.select("meta[name=description]").get(0) != null){
					description =doc.select("meta[name=description]").get(0).attr("content");
					System.out.println("description: " + description);
				}
			}
			catch (Exception e) {
				System.out.println(url + " description doesn't exist!");
			}
			
			query.setData("INSERT INTO BigData (url, title, keywords, description) values (?, ?, ?, ?);", new Object[]{url, title, keywords, description});
		}
		file.close();
	}
	public static void main(String[] args) throws IOException {
		indexURL();
	} 	
}