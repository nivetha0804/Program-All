package com.StringMethod;

public class EgCompareTo 
{
	public static void main(String[] args) 
	{
		/**
		 * compareTo(String anotherString):
		 * 
		 * Compares two strings lexicographically.
		 * 
		 **/

		String text1 = "Samyuktha";

		String text2 = "Samyuktha 123";

		String text3 = "Girl";

		String text4 = "samyuktha";

		System.out.println(text1.compareTo(text2));
		System.out.println(text1.compareTo(text3));
		System.out.println(text1.compareTo(text4));
	}
}

