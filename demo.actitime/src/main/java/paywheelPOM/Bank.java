package paywheelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bank {

	  public Bank(WebDriver driver) {
		  PageFactory.initElements( driver,this);
	}
	  
	 @FindBy(xpath = "//mat-icon[@title='Admin Services']")
	 private WebElement  adminservice;
	 
	 @FindBy(xpath = "//span[text()=' Banks ']")
	 private WebElement  banks;

	public WebElement getAdminservice() {
		return adminservice;
	}

	public void setAdminservice(WebElement adminservice) {
		this.adminservice = adminservice;
	}

	public WebElement getBanks() {
		return banks;
	}

	public void setBanks(WebElement banks) {
		this.banks = banks;
	}
	 public void bankdetailspage() throws InterruptedException {
		 adminservice.click();
		 Thread.sleep(4000);
		 banks.click();
	 }

}
