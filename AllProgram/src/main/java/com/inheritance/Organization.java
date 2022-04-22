package com.inheritance;

public class Organization 
{
	int id;
	String name;
	
	public Organization()
	{
		id = 123;
		name = "IBM";
	}
	
	public void getEmployeeInfo()
	{
		System.out.println(id);
		System.out.println(name);
	}

}
