package com.SB.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class Billingpage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div/div/div[2]/a[1]")
	WebElement SwitchBusinessPlans;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div/div/div[2]/a[2]")
	WebElement downloadinvoice;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div/div/div[2]/a[3]")
	WebElement cancelplan;

	public Billingpage()
     	{
		PageFactory.initElements(driver, this);
	      }
    public String verifyBillingpage()
       {
	    return driver.getCurrentUrl();
	
        }
	public Upgradeplanpage  Switchbusinessplans() throws InterruptedException
	    {
		Thread.sleep(2000);
		SwitchBusinessPlans.click();
		return new Upgradeplanpage();
	    }
	
	public String  Downloadinvoice() throws InterruptedException
    {
	Thread.sleep(2000);
	downloadinvoice.click();
	return driver.getCurrentUrl();
    }
	public String  Cancelplan() throws InterruptedException
    {
	Thread.sleep(2000);
	cancelplan.click();
	return driver.getCurrentUrl();
    }
}
