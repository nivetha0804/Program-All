package com.StringMethod;

public class EgEqualsIgnoreCase 
{
	public static void main(String[] args) 
	{
		/* equalsIgnoreCase(String anotherString):
		 * 
		 * Compares this String to another String, ignoring case considerations.
		 * 
		 */	
		
		String text1 = "Sanvika";

		String text2 = "Samyuktha";

		String text3 = "Girl";

		String text4 = "samyuktha";

		String text5 = "Sanvika";

		System.out.println(text1.equalsIgnoreCase(text2));
		System.out.println(text1.equalsIgnoreCase(text3));
		System.out.println(text1.equalsIgnoreCase(text4));
		System.out.println(text1.equalsIgnoreCase(text5));
		System.out.println(text2.equalsIgnoreCase(text4));
	}
}
	
	