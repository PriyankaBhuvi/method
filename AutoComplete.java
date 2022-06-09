package com.widgets;

import org.openqa.selenium.By;

import generic.BaseTest;

public class AutoComplete  extends BaseTest {
	
	
	public void getMultipleColour() {

 getDriver().findElement(By.linkText("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("color");
        System.out.println("Color : "+Color);
	}
	
        public void getSingleColor() {
        	
        
     getDriver().findElement(By.linkText("//div[@class='auto-complete__value-container css-1hwfws3']")).sendKeys("color");
          System.out.println("Color : "+Color);
        }
}
