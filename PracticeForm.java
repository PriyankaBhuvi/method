package com.formsTest;

import org.openqa.selenium.By;

import generic.BaseTest;

public class PracticeForm extends BaseTest {
    
	
	      public void getFirstname() {
	    	  getDriver().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ruhi");
	      }
	      public void getLastname() {
	    	  getDriver().findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Malhotra");

	      }
	      public void getEmail() {
	    	  getDriver().findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("Malhotra");

	      }
	      public void getGender() {

	    	  if(getDriver().equals("Female"))
	  			getDriver().findElement(By.xpath("//input[@id='gender-radio-2']")).click();
	  		else if(getDriver().equals("Male"))			
	  			getDriver().findElement(By.xpath("//input[@id='gender-radio-1']")).click();
	      } 
	      
	      public void getMobileNumber() {
	      getDriver().findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9901550610");
	      }
	      
	      public void getDateOfBirth() {
			getDriver().findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("20 Dec 2020");
	      }
	      
	      public void getSubject() {
			getDriver().findElement(By.xpath("//label[@id='subjects-label']")).sendKeys("Eng Maths Sci");
	      }
	      public void getHobbies() {
		 getDriver().findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).sendKeys("Sports");
		 getDriver().findElement(By.xpath("//label[@for='hobbies-checkbox-2']]")).sendKeys("Reading");
		  getDriver().findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).sendKeys("Music");
		  
	      }
		public void getCurrentAdress() {
			getDriver().findElement(By.id("currentAddress")).sendKeys("Belgaum");
		}
		 
		public void getStateAndCity() {
			getDriver().findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).sendKeys("Sports");

			
			
		}
	      }
			
			
			
			
			
			
			
			
			
			
			
			