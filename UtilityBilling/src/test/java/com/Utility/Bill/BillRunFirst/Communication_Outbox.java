package com.Utility.Bill.BillRunFirst;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;


public class Communication_Outbox extends Sauce_Instance_Login_Test {
   public String stno;
   public JavascriptExecutor executor;
   public String customerNumber;
   public String planNo;
   static String mno="";
   public Repo_Test action_obj;
   public Assertion_Test Assertion_obj;
   public String CurrentBillAmount="";
   public String Billamountafterrollback="";
	////add Scripts on 14-05-2019 Start 
   @Test(priority=0)
   public void customeradd() throws Exception
   {
	    action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);	
		
	    action_obj.customer_main_menu().click();
		action_obj.customer_F_name().sendKeys("symon");
		action_obj.customer_sure_name().sendKeys("jone");
		Select select = new Select(action_obj.Category_drop());
		//select.selectByVisibleText("Business");
		select.selectByVisibleText("Residential");
		
		List<WebElement> oSize2 = select.getOptions();
		int iListSize2 = oSize2.size();
		for(int i =0; i < iListSize2 ; i++){
		String sValue = select.getOptions().get(i).getText();
		System.out.println(sValue);  
		}
		
		action_obj.cus_address1().sendKeys("seeon Street");
		action_obj.cus_address2().sendKeys("San Francisco");
		action_obj.billingState().sendKeys("San Francisco");
		action_obj.toggle_button().click();
		action_obj.customer_country().sendKeys("UA");
		action_obj.Phone_Mobile().sendKeys("7889852521");
		Select select2 = new Select(action_obj.select_plan());
		select2.selectByVisibleText("Electricity Residential plan");// 17 nov changed
		// sleep time
		Thread.sleep(10000);
		action_obj.Email().sendKeys("tetester591@gmail.com");
		action_obj.BEmail().sendKeys("tetester591@gmail.com");
		executor=(JavascriptExecutor) driver;
		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(2000);
		action_obj.save_customer().click();
		action_obj.ok().click();
		
