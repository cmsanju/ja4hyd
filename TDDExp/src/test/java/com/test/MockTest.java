package com.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;




@ExtendWith(MockitoExtension.class)
public class MockTest {
	
	@InjectMocks
	TDDExp obj;
	
	
	@Before
	public void setUp()
	{
		obj = mock(TDDExp.class);
		
		//obj = new TDDExp();
	}
	
	@Test
	public void testSquare()
	{
		when(obj.square(3)).thenReturn(34);// 34
		
		assertEquals(34, obj.square(3));
		
		
	}

}
