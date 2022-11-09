package newactitime;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	public Pom(WebDriver driver ) {
	PageFactory.initElements(driver,this);	
	}
	@FindBy(name="userName")
	private WebElement usernametextfield;
	
	@FindBy(name="passWord")
	private WebElement paswardtextfield;
	
	@FindBy(id = "loginButton")
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
	public void login(String name,String pasward) {
		usernametextfield.sendKeys("admin");
		paswardtextfield.sendKeys("manager");
		loginbutton.click();
		
	}

}
