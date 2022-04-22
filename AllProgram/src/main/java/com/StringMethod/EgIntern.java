package com.StringMethod;

public class EgIntern 
{
	public static void main(String[] args)
	{

		/**
		 * intern():
		 * 
		 * Returns a canonical representation for the string object.
		 * 		  
		 **/

		String text = "I like to hear melody songs";
		String text1 = "I like to play tennis";
		String t = text.intern();
		String t1 = text1.intern();
		System.out.println(text);
		System.out.println(text1);
	}
}
