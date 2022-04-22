package com.abstraction;

/**
 * Abstraction: hiding the properties of one class from another class.
 *
 */

//sub class
public class Employee extends Organization
{	
	
	//variables
	double salary;

	static String orgName;

	//constructors
	public Employee() 
	{

	}


	//blocks
	static
	{
		orgName = "INFO";
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
		employee.id = 1001;
		employee.name = "Vishnu";
		employee.salary = 10000.1;

		employee.getEmployeeInfo();

		System.out.println("======================");

		Employee employee1 = new Employee();
		employee1.id = 1002;
		employee1.name = "Akshaya";
		employee1.salary = 10000.2;

		employee1.getEmployeeInfo();

		System.out.println("======================");

		Employee employee2 = new Employee();
		employee2.id = 1003;
		employee2.name = "Monika";
		employee2.salary = 10000.3;

		employee2.getEmployeeInfo();

	}


}
