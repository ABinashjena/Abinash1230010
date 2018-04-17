package com.SB.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SB.qa.pages.BoardMepage;
import com.SB.qa.pages.Dashboardpage;
import com.SB.qa.pages.LoginPage;


public class BoardMepageTest extends TestBase{
	

	Dashboardpage dashboard;
	LoginPage loginpage ;
	BoardMepage Boardmepage;
	public BoardMepageTest()
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
	    Boardmepage= new BoardMepage();
	    Thread.sleep(8000);
	    Boardmepage=dashboard.ClickonBoardMemodule();
	}
	@Test(priority=1)
	public void verifyBoardMepageurlTest()
	{
		String BoardMepageurl = Boardmepage.verifyBoardMepage();
		Assert.assertEquals(BoardMepageurl , "https://www.socioboard.com/home/index#/boardlist");
	}
	@Test(priority=2)
	public void CreateaBoardTest() throws InterruptedException
	{
		Boardmepage.Createaboard();
		Thread.sleep(2000);
		boolean newboardname = driver.findElement(By.xpath("/html//table[@id='BoardList']/tbody/tr[5]/td[2]")).isDisplayed();
		Assert.assertTrue(newboardname,"Testingpom5");
	}
	
	
	
	
	
	

	@AfterMethod
	
	public void tearDown()
	{
	driver.quit();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
