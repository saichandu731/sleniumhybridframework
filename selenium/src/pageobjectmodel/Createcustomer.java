package pageobjectmodel;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class Createcustomer extends supertestscript 
{
 @Test
 public void testcreatecustomer() throws FileNotFoundException
 {
	 //step1 create objects of webpage classes
	 opentaskpage otp=new opentaskpage();
	 Activeprojectsandcustomerspage apcp=new Activeprojectsandcustomerspage();
	 Addnewcustomerpage ancp= new Addnewcustomerpage();
	 //step2 read data from excel file
	 String customername=ExcelOperation.readData("createcustomer", 1, 0);
	 String expectedresult=ExcelOperation.readData("createcustomer", 1, 1);
	 //step3 c0nvert test case into test scripts
	 otp.clickonprojectsandcustomerlink();
	 apcp.clickonaddnewcustomerbutton();
	 ancp.entercustomernametextfield(customername);
	 ancp.clickoncreatecustomerbutton();
	 String actualresult=apcp.retrievesuccessmessage();
	 //step4 validate testscripts
	 
	 String status=ValidationHelperclass.verifythetestscript(expectedresult, actualresult);
	 //step5 write actualresult and status in excel
	 ExcelOperation.writedata("createcustomer", 1, 2,actualresult);
	 ExcelOperation.writedata("createcustomer", 1, 3,status);
 }
}
