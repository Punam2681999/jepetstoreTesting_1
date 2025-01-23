package com.jepetstore.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class japetStoreReadproperties {
	public static Properties fileRead(){
		
	try{
		FileInputStream stream=new FileInputStream("C:\\Users\\punam\\Desktop\\seleniumAutomation\\mavenjpetstore.selenium.project\\src\\test\\resources\\jepetstore.properties");
		Properties properties=new Properties();
		properties.load(stream);
		return properties;
		
	}
	catch(IOException e)
	{
		e.printStackTrace();
		return null;
	}
	}
	public static String getChromePath()
	{
		Properties properties=fileRead();
		return properties.getProperty("chrome.path");
	}
	public static String getURL()
	{
		Properties properties=fileRead();
		return properties.getProperty("jpetstore.URL");
	}
	public static String getSignInURL()
	{
		Properties properties=fileRead();
		return properties.getProperty("jpetstore.signIn");
	}
	public static String getAddToCartURL()
	{
		Properties properties=fileRead();
		return properties.getProperty("jpetstore.addToCartURL");
		
	}
	
	public static String [] LoginDetailsValue()
	{
		String [] details=new String[2];
		Properties properties=fileRead();
		details[0]=properties.getProperty("jpetstore.userID");
		details[1]=properties.getProperty("jpetstore.userpassword");
		return details;
		
		
	}
	public static String [] RegisterDetailsVlaue()
	{
		Properties properties=fileRead();
		String[] Register= {
				properties.getProperty("jpetstore.userID"),
				properties.getProperty("jpetstore.userpassword"),
			    properties.getProperty("jpetstore.firstName"),
			    properties.getProperty("jpetstore.lastName"),
			    properties.getProperty("jpetstore.Email"),
				properties.getProperty("jpetstore.phone"),
				properties.getProperty("jpetstore.Address1"),
				properties.getProperty("jpetstore.Address2"),
				properties.getProperty("jpetstore.city"),
				properties.getProperty("jpetstore.state"),
				properties.getProperty("jpetstore.zip"),
				properties.getProperty("jpetstore.country"),
				properties.getProperty("jpetstore.Language"),
				properties.getProperty("jpetstore.favourite")
		};
		        return Register;
				
		}
		
	}


