package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Exp1 
{
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
		Statement stmt = con.createStatement();
		
		//String sql = "create table ja4Data (id int, name varchar(150), city varchar(150))";
		
		String sql = "insert into ja4data values ("+id+", '"+name+"', '"+city+"')";
		
		//4 execute the query
		stmt.execute(sql);
		
		System.out.println("Done...!");
		
		//5 close the connection
		con.close();
	}
}
