 package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.demoactitimePOM.Loginpage;
import com.demoactitimePOM.Logout;

public class BaseClass1 {
	
		WebDriver driver=null;
		Propertyutil putil=new Propertyutil();
		@BeforeSuite
		public void configBS() {
		}
		@BeforeTest
		public void configBT() {
		}

		@BeforeClass
		public void configBC() {
			
			String browser=putil.getpropertydata(IPconstants.PROILE_PATH,"browser");
			String url=putil.getpropertydata(IPconstants.PROILE_PATH,IPconstants.URL_KEY);
			if(browser.equals("chrome")) {
				System.setProperty(IPconstants.CHROME_KEY, IPconstants.CHROME_PATH);
			driver=new ChromeDriver();
			}
			else if(browser.equals("firefox")) {
				System.setProperty(IPconstants.FIREFOX_KEY, IPconstants.FIREFOX_PATH);
				driver=new FirefoxDriver();
			}
			else {
				throw new IllegalArgumentException();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			}
		@BeforeMethod
		public void configBM() {
			Loginpage login=new Loginpage(driver);
			String username=putil.getpropertydata(IPconstants.PROILE_PATH,IPconstants.UN_KEY);
			String passward=putil.getpropertydata(IPconstants.PROILE_PATH,IPconstants.PW_KEY);
			login.logins(username, passward);
		}
		@AfterMethod
		public void configAM() {
			Logout logout=new Logout(driver);
			logout.logoutpage();
		}
		@AfterClass
		public void configAc() {
			driver.quit();
		}

		@AfterTest
		public void configAT() {

		}
		@AfterSuite
		public void configAS() {

		}

}
