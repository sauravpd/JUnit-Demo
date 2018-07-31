package codeSample;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class TimeoutTest 
{
	@Test(timeout=1000)
	public void test1() throws InterruptedException
	{
		//This test will be failed, because it will take more than 1 second to finish!
		TimeUnit.SECONDS.sleep(5000);
	}	
}
