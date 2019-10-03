package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sample
{
	@Test
	public void testSample() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\testdata\\userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		Sheet s1=w1.getSheet("Sheet1");
		Row r0=s1.getRow(1);
		 Cell c0=r0.getCell(0);
		  String s0=c0.getStringCellValue();
		  System.out.println(s0);
		  Row r2=s1.getRow(4);
			 Cell c2=r2.getCell(4);
			  String s3=c2.getStringCellValue();
			  System.out.println(s3);
			  Row r1=s1.getRow(0);
				 Cell c1=r1.getCell(6);
				  String s2=c1.getStringCellValue();
				  System.out.println(s2);
		  FirefoxDriver rv1 = new FirefoxDriver();
			rv1.get(s0);
			 rv1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 rv1.findElement(By.name("username")).sendKeys(s3);
			 rv1.findElement(By.name("pwd")).sendKeys(s2);
			 rv1.findElement(By.xpath("//input[@type='submit']")).click();
			 
	}
		
		 
		
		
}
