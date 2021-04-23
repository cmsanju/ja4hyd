package com.clts;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Exp2 {
	
	public static void main(String[] args) {
		
		Stack sk = new Stack();
		
		sk.add("java");
		sk.add(10);
		sk.add('A');
		sk.add(34.56f);
		sk.add(34.89);
		sk.add(false);
		sk.add("java");
		sk.add(10);
		
		System.out.println(sk);
		
		System.out.println(sk.peek());//10
		
		sk.push("TDD");
		System.out.println(sk);
		System.out.println(sk.peek());
		
		sk.pop();
		System.out.println(sk);
		
		System.out.println(sk.search(100));
		
		System.out.println(sk.empty());
		
	}
}
