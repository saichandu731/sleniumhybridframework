package datadriventesting;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class deleteproject extends supertestscript
{
	@Test
	public static void testdeleteproject() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		supertestscript.testsuperscript();
	 rv1.findElement(By.linkText("Projects & Customers")).click();
	 rv1.findElement(By.linkText("hjffhjgkgugj")).click();
	 rv1.findElement(By.xpath("//input[@value='Delete This Project']")).click();
	 rv1.switchTo().alert().accept();
	 
	
}
}