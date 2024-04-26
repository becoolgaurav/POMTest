package com.learn.setUp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Reporter;

import com.learn.DataReader.ReadProperty;

public class SetUp {

	public static WebDriver driver;
	
	public static WebDriver mySetUp(String browser,String Url) throws IOException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}else
		{
			Reporter.log("Please enter a valid browser name", true);
		}
		String s=ReadProperty.readProp("implicitwait");
		long l=Long.parseLong(s);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(l));
		driver.manage().window().maximize();
		driver.get(Url);
		return driver;
		
	}
}
