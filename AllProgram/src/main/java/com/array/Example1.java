package com.array;

public class Example1 
{
	public static void main(String[] args)
	{
		int StudentRollNumber[]= {11,12,13,14,15,16,17};
		/*
		 * FOR EXAMPLE
		 * StudentRollNumber[]= {11,12,13,14,15,16,17};
		 *                        0  1  2  3  4  5  6
		 * System.out.println(StudentRollNumbers[6]);
		 */
		for(int i = 0; i < StudentRollNumber.length; i++)
		{
			System.out.println(StudentRollNumber[i]);
		}
		System.out.println("========");
		System.out.println(StudentRollNumber.length);
	}
}
