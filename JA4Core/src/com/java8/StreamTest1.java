package com.java8;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

//employee data class
class Employee
{
	int empid;
	String name;
	int  age;
	
	//default constructor
	public Employee()
	{
		//write code here
	}

	public Employee(int empid, String name, int age) {
		
		this.empid = empid;
		this.name = name;
		this.age = age;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class StreamTest1 
{
	public static void main(String[] args) {
		
		final List<Employee> empList = new ArrayList<Employee>();
		
		Employee empObj = new Employee(121, "Varsha", 50);
		
		empList.add(empObj);
		
		empList.add(new Employee(111, "Alekya", 60));
		empList.add(new Employee(110,"vvssramya", 75));
		empList.add(new Employee(222, "developer", 40));
		empList.add(new Employee(101, "Neelima", 45));
		
		
		for(final Employee emp : empList)// forEach()
		{
			//System.out.println(emp.getEmpid()+" "+emp.getName()+" "+emp.getAge());
			
			if(emp.getAge() > 50)
			{
				System.out.println(emp.getName()+" "+emp.getAge());
			}
		}
		
		//java 8 feature stream api
		
		//empList.stream().filter(emp -> emp.getAge() > 50).forEach(emp -> System.out.println(e.getAge()+" "+e.getName()));
		/*
		empList.stream().filter(emp -> emp.getAge() > 40).forEach(emp -> System.out.println("Emp age : "+emp.getAge()+" Emp Name : "+emp.getName()));
		
		// list to map
		
	
		
		LinkedHashMap<Integer, String> empLmp	= empList.stream()
		.collect(Collectors.toMap(Employee :: getAge,Employee :: getName,(k,v)-> k +" "+v, LinkedHashMap :: new));
		System.out.println(empLmp); */
	}
}
