package com.jepetStoreWithPageFactory.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jepetstore.Utility.jepetStoarReadProperties;
import com.jepetstore.Utility.jpetStoreWriteResult;
import com.jepetstore.Utility.jpetstorecommon;
import com.jepetstorepagefactory.pages.AllLocators;



public class Tc_AddToCartOrder_03 {

		WebDriver driver;
		static AllLocators AllLoc;
		public static String AddToCartFishSuccess;
		
		@BeforeClass
		public void openBrowser()
		{   driver=jpetstorecommon.getWebDriver();
		AllLoc=PageFactory.initElements (driver, AllLocators.class); 
		   
			
		}
		@BeforeMethod
		public void openURL()
		{
			 driver.get(jepetStoarReadProperties.getAddToCartURL());
			 driver.manage().window().maximize();
			 Set<Cookie>cookies=driver.manage().getCookies();
			System.out.println(cookies);
			
		}
		@Test
		public void AddToCart() throws InterruptedException
		{
			AllLoc.AddToCartValue();
			WebElement text=driver.findElement(By.xpath("//p[text()=\"Thank you, your order has been submitted.\"]"));
			Assert.assertEquals(text.getText(),"Thank you, your order has been submitted.");
			AddToCartFishSuccess="pass";
			
			
		}
		@AfterMethod
		public void getScreenShot() throws IOException
		{
			if(null==AddToCartFishSuccess)
			{
				AddToCartFishSuccess="fail";
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

		


