package com.stepDefinition;

import com.util.LoadConfigFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCompanySteps 
{
	LoadConfigFile loadConfig = new LoadConfigFile();

	public SearchCompanySteps() 
	{
		loadConfig.loadProperty(fileName)
	}

	
	
	@Given("^user enters the \"([^\"]*)\"$")
	public void user_enters_the(String arg1)  {
	   
		
	}

	@When("^title of the page is \"([^\"]*)\"$")
	public void title_of_the_page_is(String arg1)  {
	   
	   
	}

	@Then("^user searches for company name read from excel sheet \"([^\"]*)\"$")
	public void user_searches_for_company_name_read_from_excel_sheet(String arg1)  {
	   
	   
	}

	@Then("^user is able to see the tab \"([^\"]*)\" & click on it$")
	public void user_is_able_to_see_the_tab_click_on_it(String arg1)  {
	   
	   
	}
	
	
	
}
