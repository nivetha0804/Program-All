package com.StringMethod;

public class EgCompareToIgnoreCase 
{
	public static void main(String[] args)
	{
		/**
		 * compareToIgnoreCase(String str):
		 * 
		 * Compares two strings lexicographically, ignoring case differences.
		 * 
		 **/
		String text1 = "Samyuktha";

		String text2 = "Samyuktha 123";

		String text3 = "Girl";

		String text4 = "samyuktha";

		System.out.println(text1.compareToIgnoreCase(text2));
		System.out.println(text1.compareToIgnoreCase(text3));
		System.out.println(text1.compareToIgnoreCase(text4));
	}
}