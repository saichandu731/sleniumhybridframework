package testNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Screenshot
{
	@Test
	public void testScreenshot()
	{
	 FirefoxDriver rv1 = new FirefoxDriver();
	 rv1.get("https://www.google.com/search?client=firefox-b-d&q=fb");
	 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 EventFiringWebDriver e1 = new EventFiringWebDriver(rv1);
	File f1=e1.getScreenshotAs(OutputType.FILE);
	File f2= new File("F:\\screen\\login.jpg");
	try {
		FileUtils.moveFile(f1, f2);
	} catch (IOException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}