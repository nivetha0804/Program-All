package com.javabasics;

import java.util.Scanner;

public class Example2 
{			
public static void main(String[] args) 
{
	int a,b,sum;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE VALUE OF A= ");
	a=sc.nextInt();
	System.out.println("ENTER THE VALUE OF B= ");
	b=sc.nextInt();
	sc.close();
	sum=a+b;
		System.out.println("THE VALUE OF C= "+sum);
		
		
}
}
