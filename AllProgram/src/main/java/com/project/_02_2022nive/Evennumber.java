package com.project._02_2022nive;

public class Evennumber 
{
	public static void main(String[] args) 
	{
		int a = 100;
		System.out.println("Even Numbers from 1 to "+a+" are: ");
		for (int i=1;i<=a;i++) 
		{
			if (i%2 == 0) 
			{
				System.out.println(i);
			}
		}
	}
}
