package com.ths;


class Exp2 extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 1; i <= 10; i++)
			{
				System.out.println(i);
				//Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


public class ThreadPr extends Thread
{
	
	public void run()
	{
		try
		{
			for(int i = 1; i <= 10; i++)
			{
				System.out.println(i);
				//Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Exp2 t1 = new Exp2();
		Exp2 t2 = new Exp2();
		Exp2 t3 = new Exp2();
		Exp2 t4 = new Exp2();
		
		//t1.start();
		
		System.out.println("Default thread name : "+t1.getName());
		
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		System.out.println(t4.getName());
		
		t1.setName("math");
		System.out.println("After setting the thread name : "+t1.getName());
		
		System.out.println("Default thread priority : "+t1.getPriority());
		System.out.println("Default thread priority : "+t2.getPriority());
		System.out.println("Default thread priority : "+t3.getPriority());
		System.out.println("Default thread priority : "+t4.getPriority());
		
		t1.setPriority(MAX_PRIORITY);//10 Min 1// NORM 5
		System.out.println("after setting thread priority : "+t1.getPriority());
		
	}
}
