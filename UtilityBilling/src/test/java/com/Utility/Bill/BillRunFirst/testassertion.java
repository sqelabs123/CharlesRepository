package com.Utility.Bill.BillRunFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class testassertion extends Sauce_Instance_Login_Test
{
	
	//protected WebDriver driver;
		 Repo_Test action_obj;
		 Assertion_Test Assertion_obj;
		 JavascriptExecutor executor;
		//public Testdata td;

	   public String customerNumber;
	    public String portalpassword = "123456";
	    String electPlan="Electricity Residential plan";// 17 nov "Electricity Flat Template Plan" changed
	    String mno;
	    boolean bValue = false;

		
		@Test(priority = 0)
		@Parameters({"url"})
		
		public void Login_Customer_Portal(String url) throws Exception{
			/*String mainurl = url;
			String adminurl = url+ "SrvCustomerPortalSettings";
			String portalurl = mainurl+"SrvCustomerPortal/"; //SrvCustomerPortal/#/
			Thread.sleep(1500);
			action_obj.admin_mainMenu().click();		
			//Click on Customer portal settings
			action_obj.custportal().click();		
			Thread.sleep(1000);
			//Scroll down
			executor.executeScript("window,scrollBy(0,800)", "");	
			
			Thread.sleep(2000);
		
			//Click on 'Save' button
					action_obj.portalsave().click();	  	
					Thread.sleep(4000); //Sleep time
					
					// hide // action_obj.loginportal().click();
					Thread.sleep(8000);  */
					//Open Customer Portal // navigation code // driver.navigate().to(portalurl);
					    driver.get("https://test.waterworkslms.com/waterworks/SrvCustomerPortal/");
					    Thread.sleep(4000);
					    driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/form/div/div[3]/div/input[2]")).sendKeys("40447");
						Thread.sleep(500);
								driver.findElement(By.id("password")).sendKeys(portalpassword);
//						action_obj.portalusername().sendKeys(customerNumber);
//						action_obj.portalpassword().sendKeys(portalpassword);
						//Click on 'Login' Button
						Thread.sleep(2000);            //    html/body/div[1]/div[1]/div[1]/form/div/button
						driver.findElement(By.xpath(".//*[@id='bttnGO']")).click();
						Thread.sleep(4000);
						//Click on 'Services' tab on user portal	
						driver.findElement(By.xpath(".//*[@id='sidebar-left']/ng-menu/div/ul/li[6]/a")).click();
						Thread.sleep(4000);
						driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[1]/span[4]/a")).click();// click on get usage profile
						Thread.sleep(5000);
						WebElement ImageFile = driver.findElement(By.xpath(".//*[@id='usageProfileLineChart']"));
				        
				        					    
					    
			
		}
}
