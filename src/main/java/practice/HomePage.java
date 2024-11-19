package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']")
	private WebElement leadsMenu;
	
	@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']")
	private WebElement organizationsMenu;
	
	@FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']")
	private WebElement contactsMenu;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountIcon;
	
	@FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")
	private WebElement signOut;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getOrganizationsMenu() {
		return organizationsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountIcon() {
		return accountIcon;
	}

	public WebElement getSignOut() {
		return signOut;
	}
	
	public void ClickonLeadsMenu() {
		getLeadsMenu().click();
	}
	 
	public void ClickonorganizationsMenu() {
		getOrganizationsMenu().click();
	}
	
	public void ClickonContactsMenu() {
		getContactsMenu().click();
	}
	
	public void ClickonAccountIcon() {
		getAccountIcon().click();
	}
	
	public void ClickonSignOut(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(getAccountIcon()).perform();
		getSignOut().click();
	}
	
	}

	


