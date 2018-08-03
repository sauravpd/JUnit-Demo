package codeSample;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/**
 * Parameterized example 
 * @author saurav
 *
 */
@RunWith(Parameterized.class)
public class ParameterizedTest 
{
	private int numX;
	private int numY;
	private int expectedNum;

	// Inject via constructor
	public ParameterizedTest(int numX, int numY, int expectedNum) 
	{
		this.numX = numX;
		this.numY = numY;
		this.expectedNum = expectedNum;
	}
	
    @Parameters()
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 5}
        });
    }
    
    @Test
    public void test_addTwoNumbes() 
    {
        Assert.assertEquals(expectedNum,ParameterizedTest.add(numX, numY));
    }
    public static int add(int a,int b)
    {
    	return a+b;
    }
}
