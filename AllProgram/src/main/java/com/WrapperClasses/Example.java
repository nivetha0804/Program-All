package com.WrapperClasses;

public class Example 
{
	//autoBoxing
	public static void main(String[] args) 
	{
		//primitive value
		byte number = 25;
		//Byte object
		//Byte b1 = rank;//converting primitive byte value to Byte object
		Byte B1=number;
		System.out.println(B1);	
		System.out.println("===========================");
		//Byte object
		byte myAge = 22;
		byte age = new Byte(myAge);
		//primitive value
		//byte age1 = age;//converting Byte object to primitive byte value
		byte age1 = age;
		System.out.println(age1);

	}


}
