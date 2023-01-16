package com.db;
import com.db.QueryExecute;

public class Main{
	public static void main(String[] args) {
        QueryExecute infoGet = new QueryExecute();
        ResultSet rs = infoGet.getData(Query);
        System.out.println(rs);
	}
}