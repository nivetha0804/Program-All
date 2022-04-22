package com.java;

public class Nestedifstatement 
{
	public static void main(String[] args) 
	{
		int i=-44;
		if(i > 0)
		{
			System.out.println(i+" is a positive number");
		}
		else if(i < 0)
		{
			System.out.println(i+" is a negative number");
		}
		if ( i % 2 == 0 ) 
		{
			System.out.println("This number is even");
		}
		else
		{
			System.out.println("This number is odd");
		}
	}
}


