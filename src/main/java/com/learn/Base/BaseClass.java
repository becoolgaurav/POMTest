package com.learn.Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.learn.DataReader.ReadProperty;
import com.learn.setUp.SetUp;

public class BaseClass {
	
	public WebDriver driver;

	@BeforeClass
	public void startUp() throws IOException
	{
//		driver=new ChromeDriver();
//		driver.get("https://freelance-learn-automation.vercel.app/login");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		Reporter.log("starting the browser");
		driver=SetUp.mySetUp(ReadProperty.readProp("browser"), ReadProperty.readProp("url"));
	}
	
	
	@AfterClass
	public void end()
	{
		//driver.quit();
	}
}
