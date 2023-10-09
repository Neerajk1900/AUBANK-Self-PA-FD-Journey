package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class CommunicationScreen extends Base{

@FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-comm-address/div[1]/form/div[1]/mat-radio-group/mat-radio-button/label/div[2]/div") WebElement cbs;
	
@FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-comm-address/div[2]/button[2]") WebElement next;

public CommunicationScreen()
{
    PageFactory.initElements(driver, this);
}

 public String validateCommunicationScreenTitle1()
    {
        return driver.getTitle();
    }
 public PersonalDetailsPage address() throws InterruptedException {

	 JavascriptExecutor js = (JavascriptExecutor) driver;
 	js.executeScript("arguments[0].scrollIntoView();", cbs);
	 
	 
     cbs.click();

     Thread.sleep(1000);
     
     js.executeScript("arguments[0].scrollIntoView();", next);
     
       
     next.click();
       
     Thread.sleep(10000);
     
     return new PersonalDetailsPage();
 }

 

}
