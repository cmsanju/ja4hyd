package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.clts.EmpDao;
import com.clts.Employee;

public class TestClts {
		
	EmpDao empDao;
	
	@Before
	public void setUp()
	{
		
		empDao = new EmpDao();
		
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1,"VV SS", "CTS");
		
		Employee e2 = new Employee(2,"alekya", "IBM");
		
		empList.add(e1);
		empList.add(e2);
		empDao.addEmp(empList);
	}
	
	@After
	public void setDown()
	{
		empDao = null;
	}
	
	@Test
	public void testAddEmp()
	{
		List<Employee> empList = empDao.listAll();
		
		assertEquals(2, empList.size());
	}
}
