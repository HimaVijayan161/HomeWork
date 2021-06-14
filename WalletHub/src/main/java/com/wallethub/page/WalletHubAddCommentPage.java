package com.wallethub.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.wallethub.base.Base;
import com.wallethub.util.WalletUtils;

/**
 * 
 * @author himavijayan
 * this class is used to add comments & submit the review
 */
public class WalletHubAddCommentPage extends Base
{
	public WalletHubAddCommentPage() 
	{
		PageFactory.initElements(driver, this);
		
		WalletUtils.sleep(3000);
	}
	
	@FindBy(xpath="//h4[@class='wrev-prd-name']")
	private WebElement title;
	
	@FindBy(xpath="//*[contains(text(),'Select...')]")
	private WebElement dropDown;
	
	
	@FindBy(xpath="//*[text()='Back']")
	private WebElement back;
	
	@FindBy(xpath="//*[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//textarea[contains(@class,'input')]")
	private WebElement writeText;
	
	
	public String verifyTitle()
	{
		return title.getText();
	}
	
	//*This method is used to write some reviews and choose a value from the dropdown list
	public WalletHubConfirmationPage writeReview(String valueToBeSelected,String reviewMessage)
	{
		dropDown.click();
		List<WebElement> values=dropDown.findElements(By.xpath("parent::*/descendant::li"));
		
		for(WebElement ele:values)
		{
			if(ele.getText().trim().equals(valueToBeSelected))
			{
				ele.click();
				writeText.clear();
				writeText.sendKeys(reviewMessage);
				submit.click();
				break;
			}
		}
		
		return new WalletHubConfirmationPage();
	}
}
