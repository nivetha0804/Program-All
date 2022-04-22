package com.java;

import java.util.Scanner;

public class Areaofrectangle 
{
	public static void main(String[] args) 
	{
		int length, breadth, area; 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length: ");
		length = scanner.nextInt();
		System.out.println("Enter the breadth: ");
		breadth = scanner.nextInt();
		area=length*breadth;
		System.out.println("Area of reactangle= "+area);
		scanner.close();
	}
}
