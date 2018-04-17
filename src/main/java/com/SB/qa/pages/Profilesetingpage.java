package com.SB.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class Profilesetingpage extends TestBase {
	
	@FindBy(xpath="/html//input[@id='first_name']")
	WebElement Firstname;
	@FindBy(xpath="/html//input[@id='last_name']")
	WebElement Lastname;
	@FindBy(xpath="//*[@id=\"Profile_tab\"]/div/div/div/div/div/div[2]/div[1]/input")
	WebElement PhoneNumber;
	@FindBy(xpath="/html//textarea[@id='message5']")
	WebElement AboutMe;
	@FindBy(xpath="/html//input[@id='profileImage']")
	WebElement Profilepic;
	@FindBy(xpath="/html//div[@id='Profile_tab']/div[@class='row']/div//button[@name='action']")
	WebElement Submit;
	
	
	public Profilesetingpage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyProfilesetingpage()
	{
		 return driver.getCurrentUrl();
	}
	
	public String profiledetails() throws InterruptedException
	{
		Firstname.sendKeys(prop.getProperty("FirstName"));
		Lastname.sendKeys(prop.getProperty("LastName"));
		PhoneNumber.sendKeys(prop.getProperty("Mobile"));
		AboutMe.sendKeys(prop.getProperty("AboutMe"));
		Profilepic.sendKeys(prop.getProperty("Imagefile"));
		Thread.sleep(2000);
		Submit.click();
		return driver.getCurrentUrl();	
		
	}

}
