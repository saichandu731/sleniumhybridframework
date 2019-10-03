package autopackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple 
{
	public static void main(String[] args)
	 {
		 FirefoxDriver rv1 = new FirefoxDriver();
		 rv1.get("http://laptop-mbtletrk:81/login.do");
		 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 rv1.findElement(By.name("username")).sendKeys("admin");
		 rv1.findElement(By.name("pwd")).sendKeys("manager");
		 rv1.findElement(By.xpath("//input[@type='submit']")).click();
         WebElement d1=rv1.findElement(By.name("customerProject.shownCustomer"));
         Select s1 =new Select(d1);  
         Boolean t1=s1.isMultiple();
         System.out.println(t1);
         int count=s1.getOptions().size();
         System.out.println(count);
         List<WebElement> l1 = s1.getOptions();
         for(int i=0;i<count;i++)
         {
        	 String options=l1.get(i).getText();
        	 System.out.println(options);
         }
         
       
         
         
         
         
         
} 
}
