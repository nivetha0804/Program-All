package com.encapsulation;

/**
 * Encapsulation: the process of binding the class's state(variables) and 
 *                behavior(methods).
 * 
 */
public class Employee 
{
	
	//variables
	int id;
	String name;
	double salary;
	
	static String orgName;
	
	//constructors
	public Employee() 
	{
		id = 123;
		name = "Monika";
		salary = 10000.3
				;
	}
	//blocks
	static
	{
		orgName = "IBM";
	}
	//methods
	public void getEmployeeInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(orgName);
	}
	//main()
	public static void main(String[] args) 
	{
		//objects
		Employee employee = new Employee();
		employee.getEmployeeInfo();
	}
	

}

