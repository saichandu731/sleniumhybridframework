package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class supertestscript
{
	static FirefoxDriver rv1;	
	public static void testsuperscript() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\testdata\\userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
	String url=w1.getSheet("TC_01").getRow(1).getCell(0).getStringCellValue();
	String un=w1.getSheet("TC_01").getRow(4).getCell(4).getStringCellValue();
	String pwd=w1.getSheet("TC_01").getRow(0).getCell(6).getStringCellValue();
	rv1=new FirefoxDriver();
	rv1.get(url);
	 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 rv1.findElement(By.name("username")).sendKeys(un);
	 rv1.findElement(By.name("pwd")).sendKeys(pwd);
	 rv1.findElement(By.xpath("//input[@type='submit']")).click();
	 
     
}
}
