package com.SB.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class Dashboardpage extends TestBase {
	@FindBy(xpath="//section[@id='content']//div[@href='#ComposePostModal']")
	       WebElement Composebutton;
	@FindBy(xpath="//*[@id=\"ComposePostModal\"]/div[2]/div/form/div[1]/div[1]/div[1]/div/div")
	      WebElement Textfield;
	@FindBy(xpath="//*[@id=\"fb_1737053016561946\"]")
	         WebElement Firstcheckbox;
	@FindBy(xpath="//*[@id=\"ComposePostModal\"]/div[2]/div/form/div[2]/div/div[1]")
	       WebElement Send;
	@FindBy(xpath="/html/body/div[15]/div[7]/div/button")
           WebElement Composepopup;
	@FindBy(xpath="/html//section[@id='content']/div[@class='row']//a[@href='#addprofile']/i")
			WebElement AddingButon;	
	@FindBy(xpath="/html//div[@id='addprofile']//ul//a[@href='#facebook']/i")
	     WebElement Fbicon;
	@FindBy(xpath="//*[@id=\"facebook\"]/div/a[1]")
	      WebElement Fbprofile;
	@FindBy(xpath="//html[@id='facebook']//input[@id='email']")
	      WebElement Fbemail;
	@FindBy(xpath="//html[@id='facebook']//input[@id='pass']")
	         WebElement Fbpassword;
	@FindBy(xpath="//html[@id='facebook']//button[@id='loginbutton']")
	     WebElement Fbloginbutton;
	@FindBy(xpath=("//div[@id='facebook']//a[@href='../FacebookManager/AddFacebookAcc?Op=page']/i[@class='fa fa-facebook fa-fw']"))
	     WebElement Fbpage;
	@FindBy(xpath=("//*[@id=\"FbFanpage_Modal\"]/div[1]/ul/li[1]/p/label"))
	      WebElement pagecheckbox;
	@FindBy(xpath=("//div[@id='FbFanpage_Modal']//a[.='Connect']"))
	      WebElement Fbpageconnect;
	@FindBy(xpath="/html//div[@id='addprofile']//ul//a[@href='#twitter']/i")
	       WebElement Twticon;
	@FindBy(xpath="/html//a[@id='TwitterAddButton']")
	    WebElement Twtprofile;
	@FindBy(xpath="/html//input[@id='username_or_email']")
	      WebElement Twtemail;
	@FindBy(xpath="/html//input[@id='password']")
	     WebElement Twtpassword;
	@FindBy(xpath="/html//input[@id='allow']")
	     WebElement Twtloginbutton;
	@FindBy(xpath="/html//div[@id='addprofile']//ul//a[@href='#google']/i")
	      WebElement Gplusicon;
	@FindBy(xpath="//*[@id=\"google\"]/div/a")
	     WebElement Gplusprofile;
	@FindBy(xpath=("//*[@id=\'identifierId\']"))
	     WebElement Gplusemail;
	@FindBy(xpath=("//*[@id=\"identifierNext\"]/content/span"))
	     WebElement Gplusemailclick;
	@FindBy(xpath=("//*[@id=\'password\']/div[1]/div/div[1]/input"))
	        WebElement Gpluspwd;
	@FindBy(xpath=("//div[@id='passwordNext']//span[@class='RveJvd snByac']"))
	    WebElement Gpluspwdclick;
	@FindBy(xpath=("//*[@id=\'submit_approve_access\']/content/span"))
         WebElement Gplusconform;
     //************************Insta profile***************************************//
	
	@FindBy(xpath="/html//div[@id='addprofile']//ul//a[@href='#instagram']/i")
	     WebElement Instaicon;
	@FindBy(xpath="//*[@id=\'instagram\']/div/a")
     	 WebElement Instaprofile;
	@FindBy(xpath="//*[@id=\'id_username\']")
	 WebElement Instaemail;
	@FindBy(xpath="//*[@id=\'id_password\']")
	 WebElement Instapwd;
	@FindBy(xpath="//*[@id=\'login-form\']/p[3]/input")
	 WebElement Instalogin;
	//************************LinkedIn profile***************************************//
	@FindBy(xpath="//*[@id=\"addprofile\"]/div/div/div[1]/div/ul/li[4]/a/i")
	   WebElement Ldicon;
	@FindBy(xpath="//*[@id=\"linkedin\"]/div/a[1]")
	   WebElement Ldprofile;
	@FindBy(xpath="//*[@id=\"session_key-oauth2SAuthorizeForm\"]")
	   WebElement Ldemail;
	@FindBy(xpath="//*[@id=\"session_password-oauth2SAuthorizeForm\"]")
	   WebElement Ldpwd;
	@FindBy(xpath="//*[@id=\"body\"]/div/form/div[2]/ul/li[1]/input")
	   WebElement Ldlogin;
	//************************YouTube profile***************************************//
	@FindBy(xpath="//*[@id=\"addprofile\"]/div/div/div[1]/div/ul/li[7]/a/i")
	WebElement YTicon;
	@FindBy(xpath="//*[@id=\"youtube\"]/div/a")
	WebElement YTchannel;
	@FindBy(xpath="/html//input[@id='identifierId']")
	WebElement YTemail;
	@FindBy(xpath="//div[@id='identifierNext']/content[@class='CwaK9']")
	WebElement YTemailnext;
	@FindBy(xpath="/html//div[@id='password']//input[@name='password']")
	WebElement YTpwd;
	@FindBy(xpath="//*[@id=\"passwordNext\"]/content/span")
	WebElement YTpwdnext;
	@FindBy(xpath="//*[@id=\"submit_approve_access\"]/content/span")
	WebElement Alllow;
	@FindBy(xpath="//*[@id=\"Youtube_Modal\"]/div[1]/ul/li/div[2]/label")
	WebElement checkbox;
	@FindBy(xpath="//*[@id=\"Youtube_Modal\"]/div[2]/a[1]")
	WebElement connect;
	@FindBy(xpath="/html/body/div[17]/div[7]/div/button")
	WebElement ok;
	
	
	//***********************imagelibrarymodule**********************************//
	@FindBy(xpath="//*[@id=\"slide-out\"]/li[2]/ul/li[8]/a")
    WebElement Imagelibrarymodule;
	@FindBy(xpath="//*[@id=\"slide-out\"]/li[2]/ul/li[8]/div/ul/li[1]/a")
    WebElement Privateimagelibrarymodule;
	@FindBy(xpath="//*[@id=\"slide-out\"]/li[2]/ul/li[8]/div/ul/li[2]/a")
	WebElement Publicimagelibrarymodule;
	//***********************BoardMeModule**********************************//
	@FindBy(xpath="//*[@id=\"slide-out\"]/li[3]/a")
	 WebElement BoardMemodule;
	//***********************Accountsettings**********************************//
	
	@FindBy(xpath="//*[@id=\"header\"]/div/nav/div/ul/li[6]/a/i")
	WebElement AccountSeting;
	@FindBy(xpath="/html//ul[@id='account_list']//a[@href='#/profilesettings']/span[@class='groupslist']")
	WebElement ProfileSeting;
	
	//***********************Referalpage**********************************//
	@FindBy(xpath="//*[@id=\"account_list\"]/div/div[1]/li[9]/a/span")
	WebElement Referal;
	//***********************Upgradeplanpage**********************************//
	@FindBy(xpath="//*[@id=\"account_list\"]/div/div[1]/li[11]/a/span")
	WebElement Upgradeplan;
	//***********************Billingpage**********************************//
	@FindBy(xpath="//*[@id=\"account_list\"]/div/div[1]/li[4]/a/span")
	WebElement Billing;
	//***********************E-wallet**********************************//
		@FindBy(xpath="//*[@id=\"account_list\"]/div/div[1]/li[8]/a")
		WebElement wallet;
	//**********************Link Shortening**********************************//
	@FindBy(xpath="//*[@id=\"account_list\"]/div/div[1]/li[7]/a")
	WebElement LinkShortening;
	//**********************App**********************************//
	@FindBy(xpath="//*[@id=\"account_list\"]/div/div[1]/li[6]/a")
	WebElement App;
	//**********************Logout**********************************//
	@FindBy(xpath="//*[@id=\"account_list\"]/div/div[1]/li[12]/a")
	WebElement Logout;
	//intilizating the page object

	public Dashboardpage()
	{
		PageFactory.initElements(driver,this);
	}
	public String verifayDashboardpageTitle()
	{
		return driver.getTitle();
	}
	public void Compose() throws InterruptedException
	{
		Composebutton.click();
		Textfield.sendKeys(prop.getProperty("Message"));
		Firstcheckbox.click();
		Send.click();
        Thread.sleep(10000);
        Composepopup.click();
        Thread.sleep(3000);
	}
	
	public String AddingFBprofiles() throws InterruptedException
	{
		Thread.sleep(5000);
		AddingButon.click();
		Fbicon.click();
		Fbprofile.click();
		Thread.sleep(5000);
		Fbemail.sendKeys(prop.getProperty("FEmail"));
		Fbpassword.sendKeys(prop.getProperty("FPassword"));
		Fbloginbutton.click();
		return driver.getTitle();
	}
	

	public String AddingFBpages() throws InterruptedException
	{
		Thread.sleep(8000);
		AddingButon.click();
		Thread.sleep(2000);
		Fbicon.click();
		Fbpage.click();
		Thread.sleep(5000);
		Fbemail.sendKeys(prop.getProperty("FEmail"));
		Fbpassword.sendKeys(prop.getProperty("FPassword"));
		Fbloginbutton.click();
		Thread.sleep(12000);
		pagecheckbox.click();
		Fbpageconnect.click();
		return driver.getTitle();
	}
	
	
	public String AddingGplusprofile() throws InterruptedException {
		Thread.sleep(10000);
		AddingButon.click();
		Thread.sleep(10000);
		Gplusicon.click();
		Thread.sleep(1000);
		Gplusprofile.click();
		Thread.sleep(5000);
		Gplusemail.sendKeys(prop.getProperty("GEmail"));
		Gplusemailclick.click();
		Gpluspwd.sendKeys(prop.getProperty("GPassword"));
		Gpluspwdclick.click();
		Gplusconform.click();
		Thread.sleep(5000);
		return driver.getTitle();
	}
	public String AddingTwtprofile() throws InterruptedException
	{
		Thread.sleep(5000);
		AddingButon.click();
		Twticon.click();
		Twtprofile.click();
		Thread.sleep(5000);
		Twtemail.sendKeys(prop.getProperty("TEmail"));
		Twtpassword.sendKeys(prop.getProperty("TPassword"));
		Twtloginbutton.click();
		return driver.getTitle();
	}
	public String AddingInstaprofile() throws InterruptedException {
		Thread.sleep(10000);
		AddingButon.click();
		Thread.sleep(1000);
		Instaicon.click();
		Thread.sleep(1000);
		Instaprofile.click();
		Thread.sleep(3000);
		Instaemail.sendKeys(prop.getProperty("IEmail"));
		Instapwd.sendKeys(prop.getProperty("IPassword"));
		Instalogin.click();
		Thread.sleep(5000);
		return driver.getTitle();
	}
	public String AddingLdprofile() throws InterruptedException
	{
		Thread.sleep(8000);
		AddingButon.click();
		Thread.sleep(1000);
		Ldicon.click();
		Thread.sleep(1000);
		Ldprofile.click();
		Thread.sleep(5000);
		Ldemail.sendKeys(prop.getProperty("LEmail"));
		Ldpwd.sendKeys(prop.getProperty("LPassword"));
		Ldlogin.click();
		Thread.sleep(5000);
		return driver.getTitle();
	}
	
	public String AddingYouTubechannel() throws InterruptedException
	{
		Thread.sleep(5000);
		AddingButon.click();
		Thread.sleep(1000);
		YTicon.click();
		Thread.sleep(1000);
		YTchannel.click();
		Thread.sleep(5000);
		YTemail.sendKeys(prop.getProperty("YEmail"));
		YTemailnext.click();
		YTpwd.sendKeys(prop.getProperty("YPassword"));
		Thread.sleep(1000);
		YTpwdnext.click();
		Thread.sleep(2000);
		Alllow.click();
		Thread.sleep(1000);
		checkbox.click();
		connect.click();
		//Thread.sleep(1000);
		//ok.click();
		return driver.getTitle();
	}
	public Privateimagelibrarymodulepage Clickonprivateimagelibrary()
	{
		Imagelibrarymodule.click();
		Privateimagelibrarymodule.click();
		return new Privateimagelibrarymodulepage();
	}
	public Publicimagelibrarymodulepage clickonpublicimagelibrary()
	{
		Imagelibrarymodule.click();
		Publicimagelibrarymodule.click();
		return new Publicimagelibrarymodulepage();
	}
	public BoardMepage ClickonBoardMemodule()
	{
		BoardMemodule.click();
       return new BoardMepage();
	}
	public Profilesetingpage ClickonProfileSetting() throws InterruptedException
	
	{
		Thread.sleep(3000);
		Actions act = new Actions(driver);
	      act.moveToElement(AccountSeting).perform();
	      act.click(AccountSeting).perform();
	      act.moveToElement(ProfileSeting).perform();
	      act.click(ProfileSeting).perform();
	      return new Profilesetingpage();
	
	}
	public Referralpage ClickonReferral() throws InterruptedException
	{
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(AccountSeting).perform();
		act.click(AccountSeting).perform();
		act.moveToElement(Referal).perform();
		act.click(Referal).perform();
		return new Referralpage();
	}
	
	public Upgradeplanpage ClickonUpgradeplan() throws InterruptedException
	{
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(AccountSeting).perform();
		act.click(AccountSeting).perform();
		act.moveToElement(Upgradeplan).perform();
		act.click(Upgradeplan).perform();
		return new Upgradeplanpage();
	}
	
	public Billingpage ClickonBilling() throws InterruptedException {
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(AccountSeting).perform();
		act.click(AccountSeting).perform();
		act.moveToElement(Billing).perform();
		act.click(Billing).perform();
		return new Billingpage();	
	}
	
	public Ewalletpage ClickonEwallet() throws InterruptedException
	{
		Thread.sleep(4000);
		Actions act=new Actions(driver);
		act.moveToElement(AccountSeting).perform();
		act.click(AccountSeting).perform();
		act.moveToElement(wallet).perform();
		act.click(wallet).perform();
		return new Ewalletpage();
	}
	
	public LinkShorteningpage ClickonLinkshortening() throws InterruptedException
	{
		Thread.sleep(4000);
		Actions act=new Actions(driver);
		act.moveToElement(AccountSeting).perform();
		act.click(AccountSeting).perform();
		act.moveToElement(LinkShortening).perform();
		act.click(LinkShortening).perform();
		return new LinkShorteningpage();
	}
	
	 public Apppage ClickonApp() throws InterruptedException
	 {
		 Thread.sleep(4000);
		 Actions act=new Actions(driver);
			act.moveToElement(AccountSeting).perform();
			act.click(AccountSeting).perform();
			act.moveToElement(App).perform();
			act.click(App).perform();
			return new Apppage();
	 }
	 public Landingpage ClickonLogout() throws InterruptedException
	 {
		 Thread.sleep(400);
		 Actions act=new Actions(driver);
			act.moveToElement(AccountSeting).perform();
			act.click(AccountSeting).perform();
			act.moveToElement(Logout).perform();
			act.click(Logout).perform();
			return new Landingpage();
	 }
	
	
	
	
	
	
	
	
	
	

}
