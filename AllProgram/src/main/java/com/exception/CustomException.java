package com.exception;
//Custom Exception:
//Input firstname and lastname from user
//if firstname and lastname blank display 
//-exception message
//first name and last not suppose to be blank

import java.util.Scanner;

//handle NullPointerException

class StringBlank extends Exception
{
	public StringBlank(String s) 
	{
		super(s); //calls super class constructor (Exception class)
	}
}
public class CustomException 
{
	public static void main(String[] args) 
	{
		int Fname,Lname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First name");
		Fname=sc.nextInt();
		System.out.println("Enter Last name");
		Lname=sc.nextInt();
		try
		{
			try 
			{
				if(Fname.length()== || Lname.length()==0 ||Fname.equls(" ") ||Lname.equals(" "))
				{
					throw new StringBlank("First name and Last name should not be blank");
				}
				else
				{
					System.out.println("your name is:"+Fname" "+Lname);
				}
			}
			catch(StringBlank e) 
			{
				e.printStackTrace();
			}
			catch(NullPointerException e)
			{
				e.printStackTrace();
			}
			finally
			{
									System.out.println("Finally Block");
					
			}
		}
	}
}