		Assertion_obj.sucessfully_saved_customer_message_validation();
		customerNumber=driver.findElement(By.xpath(".//*[@id='nav']/div/div/div[1]/div[2]/div[1]/label/a")).getText();
   }
   @Test(priority=1)
   public void Serviceandmeterreads() throws Exception
   {
	    action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);	
	   action_obj.overview_menu().click();
		 Thread.sleep(3000);
		action_obj.electricity_plus_icon().click(); 
		Assertion_obj.Electricity_service_page_header_validation(); 
		 Select mydrpdwn = new Select(action_obj.plan_drop_down()); 
		mydrpdwn.selectByVisibleText("Electricity Residential plan"); // "Electricity Flat Template Plan"  17 nov changed 	///3
		planNo=mydrpdwn.getFirstSelectedOption().getText();
		System.out.println(planNo);
		DateFormat dateFormat = new SimpleDateFormat("HHmmss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
		mno=cal.getTime().toString(); 
		System.out.println(mno=mno.substring(11,19));
		mno=mno.replaceAll(":","");
		action_obj.meter_number().sendKeys("Ele"+mno); 
		
		 Select mydrpdwn1 = new Select(action_obj.meterConfig_drop_down()); 
		mydrpdwn1.selectByVisibleText("Flat Rate"); 
		Thread.sleep(2000);
		
//		executor.executeScript("window.scrollBy(0,1000)", "");
		action_obj.toggle_button().click();
		Select mydrpdwn2 = new Select(action_obj.readding_drop_down()); 
		mydrpdwn2.selectByVisibleText("Reads"); 
		JavascriptExecutor jse = (JavascriptExecutor)driver;	 
		jse.executeScript("window.scrollBy(0,1500)", "");
		action_obj.create_service_button().click();
		 action_obj.ok().click(); 
		 Thread.sleep(1000);
		Assertion_obj.utilities_header_validation(); 
		 Assertion_obj.Overview_text_Validation(); 
		   
		 
		 
		 // Add Meter Reads for Customers
		 //meter read main menu
			action_obj.Meter_Reads_mainMenu().click();
			//select meter no for readSing
			Thread.sleep(7000);
			Select mydrpdwn2s = new Select(action_obj.MeterNoForMeterReading());
 			// mydrpdwn2s.selectByIndex(1);
			
			mydrpdwn2s.selectByVisibleText("Ele"+mno);
			//validate view read text
			Assertion_obj.viewRead_Text_validation();
			//add read button
			action_obj.addReadButton().click();
			//validate add meter read text
			Assertion_obj.AddMeterReadPopupText_validation();
			
			//select reading type
			Select mydrpdwn25 = new Select(action_obj.readTypeDropDown());
			mydrpdwn25.selectByVisibleText("Initial");
			String vali_str=mydrpdwn25.getFirstSelectedOption().getText();
			//select today date
			action_obj.Meter_readdate().click();
			action_obj.select_today_date().click();
			Thread.sleep(2000);
			//enter reading 
			action_obj.Meter_Read().sendKeys("100");
			//save read button
			action_obj.save_Read_button().click();
			
			Assertion_obj.viewRead_Text_validation();
			
			Thread.sleep(500);
		
		    mydrpdwn2s.selectByVisibleText("Ele"+mno);
			//add read button
		    Thread.sleep(3000);
			action_obj.addReadButton().click();
			//validate add meter read popup message
			Assertion_obj.AddMeterReadPopupText_validation();
			//select read type
			Select mydrpdwn25a = new Select(action_obj.readTypeDropDown());
			mydrpdwn25a.selectByVisibleText("Actual");
		//	mydrpdwn25a.selectByIndex(2);
			String vali_str1=mydrpdwn25a.getFirstSelectedOption().getText();
			
			//click on merter read date field
			action_obj.Meter_readdate().click();
			//click on next button of calander
			action_obj.next_button_calander().click();
			//select any random date
			action_obj.select_end_date_as().click();
			//meter read enter
			action_obj.Meter_Read().sendKeys("500");
			//save read button
			action_obj.save_Read_button().click();
			Assertion_obj.viewRead_Text_validation();
   }
   @Test(priority=2)
   public void Add_Cycle_and_BIllRunwithRollback() throws Exception
   {
	    action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);	 
	   action_obj.admin_mainMenu().click();
		action_obj.billRunCycle().click();
		action_obj.createNewPlan().click();
		action_obj.cycleName().sendKeys(customerNumber);
		
		//action_obj.CustomerToDisplay().click();
		//driver.findElement(By.xpath(".//*[contains(span,'All')]")))
	
		//action_obj.CustomertoDispaytypeDropdown().sendKeys("All");
		//action_obj.AllSelectForCycle().click();
		action_obj.FilterAllSelectCustomer().sendKeys(customerNumber);
		//Select Search Customer.
		action_obj.selectcustomerinCycle().click();
		action_obj.saveCycle().click();
		//action_obj.saveCycle().click();
		Assertion_obj.cycleConfirmationMessage_text_assertion();
		
		//Add Bill Run With Rollback with validate fields
		
		Thread.sleep(8000);
	    //bill run main menu
		driver.navigate().refresh();
		Thread.sleep(5000);
		//action_obj.customer_main_menu().click();
		action_obj.bill_run_mainMenu().click();
		//validate welcome to bill run wizard text
		Assertion_obj.Welcome_to_Bill_Run_Wizard_text_assertion();
		//click on run the bills button
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("javascript:skipMeterBulkImport()", action_obj.run_the_bill_button());
		//recurring charges date
		action_obj.Recurring_harge_Date().click();
		//action_obj.next_button_calander().click();
		//select today date
		action_obj.select_today_date().click();
		//issue date
		action_obj.issueDate().click();
		//select today date
		action_obj.select_today_date().click();
		
		//due date
		action_obj.dueDate().click();
		action_obj.select_today_date().click();

		//select cycle 
		Select cycle = new Select(action_obj.cycleno());
		cycle.selectByVisibleText(customerNumber);
		
		//click on bill run
		action_obj.bill_run_button().click();
		Thread.sleep(22000);
		//get bill amount
		CurrentBillAmount=driver.findElement(By.xpath(".//*[@class='currBill'] ")).getText();
		action_obj.viewButton().click();
		Thread.sleep(6000);
		//get statement number 
		String no = driver.findElement(By.xpath(".//*[contains(text(),'Statement Summary #') ]")).getText();
		
		action_obj.rollbackbuttin().click();
		action_obj.continueTORollback().click();

		Assertion_obj.rollback_Message_text_assertion();
		 
		//String string= driver.findElement(By.xpath("html/body/div[16]/div/div/div[2]/div/div")).getText();
		String string= driver.findElement(By.className("bootstrap-dialog-message")).getText();	
		Assert.assertEquals(string,"Rollback complete.");
	//	System.out.print("\n assertion_method_1() ->Rollback Complete");
		Thread.sleep(4000);
		action_obj.closeRollback().click();
		Thread.sleep(6000);

   }
   @Test(priority=3)
   public void checkbill_afterRollback() throws Exception
   {
	   Thread.sleep(8000);
	    //bill run main menu
		driver.navigate().refresh();
		Thread.sleep(5000);
		//action_obj.customer_main_menu().click();
		action_obj.bill_run_mainMenu().click();
		//validate welcome to bill run wizard text
		Assertion_obj.Welcome_to_Bill_Run_Wizard_text_assertion();
		//click on run the bills button
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("javascript:skipMeterBulkImport()", action_obj.run_the_bill_button());
		//recurring charges date
		action_obj.Recurring_harge_Date().click();
		//action_obj.next_button_calander().click();
		//select today date
		action_obj.select_today_date().click();
		//issue date
		action_obj.issueDate().click();
		//select today date
		action_obj.select_today_date().click();
		//due date
		action_obj.dueDate().click();
		action_obj.select_today_date().click();

		//select cycle 
		Select cycle = new Select(action_obj.cycleno());
		cycle.selectByVisibleText(customerNumber);
		
		//click on bill run
		action_obj.bill_run_button().click();
		Thread.sleep(25000);
		Billamountafterrollback=driver.findElement(By.xpath(".//*[@class='currBill'] ")).getText();
		
		if(CurrentBillAmount.equalsIgnoreCase(Billamountafterrollback))
		{
			Assert.assertEquals(CurrentBillAmount, Billamountafterrollback);
			System.out.println("Bill Amount After Roll back is same Amount");
			
			
		}
		else {
			Assert.fail();
			System.out.println("Bill Failed");
		}
		Thread.sleep(3000);
		
		action_obj.viewButton().click();
		Thread.sleep(6000);
		//close bill run popup
	    action_obj.closeBillrun().click();
	    //yes button
	    action_obj.yesButton().click();
	    Thread.sleep(3000);
		
		
   }
 //add Scripts on 14-05-2019 end  
   
   @Test(priority=4)
  public void Reminder_section() throws InterruptedException, IOException
  {
	   action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);	  
	   //admin main menu
			action_obj.admin_mainMenu().click(); 
		
		//click reminders button
			action_obj.Reminders_click().click();
	//Updates days under Reminders
		WebElement selectdays=action_obj.addreminderdays();
	 selectdays.clear();
	 selectdays.sendKeys("0");
	 //update button click
	 Thread.sleep(3000);
	 action_obj.UpdateReminder().click();
	 Thread.sleep(1000);
     //'OK'
	 action_obj.OKUpdatesfreminder().click();
	 Thread.sleep(10000);
	 driver.navigate().refresh();
	 Thread.sleep(2000);
  }
  @Test(priority=5)
  public void Outbox_to_Communication() throws Exception
  { 
 //Outbox Button click
	  action_obj.outboxbutton().click();
	  
	  //assertion on Outbox section open
	  Assertion_obj.assertionoutbox();
	  
	  //Select generate Reminder button 
	  action_obj.generatereminderbtn().click();
	  //confirm section
	  action_obj.okConfirm_GenerateReminder().click();
	  Thread.sleep(8000);
	  action_obj.searchCustomer().sendKeys(customerNumber);
	  
	  stno=driver.findElement(By.xpath(".//*[@id='outboxTable']/tbody/tr[1]/td[4]")).getText();
	 
	   Thread.sleep(6000);
	
	  //select customer
	  action_obj.selectCustomer_outbox().click();  
	
	  //Window focus to new tab
		ArrayList<String> window_number = new ArrayList<String> (driver.getWindowHandles());
	          driver.switchTo().window(window_number.get(1));
	           //click on communication
	    
	             action_obj.communicationclick().click();
	            //assertion on customer record under Communication 
 //             Assertion_obj.assertionrecordCUMMN();
	
	   
	  
	  
	  
	  
	  
	  
	  
  }
  
}
