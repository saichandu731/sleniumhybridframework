package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class createproject extends supertestscript
{
	@Test
	public static void testdeletetask() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	supertestscript.testsuperscript();
	FileInputStream fis = new FileInputStream("C:\\testdata\\userdata.xlsx");
	Workbook w1=WorkbookFactory.create(fis);
    rv1.findElement(By.xpath("//input[@type='Add New Project']")).click();
    WebElement r1= rv1.findElement(By.name("customerId"));
    Select s1 =new Select(r1);
    s1.selectByIndex(2);
    String projectname=w1.getSheet("TC_03").getRow(2).getCell(3).getStringCellValue();
    rv1.findElement(By.name("name")).sendKeys(projectname);
	 rv1.findElement(By.name("createProjectSubmit")).click();
	  String s=rv1.findElement(By.className("successmsg")).getText();
	  System.out.println(s);
	  
}
}