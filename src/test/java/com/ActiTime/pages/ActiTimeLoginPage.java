package com.ActiTime.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiTime.generics.AutoConstants;
import com.ActiTime.generics.BasePage;

import com.ActiTime.generics.ExcelLibrary;

public class ActiTimeLoginPage extends BasePage implements AutoConstants{


public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement usernameTextfield;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	
	public ActiTimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException, InterruptedException
	{
		visibilityOfElement(driver, usernameTextfield);
		javascriptHighlight(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getcellValue(login_data_sheetname,1,0));
		
		visibilityOfElement(driver, passwordTextfield);
		javascriptHighlight(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getcellValue(login_data_sheetname,1,1));
		
		visibilityOfElement(driver, keepmeloggedinCheckbox);
		javascriptHighlight(driver, keepmeloggedinCheckbox);
		javascriptClick(driver, keepmeloggedinCheckbox);
		
		visibilityOfElement(driver, loginButton);
		javascriptHighlight(driver, loginButton);
		javascriptClick(driver, loginButton);
		
		
	}
}
