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

public class multiple_Customers extends Sauce_Instance_Login_Test {

	//Create variables
	 Repo_Test action_obj;
	 Assertion_Test Assertion_obj;
	 JavascriptExecutor executor, jse;	
	 public String customerNumber;
	 public String customerno;
	 public String customerno1;
	 public String customerno2;		
  	 public String ServiceMGT="Savi";
     public	String electPlan="Multiple Tariff Plan"; //
	 static String mno="";	
	 static String de="";
	 static String gno;
		

String[] animalsArray;
@Test(priority = 0)
public void create_Plans() throws Exception {
			
				action_obj=new Repo_Test(driver);
				Assertion_obj = new Assertion_Test(driver);
				
				action_obj.plan_mainmebu().click();
			
				Assertion_obj.RatePlansPage_Title_assertion();
				
				action_obj.createNewPlan().click();
				Assertion_obj.planpopupheader_assertion();
		 
				Thread.sleep(3000);
		 		Select mydrpdwn = new Select(action_obj.planGroup()); 
				mydrpdwn.selectByIndex(0);
				Thread.sleep(3000);

		  		Select mydrpdwn1 = new Select(action_obj.planUsageType()); 
		///If Gas is available than
				mydrpdwn1.selectByIndex(3);
		///Else
//				mydrpdwn1.selectByIndex(2);
				
		 		action_obj.planName().sendKeys("Water Residential plan(Flat)");
		 		action_obj.planStartDate().click();
		 		
		 		 //action_obj.calanderPreviousButton().click();
		 		// action_obj.calanderPreviousButton().click();
		action_obj.select_today_date().click();
		action_obj.PlanEndDate().click();
		//action_obj.select_today_date().click();
		Thread.sleep(2000);
		action_obj.next_button_calander().click();
		Thread.sleep(1000);
		action_obj.next_button_calander().click();
		Thread.sleep(1000);
		action_obj.next_button_calander().click();  
		Thread.sleep(2000);
		action_obj.select_end_date_as().click();

		action_obj.addTrfBtn().click();
		action_obj.charge_desc().sendKeys("Usage charge");
			action_obj.rollup_desc().sendKeys("None");
			
			
			Thread.sleep(3000);
					Select mydrpdwn01 = new Select(action_obj.charge_type()); 
					mydrpdwn01.selectByVisibleText("Water Charges");
					Thread.sleep(3000);

					Select mydrpdwn02 = new Select(action_obj.method_type()); 
					mydrpdwn02.selectByVisibleText("Usage Flat Rate");
					Thread.sleep(3000);

					Select mydrpdwn03 = new Select(action_obj.unit_type()); 
					mydrpdwn03.selectByVisibleText("Kiloliter (kL)");
					
				action_obj.rate().sendKeys("65");
					action_obj.toggle_button().click();
					action_obj.updateTerifButton().click();


		Thread.sleep(1500);
		 action_obj.PublicshButton().click();
		 Thread.sleep(6000);
		 		 String Actualtext01 = action_obj.getplanNameon_popup().getText();
				 Assert.assertEquals(Actualtext01, "Water Residential plan(Flat)");
		action_obj.X().click();
			
//			action_obj.searchPlanField().sendKeys("Gas Flat Template Plan");
//			Assertion_obj.Plan_ID();

		System.out.println("--------------");
			}
			
@Test(priority = 1)
public void addTarifPlans() throws Exception {
				
				//action_obj.plan_mainmebu().click();
				driver.navigate().refresh();
		 action_obj.createNewPlan().click();
		 Assertion_obj.RatePlansPage_Title_assertion();

		 		Select mydrpdwn = new Select(action_obj.planGroup()); 
				mydrpdwn.selectByIndex(0);
		 		 
		 		Select mydrpdwn1 = new Select(action_obj.planUsageType()); 
				mydrpdwn1.selectByVisibleText("Retail Electricity");
		 		action_obj.planName().sendKeys("Electricity Residential plan");
				 action_obj.planStartDate().click();
				 //action_obj.calanderPreviousButton().click();
				 //action_obj.calanderPreviousButton().click();
				 action_obj.select_today_date().click();
				 //driver.findElement(By.xpath(".//*[text()='1']")).click();
				 
		 action_obj.PlanEndDate().click();
		 
		//action_obj.select_today_date().click();
		 Thread.sleep(2000);
		 action_obj.next_button_calander().click();
		 Thread.sleep(1000);
		 action_obj.next_button_calander().click();
		 Thread.sleep(1000);
		 action_obj.next_button_calander().click();  
		 Thread.sleep(2000);
		 action_obj.select_end_date_as().click();

		 action_obj.addTrfBtn().click();
		 action_obj.charge_desc().sendKeys("Usage charge");
			action_obj.rollup_desc().sendKeys("None");
			
			
			Thread.sleep(3000);
		 			Select mydrpdwn01 = new Select(action_obj.charge_type()); 
					mydrpdwn01.selectByVisibleText("Electricity Charges");
					Thread.sleep(3000);

		 			Select mydrpdwn02 = new Select(action_obj.method_type()); 
					mydrpdwn02.selectByVisibleText("Usage Flat Rate");
					Thread.sleep(5000);

		 			Select mydrpdwn03 = new Select(action_obj.unit_type()); 
					mydrpdwn03.selectByIndex(3);	//if fail change with "Kilowatt Hour
					action_obj.rate().sendKeys("65");
		 			action_obj.toggle_button().click();
		 			action_obj.updateTerifButton().click();
		 	 
//				 salary date, account, appraisals when
				  
		 	
			}
@Test(priority = 2)
public void addTarifMonthly() throws InterruptedException {
			Thread.sleep(1000);
				 action_obj.addTrfBtn().click();
		 action_obj.charge_desc().sendKeys("monthly administration fee");
		 action_obj.rollup_desc().sendKeys("None");

			Thread.sleep(3000);

		 			Select mydrpdwn01 = new Select( action_obj.charge_type()); 
					mydrpdwn01.selectByVisibleText("Electricity Charges");
					Thread.sleep(3000);

		 			Select mydrpdwn02 = new Select(action_obj.method_type()); 
					mydrpdwn02.selectByVisibleText("Usage Tiered Monthly");
					Thread.sleep(5000);

		 			Select mydrpdwn03 = new Select(action_obj.unit_type()); 
		 			mydrpdwn03.selectByIndex(3);
					//mydrpdwn03.selectByVisibleText("Kilowatt Hour (kWh)");   //If fail then use upper
		 			
				action_obj.toggle_button().click();
				action_obj.rateonmonthlyTeriff().sendKeys("10");
		 		action_obj.from().sendKeys("100");
		 		 action_obj.to().sendKeys("1000");
		 			 action_obj.addRangeBtn().click();
		 			 action_obj.updateTerifButton().click();
		 			 
				 
				
			}	 
			///////////////////////////////////////////////////////////////////////////////////////////////	 
@Test(priority = 3)
public void addTarifConnectionFee() throws InterruptedException {	 
			Thread.sleep(5000);	
		 action_obj.addTrfBtn().click();
		 
		 action_obj.charge_desc().sendKeys("Connection Fee");
		 action_obj.rollup_desc().sendKeys("None");
			Thread.sleep(3000);

		 			Select mydrpdwn01 = new Select(action_obj.charge_type()); 
					mydrpdwn01.selectByVisibleText("Account Level Charges");
					
					Thread.sleep(5000); // sleep time
		 			Select mydrpdwn02 = new Select(action_obj.method_type()); // Click with ctrl on method type
					mydrpdwn02.selectByVisibleText("Access Fee");
					Thread.sleep(3000);

		 			Select mydrpdwn03 = new Select(action_obj.unit_type()); 
					mydrpdwn03.selectByVisibleText("Month");
		 		action_obj.rate().sendKeys("60");
		 			 action_obj.toggle_button().click();
		 			 action_obj.updateTerifButton().click();
		 			 Thread.sleep(700);
		 	 action_obj.PublicshButton().click();
		  //String Actualtext1 = action_obj.getplanNameon_popup().getText();
	    //Assert.assertEquals(Actualtext1, "Connection Fee");
		 	 Thread.sleep(2000);
		 	 		action_obj.X().click();
//					Thread.sleep(5000);
					Thread.sleep(1000);
//					driver.findElement(By.xpath(".//*[@id='datatablePlnList']/thead/tr/th[1]")).click();
//					Thread.sleep(3000);
		 			String Actualtext2 = action_obj.planNameonPlanPage().getText();
					Assert.assertEquals(Actualtext2, "Electricity Residential plan");
			 
			}
			 
@Test(priority = 4)
public void addCommericalPlan() throws Exception {	
				action_obj.createNewPlan().click();
				Assertion_obj.RatePlansPage_Title_assertion();
				Thread.sleep(3000);
				
		 		Select mydrpdwn = new Select(action_obj.planGroup()); 
				mydrpdwn.selectByIndex(0);
				Thread.sleep(3000);

		 		Select mydrpdwn1 = new Select(action_obj.planUsageType()); 
				mydrpdwn1.selectByVisibleText("Retail Electricity");
		 		action_obj.planName().sendKeys("Commercial plan");
		 		 action_obj.planStartDate().click();
		 		// action_obj.calanderPreviousButton().click();
		 		 //action_obj.calanderPreviousButton().click();
		action_obj.select_today_date().click();

		 action_obj.PlanEndDate().click();

		//action_obj.select_today_date().click();
		 Thread.sleep(2000);
		 action_obj.next_button_calander().click();
		 Thread.sleep(1000);
		 action_obj.next_button_calander().click();
		 Thread.sleep(1000);
		 action_obj.next_button_calander().click();  
		 Thread.sleep(2000);
		 action_obj.select_end_date_as().click();

		action_obj.addTrfBtn().click();
		action_obj.charge_desc().sendKeys("Usage commerical");
		action_obj.rollup_desc().sendKeys("None");

		Thread.sleep(3000);

		 			Select mydrpdwn01 = new Select(action_obj.charge_type()); 
					mydrpdwn01.selectByVisibleText("Electricity Charges");		
					Thread.sleep(3000);

		 			Select mydrpdwn02 = new Select(action_obj.method_type()); 
					mydrpdwn02.selectByVisibleText("Usage Peak");
					Thread.sleep(3000);

		 			Select mydrpdwn03 = new Select(action_obj.unit_type()); 
			//		mydrpdwn03.selectByVisibleText("Kilowatt Hour (kWh)");
					mydrpdwn03.selectByIndex(3); //if upper one is fail
		 		action_obj.rate().sendKeys("85");
		 action_obj.toggle_button().click();
		 
		 action_obj.updateTerifButton().click();
			}
@Test(priority = 5)
public void addMontlyPlan() throws InterruptedException {	
				Thread.sleep(1000);
				action_obj.addTrfBtn().click();
		action_obj.charge_desc().sendKeys("monthly administration");
		action_obj.rollup_desc().sendKeys("None");		Thread.sleep(3000);
		Thread.sleep(3000);

		 			Select mydrpdwn01 = new Select( action_obj.charge_type()); 
					mydrpdwn01.selectByVisibleText("Electricity Charges");		Thread.sleep(3000);

		 			Select mydrpdwn02 = new Select(action_obj.method_type()); 
					mydrpdwn02.selectByVisibleText("Usage Tiered Monthly");		Thread.sleep(3000);

		 		 
		 			Select mydrpdwn03 = new Select(action_obj.unit_type()); 
					mydrpdwn03.selectByIndex(1);
		 		 
			action_obj.toggle_button().click();
			action_obj.rateonmonthlyTeriff().sendKeys("20");
		 action_obj.from().sendKeys("100");
		 action_obj.to().sendKeys("1000");
					action_obj.addRangeBtn().click();
		 	action_obj.updateTerifButton().click();
		 	
			
			 	 
				
			}
@Test(priority = 6)
public void addConnectionPlan() throws InterruptedException {	
				Thread.sleep(5000);
				action_obj.addTrfBtn().click();
			action_obj.charge_desc().sendKeys("Connection Fee");
			action_obj.rollup_desc().sendKeys("None");		Thread.sleep(3000);

		 			Select mydrpdwn01 = new Select(action_obj.charge_type()); 
					mydrpdwn01.selectByVisibleText("Account Level Charges");		
					Thread.sleep(3000);

		 			Select mydrpdwn02 = new Select(action_obj.method_type()); 
					mydrpdwn02.selectByVisibleText("Access Fee");
					Thread.sleep(3000);

		 			Select mydrpdwn03 = new Select(action_obj.unit_type()); 
					mydrpdwn03.selectByVisibleText("Month");
		 action_obj.rate().sendKeys("100");
		 			 action_obj.toggle_button().click();
		action_obj.updateTerifButton().click();
		Thread.sleep(500);
		 action_obj.PublicshButton().click();
		 
		 
					 
		 	//24 jan		 String s1=action_obj.getplanNumber().getText();
					 
					// animalsArray = s1.split("Plan Number ");
					//	for(int i=0;i<animalsArray.length;i++)
					///	{
					//	System.out.println(animalsArray[i]+" Header");
					//	}   
	  action_obj.X().click();

           Thread.sleep(5000);
		 
		 		 
			}  
			
@Test(priority = 7, invocationCount = 3) 
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
       
