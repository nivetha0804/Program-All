package com.aboutStringBufferAndStringBuilder;

public class Example1 
{
	public static void main(String[] args) 
	{		
		
		StringBuffer name = new StringBuffer("AKSHAYA");
		
		name.append(" MOHAN");
		
		System.out.println(name);	
		
		System.out.println("==================");
		
		StringBuilder myName = new StringBuilder("NIVETHA");
		
		myName.append(" SELVAM");
		
		System.out.println(myName);
		
	}
}
