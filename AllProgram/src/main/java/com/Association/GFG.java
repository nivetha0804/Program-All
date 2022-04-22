package com.Association;

public class GFG 
{
	// Main driver method
	public static void main(String[] args)
	{
		// Creating objects of bank and Employee class
		Bank bank = new Bank("Canara Bank");
		Employee emp = new Employee("Suruthi");

		// Print and display name and
		// corresponding bank of employee
		System.out.println(emp.getEmployeeName()
				+ " is employee of "
				+ bank.getBankName());
	}
}


