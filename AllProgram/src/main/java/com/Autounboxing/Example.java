package com.Autounboxing;

public class Example 
{
	public static void main(String[] args) 
	{		
		//converting an object type to primitive data type, is called autoUnBoxing

		Integer myAge = new Integer(30);//Integer wrapper class object is created with 30 value

		int age = myAge;//storing Integer wrapper class object into int primitive data type.

		System.out.println(age);
	}
}
