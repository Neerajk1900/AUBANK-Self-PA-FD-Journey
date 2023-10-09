package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class SummaryScreenPage extends Base {

@FindBy(xpath="/html/body/app-root/div/app-summary/div/div[2]/button") private WebElement okbutton;
    
    
    public SummaryScreenPage(){
        PageFactory.initElements(driver, this);
    }

    public void summary() throws InterruptedException
    {
    	
    	 
  	  JavascriptExecutor js = (JavascriptExecutor) driver;
  	  js.executeScript("arguments[0].scrollIntoView();", okbutton);
    	
        okbutton.click();
        Thread.sleep(8000);
    }
}
