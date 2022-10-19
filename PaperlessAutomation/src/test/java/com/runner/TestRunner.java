package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\Lenovo\\srinivas automations labs\\PaperlessAutomation\\src\\main\\resources\\feature\\login.feature",
		glue = {"com.stepdefinitions"},
		plugin = { "pretty", 
				 
				"html:target/cucumber-reports/cucumber-pretty.html",
				"json:target/cucumber-reports/CucumberTestReport.json", 
				 "rerun:target/cucumber-reports/rerun.txt" }
		)
public class TestRunner {

}
