 	package com.Utility.Bill.BillRunFirst;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;
import com.Utility.Bill.Re_Usable.Sauce_instance_Test;

public class ElectMeterReadsThroughFrontend extends Sauce_Instance_Login_Test

//public class ElectMeterReadsThroughFrontend extends Sauce_instance_Test
{
	
	Repo_Test action_obj;
	Assertion_Test Assertion_obj;
 	static String mno="";
	static String wno="";
	//###################################################
	//###################################################
	
	
	@Test(priority = 1)
	public void entrSearch_ele_mtr_rd() throws Exception {
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
		select.selectByVisibleText("Business");
		
		Thread.sleep(5000);
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
		//get customer number
 		
		//overview main menu 
		action_obj.overview_menu().click();
		
	Thread.sleep(5000);
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
		Thread.sleep(2000);
		//toggle button
		action_obj.toggle_button().click(); 

		//save service
		executor.executeScript("window.scrollBy(0,1500)", "");
		executor.executeScript("javascript:sendForm();", action_obj.create_service_button());

		//ok
		action_obj.ok().click(); 
		//validate overview text
		Assertion_obj.Overview_text_Validation(); 


		//@@@@@@@@@@@@@@@@@@@@@@@@ MTR READ 11111111111  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//meter read main menu
		action_obj.Meter_Reads_mainMenu().click();
		//select meter no for reading
		//driver.navigate().refresh();
		Thread.sleep(2000);
		//Select mydrpdwn2s = new Select(action_obj.MeterNoForMeterReading());
		Thread.sleep(2000);
		//mydrpdwn2s.selectByVisibleText("108_"+mno);
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
		
		
		
//		executor.executeScript("javascript:saveRead();",  action_obj.save_Read_button());
		
		action_obj.save_Read_button().click();
		
		//validate by read type text selected in dropdown
	//	Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()='"+vali_str+"'])[1]")).getText(),vali_str);
//		Select mydrpdwn2s = new Select(action_obj.MeterNoForMeterReading());
		Thread.sleep(2000);
		//mydrpdwn2s.selectByVisibleText("108_"+mno);
		//validate view read text
		Assertion_obj.viewRead_Text_validation();
		//@@@@@@@@@@@@@@@@@@@@@@@@ MTR READ 222222222222222222222222  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//		driver.navigate().refresh();
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
//		driver.findElement(By.className(".//*[@id='modalRead']/div/div/div/div[2]/div[2]/form/div[3]/div[2]/div[2]/label/span[2]")).click();
		
		 
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
	//###################################################

	@Test(priority =2)
	public void ele_demand_read() throws Exception {
		Thread.sleep(3000);
		driver.navigate().refresh();
		
			//	action_obj.Meter_Reads_mainMenu().click();

				Select mydrpdwn2nd = new Select(action_obj.MeterNoForMeterReading());
				Thread.sleep(1500);
				mydrpdwn2nd.selectByVisibleText("108_"+mno);

				Assertion_obj.viewRead_Text_validation();
		 

		//demand read tab
		action_obj.demandRead().click();
		//click on demand read button
		action_obj.addDemandReadButton().click();
		//select demand read from dropdown
		Thread.sleep(1500);
		Select d_type = new Select(action_obj.demandtypeDropDown());
		d_type.selectByIndex(1);
		String vali_str1=d_type.getFirstSelectedOption().getText();
		//click on demand read date field
		action_obj.DemandReadDate().click();
		//click on next button of calendar
		action_obj.next_button_calander().click();
		//select any random date
		action_obj.select_end_date_as().click();
		//change the time
		action_obj.timeofDemandRead().click();
		action_obj.increase_demand_readTime().click();
		//enter readings
		action_obj.demandReading().sendKeys("500");
		//comments
		action_obj.reading_comment().sendKeys("Hmmm...no comments");
		//save button
//		JavascriptExecutor executor=(JavascriptExecutor) driver;
//		executor.executeScript("javascript:saveDemandRead();",action_obj.save_demandRead_button());
		action_obj.save_demandRead_button().click();
		Thread.sleep(5000);
		//validate by read type text selected in dropdown
		//Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()='"+vali_str1+"'])[1]")).getText(),vali_str1);
		//validate the confirmation message
		Assertion_obj.viewRead_Text_validation();
	
	}

	//###################################################
	//###################################################
	@Test(priority = 3)
	public void entrSearch_wtr_meter_rd() throws Exception {
		Thread.sleep(5000);
		//click on overview menu
		action_obj.overview_menu().click(); 
		Thread.sleep(5000);
		//water + icon
		action_obj.water_plus_icon().click(); 
		//validate page title
		Assertion_obj.water_service_page_header_validation(); 
		//select plan
		Select mydrpdwn = new Select(action_obj.plan_drop_down()); 
		mydrpdwn.selectByVisibleText("Water Residential plan(Flat)");// 17 nov changed 'Water Flat Template Plan'
		//select meter config type
		Select mydrpdwn1 = new Select(action_obj.meterConfig_drop_down()); 
		mydrpdwn1.selectByVisibleText("Flat Rate");
		Thread.sleep(2000);
		//Select plan from dropdwn menu
		Select mydrpdwn2 = new Select(driver.findElement(By.id("readType")));
		mydrpdwn2.selectByVisibleText("Consumption");
		Thread.sleep(2000);

		//***************Enter meter number under Add new water service page******************************************
		//date for edit the string
		DateFormat dateFormat = new SimpleDateFormat("HHmmss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
		wno=cal.getTime().toString(); 
		System.out.println(wno=wno.substring(11,19));
		wno=wno.replaceAll(":","");

		//enter merte number
		action_obj.meter_number().sendKeys("108_"+wno); 
		//scroll
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;	 
		jse1.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(3000);
		//*************************************************************************************************************

		//create service button
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("javascript:sendForm();", action_obj.create_service_button());
		//ok
		action_obj.ok().click(); 
		Thread.sleep(3000);
		
		//Assertion to validate Create a water Service text is present on new open page
		//String Actualtext3 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div/div[1]/div[1]/h2")).getText();
	//	Assert.assertEquals(Actualtext3, "Utilities");

		
		
		//Assertion_obj.utilities_header_validation();System.out.println("1");
		//Assertion_obj.Overview_text_Validation(); 


		//@@@@@@@@@@@@@@@@@@@@@@@@ MTR READ 1111111111111111111111111 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//click on the meter reads tab
		Thread.sleep(5000);
		action_obj.Meter_Reads_mainMenu().click();
		driver.navigate().refresh();
		Thread.sleep(3000);
		//select meter number
		Select mydrpdwn2nd = new Select(action_obj.MeterNoForMeterReading());
		mydrpdwn2nd.selectByVisibleText("108_"+wno);
		//validate view read text
		Assertion_obj.viewRead_Text_validation();
		//add read button
		action_obj.addReadButton().click();
		//validate popup text
		Assertion_obj.AddMeterReadPopupText_validation();
		//select read type
		Select mydrpdwn25 = new Select(action_obj.readTypeDropDown());
		Thread.sleep(1000);
		mydrpdwn25.selectByVisibleText("Initial");
		String vali_str1=mydrpdwn25.getFirstSelectedOption().getText();
		//select date as today
		action_obj.Meter_readdate().click();
		action_obj.select_today_date().click();
		//enter readings
		action_obj.Meter_Read().sendKeys("100");
		//save button
		action_obj.save_Read_button().click();
		//validate by read type text selected in dropdown
		//Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()='"+vali_str1+"'])[1]")).getText(),vali_str1);
		//validate view read text
		Assertion_obj.viewRead_Text_validation();
         //2222222222222222222222222222222222222222
		driver.navigate().refresh();
		//select meter number
		Thread.sleep(7000);
		Select myd  = new Select(action_obj.MeterNoForMeterReading());
		myd .selectByVisibleText("108_"+wno);
		Thread.sleep(5000);
		//add read button
		action_obj.addReadButton().click();
		//validate popup text
		Assertion_obj.AddMeterReadPopupText_validation();	
		//read type 
		Select mydrpdwn25a = new Select(action_obj.readTypeDropDown());
		Thread.sleep(1000);
		mydrpdwn25a.selectByIndex(1);         /////2
		String vali_str=mydrpdwn25a.getFirstSelectedOption().getText();
		//click on meter read date field
		action_obj.Meter_readdate().click();
		//click on next button of calendar 
		action_obj.next_button_calander().click();
		//select any random date 
		action_obj.select_end_date_as().click();
		//enter read 
		action_obj.Meter_Read().sendKeys("500");
		//save read button
		action_obj.save_Read_button().click();
		//validate by read type text selected in dropdown
		//Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()='"+vali_str+"'])[1]")).getText(),vali_str);
		//validate view read text
		Assertion_obj.viewRead_Text_validation();
		driver.navigate().refresh();
		
	}



}
