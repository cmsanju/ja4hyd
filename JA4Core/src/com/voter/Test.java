package com.voter;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws ValidVoterException,InvalidVoterException
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your age");
		
		int age = sc.nextInt();
		
		Validater ve = new Validater();
		
		ve.checkAge(age);
	}

}
