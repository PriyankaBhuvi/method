package com.alertsFrameWindows;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.BaseTest;

public class Alerts  extends BaseTest{
	/*
	public void getAlerts() {
		
	    driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	    driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	    driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	    driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	    */
		public void checkAleartsClicks() {
			
			getDriver().findElement(By.xpath("//button[@id='alertButton']")).click();	
			Alert okAlert = getDriver().switchTo().alert();
			okAlert.accept();
		}
		
		public void checkAlertButtonAfterSecounds() {
			try {
				getDriver().findElement(By.xpath("//div[@class='col']/preceding::button[@id='timerAlertButton']")).click();
				WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
				wait.until(ExpectedConditions.alertIsPresent());
				Alert closeAlert = getDriver().switchTo().alert();
				closeAlert.accept();
				System.out.println("Unexpected alert present");
				} 
			catch (NoAlertPresentException noAlertPresentException) {
				System.out.println("unexpected alert not present");
				}		
		}
		
		public void checkConfirmBoxClickOk() {
				
			getDriver().findElement(By.xpath("//div[@class='col']/preceding::button[@id='confirmButton']")).click();	

			String actual_msg = getDriver().switchTo().alert().getText();
			System.out.println("Msg :" +actual_msg);
			getDriver().switchTo().alert().accept();
		}
		
		public void checkPromtBoxByText() {
			getDriver().findElement(By.xpath("//button[@id='promtButton']")).click();	
			Alert promtAlert = getDriver().switchTo().alert();
			String alertText = promtAlert.getText();
			System.out.println("Text is :" +alertText);
			
		//	promtAlert.sendKeys("Execute");
		//	promtAlert.accept();		
		
	    
	}
	

}
