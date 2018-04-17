package com.SB.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.SB.qa.util.TestUtil;

public class TestBase {
public static WebDriver driver;
public static Properties prop;


	public TestBase() {
	
		try {
			prop=new Properties();
			FileInputStream fs=new FileInputStream("D:\\Selenium\\Socioboard\\src\\main\\java\\com\\SB\\qa\\config\\config.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	        }
	
	public static void initilization() {
	
		String browsename = prop.getProperty("browser");
		if(browsename.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		driver=new ChromeDriver();
                                  }
		
		else if(browsename.equals("Firefox")) {			
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		driver=new FirefoxDriver();
		                      }
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicitywait_timeout,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	public Screen sikuliApi() throws FindFailed
	{
		Screen sc= new Screen();
	   Pattern pattern=new Pattern("SikuliImgadress");
		sc.click(pattern);
		return sc;
	}
	
	
	
}
