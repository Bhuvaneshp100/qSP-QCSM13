package paywheel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import playwheel.PayWheelPOM;

public class methods {
	
public void  test3() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.get("https://paywheelcloud.paywheel.net/");
	PayWheelPOM  login=new PayWheelPOM(driver);
	login.loginpaywheel("100003","welcome");
	driver.quit();	
}
}