package com.ths;

class Cal
{
	public void add()
	{
		System.out.println(12+30);
	}
}

class Math
{
	public void div()
	{
		System.out.println(30/20);
	}
}

class Exp4 implements Runnable
{
	@Override
	public void run()
	{
		try
		{
			System.out.println("i am from run()");
			Cal c = new Cal();
		
			c.add();
			Thread.sleep(2000);
			
			Math m = new Math();
			
			m.div();
		}
		catch(Exception e)
		{
			System.out.println("excetpion in thread");
		}
		
	}
}

public class RunTest 
{
	public static void main(String[] args) {
		
		Exp4 t1 = new Exp4();
		
		//t1.start();// error
		
		//t1.join();
		
		//converting runnable interface object into thread class object
		Thread t2 = new Thread(t1, "Bank");
		
		t2.start();
		
		System.out.println(t2.getName());
	}
	
}
