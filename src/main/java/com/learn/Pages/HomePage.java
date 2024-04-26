package com.learn.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.learn.utils.Utils;



public class HomePage {
	
WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By manage=By.xpath("//*[text()='Manage']");
	private By burgerButton=By.xpath("//img[@alt='menu']");
	private By signOut=By.xpath("//button[text()='Sign out']");
	
	public boolean manageIsDisplayed()
	{
		//WebElement el=driver.findElement(manage);
		WebElement e1=Utils.Wait(driver,manage);
		boolean sts=e1.isDisplayed();
		return sts;
	}
	
	public LoginPage SignOut()
	{
		driver.findElement(burgerButton).click();
		driver.findElement(signOut).click();
		LoginPage page=new LoginPage(driver);
		return page;
	}
	
}
