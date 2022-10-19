package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "username")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath  = "//button[@type='submit']")
	WebElement signIn;
	
	
	
	
	public void enterEmailID(String username)
	{
		email.sendKeys(username);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void signInClick()
	{
		signIn.click();
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
		
	}
}
