package Javaoops._02_2022;

public class Customer
{
	//state(variables)
	int Id;
	String Name;
	double Salary;
	//constructor: used to initialize an object(state)
	public Customer() 
	{
		Id = 1001;
		Name = "vijay";
		Salary = 20000.00;
	}
	//behavior(methods)
	public void getCustomerDetails()
	{
		System.out.println("Id: "+Id);
		System.out.println("Name: "+Name);
		System.out.println("Salary: "+Salary);

	}
	public static void main( String[] args )
	{
		Customer customer1 = new Customer();		
		customer1.getCustomerDetails();
	}
}


