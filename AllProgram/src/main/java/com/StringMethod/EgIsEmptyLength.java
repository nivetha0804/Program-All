package com.StringMethod;

public class EgIsEmptyLength 
{
	public static void main(String[] args)
	{
		/**
		 * length():
		 * 
		 * Returns the length of this string.
		 * 	==============================================================
		 * 	isEmpty():
		 * 
		 * Returns true if, and only if, length() is 0.
		 * 
		 */

		String text1 = "Welcome home";
		String text2 = "";
		System.out.println(text1.length());
		System.out.println(text1.isEmpty());
		System.out.println("===============");
		System.out.println(text2.length());
		System.out.println(text2.isEmpty());
	}
}
