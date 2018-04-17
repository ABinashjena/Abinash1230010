package com.SB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SB.qa.pages.Dashboardpage;
import com.SB.qa.pages.LoginPage;
import com.SB.qa.pages.Privateimagelibrarymodulepage;

public class PrivateimagelibrarymoduleTest extends TestBase {
	Dashboardpage dashboard;
	LoginPage loginpage ;
	Privateimagelibrarymodulepage Privateimagelibrary;
	public PrivateimagelibrarymoduleTest()
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
	    Thread.sleep(8000);
	    Privateimagelibrary=dashboard.Clickonprivateimagelibrary();
	}
	@Test(priority=1)
	public void verifyprivateimagelibrarypageurl()
	{
		String privateimagelibrarypageurl = Privateimagelibrary.verifyPrivateimagelibrarypage();
		Assert.assertEquals(privateimagelibrarypageurl , "https://www.socioboard.com/home/index#/img_library");
	}
	@Test(priority=2)
	public void Privateimagelibrary() throws InterruptedException 
	{
		
		Privateimagelibrary.privateimageupload();
	}
	@Test(priority=3)
	public void Dleteprivateimage() throws InterruptedException
	{
		Thread.sleep(3000);
		Privateimagelibrary.dleteimage();
	}
	
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	
	}
}
