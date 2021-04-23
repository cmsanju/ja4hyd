package com.clts;

import java.util.List;

public class CustDao {
	
	List<Customer> listCust;
	
	public List<Customer> addCustomer(List<Customer> clist)
	{
		this.listCust = clist;
		
		return listCust;
	}
	
	public List<Customer> listAll()
	{
		return listCust;
	}
}
