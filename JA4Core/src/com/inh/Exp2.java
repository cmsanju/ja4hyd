package com.inh;


class E
{
	public void draw()// normal method or implemented method
	{
		System.out.println("tle");
	}
}

class F extends E
{
	@Override
	public void draw()
	{
		System.out.println("cle");
		
	}
}

class G extends E
{
	public void draw()
	{
		System.out.println("sqr");
	}
}

public class Exp2 {
		
	public static void main(String[] args) {
		E e = new E();
		e.draw();//tle
		
		F f = new F();
		f.draw();
		
		E g = new G();
		g.draw();
		
	}
}
/*
 *  
 *  Method overloading is nothing but method heading is same and signature is different
 *  1 Type of the arguments
 *  2 no of the arguments 
 *  3 order of the arguments
 *  public void add(int x)
 *  public void add(float y)
 *  public void add(int x, float y)
 *  public void add(float x, int y)
 *  Method overriding is nothing but methods heading is same and body is different
 */
