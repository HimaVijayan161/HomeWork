import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class TestNGBasics 
{
	//pre-conditions
	@BeforeMethod
	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("setup browser-BeforeSuite");
	}
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("launch Browser-BeforeTest");
	}
	
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("enterURL-BeforeMethod");
	}

	@BeforeClass
	public void login()
	{
		System.out.println("login-BeforeClass");
	}
	
	//test cases
	@Test(dataProvider="GetDataFromExcel")
	public void googleTitleTest(String s1,String s2)
	{
		System.out.println("googleTitleTest-Test-1"+s1+" "+s2);
	}
	//post conditions	
	
	public void searchTest()
	{
		System.out.println("searchTest-Test-2");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout-AfterMethod");
	}
	
	@AfterClass
	public void deleteCookies()
	{
		System.out.println("deleteCookies-AfterClass");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("closebrowser-AfterTest");
	}
	
	public void generateTestReport()
	{
		System.out.println("generateTestReport");
	}
	
	@DataProvider(name="GetDataFromExcel")
	public Object[][] getData()
	{
		/*Object[][] o =new Object[2][2];
		
		o[0][0]="Name";
		
		o[0][1]="Place";
		
		o[1][0]="Hima";
		
		o[1][1]="Ghatkopar";*/
		
		
	
		return o;
	}
	
	
	public Object[][] getAllData() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\tejjethv\\Downloads\\PageObjectModel-master\\src\\main\\java\\com\\crm\\qa\\testdata\\FreeCrmTestData.xlsx");
		
		Workbook 
		
	}

}
