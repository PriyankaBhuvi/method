package com.alertsFrameWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import generic.BaseTest;

public class Frames  extends BaseTest {
	
	public void getFrames() {
		//getDriver().switchTo().frame(driver.findElement(By.xpath(".//iframe[@title='Fill Quote']")));
		WebElement frame =driver.findElement(By.xpath("//input[@id='sample']/iframe"));
		driver.switchTo().frame(frame);
		
		
	WebElement textbox = driver.findElement(By.xpath("html/body/section/div/div/div/input"));
	textbox.sendKeys("Selenium");
		
		
	}
	
	

}
