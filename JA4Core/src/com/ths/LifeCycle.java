package com.ths;

class Exp1 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			System.out.println("i am from run()");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


public class LifeCycle {
	public static void main(String[] args) throws Exception
	{
		
		Exp1 t1 = new Exp1(); //1-10 1-5 
		Exp1 t2 = new Exp1();
		
		System.out.println("Before starting thread state : "+t1.getState());//NEW
		System.out.println("Before starting thread status : "+t1.isAlive());//false
		t1.start();
		System.out.println("after starting thread state : "+t1.getState());//RUNNABLE
		System.out.println("after starting thread status : "+t1.isAlive());//true
		
		//Thread.sleep(500);
		System.out.println("in sleep thread state : "+t1.getState());//TIMED_WAITING
		System.out.println("in sleep thread status : "+t1.isAlive());//false
		
		t1.join();
		
		System.out.println("after joining thread state : "+t1.getState());//TERMINATED
		System.out.println("after joining thread status : "+t1.isAlive());//false
		
	}
}
//sleep(1000) vs yield() vs join() vs wait()
