package paywheelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import paywheel.ExcelData;

public class PayWheelPOMmangerAccount {

	  public PayWheelPOMmangerAccount(WebDriver driver) {
		  PageFactory.initElements( driver,this);
	}
	  @FindBy(xpath = "//input[@name='userName']")
		private WebElement usernametextfield;
		
		@FindBy(name = "passWord")
		private WebElement paswardtextfield;
		
		@FindBy(xpath = "//button[text()='Sign In']")
		private WebElement loginbutton;

		
		public WebElement getUsernametextfield() {
			return usernametextfield;
		}


		public void setUsernametextfield(WebElement usernametextfield) {
			this.usernametextfield = usernametextfield;
		}


		public WebElement getPaswardtextfield() {
			return paswardtextfield;
		}


		public void setPaswardtextfield(WebElement paswardtextfield) {
			this.paswardtextfield = paswardtextfield;
		}


		public WebElement getLoginbutton() {
			return loginbutton;
		}


		public void setLoginbutton(WebElement loginbutton) {
			this.loginbutton = loginbutton;
		}


		public void loginpaywheel() {
			ExcelData excel=new ExcelData();
			 int username = excel.getnumericlexceldate(2, 1);
			String pass = excel.getstringexceldate(3, 1);
			usernametextfield.sendKeys(Integer.toString(username));
			paswardtextfield.sendKeys(pass);
			loginbutton.click();

        }
}
