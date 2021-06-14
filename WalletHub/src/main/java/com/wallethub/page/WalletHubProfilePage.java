package com.wallethub.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wallethub.base.Base;
import com.wallethub.util.WalletUtils;

public class WalletHubProfilePage extends Base
{

	/**
	 * used to check whether logged into the correct profile page or not.
	 */
	@FindBy(xpath="//h2[@class='pr-rec-title']")
	private WebElement title;
	
	
	public WalletHubProfilePage() 
	{
		PageFactory.initElements(driver, this);
		
		WalletUtils.sleep(3000);

	}
	
	public String getTitle()
	{
		return title.getText();
	}
}
