package com.learn.reports;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentRepor {

	public static ExtentReports  report()
	{
		File file=new File("C:/Selenium-Project/POMTest/ExtentReport/Automate.html");
		ExtentSparkReporter reporter=new ExtentSparkReporter(file);
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setDocumentTitle("Gaurav Automation Report");
		
		
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		
		return report;
	}
}
