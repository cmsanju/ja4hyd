package com.clts;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Exp6 {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("dell", 2345);
		tm.put("lenovo", 450);
		tm.put("asus", 650);
		tm.put("think pad", 7000);
		tm.put("sony", 8000);
		tm.put("apple", 6703);
		
		System.out.println(tm);
		
		
		Iterator<Entry<String, Integer>> itr = tm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String, Integer> et = itr.next();
			
			System.out.println("product : "+et.getKey()+" price : "+et.getValue());
		}
	}

}
