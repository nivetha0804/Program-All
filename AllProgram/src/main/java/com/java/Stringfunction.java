package com.java;

import java.util.Scanner;

// write a prgm to input a sentence and convert it into uppercase and count and display the total number of words starting with a letter 'A'.
//example :-sample input :advancement and application of information technology are ever changing.
public class Stringfunction 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		str = " " + str; //Add space in the begining of str
		int c = 0;
		int len = str.length();
		str = str.toUpperCase();
		for (int i = 0; i < len - 1; i++) 
		{
			if (str.charAt(i) == ' ' && str.charAt(i + 1) == 'A');
		}
		sc.close();
		System.out.println("Total number of words starting with letter 'A' = " + c);
	}
}
