package com.jepetStoreWithPageFactory.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jepetstore.Utility.jepetStoarReadProperties;
import com.jepetstore.Utility.jpetStoreWriteResult;
import com.jepetstore.Utility.jpetstorecommon;
import com.jepetstorepagefactory.pages.AllLocators;



public class Tc_RegisterUser_01 {
	static WebDriver driver;
	static AllLocators AllLoc;
	public static String registrarionSuccess;
	@BeforeSuite
	public void openBrowser()
	{
		driver=jpetstorecommon .getWebDriver();
		AllLoc=PageFactory.initElements (driver, AllLocators.class); 
	}
	@BeforeTest
	public void openURL()
	{
		driver.get(jepetStoarReadProperties.getURL());
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void getCookies()
	{
		
		Set<Cookie>cookies=driver.manage().getCookies();
		System.out.println(cookies);
	}
	@BeforeMethod
	public void getTitleOfPage()
	{
		String Title=driver.getTitle();
		System.out.println(Title);
	}
	@Test
	public static void FillRegisterdata()
	{
		String[] register=jepetStoarReadProperties.RegisterDetailsVlaue();
		AllLoc.userIdAndPassword(register[0], register[1],register[1]);
		
	}
	@Test
	public static void FillRegisterdata2()
	{
		String[] register=jepetStoarReadProperties.RegisterDetailsVlaue();
		AllLoc.userRegister1(register[2], register[3], register[4],register[5]);
	}
	@Test
	public static void FillRegisterdata3()
	{
		String[] register=jepetStoarReadProperties.RegisterDetailsVlaue();
		AllLoc.UserRegister2(register[6],register[7],register[8],register[9],register[10],register[11],register[12],register[13]);
		String title=driver.getTitle();
		//Assert.assertEquals(title,"JPetStore Demo");
		registrarionSuccess="pass";
		
	}
	@AfterMethod
	public static void  getScreenShot() throws IOException
	{   
		if(null==registrarionSuccess)
		{
			registrarionSuccess="fail";
		}
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file ,new File("./screenshot/registerUser.png"));
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		jpetStoreWriteResult.writeData();
		driver.quit();
	}
	
	

}
