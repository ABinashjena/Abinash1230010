package com.SB.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class Upgradeplanpage extends TestBase  {
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div/div/section/div/div/div/table/tfoot/tr/th[8]/a")
	WebElement curent;
	
	public Upgradeplanpage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyUpgradeplanpage()
	{
		 return driver.getCurrentUrl();
		
	}
	public String Curentplan()
	{
		boolean xxx = curent.isDisplayed();
		return driver.getCurrentUrl();
	}
	
	
	
	
}
