import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NSETest 
{

	WebDriver driver;
	
	@BeforeMethod
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tejjethv\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		
		driver.get("https://www.nseindia.com/");
	}
	
	@Test
	public void titleTest()
	{
		String title=driver.getTitle();
		
		System.out.println(title);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
