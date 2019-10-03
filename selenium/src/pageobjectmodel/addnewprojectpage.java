package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addnewprojectpage
{
   @FindBy(name="customerId")
   private WebElement customerdropdown;
   
   @FindBy(name="name")
   private WebElement projectnametxtfield;
   
   @FindBy(name="createProjectSubmit")
   private WebElement clickoncreateprojectbutton;
   
   public addnewprojectpage()
   {
	   PageFactory.initElements(supertestscript.driver, this);
   }
   public void selectcustomerdropdown(String customername)
   {
	   Select s2=new Select(customerdropdown);
	   s2.selectByVisibleText(customername);
   }
   public void enterprojectnametextfield(String projectname)
   {
	   projectnametxtfield.sendKeys(projectname);
   }
   public void clickonprojectsubmitbutton()
   {
	   clickoncreateprojectbutton.click();
   }
}
