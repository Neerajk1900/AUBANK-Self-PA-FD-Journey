package com.qa.pages;

import com.qa.util.Base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	


	public class PersonalDetailsPage extends Base {

	    
@FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-personal-detail/div/form/div[3]/mat-form-field[4]/div/div[1]/div/mat-select/div/div[1]/span") WebElement drop;
	       
@FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-personal-detail/div/form/div[3]/mat-form-field[5]/div/div[1]/div/input") WebElement mothername;
	     
@FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-personal-detail/div/form/div[3]/mat-form-field[6]/div/div[1]/div/input") WebElement personalemailid;
	     
@FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-personal-detail/div/form/div[4]/button[2]") WebElement nextbutton1;
	        

	     public PersonalDetailsPage()
	        {
	            PageFactory.initElements(driver, this);
	        }
	     public String validatePersonalDetailPageTitle1()
	        {
	            return driver.getTitle();
	        }
	     
	      public  EmployeeDetailsPage PD() throws InterruptedException
	        {
	    	  
	    	  JavascriptExecutor js = (JavascriptExecutor) driver;
	    	  js.executeScript("arguments[0].scrollIntoView();", drop);
	    	  
	          drop.click();
	          Thread.sleep(5000);
	         List<WebElement> nametypes=driver.findElements(By.xpath("//html/body/div[2]/div[2]/div/div/div/mat-option[1]/span"));
	          
	         for(WebElement ntype:nametypes)
	         {
	             if(ntype.getText().equals("2168 20101 100"))
	             {
	                 ntype.click();
	                 break;
	             }
	         }
	         Thread.sleep(5000);
	         
	         js.executeScript("arguments[0].scrollIntoView();", mothername);
	        
	         mothername.sendKeys("Mother");
	         Thread.sleep(5000);
	         
	         js.executeScript("arguments[0].scrollIntoView();", personalemailid);
	         
	         personalemailid.sendKeys("abhijit.satpute@decimal.co.in");
	         Thread.sleep(10000);
	         
	         js.executeScript("arguments[0].scrollIntoView();", nextbutton1);
	         
	        
	         nextbutton1.click();
	         Thread.sleep(10000);
	        
	        return new EmployeeDetailsPage();
	        
	        }
	     

	}

