// Exception Handling:- To Handle Run Time Error
package com.ExceptionError;

import java.util.Scanner;

public class RunTimeError 
{
	public static void main(String[] args) 
	{
		int A,B,C;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		A=sc.nextInt();
		System.out.println("Enter Second Number");
		B=sc.nextInt();
		System.out.println("Before Division");
		try
		{
			System.out.println("Try Block");
			C=A/B;
			System.out.println("Value Of C: "+C );
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Catch Block");
		}
		finally
		{
			System.out.println("Finaaly Block");
		}
		System.out.println("After Division");
		System.out.println("Program Other Statements");
	}
}
