package com.java;

public class Overload1 
{
	//function with no arg
	//1/2+1/3+1/4+1/5+......1/10 series sum
	//0.5+0.3333+0.0.25+...
void series()
{
float s=0;
for(int i=2;i<=10;i++)
{
	
}
}
//function with no arg
	//1,8,27,64,125,...
//0,7,26,
void series(int p)
{
	int cube;
	for(int i=1;i<=5;i++)
	{
		cube=i*i*i;
		System.out.println(cube+" ,");
	}
	System.out.println("sum=     ");
}
void series(int x,int n)
{
float s=0;
for(int i=1;i<=n;i++)
{
	s=(float) (s+Math.pow(x, i));
}
}
public static void main(String[] args) {
	Overload ob=new Overload();
	ob.series(8);
	ob.series();
	ob.series(2,5);
}
}


//implicit and explicit
int=4bytes
