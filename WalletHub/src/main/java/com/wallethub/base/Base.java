package com.wallethub.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wallethub.util.WalletUtils;

/**
 * Used to load the drivers , property files.
 * @author hima vijayan
 *
 */
public class Base 
{

	public static WebDriver driver;
	
	public static Properties prop;
	
	public static WebDriverWait wait;
	
	//public static Wait<WebDriver> waitFluent ; 
	
	static Map<String, Object> prefs = new HashMap<String, Object>();

	static
	{
		prop = new Properties();
		
		try 
		{
			FileInputStream ip = new FileInputStream(WalletUtils.getPath("EnvConfigDirectory"));
			
			prop.load(ip);
			
			//System.out.println(prop);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public static void initilization()
	{
		String browserName = prop.getProperty("browser");
		
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		if(browserName.equals("chrome"))
		{
			
			DesiredCapabilities dcap = new DesiredCapabilities();
			
	        dcap.setCapability("pageLoadStrategy", "normal");
	       
			ChromeOptions options = new ChromeOptions();
			
			options.setExperimentalOption("prefs", prefs);
			
			options.addArguments("--disable-notifications");
			
			options.merge(dcap);

			System.setProperty("webdriver.chrome.driver", WalletUtils.getPath("C:\\Hima\\Automation_Hima\\CucumberFB\\src\\main\\java\\com\\resources\\chromedriver.exe"));	
			
			driver= new ChromeDriver(options);
			
			wait = new WebDriverWait(driver, 60);
			
			//waitFluent = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
			
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/");
						
			}

	}
	
}	