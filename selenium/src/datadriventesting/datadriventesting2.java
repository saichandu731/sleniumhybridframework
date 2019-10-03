package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class datadriventesting2
{
	@Test
	public void testdata() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	FileInputStream fis = new FileInputStream("C:\\testdata\\userdata.xlsx");
	Workbook w1=WorkbookFactory.create(fis); 
	Sheet s1=w1.createSheet("Sheet2");
	Row r0=s1.createRow(1);
	 Cell c0=r0.createCell(0);
	  c0.setCellValue("selenium");
	
	
	FileOutputStream fos = new FileOutputStream("C:\\testdata\\userdata.xlsx");
	w1.write(fos);
	
}
}
