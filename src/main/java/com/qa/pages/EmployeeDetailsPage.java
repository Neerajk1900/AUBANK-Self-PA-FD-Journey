package com.qa.pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.Base;


public class EmployeeDetailsPage extends Base{
	
//	@FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-employee-detail/div/form/div[1]/mat-form-field/div/div[1]/div")
//    WebElement dropdown2;
    
    @FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-employee-detail/div/form/div[3]/div[1]/mat-form-field[1]/div/div[1]/div/div/input")
    WebElement employername;
    
    
    //span[normalize-space()='SANGAM FASHIONS PVT LTD']
    @FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-employee-detail/div/form/div[3]/div[1]/mat-form-field[2]/div/div[1]/div/input")
    WebElement designation;
    @FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-employee-detail/div/form/div[3]/div[1]/mat-form-field[3]/div/div[1]/div/input")
    WebElement monthlysalary;
    @FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-employee-detail/div/form/div[3]/div[3]/mat-form-field[1]/div/div[1]/div/input")WebElement addressline1;
    @FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-employee-detail/div/form/div[3]/div[3]/mat-form-field[2]/div/div[1]/div/input")WebElement addressline2;
    @FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-employee-detail/div/form/div[3]/div[4]/mat-form-field[1]/div/div[1]/div/input")WebElement pincode;
    
    @FindBy(xpath="//label[@for='mat-radio-17-input']//div[@class='mat-radio-inner-circle']")WebElement radiobuttonno;
    @FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-employee-detail/div/form/div[3]/div[8]/mat-checkbox/label/div")WebElement checkbox;
    @FindBy(xpath="/html/body/app-root/div/app-additional-details/div/app-employee-detail/div/form/div[4]/button[2]")WebElement nextbutton2;  
    
     public EmployeeDetailsPage()
        {
            PageFactory.initElements(driver, this);
        }
    
    
    public SummaryScreenPage employeedetail() throws InterruptedException
    {
//        dropdown2.click();
//         Thread.sleep(20000);
//         List<WebElement> nametypes=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span"));
//         for(WebElement ntype:nametypes)
//         {
//             if(ntype.getText().equals("Salaried"))
//             {
//                 ntype.click();
//                 break;
//             }
//         }
//         Thread.sleep(8000);
        
        employername.sendKeys("sangam");
        
       // employername.click();
        Thread.sleep(10000);
        List<WebElement> employer=driver.findElements(By.xpath("/html/body/div[2]/div/div/div/mat-option[2]/span"));
        for(WebElement em:employer)
        {
            if(em.getText().equals("SANGAM INDIA LIMITED"))
            {
                em.click();
                break;
            }
        }
         Thread.sleep(5000);
        designation.sendKeys("QA");
        Thread.sleep(3000);
        monthlysalary.sendKeys("70000");
        Thread.sleep(3000);
        addressline1.sendKeys("addressline1");
        Thread.sleep(3000);
        addressline2.sendKeys("addressline2");
        Thread.sleep(3000);
        pincode.sendKeys("110011");
        Thread.sleep(5000);
       
        checkbox.click();
        Thread.sleep(10000);
        nextbutton2.click();
        Thread.sleep(20000);
        return new SummaryScreenPage();
    }


    public String validateEmployeedetailspageTitle1() {
        // TODO Auto-generated method stub
        return driver.getTitle();
    }

}
