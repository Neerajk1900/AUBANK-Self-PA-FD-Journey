//package com.qa.pages;
//
//
//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.datatransfer.StringSelection;
//import java.awt.event.KeyEvent;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import com.qa.util.Base;

//
//public class DocumentSelectionPage extends Base {
//
//	@FindBy(xpath="/html/body/app-root/div/app-upload-document/div/div/form/div[3]/div[1]/input")  WebElement salaryslip1;
//    @FindBy(xpath="/html/body/app-root/div/app-upload-document/div/div/form/div[3]/div[2]/input")  WebElement salaryslip2;
////       
////    @FindBy(xpath="/html/body/app-root/div/app-upload-document/div/div/form/div[5]/div")  WebElement bankstatement1;
////    @FindBy(xpath="/html/body/app-root/div/app-upload-document/div/div/form/div[5]/div[2]")  WebElement bankstatement2;
////    @FindBy(xpath="/html/body/app-root/div/app-upload-document/div/div/form/div[5]/div[3]")  WebElement bankstatement3;
////       
//    @FindBy(xpath="/html/body/app-root/div/app-upload-document/div/div/form/div[4]/button[2]/span")  WebElement nextbutton;
//   
//
//    public DocumentSelectionPage(){
//           PageFactory.initElements(driver, this);
//       }
//public SummaryScreenPage document() throws InterruptedException, Exception
//{
////	JavascriptExecutor js=(JavascriptExecutor)driver;
////    js.executeScript("arguments[0].click();" ,salaryslip1);
////    Robot rb=new Robot();
////    rb.delay(2000);
////    StringSelection ss= new StringSelection("C:\\\\Users\\\\abhijit.satpute\\\\Pictures\\\\Saved Pictures\\\\jSON");
////    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
////    rb.keyPress(KeyEvent.VK_CONTROL);
////    rb.keyPress(KeyEvent.VK_V);
////    rb.keyRelease(KeyEvent.VK_CONTROL);
////    rb.keyRelease(KeyEvent.VK_V);
////    rb.keyRelease(KeyEvent.VK_ENTER);
////    rb.keyRelease(KeyEvent.VK_ENTER);
////    Thread.sleep(8000);
//
//	
//   salaryslip1.sendKeys("C:\\Users\\abhijit.satpute\\Pictures\\Saved Pictures\\jSON\\breakdown.png");
//   Thread.sleep(20000);
//   salaryslip2.sendKeys("C:\\\\Users\\\\abhijit.satpute\\\\Pictures\\\\Saved Pictures\\\\jSON\\\\breakdown.png");
//   Thread.sleep(20000);
////   bankstatement1.sendKeys("C:\\Users\\abhijit.satpute\\Pictures\\Saved Pictures\\jSON");
////   Thread.sleep(20000);
////   bankstatement2.sendKeys("C:\\Users\\abhijit.satpute\\Pictures\\Saved Pictures\\jSON");
////   Thread.sleep(20000);
////   bankstatement3.sendKeys("C:\\Users\\abhijit.satpute\\Pictures\\Saved Pictures\\jSON");
////   Thread.sleep(20000);
//   nextbutton.click();
//   Thread.sleep(20000);
//   return new SummaryScreenPage();
//   
//}
//}
