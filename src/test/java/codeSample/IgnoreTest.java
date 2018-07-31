package codeSample;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest 
{

	@Ignore
	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}

	@Test
	public void test2()
	{
		System.out.println("Test 2");
	}

	@Ignore
	@Test
	public void test3()
	{
		System.out.println("Test 3");
	}

	@Test
	public void test4()
	{
		System.out.println("Test 4");
	}
}
