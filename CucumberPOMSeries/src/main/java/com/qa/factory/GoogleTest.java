package com.qa.factory;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest 
{
	BrowserDriverFactory factory = new BrowserDriverFactory();
	
	WebDriver driver;
	
	WebDriverWait wait;
	
	@BeforeMethod
	public void startUp() 
	{
		driver=factory.initDriverBasedOnBrowser("chrome");
		
		wait = new WebDriverWait(driver, 6000);
		
		//System.setProperty("webdriver.chrome.driver", "/Users/Downloads/chromedriver/chromedriver.exe");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		//driver.get("https://www.google.com/");
		
		driver.get("https://www.nseindia.com/get-quotes/equity?symbol=RELIANCE");// gives invalid argument exception
		

	}
	
	@Test
	public void TestSearch()
	{
		/*driver.findElement(By.xpath(".//*[@class='gLFyf gsfi']")).sendKeys("cloning in java",Keys.ENTER);
		
		if(driver.findElements(By.xpath(".//*[contains(text(),'Web results')]"))!=null)
		{
			System.out.println("done");
		}*/
		
		
		WebElement corporateInformation = driver.findElement(By.xpath(".//h2[contains(text(),'Corporate Information')]/parent::*"));
		wait.until(ExpectedConditions.visibilityOf(corporateInformation));
		
		corporateInformation.click();
		
		List<WebElement> listWebElements=driver.findElements(By.xpath(".//ul[@class='nav nav-tabs nav-tabs--vertical nav-tabs--left']/descendant::a"));
		
		for(WebElement element:listWebElements)
			System.out.println(element.getAttribute("href"));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
