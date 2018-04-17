package com.SB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SB.qa.pages.Companypage;
import com.SB.qa.pages.Dashboardpage;
import com.SB.qa.pages.Landingpage;
import com.SB.qa.pages.LoginPage;

public class CompanypageTest extends TestBase{
	Dashboardpage dashboard;
	Landingpage Landing;
	Companypage company;
	public CompanypageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
		Landing = new Landingpage();
		company=Landing.Clickoncompany();
	}
	@Test(groups = { "Company"},enabled=false)
	public void VerifyCompanypage()
	{
		String Companypageurl = company.verifayCompanypageurl();
		Assert.assertEquals(Companypageurl,"https://www.socioboard.com/Index/Company");
	}
	@Test(groups = { "Company"},priority=2)
	public void AllLinks()
	{
		company.CheckingAlllinks(Companypage.url);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
	

}
