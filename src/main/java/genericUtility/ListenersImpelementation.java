package genericUtility;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImpelementation implements ITestListener{
	
        ExtentReports report;
		ExtentTest test;
		JavaUtility ju=new JavaUtility();
		String dateTimeStamp=ju.getCalenderDetails("dd-MM-YYYY hh-mm-ss");
		
		
		public void onTestStart(ITestResult result) {
			String methodname=result.getMethod().getMethodName();
			System.out.println(methodname+"execution started");
			  
			//create a test --->means it will create one testfield for every test script. like @TestScript
			test=report.createTest(methodname);
		}
			

		public void onTestSuccess(ITestResult result) {
		    String methodname=result.getMethod().getMethodName();
			System.out.println(methodname+"execution passed");
			
			test.log(Status.PASS,methodname+"execution passed");
		}

		public void onTestFailure(ITestResult result) {
			String methodName=result.getMethod().getMethodName();
			System.out.println(methodName+"execution failed");
			
			test.log(Status.FAIL,methodName+"execution failed");
			
			//capturing the screenshot on test script failed
			
			
			SeleniumUtility su = new SeleniumUtility();
			String screenshotName=methodName+dateTimeStamp;
			try {
				String path=su.captureScreenshot(BaseClass.sdriver, screenshotName);   //here throws exception is not working becouse this methods are ovveridenmethods so.
				test.addScreenCaptureFromPath(path);
			} 
			catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}

		public void onTestSkipped(ITestResult result) {
			String methodName=result.getMethod().getMethodName();
			System.out.println(methodName+"execution skipped");
			
			test.log(Status.SKIP,methodName+"execution skipped");
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}

		public void onTestFailedWithTimeout(ITestResult result) {
			
		}

		public void onStart(ITestContext context) {
			System.out.println("Suite execution Started");
			ExtentSparkReporter reporter=new ExtentSparkReporter(".\\ExtentReports\\Report"+dateTimeStamp+".html");
			reporter.config().setDocumentTitle("VTiger Testing Reports");
			reporter.config().setReportName("VTiger");
			reporter.config().setTheme(Theme.DARK);
			
			report=new ExtentReports();
			report.attachReporter(reporter);
			report.setSystemInfo("Base URL", "http://localhost:8888");
			report.setSystemInfo("Base OS", "Windows");
			report.setSystemInfo("Base Browser", "Chrome");
			report.setSystemInfo("Reporter Name", "Vasavi");
			
			
			
		}

		public void onFinish(ITestContext context) {
			System.out.println("Suite execution Finished");
			report.flush();
			
		}

    
    
} 
    

