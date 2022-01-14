package com.Utility.Bill.BillRunFirst;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class Customerportal extends Sauce_Instance_Login_Test {
	
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
	public void customer_creation(String url) throws Exception{
		
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
		action_obj.Email().sendKeys("mr.vipulkkr@gmail.com");
		//Enter Billing Email
		action_obj.BEmail().sendKeys("vipul.sharma@sqelabs.com");
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
	public void Enable_edit_service(String url) throws Exception{
		String mainurl = url;
		String adminurl = url+ "SrvCustomerPortalSettings";
		String portalurl = mainurl+"SrvCustomerPortal/"; //SrvCustomerPortal/#/
		Thread.sleep(15000); // /* 1 dec for win energy
		
		if ( ! action_obj.smtpcheck().isSelected() )
		{
			 action_obj.smtpcheck().click();
		}  
		
//		driver.get(mainurl);
		//Click on 'Admin' mainmenu
		
		
			action_obj.admin_mainMenu().click();
		
		//Click on Customer portal settings
		action_obj.custportal().click();
		
		Thread.sleep(1000);
		
		executor.executeScript("window,scrollBy(0,400)", "");
		
		Thread.sleep(2000);
		
		//Turn off 'Account Detail' toggle
		List<WebElement> checkbox = driver.findElements(By.xpath(".//*[@id='divCol1']/div/div/div[2]/form/div/div[8]/div[2]/div/div/label/span[1]"));
//		((WebElement) checkbox.get(0)).click();		
		Thread.sleep(2000);  // Sleep time
		
		bValue = checkbox.get(0).isSelected();
		if(bValue = true){
			System.out.println("Click on true value");
			checkbox.get(0).click();
			 
		 }else{
			 System.out.println("Click on false value");
//			 checkbox.get(1).click();
			 
		 }
		
		Thread.sleep(2000);	//Sleep time	
		action_obj.accountdetail().click();
		
		Thread.sleep(5000);//Sleep time
		
		//Turn on 'Service Edit' toggle button
		action_obj.serviceedit().click();
		
		Thread.sleep(2000);//Sleep time
		
		executor.executeScript("window,scrollBy(0,200)", "");
		
		Thread.sleep(6000);//Sleep time		
		//Click on 'Save' button
		action_obj.portalsave().click();	  	
		Thread.sleep(4000); //Sleep time
		
		// hide // action_obj.loginportal().click();
		Thread.sleep(8000);
		//Open Customer Portal // navigation code // driver.navigate().to(portalurl);
		    driver.get(portalurl);
		    
		//Login Customer Portal
		Thread.sleep(2000);
		                                
			driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/form/div/div[3]/div/input[2]")).sendKeys(customerNumber);
		Thread.sleep(500);
				driver.findElement(By.id("password")).sendKeys(portalpassword);
//		action_obj.portalusername().sendKeys(customerNumber);
//		action_obj.portalpassword().sendKeys(portalpassword);
		//Click on 'Login' Button
		Thread.sleep(2000);            //    html/body/div[1]/div[1]/div[1]/form/div/button
		driver.findElement(By.xpath(".//*[@id='bttnGO']")).click();
		//Click on 'Services' tab on user portal
		
		Thread.sleep(2000);
		action_obj.userportalservices().click();
		//Click on 'Move Out' button
		action_obj.moveoutundr_portal().click();
		//Assert with move out page
		Assertion_obj.portalmeterdetail();        
	}
	
	@Test(priority = 2)
	@Parameters({"url"})
	public void Disable_edit_service(String url) throws Exception{
		String mainurl = url;
		String adminurl = url+ "SrvCustomerPortalSettings";
		String portalurl = mainurl+"SrvCustomerPortal/#/";
		//Open admin panel
		
		driver.navigate().refresh();
		
		Thread.sleep(10000);
////* 1 dec for win energy 	
		driver.navigate().refresh();
			// hide 7nov
		driver.get(adminurl);
		//Turn off service edit toggle button
		executor.executeScript("window,scrollBy(0,300)", "");// change 250 to 300
		
		Thread.sleep(5000); 
		// 17 nov hide  action_obj.serviceedit().click();
	 
		
		Thread.sleep(5000);
		executor.executeScript("window,scrollBy(0,100)", "");
		Thread.sleep(10000);
		System.out.println("***************************************change the setting disable the 'Enabl service edit toggle button");
		//Save portal
		Thread.sleep(10000);
	action_obj.portalsave().click();
		//Navigate customer portal
		driver.get(portalurl);
		//Click on 'Services' tab
		action_obj.userportalservices().click();
		//Check that the 'MoveOut' icon is enable or not
		if(action_obj.disablemoveoutportal().isEnabled()){
			System.out.println("Button is disable");
		}
		else{
			//Fail if the button is enable
		Assert.fail();
		}		
	}

	@Test(priority = 3)
	@Parameters({"url"})
	public void Enable_edit_account_details(String url) throws Exception{
		String mainurl = url;
		String adminurl = url+ "SrvCustomerPortalSettings";
		String portalurl = mainurl+"SrvCustomerPortal/#/";
		
driver.navigate().refresh();
		
		Thread.sleep(10000);// /* 1 dec for win energy
		driver.navigate().refresh();
		
			//Open admin panel
		// *********** hide 7 nov
		  	driver.get(adminurl);
		//Click on account detail tab
		executor.executeScript("window,scrollBy(0,400)", "");
		Thread.sleep(6000);
		//action_obj.accountdetail().click();
		Thread.sleep(700);
		executor.executeScript("window,scrollBy(0,100)", "");
		Thread.sleep(5000);
		//Click on save button
		action_obj.portalsave().click();
		//Open customer portal
		driver.get(portalurl);
		//Click on 'Account Detail' tab
		action_obj.accountdetailstab().click();
		//Assert Personal information page in portal
		Assertion_obj.pipageinportal();
		Thread.sleep(1000);
		//Clear Title field of personal information page
		action_obj.pititleonportal().clear();
		//Enter Title
		action_obj.pititleonportal().sendKeys("Mr.");
		//Clear Phone field
		action_obj.piphoneonportal().clear();
		//Enter phone no
		action_obj.piphoneonportal().sendKeys("9685741230");
		executor.executeScript("window,scrollBy(0,500)", "");
		//Click on 'Save'
		action_obj.savechangesportal().click();
		//Assertion with save message
		Assertion_obj.pisavemessage();
		executor.executeScript("window,scrollBy(500,0)", ""); 
		
	}
	
	@Test(priority = 4)
	@Parameters({"url"})
	public void Disable_edit_account_details(String url) throws Exception{
		String mainurl = url;
		String adminurl = url+ "SrvCustomerPortalSettings";
		String portalurl = mainurl+"SrvCustomerPortal/#/";
		
		
driver.navigate().refresh();
		
		Thread.sleep(9000);
		//* 1 dec for win energy
		driver.navigate().refresh();
		
			//Open admin panel
	// ***********	hide 7 nov
	  driver.get(adminurl);
	
		//Turn on 'Accont Detail' toggle button
		executor.executeScript("window,scrollBy(0,350)", "");
		
		action_obj.accountdetail().click();
		Thread.sleep(700);
		executor.executeScript("window,scrollBy(0,100)", "");
		Thread.sleep(10000);
		System.out.println("***************************************change the setting disable the 'Enabl account details toggle button");
		//Save portal
		Thread.sleep(10000);
		//Save portal
		action_obj.portalsave().click();
		//Open customer portal
		driver.get(portalurl);
		//Click on 'Account' Detail tab
		action_obj.accountdetailstab().click();
		//Personal information page
		Assertion_obj.pipageinportal();
		//Refresh page
		driver.navigate().refresh();
		executor.executeScript("window,scrollBy(0,1500)", "");
		Thread.sleep(1000);
		//Check button is unable or not
 //17 nov hide 
 if(!driver.findElement(By.xpath("(.//*[@disabled='disabled'])[17]")).isEnabled()){  //Troubleshooting required
			System.out.println("Button is disable");
		}
		else{
			//Fail if available
		Assert.fail();
		}	
	}
		
	@Test(priority = 5)
	@Parameters({"url"})
	public void Enable_edit_Service(String url) throws Exception{
		String mainurl = url;
		String adminurl = url+ "SrvCustomerPortalSettings";
		String portalurl = mainurl+"SrvCustomerPortal/#/";
driver.navigate().refresh();
		
		Thread.sleep(7000);
		//* 1 dec for win energy
		 
		
		
		//Open admin panel
		
		
			// ***********	17 nov 
		Thread.sleep(2000);
		driver.get(adminurl);
		executor.executeScript("window,scrollBy(0,400)", "");
		Thread.sleep(10000);
		//Click on 'Service Settings' toggle button
// ***********	17 nov  hide	action_obj.servicesettingedit().click();
		Thread.sleep(700);
		executor.executeScript("window,scrollBy(0,100)", "");
		Thread.sleep(1000);
		//Click on 'Save' button
		action_obj.portalsave().click();
		//Open customer Portal
		driver.get(portalurl);
		//Click on 'Service settings' 
		action_obj.servicesettingtabportal().click();
		//Assert with service Settings tab
		Assertion_obj.servicesettingstab();
		//Click on 'Send Email' on service settings tab
		action_obj.servicesendemailcustomerportal().click();
		//Click on 'Save Changes' button
		action_obj.savechangesportal2().click();
		//Assert with success message
		Assertion_obj.successmessageonservice();  
		
	}
	
	
	@Test(priority = 6)
	@Parameters({"url"})
	public void Disable_edit_Service(String url) throws Exception{
		String mainurl = url;
		String adminurl = url+ "SrvCustomerPortalSettings";
		String portalurl = mainurl+"SrvCustomerPortal/#/";
		
driver.navigate().refresh();
		
		Thread.sleep(10000);
		//* 1 dec for win energy
		 	driver.navigate().refresh();
		 
		
		
		//Open admin panel
			//*********** hide 17 nov
		 	driver.get(adminurl);
		 
	executor.executeScript("window,scrollBy(0,400)", "");
		Thread.sleep(700);
		//Turn on 'Account Detail' toggle
// *********** hide 17 nov		action_obj.accountdetail().click();
		Thread.sleep(700);
		//Turn off 'Service Settings' toggle button
		action_obj.servicesettingedit().click();
		Thread.sleep(700);
		executor.executeScript("window,scrollBy(0,100)", "");
		Thread.sleep(1000);
		executor.executeScript("window,scrollBy(0,100)", "");
		Thread.sleep(10000);
		System.out.println("***************************************change the setting disable the 'Enabl service details toggle button");
		
		//Click on 'Save' button
		action_obj.portalsave().click();
		//Open customer portal
		driver.get(portalurl);
		//Click on 'Service Settings' tab
		action_obj.servicesettingtabportal().click();
		//Assert with Service Setting page
		Assertion_obj.servicesettingstab();
		
		//Check that the button is enable or not
/*		if(!driver.findElement(By.xpath("(.//*[@disabled='disabled'])[3]")).isEnabled()){//Troubleshooting require
			System.out.println("Button is disable");
		}
		else{
			//Fail is enable
		Assert.fail();
		} 
		
/*		
		if(action_obj.disabledbuttonservicesettings().isEnabled()){
			System.out.println("Button is disable");
		}
		else{
		Assert.fail();*/
		}
	
		
		
		
	}

