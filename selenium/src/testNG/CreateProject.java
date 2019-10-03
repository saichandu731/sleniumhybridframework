package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateProject extends A
{
	@BeforeMethod
	 public void retrieveTitle2()
	   {
		   System.out.println("title is retrieved");
		   
	   }
	@Test
	 public void testCreateproject()
	   {
		   System.out.println("project created succesfully");
		   
	   }
	@AfterMethod
	 public void displaymsg2()
	   {
		   System.out.println("display msg success");
		   
	   }


}
