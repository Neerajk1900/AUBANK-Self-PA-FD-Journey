package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class LandingPage extends Base {

	 	@FindBy(xpath="//input[@id='mat-input-1']") private WebElement mobile;
	    
	    @FindBy(xpath="//input[@id='mat-input-0']") private WebElement pan;
	    
	    @FindBy(xpath="//*[@id=\"mat-checkbox-1\"]/label/div") private WebElement checkbox;
	    
	    @FindBy(xpath="/html/body/app-root/div/app-mobile-number/div[2]/div[2]/button[1]") private WebElement getotp;
	    
	    @FindBy(xpath="/html/body/app-root/div/app-mobile-number/div[2]/div[2]/button") private WebElement verifyotp;



	    //Initializing the Page Objects:
	    public LandingPage(){
	        PageFactory.initElements(driver, this);
	    }

	    //Actions:
	    /*public String validateLandingPageTitle1() {
	        // TODO Auto-generated method stub
	        return driver.getTitle();

	    }*/


	    public  CifSelectionPage login(String Mobile, String PAN) throws InterruptedException
	    {
	    mobile.sendKeys(Mobile);
	    Thread.sleep(2000);
	    pan.sendKeys(PAN);
	    Thread.sleep(50000);
	    checkbox.click();
	    Thread.sleep(20000);
	    getotp.click();
	    Thread.sleep(8000);
	    verifyotp.click();
	    Thread.sleep(15000);
	    return new CifSelectionPage();

	        

	        //password.sendKeys(pwd);
	        //loginButton.click();
	        //JavascriptExecutor js = (JavascriptExecutor)driver;
	        //    js.executeScript("arguments[0].click();", loginBtn);

	        //return new HomePage();
	    }
}
