package autopackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class task
{
	public static void main(String[] args)
	 {
		FirefoxDriver rv1 = new FirefoxDriver();
		 rv1.get("http://laptop-mbtletrk:81/login.do");
		 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 rv1.findElement(By.name("username")).sendKeys("admin");
		 rv1.findElement(By.name("pwd")).sendKeys("manager");
		 rv1.findElement(By.xpath("//input[@type='submit']")).click();
		 rv1.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
		 WebElement d1=rv1.findElement(By.name("customerId"));
		 Select s = new Select(d1);
		 s.selectByVisibleText("usernams");
		 WebElement d2=rv1.findElement(By.name("projectId"));
		 Select s1 = new Select(d2);
		 s1.selectByIndex(2);
		 rv1.findElement(By.name("task[0].name")).sendKeys("hjhgdsyfyuds");
		 WebElement d3=rv1.findElement(By.name("task[0].billingType"));
		 Select s2 = new Select(d3);
		 s2.selectByIndex(1);
		 rv1.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		  String d4=rv1.findElement(By.className("successmsg")).getText();
		  System.out.println(d4);
		  WebElement d5=rv1.findElement(By.name("customerProject.shownCustomer"));
			 Select s3 = new Select(d5);
			 s3.selectByVisibleText("username");
			 rv1.findElement(By.name("searchTasks")).click();
			 rv1.findElement(By.linkText("hjhgdsyfyuds")).click();
			 rv1.findElement(By.xpath("//input[@value='Delete This Task']")).click();
			 rv1.switchTo().alert().accept();
			 System.out.println(rv1.findElement(By.className("successmsg")).getText());
			 rv1.findElement(By.className("logoutImg")).click();
		  
		 
		 
	 }

}

