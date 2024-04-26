package com.learn.reports;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.learn.Base.BaseClass;


public class Listner extends BaseClass implements ITestListener{

	ExtentTest extent;
	ExtentReports extentreport=new ExtentReports();
	
	public void onTestSuccess(ITestResult result) {
		   
		   extent.pass("Test Case passed");
//		    Reporter.log( result.getInstanceName(), true);
//		    Reporter.log( result.getMethod().getMethodName(), true);
//		    Reporter.log( ""+result.getStatus(), true);
		   
		  }

		public void onTestFailure(ITestResult result) {
		    // not implemented
			
//			WebDriver driver=Browserfactory.getDriver();
//			String cap=Helper.captureScreenshot(driver);
			//extent.fail("Test Case failed"+result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromBase64String(cap).build());
			
			extent.fail("Test Case failed"+result.getThrowable().getMessage());
			Reporter.log( result.getInstanceName(), true);
		    Reporter.log( result.getMethod().getMethodName(), true);
		    Reporter.log( ""+result.getStatus(), true);
		    Reporter.log( result.getThrowable().getMessage(), true);
		    
		  }
		
		public void onTestStart(ITestResult result) {
		    // not implemented
			
		    extent =extentreport.createTest(result.getMethod().getMethodName());
		  }
		
		public void onFinish(ITestContext context) {
		    // not implemented
			Reporter.log( "Test finihed", true);
		   // Reporter.log( result.getMethod().getMethodName(), true);
			extentreport.flush();
		  }
		
}
