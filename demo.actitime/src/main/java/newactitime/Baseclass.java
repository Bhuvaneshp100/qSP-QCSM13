package newactitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.generic.IPconstants;

public class Baseclass {
	WebDriver driver;
	Propertyfileacti putil=new Propertyfileacti();
	@BeforeClass
	public void confictbc() {
		String url=putil.getpropertydate(IPconstants.PROILE_PATH,IPconstants.URL_KEY);
	
		System.setProperty(IPconstants.CHROME_KEY, IPconstants.CHROME_PATH);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	@BeforeMethod
	public void confictbm() {
		String admin=putil.getpropertydate(IPconstants.PROILE_PATH,IPconstants.UN_KEY);
		String manager=putil.getpropertydate(IPconstants.PROILE_PATH,IPconstants.PW_KEY);
		Pom login=new Pom(driver);
		login.login(admin,manager);
		
	}
	@AfterMethod
	public void confictam() {
		
	}
	@AfterClass
	public void confictac() {
		driver.quit();
		
	}
	

}
