package autopackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class sample
{
 public static void main(String[] args)
 {
	 ChromeDriver rv1 = new ChromeDriver();
	 rv1.get("http://laptop-mbtletrk:81/login.do");
	 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 rv1.findElement(By.name("username")).sendKeys("admin");
	 rv1.findElement(By.name("pwd")).sendKeys("manager");
	 rv1.findElement(By.xpath("//input[@type='submit']")).click();
	 System.out.println(rv1.getTitle());
	 rv1.findElement(By.className("logoutImg")).click();
	 rv1.close();
	 
	 
 }
}
