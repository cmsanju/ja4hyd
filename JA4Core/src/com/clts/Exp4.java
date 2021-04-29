package com.clts;


import java.util.Set;
import java.util.TreeSet;

public class Exp4 {
		
	public static void main(String[] args) {
		
		Set<String> ts = new TreeSet<>();
		
		ts.add("spring");
		ts.add("java");
		ts.add("python");
		ts.add("kotlin");
		ts.add("cobol");
		ts.add("azure");
		ts.add("aws");
		ts.add("java");
		
		
		System.out.println(ts);
		
		System.out.println(ts.contains("java"));
	}
}
