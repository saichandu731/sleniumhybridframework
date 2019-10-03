package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Createcustomer extends A
{
	@BeforeMethod
	 public void retrieveTitle1()
	   {
		   System.out.println("title is retrieved");
		   
	   }
	@Test
	 public void testCreateCustomer()
	   {
		   System.out.println("customer created succesfully");
		   
	   }
	@AfterMethod
	 public void displaymsg1()
	   {
		   System.out.println("display msg success");
		   
	   }
}
