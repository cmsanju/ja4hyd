package com.clts;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSrt {
	
	public static void main(String[] args) {
		
		ArrayList<Student> stdList =  new ArrayList<Student>();
		
		Student std = new Student(122, "java", 25);
		
		stdList.add(std);
		stdList.add(new Student(121, "ram", 20));
		stdList.add(new Student(125, "spring", 30));
		stdList.add(new Student(232, "hello", 40));
		
		Collections.sort(stdList);
		
		for(Student stdl : stdList )
		{
			System.out.println("Std Rol : "+stdl.getRolNo()+" Std Name : "+stdl.getName()+" "+stdl.getAge());
		}
		
		NameComapare nameCmp = new NameComapare();
		
		Collections.sort(stdList, nameCmp);
		
		for(Student stdl : stdList )
		{
			System.out.println("Std Rol : "+stdl.getRolNo()+" Std Name : "+stdl.getName()+" "+stdl.getAge());
		}
		
	}

}
