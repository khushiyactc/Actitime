package com.ActiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ActiTime.generics.BasePage;

public class ActitimeHomePage extends BasePage {
	public WebDriver driver;

	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath = "//div[@class='logoSwitcherText']")
	private WebElement actiplans;
	
	@FindBy(id = "container_tt")
	private WebElement timetrack;	
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement task;
	
	@FindBy(id="container_reports")
	private WebElement report;
	
	@FindBy(xpath = "//a[@class='content users']")
	private WebElement user;
	
	@FindBy(xpath = "//div[@class='popup_menu_button popup_menu_button_calendar']")
	private WebElement calender;
	
	@FindBy(xpath = "//div[@class='popup_menu_button popup_menu_button_settings ']")
	private WebElement settings;
	
	@FindBy(xpath = "//div[@class='popup_menu_button popup_menu_button_addons']")	
	private WebElement addons;
	
	@FindBy(xpath = "//div[@class='popup_menu_button popup_menu_button_support']")
	private WebElement support;
	
	@FindBy(xpath = "//div[@class='popup_menu_button popup_menu_button_tips']")
	private WebElement tips;
	
	@FindBy(xpath = "//a[@class='userProfileLink username ']")
	private WebElement johndoe;
	
	@FindBy(xpath = "//div[@class='supportQuestionButton']")
	private WebElement button;

	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void logoutMethod() throws InterruptedException
	{
		visibilityOfElement(driver, logoutLink);
		javascriptHighlight(driver, logoutLink);
		javascriptClick(driver, logoutLink);
	}
	public void plans() throws InterruptedException {
		visibilityOfElement(driver, actiplans);
		javascriptHighlight(driver, actiplans);
		javascriptClick(driver, actiplans);
	}
	

	public void track() throws InterruptedException {
		visibilityOfElement(driver, timetrack);
		javascriptHighlight(driver, actiplans);
		javascriptClick(driver, actiplans);
	}
	public void task() throws InterruptedException {
		visibilityOfElement(driver, task);
		javascriptHighlight(driver, actiplans);
		javascriptClick(driver, actiplans);
	}
	public void report() throws InterruptedException {
		visibilityOfElement(driver, report);
		javascriptHighlight(driver, actiplans);
		javascriptClick(driver, actiplans);
	}
	public void user() throws InterruptedException {
		visibilityOfElement(driver, user);
		javascriptHighlight(driver, actiplans);
		javascriptClick(driver, actiplans);
	}
	public void calander() throws InterruptedException {
		visibilityOfElement(driver, calender);
		javascriptHighlight(driver, actiplans);
		javascriptClick(driver, actiplans);
	}
	public void settings() throws InterruptedException {
		visibilityOfElement(driver, settings);
		javascriptHighlight(driver, actiplans);
		javascriptClick(driver, actiplans);
	}
	public void addons() throws InterruptedException {
		visibilityOfElement(driver, addons);
        javascriptHighlight(driver, actiplans);
		javascriptClick(driver, actiplans);
	}
	public void supports () throws InterruptedException {
		visibilityOfElement(driver, support);
		javascriptHighlight(driver, actiplans);
		javascriptClick(driver, actiplans);
	}
	public void tips() throws InterruptedException {
		visibilityOfElement(driver, tips);
		javascriptHighlight(driver, actiplans);
		javascriptClick(driver, actiplans);
	}
	public void johndeo() throws InterruptedException {
		visibilityOfElement(driver, johndoe);
		javascriptHighlight(driver, actiplans);
		javascriptClick(driver, actiplans);
	}
    public void button() throws InterruptedException {
    	visibilityOfElement(driver, button);
    	javascriptHighlight(driver, actiplans);
    	javascriptClick(driver, actiplans);
	}
}
