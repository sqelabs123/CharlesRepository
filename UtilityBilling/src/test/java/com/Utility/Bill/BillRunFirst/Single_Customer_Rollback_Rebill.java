package com.Utility.Bill.BillRunFirst;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class Single_Customer_Rollback_Rebill extends Sauce_Instance_Login_Test {

	//Create variables
	 Repo_Test action_obj;
	 Assertion_Test Assertion_obj;
	 JavascriptExecutor executor, jse;	
	 public String customerNumber;
	 public String customerno;
	 public String customerno1;
	 public String ServiceMGT="Savi";
     public	String electPlan="Multiple Tariff Plan"; //
	 static String mno="";	
	 static String de="";
	 static String gno;
	 public String Statements;
	 public String Statements1;
		
@Test(priority = 1, invocationCount = 2) 
public void EnterMultiCustomers_services_meterReads() throws Exception {
			action_obj = new Repo_Test(driver);
			Assertion_obj = new Assertion_Test(driver);
			
			
       System.out.println(":--------------:Create Customers:-----------------------:");
			Thread.sleep(2000);
			
			//customer main menu
			action_obj.customer_main_menu().click();
			//enter customer name
			action_obj.customer_F_name().sendKeys("Mark");
			//last name
			action_obj.customer_sure_name().sendKeys("Anderson");
			//select category
			Select select = new Select(action_obj.Category_drop());
			select.selectByVisibleText("Business");
			//print all option of drop down
			List<WebElement> oSize2 = select.getOptions();
			int iListSize2 = oSize2.size();
			for(int i =0; i < iListSize2 ; i++){
				String sValue = select.getOptions().get(i).getText();
				System.out.println(sValue);  
			}

			// Enter Company Name
			driver.findElement(By.id("companyName")).sendKeys("Company Moryieo");
			//enter customer address1
			action_obj.cus_address1().sendKeys("Lombard Street");
			//enter customer address2
			action_obj.cus_address2().sendKeys("San Francisco");
			//enter state
			action_obj.billingState().sendKeys("CA");
			//click toggle button
			action_obj.toggle_button().click();
			//enter country
			action_obj.customer_country().sendKeys("US");
			//mobile 
			action_obj.Phone_Mobile().sendKeys("7889852511");
			//select plan
		//	Select select2 = new Select(action_obj.select_plan());
			//select2.selectByVisibleText("Multiple Tariff Plan");
		//	select2.selectByVisibleText("Multiple");
			//enter email
			action_obj.Email().sendKeys("btest12@yopmail.com");
			action_obj.BEmail().sendKeys("btest12@gmail.com");
			//scroll
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("window.scrollBy(0,1500)", "");
			//save customer
			action_obj.save_customer().click();
			//ok
			action_obj.ok().click();
			
			//validate message
			Assertion_obj.sucessfully_saved_customer_message_validation();
			//get customer number
			customerNumber=driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[4]/form[1]/div/div/div[1]/div[2]/div[1]/label/a")).getText();
//			customerNumber1=driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[4]/form[1]/div/div/div[1]/div[2]/div[1]/label/a")).getText();
//			customerNumber2=driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[4]/form[1]/div/div/div[1]/div[2]/div[1]/label/a")).getText();
			Thread.sleep(3000);
			
			
			System.out.println("**********************Add Electricity service(Electricity Residential plan)**********************"); 
			
			
			//click on overview menu
			action_obj.overview_menu().click();
			//ele + icon
			action_obj.electricity_plus_icon().click(); 
			//validate page header
			Assertion_obj.Electricity_service_page_header_validation(); 
			//select plan
			Select mydrpdwn = new Select(action_obj.plan_drop_down()); 
	        
			///////updation required
			//mydrpdwn.selectByVisibleText("Multiple Tariff Plan");// 17 nov changed on Electricity Flat Template Plan
			
			mydrpdwn.selectByVisibleText("Electricity Residential plan");
			//date format for editing the string value    
			DateFormat dateFormat = new SimpleDateFormat("HHmmss");
			Calendar cal = Calendar.getInstance();
			System.out.println(dateFormat.format(cal.getTime()));
			mno=cal.getTime().toString(); 
			System.out.println(mno=mno.substring(11,19));
			mno=mno.replaceAll(":","");
			
			//enter meter number
			action_obj.meter_number().sendKeys("108_"+mno); 
			//select meter configuration type
			Select mydrpdwn1 = new Select(action_obj.meterConfig_drop_down()); 
			mydrpdwn1.selectByVisibleText("Flat Rate"); 
			//Select read type   786
			Select mydrpdwn2 = new Select(driver.findElement(By.id("readType")));
			mydrpdwn2.selectByVisibleText("Reads");
			Thread.sleep(2000);
			//toggle button
			action_obj.toggle_button().click(); 

			//save service
			executor.executeScript("window.scrollBy(0,1500)", "");
			executor.executeScript("javascript:sendForm();",action_obj.create_service_button());

			//ok
			action_obj.ok().click(); 
			//validate overview text
			Assertion_obj.Overview_text_Validation(); 
			
			Thread.sleep(3000);
			
           System.out.println(":-----------------:Add Meter Read:-------------------:");
			
			//**********************Meter Reads **********************
			
			
			//meter read main menu
			action_obj.Meter_Reads_mainMenu().click();
			//select meter no for reading
			driver.navigate().refresh();
			Thread.sleep(700);
			Select mydrpdwn2s = new Select(action_obj.MeterNoForMeterReading());
			Thread.sleep(2000);
			mydrpdwn2s.selectByVisibleText("108_"+mno);
			//validate view read text
			Assertion_obj.viewRead_Text_validation();
			//add read button
			Thread.sleep(2000);
			action_obj.addReadButton().click();
			//validate add meter read text
			Assertion_obj.AddMeterReadPopupText_validation();
			//select reading type
			Select mydrpdwn25 = new Select(action_obj.readTypeDropDown());
			mydrpdwn25.selectByVisibleText("Initial");
//			String vali_str=mydrpdwn25.getFirstSelectedOption().getText();
			//select today date
			action_obj.Meter_readdate().click();
			Thread.sleep(2000);
			action_obj.select_today_date().click();
		
			//enter reading 
			action_obj.Meter_Read().sendKeys("10");
			//save read button
			Thread.sleep(2000);
			
			
//			executor.executeScript("javascript:saveRead();",  action_obj.save_Read_button());
			
			action_obj.save_Read_button().click();
			
			//validate by read type text selected in dropdown
		//	Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()='"+vali_str+"'])[1]")).getText(),vali_str);
            Select mydrpdwn14 = new Select(action_obj.MeterNoForMeterReading());
			Thread.sleep(2000);
			mydrpdwn14.selectByVisibleText("108_"+mno);
			//validate view read text
			Assertion_obj.viewRead_Text_validation();
			Thread.sleep(2000);
            //add read button
			action_obj.addReadButton().click();
			//validate add meter read popup message
			Assertion_obj.AddMeterReadPopupText_validation();
			//select read type
			Select mydrpdwn25a = new Select(action_obj.readTypeDropDown());
			mydrpdwn25a.selectByIndex(1);      
			////////////3
			Thread.sleep(2000);
//			String vali_str1=mydrpdwn25a.getFirstSelectedOption().getText();
			
			//click on merter read date field
			action_obj.Meter_readdate().click();
			//click on next button of calander
			action_obj.next_button_calander().click();
			//select any random date
			action_obj.select_end_date_as().click();
			//meter read enter
			action_obj.Meter_Read().sendKeys("120");
			//save read button
			action_obj.save_Read_button().click();
			//validate by read type text selected in dropdown
//		Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()='"+vali_str1+"'])[1]")).getText(),vali_str1);
			//validate view read text
			Assertion_obj.viewRead_Text_validation();
			driver.navigate().refresh();
            Thread.sleep(5000);
       
 		} 
@Test(priority=2)
public void BillRun_Cycle_For_Multiple_Customers() throws InterruptedException
{
	// Search Customer for get latest two cusomtmer id 
	 
	  action_obj.search_button().click();
	 Thread.sleep(9000);
	  customerno=driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/table/tbody/tr[1]/td[1]")).getText();
	  customerno1=driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/table/tbody/tr[2]/td[1]")).getText();
	   Thread.sleep(2000);
	
	action_obj.admin_mainMenu().click();
		action_obj.billRunCycle().click();
		action_obj.createNewPlan().click();
		action_obj.cycleName().sendKeys(customerNumber);
		
		action_obj.cycleDropDown().click();
		//Select select = new Select(driver.findElement(By.xpath(".//*[@id='custnos']")));
		//select.selectByVisibleText(customerNumber+"- Chandan verma");
		//add one 
		driver.findElement(By.xpath(".//*[contains(span,'"+customerno+"')]")).click();
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.ESCAPE).build().perform();
		
	   //add two
		driver.findElement(By.xpath(".//*[contains(span,'"+customerno1+"')]")).click();
         Actions action3 = new Actions(driver);
		action3.sendKeys(Keys.ESCAPE).build().perform();
		
		
		action_obj.saveCycle().click();
//		Assertion_obj.cycleConfirmationMessage_text_assertion();
		action_obj.cycleID().isDisplayed();
}
@Test(priority = 3)
public void Bill_Run_with_MultipleCustomer() throws Exception
{
	Thread.sleep(3000);
	action_obj.bill_run_mainMenu().click();
	Assertion_obj.Welcome_to_Bill_Run_Wizard_text_assertion();

	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("javascript:skipMeterBulkImport()", action_obj.run_the_bill_button());
	action_obj.Recurring_harge_Date().click();
	action_obj.select_today_date().click();
	action_obj.issueDate().click();
	action_obj.select_today_date().click();
	action_obj.dueDate().click();
	action_obj.select_today_date().click();
	
	Select cycle = new Select(action_obj.cycleno());
	cycle.selectByVisibleText(customerNumber );

	action_obj.bill_run_button().click();
	Thread.sleep(10000);
	action_obj.viewButton().click();

	Assertion_obj.Bill_Run_Results_text_assertion();


	String no = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div[2]/"
			+ "div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[1]/div[2]/div/div[1]/h2")).getText();
    
	Thread.sleep(10000);
	
}
@Test(priority=4)
public void Single_Customer_Rollback() throws Exception
{
	action_obj.Select_cust_UnderBill().click();
	Thread.sleep(2000);
	//Assertion on Statments Text
	//Assertion_obj.Statements_text_Validation();
	//click on Statements tab
	action_obj.Statementstab().click();
	Statements=driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText();
	Statements1=driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText();
	System.out.println("Statement no: "+Statements);
	System.out.println("Statement no: "+Statements1);
	//Click on Detail icon under statement tab 
	action_obj.StatmentsDetail_icon().click();
	Thread.sleep(1000);
	action_obj.rolbackbutton().click();
	//assertion on Confirm Statment Rollback
    Assertion_obj.rollbackconfirmpopup();
    action_obj.rollbackreason().sendKeys("Rollback for testing only");
    action_obj.confirmrollbackcomplete().click();
    Thread.sleep(10000);
	//click on Statements tab
	action_obj.Select_statments().click();
	action_obj.viewrollbackhistoryclick().click();
	Assertion_obj.rollbackrecord();
	Assertion_obj.rebillingempty();
	Assertion_obj.stmtnoempty();
}
@Test(priority=5)
public void Single_Customer_rebill() throws Exception
{
	//click on 'Detail' icon under rollback History.
	action_obj.rebillingicon().click();
	//Assertion on rebilling popup
	Assertion_obj.rebillingpopupvalidation();
	Thread.sleep(1000);
	//Select new statement no.
  Select new_stmtno= new Select(action_obj.newStmtnochange());
  new_stmtno.selectByVisibleText(Statements);
  
  //rebilling bill under rollback history
  action_obj.rebilling_RunBill().click();
  Thread.sleep(4000);
//click on Statements tab
	action_obj.click_statments().click();
	//Click on 'View Rollback history'
	action_obj.viewrollbackhistoryclick().click();
 //Assertion on available record 
  Assertion_obj.Newstmtnocheck();
  
  
	
}
}


