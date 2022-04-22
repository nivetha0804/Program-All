package Javaoops._02_2022;

public class Laptop 
{
	//state(variables)
	int Id;
	String Name;
	String Ram;
	double Price;
	String Color;
	String Brand;
	
	//constructor: used to initialize an object(state)
	public Laptop() 
	{
		Id = 1001;
		Name = "Laptap";
		Ram = "4GB";
		Price = 25000.00;
		Color = "Pink";
		Brand = "Apple"; 
	}
	//behavior(methods)
	public void getLaptopDetails()
	{
		System.out.println("Id: "+Id);
		System.out.println("Name: "+Name);
		System.out.println("Ram: "+Ram);
		System.out.println("Price: "+Price);
		System.out.println("Color: "+Color);
		System.out.println("Brand: "+Brand);
	}
	public static void main( String[] args )
	{
		Laptop laptop1 = new Laptop();		
		laptop1.getLaptopDetails();
	}
}


