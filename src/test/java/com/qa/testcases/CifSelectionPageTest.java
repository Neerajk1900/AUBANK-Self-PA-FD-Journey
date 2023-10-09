package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.CardSelectionPage;
import com.qa.pages.CifSelectionPage;
import com.qa.pages.CommunicationScreen;
import com.qa.pages.LandingPage;
import com.qa.util.Base;
import com.qa.util.JiraPolicy;

public class CifSelectionPageTest extends Base{
   
	LandingPage landingpage;
	CifSelectionPage cifselectionpage;
	 CardSelectionPage cardselection;
	
    public CifSelectionPageTest(){
        super();
    }
    
    public WebDriver driver;
    @BeforeClass
    public void setup() 
    {
        
    driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
 
    }
    

    /*@JiraPolicy(logTicketReady=false)
    @Test(priority=1, enabled=true)
    
	public void validateLandingPageTitle1(){
        
        String title = landingpage.validateLandingPageTitle1();
        Assert.assertEquals(title, "Credit Card Online | AU Small Finance Bank");
    }*/
    @Test(priority=1, enabled=true)
    public void loginTest() throws InterruptedException
    {
        
        landingpage = new LandingPage();
        cifselectionpage=landingpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));
       
    }
    
    @JiraPolicy(logTicketReady=false)
    
    @Test(priority=2, enabled=true)
    public void cifTest() throws InterruptedException
    {
    	
    	cardselection=cifselectionpage.cifs();
        
    }
    
//    @DataProvider(name = "excelData")
//    public Object[][] supplyTestData() 
//   {
//        
//        Object[][] data =  Utilities.getTestDataFromExcel("Login");
//        return data;
//    }
    
//    @org.testng.annotations.AfterClass
//    public void AfterClass() throws EmailException, InterruptedException
//    {
//        SendEmailJava.SendEmail();
//    }
	
    @AfterClass
    public void tearDown() 
    {
        
        driver.quit();
        
    }

}
