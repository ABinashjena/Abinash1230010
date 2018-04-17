package com.SB.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class Publicimagelibrarymodulepage extends TestBase {

	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div[1]/div[1]/div/a/span")
	WebElement Publicimageupload;
	@FindBy(xpath="/html//input[@id='img_name']")
	WebElement Publicimagename;
	@FindBy(xpath="//*[@id=\"input-file-now\"]")
	WebElement Publicimagedrag;
	@FindBy(xpath="/html//button[@id='mail_btn']")
	WebElement Publicimagesubmit;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/a/i")
	WebElement Editbutton;
	@FindBy(xpath="/html//textarea[@id='composeMessage']")
	WebElement Entermessage;
	@FindBy(xpath="//*[@id=\"fb_1737053016561946\"]")
	WebElement Selectcheckbox;
	@FindBy(xpath="//*[@id=\"ComposePostModal\"]/div[2]/div/form/div[2]/a[1]")
	WebElement Send;
	
	
	
	
	public Publicimagelibrarymodulepage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyPublicimagelibrarypage()
	{
		return driver.getCurrentUrl();
		
	}
	public String publicimageupload() throws InterruptedException {
		
		Thread.sleep(5000);
		Publicimageupload.click();
		Publicimagename.sendKeys(prop.getProperty("ImageName"));
		Thread.sleep(8000);
		Publicimagedrag.sendKeys(prop.getProperty("Imagefile"));
		Thread.sleep(2000);
		Publicimagesubmit.click();
		return driver.getCurrentUrl();	
	}
	public String Sendmessage() throws InterruptedException
	{
		Thread.sleep(5000);
		Editbutton.click();
		Entermessage.sendKeys(prop.getProperty("Message"));
		Selectcheckbox.click();
		Send.click();
		return driver.getCurrentUrl();	
	}
	
	
	
	
}
