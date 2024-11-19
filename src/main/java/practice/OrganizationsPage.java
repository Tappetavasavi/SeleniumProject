package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
      @FindBy(xpath="//img[@alt='Create Organization...']")
      private WebElement createNewOrganisationsIcon;
      
      public OrganizationsPage(WebDriver driver) 
      {
    	  PageFactory.initElements(driver,this);
      }

	  public WebElement getCreateNewOrganisationsIcon() 
	  {
		return createNewOrganisationsIcon;
	  }

	  public void clickOnCreateNewOrganizationIcon()
	  {
		getCreateNewOrganisationsIcon().click();
	  }
      
}
