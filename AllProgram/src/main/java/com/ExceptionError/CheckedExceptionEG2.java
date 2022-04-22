package com.ExceptionError;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionEG2 
{
	public static void main(String[] args) 
	{
		// you can input from BufferedReader and InputStreamReader
		InputStreamReader is =new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(is);
		//or
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your name");
		String n=null;
		try
		{
			n=br.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Your Name is:- "+n);
	}
}
