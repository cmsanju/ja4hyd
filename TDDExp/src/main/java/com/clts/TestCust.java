package com.clts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCust {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Customer> cstList = new ArrayList<Customer>();
		
		while(true)
		{
			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter Location");
			String loc = sc.next();
			System.out.println("if you need to add y / n");
			String opt = sc.next();
			
			if(id != 0 && name != null && loc != null )
			{
				Customer cst = new Customer(id,name,loc);
				
				cstList.add(cst);
			}
			if(opt.contains("n"))
			{
				break;
			}
		}
		CustDao cdao = new CustDao();
		
		cdao.addCustomer(cstList);
		
		List<Customer> csList = cdao.listAll();
		
		for(Customer cst : csList)
		{
			System.out.println("Cust ID: "+cst.getcId()+" Cust Name : "+cst.getcName()+" Cust Loc : "+cst.getCloc());
		}
	}
}
