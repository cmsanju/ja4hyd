package com.inh;

interface Inf1
{
	 void add();
	 void sub();
}

abstract class Abs1
{
	public void details()
	{
		System.out.println("normal method of abs");
	}
	
	public abstract void hello();
}

class Impl1 extends Abs1 implements Inf1
{
	public void hello()
	{
		System.out.println("overriding hello()");
	}
	
	public void add()
	{
		System.out.println("overrided inf1");
	}
	public void sub()
	{
		System.out.println("overrided inf1");
	}
}

public class Exp6 {
	
	public static void main(String[] args) {
		
		
	}
}
