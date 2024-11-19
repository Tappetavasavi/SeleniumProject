package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility {

	//public static void main(String[] args) {
	//WebDriver driver=new ChromeDriver();
	public void implicitWait(WebDriver driver,int maxTime)
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( maxTime));
	}
	public void Alertaccept(WebDriver driver,int maxTime)
	{
		driver.switchTo().alert().accept();
	}
	public void Alertdismiss(WebDriver driver,int maxTime)
	{
		driver.switchTo().alert().dismiss();
	}
	public void AlertgetText(WebDriver driver,int maxTime)
	{
		driver.switchTo().alert().getText();
	}
	public void AlertsendKeys(WebDriver driver,int maxTime)
	{
		driver.switchTo().alert().sendKeys(null);
	}
	public void selectByIndex(WebDriver driver,int maxTime)
	{
		WebElement dropdown=driver.findElement(By.xpath(""));
		Select s=new Select(dropdown);
		s.selectByIndex(maxTime);
	}
	public void selectByValue(WebDriver driver,String maxTime)
	{
		WebElement dropdown=driver.findElement(By.xpath(""));
		Select s=new Select(dropdown);
		s.selectByValue(maxTime);
	}
	public void selectByVisibleText(WebDriver driver,String maxTime)
	{
		WebElement dropdown=driver.findElement(By.xpath(""));
		Select s=new Select(dropdown);
		s.selectByVisibleText(maxTime);
	}
	public void deselectByIndex(WebDriver driver,int maxTime)
	{
		WebElement dropdown=driver.findElement(By.xpath(""));
		Select s=new Select(dropdown);
		s.deselectByIndex(maxTime);
	}
	public void deselectByvalue(WebDriver driver,String maxTime)
	{
		WebElement dropdown=driver.findElement(By.xpath(""));
		Select s=new Select(dropdown);
		s.deselectByValue(maxTime);
	}
	public void deselectByVisibleText(WebDriver driver,int maxTime)
	{
		WebElement dropdown=driver.findElement(By.xpath(""));
		Select s=new Select(dropdown);
		s.deselectByIndex(maxTime);
	}
	public void deselectAll(WebDriver driver,int maxTime)
	{
		WebElement dropdown=driver.findElement(By.xpath(""));
		Select s=new Select(dropdown);
		s.deselectAll();
	}
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void navigateToUrl(WebDriver driver, String Url) 
	{
		driver.get(Url);
		
	}
   public void Frame(WebDriver driver)
   {
	   driver.switchTo().frame(0); 
   }
   public void Frame1(WebDriver driver)
   {
	   driver.switchTo().frame("");
   }
   public void Frame2(WebDriver driver)
   {
	   driver.switchTo().frame("");
	   
   }
   public void getWindowHandle(WebDriver driver)
   {
	   driver.getWindowHandle(); 
   }
   public void getWindowHandles(WebDriver driver)
   {
	   driver.getWindowHandles();
	   
   }
  public String captureScreenshot(WebDriver  driver, String screenshotName) throws Exception {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File f=new File(".\\TakeScreenShots\"  .png");
	Files.copy(src, f);
	return f.getAbsolutePath();
	
	
}

   
}


