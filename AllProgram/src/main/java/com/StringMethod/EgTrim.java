package com.StringMethod;

public class EgTrim 
{
	public static void main(String[] args) 
	{
		/**
		 * 
		 * trim():
		 * 
		 * Returns a string whose value is this string, with 
		 * any leading and trailing whitespace removed.
		 * 
		 */

		String message = " Iam EduBridge Learner Nivetha ";
		System.out.println(message);
		System.out.println(message.length());
		System.out.println("===============================================");
		String text = message.trim();//trim() used
		System.out.println(text.length());
		System.out.println(text);
	}
}