       System.out.println(":---------------: Add Customer Services(Water Residential plan(Flat))  :---------------------:");
      
       //click on overview menu
			action_obj.overview_menu().click(); 
			
			//Select Water Service
			action_obj.waterIcon().click();
		//Assertion on Water Service 
        Assertion_obj.water_service_page_header_validation();  
        Select mydrpdwn11 = new Select(action_obj.plan_drop_down()); 
        
		///////updation required
        
		//mydrpdwn.selectByVisibleText("Multiple Tariff Plan");// 17 nov changed on Electricity Flat Template Plan
		
		mydrpdwn11.selectByVisibleText("Water Residential plan(Flat)");
				
		//enter meter number
		action_obj.meter_number().sendKeys("107_"+mno); 
		//select meter configuration type
		Select mydrpdwn12 = new Select(action_obj.meterConfig_drop_down()); 
		mydrpdwn12.selectByVisibleText("Flat Rate"); 
		//Select 'Reading Type'
		Select mydrpdwn13 = new Select(driver.findElement(By.id("readType")));
		mydrpdwn13.selectByVisibleText("Reads");
		//save service
		executor.executeScript("window.scrollBy(0,1500)", "");
		executor.executeScript("javascript:sendForm();",
		action_obj.create_service_button());

		//ok 
		action_obj.ok().click(); 
		//validate overview text
		Assertion_obj.Overview_text_Validation(); 
		
