package com.wallethub.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.wallethub.base.Base;
import com.wallethub.util.WalletUtils;

/**
 * Used to verify and perform actions on the facebook home page
 * Contains all the elements to post an update 
 * @author himavijayan
 *
 */
public class FaceBookHomePage extends Base 
{
	
	@FindBy(xpath="//a[@aria-label='Facebook']")
	private WebElement userNameLabel;
	
	@FindBy(xpath="//span[contains(text(),'mind')]")
	private WebElement clickCreatePost;
	
	@FindBy(xpath="(//form[@method='POST'])[last()]")
	private WebElement popupWindow;
	
	@FindBy(xpath="//div[@contenteditable='true']")
	private WebElement writeStatus;
	
	@FindBy(xpath="//div[@aria-label='Post']")
	private WebElement postStatus;
	
	@FindBy(xpath="//a[@aria-label='Home']/span")
	private WebElement logo;
	
	@FindAll(@FindBy(xpath="//div[@dir='auto']/descendant::*"))
	private List<WebElement> posts;
	
	public FaceBookHomePage()
	{
		PageFactory.initElements(driver, this);
		
		wait.until(WalletUtils.pageLoadCondition);

	}
	
	/**
	 * used to create a post for a user
	 * @param update
	 */
	public void postAnUpdate(String update)
	{
		wait.until(ExpectedConditions.elementToBeClickable(clickCreatePost));
		clickCreatePost.click();
		wait.until(ExpectedConditions.visibilityOf(writeStatus));
		writeStatus.sendKeys(update);
		postStatus.click();
	}
	
	/**
	 * used to check the status message posted
	 * @param status
	 * @return
	 */
	public String checkStatusPosted(String status)
	{
			return driver.findElement(By.xpath("//div[@dir='auto']/descendant::*[text()='"+status+"']")).getText();
	}
	
	/**
	 * used to click on the home logo
	 */
	public void clickOnLogo()
	{
		wait.until(ExpectedConditions.elementToBeClickable(logo));
		logo.click();
	}
}
