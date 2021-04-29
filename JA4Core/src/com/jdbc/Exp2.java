package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exp2 {
	
	public static void main(String[] args) throws Exception
	{
		//sql batch process
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ja4", "root", "password");
		
		con.setAutoCommit(false);
		
		Statement stmt = con.createStatement();
		
		String sql = "insert into ja4data values (7,'harika', 'BTM')";
		
		stmt.addBatch(sql);
		stmt.addBatch("insert into ja4data values (6,'sai priya', 'TPT')");
		//stmt.addBatch("update ja4data set name = 'Divya', city = 'Vizag' where id = 3");
		//stmt.addBatch("delete from ja4data where id = 2");
		
		stmt.executeBatch();	
		
		System.out.println("Done");
		
		//con.commit();
		con.rollback();
		
		con.close();
	}

}