		//add Meter Reads 
		
		//meter read main menu
		action_obj.Meter_Reads_mainMenu().click();
		//select meter no for reading
		driver.navigate().refresh();
		Thread.sleep(700);
		Select mydrpdwn140 = new Select(action_obj.MeterNoForMeterReading());
		Thread.sleep(2000);
		mydrpdwn140.selectByVisibleText("107_"+mno);
		//validate view read text
		Assertion_obj.viewRead_Text_validation();
		//add read button
		Thread.sleep(2000);
		action_obj.addReadButton().click();
		//validate add meter read text
		Assertion_obj.AddMeterReadPopupText_validation();
		//select reading type
		Select mydrpdwn321 = new Select(action_obj.readTypeDropDown());
		mydrpdwn321.selectByVisibleText("Initial");
//		String vali_str=mydrpdwn25.getFirstSelectedOption().getText();
		//select today date
		action_obj.Meter_readdate().click();
		Thread.sleep(2000);
		action_obj.select_today_date().click();
	
		//enter reading 
		action_obj.Meter_Read().sendKeys("10");
		//save read button
		Thread.sleep(3000);
		
		
		
//		executor.executeScript("javascript:saveRead();",  action_obj.save_Read_button());
		
		action_obj.save_Read_button().click();
		
		//validate by read type text selected in dropdown
	//	Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()='"+vali_str+"'])[1]")).getText(),vali_str);
//		Select mydrpdwn2s = new Select(action_obj.MeterNoForMeterReading());
//		Thread.sleep(2000);
//		mydrpdwn2s.selectByVisibleText("108_"+mno);
		//validate view read text
		Assertion_obj.viewRead_Text_validation();

  		
		//add read button
	    
