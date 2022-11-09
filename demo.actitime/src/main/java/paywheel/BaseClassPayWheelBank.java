package paywheel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

 
import io.github.bonigarcia.wdm.WebDriverManager;
import paywheelPOM.Bank;
import paywheelPOM.BankDetails;
import paywheelPOM.PayWheelPOMmangerAccount;

public class BaseClassPayWheelBank {
	WebDriver driver=null;
	ExcelData excel=new ExcelData();

	@BeforeClass
	public void baseclass() throws InterruptedException{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String url = excel.getstringexceldate(1, 1);	
		driver.get(url);
		PayWheelPOMmangerAccount login=new PayWheelPOMmangerAccount(driver);
		login.loginpaywheel();
		
		Bank  openbankdetail=new Bank(driver);
		openbankdetail.bankdetailspage();
		Thread.sleep(10000);
		
		BankDetails enterbankdetails= new BankDetails(driver);
		enterbankdetails.bankdetails();
		
		//String sdcsd = driver.findElement(By.xpath("//span[text()='SBIN0004253']")).getText();
	//System.out.println(sdcsd);

	}

}
