package com.desgn;

import java.util.ArrayList;
import java.util.List;

public class TestDesign {
	
	
	static List<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		
	
		while(true)
		{
			new Thread(new Runnable()
						
					{
						public void run()
						{
							try
							{
								Thread.sleep(1000000000);
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
						}
					}
					
					).start();
		}
	}
}
