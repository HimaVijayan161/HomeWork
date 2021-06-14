package com.wallethub.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wallethub.base.Base;
import com.wallethub.page.WalletHubAddCommentPage;
import com.wallethub.page.WalletHubConfirmationPage;
import com.wallethub.page.WalletHubProfilePage;
import com.wallethub.page.WalletHubHomePage;
import com.wallethub.page.WalletHubLoginPage;

public class WalletHubComfirmationPageTest extends Base
{
	
	WalletHubLoginPage walletHubLoginPage;

	WalletHubHomePage walletHubHomePage;
	
	WalletHubAddCommentPage addCommentPage;
	
	WalletHubConfirmationPage confirmationPage;
	
	WalletHubProfilePage profilePage;
	
	@BeforeTest
	public void setUp()
	{
		initilization();
				
		walletHubLoginPage = new WalletHubLoginPage();
		
		walletHubHomePage=walletHubLoginPage.loginToWalletHub(prop.getProperty("user"), prop.getProperty("pass"));
		
	}
	
	@Test
	public void testProfilePage()
	{
		addCommentPage=walletHubHomePage.clickOnStarForReviews(4);
		
		confirmationPage=addCommentPage.writeReview("Health Insurance","1235667YJNKFGNFLKGNKLCVNBKCNVBKNCBK'DFNBFBOOJGOSJGJO[SG[SGS[PGGPE[G[PSJG[\n"
				+ "PGJ[PEJG[WPEJG[PWJEGWEP[JG[PJG[PJG[PEWJGWJEGGJWEGOJEWOGJ");
		
		assertEquals(confirmationPage.getReviewMessage(), "Edit Review");
		
		profilePage=confirmationPage.clickOnProfile();
		
		assertEquals(profilePage.getTitle(),"himajethva's Recommendations");

		
	}
	
	
}
