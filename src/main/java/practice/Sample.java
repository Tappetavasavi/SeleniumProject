package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
         public static void main(String [] args) throws InterruptedException
         {
        	 WebDriver driver=new ChromeDriver();
        	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	 driver.get("https://www.flipkart.com/");
        	 Thread.sleep(2000);
        	 WebElement element=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
        	 Thread.sleep(2000);
        	 element.sendKeys("iphone11");
        	 Navigation nav=driver.navigate();
        	 nav.refresh();
        	 element.sendKeys("vivo");               //STALEELEMENTEXCEPTION//
         }
} 
