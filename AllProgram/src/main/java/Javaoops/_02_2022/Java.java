package Javaoops._02_2022;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Java
{
	@Test
	public void testSetup() 
	{
		String str= "I know to set up JUnit on my system";
		assertEquals("I know to set up JUnit on my system",str);
	}
}
