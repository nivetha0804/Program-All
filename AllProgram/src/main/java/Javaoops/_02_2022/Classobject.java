package Javaoops._02_2022;

import java.util.Scanner;	

public class Classobject
{
	String brand;
	int price;
	String os;
	public Classobject()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter laptop brand= ");
		brand=scanner.next();
		System.out.println("Enter laptop price= ");
		price=scanner.nextInt();
		System.out.println("Enter laptop os= ");
		os=scanner.next();
		scanner.close();
	}
	public void getClassobjectDetails()
	{
		System.out.println("--Value you entered is--");
		System.out.println("Brand= "+brand);
		System.out.println("Price= "+price);
		System.out.println("Os= "+os);
	}
	public static void main( String[] args )
	{ 
		Classobject obj1=new Classobject();
		obj1.getClassobjectDetails();
	}
}


