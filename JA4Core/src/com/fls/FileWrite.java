package com.fls;

import java.io.FileWriter;

public class FileWrite {
	
	public static void main(String[] args) throws Exception
	{
		
	
		FileWriter fl = new FileWriter("src/abc.txt");
		
		String msg = "this is file write example using filewriter class";
		
		fl.write(msg);
		
		fl.flush();
		
		System.out.println("Done...");
	}	
}
