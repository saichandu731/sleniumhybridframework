package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addnewcustomerpage
{
   @FindBy(name="name")
   private WebElement customernametextfield;
   @FindBy(name="createCustomerSubmit")
   private WebElement createcustomerbutton;
   public Addnewcustomerpage()
   {
	   PageFactory.initElements(supertestscript.driver, this);
   }
   public void entercustomernametextfield(String name)
   {
	   customernametextfield.sendKeys(name);
   }
   public void clickoncreatecustomerbutton()
   {
	   createcustomerbutton.click();
   }
}
