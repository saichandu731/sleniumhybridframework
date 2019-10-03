 package pageobjectmodel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation 

{
	 public static String readData(String sheetname,int rownumber,int cellnumber) throws FileNotFoundException
	  {
		 try 
		  {
		  FileInputStream fis = new FileInputStream("C:\\testdata\\userdata.xlsx");
			Workbook w1=WorkbookFactory.create(fis);
			 String data=w1.getSheet(sheetname).getRow(rownumber).getCell(cellnumber).getStringCellValue();
			 return data;
		  } 
		  catch (Exception rv1)
		  {
	         return " ";
		  }
	  }
	  public static void writedata(String sheetname,int rownumber,int cellnumber,String data) throws FileNotFoundException
	  {
		  try 
		  {
		FileInputStream fis = new FileInputStream("C:\\testdata\\userdata.xlsx"); 
			Workbook w1=WorkbookFactory.create(fis);
			 w1.getSheet(sheetname).getRow(rownumber).createCell(cellnumber).setCellValue(data);
			 FileOutputStream fos =new FileOutputStream("C:\\testdata\\userdata.xlsx");
			 w1.write(fos);
		  } 
		  catch (Exception rv1)
		  {
	        System.out.println("error");
		  }
	  }
	  public static long readnumberdata(String sheetname,int rownumber,int cellnumber) throws FileNotFoundException
	  {
		  try 
		  {
		FileInputStream fis = new FileInputStream("C:\\testdata\\userdata.xlsx"); 
			Workbook w1=WorkbookFactory.create(fis);
			long data= (long)w1.getSheet(sheetname).getRow(rownumber).createCell(cellnumber).getNumericCellValue();
			 return data;
		  } 
		  catch (Exception rv1)
		  {
	           System.out.println("error");
			return 0;
		
	       }

	}
	}

