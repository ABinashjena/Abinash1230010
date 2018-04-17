package com.SB.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class BoardMepage extends TestBase{
	
	
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/div/div[1]/div/span/a")
	WebElement CreateaBoard;
	@FindBy(xpath="/html//input[@id='BoardMe']")
	WebElement BoardName;
	@FindBy(xpath="/html//input[@id='InstagramID']")
	WebElement Instakeyword;
	@FindBy(xpath="/html//input[@id='TwitterID']")
	WebElement Twitkeyword;
	@FindBy(xpath="/html//input[@id='GPlusID']")
	WebElement Gpluskeyword;
	@FindBy(xpath="/html//div[@id='feeds']//form//a[.='SAVE']")
	WebElement Save;
	

	public BoardMepage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyBoardMepage()
	{
		return driver.getCurrentUrl();
		
	}
	public String Createaboard()
	{
		CreateaBoard.click();
		BoardName.sendKeys(prop.getProperty("BoardName"));
		Instakeyword.sendKeys(prop.getProperty("BoardMeKeyword"));
		Twitkeyword.sendKeys(prop.getProperty("BoardMeKeyword"));
		Gpluskeyword.sendKeys(prop.getProperty("BoardMeKeyword"));
		Save.click();
		return driver.getCurrentUrl();	
	}
	
	
	
	
}
