package com.demoactitimeAssignment;

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

import com.demoactitimePOM.Logout;
import com.demoactitimePomAssignment.LoginpageActiTime;
import com.demoactitimePomAssignment.TimeTrack;

public class BaseClassAssig {

	WebDriver driver=null;
	PropertUtilActiTime putils=new PropertUtilActiTime();
	@BeforeSuite
	public void configBS() {
	}
	@BeforeTest
	public void configBT() {
	}

	@BeforeClass
	public void configBC() {
		
		String browser=putils.getpropertydata(IPconstantActitime.PROILE_PATH,"browser");
		String url=putils.getpropertydata(IPconstantActitime.PROILE_PATH,IPconstantActitime.URL_KEY);
		if(browser.equals("chrome")) {
			System.setProperty(IPconstantActitime.CHROME_KEY, IPconstantActitime.CHROME_PATH);
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty(IPconstantActitime.FIREFOX_KEY, IPconstantActitime.FIREFOX_PATH);
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
		
		String username=putils.getpropertydata(IPconstantActitime.PROILE_PATH,IPconstantActitime.UN_KEY);
		String passward=putils.getpropertydata(IPconstantActitime.PROILE_PATH,IPconstantActitime.PW_KEY);
		String name=putils.getpropertydata(IPconstantActitime.PROILE_PATH,"name");
		
		LoginpageActiTime login=new LoginpageActiTime(driver);
		login.logins(username, passward);
		
		TimeTrack timetracknew=new TimeTrack(driver);
		timetracknew.TimeTracks(name);
		
	}
	@AfterMethod
	public void configAM(){
		Logout logout=new Logout(driver);
		logout.logoutpage();
	}
	@AfterClass
	public void configAc() {
	//	driver.quit();
	}

	@AfterTest
	public void configAT() {

	}
	@AfterSuite
	public void configAS() {

	}
}
