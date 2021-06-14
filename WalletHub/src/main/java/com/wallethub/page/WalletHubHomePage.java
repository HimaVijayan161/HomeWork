package com.wallethub.page;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.wallethub.base.Base;
import com.wallethub.util.WalletUtils;

public class WalletHubHomePage extends Base 
{
	/**
	 * Used to perform actions on Home Page screen
	 * @author himavijayan
	 */
	
	@FindBy(xpath="//h1[@class='profile-name']")
	private WebElement title;

	@FindAll(@FindBy(xpath="//div[@class='rv review-action ng-enter-element']/descendant::*[name()='svg']"))
	private List<WebElement> stars;
	
	public WalletHubHomePage() 
	{
		wait.until(WalletUtils.pageLoadCondition);
		
		PageFactory.initElements(driver, this);
		
		WalletUtils.sleep(10000); 
	}
	
	/**
	 * used to verify the title of the homePage
	 * @return
	 */
	public String walletHubHomePageTitle()
	{
		/*wait.until(ExpectedConditions.visibilityOf(title));
		title=driver.findElement(By.xpath("//h1[@class='profile-name']"));*/
		System.out.println(title.getText());
		return title.getText();
	}
	
	/**
	 * Used to click on the stars to add reviews later
	 * @param noOfStars
	 * @return
	 */
	public WalletHubAddCommentPage clickOnStarForReviews(int noOfStars)
	{
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();

		Iterator<WebElement> starsIterator = stars.iterator();
		
		int count=1;
		while(starsIterator.hasNext())
		{
			WebElement e = starsIterator.next();
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(e)));
			
			if(count==noOfStars)
			{
		    	action.moveToElement(e).build().perform();
		    	e.click();
		    	break;
			}
			else
			{
				action.moveToElement(e).build().perform();
				count++;
			}
	    	/*JavascriptExecutor js = (JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].scrollIntoView;", e);	
	    	*/
	    	
		}
		
		/*
		 * for(int i=0;i<noOfStars;i++) { if(i!=noOfStars-1) {
		 * wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(stars
		 * .get(i)))); action.moveToElement(stars.get(i)).perform(); try {
		 * Thread.sleep(4000); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } } else
		 * action.moveToElement(stars.get(i)).clickAndHold().build().perform();
		 * 
		 * }
		 */
		return new WalletHubAddCommentPage();
		
	}
}
	

