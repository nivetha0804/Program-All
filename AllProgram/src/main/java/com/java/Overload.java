package com.java;

public class Overload 
{
void area(float r)
{
float c;
c=3014159f*r*r;
}
void area(int s)
{
	int sq;
	sq=s*s;
}
void area(int l,int b)
{
	int sq;
	sq=l*b;
}
public static void main(String[] args) 
{
Overload ob=new Overload();
ob.area(5.6f);//area of circle
ob.area(8);//area sq
ob.area(5,8);
System.out.println();
}
}
