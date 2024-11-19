package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeretryAnalizer {
   @Test(retryAnalyzer=genericUtility.RetryAnalyzerImplementation.class)
   
	//   @Test(invocationCount=3)
	   public void Sample()
	   {
		  Assert.fail();
		  System.out.println("Hi");
	   }
   }

