package com.java;

import java.util.Scanner;
//Write a java program to calculate sum of two numbers
public class Example1 
{
	public static void main(String[] args) 
	{
		//declare three variables
		int num1, num2, sum;
		//created Scanner class object
		Scanner scanner =new Scanner(System.in);
		//reading values from keyboard
		System.out.println("Enter First Value:");
		num1 = scanner.nextInt();
		System.out.println("Enter Second Value:");
		num2 =scanner.nextInt();
		//doing operation
		sum=num1+num2;
		//printing output on console or screen
		System.out.println("Sum: "+sum);
		//closing Scanner class object
		scanner.close();
	}
}
