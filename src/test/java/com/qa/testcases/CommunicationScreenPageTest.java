package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.CardSelectionPage;
import com.qa.pages.CifSelectionPage;
import com.qa.pages.CommunicationScreen;
import com.qa.pages.LandingPage;
import com.qa.pages.PersonalDetailsPage;
import com.qa.util.Base;
import com.qa.util.JiraPolicy;

public class CommunicationScreenPageTest extends Base {

	LandingPage landingpage;
	CifSelectionPage cifselectionpage;
	CardSelectionPage cardselection;
	CommunicationScreen communicationscreen;
	PersonalDetailsPage personaldetailpage;
	
    public CommunicationScreenPageTest(){
        super();
    }
    
    public WebDriver driver;
    @BeforeClass
    public void setup() 
    {
        
    driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
 
    }
    
    @Test(priority=1, enabled=true)
    public void loginTest() throws InterruptedException
    {
        
        landingpage = new LandingPage();
        cifselectionpage=landingpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));
       
    }
    
 @JiraPolicy(logTicketReady=false)
    
    @Test(priority=3, enabled=true)
    public void cardTest() throws InterruptedException
    {
    	
        
    	communicationscreen=cardselection.cardselect();
    }
    
    @JiraPolicy(logTicketReady=false)
   
    @Test(priority=3, enabled=true)
    public void addressTest() throws InterruptedException
    {
    	
        
    	personaldetailpage=communicationscreen.address();
    }
    
   
	
    @AfterClass
    public void tearDown() 
    {
        
        driver.quit();
        
    }

	
}
