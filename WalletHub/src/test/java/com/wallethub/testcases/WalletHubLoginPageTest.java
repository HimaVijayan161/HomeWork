package com.wallethub.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wallethub.base.Base;
import com.wallethub.page.WalletHubLoginPage;

import junit.framework.Assert;

public class WalletHubLoginPageTest extends Base 
{
	WalletHubLoginPage walletHubLoginPage;
	
	@BeforeMethod
	public void setUp()
	{
		initilization();
		
		walletHubLoginPage = new WalletHubLoginPage();
		
	}

	@Test
	public void testLogin()
	{
		walletHubLoginPage.loginToWalletHub(prop.getProperty("user"), prop.getProperty("pass"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
