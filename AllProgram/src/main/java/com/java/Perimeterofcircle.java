package com.java;

import java.util.Scanner;

public class Perimeterofcircle
{
	public static void main(String[] args) 
	{
		int r;
		double pi = 3.14,perimeter;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of circle:");
		r = scanner.nextInt();
		perimeter = 2 * pi * r;
		System.out.println("Perimeter of circle:"+perimeter);
		scanner.close();
	}
}

