package com.settersAndToStringMethod;

public class Employee 
{
	private int id;
	private String name;
	private double salary;
	
	public Employee() 
	{
		 
	}

		//setter methods
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	//to string method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) 
	{
		
		Employee employee = new Employee();
		
		//use setter methods to assign values to the variables		
		employee.setId(8499);
		employee.setName("Sanvika");
		employee.setSalary(80000.00);
		
		System.out.println(employee.toString());
		
		//System.out.println(employee);
		
	}
}
