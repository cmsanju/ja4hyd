package com.clts;

import java.util.Comparator;

public class Student implements Comparable<Student>
{
	
	private int rolNo;
	
	private String name;
	
	private int age;
	
	
	@Override
	public int compareTo(Student std)
	{
		return this.age - std.age;
	}
	
	public Student()
	{
		
	}
	
	public Student(int rolNo, String name, int age)
	{
		this.rolNo = rolNo;
		this.name = name;
		this.age = age;
	}

	public int getRolNo() {
		return rolNo;
	}

	public void setRolNo(int rolNo) {
		this.rolNo = rolNo;
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

class NameComapare implements Comparator<Student>
{
	@Override
	public int compare(Student std1, Student std2)
	{
		return std2.getName().compareTo(std1.getName());
	}
	
}
