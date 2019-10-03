package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class createuser extends supertestscript
 {
	@Test
	public static void testdeletetask() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	supertestscript.testsuperscript();
	FileInputStream fis = new FileInputStream("C:\\testdata\\userdata.xlsx");
	Workbook w1=WorkbookFactory.create(fis);
	rv1.findElement(By.className("menu_link")).click();
	rv1.findElement(By.xpath("//input[@value='Add New User']")).click();
	String username=w1.getSheet("TC_03").getRow(3).getCell(0).getStringCellValue();
	rv1.findElement(By.name("username")).sendKeys(username);
	 String password=w1.getSheet("TC_03").getRow(3).getCell(1).getStringCellValue();
	rv1.findElement(By.name("passwordText")).sendKeys(password);
	 String repassword=w1.getSheet("TC_03").getRow(3).getCell(2).getStringCellValue();
	rv1.findElement(By.name("passwordTextRetype")).sendKeys(repassword);
	 String firstname=w1.getSheet("TC_03").getRow(3).getCell(3).getStringCellValue();
	rv1.findElement(By.name("firstName")).sendKeys(firstname);
	String lastname=w1.getSheet("TC_03").getRow(3).getCell(4).getStringCellValue();
	rv1.findElement(By.name("lastName")).sendKeys(lastname);
	String middlename=w1.getSheet("TC_03").getRow(3).getCell(5).getStringCellValue();
	rv1.findElement(By.name("middleName")).sendKeys(middlename);
	String email=w1.getSheet("TC_03").getRow(3).getCell(6).getStringCellValue();
	rv1.findElement(By.name("email")).sendKeys(email);
	long phone=(long)w1.getSheet("TC_03").getRow(3).getCell(7).getNumericCellValue();
	rv1.findElement(By.name("phone")).sendKeys(""+phone);
	String fax=w1.getSheet("TC_03").getRow(3).getCell(8).getStringCellValue();
	rv1.findElement(By.name("fax")).sendKeys(fax);
	 long mobile=(long)w1.getSheet("TC_03").getRow(3).getCell(9).getNumericCellValue();
	rv1.findElement(By.name("mobile")).sendKeys(""+mobile);
	 long contact=(long)w1.getSheet("TC_03").getRow(3).getCell(10).getNumericCellValue();
	rv1.findElement(By.name("otherContact")).sendKeys(""+contact);
	rv1.findElement(By.xpath("//input[@value='   Create User   ']")).click();
	String s=rv1.findElement(By.className("successmsg")).getText();
	  System.out.println(s);
	  
	}
 }
