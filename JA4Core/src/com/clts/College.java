package com.clts;

public class College 
{
	String name;
	int id;
	
	public College(String name, int id)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		
			return true;
		
		if(obj == null || obj.getClass() != this.getClass())
		
			return false;
		
		College cg = (College) obj;
		
		return (cg.name.equals(this.name) && cg.id == this.id);
		
	}
	
	@Override
	public int hashCode()
	{
		return this.id;
	}
	
}
