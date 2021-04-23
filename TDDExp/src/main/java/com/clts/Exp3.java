package com.clts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Exp3 {
	
	public static void main(String[] args) {
		
		Set hs = new HashSet();
		
		hs.add("java");
		hs.add(10);
		hs.add('A');
		hs.add(34.56f);
		hs.add(34.89);
		hs.add(false);
		hs.add("java");
		hs.add(10);
		
		System.out.println(hs);
		
		Set hs1 = new LinkedHashSet();
		
		hs1.add("java");
		hs1.add(10);
		hs1.add('A');
		hs1.add(34.56f);
		hs1.add(34.89);
		hs1.add(false);
		hs1.add("java");
		hs1.add(10);
		
		System.out.println(hs1);
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
