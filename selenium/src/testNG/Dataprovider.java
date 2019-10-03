package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider
{
	@DataProvider(name="testdata")
   public Object[][] getdata()
   {
	   Object[][] rv1=new Object[3][2];
	   rv1[0][0]="admin12";
	   rv1[0][1]="manager123";
	   rv1[1][0]="admin12@$%";
	   rv1[1][1]="mana   ger&^%";
	   rv1[2][0]="adm   in";
	   rv1[2][1]="manager1234567";
	   return rv1;
   }
	@Test(dataProvider="testdata")
   public void testloginlogout(String un,String pw)
   {
	   FirefoxDriver rv1 = new FirefoxDriver();
		rv1.get("http://laptop-mbtletrk:81/login.do");
		 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 rv1.findElement(By.name("username")).sendKeys(un);
		 rv1.findElement(By.name("pwd")).sendKeys(pw);
		 rv1.findElement(By.xpath("//input[@type='submit']")).click();

   }
}
