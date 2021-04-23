package com.inh;

interface Inf
{
	float pi = 3.14f;;
	
	void dog();
	
	default void cat()
	{
		System.out.println("cat() from inf");
	}
	static void fox()
	{
		System.out.println("fox() from inf");
	}
}

abstract class Abs implements Inf
{
	public abstract void disp();
	
	public void human()
	{
		System.out.println("human() from abs");
	}
}

class AbsImpl extends Abs
{
	@Override
	public void dog()
	{
		System.out.println("overriding dog()");
	}
	
	@Override
	public void disp()
	{
		System.out.println("disp() overrided");
	}
}


public class Exp5 {
	
	public static void main(String[] args) {
		
		AbsImpl il = new AbsImpl();
		
		il.dog();
		il.disp();
		il.human();
		il.cat();
		
		Inf.fox();
		
	}

}
