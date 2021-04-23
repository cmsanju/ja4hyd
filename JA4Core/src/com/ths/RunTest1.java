package com.ths;

class Exp7
{
	public void userDeatails()
	{
		System.out.println("user details from exp7");
	}
}

class Exp8
{
	public void customerDetails()
	{
		System.out.println("exp8 custdetails ");
	}
}

class Bank implements Runnable
{
	public void run()
	{
		try
		{
			System.out.println("i am from run() : "+Thread.currentThread().getName());
			/*
			Exp7 e = new Exp7();
			
			e.userDeatails();
			
			Thread.sleep(3000);
			Exp8 e1 = new Exp8();
			
			e1.customerDetails();
			*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}

public class RunTest1 {
	
	public static void main(String[] args) {
		
		Bank t1 = new Bank();
		
		//t1.start();
		
		ThreadGroup tg1 = new ThreadGroup("Bank");
		
		//runnable interface object into thread class
		Thread t2 = new Thread(tg1, t1, "Withdraw");
		Thread t3 = new Thread(tg1, t1, "Credit");
		Thread t4 = new Thread(tg1, t1, "Transfer");
		
		ThreadGroup tg2 = new ThreadGroup("Maths");
		
		Thread t5 = new Thread(tg2, t1, "add");
		Thread t6 = new Thread(tg2, t1, "sub");
		Thread t7 = new Thread(tg2, t1, "mul");
		
		t2.start();
		t4.start();
		System.out.println("Bank group active threads : "+tg1.activeCount());
		t5.start();
		t6.start();
		System.out.println("Maths group active threads : "+tg2.activeCount());
	}

}