		Thread.sleep(2000);
		action_obj.addReadButton().click();
		//validate add meter read popup message
		Assertion_obj.AddMeterReadPopupText_validation();
		
		//select read type water Service
		Select mydrpdwn123 = new Select(action_obj.readTypeDropDown());
		mydrpdwn123.selectByIndex(1);      
		
		
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
		//Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()='"+vali_str1+"'])[1]")).getText(),vali_str1);
		//validate view read text
		Assertion_obj.viewRead_Text_validation();
		Thread.sleep(2000);
		driver.navigate().refresh();
        Thread.sleep(8000);
        
        
        
        System.out.println(":-------------:Add Gas Service(Gas Flat Template Plan) :---------------:");
     
        //click on overview menu
		action_obj.overview_menu().click(); 
		//Select Wate Service
		action_obj.Gas_btn_click().click();
	//Asertion on Gas Service 
    Assertion_obj.gas_service();  
    Select mydrpdwngas = new Select(action_obj.plan_drop_down()); 
    
	///////updation required
	//mydrpdwn.selectByVisibleText("Multiple Tariff Plan");// 17 nov changed on Electricity Flat Template Plan
	
	mydrpdwngas.selectByVisibleText("Gas Flat Template Plan");
			
	//enter meter number
	action_obj.meter_number().sendKeys("106_"+mno); 
	//select meter configuration type
	Select mydrpdwnfas = new Select(action_obj.meterConfig_drop_down()); 
	mydrpdwnfas.selectByVisibleText("Flat Rate"); 
	//Select 'Reading Type'
	Select mydrpdwnfa = new Select(driver.findElement(By.id("readType")));
	mydrpdwnfa.selectByVisibleText("Reads");
	//save service
	executor.executeScript("window.scrollBy(0,1500)", "");
	executor.executeScript("javascript:sendForm();",
	action_obj.create_service_button());

