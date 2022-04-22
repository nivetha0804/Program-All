package com.StringMethod;

public class EgContains 
{
	public static void main(String[] args) 
	{
				/**
		 * contains(CharSequence s):
		 * 
		 * Returns true if and only if this string contains the 
		 * specified sequence of char values.
		 * 
		 **/
		
		String text = "Sanvika is a cute girl";
		
		System.out.println(text.contains("is"));
		System.out.println(text.contains("Is"));
		System.out.println(text.contains("cute"));
		System.out.println(text.contains("Cute"));
		System.out.println(text.contains("sanvika"));
		System.out.println(text.contains("Sanvika"));
		System.out.println(text.contains("girl"));
		System.out.println(text.contains("Girl"));
	}
}
