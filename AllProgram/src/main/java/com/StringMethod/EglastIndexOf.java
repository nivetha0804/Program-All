package com.StringMethod;

public class EglastIndexOf 
{
	public static void main(String[] args) 
	{
		/**
		 * lastIndexOf(String str):
		 * 
		 * Returns the index within this string of the last occurrence 
		 * of the specified substring.
		 *   
		 */

		String message = "Hello How are you?, I am fine, Thank you";
		System.out.println(message.lastIndexOf("Thank you"));
		System.out.println(message.lastIndexOf("Hello How are you?, I am fine, Thank you"));
		System.out.println(message.lastIndexOf("H"));
	}
}
