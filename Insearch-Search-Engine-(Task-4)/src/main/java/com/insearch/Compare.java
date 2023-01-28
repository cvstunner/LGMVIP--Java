package com.insearch;

import java.io.*;
import java.io.IOException; 
import com.db.QueryExecute;
import java.io.BufferedReader;
import java.io.FileReader;

public class Compare{
	public static boolean compare(String str1, String str2) {
    	return str1.regionMatches(true, 0, str2, 0, 4);
	}

	public static void indexURL() throws IOException{
		String word = "";
		String path = new File("src/main/resources/wordlist/wordlist.txt").getAbsolutePath();
		BufferedReader file = new BufferedReader(new FileReader(path));
		while((word = file.readLine()) != null){
			if (compare("gaming", word)) {
				System.out.println(word);
			}
		}
		file.close();
	}
	public static void main(String[] args) throws IOException {
		indexURL();
	} 	
}