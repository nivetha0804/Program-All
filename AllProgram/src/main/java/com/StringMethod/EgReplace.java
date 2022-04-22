package com.StringMethod;

public class EgReplace 
{
	public static void main(String[] args) 
	{
		/**
		 * replace(char oldChar, char newChar):
		 * 
		 * Returns a string resulting from replacing all occurrences of 
		 * oldChar in this string with newChar.
		 */

		String message = "Hello How are, I am fine, thank you";

		System.out.println(message);
		System.out.println(message.replace('H', 'h'));
		System.out.println(message.replace('t', 'T'));

	}
}
