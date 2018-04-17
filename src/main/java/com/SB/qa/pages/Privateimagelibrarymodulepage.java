package com.SB.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.SB.qa.base.TestBase;

public class Privateimagelibrarymodulepage extends TestBase {
	
	@FindBy(xpath="/html//section[@id='content']//div[@class='ng-scope']/a")
	WebElement uploadimage;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div[1]/div[1]/div/a/span")
    WebElement Privateuplodeimage;
     @FindBy(xpath="/html//input[@id='img_name']")
     WebElement Privateimagename;
    @FindBy(xpath="/html//input[@id='input-file-now']")
      WebElement Privateimagedrag;
       @FindBy(xpath="/html//button[@id='mail_btn']")
       WebElement Privateuplodebutton;
     @FindBy(xpath="//*[@id=\"content\"]/div[1]/div[2]/div[1]/div/div/div/div[2]/span/i")
     WebElement crossbuton;
     @FindBy(xpath="/html/body/div[14]//button[@class='confirm']")
     WebElement yesdelete;
     @FindBy(xpath="/html/body/div[49]/div[7]/button")
     WebElement clacel;
     @FindBy(xpath="/html/body/div[14]/div[7]/div/button")
     WebElement ok;
	
	public Privateimagelibrarymodulepage()
	{
		PageFactory.initElements(driver,this);
	}
	public String verifyPrivateimagelibrarypage()
	{
		return driver.getCurrentUrl();
		
	}
	public String privateimageupload() throws InterruptedException
	{
		Thread.sleep(5000);
		Privateuplodeimage.click();
		Privateimagename.sendKeys(prop.getProperty("ImageName"));
		Thread.sleep(8000);
		Privateimagedrag.sendKeys(prop.getProperty("Imagefile"));
		Thread.sleep(2000);
		Privateuplodebutton.click();
		return driver.getCurrentUrl();
	}
	public void dleteimage() throws InterruptedException
	{
		crossbuton.click();
		Thread.sleep(500);
		JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);",yesdelete);
		yesdelete.click();
		//ok.click();
		//clacel.click();
	}

}
