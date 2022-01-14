package com.Utility.Bill.BillRunSecond;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class UseCase extends Sauce_Instance_Login_Test {

	public String customerNumber;
	public JavascriptExecutor executor;
	static String mno="";
	static String wno="";
	//public String planNo;
	public String planNo;


	//################################################
	//################################################
	@Test(priority = 1)
	public void createCustomer() throws Exception{

		executor = (JavascriptExecutor) driver;

		action_obj.customer_main_menu().click();
		action_obj.customer_F_name().sendKeys("Chandan");
		action_obj.customer_sure_name().sendKeys("verma");
		Select select = new Select(action_obj.Category_drop());
		select.selectByVisibleText("Business");

		List<WebElement> oSize2 = select.getOptions();
		int iListSize2 = oSize2.size();
		for(int i =0; i < iListSize2 ; i++){
			String sValue = select.getOptions().get(i).getText();
			System.out.println(sValue);  
		}

		action_obj.cus_address1().sendKeys("Shittla bazar");
		action_obj.cus_address2().sendKeys("rajgarh");
		action_obj.billingState().sendKeys("rajasthan");
		action_obj.toggle_button().click();
		action_obj.customer_country().sendKeys("india");
		action_obj.Phone_Mobile().sendKeys("78898525");
		Select select2 = new Select(action_obj.select_plan());
		select2.selectByIndex(1);

		action_obj.Email().sendKeys("cverma28@gmail.com");
		executor.executeScript("window,scrollBy(0,1800)", "");
		action_obj.save_customer().click();
		action_obj.ok().click();

		Assertion_obj.sucessfully_saved_customer_message_validation();
		customerNumber=driver.findElement(By.xpath(".//*[@id='nav']/div/div/div[1]/div[2]/div[1]/label/a")).getText();
	}

	@Test(priority = 2)
	public void Create_Cycle() throws Exception{
		action_obj.admin_mainMenu().click();
		action_obj.billRunCycle().click();
		action_obj.createNewPlan().click();
		action_obj.cycleName().sendKeys(customerNumber);
		action_obj.cycleDropDown().click();
		//Select select = new Select(driver.findElement(By.xpath(".//*[@id='custnos']")));
		//select.selectByVisibleText(customerNumber+"- Chandan verma");
		driver.findElement(By.xpath(".//*[contains(span,'"+customerNumber+"')]")).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		action_obj.saveCycle().click();
		Assertion_obj.cycleConfirmationMessage_text_assertion();
	}

	@Test(priority = 3)
	public void Service_And_Read() throws Exception{
		action_obj.search_field().sendKeys(customerNumber);
		action_obj.search_button().click();
		action_obj.overview_menu().click();
		action_obj.electricity_plus_icon().click(); 
		Assertion_obj.Electricity_service_page_header_validation(); 
		Select mydrpdwn = new Select(action_obj.plan_drop_down()); 
		mydrpdwn.selectByIndex(1); 
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
		action_obj.toggle_button().click(); 
		Select mydrpdwn2 = new Select(action_obj.readding_drop_down()); 
		mydrpdwn2.selectByVisibleText("Consumption"); 
		JavascriptExecutor jse = (JavascriptExecutor)driver;	 
		jse.executeScript("window.scrollBy(0,1500)", "");
		action_obj.create_service_button().click();
		action_obj.ok().click(); 
		Assertion_obj.utilities_header_validation(); 
		Assertion_obj.Overview_text_Validation(); 




		//@@@@@@@@@@@@@@@@@@@@@@@@@1111111111111111111111111111@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//meter read main menu
		action_obj.Meter_Reads_mainMenu().click();
		//select meter no for reading
		Select mydrpdwn2s = new Select(action_obj.MeterNoForMeterReading());
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
		//select today date
		action_obj.Meter_readdate().click();
		action_obj.select_today_date().click();
		//enter reading 
		action_obj.Meter_Read().sendKeys("100");
		//save read button
		executor.executeScript("javascript:saveAddModal();",  action_obj.save_Read_button());
		//validate view read text
		Assertion_obj.viewRead_Text_validation();
		//@@@@@@@@@@@@@@@@@@@@@@@@ MTR READ 222222222222222222222222  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		driver.navigate().refresh();
		//add read button
		action_obj.addReadButton().click();
		//validate add meter read popup message
		Assertion_obj.AddMeterReadPopupText_validation();
		//select read type
		Select mydrpdwn25a = new Select(action_obj.readTypeDropDown());
		mydrpdwn25a.selectByIndex(2);
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
		//validate view read text
		Assertion_obj.viewRead_Text_validation();
		driver.navigate().refresh();

	}

	//################################################
	//################################################
	@Test(priority = 4)
	public void addManualCharges() throws Exception {
		action_obj.search_field().sendKeys(customerNumber);
		Thread.sleep(4000);
		action_obj.search_button().click();
		Assertion_obj.Overview_text_Validation();
		action_obj.ChargesMainMenu().click();
		JavascriptExecutor  executor = (JavascriptExecutor) driver;
		executor.executeScript("javascript:goAdd_Onceoff()",  action_obj.ChargesPlusIcon());

		Select mydrpdown = new Select(action_obj.select_service());
		mydrpdown.selectByIndex(1);
		String string=mydrpdown.getOptions().get(1).getText();

		Thread.sleep(5000);
		Select mydrpdown1 = new Select(action_obj.changes_description_dropDown());
		mydrpdown1.selectByIndex(1);
		Thread.sleep(2000);

		action_obj.ChargeStartDate().click();
		action_obj.select_today_date().click();
		action_obj.ChargesEndDate().click();
		action_obj.next_button_calander().click();
		action_obj.select_end_date_as().click();
		action_obj.charges_unit().sendKeys("20");
		action_obj.ChargesRate().sendKeys("20");
		action_obj.Charges().sendKeys("200");
		executor.executeScript("javascript:formsubmit();", action_obj.ChargesSaveButton());

	}
	//################################################
	//################################################
	@Test(priority = 5)
	public void importMeterRead() throws InterruptedException, IOException{
		driver.navigate().refresh();

		action_obj.admin_mainMenu().click();
		action_obj.meterReadImport().click();
		action_obj.browse_button().click();

		Runtime.getRuntime().exec("E:\\MeterReadImportTemplate\\Customer Import Template Chrome.exe");
		Thread.sleep(6000);

		action_obj.description().sendKeys("MeterReadImport");
		action_obj.Upload_btn().click();
		Thread.sleep(40000);
		action_obj.play_button().click();
		action_obj.ok().click();



	}

	//################################################
	//################################################
	@Test(priority = 6)
	public void editRatePlan() throws InterruptedException {

		Thread.sleep(3000);
		action_obj.plan_mainmebu().click();
		Thread.sleep(2000);
		action_obj.searchPlanField().sendKeys(planNo);	Thread.sleep(2000);

		action_obj.PlanEditIcon().click();	Thread.sleep(2000);

		action_obj.TarifEditIcon().click();	Thread.sleep(2000);
		action_obj.rate().clear();
		action_obj.rate().sendKeys("50");	Thread.sleep(2000);

		action_obj.updateTerifButton().click();	Thread.sleep(2000);

		String Actualtext2 =  action_obj.getPlanUpdateRate().getText();
		Assert.assertEquals(Actualtext2, "$50.000000");

		action_obj.PublicshButton().click();
		action_obj.X().click();
		driver.navigate().refresh();

	}

	@Test(priority = 7)
	public void bill_with_ROLLBACK() throws Exception{
		action_obj.bill_run_mainMenu().click();
		Assertion_obj.Welcome_to_Bill_Run_Wizard_text_assertion();

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("javascript:skipMeterBulkImport()", action_obj.run_the_bill_button());
		action_obj.Recurring_harge_Date().click();
		action_obj.select_today_date().click();
		action_obj.issueDate().click();
		action_obj.select_today_date().click();
		action_obj.dueDate().click();
		Select cycle = new Select(action_obj.cycleno());
		cycle.selectByVisibleText(customerNumber );

		action_obj.bill_run_button().click();
		Thread.sleep(1000);
		action_obj.viewButton().click();

		Assertion_obj.Bill_Run_Results_text_assertion();


		String no = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div[2]/"
				+ "div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[1]/div[2]/div/div[1]/h2")).getText();



		action_obj.select_allcheck().click();
		action_obj.emailDrop_down().click();

		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("javascript:showEmailDialog('emailAll');", action_obj.allcutomerforemail());


		action_obj.Continue_email().click();
		action_obj.closeemail().click();
		Thread.sleep(3000);
		action_obj.closeBillrun().click();
		action_obj.yesButton().click();
		action_obj.billRunsearchButton().click();
		action_obj.searchnewcreatedUser().sendKeys(no.split("#")[1]);



		action_obj.viewDetailsIcon().click();
		String Actualtext04 = action_obj.statementPageHeader().getText();
		Assert.assertEquals(Actualtext04,no);



		Select all = new Select(action_obj.AllDrop_Down());
		all.selectByVisibleText("All");

		action_obj.rollbackbuttin().click();
		action_obj.continueTORollback().click();

		Assertion_obj.rollback_Message_text_assertion();

		//Switch to pop up
		//driver.switchTo().alert();

		//assertion
		String string= driver.findElement(By.xpath("html/body/div[16]/div/div/div[2]/div/div")).getText();
		Assert.assertEquals(string,"Rollback complete.");
		System.out.print("\n assertion_method_1() ->Rollback Complete");

		action_obj.closeRollback().click();
		Thread.sleep(3000);

		//Go to window control
		//driver.switchTo().defaultContent();

	}


	//################################################
	//################################################
	@Test(priority = 8)
	public void makePayments() throws Exception {

		action_obj.search_field().sendKeys(customerNumber);
		action_obj.search_button().click();
		Assertion_obj.Overview_text_Validation();
		action_obj.Payment_mainMenu().click();

		//Select transaction type from dropdown menu
		Select mydrpdwn = new Select(action_obj.transaction_type_DropDown());
		mydrpdwn.selectByVisibleText("Payment");

		List<WebElement> oSize = mydrpdwn.getOptions();
		int iListSize = oSize.size();
		for(int i =0; i < iListSize ; i++){
			String sValue = mydrpdwn.getOptions().get(i).getText();
			System.out.println(sValue);  }

		//Select Payment method from dropdown
		Select mydrpdown = new Select(action_obj.Payment_method_dropDown());
		mydrpdown.selectByVisibleText("Credit Card");
		/*
			List<WebElement> oSize1 = mydrpdwn.getOptions();
			int iListSize1 = oSize1.size();
			for(int i =0; i < iListSize1 ; i++){
			String sValue = mydrpdown.getOptions().get(i).getText();
			System.out.println(sValue);  }
		 */
		//email
		//driver.findElement(By.xpath(".//*[@id='receiptEmail']")).click();
		//Enter transaction date
		action_obj.transactionDate().click();
		action_obj.select_end_date_as().click();

		action_obj.PaymentAmount().sendKeys("10");

		action_obj.duplicate_payment_chechBox().click();
		action_obj.comments().sendKeys("hey!!!!! this is the comment section under Payment tab");

		action_obj.MakePaymentButton().click();
		Assertion_obj.Transaction_processed_successfully_validation();

	}
}
