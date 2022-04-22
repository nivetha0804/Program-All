package com.StringMethod;

public class EgToCharArray 
{
	public static void main(String[] args) 
	{
		/**
		 * 
		 * toCharArray():
		 * 
		 * Converts this string to a new character array.
		 *   
		 */
		
		String message = "Hello How are";
		
		char characters[] = message.toCharArray();
		
		for(char character: characters)
		{
			System.out.println(character);
		}
		
	}

}
