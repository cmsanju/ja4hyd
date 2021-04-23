package com.clts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.intr.Test;

public class Exp1 {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		List list = new ArrayList();
		
		list.add("java");
		list.add(10);
		list.add('A');
		list.add(34.56f);
		list.add(34.89);
		list.add(false);
		list.add(t);
		list.add("java");
		list.add(10);
		
		System.out.println(list);
		
		List list1 = new LinkedList();
		
		list1.add("java");
		list1.add(10);
		list1.add('A');
		list1.add(34.56f);
		list1.add(34.89);
		list1.add(false);
		list1.add(t);
		list1.add("java");
		list1.add(10);	
		
		System.out.println(list1);
		//Iterator (hasNext(), next() and remove()) forward direction
		//ListIterator(hasPrevious() and previous()) both the directions (forward and backward)
		//Enumaration (hasMoreElements and nextElement())
		
		ListIterator ltr = list.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
	}
}
