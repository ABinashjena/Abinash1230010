package com.SB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SB.qa.pages.Dashboardpage;
import com.SB.qa.pages.Ewalletpage;
import com.SB.qa.pages.LinkShorteningpage;
import com.SB.qa.pages.LoginPage;

public class LinkShorteningpageTest extends TestBase {
	Dashboardpage dashboard;
	LoginPage loginpage ;
	LinkShorteningpage LinkShortening;
	public LinkShorteningpageTest()
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
	    LinkShortening= new LinkShorteningpage();
	    Thread.sleep(8000);
	    LinkShortening=dashboard.ClickonLinkshortening();
	}
	@Test(priority=1)
	public void verifyLinkShorteningpageTest()
	{
		
		String pagename = LinkShortening.verifyLinkShorteningpage();
       Assert.assertEquals(pagename, "Link Shortening");
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
	//driver.quit();
	}
	
	
}
