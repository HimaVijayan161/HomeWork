import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Bbfats {

@Test
public void testLogin()
	{

		WebDriver driver;
		
		WebDriverWait wait;
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tejjethv\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		driver = new ChromeDriver();
	
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		

		driver.get("https://bbfats.edu.activetextbook.com/login");
		
		
		
		WebElement userName=driver.findElement(By.id("login"));
		
		WebElement password = driver.findElement(By.id("password"));
		
		
			
		userName.sendKeys("latashia.kris@champlin.info");
		
		password.sendKeys("password");
		
		WebElement loginBtn = driver.findElement(By.id("login-btn"));

	//	driver.f
		
		loginBtn.submit();
		
		WebElement title = driver.findElement(By.xpath(".//*[contains(@class,'logo-replace')]"));
		
		String titleValue=title.getText();
		
		if(titleValue.equals("Active "));
		

		
		
		
	}

}
