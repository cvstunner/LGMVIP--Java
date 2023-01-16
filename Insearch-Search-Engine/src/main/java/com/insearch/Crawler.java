package com.insearch;

import java.io.*;
import java.io.IOException; 
import org.jsoup.Jsoup; 
import org.jsoup.nodes.Document; 
import com.db.QueryUpdateDelete;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Crawler{
	public static void indexURL() throws IOException{
		String url = "";
		String path = new File("src/main/resources/links/links.csv").getAbsolutePath();
		BufferedReader file = new BufferedReader(new FileReader(path));
		QueryUpdateDelete query = new QueryUpdateDelete();
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

			if (doc.title() != null){
				title = doc.title();
				System.out.println("title: " + title);
			}
			if (doc.select("meta[name=keywords]").first() != null){
				keywords = doc.select("meta[name=keywords]").first().attr("content");
				System.out.println("keywords: " + keywords);
			}
			if (doc.select("meta[name=description]").get(0) != null){
				description =doc.select("meta[name=description]").get(0).attr("content");
				System.out.println("description: " + description);
			}
			query.setQuery("INSERT INTO BigData (url, title, keywords, description) values ('" + url + "','" +  title + "','" + keywords + "','" + description + "');");
		}
		file.close();
	}
	public static void main(String[] args) throws IOException {
		indexURL();
	}
}