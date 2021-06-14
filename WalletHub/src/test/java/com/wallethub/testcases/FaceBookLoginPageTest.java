package com.wallethub.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wallethub.base.Base;
import com.wallethub.page.FaceBookHomePage;
import com.wallethub.page.FaceBookLoginPage;
import com.wallethub.util.WalletUtils;

public class FaceBookLoginPageTest extends Base
{
	FaceBookLoginPage faceBookLoginPage;
	
	FaceBookHomePage homePage;
	
	String sheetName="contacts";
	
	@BeforeTest
	public void setUp()
	{
		initilization();
		
		faceBookLoginPage = new FaceBookLoginPage();
	}

	
	@DataProvider
	public Object[][] getDataFromExcel()
	{
		Object[][]o= WalletUtils.getTestDataFromExcel(sheetName);
		return o;
	}
	
	@Test(priority=1, dataProvider="getDataFromExcel")
	public void facebookLoginTest(String userName,String passWord)
	{
		homePage = faceBookLoginPage.login(userName,passWord);

		//homePage = faceBookLoginPage.login(prop.getProperty("user"), prop.getProperty("pass"));
	}
	
	@Test(dependsOnMethods = {"facebookLoginTest"})
	public void verifyFacebookTitleTest()
	{
		Assert.assertEquals(faceBookLoginPage.getLoginPageTitle(), "Facebook");
	}
	
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
}
