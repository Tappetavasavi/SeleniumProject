package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer {
    int count=1;
    int retryCount=3;             //manual analysis
	public boolean retry(ITestResult result) {
		while(count<=retryCount)                  //1<=3,2<=3,3<=3,4<=3
		{
			count++;
			return true;
		}
		return false;
	}
	

}
