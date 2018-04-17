package com.SB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SB.qa.pages.Dashboardpage;
import com.SB.qa.pages.LoginPage;

import com.SB.qa.pages.Publicimagelibrarymodulepage;

public class PublicimagelibrarymoduleTest extends TestBase{

	Dashboardpage dashboard;
	LoginPage loginpage ;
	Publicimagelibrarymodulepage Publicimagelibrary;
	public PublicimagelibrarymoduleTest()
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
	    Publicimagelibrary= new Publicimagelibrarymodulepage();
	    Thread.sleep(8000);
	    Publicimagelibrary=dashboard.clickonpublicimagelibrary();
	}
	@Test(priority=1)
	public void verifypublicimagelibrarypageurl()
	{
		String publicimagelibrarypageurl = Publicimagelibrary.verifyPublicimagelibrarypage();
		Assert.assertEquals(publicimagelibrarypageurl , "https://www.socioboard.com/home/index#/share_img_library");
	}
	
	@Test(priority=2)
	public void publicimagelibrary() throws InterruptedException
	{
		
		Thread.sleep(3000);
		Publicimagelibrary.publicimageupload();
	}
	@Test(priority=3)
	public void SendMessage() throws InterruptedException
	{
		Thread.sleep(3000);
	Publicimagelibrary.Sendmessage();
	}
	
	
	
	

	@AfterMethod
	
	public void tearDown()
	{
	driver.quit();
	
	}
	
	
	
	
	
	
	
}
