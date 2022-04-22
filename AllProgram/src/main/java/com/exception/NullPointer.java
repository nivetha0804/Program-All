package com.exception;

import java.util.Scanner;

public class NullPointer
{
public static void main(String[] args) 
{
String n=null;
Scanner sc =new Scanner(System.in);
try
{
	System.out.println("enter name:");
	n=sc.nextLine();
	System.out.println("name="+n);
}
catch(NullPointerException e)
{
	e.printStackTrace();
}
}
}



	

