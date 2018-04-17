package com.SB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SB.qa.pages.Dashboardpage;
import com.SB.qa.pages.LoginPage;
import com.SB.qa.pages.Referralpage;
import com.SB.qa.pages.Upgradeplanpage;

public class UpgradeplanpageTest extends TestBase {
	Dashboardpage dashboard;
	LoginPage loginpage ;
	Upgradeplanpage Upgradeplan;
	
	public UpgradeplanpageTest()
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
	    Upgradeplan= new Upgradeplanpage();
	    Thread.sleep(8000);
	    Upgradeplan=dashboard.ClickonUpgradeplan();
	}
	@Test(priority=1)
	public void verifyReferralpageTest()
	{
		String Upgradeplanurl = Upgradeplan.verifyUpgradeplanpage();
		Assert.assertEquals(Upgradeplanurl, "https://www.socioboard.com/home/index#/upgradeplan");
	}
	@Test(priority=2)
	public void PlanTest()
	{
		Upgradeplan.Curentplan();
	}
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}

}
