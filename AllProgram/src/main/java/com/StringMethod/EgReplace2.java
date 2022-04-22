package com.StringMethod;

public class EgReplace2 
{
	public static void main(String[] args)
	{
		/**
		 * replace(CharSequence target, CharSequence replacement):
		 * 
		 * Replaces each substring of this string that matches the literal 
		 * target sequence with the specified literal replacement sequence.
		 * 
		 */

		String text = "Welcome to india, welcome to Pune";
		System.out.println(text);
		System.out.println("               ");
		System.out.println(text.replace("to", "2"));
		System.out.println(text.replace("india", "INDIA"));
		System.out.println(text.replace("pune", "PUNE"));		
	}
}
