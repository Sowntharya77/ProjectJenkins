package org.jen;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {
	
	@Before
	public void StartTime()
	{
		System.out.println("Test Start Date");
	}
	
	@Test
	public void TestAdd()
	{
		Calculator calc = new Calculator();
		
		assertEquals(5, calc.Addition(2, 3));
		System.out.println("addition of two numbers is equal");
	}
	
	 @After  
	 public void endDate()
	 {
		 System.out.println("Test End Date");
		 
	 }

}
