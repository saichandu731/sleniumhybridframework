package autopackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon 
{
	public static void main(String[] args)
	 {
		FirefoxDriver rv1 = new FirefoxDriver();
		 rv1.get("https://www.google.com/search?client=firefox-b-d&q=amazon");
		 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 rv1.findElement(By.className("sA5rQ")).click();
		 WebElement s1=rv1.findElement(By.className("nav-line-1"));
		 Actions a1 = new Actions(rv1);
		 a1.moveToElement(s1).build().perform();
		 rv1.findElement(By.className("nav-action-inner")).click();
		 rv1.findElement(By.id("ap_email")).sendKeys("chandu.mudigonda.731@gmail.com");
		
		 
	
}
}
