package codeSample;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionTest1 
{
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testException()
	{
		thrown.expect(ArithmeticException.class);
		int a=10/0;
	}
}
