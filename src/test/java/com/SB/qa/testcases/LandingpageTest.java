package com.SB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SB.qa.pages.Dashboardpage;
import com.SB.qa.pages.Landingpage;
import com.SB.qa.pages.LinkShorteningpage;
import com.SB.qa.pages.LoginPage;

public class LandingpageTest extends TestBase {
	
	Dashboardpage dashboard;
	LoginPage loginpage ;
	Landingpage Landing;
	public LandingpageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
		Landing = new Landingpage();
//    Thread.sleep(2000);
//	    dashboard = loginpage.login(prop.getProperty("Emailid"), prop.getProperty("Password")); 
//	    Landing= new Landingpage();
//	    Thread.sleep(8000);
//	    Landing=dashboard.ClickonLogout();
	}
//	@Test(groups = { "Landingpage"},priority=1)
//	public void LandingpagetitleTest() throws InterruptedException
//	{
//		Thread.sleep(4000);
//		boolean value = Landing.verifyLandingpageTest();
//		Assert.assertEquals(value, true);	
//	}
	@Test(groups = { "Landingpage"},priority=1)
	public void LandingpagetitleTest() throws InterruptedException
	{
		Thread.sleep(5000);
		String lpname = Landing.verifayLandingpageTest();
		Assert.assertEquals(lpname, "Socioboard - Generate More leads on Social Media| Social CRM | Social Media CMS");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}

}
