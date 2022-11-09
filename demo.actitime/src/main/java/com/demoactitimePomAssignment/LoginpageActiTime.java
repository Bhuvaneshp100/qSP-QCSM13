package com.demoactitimePomAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageActiTime {
	public LoginpageActiTime (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	private WebElement usernametextfiled;

	@FindBy(name="pwd")
	private WebElement passwordtextfiled;
	
	@FindBy(xpath ="//div[text()='Login ']")
	private WebElement loginbutton;

	public WebElement getUsernametextfiled() {
		return usernametextfiled;
	}

	public void setUsernametextfiled(WebElement usernametextfiled) {
		this.usernametextfiled = usernametextfiled;
	}

	public WebElement getPasswordtextfiled() {
		return passwordtextfiled;
	}

	public void setPasswordtextfiled(WebElement passwordtextfiled) {
		this.passwordtextfiled = passwordtextfiled;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}
public void logins(String username ,String passward) {
usernametextfiled.sendKeys(username);
passwordtextfiled.sendKeys(passward);
loginbutton.click();
}

}

