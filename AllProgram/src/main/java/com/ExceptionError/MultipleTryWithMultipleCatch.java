package com.ExceptionError;

public class MultipleTryWithMultipleCatch 
{
	public static void main(String[] args) 
	{
		int a=10,b=2,c=0;
		int arr[]=new int [4];
		System.out.println("BEFORE THE EXECUTION");
		try
		{
			System.out.println("FIRST TRY");
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
			e.printStackTrace();
		}
		try
		{
			System.out.println("SECOND TRY");
			arr[6]=8;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		finally
		{
			System.out.println("Finally Block");
		}
	}
}


