package com.learn.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learn.Base.BaseClass;
import com.learn.DataReader.ReadProperty;
import com.learn.Pages.HomePage;
import com.learn.Pages.LoginPage;

public class HomeTest extends BaseClass{

	@Test
	public void SignOut() throws IOException
	{
		LoginPage login=new LoginPage(driver);
		login.signIn(ReadProperty.readProp("username"),ReadProperty.readProp("password"));
		HomePage home=new HomePage(driver);
		boolean stst=home.manageIsDisplayed();
		Assert.assertTrue(stst);
		home.SignOut();
	}
	
	
}
