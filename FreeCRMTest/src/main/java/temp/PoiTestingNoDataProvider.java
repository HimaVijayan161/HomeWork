package temp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiTestingNoDataProvider {

	public static void main(String[] args) throws IOException 
	{
			File f1 = new File("C:\\Users\\tejjethv\\Downloads\\PageObjectModel-master\\src\\main\\java\\Test.xlsx");
			
			FileInputStream fis = new FileInputStream(f1);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			
				for(int i=0;i<wb.getNumberOfSheets();i++)
				{
						XSSFSheet sheetname=wb.getSheetAt(i);
						
						System.out.println(sheetname);
						
						String header1=sheetname.getRow(i).getCell(i).getStringCellValue();
						
						System.out.println(header1);

						String header2=sheetname.getRow(i).getCell(i+1).getStringCellValue();

						System.out.println(header2);

				}
			
			
			
	}

}
