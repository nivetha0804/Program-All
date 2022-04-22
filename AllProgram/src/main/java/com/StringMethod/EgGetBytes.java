package com.StringMethod;

public class EgGetBytes 
{
	public static void main(String[] args) 
	{
		/**
		 * getBytes():
		 * 
		 * Encodes this String into a sequence of bytes using the platform's 
		 * default charset, storing the result into a new byte array.
		 * 
		 */

		String text = "Welcome to Edubridge";
		byte b1[] = text.getBytes();
		for(byte b: b1)
		{
			System.out.println(b);
		}
	}
}
