package com.wallethub.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wallethub.base.Base;
import com.wallethub.util.WalletUtils;
/**
 * Used to login to facebook page.
 * This class contains all the elements required for logging into facebook page.
 * 
 * @author himavijayan
 *
 */
public class FaceBookLoginPage extends Base
{
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	public FaceBookLoginPage()
	{
		PageFactory.initElements(driver, this);
		WalletUtils.sleep(3000);
	}
	
	/**
	 * Used to login to facebook page
	 * @param uname
	 * @param pword
	 * @return
	 */
	public FaceBookHomePage login(String uname,String pword)
	{
		
		username.clear();
		username.sendKeys(uname);
		
		password.clear();
		password.sendKeys(pword);
		
		login.click();
		
		return new FaceBookHomePage();
	}

	/**
	 * fetches the login page title
	 * @return
	 */
	public String getLoginPageTitle(){
		return driver.getTitle();
	}
}
