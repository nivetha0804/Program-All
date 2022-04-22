package com.StringMethod;

public class EgSplit 
{
	public static void main(String[] args) 
	{
		/**
		 * split(String regex):
		 * 
		 * Splits this string around matches of the given regular expression.
		 *   
		 */
		
		String message = "I like nature, Did u...";
		
		String text[] = message.split("\\s");
		
		for(String word: text)
		{
			System.out.println(word);
		}
		
	}

}
