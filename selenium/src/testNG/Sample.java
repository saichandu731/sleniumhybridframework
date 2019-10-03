package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample
{
	@Parameters({"t1","t2"})
	@Test
  public void testSample(int a,double b)
  {
	  System.out.println("value of a is" + a);
	  System.out.println("value of b is" + b);
	  
  }
}
