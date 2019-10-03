package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class opentaskpage 
{
  @FindBy(linkText="Projects & Customers")
  private WebElement projectsAndCustomerLink;
  public opentaskpage()
  {
	  PageFactory.initElements(supertestscript.driver, this);
  }
  public void clickonprojectsandcustomerlink()
  {
	  projectsAndCustomerLink.click();
  }
  
  
}
