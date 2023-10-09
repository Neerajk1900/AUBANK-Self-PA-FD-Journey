//package com.qa.testcases;
//
//import java.awt.AWTException;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import com.qa.pages.CardSelectionPage;
//import com.qa.pages.CifSelectionPage;
//import com.qa.pages.CommunicationScreen;
//import com.qa.pages.DocumentSelectionPage;
//import com.qa.pages.EmployeeDetailsPage;
//import com.qa.pages.LandingPage;
//import com.qa.pages.PersonalDetailsPage;
//import com.qa.pages.SummaryScreenPage;
//import com.qa.util.Base;
//import com.qa.util.JiraPolicy;
//
//public class DocumentSelectionPageTest extends Base {
//
//	LandingPage landingpage;
//    CifSelectionPage cifselectionpage;
//    CommunicationScreen communicationscreen;
//    PersonalDetailsPage personaldetails;
//    EmployeeDetailsPage employeedetails;
//    CardSelectionPage cardselection;
//    DocumentSelectionPage documentselection;
//    SummaryScreenPage summaryscreen;
//    
//    
//    public DocumentSelectionPageTest(){
//        super();
//    }
//    
//    public WebDriver driver;
//    @BeforeClass
//    public void setup() 
//    {
//        
//    driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
// 
//    }
//    
//
//    
//    @Test(priority=1, enabled=true)
//    public void loginTest() throws InterruptedException{
//        
//        landingpage = new LandingPage();
//        cifselectionpage=landingpage.login(prop.getProperty("mobile"),prop.getProperty("Pan"));
//        
//    
//       
//    }
//    
//   // @JiraPolicy(logTicketReady=false)
//    
//    @Test(priority=2, enabled=true)
//    public void cifTest() throws InterruptedException
//    {
//       
//        communicationscreen=cifselectionpage.cifs();
//        
//    }
//    
//    @JiraPolicy(logTicketReady=false)
//    
//    @Test(priority=3, enabled=true)
//    public void addressTest() throws InterruptedException
//    {
//    	
//        
//    	personaldetails=communicationscreen.address();
//    }
//    
//    
//   @Test(priority=4, enabled=true)
//   public void PerTest() throws InterruptedException
//   {
//       employeedetails=personaldetails.PD();
//    
//   }
//   
//   
//   @Test(priority=5, enabled=true)
//   public void EmpTest() throws InterruptedException
//   {
//       cardselection=employeedetails.employeedetail(prop.getProperty("Designation"),prop.getProperty("Monthlysalary"),prop.getProperty("Address1"),prop.getProperty("Address2"));
//    
//   }
//   
//   
//   @Test(priority=6, enabled=true)
//   public void CardTest() throws InterruptedException
//   {
//       documentselection=cardselection.cardselect();
//   }
//   
//   @Test(priority=7, enabled=true)
//   public void summaryTest() throws Exception
//   {
//       summaryscreen=documentselection.document();
//   }
//   
//   
//    @AfterClass
//    public void tearDown() 
//    {
//        
//        driver.quit();
//        
//    }
//
//}
