package com.wallethub.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

/**
 * Utilities classes for the framework
 * @author hima vijayan
 *
 */
public class WalletUtils 
{

	static Workbook book;
	static Sheet sheet;
	
	public static ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {

		public Boolean apply(WebDriver driver) 
		{
            return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
		}
	};
	
	public static String  getPath(String utilName)
	{
		 ClassLoader classLoader = WalletUtils.class.getClassLoader();
		 
		 String utilPath=null;
		 
		 if(utilName.contains("EnvConfigDirectory"))
	      utilPath= classLoader.getResource("com/wallethub/config/EnvConfig.properties").getPath();
		 
		 if(utilName.contains("ChromeDriverDirectory"))
			 utilPath=   classLoader.getResource("com/wallethub/drivers/chromedriver.exe").getPath();
		 
		 if(utilName.contains("TestDataDirectory"))
			 utilPath =classLoader.getResource("com/wallethub/testdata/EnvConfig.properties").getPath();
		 
		 return utilPath;
	}

	/**
	 * used to call a sleep method before any initialization
	 * @param sleep
	 */
	public static void sleep(long sleep)
	{
		try 
		{
			Thread.sleep(sleep);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static Object[][] getTestDataFromExcel(String sheetName)
	{
		Object[][] data=null;
		try 
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\tejjethv\\Downloads\\WalletHub\\src\\main\\resources\\com\\wallethub\\testdata\\FacebookTestData.xlsx");
			
			book=WorkbookFactory.create(fis);
			
			sheet=book.getSheet(sheetName);
			
			data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			
			for (int i = 0; i < sheet.getLastRowNum(); i++) 
			{
				for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) 
				{
					data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
					System.out.println(data[i][k]);
				}
			}
		} 
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (InvalidFormatException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return data;
		
	}
}
