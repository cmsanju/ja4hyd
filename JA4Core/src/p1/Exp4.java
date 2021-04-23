package p1;

import java.util.Scanner;

public class Exp4 {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter existing balance ");
	
	//String avl = sc.next();
	 //int avl = sc.nextInt();
	 
	 double avl = sc.nextDouble();
	 
	System.out.println("enter credited balance");
	
	//String crd = sc.next();
	
	  double crd = sc.nextDouble();
	
	System.out.println("Toal Avl Bal : "+(avl+crd));
	
		/*
		String avl = "3000";
		String crd = "4000";
		
		//byte short int long float double 
		
		System.out.println("Total bal : "+(avl+crd));//7000
		
		double xavl = Double.parseDouble(avl);
		double ycrd = Double.parseDouble(crd);
		
		System.out.println("Current Bal : "+(xavl+ycrd));
		
		Integer x = new Integer(120); 
		
		int xx = (Integer)Double.parseDouble("234");
		
		double dg = 23.45;
		
		long l = (long)dg;
		
		int inx = (int)l;
		*/
	}
}
