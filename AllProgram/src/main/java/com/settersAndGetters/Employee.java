package com.settersAndGetters;

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

	//getter methods
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}


	public static void main(String[] args) 
	{

		Employee employee = new Employee();

		//use setter methods to assign values to the variables		
		employee.setId(1001);
		employee.setName("Sanvika");
		employee.setSalary(50000.00);

		//use getter methods to print values on the screen
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

	}
}
