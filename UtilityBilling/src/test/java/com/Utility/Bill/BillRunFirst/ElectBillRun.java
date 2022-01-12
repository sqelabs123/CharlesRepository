package com.Utility.Bill.BillRunFirst;

import java.awt.Checkbox;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_instance_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;
import com.Utility.Bill.Re_Usable.Testdata;
import com.Utility.Bill.Re_Usable.csv;
// import bsh.classpath.BshClassPath.AmbiguousName;


public class ElectBillRun extends Sauce_Instance_Login_Test {
	//	public class ElectBillRun extends Sauce_instance_Test {	

	public String customerNumber;
	public JavascriptExecutor executor;
	static String mno="";
	String MtrNo4CSV="";
	static String wno="";
	public String planNo;
	public String bill_amount="";
	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;


	//#####################################################
	@Test(priority = 1)
	public void setUpSTMP() throws Exception{

		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);	

		//admin main menu
		action_obj.admin_mainMenu().click();
		//smtp menu under admin
		action_obj.smtpmainmenu().click();
		//validate smtp page title
		Assertion_obj.smtpPageTitle_assertion();

		//enter server address
		action_obj.server().clear();
		action_obj.server().sendKeys("mail.utilibill.com.au");
		//enter port
		action_obj.port().clear();
		action_obj.port().sendKeys("25");


		//click on check box
		if ( ! action_obj.smtpcheck().isSelected() )
		{
			action_obj.smtpcheck().click();
		}  


		//enter email
		action_obj.smtp_username().clear();
		action_obj.smtp_username().sendKeys("testingkk464@gmail.com");
		//enter password
		action_obj.smtp_password().clear();
		action_obj.smtp_password().sendKeys("swaan321");

