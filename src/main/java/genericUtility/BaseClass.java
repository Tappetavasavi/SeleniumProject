package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


import practice.HomePage;
import practice.LoginPage;

public class BaseClass {
	public WebDriver driver; 
	public static WebDriver sdriver;     //its only for listeners class
	public SeleniumUtility sUtil=new SeleniumUtility();
	public PropertiesUtility pUtil=new PropertiesUtility();
	public ExcelUtility eUtil=new ExcelUtility();
	
	@BeforeSuite(alwaysRun = true)
	public void dbConnection()
	{
		System.out.println("DB connection created");
	}
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(@Optional("chrome") String BROWSER)throws Exception
	{
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		sdriver=driver; 
		sUtil.implicitWait(driver,20);
		sUtil.maximizeWindow(driver);
		String Url =pUtil.getDataFromPropertiesFile("Url");
		sUtil.navigateToUrl(driver,Url );
		System.out.println("Browser launched Successfully");
	}
	@BeforeMethod(alwaysRun=true)
	public void loginOperation()throws Exception
	{
		String UN=pUtil.getDataFromPropertiesFile("userName");
		String PWD=pUtil.getDataFromPropertiesFile("passWord");
		LoginPage lp=new LoginPage(driver);
		lp.LoginToApplication(UN,PWD);
		System.out.println("Sign out done successfully");
	}
	@AfterMethod(alwaysRun=true)
	public void logoutOperation()
	{

		HomePage hp=new HomePage(driver);
		hp.ClickonSignOut(driver);
		System.out.println("Signout done successfully");
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
		System.out.println("Browser closed successfully");
	}
	@AfterSuite
	public void closeDBConnection()
	{
		System.out.println("DB connection closed");
	}
}

