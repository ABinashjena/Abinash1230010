package com.SB.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class LinkShorteningpage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[1]/h4")
	WebElement pagename;
	

	public LinkShorteningpage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyLinkShorteningpage()
	{
	return pagename.getText();
	}

}
