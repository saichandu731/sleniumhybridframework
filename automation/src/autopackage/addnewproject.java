package autopackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class addnewproject 
{
	public static void main(String[] args)
	 {
		 FirefoxDriver rv1 = new FirefoxDriver();
		 rv1.get("http://laptop-mbtletrk:81/login.do");
		 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 rv1.findElement(By.name("username")).sendKeys("admin");
		 rv1.findElement(By.name("pwd")).sendKeys("manager");
		 rv1.findElement(By.xpath("//input[@type='submit']")).click();
		 rv1.findElement(By.linkText("Projects & Customers")).click();
		 rv1.findElement(By.xpath("//input[@value='Add New Project']")).click();
		 WebElement d1=rv1.findElement(By.name("customerId"));
		 Select s1 =new Select(d1);
		 s1.selectByVisibleText("chandusai");
		 rv1.findElement(By.name("name")).sendKeys("seleniumide1");
		 rv1.findElement(By.name("createProjectSubmit")).click();
		 String s=rv1.findElement(By.className("successmsg")).getText();
		 System.out.println(s);
		 rv1.findElement(By.className("logoutImg")).click();
		 
		 
		
}
}
