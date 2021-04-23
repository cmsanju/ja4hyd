package com.fls;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ByteRead {
	
	public static void main(String[] args) throws Exception
	{
		
		FileInputStream fis = new FileInputStream("src/write.txt");
		
		BufferedInputStream bfr = new BufferedInputStream(fis);
		
		byte[] br = new byte[1021];
		
		int x = 0;
		
		while((x = bfr.read(br)) != -1)
		{
			System.out.println(new String(br, 0, x));
		}
	}
}
