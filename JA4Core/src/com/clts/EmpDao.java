package com.clts;

import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	
	List<Employee> e = null;
	
	public List<Employee> addEmp(List<Employee> e)
	{
		this.e = e;
		
		return e;
		
	}
	
	public List<Employee> listAll()
	{
		return e;
	}
}
