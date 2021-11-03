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

public class Baseclass {
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
		
		String browser=putil.getpropertydata("src/test/resources/demoactitime.properties","browser");
		String url=putil.getpropertydata("src/test/resources/demoactitime.properties","url");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/main/resources/driver/geckodriver.exe");
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

		String username=putil.getpropertydata("src/test/resources/demoactitime.properties","username");
		String passward=putil.getpropertydata("src/test/resources/demoactitime.properties","password");
		Loginpage login=new Loginpage(driver);
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
//System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
//WebDriver driver=new ChromeDriver();