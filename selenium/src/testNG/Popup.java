package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Popup 
{
	@Test
	public void testPopup()
	{
	 FirefoxDriver rv1 = new FirefoxDriver();
	 rv1.get("http://laptop-mbtletrk:81/login.do");
	 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 rv1.findElement(By.name("username")).sendKeys("admin");
	 rv1.findElement(By.name("pwd")).sendKeys("manager");
	 rv1.findElement(By.xpath("//input[@type='submit']")).click();
	 rv1.findElement(By.linkText("Projects & Customers")).click();
	 rv1.findElement(By.linkText("pavan")).click();
	 rv1.findElement(By.xpath("//input[@value='Delete This Project']")).click();
	Alert a1 =rv1.switchTo().alert();
	String s=a1.getText();
	System.out.println(s);
	a1.accept();
	System.out.println(rv1.findElement(By.className("successmsg")).getText());
	rv1.findElement(By.className("logoutImg")).click();
	 

}
}