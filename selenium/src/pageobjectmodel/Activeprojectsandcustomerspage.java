package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Activeprojectsandcustomerspage
{
    @FindBy(xpath="//input[@value='Add New Customer']")
    private WebElement addnewcustomerbutton;
    
    @FindBy(className="successmsg")
    private WebElement successmessage;
    
    @FindBy(xpath="//input[@value='Add New Project']")
    private WebElement addnewprojectbutton;
    

public Activeprojectsandcustomerspage()
{
	PageFactory.initElements(supertestscript.driver, this);
}
public void clickonaddnewcustomerbutton()
{
	addnewcustomerbutton.click();
}
public String retrievesuccessmessage()
{
	 return successmessage.getText();
}
public void clickonaddnewprojectbutton()
{
	addnewprojectbutton.click();
}
}

