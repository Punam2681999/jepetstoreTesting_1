package com.jepetstore.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jepetStorecommon {
	private static WebDriver driver;
	public static WebDriver getWebDriver()
	{
		if(driver==null)
       {
	   System.setProperty("webdriver.chrome.driver",japetStoreReadproperties.getChromePath());
	   driver=new ChromeDriver();
	   return driver; 
}
		return driver;
	}

}
