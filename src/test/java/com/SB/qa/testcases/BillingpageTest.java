package com.SB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SB.qa.pages.Billingpage;
import com.SB.qa.pages.Dashboardpage;
import com.SB.qa.pages.LoginPage;
import com.SB.qa.pages.Upgradeplanpage;

public class BillingpageTest extends TestBase {

	Dashboardpage dashboard;
	LoginPage loginpage ;
	Billingpage billingpage;
	
	public BillingpageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
	    loginpage = new LoginPage();
	    Thread.sleep(2000);
	    dashboard = loginpage.login(prop.getProperty("Emailid"), prop.getProperty("Password")); 
	    billingpage= new Billingpage();
	    Thread.sleep(8000);
	   billingpage=dashboard.ClickonBilling();
	}
	
	@Test(priority=1)
	public void verifyBillingpageTest()
	{
		String billingpageurl = billingpage.verifyBillingpage();
		Assert.assertEquals(billingpageurl, "https://www.socioboard.com/home/index#/billing");
	}
	@Test(priority=2)
	public void SwitchbusinessplansTest() throws InterruptedException
	{
		billingpage.Switchbusinessplans();
	}
	
	@Test(priority=3)
	public void DownloadinvoiceTest() throws InterruptedException
	{
		billingpage.Downloadinvoice();
	}
	@Test(priority=3)
	public void CancelplanTest() throws InterruptedException
	{
		billingpage.Cancelplan();
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	
}
