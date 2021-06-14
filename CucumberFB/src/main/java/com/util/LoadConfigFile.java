package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadConfigFile {
	
	
	public  Properties loadProperty(String fileName)
	{
		Properties prop = null;
		try 
		{
			FileInputStream fis = new FileInputStream("C:\\Hima\\Automation_Hima\\CucumberFB\\src\\main\\java\\com\\resources\\'"+fileName+"'");
			prop.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return prop;

	}

}
