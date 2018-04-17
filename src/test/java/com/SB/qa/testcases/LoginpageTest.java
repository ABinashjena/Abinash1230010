package com.SB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SB.qa.pages.Dashboardpage;
import com.SB.qa.pages.LoginPage;

public class LoginpageTest extends TestBase {
	LoginPage loginpage;
	Dashboardpage dashboard;
	public LoginpageTest()
	{
	super();
	}
	@BeforeMethod
	public void setup()
	{
		initilization();
		loginpage=new LoginPage();
	}
	@Test(priority=1)
	public void loginpagetitleTest()
	{
		String title = loginpage.validateLoginpage();
		Assert.assertEquals(title, "Socioboard - Generate More leads on Social Media| Social CRM | Social Media CMS");
	}
	@Test(priority=2)
	public void SBlogoimageTest()
	{
		boolean flag = loginpage.validateSBimage();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void loginTest() throws InterruptedException
	{
	
		dashboard=loginpage.login(prop.getProperty("Emailid"),prop.getProperty("Password"));
		Thread.sleep(10000);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
