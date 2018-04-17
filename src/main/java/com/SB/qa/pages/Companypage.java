package com.SB.qa.pages;


import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class Companypage extends TestBase{
	public  static String url;
	@FindBy(tagName=("a"))
	List<WebElement> links;
	public Companypage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifayCompanypageurl()
	{
		return driver.getCurrentUrl();
	}
public void CheckingAlllinks(String urlLink)
{     System.out.println("Total links are "+links.size()); 
for(int i=0; i<links.size(); i++) {
    WebElement element = links.get(i);
    url=element.getAttribute("href");
		System.out.println(url);
		try {
			URL ccc=new URL(urlLink);
			// Create a connection using URL object (i.e., link)
            HttpURLConnection httpConn =(HttpURLConnection)ccc.openConnection();
            //Set the timeout for 2 seconds
            httpConn.setConnectTimeout(2000);
            //connect using connect method
            httpConn.connect();
            //use getResponseCode() to get the response code. 
                if(httpConn.getResponseCode()== 200) {  
                    System.out.println(urlLink+" - "+httpConn.getResponseMessage());
                }
                if(httpConn.getResponseCode()== 404) {
                    System.out.println(urlLink+" - "+httpConn.getResponseMessage());
                }
		} catch (Exception e) {
			
			e.printStackTrace();
		}
}
}
}
