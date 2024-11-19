package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
	/**
	 * This is a Creating New Organization Page POM Class
	 * @author vasavi
	 * @version 24.10,25
	 */
    @FindBy(xpath="//input[@name='accountname']")
    private WebElement organizationName;
    
    @FindBy(xpath="//input[@name='website']")
    private WebElement website;
    
    @FindBy(xpath="//input[@name='employees']")
    private WebElement employees;
    
    @FindBy(xpath="//input[@name='phone']")
    private WebElement phone;
    
    @FindBy(xpath="//input[@name='otherphone']")
    private WebElement otherPhone;
    
    @FindBy(xpath="//input[@name='email1']")
    private WebElement email;
    
    @FindBy(xpath="//textarea[@name='bill_street']")
    private WebElement billingAddress;
    
    @FindBy(xpath="//input[@name='bill_state']")
    private WebElement billingState;
    
    @FindBy(xpath="//input[@name='bill_city']")
    private WebElement billingCity;
    
    @FindBy(xpath="(//input[@value='  Save  '])[1]")
    private WebElement saveButton;

	public CreateNewOrganizationPage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}
	public WebElement getOrganizationName() 
	{
		return organizationName;
	}
	public WebElement getWebsite() 
	{
		return website;
	}
	public WebElement getEmployees() 
	{
		return employees;
	}
	public WebElement getPhone() 
	{
		return phone;
	}
	public WebElement getOtherPhone()
	{
		return otherPhone;
	}
	public WebElement getEmail() 
	{
		return email;
	}
	public WebElement getBillingAddress() 
	{
		return billingAddress;
	}
	public WebElement getBillingState()
	{
		return billingState;
	}
	public WebElement getBillingCity() 
	{
		return billingCity;
	}
	public WebElement getSaveButton()
	{
		return saveButton;
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param organizationName
	 * @param website
	 * @param employees
	 */
	public void CreateNewOrganizationPage(String organizationName,String website,String employees)
	{
		getOrganizationName().sendKeys(organizationName);
		getWebsite().sendKeys(website);
		getEmployees().sendKeys(employees);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param organizationName
	 * @param website
	 * @param employees
	 * @param phone
	 * @param otherPhone
	 * @param email
	 */
	public void CreateNewOrganizationPage(String organizationName,String website,String employees,String phone,String otherPhone,String email)
	{
		getOrganizationName().sendKeys(organizationName);
		getWebsite().sendKeys(website);
		getEmployees().sendKeys(employees);
		getPhone().sendKeys(phone);
		getOtherPhone().sendKeys(otherPhone);
		getEmail().sendKeys(email);
		getSaveButton().click();
    }
	/**
	 * This is a business library to create a new lead
	 * @param organizationName
	 * @param website
	 * @param billingAddress
	 * @param billingState
	 * @param billingCity
	 */
	
	public void CreateNewOrganizationPage(String organizationName,String website,String billingAddress,String billingState,String billingCity)

	{
	getOrganizationName().sendKeys(organizationName);
	getWebsite().sendKeys(website);
	getBillingAddress().sendKeys(billingAddress);
	getBillingState().sendKeys(billingState);
	getBillingCity().sendKeys(billingCity);
	getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new organization
	 * @param organizationName
	 * @param website
	 * @param employees
	 * @param phone
	 * @param otherPhone
	 * @param email
	 * @param billingAddress
	 * @param billingState
	 * @param billingCity
	 */
	public void CreateNewOrganizationPage(String organizationName,String website,String employees,String phone,String otherPhone,String email,String billingAddress,String billingState,String billingCity)

	{
		getOrganizationName().sendKeys(organizationName);
		getWebsite().sendKeys(website);
		getEmployees().sendKeys(employees);
		getPhone().sendKeys(phone);
		getOtherPhone().sendKeys(otherPhone);
		getEmail().sendKeys(email);
		getBillingAddress().sendKeys(billingAddress);
		getBillingState().sendKeys(billingState);
		getBillingCity().sendKeys(billingCity);
		getSaveButton().click();
    }
}









