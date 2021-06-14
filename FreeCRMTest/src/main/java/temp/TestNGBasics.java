package temp;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


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
	@Test(threadPoolSize=3,invocationCount=3,timeOut=1000,dataProvider="GetDataFromExcel")
	public void googleTitleTest(String s1,String s2)
	{
		System.out.println("Test "+s1+" "+s2+" "+Thread.currentThread().getName());
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
	
/*	@DataProvider(name="GetDataFromExcel")
	public Object[][] getData()
	{
		Object[][] o =new Object[2][2];
		
		o[0][0]="Name";
		
		o[0][1]="Place";
		
		o[1][0]="Hima";
		
		o[1][1]="Ghatkopar";
		
		
	
		return o;
	}*/
	
	@DataProvider(name="GetDataFromExcel")
	public Object[][] getAllData() throws InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\tejjethv\\Downloads\\PageObjectModel-master\\src\\main\\java\\Test.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("Hima"); 
		
/*		sheet.getLastRowNum();
		
		sheet.getRow(0).getLastCellNum();*/
		
		Object[][] o= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				o[i][j]= sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		return o; 
	}

}
