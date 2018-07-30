package codeSample;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLogic 
{
	
	@Before
	public void before()
	{
		System.out.println("****@Before****");
	}
	
	@After
	public void after()
	{
		System.out.println("****@After****");
	}
	@Test
	public void testAddMethod()
	{
		System.out.println("testAddMethod");
		Assert.assertEquals(10,Calculation.add(5, 5));
	}
}
