package com.WrapperClasses;

public class Example4 
{
	public static void main(String[] args) 
	{
		short number = 25;
		Short B1=number;
		System.out.println(B1);	
		System.out.println("===========================");
		short myAge = 22;
		short age = new Short(myAge);
		short age1 = age;
		System.out.println(age1);
	}
}
