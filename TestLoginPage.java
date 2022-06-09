package com.facebookTest;

import com.FacebookPages.LoginPage;
import com.alertsFrameWindows.Alerts;
import com.alertsFrameWindows.Frames;
import com.alertsFrameWindows.ModalDailogs;
import com.automationTest.Buttons;
import com.automationTest.RadioButton;
import com.widgets.AutoComplete;

import generic.BaseTest;

public class TestLoginPage extends BaseTest{

	public static void main(String[] args) {
		     //TestBox :
		LoginPage objLoginPage =new LoginPage();
		objLoginPage.initilizeWebDriver("https://demoqa.com/text-box");
			objLoginPage.getTextBoxDetails();
		
			//CheckBox :
		CheckBox objCheckBox = new CheckBox();
		objCheckBox.initilizeWebDriver("https://demoqa.com/checkbox");
		objCheckBox.clickSVGToggleIcon();
		objCheckBox.checkDesktopCheckBox();
		objCheckBox.checkDocumentCheckBox();
	   objCheckBox.checkDownloadsCheckBox();
		
		   //Radio button :
		RadioButton objRadioButton = new RadioButton();
		objRadioButton.initilizeWebDriver("https://demoqa.com/radio-button");
		objRadioButton.checkRadioButton();
        
		
		   //Web Tables :
      	WebTables objWebTables = new WebTables();
		objWebTables.initilizeWebDriver("https://demoqa.com/webtables");
		objWebTables.webTableInfo();
   
             //Buttons ;
		Buttons objButtons = new Buttons();
		objButtons.initilizeWebDriver("https://demoqa.com/buttons");
		objButtons.checkButtons();
		objButtons.checkRightClickkButtons();
		objButtons.checkClickButtons();
   
		
       
                 //DyanamicPro :
           DyanamicPro objDyanamicPro = new DyanamicPro();
           objDyanamicPro.initilizeWebDriver("https://demoqa.com/dynamic-properties");
          objDyanamicPro.checkDynamicProperties();
   
           
                // BrokenlinkImg :
          BrokenlinkImg objBrokenlinkImg = new BrokenlinkImg();
         objBrokenlinkImg.initilizeWebDriver("https://demoqa.com/broken");
         objBrokenlinkImg.checkPrintAllLinks();
   
                //UploadAndDown :
         UploadAndDown objUploadAndDown = new UploadAndDown();
         objUploadAndDown.initilizeWebDriver("https://demoqa.com/upload-download");
         objUploadAndDown.checkDownload();

		      //PracticeForm:
		PracticeForm objPracticeForm = new PracticeForm();
	    objPracticeForm.initilizeWebDriver("https://demoqa.com/automation-practice-form");
		objPracticeForm.getFirstname();
		objPracticeForm.getLastname();
		objPracticeForm.getGender();
		objPracticeForm.getMobileNumber();
		objPracticeForm.getEmail();
		objPracticeForm.getSubject();https://demoqa.com/browser-windows
		
		       //Alerts, Frame & Windows:
	   BrowserWindows objBrowserWindows= new BrowserWindows();
	    objBrowserWindows.initilizeWebDriver("//https://demoqa.com/browser-windows");
		objBrowserWindows.getBrowseWindows();
	
             //Alerts:
	  Alerts objAlerts = new Alerts();
	  objAlerts.initilizeWebDriver("https://demoqa.com/alerts");
	  objAlerts.checkAleartsClicks();
	  objAlerts.checkAlertButtonAfterSecounds();
	  objAlerts.checkConfirmBoxClickOk();
	  objAlerts.checkPromtBoxByText();
	 
	  
	       //Frames :
	  Frames objFrames = new Frames();
	  objFrames.initilizeWebDriver("https://demoqa.com/frames");
	  objFrames.getFrames();
	  
	       //ModalDailogs :-
	  ModalDailogs objModalDailogs =new ModalDailogs();
	  objModalDailogs.initilizeWebDriver("https://demoqa.com/modal-dialogs");
	  objModalDailogs.getSmallDailogs();
	  objModalDailogs.getLargeDailogs();
	  
	     //AutoComplete :-
	  AutoComplete objAutoComplete = new AutoComplete();
	  objAutoComplete.initilizeWebDriver("https://demoqa.com/auto-complete");
	  objAutoComplete.getMultipleColour();
	  objAutoComplete.getSingleColor();

	}
	
	
}

	
	
	
























	
