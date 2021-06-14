package com.qa.factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserDriverFactory 
{
	WebDriver driver;
	
	public WebDriver initDriverBasedOnBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\tejjethv\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				driver= new ChromeDriver();
		}
		
		if(browserName.equalsIgnoreCase("mozilla"))
				driver=new FirefoxDriver();
		
		if(browserName.equalsIgnoreCase("explorer"))
				driver= new InternetExplorerDriver();
		
		return driver;
	}
}
