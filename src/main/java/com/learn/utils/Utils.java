package com.learn.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
	public static WebElement Wait(WebDriver driver,By ele)
	{
		WebElement ele1=driver.findElement(ele);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(10000));
		wait.until(ExpectedConditions.elementToBeClickable(ele1));
		return ele1;
	}

	
}
