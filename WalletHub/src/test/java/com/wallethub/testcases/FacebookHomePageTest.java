package com.wallethub.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wallethub.base.Base;
import com.wallethub.page.FaceBookHomePage;
import com.wallethub.page.FaceBookLoginPage;
import com.wallethub.util.WalletUtils;

import junit.framework.Assert;

public class FacebookHomePageTest extends Base 
{
	FaceBookLoginPage faceBookLoginPage;
	
	FaceBookHomePage homePage;
	
	String sheetName = "contacts";

	
	@BeforeTest
	public void setUp()
	{
		initilization();
		
		faceBookLoginPage = new FaceBookLoginPage();
		
		homePage=faceBookLoginPage.login(prop.getProperty("user"), prop.getProperty("pass"));
		
	}
	
	
	@Test
	public void verifyPostAnUpdate()
	{
		homePage.clickOnLogo();
		
		homePage.postAnUpdate("Hello World");
		
		Assert.assertEquals(homePage.checkStatusPosted("Hello World"), "Hello World");;
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
