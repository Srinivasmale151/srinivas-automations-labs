package com.stepdefinitions;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.pages.LoginPage;
import co.basepage.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions extends BasePage {

	
	Logger log = com.logger.LoggerHelper.getLogger(LoginStepDefinitions.class);
	
	@After
	public void after(Scenario scenario)
	{
		try {
				if (scenario.isFailed()) {
					
					log.info(scenario.getName()+ " is Failed");
					byte [] screenshot =	((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
					scenario.attach(screenshot, "image/png", "C:\\Users\\Lenovo\\srinivas automations labs\\PaperlessAutomation\\screenshot");
					}
				else
				{
					log.info(scenario.getName() + " is pass");
					byte [] screenshot =	((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
					scenario.attach(screenshot, "image/png", "C:\\Users\\Lenovo\\srinivas automations labs\\PaperlessAutomation\\screenshot");
					
				}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	@Given("User visit the fit factory application")
	public void user_visit_the_fit_factory_application() throws IOException {
	    driver = initializeDriver(); 
	   Properties prop =readProperties();
	   driver.get(prop.getProperty("url"));
	   lp=new LoginPage(driver);
	   
	}

	@Given("User enter {string} and {string}")
	public void user_enter_and(String username, String password) throws InterruptedException {
		Thread.sleep(5000);
		lp.Login(username, password);
		
		
	   
	}

	@Given("User click on sign in button")
	public void user_click_on_sign_in_button() {
	    lp.ClickLogin();
	}
	
	@Then("User logged into fit factory home page successfully.")
	public void user_logged_into_fit_factory_home_page_successfully() {
	 //  Assert.assertEquals(lp.getPageTitle(), "Fitfactory.com Test");
	}
}