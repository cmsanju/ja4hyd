package com.fls;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialDemo {
		
	public static void main(String[] args) throws Exception
	{
		
		FileInputStream fis = new FileInputStream("src/employee.txt");
		
		ObjectInputStream obj = new ObjectInputStream(fis);
		
		Employee e = (Employee)obj.readObject();
		
		System.out.println(e.name+" "+e.cmp+" "+e.location+" "+e.rol);
		
		e.disp();
	}
}
