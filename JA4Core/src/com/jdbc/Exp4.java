package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Exp4 {
	
	public static void main(String[] args) throws Exception
	{
		
		//1 load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");// oracle.jdbc.driver.OracleDriver
		
		//2 create connection object //"jdbc:oracle:thin:@localhost:1521:xe", "system", "password" 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ja4", "root", "password");
		
		//3 create statement object
		PreparedStatement pst = con.prepareStatement("select * from ja4data");
		
		ResultSet rs = pst.executeQuery();
		
		while(rs.next())
		{
			System.out.println("ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" City : "+rs.getString(3));
		}
	}

}
