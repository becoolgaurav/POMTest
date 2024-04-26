package com.learn.Tests;

import org.testng.annotations.Test;

import com.learn.Base.BaseClass;
import com.learn.DataReader.ProvideData;

import com.learn.Pages.LoginPage;
import com.learn.Pages.RegistrationPage;

public class RegisterationTest extends BaseClass{
	
	@Test(dataProvider = "TestData1",dataProviderClass = ProvideData.class)
	public void registerUser(String nmae,String mail,String pass,String state,String hobb) throws InterruptedException
	{
	LoginPage login=new LoginPage(driver);
	RegistrationPage register=new RegistrationPage(driver);
	//Thread.sleep(5000);
	register=login.clickSignUp();
	register.register(nmae,mail,pass,state,hobb);
	}
}
