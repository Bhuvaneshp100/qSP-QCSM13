package playwheel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayWheelPOM {

	  public PayWheelPOM(WebDriver driver) {
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
		public void loginpaywheel(String username,String pass) {
			usernametextfield.sendKeys(username);
			paswardtextfield.sendKeys(pass);
			loginbutton.click();

}}
