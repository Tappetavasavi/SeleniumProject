package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactsPage {
	/**
	 * This is a Creating New Contact Page POM Class
	 * @author vasavi
	 * @version 24.10,25
	 */
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FirstName;
     
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement Lastname;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement Title;
    
    @FindBy(xpath="//input[@name='button'][1]")
    private WebElement saveButton;

	public CreateNewContactsPage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	/**
	 * This is a business library to create a new contact
	 * @param FirstName
	 * @param LastName
	 * @param Title
	 */
    public void CreateNewContactsPage(String FirstName,String LastName,String Title)
    {
    	getFirstName().sendKeys(FirstName);
    	getLastname().sendKeys(LastName);
    	getTitle().sendKeys(Title);
    	getSaveButton().click();
    }


}
