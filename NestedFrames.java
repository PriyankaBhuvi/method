package com.alertsFrameWindows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import generic.BaseTest;

public class NestedFrames  extends BaseTest {
	
	  public void getNestedframes() {
		//    driver.findElement(By.xpath("//button[@id='enableAfter']")).click();

		  WebElement topframe = driver.findElement(By.xpath("//frame[@name='Child Iframe']"));   
		  String frame1 =  driver.switchTo().frame(topframe).switchTo().frame("frame-left").findElement(By.xpath("//body")).getText();                
		  System.out.println(frame1);
		  List<WebElement> nestedFrames = driver.switchTo().frame(topframe).findElements(By.tagName("frame"));
		  System.out.println(nestedFrames.size());
		  
		  
		  
	  }
	 
	
	
	

}
