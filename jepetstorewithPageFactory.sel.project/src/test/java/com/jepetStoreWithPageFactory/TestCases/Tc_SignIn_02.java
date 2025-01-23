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
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jepetstore.Utility.jepetStoarReadProperties;
import com.jepetstore.Utility.jpetStoreWriteResult;
import com.jepetstore.Utility.jpetstorecommon;
import com.jepetstorepagefactory.pages.AllLocators;



public class Tc_SignIn_02 {
	WebDriver driver;
	static AllLocators AllLoc;
	public static String signInSuccess;
	@BeforeSuite
	/*public void openBrowser()
	{
		driver=jepetStorecommon.getWebDriver();
		signup=new signUpLocators(driver);
	}
	@BeforeTest
	public void openURL()
	{
		driver.get(japetStoreReadproperties.getSignInURL());
		driver.manage().window().maximize();
	}*/
	@BeforeClass
	public void openBrowser()
	{   driver=jpetstorecommon .getWebDriver();
	AllLoc=PageFactory.initElements (driver, AllLocators.class); 
	   
		
	}
	@BeforeMethod
	public void openURL()
	{
		 driver.get(jepetStoarReadProperties.getSignInURL());
		 driver.manage().window().maximize();
		 Set<Cookie>cookies=driver.manage().getCookies();
		System.out.println(cookies);
		
	}
	@Test
	public void userSignIn() throws InterruptedException
	{
		String[] signIn=jepetStoarReadProperties.LoginDetailsValue();
		AllLoc.usersignIN(signIn[0],signIn[1]);
		String title=driver.getTitle();
		Assert.assertEquals(title,"JPetStore Demo");
		signInSuccess="pass";
		
		
	}
	@AfterMethod
	public void getScreenShot() throws IOException
	{
		if(null==signInSuccess)
		{
			signInSuccess="fail";
		}
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file ,new File("./screenshot/registerUser.png"));
	}
	@AfterMethod
	public void getTitle()
	{

		String Title1=driver.getTitle();
		System.out.println(Title1);
		
	}
	@AfterSuite
	public void closeBrowser()
	{
		jpetStoreWriteResult.writeData();
		driver.quit();
	}
	}




