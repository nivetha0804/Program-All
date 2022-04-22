package Javaoops._02_2022;


/**
 * class: it is a template to the object/instance
 * 
 * object/instance: it is a physical entity, which have memory allocation in RAM(Heap).
 *
 */

public class Employee 
{
   	public static void main( String[] args )
    {
	
		Employee employee1 = new Employee();		
		
		/**
		 * from line 16 in the program
		 * 
		 * 'Employee': is a class name
		 * 
		 * 'employee1': it is an object reference
		 * 
		 * '=': it is an assignment operator
		 * 
		 * 'new': it is a keyword, this keyword help us to allocate memory(RAM(Heap)) to the object
		 * 
		 * 'Employee()': it is a constructor, used to initialize an object.
		 */
		
		System.out.println(employee1.hashCode());
		
		Employee employee2 = new Employee();
		
		System.out.println(employee2.hashCode());
		
    }
	
}
