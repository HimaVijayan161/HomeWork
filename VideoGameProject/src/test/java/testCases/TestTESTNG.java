package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TestTESTNG 
{

	@Test(dataProvider="DataProvider")
	public void testData(String str,String str2)
	{
		int count=0;
		System.out.println("print "+count+" "+str+" "+str2);
	}
	
	
	@DataProvider(name="DataProvider")
	public Object[][] dataProvider()
	{
		
		String path=System.getProperty("user.dir")+"/VideoGameAPIData.xlsx";

		try {
			
			FileInputStream fi=new FileInputStream(path);
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}	
		
		try 
		{
			XSSFWorkbook wb= new XSSFWorkbook(path);
			
			XSSFSheet sheetName=wb.getSheet("Sheet1");
			
			sheetName.getLastRowNum();
			
			sheetName.getRow(rownum)
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		Object[][] oo = new Object[2][2];
		
		Object o1= new Object();
		
		Object o2 = new Object();
		
		//Object o3 = new Object();

	for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
				oo[i][j]=Map<Integer,String>;
				
		return  oo ;
	}
	
}
