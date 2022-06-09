package com.alertsFrameWindows;

import org.openqa.selenium.By;

import generic.BaseTest;

public class BrowserWindows  extends BaseTest{
	
	public void getBrowseWindows() {
		getDriver().findElement(By.xpath("//button[@id='tabButton']")).click();
		getDriver().findElement(By.xpath("//button[@id='windowButton']")).click();
		getDriver().findElement(By.xpath("////button[@id='messageWindowButton']")).click();

	}
	

}