	//ok 
	action_obj.ok().click(); 
	//validate overview text
	Assertion_obj.Overview_text_Validation(); 
	
	//add Meter Reads 
	
	//meter read main menu
	action_obj.Meter_Reads_mainMenu().click();
	//select meter no for reading
	driver.navigate().refresh();
	Thread.sleep(700);
	Select mydrpdwn1qw = new Select(action_obj.MeterNoForMeterReading());
	Thread.sleep(2000);
	mydrpdwn1qw.selectByVisibleText("106_"+mno);
	//validate view read text
	Assertion_obj.viewRead_Text_validation();
	//add read button
	Thread.sleep(2000);
	action_obj.addReadButton().click();
	//validate add meter read text
	Assertion_obj.AddMeterReadPopupText_validation();
	//select reading type
	Select mydrpdwnqw1 = new Select(action_obj.readTypeDropDown());
	mydrpdwnqw1.selectByVisibleText("Initial");
//	String vali_str=mydrpdwn25.getFirstSelectedOption().getText();
	//select today date
	action_obj.Meter_readdate().click();
	Thread.sleep(2000);
	action_obj.select_today_date().click();

	//enter reading 
	action_obj.Meter_Read().sendKeys("10");
	//save read button
	Thread.sleep(3000);
	
	
	
//	executor.executeScript("javascript:saveRead();",  action_obj.save_Read_button());
	
	action_obj.save_Read_button().click();
	
	//validate by read type text selected in dropdown
//	Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()='"+vali_str+"'])[1]")).getText(),vali_str);
//	Select mydrpdwn2s = new Select(action_obj.MeterNoForMeterReading());
//	Thread.sleep(2000);
//	mydrpdwn2s.selectByVisibleText("108_"+mno);
	//validate view read text
	Assertion_obj.viewRead_Text_validation();

		
	//add read button
    
	Thread.sleep(2000);
	action_obj.addReadButton().click();
	//validate add meter read popup message
	Assertion_obj.AddMeterReadPopupText_validation();
	
