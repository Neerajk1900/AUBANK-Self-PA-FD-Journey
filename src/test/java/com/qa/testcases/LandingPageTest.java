package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.CifSelectionPage;
import com.qa.pages.LandingPage;
import com.qa.util.Base;
import com.qa.util.JiraPolicy;

public class LandingPageTest extends Base{

	LandingPage landingpage;
    CifSelectionPage cifselectionpage;
   
    
    
    
    public LandingPageTest(){
        super();
    }
    
    public WebDriver driver;
    @BeforeClass
    public void setup() {
        
        driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
        //
        
    }
    
    @AfterClass
    public void tearDown() {
        
        driver.quit();
        
    }
    /*@JiraPolicy(logTicketReady=false)
    @Test(priority=1, enabled=true)
    
public void validateLandingPageTitle1(){
        
        String title = landingpage.validateLandingPageTitle1();
        Assert.assertEquals(title, "Credit Card Online | AU Small Finance Bank");
    }*/
    
    @JiraPolicy(logTicketReady=false)
    //@Test(priority=2, dataProvider="excelData",enabled=true)
    
    @Test(priority=2, enabled=true)
    public void loginTest() throws InterruptedException{
        
        landingpage = new LandingPage();
        cifselectionpage=landingpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));
        
    
        //landingpage.login(mobile, Pan);
        /*cifselectionpage=landingpage.login(mobile, Pan);
        communicationpage=cifselectionpage.cifs();
        personaldetailspage=communicationpage.communication();*/
    }
    
//    @DataProvider(name = "excelData")
//    public Object[][] supplyTestData() {
//        
//        Object[][] data =  Utilities.getTestDataFromExcel("Login");
//        return data;
//    }
    
    
//    @org.testng.annotations.AfterClass
//    public void AfterClass() throws EmailException, InterruptedException{
//        SendEmailJava.SendEmail();
//}
}
