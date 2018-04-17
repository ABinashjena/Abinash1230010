package com.SB.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class LoginPage extends TestBase{
    //pageObject / or
	@FindBy(xpath="/html/body/div[2]/nav/div/ul[1]/li[8]/a")
	WebElement SignIn;
	@FindBy(xpath="/html//input[@id='logUserName']")
	WebElement Emailid;
	@FindBy(xpath="/html//input[@id='logPassword']")
	WebElement Password;
	@FindBy(xpath="/html//button[@id='submitlogin']")
	WebElement Submitbutton;
	@FindBy(xpath="//*[@id=\"logo-container\"]/img")
	WebElement SBlogo;
	//intilizating the page object
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	//Action
	public String validateLoginpage()
	{
		return driver.getTitle();
	}
	public boolean validateSBimage()
	{
		return SBlogo.isDisplayed();
	}
	public Dashboardpage login(String un,String pwd) {
		SignIn.click();
		Emailid.sendKeys(un);
		Password.sendKeys(pwd);
		Submitbutton.click();
		return new Dashboardpage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
