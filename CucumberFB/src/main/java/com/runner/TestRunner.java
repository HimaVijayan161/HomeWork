package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="C:\\Hima\\Automation_Hima\\CucumberFB\\src\\main\\java\\com\\features\\PromotersEncumbranceDetails.feature",
				glue= {"/CucumberFB/src/main/java/com/stepDefinition"},
				plugin= {"pretty","html:test-outout"},
				monochrome=true,
				strict=false,
				dryRun=false
		)
public class TestRunner 
{

	
}
