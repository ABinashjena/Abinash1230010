package com.SB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SB.qa.pages.BoardMepage;
import com.SB.qa.pages.Dashboardpage;
import com.SB.qa.pages.LoginPage;
import com.SB.qa.pages.Referralpage;

public class ReferralpagemoduleTest extends TestBase{
	Dashboardpage dashboard;
	LoginPage loginpage ;
	Referralpage referralpage;
	
	
	public ReferralpagemoduleTest()
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
	    referralpage= new Referralpage();
	    Thread.sleep(8000);
	    referralpage =dashboard.ClickonReferral();
	}
	@Test(priority=1)
	public void verifyReferralpageTest()
	{
		String Referalurl=referralpage.verifyReferralpage();
		Assert.assertEquals(Referalurl,"https://www.socioboard.com/home/index#/referral");
	}
	@Test(dependsOnMethods = { "verifyReferralpageTest" })
	public void ReferralTest() throws InterruptedException
	{
	
		referralpage.Referralcode();
		
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
