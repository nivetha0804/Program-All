package com.ExceptionError;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException 
{
public static void main(String[] args) throws IOException 
{
// you can input from BufferedReader and InputStreamReader
InputStreamReader is =new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(is);
//or
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter your name");
String n=br.readLine();//Checked exception IOException
System.out.println("Your Name is:- "+n);
}
}
