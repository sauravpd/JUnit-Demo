package codeSample;

import org.junit.Test;

public class ExpectedExceptionTest 
{
	@Test(expected=ArithmeticException.class)
	public void testDivisionWithException()
	{
		int a=10/0;
	}
}
