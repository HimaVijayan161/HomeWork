package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory 
{		
		public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
		
		public WebDriver initializeDriver(String browser)
		{
			if(browser.equals("chrome")) 
			{
				WebDriverManager.chromedriver().setup();
				tldriver.set(new ChromeDriver());
			}
			else
				System.out.println("Please pass the browser name ");
			
			getDriver().manage().deleteAllCookies();
			getDriver().manage().window().maximize();
			return getDriver();
		}
		
		
		public static WebDriver getDriver()
		{
			return tldriver.get();
		}
	
}
