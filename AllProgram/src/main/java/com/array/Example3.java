package com.array;

public class Example3 
{
	public static void main(String[] args)
	{
		String studentNames[] = {"Vishnu", "Lokeshwari", "Nivetha", "Sushma", "Renugadevi","Monika"};
		for(String name: studentNames)
		{
			System.out.println(name);
		}
		System.out.println("========");
		System.out.println(studentNames.length);
	}

}
