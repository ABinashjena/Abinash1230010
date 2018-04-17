package com.SB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SB.qa.pages.Dashboardpage;
import com.SB.qa.pages.LoginPage;
import com.SB.qa.pages.Privateimagelibrarymodulepage;

public class DashboardpageTest extends TestBase {
	Dashboardpage dashboard;
	LoginPage loginpage ;
	Privateimagelibrarymodulepage Privateimagelibrary;
	public DashboardpageTest()
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
	    Privateimagelibrary= new Privateimagelibrarymodulepage();
	}
	@Test(groups = { "Dashboard"},priority=1)
	public void dashboardpagetitleTest() throws InterruptedException
	{
		Thread.sleep(5000);
		String dbtitle= dashboard.verifayDashboardpageTitle();
		Assert.assertEquals(dbtitle, "Socioboard");
		
	}
	@Test(groups = { "Compose"},priority=2)
	public void composeTest() throws InterruptedException
	{
		Thread.sleep(5000);
		dashboard.Compose();
	}
	@Test(groups = { "AddingAccount"},priority=3)
	public void AddingfbprofileTest() throws InterruptedException
	{
		dashboard.AddingFBprofiles();
		String dbtitle= dashboard.verifayDashboardpageTitle();
		Assert.assertEquals(dbtitle, "Socioboard");
	}
	@Test(groups = { "AddingAccount"},priority=4)
	public void AddinFBpagesTest() throws InterruptedException
	{
	dashboard.AddingFBpages();	
	String dbtitle=dashboard.verifayDashboardpageTitle();
	Assert.assertEquals(dbtitle, "Socioboard");
	}
	@Test(groups = { "AddingAccount"},priority=5)
	public void AddingTWtprofileTest() throws InterruptedException
	{
		dashboard.AddingTwtprofile();
		String dbtitle=dashboard.verifayDashboardpageTitle();
		Assert.assertEquals(dbtitle, "Socioboard");
	}
	@Test(groups = { "AddingAccount"},priority=6)
	public void AddingGplusprofileTest() throws InterruptedException
	{
		dashboard.AddingGplusprofile();
		String dbtitle = dashboard.verifayDashboardpageTitle();
		Assert.assertEquals(dbtitle,"Socioboard");
	}
	@Test(groups = { "AddingAccount"},priority=7)
	public void AddingInstaprofileTest() throws InterruptedException
	{
		dashboard.AddingInstaprofile();
		String dbtitle = dashboard.verifayDashboardpageTitle();
		Assert.assertEquals(dbtitle,"Socioboard");
	}
	@Test(groups = { "AddingAccount"},priority=8)
	public void AddingLinkedinprofileTest() throws InterruptedException
	{
		dashboard.AddingLdprofile();
		String dbtitle = dashboard.verifayDashboardpageTitle();
		Assert.assertEquals(dbtitle,"Socioboard");
	}
	@Test(groups = { "AddingAccount"},priority=9)
	public void AddingYouTubechannelTest() throws InterruptedException
	{
		dashboard.AddingYouTubechannel();
		String dbtitle = dashboard.verifayDashboardpageTitle();
		Assert.assertEquals(dbtitle,"Socioboard");
	}
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
}
