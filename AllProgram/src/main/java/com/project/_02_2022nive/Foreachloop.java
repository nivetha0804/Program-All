package com.project._02_2022nive;

public class Foreachloop 
{
	public static void main( String[] args )
	{
		//ForEach loop
		// and Array		
		int employeeIds[] = {2001, 2002, 2003, 2004, 2005, 2006};
		double employeeSalaries[] = {10.11, 10.12, 10.13, 10.14, 10.15, 10.16};
		for(int employeeId: employeeIds) 
		{ 
			System.out.println(employeeId); 
		}

		System.out.println("======================");

		for(double employeeSalary: employeeSalaries)
		{
			System.out.println(employeeSalary);
		}
	}
}
