package com.fls;

import java.io.Serializable;

public class Employee implements Serializable
{
	
	public String name, cmp, location;
	public  transient int rol;
	
	public void disp()
	{
		System.out.println("Name : "+name+" Company : "+cmp+" Location : "+location);
	}
	
}
