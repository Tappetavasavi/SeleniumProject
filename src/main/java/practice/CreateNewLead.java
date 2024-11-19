package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLead {
	/**
	 * This is a Creating New Lead Page POM Class
	 * @author vasavi
	 * @version 24.10,25
	 */

	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FirstName;
     
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement Lastname;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement Company;
	
	@FindBy(xpath="//input[@id='designation']")
	private WebElement Title;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement Phone;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement Mobile;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement NoOfEmployees;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement Street;
	
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement poBox;
	
	@FindBy(xpath="//input[@name='code']")
	private WebElement PostalCode;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement City;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement Country;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement State;
	
	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement SaveButton;

	public CreateNewLead(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getCompany() {
		return Company;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getPhone() {
		return Phone;
	}

	public WebElement getMobile() {
		return Mobile;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getNoOfEmployees() {
		return NoOfEmployees;
	}

	public WebElement getStreet() {
		return Street;
	}

	public WebElement getPoBox() {
		return poBox;
	}

	public WebElement getPostalCode() {
		return PostalCode;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public void createNewLead(String fname,String lname,String company)
	{
		getFirstName().sendKeys(fname);
		getLastname().sendKeys(lname);
		getCompany().sendKeys(company);
		getSaveButton().click();
	}
	/**
	 * This is a business library to create a new lead
	 * @param fname
	 * @param lname
	 * @param company
	 * @param title
	 * @param phone
	 * @param mobile
	 * @param email
	 * @param NoOfEmp
	 * @param street
	 * @param poBox
	 * @param postalCode
	 * @param city
	 * @param country
	 * @param state
	 */
	public void createNewLead(String fname,String lname,String company,String title,String phone,String mobile,String email,String noOfEmp,String street,String poBox,String postalCode,String city,String country,String state)
	  {
		getFirstName().sendKeys(fname);
		getLastname().sendKeys(lname);
		getCompany().sendKeys(company);
		getTitle().sendKeys(title);
		getPhone().sendKeys(phone);
		getMobile().sendKeys(mobile);
		getEmail().sendKeys(email);
		getNoOfEmployees().sendKeys(noOfEmp);
		getStreet().sendKeys(street);
		getPoBox().sendKeys(poBox);
		getPostalCode().sendKeys(postalCode);
		getCity().sendKeys(city);
		getCountry().sendKeys(country);
		getState().sendKeys(state);
		getSaveButton().click();
		
	  }
	/**
	 * This is a business library to create a new lead
	 * @param fname
	 * @param lname
	 * @param company
	 * @param title
	 * @param phone
	 * @param mobile
	 * @param Phone
	 * @param email
	 * @param noOfEmp
	 */
	public void createNewLead(String fname,String lname,String company,String title,String mobile,String phone,String email,String noOfEmp)
	 {

		getFirstName().sendKeys(fname);
		getLastname().sendKeys(lname);
		getCompany().sendKeys(company);
		getTitle().sendKeys(title);
		getPhone().sendKeys(mobile);
		getMobile().sendKeys(phone);
		getEmail().sendKeys(email);
		getNoOfEmployees().sendKeys(noOfEmp);
		getSaveButton().click();
		
	 }
	/**
	 * This is a business library to create a new lead
	 * @param fname
	 * @param lname
	 * @param company
	 * @param street
	 * @param postalcode
	 * @param country
	 * @param poBox
	 * @param city
	 * @param state
	 */
	public void createNewLead(String fname,String lname,String company,String street,String postalcode,String poBox,String city,String country,String state)
	{
		
		getFirstName().sendKeys(fname);
		getLastname().sendKeys(lname);
		getCompany().sendKeys(company);
		getStreet().sendKeys(street);
		getPostalCode().sendKeys(postalcode);
		getPoBox().sendKeys(poBox);
		getCity().sendKeys(city);
		getCountry().sendKeys(country);
		getState().sendKeys(state);
		getSaveButton().click();
     }
}
	
	
	

	


