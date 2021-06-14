
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetriveAllLinks 
{

	
	@Test
	public void getLinks()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tejjethv\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		
		driver.get("http://www.softwaretestingblog.in/");
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		for(WebElement element: links)
		{
			System.out.println("Link names are "+element.getAttribute("href"));
			
			System.out.println("Link names are "+element.getText());
		}
	}
}
