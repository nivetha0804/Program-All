package com.ExceptionError;
import java.util.Scanner;
public class ArrayExceptionOutOfBound 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The Array elements are:");
		for(int i=0;i<a.length+1;i++)
		{
			try 
			{
				System.out.println(a[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Statements after for loop");
	}
}
