package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class CardSelectionPage extends Base {

	@FindBy(xpath ="/html/body/app-root/div/app-additional-details/div/app-card-selection/div[2]/button/span") WebElement nextbutton;

	public CardSelectionPage()
	{
	    PageFactory.initElements(driver, this);
	}



	public CommunicationScreen cardselect() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView();", nextbutton);
		
		nextbutton.click();
	    Thread.sleep(30000);
	    return new CommunicationScreen();
		
	}
	
}
