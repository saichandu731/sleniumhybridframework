package autopackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class reports 
{
	 public static void main(String[] args)
	 {
		 FirefoxDriver rv1 = new FirefoxDriver();
		 rv1.get("http://laptop-mbtletrk:81/login.do");
		 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 rv1.findElement(By.name("username")).sendKeys("admin");
		 rv1.findElement(By.name("pwd")).sendKeys("manager");
		 rv1.findElement(By.xpath("//input[@type='submit']")).click();
		 rv1.findElement(By.linkText("Reports")).click();
		 WebElement dropdown=rv1.findElement(By.name("users"));
		 Select s1 = new Select(dropdown);
		 Boolean t1=s1.isMultiple();
		 if(t1==true)
		 {
			 s1.selectByIndex(0);
		 }
		 else
		 {
			 System.out.println("error message");
		 }
		 
}
}