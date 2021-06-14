package com.wallethub.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wallethub.base.Base;
import com.wallethub.page.WalletHubAddCommentPage;
import com.wallethub.page.WalletHubConfirmationPage;
import com.wallethub.page.WalletHubHomePage;
import com.wallethub.page.WalletHubLoginPage;

public class WalletHubAddCommentPageTest extends Base
{
	
	WalletHubLoginPage walletHubLoginPage;

	WalletHubHomePage walletHubHomePage;
	
	WalletHubAddCommentPage addCommentPage;
	
	WalletHubConfirmationPage confirmationPage;



	@BeforeTest
	public void setUp()
	{
		initilization();
		
		walletHubLoginPage= new WalletHubLoginPage();
		
		walletHubHomePage=walletHubLoginPage.loginToWalletHub(prop.getProperty("user"), prop.getProperty("pass"));
	}
	
	
	@Test(dependsOnMethods = {"verifyHomePageTitle"})
	public void tesAddComments()
	{
		addCommentPage=walletHubHomePage.clickOnStarForReviews(4);
		
		confirmationPage=addCommentPage.writeReview("Health Insurance","1235667YJNKFGNFLKGNKLCVNBKCNVBKNCBK'DFNBFBOOJGOSJGJO[SG[SGS[PGGPE[G[PSJG[\n"
				+ "PGJ[PEJG[WPEJG[PWJEGWEP[JG[PJG[PJG[PEWJGWJEGGJWEGOJEWOGJ");
	}
	
	@AfterTest
	public void teadDown()
	{
		driver.quit();
	}
}
