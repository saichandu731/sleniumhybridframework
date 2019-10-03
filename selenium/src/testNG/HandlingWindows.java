package testNG;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.net.ftp.parser.MVSFTPEntryParser;
import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingWindows
{
	@Test
	public void testHandlingWindow()
	{
	 FirefoxDriver rv1 = new FirefoxDriver();
		rv1.get("http://laptop-mbtletrk:81/login.do");
		 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 rv1.findElement(By.name("username")).sendKeys("admin");
		 rv1.findElement(By.name("pwd")).sendKeys("manager");
		 rv1.findElement(By.xpath("//input[@type='submit']")).click();
		 rv1.findElement(By.linkText("Reports")).click();
		 rv1.findElement(By.xpath("//img[text()='Click Here to Pick up the date']")).click();
	     java.lang.String mv=rv1.getWindowHandle();
	     Set<java.lang.String> a1 =rv1.getWindowHandles();
	     for(java.lang.String s :a1)
	     {
	    	 if(s.equals(mv))
	 	 {
	    		 
	    	 }
	    	 else
	    	 {
	    		 rv1.switchTo().window(s);
	    		 break;
	    	 }
	     }
		  rv1.findElement(By.className("calendarWorkingDay")).click();
		  rv1.switchTo().window(mv);
		  rv1.findElement(By.className("logoutImg")).click();
		  
		  
}
}