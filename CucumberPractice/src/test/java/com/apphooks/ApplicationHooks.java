package com.apphooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.factory.DriverFactory;
import com.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks 
{
	private ConfigReader configReader;
	
	private DriverFactory driverFactory;
	
	private WebDriver webDriver;
	
	private Properties prop;

	@Before(order=0)
	public void loadPropertyFile()
	{
		configReader = new ConfigReader();
		prop=configReader.initializePropertyFile();
	}
	
	@Before(order=1)
	public void loadDriver()
	{
		driverFactory= new DriverFactory();
		webDriver=driverFactory.initializeDriver(prop.getProperty("browser"));
	}
	
	@After(order=0)
	public void quitDirver()
	{
		webDriver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
			
	}
}
