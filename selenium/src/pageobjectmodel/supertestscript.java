package pageobjectmodel;


import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class supertestscript 
{
	public static WebDriver driver;
	@BeforeTest
	public void openbrowser() throws FileNotFoundException
	{
		String browser=ExcelOperation.readData("preconfig", 1, 0);
		String url=ExcelOperation.readData("preconfig", 1, 1);
		if(browser.equalsIgnoreCase("firefox"))
		{
		driver =new FirefoxDriver();
		driver.get(url);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		 else
		 {
			 driver =new ChromeDriver();
				driver.get(url);
				 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 }
	   }
	
	@AfterTest
	public static void closebrowser()
	{
		driver.close();
	}
	@BeforeClass
	public void logintoactitime() throws FileNotFoundException
	{
		String un=ExcelOperation.readData("preconfig", 1, 2);
		String pwd=ExcelOperation.readData("preconfig", 1, 3);
		 driver.findElement(By.name("username")).sendKeys(un);
		 driver.findElement(By.name("pwd")).sendKeys(pwd);
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
	}
	@AfterClass
	public void logoutfromactitime()
	{
		driver.findElement(By.className("logoutImg")).click();
	}
}
