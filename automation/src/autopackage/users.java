package autopackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class users 
{
	public static void main(String[] args)
	 {
		 FirefoxDriver rv1 = new FirefoxDriver();
		 rv1.get("http://laptop-mbtletrk:81/login.do");
		 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 rv1.findElement(By.name("username")).sendKeys("admin");
		 rv1.findElement(By.name("pwd")).sendKeys("manager");
		 rv1.findElement(By.xpath("//input[@type='submit']")).click();
		 rv1.findElement(By.linkText("Users")).click();
		 rv1.findElement(By.xpath("//input[@type='button']")).click();
		 rv1.findElement(By.name("username")).sendKeys("saichandu");
		 rv1.findElement(By.name("passwordText")).sendKeys("994813221chan");
		 rv1.findElement(By.name("passwordTextRetype")).sendKeys("994813221chan");
		 rv1.findElement(By.name("firstName")).sendKeys("sai");
		 rv1.findElement(By.name("lastName")).sendKeys("chandu");
		 rv1.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		 System.out.println(rv1.findElement(By.className("successmsg")).getText());
		  rv1.findElement(By.className("logoutImg")).click();
		  
}
}