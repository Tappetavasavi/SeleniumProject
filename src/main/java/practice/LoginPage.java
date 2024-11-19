package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
@FindBy(xpath="//input[@type='text']")
private WebElement usernameTextField;

@FindBy(xpath="//input[@type='password']")
private WebElement passwordTextField;

@FindBy(xpath="//input[@type='submit']")
private WebElement LoginButton;

public  LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public WebElement getUsernameTextField()
{
	return usernameTextField;
}
public WebElement getPasswordTextField()
{
	return passwordTextField;
}
public WebElement getLoginButton()
{
	return LoginButton;
}
public void LoginToApplication(String userName,String passWord)
{
	 getUsernameTextField().sendKeys(userName);
	 getPasswordTextField().sendKeys(passWord);
	 getLoginButton().click();
}

	
}


