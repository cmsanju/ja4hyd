package com.inh;

class A
{
	String name = "Java";
	String city = "Blr";
	
	public void disp()
	{
		System.out.println("i am from disp()");
	}
}

class B extends A
{
	String email = "java@java.com";
	String ph = "123344";
	
	public void show()
	{
		System.out.println(name+" "+email+" "+ph+" "+city);
	}
}

class C extends B
{
	
}
class D extends C
{
	
}

public class Exp1
{
	public static void main(String[] args) {
		
		B b = new B();
		
		b.disp();
		b.show();
		
	}
}
