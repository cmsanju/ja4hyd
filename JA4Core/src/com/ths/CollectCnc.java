package com.ths;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectCnc {
	
	public static void main(String[] args) {
		
		//ArrayList al = new ArrayList();
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add("java");
		al.add("apple");
		al.add("mango");
		al.add("butter");
		al.add("dragan");
		
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			//itr.remove();
			System.out.println(itr.next());
			al.add("hello");
			
			
		}
	}
}
