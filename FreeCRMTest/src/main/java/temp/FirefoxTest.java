package temp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirefoxTest {

	public WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.out.println("Initilizing the Google Chrome Driver");
		//driver = new FirefoxDriver();
	}

	@Test
	public void FirefoxTestMethod() {

		// Initialize the chrome driver
		System.out.println("The thread ID for Firefox is " + Thread.currentThread().getId());
		//driver.get("https://www.demoqa.com");
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		
		Set<String>s=driver.getWindowHandles();

	}
	
	@Test
	public void print()
	{
		 System.out.println("The thread ID for print in Firefox is "+ Thread.currentThread().getId());

	}

	@AfterTest
	public void afterTest() {
		System.out.println("Closing the browser ");
		//driver.close();
	}
}