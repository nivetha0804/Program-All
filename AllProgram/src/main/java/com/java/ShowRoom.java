package com.java;

import java.util.Scanner;

public class ShowRoom 
{
	String name;
	long mobno;
	double cost,dis,amount;
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter customer name: ");
		name = sc.nextLine();
		System.out.print("Enter customer mobile no: ");
		mobno = sc.nextLong();
		System.out.print("Enter total cost: ");
		cost = sc.nextDouble();
		sc.close();
	}
	void calculate() 
	{
		System.out.println("Discount offer is from 5% to 20%");
		if (cost <= 10000)
		{
			System.out.println("5% of dis");
			dis=(cost*5)/100;
		}
		else if (cost >10000 && cost<= 20000)
		{
			System.out.println("10% of dis");
			dis=(cost*10)/100;
		}
		else if (cost >20000 && cost<= 35000)
		{
			System.out.println("15% of dis");
			dis=(cost*15)/100;
		}
		else
		{
			System.out.println("20% of dis");
			dis=(cost*20)/100;
		}

	}
	void display() 
	{
		amount=cost-dis;
		System.out.println("Customer Name: " + name);
		System.out.println("Mobile Number: " + mobno);
		System.out.println("Amout after discount: " + amount);
	}

	public static void main(String args[]) 
	{
		ShowRoom sr = new ShowRoom();
		sr.input();
		sr.calculate();
		sr.display();
	}
}

