package com.StringMethod;

public class EgIndexOfChar 
{
	public static void main(String[] args)
	{
		/**
		 * indexOf(int ch):
		 * 
		 * Returns the index within this string of the first occurrence of the 
		 * specified character.
		 * 
		 * =======================================================================
		 * 
		 * indexOf(int ch, int fromIndex):
		 * 
		 * Returns the index within this string of the first occurrence of the 
		 * specified character, starting the search at the specified index.
		 * 
		 */

		String text = "Proud To Be An Indian";

		System.out.println(text.indexOf('o'));
		System.out.println(text.indexOf('o', 5));
		System.out.println(text.indexOf('n'));
		System.out.println(text.indexOf('n', 14));
		System.out.println(text.indexOf('n', 20));
	}
}
