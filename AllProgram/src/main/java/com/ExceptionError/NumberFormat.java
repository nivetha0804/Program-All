package com.ExceptionError;

public class NumberFormat 
{
	public static void main(String[] args) 
	{
		String s="abc";
		System.out.println("Before ParseInt");
		try
		{
			int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		System.out.println("After ParseInt");
	}
}
