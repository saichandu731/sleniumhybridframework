package datadriventesting;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class deletetask extends supertestscript
{
	@Test
	public static void testdeletetask() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	supertestscript.testsuperscript();
	rv1.findElement(By.linkText("complete selenium assignment")).click();
	rv1.findElement(By.xpath("//input[@value='Delete This Task']")).click();
	rv1.switchTo().alert().accept();
WebElement success=rv1.findElement(By.className("successmsg"));
	System.out.println(success);
}
}