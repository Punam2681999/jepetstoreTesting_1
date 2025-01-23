package com.jepetstore.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class jpetstorecommon {
	private static WebDriver driver;
	public static WebDriver getWebDriver()
	{
		if(driver==null)
       {
	   System.setProperty("webdriver.chrome.driver",jepetStoarReadProperties.getChromePath());
	   driver=new ChromeDriver();
	   return driver; 
}
		return driver;
	}


}
