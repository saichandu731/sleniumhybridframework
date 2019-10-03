package pageobjectmodel;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class createproject extends supertestscript
{
	@Test
	 public void testcreateproject() throws FileNotFoundException
	 {
		 opentaskpage otp=new opentaskpage();
		 Activeprojectsandcustomerspage apcp=new Activeprojectsandcustomerspage();
		 addnewprojectpage anpp= new addnewprojectpage();
		 String customernamedd=ExcelOperation.readData("createproject", 1, 0);
		 String projectname=ExcelOperation.readData("createproject", 1, 1);
		 String expectedresult=ExcelOperation.readData("createproject", 1, 2);
		 otp.clickonprojectsandcustomerlink();
		 apcp.clickonaddnewprojectbutton();
		 anpp.selectcustomerdropdown(customernamedd);
		 anpp.enterprojectnametextfield(projectname);
		 anpp.clickonprojectsubmitbutton();
		 String actualresult=apcp.retrievesuccessmessage();
		String status= ValidationHelperclass.verifythetestscript(expectedresult, actualresult);
		 ExcelOperation.writedata("createproject", 1, 3, actualresult);
		 ExcelOperation.writedata("createproject", 1, 4, status);
}
}

