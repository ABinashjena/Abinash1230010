package com.SB.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.SB.qa.base.TestBase;

public class Landingpage extends TestBase{
	
	@FindBy(xpath="/html/body/div[2]/nav/div/ul[1]/li[8]/a")
	WebElement signin;
	@FindBy(xpath="/html/body/div[2]/nav/div/ul[1]/li[1]/a")
	WebElement company;
	
	
	
	
	
	
	
	
	
	
	
	public Landingpage() 
	{
		PageFactory.initElements(driver, this);
	}

//	public boolean verifyLandingpageTest() throws InterruptedException
//	{
//		Thread.sleep(5000);
//	return signin.isDisplayed();
//	}
	public String verifayLandingpageTest() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}
	public Companypage Clickoncompany()
	{
		company.click();
		return new Companypage();
	}
}
