package com.java;

import java.util.Scanner;

public class CheckCharType 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		charCheck(sc.next().charAt(0));
	}
	static void charCheck(char input_char)
	{
		if((input_char >='a'&&input_char<='z')||(input_char>='A'&&input_char<='Z'))
			System.out.println("This character is Alphabet");
		else if (input_char >='0'&& input_char <='9')
			System.out.println("This character is Digit");
		else
			System.out.println("This character is Special Character");
	}
	
}
