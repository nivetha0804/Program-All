package com.java;

import java.util.Scanner;
//Write a java program to calculate product of two numbers
public class Example2 
{
	public static void main(String[] args) 
	{
		//declare three variables
		int num1, num2, product;
		//created Scanner class object
		Scanner scanner =new Scanner(System.in);
		//reading values from keyboard
		System.out.println("Enter First Value:");
		num1 = scanner.nextInt();
		System.out.println("Enter Second Value:");
		num2 =scanner.nextInt();
		//doing operation
		product=num1*num2;
		//printing output on console or screen
		System.out.println("Product: "+product);
		//closing Scanner class object
		scanner.close();
	}

}
