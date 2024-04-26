package com.learn.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learn.Base.BaseClass;
import com.learn.DataReader.ReadProperty;
import com.learn.Pages.LoginPage;

public class LoginTest extends BaseClass {
	
	

	@Test
	public void Login() throws IOException
	{
		
		LoginPage login=new LoginPage(driver);
		login.signIn(ReadProperty.readProp("username"),ReadProperty.readProp("password"));
		boolean statu=login.getTitle("Learn Automation");
		Assert.assertTrue(statu, "Title is incorrect");
	}
}
