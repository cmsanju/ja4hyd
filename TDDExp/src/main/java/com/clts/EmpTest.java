package com.clts;

import java.util.ArrayList;
import java.util.List;

public class EmpTest {
		
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee e1 = new Employee();
		
		e1.setId(1);
		e1.setName("Java");
		e1.setCmp("CTS");
		
		Employee e2 = new Employee();
		
		e2.setId(2);
		e2.setName("Frameworks");
		e2.setCmp("E Y");
		
		empList.add(e1);
		empList.add(e2);
		
		EmpDao edao = new EmpDao();
		edao.addEmp(empList);
		
		/*
		for(Employee emp : empList)
		{
			System.out.println("Emp ID : "+emp.getId()+" Emp Name : "+emp.getName()+" Emp Cmp : "+emp.getCmp());
		}
		*/
		
		List<Employee> emp = edao.listAll();
		
		for(Employee e : emp) {
		System.out.println("Emp ID : "+e.getId()+" Emp Name : "+e.getName()+" Emp Cmp : "+e.getCmp());
		}	
	}
}
