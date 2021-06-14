package com.wallethub.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wallethub.base.Base;
import com.wallethub.util.WalletUtils;

/**
 * Used to login to the wallethub account
 * @author himavijayan
 *
 */
public class WalletHubLoginPage extends Base
{
/*	@FindBy(xpath="//a[@class='login']")
	WebElement loginButton;*/
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//input[@type='text' and @placeholder='Email Address']")
	private WebElement emailAddress;
	
	@FindBy(xpath="//input[@type='password' and @placeholder='Password']")
	private WebElement passWord;
	
	@FindBy(xpath="//*[text()='Login']/parent::*[@type='button']")
	private WebElement login;
	
	public WalletHubLoginPage()
	{
		PageFactory.initElements(driver, this);
		
		WalletUtils.sleep(3000);

	}
	
	/**
	 * used to login into wallethub account
	 * @param username
	 * @param password
	 * @return
	 */
	public WalletHubHomePage loginToWalletHub(String username,String password)
	{
		loginButton.click();
		
		emailAddress.clear();
		emailAddress.sendKeys(username);
		
		passWord.clear();
		passWord.sendKeys(password);
		
		login.click();
		
		/*WebElement title=driver.findElement(By.xpath("//h1[@class='profile-name']"));
		wait.until(ExpectedConditions.visibilityOf(title));
		       // wait.until(d -> ((JavascriptExecutor) d).executeScript("return document.readyState !== 'loading'"));
*/		
		return new WalletHubHomePage();
	}

}
