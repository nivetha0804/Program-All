package com.ExceptionError;

import java.util.Scanner;

//Use Scanner  //read age  //read name nextLine  
//read fees  //try to display
public class Homework 
{
	public static void main(String[] args) 
	{
		String Name; 
		int Age;
		float Salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("BEFORE ENTERING DETAILS");
		System.out.println("========================");
		System.out.println("Enter the Name of the candidate:");
		Name=sc.nextLine();
		System.out.println("Enter the Age of the candidate:");
		Age=sc.nextInt();
		System.out.println("Enter the Salary of the candidate:");
		Salary=sc.nextFloat();
		System.out.println("                        ");
		System.out.println("AFTER EXECUTION RESULT");
		System.out.println("========================");
		System.out.println("Details of candidate");
		System.out.println("Name="+Name);
		System.out.println("Age="+Age);
		System.out.println("Fees="+Salary);
		sc.close();
	}
}
