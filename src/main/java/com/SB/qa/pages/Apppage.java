package com.SB.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class Apppage extends TestBase {
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div[1]/h4")
	WebElement pagename;
	public Apppage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyApppage()
	{
	return pagename.getText();
	}

}
