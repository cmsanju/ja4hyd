package com.fls;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
	
	public static void main(String[] args) throws Exception
	{
		
		FileOutputStream fos = new FileOutputStream("src/employee.txt");
		ObjectOutputStream obj  = new ObjectOutputStream(fos);
		
		Employee e = new Employee();
		
		e.name = "Developer";
		e.cmp = "IBM";
		e.location = "Blr";
		e.rol = 123123;
		
		obj.writeObject(e);
		
		System.out.println("Done...");
	}

}
