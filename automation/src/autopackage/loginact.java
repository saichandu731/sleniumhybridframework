package autopackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginact 
{
	public static void main(String[] args)
	 {
		 FirefoxDriver rv1 = new FirefoxDriver();
		 rv1.get("http://laptop-mbtletrk:81/login.do");
		 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 rv1.findElement(By.name("username")).sendKeys("admin");
		 rv1.findElement(By.name("pwd")).sendKeys("manager");
		 rv1.findElement(By.xpath("//input[@type='submit']")).click();
	
}
}