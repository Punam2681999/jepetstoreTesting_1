package com.jepetstorepagefactory.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllLocators {
	WebDriver driver;
	public AllLocators(WebDriver driver)
	{
		this.driver=driver;
	}
	 @FindBy(xpath="//input[@name=\"username\"]")
     WebElement UserID;
	 @FindBy(xpath="//input[@name=\"password\"]")
     WebElement Newpassword ;
	 @FindBy(xpath="//input[@name=\"repeatedPassword\"]")
     WebElement Confirmpassword;
	 @FindBy(xpath="//input[@name=\"firstName\"]")
     WebElement Firstname;
	 @FindBy(xpath="//input[@name=\"lastName\"]")
     WebElement LastName;
	 @FindBy(xpath="//input[@name=\"email\"]")
     WebElement Email;
	 @FindBy(xpath="//input[@name=\"phone\"]")
     WebElement phone;
	 @FindBy(xpath="//input[@name=\"address1\"]")
     WebElement  Address1;
	 @FindBy(xpath="//input[@name=\"address2\"]")
     WebElement Address2;
	 @FindBy(xpath="//input[@name=\"city\"]")
     WebElement city;
	 @FindBy(xpath="//input[@name=\"state\"]")
     WebElement state;
	 @FindBy(xpath="//input[@name=\"zip\"]")
     WebElement Zip ;
	 @FindBy(xpath="//input[@name=\"country\"]")
     WebElement country;
	 @FindBy(xpath="//select[@name=\"languagePreference\"]")
     WebElement langPrep ;
	 @FindBy(xpath="//select[@name=\"favouriteCategoryId\"]")
     WebElement FavCategory;
	 @FindBy(xpath="//input[@name=\"listOption\"]")
     WebElement listoption;
	 @FindBy(xpath="//input[@name=\"bannerOption\"]")
     WebElement bannerOption;
	 @FindBy(xpath="//button[text()=\"Save Account Information\"]")
     WebElement saveInformation;
	 @FindBy(xpath="/html/body/section/div[2]/div[2]/div/form/div/div/button")
     WebElement login ;
	 @FindBy(xpath="//a[text()=\"Fish\"]")
     WebElement fish ;
	 @FindBy(xpath="//a[text()=\"FI-SW-01\"]")
     WebElement Angelfish ;
	 @FindBy(css="#Catalog > table > tbody > tr:nth-child(2) > td:nth-child(5) > a")
     WebElement AddToCartAngelfish ;
	 @FindBy(xpath="//button[text()=\"Update Cart\"]")
     WebElement UpdateCart ;
	 @FindBy(xpath="//a[text()=\"Proceed to Checkout\"]")
     WebElement proceedTocheckOut ;
	 @FindBy(xpath="//button[text()=\"Continue\"]")
     WebElement continueprocess ;
	 @FindBy(xpath="//button[text()=\"Confirm\"]")
     WebElement confirm ;
	 @FindBy(xpath="//p[text()=\"Thank you, your order has been submitted.\"]")
     WebElement ordervalidation ;
	 /* @FindBy(xpath=)
     WebElement  ;
	@FindBy(xpath=)
     WebElement  ;*/
	 
	 
	 public void userIdAndPassword(String user,String pass,String CP)
		{
			UserID.sendKeys(user);
			Newpassword.sendKeys(pass);
			Confirmpassword.sendKeys(CP);
		}
		public void userRegister1(String FN,String LN,String EM,String PN)
		{   
			Firstname.sendKeys(FN);
			LastName.sendKeys(LN);
			Email.sendKeys(EM);
		    phone.sendKeys(PN);
			
		}
		public void UserRegister2(String AD1,String AD2,String CT,String ST,String ZP,String CN,String lang,String Fav ) {
		   Address1.sendKeys(AD1);
		   Address2.sendKeys(AD2);
		   city.sendKeys(CT);
		   state.sendKeys(ST);
		   Zip.sendKeys(ZP);
		   country.sendKeys(CN);
		   langPrep.sendKeys(lang);
		   FavCategory.sendKeys(Fav);
		   listoption.click();
		   bannerOption.click();
		   saveInformation.click();
		   
		    
			
		}
		public void usersignIN(String UN,String PS) throws InterruptedException
		{
			
			UserID.clear();
			UserID.sendKeys(UN);
			Newpassword.clear();
			Newpassword.sendKeys(PS);
			login.click();
		}
		public void AddToCartValue()
		{
			fish.click();
			Angelfish.click();
			AddToCartAngelfish.click();
			UpdateCart.click();
		    proceedTocheckOut.click();
			continueprocess.click();
			confirm.click();
			
			
			
			
		}
     
     
}
