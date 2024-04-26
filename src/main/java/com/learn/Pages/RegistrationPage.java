package com.learn.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.learn.utils.Utils;



public class RegistrationPage {
	
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By name=By.xpath("//input[@name='name']");
	private By email=By.xpath("//input[@name='email']");
	private By pass=By.xpath("//input[@name='password']");
	private By interest=By.xpath("//input[@type='checkbox']");
	private By gender=By.xpath("//input[@value='Male']");
	private By state=By.xpath("//select[@name='state']");
	private By hobby=By.xpath("//select[@name='hobbies']");
	private By submit=By.xpath("//button[@class='submit-btn']");
	
	public void register(String uname,String eemail,String ppass,String estate,String Hobby)
	{
		//WebElement e=driver.findElement(name);
		WebElement e7=Utils.Wait(driver, name);
		driver.findElement(name).sendKeys(uname);
		driver.findElement(email).sendKeys(eemail);
		driver.findElement(pass).sendKeys(ppass);
		driver.findElement(interest).click();
		driver.findElement(gender).click();
		WebElement e5=driver.findElement(state);
		WebElement e2=driver.findElement(hobby);
//		Helper.select(e5, estate);
//		Helper.select(e2, Hobby);
		e5.sendKeys(estate);
		e2.sendKeys(Hobby);
		driver.findElement(submit).click();		
		
	}
}
