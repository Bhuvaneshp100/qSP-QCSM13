package com.demoactitimePOM;

 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebActionUtilty {
	WebDriver driver;
	Actions action;
	JavascriptExecutor js;
	public void enterdata(WebElement TargetElement,String KeysToEnter) {
		TargetElement.clear();
		TargetElement.sendKeys(KeysToEnter);
	}
	public void clickonwebelement(WebElement TargetElement) {
		TargetElement.click();;
	}
	public void mouseonwebelement(WebElement TargetElement) {
		action.moveToElement(TargetElement).perform();
		action.click();
	}
	public void rightclickonwebelement(WebElement TargetElement) {
		action.contextClick(TargetElement).perform();;
	}
	
	public void doubleclickonwebelement(WebElement TargetElement) {
		action.doubleClick(TargetElement).perform();;
	}
	
	public void draganddrop(WebElement sourse,WebElement destination) {
		action.dragAndDrop(sourse, destination).perform();
	}
	
	public void switchtofram(int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchtoframidandNAme(String idAndName) {
		driver.switchTo().frame(idAndName);
	}
	
	
	public void switchtoframtargetelement(String TargetElement) {
		driver.switchTo().frame(TargetElement);
	}
	
	
}
