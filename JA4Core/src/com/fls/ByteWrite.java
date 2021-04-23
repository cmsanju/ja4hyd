package com.fls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteWrite {
	
	public static void main(String[] args) throws Exception
	{
		
		File fle = new File("src/write.txt");
		
		FileOutputStream fout = new FileOutputStream(fle);
		
		String msg = "Hello this is file handling example using byte stream";
		
		fout.write(msg.getBytes());
		
		System.out.println("Done...");
	}

}
