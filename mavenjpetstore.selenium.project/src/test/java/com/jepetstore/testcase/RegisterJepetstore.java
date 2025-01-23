package com.jepetstore.testcase;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jepetstore.pages.signUpLocators;
import com.jepetstore.utility.japetStoreReadproperties;
import com.jepetstore.utility.japetstoreReadResult;
import com.jepetstore.utility.jepetStorecommon;

public class RegisterJepetstore {
	static WebDriver driver;
	static signUpLocators signup;
	public static String registrarionSuccess;
	@BeforeSuite
	public void openBrowser()
	{
		driver=jepetStorecommon.getWebDriver();
		signup=new signUpLocators(driver);
	}
	@BeforeTest
	public void openURL()
	{
		driver.get(japetStoreReadproperties.getURL());
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
		String[] register=japetStoreReadproperties.RegisterDetailsVlaue();
		signup.userIdAndPassword(register[0], register[1],register[1]);
		
	}
	@Test
	public static void FillRegisterdata2()
	{
		String[] register=japetStoreReadproperties.RegisterDetailsVlaue();
		signup.userRegister1(register[2], register[3], register[4],register[5]);
	}
	@Test
	public static void FillRegisterdata3()
	{
		String[] register=japetStoreReadproperties.RegisterDetailsVlaue();
		signup.UserRegister2(register[6],register[7],register[8],register[9],register[10],register[11],register[12],register[13]);
		String title=driver.getTitle();
		//Assert.assertEquals(title,"JPetStore Demo");
		registrarionSuccess="pass";
		japetstoreReadResult.writeData();
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
		driver.quit();
	}
	

}
