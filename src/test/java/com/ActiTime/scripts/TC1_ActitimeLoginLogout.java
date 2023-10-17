package com.ActiTime.scripts;

import java.io.IOException;
import org.testng.annotations.Test;

import com.ActiTime.generics.BaseTest;
import com.ActiTime.pages.ActiTimeLoginPage;


public class TC1_ActitimeLoginLogout extends BaseTest
{
	@Test
	public void login() throws IOException, InterruptedException
	{
		ActiTimeLoginPage loginPage=new ActiTimeLoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test (dependsOnMethods = "login")
	public void logout() throws InterruptedException
	{
		com.ActiTime.pages.ActitimeHomePage homePage=new com.ActiTime.pages.ActitimeHomePage(driver);
		homePage.logoutMethod();
	}
}


