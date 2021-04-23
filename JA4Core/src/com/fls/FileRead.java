package com.fls;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead {
	
	public static void main(String[] args) throws Exception
	{
		
		FileReader fr = new FileReader("src/abc.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println(br.readLine());
	}
}
