package com.clts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Exp5 {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("java", 8);
		hm.put("spring", 5);
		hm.put("hibernate", 5);
		hm.put("hyd", 40);
		hm.put("blr", 5600);
		hm.put("java", 15);
		hm.put("hyd", 5600);
		
		System.out.println(hm);
		
		LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
		
		lm.put("java", 8);
		lm.put("spring", 5);
		lm.put("hibernate", 5);
		lm.put("hyd", 40);
		lm.put("blr", 5600);
		lm.put("java", 15);
		lm.put("hyd", 5600);
		
		System.out.println(lm);
		
		Iterator<Entry<String, Integer>> itr = lm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String, Integer> et = itr.next();
			
			System.out.println("Key : "+et.getKey()+" Value : "+et.getValue());
		}
	}
}
