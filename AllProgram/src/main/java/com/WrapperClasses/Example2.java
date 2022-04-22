package com.WrapperClasses;

public class Example2 
{
	public static void main(String[] args)
	{
		char grade = 'O';
		//Character g1 = grade;
		Character g1 = grade;
		System.out.println(g1);
		System.out.println("=========================");
		Character c1 = new Character('1');
		//char rank = c1;
		char rank = c1.charValue();
		System.out.println(rank);
	}
}
