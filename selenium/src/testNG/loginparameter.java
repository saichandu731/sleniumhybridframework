package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginparameter
{
	@Parameters({"t1","t2","t3"})
	@Test
	public void testlogin(String url,String un,String pw )
	{
	
		 FirefoxDriver rv1 = new FirefoxDriver();
	rv1.get(url);
	 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 rv1.findElement(By.name("username")).sendKeys(un);
	 rv1.findElement(By.name("pwd")).sendKeys(pw);
	 rv1.findElement(By.xpath("//input[@type='submit']")).click();

}
}
