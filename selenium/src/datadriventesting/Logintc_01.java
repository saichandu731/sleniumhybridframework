package datadriventesting;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Logintc_01 
{
	@Test
   public void testLogintc_01() throws FileNotFoundException
   {
	  String url= ExcelOperation.readData("TC_01", 1, 0);
	  String username= ExcelOperation.readData("TC_01", 1, 1);
	  String password= ExcelOperation.readData("TC_01", 1, 2);
	  String expectedresult= ExcelOperation.readData("TC_01", 1, 3);
	  FirefoxDriver ff = new FirefoxDriver();
	  ff.get(url);
		 ff.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 ff.findElement(By.name("username")).sendKeys(username);
		 ff.findElement(By.name("pwd")).sendKeys(password);
		 ff.findElement(By.xpath("//input[@type='submit']")).click();
		 String actualresult = ff.getTitle();
	     ExcelOperation.writedata("TC_01", 1, 4, actualresult);
	     if (expectedresult.equals(actualresult))
	     {
		   ExcelOperation.writedata("TC_01", 1, 5, "pass");	
		   
		}
	     else
	     {
	    	 ExcelOperation.writedata("TC_01", 1, 5, "Fail");   
		}
	     
   }
}
