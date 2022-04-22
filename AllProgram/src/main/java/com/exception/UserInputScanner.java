package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputScanner 
{
	public static void main(String[] args) throws IOException
	{
		String Name; 
		int Age;
		float Salary;
		// create an object
		Scanner sc = new Scanner(System.in);
		//char ch=sc.next().charAt(0);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br=new BufferedReader(is);
		//readline()-is the output  -->String
		//int age=Integer.parseInt(br.readline());    //"23"
		//float sal=Float.parseFloat(br.raedLine());
		//long l= Long.parseLong(br.readLine());
		//short s=Short.parseShort(br.readLine());
		//char ch=br.raedLine().charAt(0);
		System.out.println("BEFORE ENTERING DETAILS");
		System.out.println("========================");
		System.out.println("Enter the Name of the candidate:");
		sc.nextLine();
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
