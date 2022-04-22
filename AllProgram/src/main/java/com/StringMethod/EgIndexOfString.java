package com.StringMethod;

public class EgIndexOfString 
{
	public static void main(String[] args)
	{
		/**
		 * indexOf(String str):
		 * 
		 * Returns the index within this string of the first occurrence of the 
		 * specified substring.
		 * 
		 * =======================================================================
		 * 
		 * indexOf(String str, int fromIndex):
		 * 
		 * Returns the index within this string of the first occurrence of the 
		 * specified substring, starting at the specified index.
		 * 
		 */

		String text = "Welcome to the world India, we love nature";
		System.out.println(text.indexOf("to"));
		System.out.println(text.indexOf("the"));	
		System.out.println(text.indexOf("India"));
		System.out.println(text.indexOf("we"));
		System.out.println(text.indexOf("love"));	
		System.out.println(text.indexOf("nature"));		


	}
}
