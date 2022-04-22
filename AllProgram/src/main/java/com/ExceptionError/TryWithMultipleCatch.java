package com.ExceptionError;

public class TryWithMultipleCatch 
{
	public static void main(String[] args) 
	{
		int a=10,b=2,c=0;
		int arr[]=new int [4];
		System.out.println("BEFORE THE EXECUTION");
		try
		{
			System.out.println("INSIDE TRY");
			c=a/b;
			arr[6]=8;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
			e.printStackTrace();
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
