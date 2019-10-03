package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class A
{
   @BeforeTest
   public void openBrowser()
   {
	   System.out.println("browseer is opened");
	   
   }
   @AfterTest
   public void closeBrowser()
   {
	   System.out.println("browseer is closed");
	   
   }
   @BeforeClass
   public void login()
   {
	   System.out.println("login is success");
	   
   }
   @AfterClass
   public void logout()
   {
	   System.out.println("logout is success");
	   
   }
}
