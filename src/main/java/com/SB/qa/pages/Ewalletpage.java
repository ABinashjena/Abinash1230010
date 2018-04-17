package com.SB.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class Ewalletpage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div/div/div/div/h5[1]")
	WebElement pagename;
	
	
	
	public Ewalletpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyEwalletpage()
	{
	return pagename.getText();
	}
   
	
}
