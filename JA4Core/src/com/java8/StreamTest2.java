package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1
{
	int empid;
	String name;
	int  age;
	
	public Employee1()
	{
		
	}
	
	

	public Employee1(int empid, String name, int age) {
		
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

public class StreamTest2 
{
	public static void main(String[] args) {
		
		List<Employee1> empList = new ArrayList<Employee1>();
		
		Employee1 e = new Employee1(121, "Varsha", 50);
		
		empList.add(e);
		
		empList.add(new Employee1(111, "Alekya", 60));
		empList.add(new Employee1(110,"vvssramya", 75));
		empList.add(new Employee1(222, "developer", 40));
		empList.add(new Employee1(101, "Neelima", 45));
		
		Map<Integer, String> empHm = new HashMap<Integer, String>();
		
		//converting list ot map
		for(Employee1 emp : empList)
		{
			empHm.put(emp.getAge(), emp.getName());
		}
		
		System.out.println(empHm);
		
		//java 8 features converting list to map
		LinkedHashMap<Integer, String> lmap = empList.stream().collect(Collectors
				.toMap(Employee1 :: getAge, Employee1 :: getName,(k,v)->k+" "+v, LinkedHashMap :: new));
		
		lmap.forEach((k,v) -> System.out.println("Age : "+k+" Name : "+v));
		
		
		// converting Map data to Collection data
		
		List<Integer> mtoc = empHm.entrySet().stream().map(k -> k.getKey()).collect(
				Collectors.toList());
		
		mtoc.forEach(System.out :: println);
		
		// converting Map data to Collection data
		
				List<String> mtoc1 = empHm.entrySet().stream().map(k -> k.getValue()).collect(
						Collectors.toList());
				
				mtoc1.forEach(System.out :: println);
	}
}
