package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	  public WebDriver creatbrowser(String browser) {
		  WebDriver driver=null;
		  
		  if(browser.equalsIgnoreCase("chrome")) {
			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		  }
		  return driver;
		  
		  
	  }
	
	  }

