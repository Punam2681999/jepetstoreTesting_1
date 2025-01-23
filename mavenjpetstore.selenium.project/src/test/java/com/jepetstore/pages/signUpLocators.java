package com.jepetstore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpLocators {
	WebDriver driver;
	public signUpLocators(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By UserID=By.xpath("//input[@name=\"username\"]");
	By Newpassword=By.xpath("//input[@name=\"password\"]");
	By Confirmpassword=By.xpath("//input[@name=\"repeatedPassword\"]");
	By Firstname=By.xpath("//input[@name=\"firstName\"]");
	By LastName=By.xpath("//input[@name=\"lastName\"]");
	By Email=By.xpath("//input[@name=\"email\"]");
	By phone=By.xpath("//input[@name=\"phone\"]");
	By Address1=By.xpath("//input[@name=\"address1\"]");
	By Address2=By.xpath("//input[@name=\"address2\"]");
	By city=By.xpath("//input[@name=\"city\"]");
	By state=By.xpath("//input[@name=\"state\"]");
	By Zip=By.xpath("//input[@name=\"zip\"]");
	By country=By.xpath("//input[@name=\"country\"]");
	By langPrep=By.xpath("//select[@name=\"languagePreference\"]");
	By FavCategory=By.xpath("//select[@name=\"favouriteCategoryId\"]");
	By listoption=By.xpath("//input[@name=\"listOption\"]");
	By bannerOption=By.xpath("//input[@name=\"bannerOption\"]");
	By saveInformation=By.xpath("//button[text()=\"Save Account Information\"]");
	By login=By.xpath("/html/body/section/div[2]/div[2]/div/form/div/div/button");
	By fish=By.xpath("//a[text()=\"Fish\"]");
	By Angelfish=By.xpath("//a[text()=\"FI-SW-01\"]");
	By AddToCartAngelfish=By.cssSelector("#Catalog > table > tbody > tr:nth-child(2) > td:nth-child(5) > a");
	By UpdateCart=By.xpath("//button[text()=\"Update Cart\"]");
	By proceedTocheckOut=By.xpath("//a[text()=\"Proceed to Checkout\"]");
	By continueprocess=By.xpath("//button[text()=\"Continue\"]");
	By confirm=By.xpath("//button[text()=\"Confirm\"]");
	By ordervalidation=By.xpath("//p[text()=\"Thank you, your order has been submitted.\"]");
	
	public void usersignIN(String UN,String PS) throws InterruptedException
	{
		WebElement UI=driver.findElement(UserID);
		UI.clear();
		UI.sendKeys(UN);
		WebElement PW=driver.findElement(Newpassword);
		PW.clear();
		PW.sendKeys(PS);
		
		driver.findElement(login).click();
	}
	
	public void userIdAndPassword(String user,String pass,String CP)
	{
		driver.findElement(UserID).sendKeys(user);
		driver.findElement(Newpassword).sendKeys(pass);
		driver.findElement(Confirmpassword).sendKeys(CP);
	}
	public void userRegister1(String FN,String LN,String EM,String PN)
	{   
		driver.findElement(Firstname).sendKeys(FN);
		driver.findElement(LastName).sendKeys(LN);
		driver.findElement(Email).sendKeys(EM);
		driver.findElement(phone).sendKeys(PN);
		
	}
	public void UserRegister2(String AD1,String AD2,String CT,String ST,String ZP,String CN,String lang,String Fav ) {
		driver.findElement(Address1).sendKeys(AD1);
	    driver.findElement(Address2).sendKeys(AD2);
	    driver.findElement(city).sendKeys(CT);
	    driver.findElement(state).sendKeys(ST);
	    driver.findElement(Zip).sendKeys(ZP);
	    driver.findElement(country).sendKeys(CN);
	    driver.findElement(langPrep).sendKeys(lang);
	    driver.findElement(FavCategory).sendKeys(Fav);
	    driver.findElement(listoption).click();
	    driver.findElement(bannerOption).click();
	    driver.findElement(saveInformation).click();
	   
	    
		
	}
	public void AddToCartValue()
	{
		driver.findElement(fish).click();
		driver.findElement(Angelfish).click();
		driver.findElement(AddToCartAngelfish).click();
		driver.findElement(UpdateCart).click();
		driver.findElement(proceedTocheckOut).click();
		driver.findElement(continueprocess).click();
		driver.findElement(confirm).click();
		
		
		
		
	}
	

}
