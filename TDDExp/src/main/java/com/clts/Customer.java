package com.clts;

public class Customer 
{
	private int cId;
	
	private String cName;
	
	private String cloc;
	
	public Customer()
	{
		
	}

	public Customer(int cId, String cName, String cloc) {
		
		this.cId = cId;
		this.cName = cName;
		this.cloc = cloc;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getCloc() {
		return cloc;
	}

	public void setCloc(String cloc) {
		this.cloc = cloc;
	}
}
