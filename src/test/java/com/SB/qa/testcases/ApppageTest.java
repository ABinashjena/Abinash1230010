package com.SB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SB.qa.pages.Apppage;
import com.SB.qa.pages.Dashboardpage;
import com.SB.qa.pages.LinkShorteningpage;
import com.SB.qa.pages.LoginPage;

public class ApppageTest extends TestBase 
{
	Dashboardpage dashboard;
	LoginPage loginpage ;
	Apppage apppage;
	
	    public ApppageTest()
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
		    apppage= new Apppage();
		    Thread.sleep(8000);
		    apppage=dashboard.ClickonApp();
		}
	    @Test(priority=1)
		public void verifyApppageTest()
		{
			
			String pagename = apppage.verifyApppage();
	       Assert.assertEquals(pagename, "Install the Chrome Extension!");
		}
		
		
		@AfterMethod
		public void tearDown()
		{
		driver.quit();
		}
}
