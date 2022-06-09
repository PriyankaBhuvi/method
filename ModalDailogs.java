package com.alertsFrameWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import generic.BaseTest;

public class ModalDailogs  extends BaseTest {
	
	
	public void getSmallDailogs() {
		Actions action = new Actions(getDriver());
		
		getDriver().findElement(By.xpath("///button[@id='showSmallModal']")).click();
		 action.showSmallModal(element).perform();		
	}
	  public void getLargeDailogs() {
		getDriver().findElement(By.xpath("//button[@id='showLargeModal']")).click();
		 action.showLargeModal(element).perform();		

		
		

		
	}

}
