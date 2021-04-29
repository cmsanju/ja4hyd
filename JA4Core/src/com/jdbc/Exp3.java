package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Exp3 {
		
	public static void main(String[] args) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id");
		
		int id = sc.nextInt();
		
		System.out.println("Enter name ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Enter city ");
		//sc.nextLine();
		String city = sc.nextLine();
		
		//1 load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");// oracle.jdbc.driver.OracleDriver
		
		//2 create connection object //"jdbc:oracle:thin:@localhost:1521:xe", "system", "password" 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ja4", "root", "password");
		
		//3 create statement object
		PreparedStatement pst = con.prepareStatement("insert into ja4data values (?,?,?)");
		
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, city);
		
		pst.execute();
		
		System.out.println("Done");
		
		con.close();
		
	}
}
