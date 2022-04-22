package com.WrapperClasses;

public class Example3 
{
	public static void main(String[] args) 
	{
		boolean valid = true;
		//Boolean status = valid;
		Boolean status = Boolean.valueOf(valid);
		System.out.println(status);
		System.out.println("=======================");
		Boolean invalid = new Boolean(false);
		//boolean comment = invalid;
		boolean comment = invalid.booleanValue();		
		System.out.println(comment);
	}
}