		//click on update dmtp
		action_obj.updateSMTP().click();
		//validate confirmation message
		Assertion_obj.SMTPSucessfullMessage_assertion();


	}


	//#####################################################
	//#####################################################
	@Test(priority = 2)
	public void Email_tempalteSetup() throws Exception{
		//Click on the Admin link
		action_obj.admin_mainMenu().click();
		//template   button under admin
		action_obj.Templatesmainmenu().click();
		driver.navigate().refresh();

		//select email type as invoice
		Select mydrpdown1 = new Select(action_obj.email_message_type());
		mydrpdown1.selectByVisibleText("Invoice");
		//enter email
		action_obj.email_rem_from().clear();
		action_obj.email_rem_from().sendKeys("testingkk464@gmail.com");
		//Enter email subject
		action_obj.emailsubject().clear();
		action_obj.emailsubject().sendKeys("Email Template Subject");
		Thread.sleep(2000);
		//Email Message
		//		action_obj.emailmessage().click();                                                                                                       
		Thread.sleep(700);                                                                  
		//click on save button
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("javascript:save('E')", action_obj.email_SaveButton());
		//validate confirmation message
		Assertion_obj.templateEmailsucessfulMessage_assertion();

	}

	@Test(priority = 3)
	public void SMS_tempalteSetup() throws Exception{
		
		
		//click on sms tab
		
		action_obj.smsTab().click();
		//select message type
		Select select =  new Select(action_obj.sms_message_type());
		select.selectByIndex(1);
		executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,500)", "");

		//select save button
		action_obj.sms_saveButton().click();
		//validate confirmation message
		Assertion_obj.templateSMSsucessfulmessage_assertion();


	}
	//#####################################################
	//#####################################################
	@Test(priority = 4)
	public void changeCustEMail() throws Exception{

		Thread.sleep(5000);
		/*//executor = (JavascriptExecutor) driver;
		executor.executeScript("window,scrollBy(0,-1900)", "");
	
 	driver.navigate().refresh();*/
		action_obj.customer_main_menu().click();
		action_obj.customer_F_name().sendKeys("James");
		action_obj.customer_sure_name().sendKeys("Smith");
		Select select = new Select(action_obj.Category_drop());
		//select.selectByVisibleText("Business");
		select.selectByVisibleText("Residential");

		List<WebElement> oSize2 = select.getOptions();
		int iListSize2 = oSize2.size();
		for(int i =0; i < iListSize2 ; i++){
			String sValue = select.getOptions().get(i).getText();
			System.out.println(sValue);  
		}

		action_obj.cus_address1().sendKeys("Lombard Street");
		action_obj.cus_address2().sendKeys("San Francisco");
		action_obj.billingState().sendKeys("San Francisco");
		action_obj.toggle_button().click();
		action_obj.customer_country().sendKeys("UA");
		action_obj.Phone_Mobile().sendKeys("78898525");
		Select select2 = new Select(action_obj.select_plan());
		select2.selectByVisibleText("Electricity Residential plan");// 17 nov changed
		// sleep time
		Thread.sleep(10000);
		action_obj.Email().sendKeys("tetester591@gmail.com");
		action_obj.BEmail().sendKeys("tetester591@gmail.com");
		Thread.sleep(5000);
	// Add New Codeb 17-03-2021
		executor=(JavascriptExecutor) driver;
		executor.executeScript("window,scrollBy(0,1800)", "");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/form/div/div[2]/div[5]/div[2]/div[1]/div/label/span[1]")).click();

		action_obj.save_customer().click();
		action_obj.ok().click();

		Assertion_obj.sucessfully_saved_customer_message_validation();
		customerNumber=driver.findElement(By.xpath(".//*[@id='nav']/div/div/div[1]/div[2]/div[1]/label/a")).getText();


		//click details tab of customer
		action_obj.detailsCustomerTab().click();
		//validate Account Type text
		Assertion_obj.accounttypetextUnderDetailsCustomerMenu_assertion();
		//Edit email
		action_obj.Email().clear();
		action_obj.Email().sendKeys("monulabs159@gmail.com");
		Thread.sleep(6000);
		//scroll
		// JavascriptExecutor executor =(JavascriptExecutor) driver;
		
		executor.executeScript("scrollBy(0,2500)", "");


		//click on save customer
		action_obj.save_customer().click();
		//OK
		action_obj.ok().click();
		//Confirmation message
		Assertion_obj. sucessfully_saved_customer_message_validation();


	}

	@Test(priority = 5)
	public void Create_Cycle() throws Exception{

		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);	
		 
		driver.navigate().refresh();
		Thread.sleep(3000);
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

	 //	action_obj.cycleDropDown().click();

		//driver.findElement(By.xpath(".//*[contains(span,'"+customerNumber+"')]")).click();
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.ESCAPE).build().perform(); 

		Assertion_obj.cycleConfirmationMessage_text_assertion();
		// Chage For Once Time
		//	action_obj.cycleID().isDisplayed();
	}

	@Test(priority = 6)
	public void Service_And_Read() throws Exception{
		action_obj.search_field().sendKeys(customerNumber);
		action_obj.search_button().click();
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
		MtrNo4CSV="Ele"+mno;
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




		//@@@@@@@@@@@@@@@@@@@@@@@@ MTR READ 11111111111  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

		//meter read main menu
		action_obj.Meter_Reads_mainMenu().click();
		//select meter no for readSing
		Thread.sleep(10000);
		Select mydrpdwn2s = new Select(action_obj.MeterNoForMeterReading());
		//			mydrpdwn2s.selectByIndex(1);

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
		//			executor.executeScript("javascript:saveRead();",  action_obj.save_Read_button());
		action_obj.save_Read_button().click();
		//vv////v//
		//	String Initialreads =driver.findElement(By.xpath(".//*[contains(text(),'Initial Read')]")).getText();
		//	Assert.assertEquals(Initialreads, "Initial Read");
		//validate by read type text selected in dropdown
		//Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()="+vali_str+"'])[1]")).getText(),vali_str);
		//validate view read text
		Assertion_obj.viewRead_Text_validation();
		 
		Thread.sleep(500);
		 mydrpdwn2s.selectByVisibleText("Ele"+mno);
		//add read button
		Thread.sleep(1000);
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
		//dfdfdf/dddf/
		//	String ActualReads =driver.findElement(By.xpath(".//*[contains(text(),'Actual')]")).getText();
		//	Assert.assertEquals(ActualReads, "Actual");
		//validate by read type text selected in dropdown
		//	Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()="+vali_str1+"'])[1]")).getText(),vali_str1);
		//validate view read text
		Assertion_obj.viewRead_Text_validation();
		//	driver.navigate().refresh();
	}

	@Test(priority = 7)
	public void bill_with_DOWNLOAD_PDF_and_Commit() throws Exception{

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

		Thread.sleep(2000);
		try {


			List<WebElement> x=driver.findElements(By.xpath(".//*[@id='myBillrunValidationModal']/div/div/div/div/div/div[1]/h2"));
			Thread.sleep(2000);

			if(x.size()!=0)
				driver.findElement(By.xpath(".//*[@id='myBillrunValidationModal']/div/div/div/div/div/div[1]/div/a/i")).click();
			Thread.sleep(2000);


			//get bill amount
			bill_amount=driver.findElement(By.xpath(".//*[@class='currBill'] ")).getText();
		} catch (Exception e) {
			// TODO: handle exception
		}
		//view button
		Thread.sleep(3000);
		action_obj.viewButton().click();
		Thread.sleep(6000);


		//Assertion to validate  Bill Run Results text is present 
		//hide 30 nov  String Actualtext03 = driver.findElement(By.xpath(".//*[@id='myBillRunResultsModal']/div/div/div[1]/h4")).getText();
		//hide 30 nov Assert.assertEquals(Actualtext03, "Bill Run Results");
		//hide 30 nov System.out.print("\n assertion_method_1() ->Bill Run Results Part executed");


		//get statement number 
		String no = driver.findElement(By.xpath(".//*[contains(text(),'Statement Summary #') ]")).getText();

		//select all check boxes from left side
		action_obj.select_allcheck().click();
		//click on email dropdown		
		action_obj.emailDrop_down().click();
		//click on all customer for email
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("javascript:showEmailDialog('emailAll');", action_obj.allcutomerforemail());
		//click on continue email button
		action_obj.Continue_email().click();
		//close email pop up
		action_obj.closeemail().click();

		Thread.sleep(6000);
		//close bill run popup
		action_obj.closeBillrun().click();
		//yes button
		action_obj.yesButton().click();
		Thread.sleep(4000);
		//click on bill run search button
		action_obj.billRunsearchButton().click();
		Thread.sleep(8000);
		//enter statement number
		action_obj.searchnewcreatedUser().sendKeys(no.split("#")[1]);
		//click on view details icon
		action_obj.viewDetailsIcon().click();
		//validate header of the page
		String Actualtext04 = action_obj.statementPageHeader().getText();
		Assert.assertEquals(Actualtext04,no);

		//select all option on all dropdown		
		Select all = new Select(action_obj.AllDrop_Down());
		all.selectByVisibleText("10");
		//check all check boxes
		action_obj.select_allcheck().click();
		//click on download dropdown
		action_obj.downloadDropDown().click();
		//click on download selected under download dropdown
		action_obj.downloadSelected().click(); 
		Thread.sleep(3000);
		//download button some time appear, not in chrome 
		//		action_obj.downloadbutton().click();
		try {
			action_obj.downloadbutton().click();
		} catch (Exception e)
		{
			// TODO: handle exception
		}

		Thread.sleep(5000);
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




	@Test(priority = 8)
	public void SecondMonthRead() throws Exception{

		//driver.navigate().to("https://test.waterworkslms.com/waterworks");
		driver.navigate().refresh();
		Thread.sleep(500);
		action_obj.search_field().sendKeys(customerNumber);
		Thread.sleep(500);
		action_obj.search_button().click();
		//@@@@@@@@@@@@@@@@@@@@@@@@@2222222222222222222222222222222@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//meter read main menu
		action_obj.Meter_Reads_mainMenu().click();
		Thread.sleep(3000);
		//select meter no for reading
		Select mydrpdwn2s = new Select(action_obj.MeterNoForMeterReading());
		mydrpdwn2s.selectByVisibleText("Ele"+mno);
		//validate view read text
		Assertion_obj.viewRead_Text_validation();
		//add read button
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");

		action_obj.addReadButton().click();
		//validate add meter read text
		Assertion_obj.AddMeterReadPopupText_validation();
		//select reading type
		Select mydrpdwn25 = new Select(action_obj.readTypeDropDown());

		//mydrpdwn25.selectByValue("Actual");
		mydrpdwn25.selectByIndex(2);
		//mydrpdwn25.selectByValue("Actual");
		//select today date
		action_obj.Meter_readdate().click();
		action_obj.next_button_calander().click();
		//action_obj.select_end_date_2nd().click();
		action_obj.select_end_date_as().click();
		//enter reading 
		WebElement meterno =action_obj.Meter_Read();
		meterno.clear();
		meterno.sendKeys("4000");
		//save read button
	 	//JavascriptExecutor jse =(JavascriptExecutor) driver;
		Thread.sleep(8000);
		jse.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(3000);
		action_obj.save_Read_button().click();
	//	executor.executeScript("javascript:saveAddModal();",action_obj.save_Read_button());
		//validate view read text
		Assertion_obj.viewRead_Text_validation();

		driver.navigate().refresh();

	} 

	//################################################
	//################################################
	@Test(priority = 9)
	//			@Parameters({"url"})
	//public void makePaymentsForFirstBillRun() throws Exception {
	//Thread.sleep(5000);
	public void makePaymentsForFirstBillRun() throws Exception {
		//bill run main menu
		//				driver.get("https://test.waterworkslms.com/waterworks");
		//				driver.get(url);
	JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-400)", "");
		Thread.sleep(3000);


		action_obj.search_field().sendKeys(customerNumber);
		Thread.sleep(5000);

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
		//	mydrpdown.selectByValue("Others");
		mydrpdown.selectByVisibleText("Credit Card");


		//email
		//driver.findElement(By.xpath(".//*[@id='receiptEmail']")).click();
		//Enter transaction date
		//action_obj.transactionDate().click();
		//action_obj.select_end_date_as().click();
		Thread.sleep(10000);
		action_obj.PaymentAmount().sendKeys("1000");

		action_obj.duplicate_payment_chechBox().click();
		action_obj.comments().sendKeys("hey!!!!! this is the comment section under Payment tab");

		action_obj.MakePaymentButton().click();
		//ok
		Thread.sleep(2000);
		//action_obj.ok().click();
		Thread.sleep(3000);
		//				driver.findElement(By.xpath(".//button[contains(text(),'Save')]")).click();
		//Thread.sleep(10345);
		//validate message
       // Assertion_obj.Transaction_processed_successfully_validation();  


	}


	@Test(priority = 10)
	public void addManualChargesForSecondMonth() throws Exception {

		driver.navigate().refresh();
		Thread.sleep(5000);
		action_obj.search_field().sendKeys(customerNumber);
		Thread.sleep(6000);
		action_obj.search_button().click();
		Assertion_obj.Overview_text_Validation();
		action_obj.ChargesMainMenu().click();
		JavascriptExecutor  executor = (JavascriptExecutor) driver;
		executor.executeScript("javascript:goAdd_Onceoff()",  action_obj.ChargesPlusIcon());

		Select mydrpdown = new Select(action_obj.select_service());
		mydrpdown.selectByIndex(1);
		String string=mydrpdown.getOptions().get(1).getText();

		Thread.sleep(6000);
		//		Select mydrpdown1 = new Select(action_obj.changes_description_dropDown());
		//		mydrpdown1.selectByIndex(1);
		action_obj.once_description().sendKeys("Once-off charge description");
		action_obj.rollupDescription().sendKeys("None");
		Thread.sleep(2000);

		action_obj.ChargeStartDate().click();
		action_obj.select_today_date().click();
		action_obj.ChargesEndDate().click();
		action_obj.next_button_calander().click();
		action_obj.select_end_date_as().click();
		action_obj.charges_unit().sendKeys("200");
		action_obj.ChargesRate().sendKeys("200");
		action_obj.Charges().sendKeys("200");
		executor.executeScript("javascript:formsubmit();", action_obj.ChargesSaveButton());

	}
	//################################################
	//################################################
	@Test(priority = 11)
	public void importMeterReadForSecondMonth() throws Exception{

  /*driver.navigate().refresh();

		String p=System.getProperty("user.dir")+"//TestData//Meter Read Import Template.csv";
		//String p="E:\\MeterReadImportTemplate\\Meter Read Import Template.csv";
		String col="*Meter Number,	*Date of Read,	Flat Rate Read,	Peak Read,	Shoulder Read,	Off Peak Read,	*Read Type [I-Initial / A-Actual / C - Consumption / E-Estimate / F - Final],	Notes";
		Date date;

		csv.Meter_Read(p, col, MtrNo4CSV, "09/09/2021", 1000, 200, 300, 50, 'A', "Actual Read");

		//	csv.Meter_Read(p, col, MtrNo4CSV, "9/10/2016", 1000, 200, 300, 50, 'A', "Initial Read");

		action_obj.admin_mainMenu().click();
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		action_obj.meterReadImport().click();
		action_obj.browse_button().click();
		//		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		//		Testdata testdata = new Testdata();
		//		testdata.setCellData("Meter Read Import Template", 0, 1, "Ele"+mno);
		//		System.out.println("Excel DOne");
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//TestData//Meter Read Import Template.exe");
		Thread.sleep(6000);

		action_obj.description().sendKeys("MeterReadImport");
		Thread.sleep(1000);
		action_obj.Upload_btn().click();		
		Thread.sleep(2000);
		//		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000); //sleep time
		action_obj.play_button().click();
		Thread.sleep(2000);
		action_obj.ok().click();
		jse.executeScript("window.scrollBy(0,300)", "");
		Assertion_obj.Import_Successful_validation();

		driver.navigate().refresh();*/ Thread.sleep(5023); //Thread.sleep(20145);
	} 

	//################################################
	//################################################
	@Test(priority = 12)
	public void editRatePlanForSecondBillRun() throws InterruptedException {
		//driver.navigate().to("https://test.waterworkslms.com/waterworks");
	  Thread.sleep(15000);
  //Thread.sleep(10000);
 	/*action_obj.plan_mainmebu().click();
		Thread.sleep(2000);
		//action_obj.searchPlanField().sendKeys("autogenerated");	Thread.sleep(2000);

		action_obj.PlanEditIcon().click();	

		driver.findElement(By.xpath(".//*[@id='datatablePlnList']/thead/tr/th[1]")).click();
		Thread.sleep(4000); 
		action_obj.TarifEditIcon().click();	Thread.sleep(4000); 
		//increased sleep time
		action_obj.rate().clear();
		action_obj.rate().sendKeys("100");	Thread.sleep(2000);

		action_obj.updateTerifButton().click();	Thread.sleep(2000);

		String Actualtext2 =  action_obj.getPlanUpdateRate().getText();
		Assert.assertEquals(Actualtext2, "$100.000000");

		action_obj.PublicshButton().click();
		action_obj.X().click();
		driver.navigate().refresh();  */

	}

	@Test(priority = 13)
	public void Second_bill_with_ROLLBACK() throws Exception{
		Thread.sleep(20623);
	   /* driver.navigate().refresh();
		Thread.sleep(4000);
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
		Thread.sleep(1000);
		try {


			List<WebElement> x=driver.findElements(By.xpath(".//*[@id='myBillrunValidationModal']/div/div/div/div/div/div[1]/h2"));
			Thread.sleep(2000);

			if(x.size()!=0)
				driver.findElement(By.xpath(".//*[@id='myBillrunValidationModal']/div/div/div/div/div/div[1]/div/a/i")).click();
			Thread.sleep(2000);

			//get bill amount
			bill_amount=driver.findElement(By.xpath(".//*[@class='currBill'] ")).getText();
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(3000);

		action_obj.viewButton().click();

		Assertion_obj.Bill_Run_Results_text_assertion();


		String no = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div[2]/"
				+ "div/div[2]/div[2]/div/div[3]/div/div/div[2]/div[1]/div[2]/div/div[1]/h2")).getText();


		Thread.sleep(3000);// sleep time
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
		all.selectByVisibleText("100"); 

		action_obj.rollbackbuttin().click();
		action_obj.continueTORollback().click();
       Thread.sleep(4000);
		Assertion_obj.rollback_Message_text_assertion();

		//Switch to pop up
		//driver.switchTo().alert();
		Thread.sleep(3000);
		//assertion
		String string= driver.findElement(By.xpath("html/body/div[16]/div/div/div[2]/div/div")).getText();
		Assert.assertEquals(string,"Rollback complete.");
		//	System.out.print("\n assertion_method_1() ->Rollback Complete");
		Thread.sleep(4000);
		action_obj.closeRollback().click();
		Thread.sleep(6000); */
		//Go to window control
		//driver.switchTo().defaultContent();  
 
	}


	//################################################
	//################################################
	@Test(priority = 14)
	public void makePaymentsForSecondBillRun() throws Exception {
	 //Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	 action_obj.search_field().sendKeys(customerNumber);
		action_obj.search_button().click();
		Assertion_obj.Overview_text_Validation();
		action_obj.Payment_mainMenu().click();

		//Select transaction type from dropdown menu
		Select mydrpdwn = new Select(action_obj.transaction_type_DropDown());
		mydrpdwn.selectByVisibleText("Payment");

		List<WebElement> oSize = mydrpdwn.getOptions();
		int iListSize = oSize.size();
		for(int i =0; i < iListSize ; i++)
		{
			String sValue = mydrpdwn.getOptions().get(i).getText();
			System.out.println(sValue); 
		}

		//Select Payment method from dropdown
		Select mydrpdown = new Select(action_obj.Payment_method_dropDown());
		mydrpdown.selectByVisibleText("Credit Card");

		List<WebElement> oSize1 = mydrpdwn.getOptions();
		int iListSize1 = oSize1.size();
		for(int i =0; i < iListSize1 ; i++){
			String sValue = mydrpdown.getOptions().get(i).getText();
			System.out.println(sValue);  } 

		//email
		//driver.findElement(By.xpath(".//*[@id='receiptEmail']")).click();
		//Enter transaction date
		//action_obj.transactionDate().click();
		//Thread.sleep(5000);
		//action_obj.select_end_date_as().click();   

		action_obj.PaymentAmount().sendKeys("10000");

		action_obj.duplicate_payment_chechBox().click();
		action_obj.comments().sendKeys("hey!!!!! this is the comment section under Payment tab");

		action_obj.MakePaymentButton().click();
		Thread.sleep(3000);
		//ok
		//			Thread.sleep(500);
		//action_obj.ok().click();
		//			Thread.sleep(3000);
		//			driver.findElement(By.xpath(".//button[contains(text(),'Save')]")).click();

		//validate message
		Assertion_obj.Transaction_processed_successfully_validation();
    	//Thread.sleep(18623);

		driver.navigate().refresh();
	//Thread.sleep(18623);
	 }

}
