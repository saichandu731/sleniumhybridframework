package datadriventesting;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Createcustomer 
{
	@Test
	public void testcreatecustomer() throws FileNotFoundException
	{
	 String url= ExcelOperation.readData("TC_02", 1, 0);
	  String username= ExcelOperation.readData("TC_02", 1, 1);
	  String password= ExcelOperation.readData("TC_02", 1, 2);
	 String customername=ExcelOperation.readData("TC_02",1,3);
	  String expectedresult= ExcelOperation.readData("TC_02", 1, 4);
	  FirefoxDriver ff = new FirefoxDriver();
	  ff.get(url);
		 ff.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 ff.findElement(By.name("username")).sendKeys(username);
		 ff.findElement(By.name("pwd")).sendKeys(password);
		 ff.findElement(By.xpath("//input[@type='submit']")).click();
		 ff.findElement(By.linkText("Projects & Customers")).click();
		 ff.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		 ff.findElement(By.name("name")).sendKeys(customername);
		 ff.findElement(By.name("createCustomerSubmit")).click();
		 String actualresult = ff.getTitle();
	     ExcelOperation.writedata("TC_02", 1, 5, actualresult);
	     if (expectedresult.equals(actualresult))
	     {
		   ExcelOperation.writedata("TC_02", 1, 6, "pass");	
		   
		}
	     else
	     {
	    	 ExcelOperation.writedata("TC_02", 1, 6, "Fail");   
		}
	
}
}