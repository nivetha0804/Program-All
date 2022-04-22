package com.StringMethod;

public class EgJoin 
{
public static void main(String[] args) {
		
		/**
		 * join(CharSequence delimiter, CharSequence... elements):
		 * 
		 * Returns a new String composed of copies of the CharSequence elements 
		 * joined together with a copy of the specified delimiter.
		 * 
		 */
		
		String text = String.join(" ", "Hai", "How are you", "All");
		String text1 = String.join("_", "Hai", "How are you", "All");
		String text2 = String.join("-", "Hai", "How are you", "All");
		System.out.println(text);
		System.out.println(text1);
		System.out.println(text2);
	}
}
