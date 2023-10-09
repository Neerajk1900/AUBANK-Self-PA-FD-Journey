package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.CardSelectionPage;
import com.qa.pages.CifSelectionPage;
import com.qa.pages.CommunicationScreen;
import com.qa.pages.EmployeeDetailsPage;
import com.qa.pages.LandingPage;
import com.qa.pages.PersonalDetailsPage;
import com.qa.util.Base;
import com.qa.util.JiraPolicy;

public class PersonalDetailsPageTest extends Base {

	LandingPage landingpage;
    CifSelectionPage cifselectionpage;
    CommunicationScreen communicationscreen;
    PersonalDetailsPage personaldetails;
    EmployeeDetailsPage employeedetails;
    CardSelectionPage cardselection;
    
    
    public PersonalDetailsPageTest(){
        super();
    }
    
    public WebDriver driver;
    @BeforeClass
    public void setup() 
    {
        
    driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
 
    }
    

    
    @Test(priority=1, enabled=true)
    public void loginTest() throws InterruptedException{
        
        landingpage = new LandingPage();
        cifselectionpage=landingpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));
        
    
       
    }
    
   // @JiraPolicy(logTicketReady=false)
    
    @Test(priority=2, enabled=true)
    public void cifTest() throws InterruptedException
    {
       
    	cardselection=cifselectionpage.cifs();
        
    }
    
    @JiraPolicy(logTicketReady=false)
    
    @Test(priority=3, enabled=true)
    public void addressTest() throws InterruptedException
    {
    	
        
    	communicationscreen=cardselection.cardselect();
    }
    
   //@JiraPolicy(logTicketReady=false)
   
   @Test(priority=4, enabled=true)
   public void PerTest() throws InterruptedException
   {
	   personaldetails=communicationscreen.address();
    
   }
   
   @Test(priority=5, enabled=true)
   public void empTest() throws InterruptedException
   {
     employeedetails=personaldetails.PD();
  
   }
   
    @AfterClass
    public void tearDown() 
    {
        
        driver.quit();
        
    }
	
}
