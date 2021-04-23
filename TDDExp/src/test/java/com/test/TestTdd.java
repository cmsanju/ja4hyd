package com.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTdd {
	
	TDDExp obj;
	
	@BeforeClass
	public static void testBeforeClass()
	{
		System.out.println("before class");
	}
	
	@Before
	public void setUp()
	{
		System.out.println("before test metho");
		
		obj = new TDDExp();
	}
	
	@After
	public void setDown()
	{
		System.out.println("After Test method");
		
		obj = null;
	}
	
	@Test
	public void testReverseString()
	{
		System.out.println("Test method");
		
		assertNotNull(obj);
		
		assertEquals(4, obj.square(2));//pass / fail
	}
	
	@Test
	public void testReverseString1()
	{
		System.out.println("Test1 method");
		
		
		
		assertEquals(16, obj.square(4));
	}
	
	@AfterClass
	public static void testAfterClass()
	{
		System.out.println("After Class");
	}
}
