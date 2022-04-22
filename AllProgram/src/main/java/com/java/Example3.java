package com.java;

import java.util.Scanner;
//Write a java program to calculate value of three numbers
public class Example3 
{
public static void main(String[] args) 
{
	//declare three variables
			int num1, num2, num3, value;
			//created Scanner class object
			Scanner scanner =new Scanner(System.in);
			//reading values from keyboard
			System.out.println("Enter First Value:");
			num1 = scanner.nextInt();
			System.out.println("Enter Second Value:");
			num2 =scanner.nextInt();
			System.out.println("Enter Third Value:");
			num3 =scanner.nextInt();
			//doing operation
			value=num1*num2+num3;
			//printing output on console or screen
			System.out.println("Value: "+value);
			//closing Scanner class object
			scanner.close();
}
}
