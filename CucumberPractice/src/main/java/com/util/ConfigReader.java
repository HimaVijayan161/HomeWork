package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	private Properties prop;
	
	public Properties initializePropertyFile()
	{
		prop= new Properties();
		
		try 
		{
			FileInputStream fis = new FileInputStream("C:\\Hima\\Automation_Hima\\CucumberPractice\\src\\test\\resources\\com\\config\\config.properties");
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
