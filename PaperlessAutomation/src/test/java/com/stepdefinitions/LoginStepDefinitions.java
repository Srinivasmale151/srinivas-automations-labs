package com.stepdefinitions;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

import com.pages.LoginPage;
import co.basepage.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions extends BasePage {

	
	
	
	@Given("User visit the fit factory application")
	public void user_visit_the_fit_factory_application() throws IOException {
	    driver = initializeDriver(); 
	   Properties prop =readProperties();
	   driver.get(prop.getProperty("url"));
	   lp=new LoginPage(driver);
	}

	@Given("User enter {string} and {string}")
	public void user_enter_and(String username, String password) {
		lp.enterEmailID(username);
		lp.enterPassword(password);
	   
	}

	@Given("User click on sign in button")
	public void user_click_on_sign_in_button() {
	    lp.signInClick();
	}
	
	@Then("User logged into fit factory home page successfully.")
	public void user_logged_into_fit_factory_home_page_successfully() {
	   Assert.assertEquals(lp.getPageTitle(), "Fitfactory.com Test");
	}
}