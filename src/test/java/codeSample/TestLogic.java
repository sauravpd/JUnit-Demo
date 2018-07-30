package codeSample;

import org.junit.Assert;
import org.junit.Test;

public class TestLogic 
{
	@Test
	public void testAddMethod()
	{
		Assert.assertEquals(10,Calculation.add(5, 5));
	}
}
