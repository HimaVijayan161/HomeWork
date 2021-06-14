package com.wallethub.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wallethub.base.Base;
import com.wallethub.page.WalletHubHomePage;
import com.wallethub.page.WalletHubLoginPage;

import junit.framework.Assert;

public class WalletHubHomePageTest extends Base
{

	WalletHubHomePage walletHubHomePage;
	
	WalletHubLoginPage walletHubLoginPage;
	
	@BeforeTest
	public void setUp()
	{
		initilization();
				
		walletHubLoginPage = new WalletHubLoginPage();
		
		walletHubHomePage=walletHubLoginPage.loginToWalletHub(prop.getProperty("user"), prop.getProperty("pass"));
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitle()
	{
		Assert.assertEquals(walletHubHomePage.walletHubHomePageTitle(),"Test Insurance Company");
		System.out.println("assert successful");
	}
	
	@Test(dependsOnMethods = {"verifyHomePageTitle"})
	public void clickOnStars()
	{
		walletHubHomePage.clickOnStarForReviews(4);
	}
	
/*	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}*/
}
