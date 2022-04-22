package com.stringObjects;

public class Example 
{
	public static void main(String[] args)
	{
		/**
		 * String: is a derived data type, used to sequence of characters.
		 * 
		 * 1. String is a predefined class in java from java.lang  package.
		 * 
		 * 2. String is final class, that is the reason, string class objects are immutable(not modifiable)
		 *
		 * 3. We can create string objects in two ways, 
		 * 
		 * => by using new and constructor
		 * => by literal
		 * 
		 */

		String fname = "VISHNU";

		System.out.println(fname);

		System.out.println("====================");

		fname.concat(" PRIYA");

		System.out.println(fname);
	}
}
