package com.SB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SB.qa.pages.BoardMepage;
import com.SB.qa.pages.Dashboardpage;
import com.SB.qa.pages.LoginPage;
import com.SB.qa.pages.Profilesetingpage;

public class ProfilesetingpageTest extends TestBase  {
	Dashboardpage dashboard;
	LoginPage loginpage ;
	Profilesetingpage Profileseting;

	public ProfilesetingpageTest() {
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
	    loginpage = new LoginPage();
	    Thread.sleep(2000);
	    dashboard = loginpage.login(prop.getProperty("Emailid"), prop.getProperty("Password")); 
	    Profileseting= new Profilesetingpage();
	    Thread.sleep(8000);
	    Profileseting=dashboard.ClickonProfileSetting();
	}
	
	@Test(priority=1)
	public void verifyProfilesetingpageTest()
	{
	
		String Profilesetingpageurl = 	Profileseting.verifyProfilesetingpage();
		Assert.assertEquals(Profilesetingpageurl , "https://www.socioboard.com/home/index#/profilesettings");
	}
	
      @Test(priority=2)
      public void ProfileSettingTest() throws InterruptedException
      {
    	  Profileseting.profiledetails();
    	  Thread.sleep(3000);
      }

	@AfterMethod()
	public void tearDown(){
	driver.quit();
	}
}
