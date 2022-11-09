package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {

		@BeforeClass
		public void conficbc() {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("https://demo.actitime.com/login.do");
			
		}
		@BeforeMethod
		public void conficbm() {
			
		}
		@AfterMethod
		public void  conficam() {
			
		}
		@AfterClass
		public void  conficac() {
			
		}
	}


