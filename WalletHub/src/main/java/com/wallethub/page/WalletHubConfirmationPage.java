package com.wallethub.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wallethub.base.Base;
import com.wallethub.util.WalletUtils;

/**
 * This class is used to check the elements on the confirmation page
 * @author himavijayan
 *
 */
public class WalletHubConfirmationPage extends Base
{
	@FindBy(xpath="//*[contains(@class,'rvc-edit link')]")
	private WebElement message;
	
	@FindBy(xpath="//*[@class='brgm-button brgm-user brgm-list-box']")
	private WebElement userName;
	
	
	public WalletHubConfirmationPage() 
	{
		PageFactory.initElements(driver, this);
		
		WalletUtils.sleep(3000);
	}
	
	public String getReviewMessage()
	{
		return message.getText();
	}
	
	/**
	 * click on profile and then check the message
	 * @return
	 */
	public WalletHubProfilePage clickOnProfile()
	{
		Actions act= new Actions(driver);
		
		act.moveToElement(userName).build().perform();
		userName.click();
		WebElement profile = driver.findElement(By.xpath("//*[@class='brgm-list-it'][text()='Profile']"));
		act.moveToElement(profile).build().perform();
		profile.click();
		
		return new WalletHubProfilePage();
	}
	
}
