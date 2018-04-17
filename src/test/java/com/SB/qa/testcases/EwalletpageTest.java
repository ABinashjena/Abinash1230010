package com.SB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SB.qa.pages.Billingpage;
import com.SB.qa.pages.Dashboardpage;
import com.SB.qa.pages.Ewalletpage;
import com.SB.qa.pages.LoginPage;

public class EwalletpageTest extends TestBase  {
	Dashboardpage dashboard;
	LoginPage loginpage ;
	Ewalletpage Ewallet;
	
	public EwalletpageTest()
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
	    Ewallet= new Ewalletpage();
	    Thread.sleep(8000);
	    Ewallet=dashboard.ClickonEwallet();
	}
	@Test(priority=1)
	public void verifyEwalletpageTest()
	{
		
		String pagename = Ewallet.verifyEwalletpage();
       Assert.assertEquals(pagename, "E-Wallet");
	}
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
}
