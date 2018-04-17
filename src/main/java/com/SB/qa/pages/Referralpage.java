package com.SB.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class Referralpage extends TestBase{
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div/div/div/form/a")
	WebElement share;
	@FindBy(xpath="/html//ul[@id='checkboxdata']/li[2]/label/input[@name='selector[]']")
	WebElement firstcheckbox;
	@FindBy(xpath="//*[@id=\"ComposePostModal\"]/div[2]/div/form/div[2]/a[1]/i")
	WebElement send;
	@FindBy(xpath="//body/div[15]//button[@class='confirm']")
	WebElement ok;
	
	public Referralpage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyReferralpage()
	{
		return driver.getCurrentUrl();
		
	}

	public String Referralcode() throws InterruptedException
	{
		Thread.sleep(5000);
		share.click();
		firstcheckbox.click();
		send.click();
		Thread.sleep(1000);
		ok.click();
		return driver.getCurrentUrl();
	}
}
