package Javaoops._02_2022;

/**
 * class: it is a template to the object/instance
 * 
 * object/instance: it is a physical entity, which have memory allocation in RAM(Heap).
 *
 */

	//class contains state(variables) and behavior(methods)
public class Employees 
{
	//state(variables)
	
	int Id;
	String Name;
	double Salary;
	String Address;
	//constructor: used to initialize an object(state)
	
	public Employees() 
	{
		Id = 5656;
		Name = "Lokesh";
		Salary = 99798.78;
		Address = "Pune";
	}
	//behavior(methods)
	
	public void getEmployeesDetails()
	{
		System.out.println("Id: "+Id);
		System.out.println("Name: "+Name);
		System.out.println("Salary: "+Salary);
		System.out.println("Address: "+Address);
	}
	public static void main( String[] args )
	{
		Employees employee1 = new Employees();		
		employee1.getEmployeesDetails();
	}
}


