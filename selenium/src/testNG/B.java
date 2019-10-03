package testNG;

import org.testng.annotations.Test;

public class B 
	{
		@Test(groups="FT")
	  public void testfunctionaltesting()
	  {
		  System.out.println("run functional test");
	  }
		@Test(groups="IT")
	  public void testintegrationtesting()
	  {
		  System.out.println("run integration test");
	  }
		@Test(groups="ST")
	  public void testsystemtesting()
	  {
		  System.out.println("run system test");
	  }

}
