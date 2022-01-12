package com.Utility.Bill.BillRunFirst;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;
import com.Utility.Bill.Re_Usable.Sauce_instance_Test;

public class other_Admin extends Sauce_Instance_Login_Test {
	//public class other_Admin extends Sauce_instance_Test {

	static String title="";
	//protected WebDriver driver;
	Repo_Test action_obj;
	Assertion_Test Assertion_obj;



	static String mno="";
	static String wno="";
	public static String pID;
	public static String pID1;
	public static String Batchno;
	public static String CID;
	boolean bValue = false;
	public static JavascriptExecutor executor;
	String AddedDescription,firstValue, Secondvalue, updatedText;

	@Test(priority = 1)
	//###################################################
	//###################################################
	public void customer_add() throws Exception {
		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);

		//customer main menu
		action_obj.customer_main_menu().click();
		//enter customer name
		action_obj.customer_F_name().sendKeys("Mark");
		//last name
		action_obj.customer_sure_name().sendKeys("Anderson");
		//select category
		Select select = new Select(action_obj.Category_drop());
		//select.selectByVisibleText("Business");
		select.selectByVisibleText("Residential");
		//print all option of drop down
		List<WebElement> oSize2 = select.getOptions();
		int iListSize2 = oSize2.size();
		for(int i =0; i < iListSize2 ; i++){
			String sValue = select.getOptions().get(i).getText();
			System.out.println(sValue);  
		}

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
		action_obj.Phone_Mobile().sendKeys("78898525");
		//select plan
		Select select2 = new Select(action_obj.select_plan());
		select2.selectByVisibleText("Electricity Residential plan");// 17 nov changed on Electricity Flat Template Plan
		//enter email
		action_obj.Email().sendKeys("cverma@gmail.com");
		action_obj.BEmail().sendKeys("cverma@gmail.com");
		//scroll
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,1500)", "");
		//save customer
		action_obj.save_customer().click();
		//ok
		Thread.sleep(2000);
		action_obj.ok().click();
		//validate message
		Assertion_obj.sucessfully_saved_customer_message_validation();
		Thread.sleep(5000);
		//get customer number
		/////////////////////////////	
		//customer Number Get 
		CID=driver.findElement(By.xpath(".//*[@id='nav']/div/div/div[1]/div[2]/div[1]/label/a")).getText();
		System.out.println("Print Customer ID:" +  CID);
		///////////////////////////////////		
		Thread.sleep(2000);
		//overview main menu 
		action_obj.overview_menu().click();

		Thread.sleep(2000);
		//ele + icon
		action_obj.electricity_plus_icon().click(); 
		//validate page header
		Assertion_obj.Electricity_service_page_header_validation(); 
		//select plan
		Select mydrpdwn = new Select(action_obj.plan_drop_down()); 
		///////updation required
		mydrpdwn.selectByVisibleText("Electricity Residential plan");// 17 nov changed on Electricity Flat Template Plan


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
		//Select read type
		Select mydrpdwn2 = new Select(driver.findElement(By.id("readType")));
		mydrpdwn2.selectByVisibleText("Reads");
		
		//toggle button
		action_obj.toggle_button().click(); 

		//save service
		executor.executeScript("window.scrollBy(0,1500)", "");
		executor.executeScript("javascript:sendForm();", action_obj.create_service_button());

		//ok
		action_obj.ok().click(); 
		//validate overview text
		Assertion_obj.Overview_text_Validation(); 

		Thread.sleep(2000);
		//@@@@@@@@@@@@@@@@@@@@@@@@ MTR READ 11111111111  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//meter read main menu
		action_obj.Meter_Reads_mainMenu().click();
		//select meter no for reading
		//	driver.navigate().refresh();
		Thread.sleep(3000);
		Select mydrpdwn2s = new Select(action_obj.MeterNoForMeterReading());
		Thread.sleep(4000);
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
		String vali_str=mydrpdwn25.getFirstSelectedOption().getText();
		//select today date
		action_obj.Meter_readdate().click();
		Thread.sleep(2000);
		action_obj.select_today_date().click();

		//enter reading 
		action_obj.Meter_Read().sendKeys("100");
		//save read button
		Thread.sleep(1000);

		//			executor.executeScript("javascript:saveRead();",  action_obj.save_Read_button());

		action_obj.save_Read_button().click();

		//validate by read type text selected in dropdown
		//	Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()='"+vali_str+"'])[1]")).getText(),vali_str);
		//			Select mydrpdwn2s = new Select(action_obj.MeterNoForMeterReading());
		Thread.sleep(2000);
		mydrpdwn2s.selectByVisibleText("108_"+mno);
		//validate view read text
		Assertion_obj.viewRead_Text_validation();
		//@@@@@@@@@@@@@@@@@@@@@@@@ MTR READ 222222222222222222222222  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//			driver.navigate().refresh();
		//add read button

		action_obj.addReadButton().click();
		//validate add meter read popup message
		Assertion_obj.AddMeterReadPopupText_validation();
		//select read type
		Select mydrpdwn25a = new Select(action_obj.readTypeDropDown());
		mydrpdwn25a.selectByIndex(1);       ////////////3
		Thread.sleep(2000);
		String vali_str1=mydrpdwn25a.getFirstSelectedOption().getText();

		//click on merter read date field
		action_obj.Meter_readdate().click();
		//click on next button of calander
		action_obj.next_button_calander().click();
		//select any random date
		action_obj.select_end_date_as().click();
		//meter read enter
		action_obj.Meter_Read().sendKeys("500");
		Thread.sleep(1000);
		//add vinod 22 march 
		//add Rollover 
		//			driver.findElement(By.className(".//*[@id='modalRead']/div/div/div/div[2]/div[2]/form/div[3]/div[2]/div[2]/label/span[2]")).click();
		action_obj.Roll_over().click();
		Thread.sleep(1000);
		//save read button
		action_obj.save_Read_button().click();
		//validate by read type text selected in dropdown
		//Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()='"+vali_str1+"'])[1]")).getText(),vali_str1);
		//validate view read text
		Assertion_obj.viewRead_Text_validation();
		driver.navigate().refresh();
	}
	@Test(priority=2)
	public void payment_batch() throws Exception
	{
	  action_obj = new Repo_Test(driver);
			Assertion_obj = new Assertion_Test(driver);

		 	driver.navigate().refresh();
		Thread.sleep(5000);
		//date format for editing the string value
		DateFormat dateFormat = new SimpleDateFormat("HHmmss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));

		Batchno=cal.getTime().toString(); 
		System.out.println(Batchno=Batchno.substring(11,19));
		Batchno=Batchno.replaceAll(":","");
		driver.navigate().refresh();
		Thread.sleep(5000);
		//click on Admin
		action_obj.admin_mainMenu().click();

		//click on Payment Batch
		action_obj.payment_batch().click();

		System.out.println("//---------------Payment batch Section  Open------------///");	


		System.out.println("Batch Number"+ Batchno);
		//Open Payment Batch 
		action_obj.BatchNO().click();
		action_obj.BatchNO().sendKeys(Batchno);
		//select Transaction type 
		Select trastype=new Select(action_obj.Transation_type());
		trastype.selectByVisibleText("P");

		//payment Method 
		Select paymethod=new Select(action_obj.PaymentMethod());
		paymethod.selectByVisibleText("Cash");
		
		//Customer type Used
		Select idused=new Select(action_obj.cutmrIDUsed());
		idused.selectByVisibleText("Customer ID");
		//idused.selectByVisibleText(CID);
	
		// select customer 
		action_obj.customer_no1().sendKeys(CID+Keys.ENTER);
		// action_obj.customer_no1().sendKeys("166516"+Keys.ENTER); 
		
		//enter Amount
		action_obj.amountentr().sendKeys("4500"+Keys.ENTER);
		
		//  action_obj.amountentr().click();
		//  Thread.sleep(3000);
		//add comments for batch payments 13-05-2019
		action_obj.batch_Comments().sendKeys("For Testing Purpose"+Keys.ENTER);
		// driver.findElement(By.id("comment-1")).sendKeys("For Testing Purpose"+Keys.ENTER);
		Assertion_obj.assertionsavebatchno();	  		//Thread.sleep(16532);
	}
	@Test(priority = 3)
	public void Penalty_section() throws Exception
	{
		
	  //click on Admin
		action_obj.admin_mainMenu().click();

		System.out.println("//---------------Penalty Section Open------------///");

		//click on Penalty Button
		action_obj.Penalty_click().click();
		//Create new Penalty 
		action_obj.Create_Penalty().click();
		//Click Penalty Options 
		action_obj.Penalty_Options().click();
		Thread.sleep(1000);
		action_obj.SelectPenalty_Options().click();
		Thread.sleep(1000);
		action_obj.Penalty_Options().click();
		Select penaltyoption= new Select(action_obj.Penalty_Options());
		penaltyoption.selectByIndex(0);

		//Add Description  under penalty 
		action_obj.PenaltyDescription().sendKeys("Penalty Description");          //   
		//Add 10 grace days for penalty 
		action_obj.Grace_Day().sendKeys("10");
		//save penalty

		action_obj.Save_Penalty().click();
		Assertion_obj.assertsavepenalty();

		String pID=driver.findElement(By.xpath(".//*[@id='penaltyListBody']/tr/td[1]")).getText();

		System.out.println("//-----------Complete Create penalty---------//");
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//click on edit button
		action_obj.edit_Penalty().click();
		//changes under penalty
		action_obj.change_Description().clear();
		action_obj.change_Description().sendKeys("New Description details add");
		//save change description
		action_obj.UpdateSave_Penalty().click();

		String pID1=driver.findElement(By.xpath(".//*[@id='penaltyListBody']/tr/td[1]")).getText();

		System.out.println("//------- Update Penalty Record-------//");
		//Select For Delete 
		driver.navigate().refresh();
		Thread.sleep(2000);
		action_obj.Del_penalty().click();
		Thread.sleep(2000);
		//Confirm For Delete penalty record
		action_obj.ConfirmDel_penalty().click();
		Thread.sleep(1000);
		action_obj.Serach_del_record().sendKeys(pID1);
		System.out.println("//------- Delete Penalty Record------//");
		  
	}
	
	@Test(priority=4)
	public void Late_Fee_Settings() throws InterruptedException
	{
		
		//click on Admin
		action_obj.admin_mainMenu().click();
		//	scroll down
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,500)", "");
		//click on late Fee  Stting
		action_obj.Late_Fee_Settings().click();
		System.out.println("//---------------Late_Fee_Settings Section  Open------------///");		

		action_obj.AccountCharg_opt().click();
		// action_obj.ElecRollup_description_opt().click();
		//enable  Account Charge
		if(action_obj.AccountCharg_opt().isEnabled())
			{
				action_obj.AccountCharg_opt().click();
			}		
			Thread.sleep(2000);
			//Elec Rollup description option
			if(action_obj.ElecRollup_description_opt().isEnabled())
			{
				action_obj.ElecRollup_description_opt().click();
			}
			Thread.sleep(4000);
			driver.navigate().refresh();

		System.out.println("//--------------------------Late_Fee_Settings Section  Complete------------------------///");	
	}

	@Test(priority=5)
	public void Customer_Portal_Setting() throws InterruptedException //changes settingS to services
	{
		
		Thread.sleep(6000);
		//click on Admin
		action_obj.admin_mainMenu().click();
		//Click on Customer Portal Settings link
		action_obj.customerportalsetting().click();
		Thread.sleep(6000);
		//Scroll down
		executor=(JavascriptExecutor) driver;
		Thread.sleep(3000);
		executor.executeScript("window.scrollBy(0,800)", "");

		List<WebElement> checkbox = driver.findElements(By.xpath(".//*[@id='divCol1']/div/div/div[2]/form/div/div[8]/div[2]/div/div/label/span[1]"));

		bValue = checkbox.get(0).isSelected();
	if(bValue = true){
		System.out.println("Click on true value");
		checkbox.get(0).click();

	 }else{
		 System.out.println("Click on false value");
		 	// checkbox.get(1).click();
	
	 }  
		Thread.sleep(2000);	

		//Enable Services Edit
		if(action_obj.EnablEservicE_edit().isEnabled())
		{
			action_obj.EnablEservicE_edit().click();
		}

		Thread.sleep(2000);	
		//Enable Account Details Edit

		if(action_obj.EnableAccounTDetailS_edit().isEnabled())
		{
			action_obj.EnableAccounTDetailS_edit().click();
		}

		Thread.sleep(2000);	
		//Enable Service Settings Edit			
		if(action_obj.EnableServiceSettings_edit().isEnabled())
		{
			action_obj.EnableServiceSettings_edit().click();
		}
		//Scroll down
		//executor.executeScript("window,scrollBy(0,600)", "");

		Thread.sleep(18000);	
		//Click on 'Save' button.			
		action_obj.save_cutsmr_portalsetting().click();	
		//Thread.sleep(15000);	

		//validate by success! text
		Thread.sleep(4000);
		String validation = driver.findElement(By.xpath(".//*[text()='Success!']")).getText();			 
		Assert.assertEquals("Success!", validation);// assert command

	}}	
