	//select read type water Service
	Select mydrpdwnvcx = new Select(action_obj.readTypeDropDown());
	mydrpdwnvcx.selectByIndex(1);      
	
	
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
	//Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()='"+vali_str1+"'])[1]")).getText(),vali_str1);
	//validate view read text
	Assertion_obj.viewRead_Text_validation();
	Thread.sleep(2000);
	driver.navigate().refresh();
    Thread.sleep(5000); 
    
    action_obj.Payment_mainMenu().click();
	  Thread.sleep(1000);
	  System.out.println(" :------------------:Customer's Payment  :-----------------------------:");
		//Select transaction type from dropdown menu
		Select mydrpdwnl = new Select(action_obj.transaction_type_DropDown());
		mydrpdwnl.selectByVisibleText("Payment");

		//List<WebElement> oSize = mydrpdwn.getOptions();
		//int iListSize = oSize.size();
		//for(int i =0; i < iListSize ; i++){
		//	String sValue = mydrpdwn.getOptions().get(i).getText();
		//	System.out.println(sValue);  }

		//Select Payment method from dropdown
		Select mydrpdownl = new Select(action_obj.Payment_method_dropDown());
		mydrpdownl.selectByVisibleText("Credit Card");
		
		//	List<WebElement> oSize1 = mydrpdwn.getOptions();
		//	int iListSize1 = oSize1.size();
		//	for(int i =0; i < iListSize1 ; i++){
		//	String sValue = mydrpdown.getOptions().get(i).getText();
		//	System.out.println(sValue);  } 
		 
		//email
	WebElement reciptmaill=driver.findElement(By.xpath(".//*[@id='receiptEmail']"));
	reciptmaill.clear();
	reciptmaill.sendKeys("asdf@yopmail.com");
	   //Enter transaction date
		//action_obj.transactionDate().click();
//		Thread.sleep(5000);
		//action_obj.select_end_date_as().click();  

		action_obj.PaymentAmount().sendKeys("60");

		action_obj.duplicate_payment_chechBox().click();
		action_obj.comments().sendKeys("hey!!!!! this is the comment section under Payment tab");

		action_obj.MakePaymentButton().click();
		Thread.sleep(3000);
		//ok
		Thread.sleep(2000);
	    action_obj.ok().click();
		//Thread.sleep(8000);
		//driver.findElement(By.xpath(".//button[contains(text(),'Save')]")).click();
		
		//validate message
		Assertion_obj.Transaction_processed_successfully_validation();
		Thread.sleep(1000);
		action_obj.Payment_HistoryView().click();
		Thread.sleep(3000);
		

	 System.out.println("Payment complete ");  
	 Thread.sleep(5000);
    
  		} 
@Test(priority=8)
public void BillRun_Cycle_For_Multiple_Customers() throws InterruptedException
{
	// Search Customer for get latest three cusomtet id 
	 
	  action_obj.search_button().click();
	 Thread.sleep(9000);
	  customerno=driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/table/tbody/tr[1]/td[1]")).getText();
	  customerno1=driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/table/tbody/tr[2]/td[1]")).getText();
	  customerno2=driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/table/tbody/tr[3]/td[1]")).getText();
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
//		Actions action2 = new Actions(driver);
//		action2.sendKeys(Keys.ESCAPE).build().perform();
		//Add third
		
		driver.findElement(By.xpath(".//*[contains(span,'"+customerno2+"')]")).click();
		Actions action3 = new Actions(driver);
		action3.sendKeys(Keys.ESCAPE).build().perform();
		
		
		action_obj.saveCycle().click();
//		Assertion_obj.cycleConfirmationMessage_text_assertion();
		action_obj.cycleID().isDisplayed();
}
@Test(priority = 9)
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
	//commit button
	action_obj.commitButton().click();
	//click on continue commit
	action_obj.Continue_commit().click();

	//get commit message text
	String commit= action_obj.commitmessage().getText();
	Assert.assertEquals(commit, "Successfully committed statement no. "+no.split("#")[1]);
	//click ok
	action_obj.ok().click();
}

