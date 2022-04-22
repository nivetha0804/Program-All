package com.java;

//Define a class named BookFair with the following description: 
//Instance variables/Data members :
//String Bname — stores the name of the book
//double price — stores the price of the book Member methods :
//(i) BookFair() — Default constructor to initialize data members
//(ii) void Input() — To input and store the name and the price of the book.
//(iii) void calculate() — To calculate the price after discount. 
//Discount is calculated based on the following criteria.

//Price Discount
//Less than or equal to Rs. 1000----2% of price
//More than Rs. 1000 and less than or equal to Rs. 3000	10% of price
//More than 3000----15% of price
//(iv) void display() — To display the name and price of the book after discount. 
//Write a main method to create an object of the class and call the above member methods.

import java.util.Scanner;

public class Bookfair 
{
	String Bname;
	double Price,Amount,Discount;
	{
		Bname=" ";
		Price=0;
	}
	
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book name: ");
		Bname = sc.nextLine();
		System.out.print("Enter Price: ");
		Price = sc.nextDouble();
		sc.close();
	}
	void calculate() 
	{
		System.out.println("Discount offer is from 2% to 15%");
		if (Price <= 1000)
		{
			System.out.println("2% of dis");
			Discount=(Price*2)/100;
		}
		else if (Price >1000 && Price<= 3000)
		{
			System.out.println("10% of dis");
			Discount=(Price*10)/100;
		}
		else if (Price >3000)
		{
			System.out.println("15% of dis");
			Discount=(Price*15)/100;
		}
		else
		{
			System.out.println("No dis");
		}
	}
	void display() 
	{
		Price=Price-Discount;
		System.out.println("Book Name: " + Bname);
		System.out.println("Price: " + Price);
	}

	public static void main(String args[]) 
	{
		Bookfair Bf = new Bookfair();
		Bf.input();
		Bf.calculate();
		Bf.display();
	}
}
