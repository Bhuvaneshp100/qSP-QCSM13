package com.demoactitimePomAssignment;

import javax.swing.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrack {
	public  TimeTrack(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id = "addTaskButtonId")
	private WebElement NewTimeTrack;
	
	@FindBy(xpath = "//table[@class='createTasksTable hideAddToTT']/descendant::td[@class='nameCell first'][1]")
	private WebElement EnterName;
	
	@FindBy(xpath = "//div[text()='Create Tasks']")
	private WebElement CreatTask;

	public WebElement getNewTimeTrack() {
		return NewTimeTrack;
	}

	public void setNewTimeTrack(WebElement newTimeTrack) {
		NewTimeTrack = newTimeTrack;
	}

	public WebElement getCreatTask() {
		return CreatTask;
	}

	public void setCreatTask(WebElement creatTask) {
		CreatTask = creatTask;
	}
	public void TimeTracks(String name) {
		NewTimeTrack.click();
	//	Action sendkey=new Action();
		EnterName.sendKeys(name);
		CreatTask.click();
	}
}