@Test(priority=11)
public void PayOutstandingBalance_for_oneCustomer() throws Exception
{
action_obj.search_field().sendKeys(customerno);
action_obj.search_button().click();
action_obj.Payment_mainMenu().click();
Thread.sleep(1000);
System.out.println(" :------------------:Customer's Payment  :-----------------------------:");
	//Select transaction type from dropdown menu
	Select mydrpdwnl = new Select(action_obj.transaction_type_DropDown());
	mydrpdwnl.selectByVisibleText("Payment");

	//List<WebElement> oSize = mydrpdwn.getOptions();
	//int iListSize = oSize.size();
	//for(int i =0; i < iListSize ; i++){
	//	String sValue = mydrpdwn.getOptions().get(i).getText();
	//	System.out.println(sValue);  }

	//Select Payment method from dropdown
	Select mydrpdownl = new Select(action_obj.Payment_method_dropDown());
	mydrpdownl.selectByVisibleText("Credit Card");
	
	//	List<WebElement> oSize1 = mydrpdwn.getOptions();
	//	int iListSize1 = oSize1.size();
	//	for(int i =0; i < iListSize1 ; i++){
	//	String sValue = mydrpdown.getOptions().get(i).getText();
	//	System.out.println(sValue);  } 
	 
	//email
WebElement reciptmaill=driver.findElement(By.xpath(".//*[@id='receiptEmail']"));
reciptmaill.clear();
reciptmaill.sendKeys("asdf@yopmail.com");
 //Enter transaction date
	//action_obj.transactionDate().click();
//	Thread.sleep(5000);
	//action_obj.select_end_date_as().click();  

	action_obj.PaymentAmount().sendKeys("60");

	action_obj.duplicate_payment_chechBox().click();
	action_obj.comments().sendKeys("hey!!!!! this is the comment section under Payment tab");

	action_obj.MakePaymentButton().click();
	Thread.sleep(3000);
	//ok
	Thread.sleep(2000);
  action_obj.ok().click();
	//Thread.sleep(8000);
	//driver.findElement(By.xpath(".//button[contains(text(),'Save')]")).click();
	
	//validate message
	Assertion_obj.Transaction_processed_successfully_validation();
	Thread.sleep(1000);
	action_obj.Payment_HistoryView().click();
	Thread.sleep(3000);
	

System.out.println("Payment complete ");  
Thread.sleep(5000);
}
@Test(priority=12)
public void Next_month_BillRun() throws Exception

{
	
	Thread.sleep(3000);
	action_obj.bill_run_mainMenu().click();
	Assertion_obj.Welcome_to_Bill_Run_Wizard_text_assertion();

	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("javascript:skipMeterBulkImport()", action_obj.run_the_bill_button());
	action_obj.Recurring_harge_Date().click();
	action_obj.next_button_calander().click();  
	Thread.sleep(2000);
	action_obj.ENdDate_SelectBill().click();
	//action_obj.ENdDate_select().click();
	Thread.sleep(1000);
	action_obj.issueDate().click();
	action_obj.next_button_calander().click();  
	Thread.sleep(2000);
	action_obj.ENdDate_SelectBill().click();
	//action_obj.ENdDate_select().click();
	action_obj.dueDate().click();
	action_obj.next_button_calander().click();  
	Thread.sleep(2000);
	action_obj.ENdDate_SelectBill().click();
	//action_obj.ENdDate_select().click();
	
	Select cycle = new Select(action_obj.cycleno());
	cycle.selectByVisibleText(customerNumber );

	action_obj.bill_run_button().click();
	
	Thread.sleep(12000);
	action_obj.viewButton().click();
Thread.sleep(10000);
	Assertion_obj.Bill_Run_Results_text_assertion();


	String no = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div[2]/"
			+ "div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[1]/div[2]/div/div[1]/h2")).getText();
  
	  Thread.sleep(3000);
	// Check Balance After payment outstanding balance
	//Assertion_obj.Assertcurrentbalance();
	
	Thread.sleep(10000);
	//commit button
	action_obj.commitButton().click();
	//click on continue commit
	action_obj.Continue_commit().click();

	//get commit message text
	String commit= action_obj.commitmessage().getText();
	Assert.assertEquals(commit, "Successfully committed statement no. "+no.split("#")[1]);
	//click ok
	action_obj.ok().click();	
}
}		

