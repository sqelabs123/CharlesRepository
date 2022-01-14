package com.Utility.Bill.BillRunFirst;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class Customer_Portal extends Sauce_Instance_Login_Test
{
	
	//protected WebDriver driver;
	 com.Utility.Bill.Re_Usable.Repo_Test action_obj;
	 com.Utility.Bill.Re_Usable.Assertion_Test Assertion_obj;
	 JavascriptExecutor executor;
	//public Testdata td;

   public String customerNumber;
    public String portalpassword = "123456";
    String electPlan="Electricity Residential plan";// 17 nov "Electricity Flat Template Plan" changed
    String mno;
    boolean bValue = false;

	
	@Test(priority = 0)
	@Parameters({"url"})
	public void customer_creation(String url) throws Exception
	{
		
		String mainurl = url;
		String adminurl = url+ "SrvCustomerPortalSettings";
		String portalurl = mainurl+"SrvCustomerPortal/#/";
		
		System.out.println("...........................................ElectCreateCustomer_test class..................................................................");
		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		//Click on 'Customer' main menu
		action_obj.customer_main_menu().click();
		//Enter first name
		action_obj.customer_F_name().sendKeys("Johen");
		//Enter sure name
		action_obj.customer_sure_name().sendKeys("Smith");
		//Select category
		Select select = new Select(action_obj.Category_drop());
		select.selectByVisibleText("Business");
		
		List<WebElement> oSize2 = select.getOptions();
		int iListSize2 = oSize2.size();
		for(int i =0; i < iListSize2 ; i++){
		String sValue = select.getOptions().get(i).getText();
		System.out.println(sValue);  
		}
		//Enter Customer Address
		action_obj.cus_address1().sendKeys("Calle Ocho");
		action_obj.cus_address2().sendKeys("Miami");
		action_obj.billingState().sendKeys("FL");
		//Enable physical address toggle button
		action_obj.toggle_button().click();		
		action_obj.customer_country().sendKeys("US");
		//Enter mobile no
		action_obj.Phone_Mobile().sendKeys("78898525");
		Thread.sleep(10000);
		//17 novemeber hide Select Plan
		//17 novemeber hide  Select select2 = new Select(action_obj.select_plan());
		//17 novemeber hide select2.selectByVisibleText("Electricity Flat Template Plan");
		//Enter Email
		action_obj.Email().sendKeys("hello1@sqelabs.com");
		//Enter Billing Email
		action_obj.BEmail().sendKeys("hello@sqelabs.com");
///		executor.executeScript("window,scrollBy(0,1000)", "");
		//portal password
		action_obj.toggle_button().isEnabled();
		action_obj.allowaccesstoggle().click();
		//Enter portal password
		action_obj.portalpassword().sendKeys(portalpassword);
		executor.executeScript("window,scrollBy(0,1200)", "");
		//Click on 'Save' button
		action_obj.save_customer().click();
		//Click on 'Ok' button on popup window
		action_obj.ok().click();
		
		Assertion_obj.sucessfully_saved_customer_message_validation();
		customerNumber=action_obj.customer_number().getText();	
//		executor.executeScript("window,scrollBy(0,1200)", "");
		
		System.out.println("createCustElectrictyService");
		//Click on 'Overview' subtab
		action_obj.overview_menu().click();

		//Click on electricity plus icon
	action_obj.electricity_plus_icon().click(); 
	Assertion_obj.Electricity_service_page_header_validation(); 

	//Select Plan
		Select mydrpdwn = new Select(action_obj.plan_drop_down()); 
	 mydrpdwn.selectByVisibleText(electPlan);


	DateFormat dateFormat = new SimpleDateFormat("HHmmss");
	Calendar cal = Calendar.getInstance();
	System.out.println(dateFormat.format(cal.getTime()));
	mno=cal.getTime().toString(); 
	System.out.println(mno=mno.substring(11,19));
	mno=mno.replaceAll(":","");
	//Enter Meter No
	action_obj.meter_number().sendKeys("Ele"+mno); 
	 //Select Meter Configuration
	 Select mydrpdwn1 = new Select(action_obj.meterConfig_drop_down()); 
	mydrpdwn1.selectByVisibleText("Flat Rate"); 

	//Click on Toggle button
	action_obj.toggle_button().click();
	//Select Reading type
	Select mydrpdwn2 = new Select(action_obj.readding_drop_down()); 
	mydrpdwn2.selectByVisibleText("Consumption"); 
	
	executor.executeScript("window,scrollBy(0,1500)", "");
	//Click on 'Create Service' button
	action_obj.create_service_button().click();
	//Click on 'Ok' button on popup window
	action_obj.ok().click(); 
	//Assert with Utilities
	Assertion_obj.utilities_header_validation(); 
	//Assert with 'Overview' sub tab.
	Assertion_obj.Overview_text_Validation();
	System.out.println("*********************Customer creation class completed*********************");	
	Thread.sleep(5000);
	}
	
	



	@Test(priority = 1)
	@Parameters({"url"})
	public void Login_Customer_Portal(String url) throws Exception{
		String mainurl = url;
		String adminurl = url+ "SrvCustomerPortalSettings";
		String portalurl = mainurl+"SrvCustomerPortal/"; //SrvCustomerPortal/#/
		Thread.sleep(15000);
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
				Thread.sleep(8000);
				
			//Open Customer Portal // navigation code // 
				
				driver.navigate().to(portalurl);
				  //  driver.get(portalurl);
				    
				//Login Customer Portal
				Thread.sleep(2000);
				                                
					driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/form/div/div[3]/div/input[2]")).sendKeys(customerNumber);
				Thread.sleep(500);
						driver.findElement(By.id("password")).sendKeys(portalpassword);
//				action_obj.portalusername().sendKeys(customerNumber);
//				action_obj.portalpassword().sendKeys(portalpassword);
				//Click on 'Login' Button
				Thread.sleep(2000);            //    html/body/div[1]/div[1]/div[1]/form/div/button
				driver.findElement(By.xpath(".//*[@id='bttnGO']")).click();
				//Click on 'Services' tab on user portal				
				Thread.sleep(2000);
				
				
				
				
				//check assertion for monthly statements
//27 nov			String obj = driver.findElement(By.xpath(".//*[text()='Monthly Statements']")).getText(); //get the text which you want to assert
//27 nov			Assert.assertEquals("Monthly Statements", obj);// assert command
				
				Thread.sleep(3000);
				
				//click on Statements tab
			//8 dec 	driver.findElement(By.xpath(".//*[@id='sidebar-left']/ng-menu/div/ul/li[4]/a/span")).click();
				
				//check assertion for monthly statements
			// 27 nov hide	String obj1 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div/div/div[1]/h2|.//*[text()='Statements']")).getText(); //get the text which you want to assert
			//27 nov	Assert.assertEquals("Statements", obj1);// assert command
				
				
	
}
	
}