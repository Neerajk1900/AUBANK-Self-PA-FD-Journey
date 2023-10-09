package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Base;

public class CifSelectionPage extends Base {

	
    @FindBy(xpath = "/html/body/app-root/div/app-cif-selection/div/div[4]/form/div/mat-radio-group/mat-radio-button[1]/label/div[2]/div/div/div/div[1]") WebElement cif;
    @FindBy(xpath="/html/body/app-root/div/app-cif-selection/div/div[4]/form/div[2]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
 WebElement dropdown2;
    @FindBy(xpath = "//button[normalize-space()='Next']") WebElement next;
    
    
    public CifSelectionPage()
    {
        PageFactory.initElements(driver, this);
    }
    
     public String validateCifSelectionPageTitle1()
        {
            return driver.getTitle();
        }
    
    

    public CardSelectionPage cifs() throws InterruptedException {
       
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView();", cif);
    	
        cif.click();
       
        Thread.sleep(20000);
        
        dropdown2.click();
        Thread.sleep(20000);
        List<WebElement> nametypes=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span"));
        for(WebElement ntype:nametypes)
        {
            if(ntype.getText().equals("Salaried"))
            {
                ntype.click();
                break;
            }
        }
        Thread.sleep(8000);
        
        js.executeScript("arguments[0].scrollIntoView();", next);
        next.click();
          
        Thread.sleep(20000);
        
        return new CardSelectionPage();
    }
}
