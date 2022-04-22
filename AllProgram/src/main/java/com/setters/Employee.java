package com.setters;

public class Employee 
{
	private int id;
	private String name;
	private double salary;

	public Employee()
	{

	}
	//setter method

	public void setId(int id) 
	{
		this.id = id;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}

	//method
	public void getEmployeeInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args) 
	{
		
		Employee employee = new Employee();
		
		//use setter methods to assign values to the variables		
		employee.setId(1001);
		employee.setName("Sanvika");
		employee.setSalary(50000.00);
		
		employee.getEmployeeInfo();
		
	}

}
