package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"./src/test/resources/com/feature"},
		glue= {"com.stepdefinitions","com.apphooks"},
		plugin= {"pretty"},
		monochrome = true
		)
/*@CucumberOptions(
		
		features= {"/CucumberPractice/src/test/resources/com/feature"},
		glue= {"/CucumberPractice/src/test/java/com/stepdefinitions","/CucumberPractice/src/test/java/com/apphooks"},
		plugin= {"pretty"},
		monochrome = true
		)*/

public class TestRunner 
{


}
