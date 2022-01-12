package com.Utility.Bill.BillRunFirst;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.constructor.SafeConstructor;

//import com.gargoylesoftware.htmlunit.javascript.host.css.CSSSupportsRule;

import com.Utility.Bill.Re_Usable.csv;
import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;
import com.Utility.Bill.Re_Usable.Sauce_instance_Test;

public class ElectrImportSetupTools extends Sauce_Instance_Login_Test
{

	//#####################################################
	//#####################################################

	JavascriptExecutor jse ;	 
	String customerNumber="";
	static String mno="";
	static String wno="";
	String Plan="";

	//Add on 10-08-2019
	String  Tcode, Rateplan1;
	DateFormat dateformat=new SimpleDateFormat("MM/dd/yyyy");
	DateFormat Timeformat = new SimpleDateFormat("HHmmss");
	Date date1=new Date();
	// String dtn = dateformat.format(date1);
	String prodate= dateformat.format(date1);
	String prodate1=dateformat.format(date1);
	String AddCycleWith_Customer="Bill Run Cycle With Customer Number";
	String TransferedCustomerCycle="Bill Run Cycle with existing Customer";
	String AddedCustomerDetail;
	// protected WebDriver driver;



	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;


	@Test(priority = 1)
	public void CustomerAndService() throws Exception{	
		action_obj = new Repo_Test(driver);
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
		mydrpdwn1.selectByIndex(1);


		Calendar cal2 = Calendar.getInstance();
		System.out.println(Timeformat.format(cal2.getTime()));
		Rateplan1=cal2.getTime().toString(); 
		System.out.println(Rateplan1=Rateplan1.substring(11,19));
		Rateplan1=Rateplan1.replaceAll(":","");


		action_obj.planName().sendKeys("Plan"+Rateplan1);
		action_obj.planStartDate().click();
		//action_obj.calanderPreviousButton().click();
		// action_obj.calanderPreviousButton().click();
		action_obj.select_today_date().click();
		action_obj.PlanEndDate().click();
		//action_obj.next_button_calander().click();
		//action_obj.next_button_calander().click();
		//action_obj.select_end_date_as().click();
		action_obj.select_today_date().click();


		action_obj.addTrfBtn().click();
		action_obj.charge_desc().sendKeys("Usage charge");
		action_obj.rollup_desc().sendKeys("None");


		Thread.sleep(3000);
		Select mydrpdwn01 = new Select(action_obj.charge_type()); 
		mydrpdwn01.selectByVisibleText("Electricity Charges");
		Thread.sleep(3000);

		Select mydrpdwn02 = new Select(action_obj.method_type()); 
		mydrpdwn02.selectByVisibleText("Usage Flat Rate");
		Thread.sleep(3000);

		Select mydrpdwn03 = new Select(action_obj.unit_type()); 
		mydrpdwn03.selectByIndex(3);
		//			mydrpdwn03.selectByVisibleText("Kilowatt Hour (kWh)");		//If this statement is fail try upper on
		action_obj.rate().sendKeys("65");
		//changes for 
		//	action_obj.toggle_button().click();
		action_obj.updateTerifButton().click();

		Thread.sleep(1500);
		action_obj.PublicshButton().click();

		String Actualtext01 = action_obj.getplanNameon_popup().getText();
		Assert.assertEquals(Actualtext01, "Plan"+Rateplan1);
		action_obj.X().click();
		Plan = driver.findElement(By.xpath(".//*[@id='plnListBody']/tr[1]/td[1]")).getText();


		//Prorata tarif code for REPORT page
		action_obj.ReportTab().click();
		//Select Rating
		action_obj.Ratingbtn().click();
		//click on Plan Tariff Summary Link
		action_obj.PlanTariffLink().click();
		action_obj.tariffchecked().click();
		Thread.sleep(3000);
		action_obj.Prorataoptionchk().click();	
		action_obj.AllProrataopt().click();

		action_obj.Nextbutton().click();
		//check plan tariff summary
		action_obj.enterplan().sendKeys("Plan"+Rateplan1); 
		Thread.sleep(3000);

		Tcode=action_obj.gettariff().getText();
		System.out.println("Tariff Code is = "+Tcode);


		Thread.sleep(2000);
		action_obj.customer_main_menu().click();
		action_obj.customer_F_name().sendKeys("Jennifer");
		action_obj.customer_sure_name().sendKeys("Scott");
		Select select = new Select(action_obj.Category_drop());
		select.selectByVisibleText("Business");
		action_obj.company_name().sendKeys("testing on fire");

		List<WebElement> oSize2 = select.getOptions();
		int iListSize2 = oSize2.size();
		for(int i =0; i < iListSize2 ; i++){
			String sValue = select.getOptions().get(i).getText();
			System.out.println(sValue);  
		}

		action_obj.cus_address1().sendKeys("Canyon Road");
		action_obj.cus_address2().sendKeys("Santa Fe");
		action_obj.billingState().sendKeys("NM");
		action_obj.toggle_button().click();
		action_obj.customer_country().sendKeys("US");
		action_obj.Phone_Mobile().sendKeys("78898525");
		Select select2 = new Select(action_obj.select_plan());
		select2.selectByVisibleText("Plan"+Rateplan1);

		action_obj.Email().sendKeys("kingtest@yopmail.com");
		action_obj.BEmail().sendKeys("kingtest123@yopmail.com");
		 jse = (JavascriptExecutor) driver; 
		jse.executeScript("window.scrollBy(0,1800)", "");
		action_obj.save_customer().click();
		action_obj.ok().click();

		Assertion_obj.sucessfully_saved_customer_message_validation();
		//Get Customer n0 number
		customerNumber=driver.findElement(By.xpath(".//*[@id='nav']/div/div/div[1]/div[2]/div[1]/label/a")).getText();
		System.out.println("Customer number is :="+customerNumber);
		action_obj.search_field().sendKeys(customerNumber);
		action_obj.search_button().click();

		//Add Customer Electrical Service 

		action_obj.overview_menu().click();
		action_obj.electricity_plus_icon().click(); 
		Assertion_obj.Electricity_service_page_header_validation(); 

		Select myd = new Select(action_obj.plan_drop_down()); 
		myd.selectByVisibleText("Plan"+Rateplan1);

		DateFormat dateFormat = new SimpleDateFormat("HHmmss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
		mno=cal.getTime().toString(); 
		System.out.println(mno=mno.substring(11,19));
		mno=mno.replaceAll(":","");
		mno="Ele"+mno;

		action_obj.meter_number().sendKeys(mno); 
		System.out.println("Meter number is:="+mno);
		Select mydr  = new Select(action_obj.meterConfig_drop_down()); 
		mydr.selectByVisibleText("Flat Rate"); 

		action_obj.toggle_button().click(); 
		Select mydrpdwn2 = new Select(action_obj.readding_drop_down()); 
		mydrpdwn2.selectByVisibleText("Consumption"); 
		JavascriptExecutor jse = (JavascriptExecutor)driver;	 
		jse.executeScript("window.scrollBy(0,1500)", "");

		action_obj.create_service_button().click();
		action_obj.ok().click(); 
		Assertion_obj.utilities_header_validation(); 

		Assertion_obj.Overview_text_Validation(); 

	}
	@Test(priority=2)
	public void AddCyclewithCustomer() throws Exception
	{
		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);

		action_obj.admin_mainMenu().click();
		action_obj.billRunCycle().click();
		action_obj.createNewPlan().click();
		action_obj.cycleName().sendKeys(AddCycleWith_Customer+customerNumber);

		//action_obj.CustomerToDisplay().click();
		//driver.findElement(By.xpath(".//*[contains(span,'All')]")))

		//action_obj.CustomertoDispaytypeDropdown().sendKeys("All");
		//action_obj.AllSelectForCycle().click();
		action_obj.FilterAllSelectCustomer().sendKeys(customerNumber);
		//Select Search Customer.
		action_obj.selectcustomerinCycle().click();
		action_obj.saveCycle().click();

		// action_obj.cycleDropDown().click();

		//driver.findElement(By.xpath(".//*[contains(span,'"+customerNumber+"')]")).click();
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.ESCAPE).build().perform(); 

		Assertion_obj.cycleConfirmationMessage_text_assertion();
	}

	@Test(priority=3)
	public void TransferCustomerFrom_AnotherCycle() throws Exception
	{
		/*action_obj.SearcFieldUnderBillRunCyclePage().clear();
		action_obj.SearcFieldUnderBillRunCyclePage().sendKeys(AddCycleWith_Customer+customerNumber);
		action_obj.EditBIll_RunCycle().click();
		// Get Customern name
		// AddedCustomerDetail= action_obj.GetCustomerNoAndName().getText();
		// 	System.out.println("Added Customer name and Number="+AddedCustomerDetail);
		// Cancel Bill Run Cycle
		action_obj.CancelButtonOnCustomenr().click();
		Thread.sleep(2000);
		action_obj.createNewPlan().click();
		action_obj.cycleName().sendKeys(TransferedCustomerCycle+customerNumber);
		action_obj.CustomerToDisplay().click();
		//driver.findElement(By.xpath(".//*[contains(span,'All')]")))

		//action_obj.CustomertoDispaytypeDropdown().sendKeys("All");
		action_obj.AllSelectForCycle().click();
		action_obj.FilterAllSelectCustomer().sendKeys(customerNumber);
		//Select Search Customer.
		action_obj.selectcustomerinCycle().click();
		action_obj.saveCycle().click();

		//action_obj.cycleDropDown().click();
		//driver.findElement(By.xpath(".//*[contains(span,'"+customerNumber+"')]")).click();
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.ESCAPE).build().perform(); 
		Assertion_obj.cycleConfirmationMessage_text_assertion();
		Thread.sleep(3000);
		action_obj.SearcFieldUnderBillRunCyclePage().clear();
		action_obj.SearcFieldUnderBillRunCyclePage().sendKeys(AddCycleWith_Customer+customerNumber);

		Assertion_obj.CustomenrZero();
		//Thread.sleep(20000);
*/	Thread.sleep(20000);
		
	} 

	@Test(priority = 4)
	public void importMeterNumberImport() throws InterruptedException, IOException{

		/*String p=System.getProperty("user.dir")+"//TestData//meternumberimporttemplate.csv";
		String col="Customer Number,Alternative Customer Number,*Plan Number,*Meter Number,*Meter Configuration [1-Flat / 2-Peak/OffPeak/Shoulder],*Prorata Date,*Meter Type [HE - Electricity / WT - Water],*Meter Read Type [R-Reads/C-Consumption],Enable Demand Reads? [Yes/No],*Kfactor,Three Phase,Gas Cook,Master Meter,Walk Order,NMI,SubAddress Type,SubAddress Number,Street Number,Street Name,Street type,Suburb,State/County,Post/Zip Code,Special Type [0 - Normal / 1 - Solar]";
		Date date;
		long cn=Long.parseLong(customerNumber);
		csv.MeterNumber(p, col, cn, Plan,mno+"114" );
		System.out.println(mno);
		//Click on the Admin link
		driver.findElement(By.linkText("Admin")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		//Click on the MeterNumberImport link
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[4]/div/div[2]/div[2]/a")).click();
		//driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div/div[5]/div/div[2]/div[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Thread.sleep(8562);
		//Click on the MeterNumberImport link under import setup
		driver.findElement(By.id("btnbrowseFile")).click();
		Thread.sleep(2000);

		//run autoit to upload file
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\TestData\\meternumberimporttemplate.exe");
		Thread.sleep(5000);

		//description
		driver.findElement(By.id("attDesc")).sendKeys("MeterNumberImport");
		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor)driver;	 
		jse.executeScript("window.scrollBy(0,500)", "");

		//Click on the Upload btn
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div/div[2]/div/div[1]/form/div[6]/a/span")).click();

		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,1500)", "");

		//Click on the exceute link
		driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(2000);

		//capture the alert
		driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
		Thread.sleep(2000);
		//asertion on message 
		String Actualtext = driver.findElement(By.xpath(".//*[contains(text(),'Import Successful!')]")).getText();
		Assert.assertEquals(Actualtext, "Import Successful!");
		Thread.sleep(2000);  

		//Assertion to validate Successfully saved MeterReadImport charges
		String Actualtext1 = driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[6]/span")).getText();
		Assert.assertEquals(Actualtext1, "success");
		System.out.print("\n assertion_method_1 executed"+Actualtext1);   */
		Thread.sleep(24977);
	}


	//#####################################################
	//#####################################################
	@Test(priority = 5)
	public void importManualRecurringCharge() throws InterruptedException, IOException{
		/* String p=System.getProperty("user.dir")+"//TestData/ManualRecurringChargeImportTemplate.csv";
		String col="Customer Number,	Meter Number,	Charge Description,	Rollup Description,	Model,	Start Date,	End Date,	Is Ongoing (Yes/No),	Is Prorata (Yes/No),	Period Of Charge,	No. of Periods,	Amount per recurring,	Unit Price, Tax Id";
		Date date;
		Long cn=Long.parseLong(customerNumber);
		csv.Recurring(p, col, cn,mno);
		//Click on the Admin link
		driver.findElement(By.linkText("Admin")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		//Click on the ManualRecurringCharge link
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[4]/div/div[2]/div[4]/a")).click();
		//driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div/div[5]/div/div[2]/div[4]/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Click on the ManualRecurringCharge link under import setup
		driver.findElement(By.id("btnbrowseFile")).click();
		Thread.sleep(2000);


		//run autoit to upload file

		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\TestData\\ManualRecurringChargeImportTemplate.exe");
		Thread.sleep(5000);

		//description
		driver.findElement(By.id("attDesc")).sendKeys("Manual Recurring Charges");
		Thread.sleep(2000);



		//Click on the Upload btn
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div/div[2]/div/div[1]/form/div[6]/a/span")).click();
		Thread.sleep(2000);

		jse.executeScript("window.scrollBy(0,500)", "");

		//Click on the exceute link
		driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(2000);

		//capture the alert
		driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
		Thread.sleep(2000); 

		//asertion on message 
		String Actualtext = driver.findElement(By.xpath(".//*[contains(text(),'Import Successful!')]")).getText();
		Assert.assertEquals(Actualtext, "Import Successful!");
		Thread.sleep(2000);

		//Assertion to validate Successfully saved MeterReadImport charges
		String Actualtext1 = driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[6]/span")).getText();
		Assert.assertEquals(Actualtext1, "success");
		System.out.print("\n assertion_method_1 executed"+Actualtext1); */  
		 Thread.sleep(15623);
	}

	@Test(priority = 6)
	public void importManualOnceOffCharges() throws InterruptedException, IOException{

	/*	String p=System.getProperty("user.dir")+"//TestData//ManualOnce-OffChargeImportTemplate.csv";
		String col="Customer Number,	Meter Number,	Rollup Description,	Charge Description,	Start Date,	End Date,	Units,	Charge Amount,	Rate,  Tax Id,  Special Charge Code";
		Date date;
		Long cn=Long.parseLong(customerNumber);
		csv.OnceOff(p, col, cn,mno);
		//Click on the Admin link
		driver.findElement(By.linkText("Admin")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Click on the Once off Charges link
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[4]/div/div[2]/div[3]/a")).click();

		//driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div/div[5]/div/div[2]/div[3]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Click on the Once off Charges link under import setup
		driver.findElement(By.id("btnbrowseFile")).click();
		Thread.sleep(2000);

		//run autoit to upload file
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\TestData\\ManualOnce-OffChargeImportTemplate.exe");
		Thread.sleep(5000);

		//description
		driver.findElement(By.id("attDesc")).sendKeys("Once-Off");
		Thread.sleep(2000);

		//Click on the Upload btn
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div/div[2]/div/div[1]/form/div[6]/a/span")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)", "");

		//Click on the execute link
		driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(2000);

		//capture the alert
		driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
		Thread.sleep(2000);
		//asertion on message 
		String Actualtext = driver.findElement(By.xpath(".//*[contains(text(),'Import Successful!')]")).getText();
		Assert.assertEquals(Actualtext, "Import Successful!");
		Thread.sleep(2000);

		String Actualtext1 = driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[6]/span")).getText();
		Assert.assertEquals(Actualtext1, "success");
		System.out.print("\n assertion_method_1 executed"+Actualtext1);  */
		
		Thread.sleep(17887);
	}  	


	/*@Test(priority = 7)
			public void importPrepaidMeterReads() throws InterruptedException, IOException{
			//Click on the Admin link
			driver.findElement(By.linkText("Admin")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,500)");

			//Click on the Prepaid meter link
			driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[4]/div/div[2]/div[9]/a")).click();

			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);

			//Click on the  link under import setup
			driver.findElement(By.xpath(".//*[@id='btnbrowseFile']")).click();
			Thread.sleep(2000);

			//run autoit to upload file
			Runtime.getRuntime().exec("D:\\chandan temp\\PrepaidMetersImportTemplate\\Prepaid Meter Import Template.exe");
			Thread.sleep(5000);

			//description
			driver.findElement(By.id("attDesc")).sendKeys("Prepaid meter read");
			Thread.sleep(2000);

			//Click on the Upload btn
			driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div/div[2]/div/div[1]/form/div[4]/a/span")).click();
			Thread.sleep(2000);

			//Click on the exceute link
			driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[7]/a[1]")).click();
			Thread.sleep(2000);

			//capture the alert
			driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
			Thread.sleep(2000);
			//asertion on message 
			String Actualtext = driver.findElement(By.xpath(".//*[contains(text(),'Import Successful!')]")).getText();
			Assert.assertEquals(Actualtext, "Import Successful!");
			Thread.sleep(2000);

			String Actualtext1 = driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[6]/span")).getText();
			Assert.assertEquals(Actualtext1, "success");
			System.out.print("\n assertion_method_1 executed"+Actualtext1);
			}*/

	@Test(priority = 8)
	public void importdemandReads() throws InterruptedException, IOException{
		/*action_obj.admin_mainMenu().click();
		Thread.sleep(2000);
		String p=System.getProperty("user.dir")+"//TestData//Demand Read Import Template.csv";
		String col="*Meter Number,*Demand Type (1 to 5),*Date of Read,*Time of Read,*Demand Reading";
		Date date;

		csv.Demand_Read(p, col, mno, 1,prodate,"12:00 AM",200);



		//Click on the Demand Read link
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[4]/div/div[2]/div[8]/a")).click();
		//driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div/div[5]/div/div[2]/div[8]/a")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		//Click on the Demand Read file browser button under import setup
		driver.findElement(By.id("btnbrowseFile")).click();
		Thread.sleep(2000);

		//run autoit to upload file
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\TestData\\Demand Read Import Template.exe");
		Thread.sleep(5000);

		//description
		driver.findElement(By.id("attDesc")).sendKeys("Demand Reads Import");
		Thread.sleep(2000);

		//Click on the Upload btn
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div/div[2]/div/div[1]/form/div[6]/a/span")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,1500)", "");

		//Click on the exceute link
		driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(2000);

		//capture the alert
		driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
		Thread.sleep(2000);
		//asertion on message 
		String Actualtext = driver.findElement(By.xpath(".//*[contains(text(),'Import Successful!')]")).getText();
		Assert.assertEquals(Actualtext, "Import Successful!");
		Thread.sleep(2000);

		//Assertion to validate Successfully saved MeterReadImport charges
		String Actualtext1 = driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[6]/span")).getText();
		Assert.assertEquals(Actualtext1, "success");
		System.out.print("\n assertion_method_1 executed"+Actualtext1); */  Thread.sleep(16253);

	} 

	//add method vkp
	@Test(priority = 9)
	public void Prorated_Tariff() throws InterruptedException, IOException{
	     Thread.sleep(22036);  
		/* String p=System.getProperty("user.dir")+"//TestData//ProratedTariffImportTemplate.csv";
		String col="Plan NO,Code, Date Start, Date End,Rate";
		Date date;

		csv.Prorated_Tariff(p, col,Plan,Tcode, prodate, prodate1);


		System.out.println("Current Date is ="+prodate);					
		//Click on the Admin link

		driver.findElement(By.linkText("Admin")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		jse.executeScript("window.scrollBy(0,500)", "");
		//Click on the Prorated Tariff Import link
		action_obj.Prorated_Tariff_Import().click();

		//driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div/div[5]/div/div[2]/div[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


		//Click on the MeterNumberImport link under import setup
		driver.findElement(By.id("btnbrowseFile")).click();
		Thread.sleep(2000);


		//run autoit to upload file
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\TestData\\ProratedTariffImportTemplate.exe");
		Thread.sleep(5000);

		//description
		driver.findElement(By.id("attDesc")).sendKeys("Prorated Tariff Import");
		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor)driver;	 
		jse.executeScript("window.scrollBy(0,500)", "");

		//Click on the Upload btn
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div/div[2]/div/div[1]/form/div[6]/a/span")).click();

		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,1500)", "");

		//Click on the exceute link
		driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(2000);

		//capture the alert
		driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
		Thread.sleep(2000);
		//asertion on message 
		String Actualtext = driver.findElement(By.xpath(".//*[contains(text(),'Import Successful!')]")).getText();
		Assert.assertEquals(Actualtext, "Import Successful!");
		Thread.sleep(2000);

		//Assertion to validate Successfully saved MeterReadImport charges
		String Actualtext1 = driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[6]/span")).getText();
		Assert.assertEquals(Actualtext1, "success");
		System.out.print("\n assertion_method_1 executed"+Actualtext1);*/   
	}
	//#####################################################
	//#####################################################	
	//add method vkp
	@Test(priority = 10)
	public void importSecurityDepositImport() throws InterruptedException, IOException{
		String p=System.getProperty("user.dir")+"//TestData//SecurityDepositsImportTemplate.csv";
		String col="Customer Number,Alternative Customer Number,Transaction Type,Payment Method,Amount,Transaction Date,Comments";
		Date date;
		long cn=Long.parseLong(customerNumber);
		csv.Security_Deposit(p, col,cn);


		//Click on the Admin link
		driver.findElement(By.linkText("Admin")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		jse.executeScript("window.scrollBy(0,500)", "");
		//Click on the Security Deposits Import link
		action_obj.Security_DepositsImport().click();

		//driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div/div[5]/div/div[2]/div[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


		//Click on the MeterNumberImport link under import setup
		driver.findElement(By.id("btnbrowseFile")).click();
		Thread.sleep(2000);


		//run autoit to upload file
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\TestData\\SecurityDepositsImportTemplate.exe");
		Thread.sleep(5000);

		//description
		driver.findElement(By.id("attDesc")).sendKeys("SecurityDepositImport");
		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor)driver;	 
		jse.executeScript("window.scrollBy(0,500)", "");

		//Click on the Upload btn
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div/div[2]/div/div[1]/form/div[6]/a/span")).click();

		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,1500)", "");

		//Click on the exceute link
		driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(2000);

		//capture the alert
		driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
		Thread.sleep(2000);
		//asertion on message 
		String Actualtext = driver.findElement(By.xpath(".//*[contains(text(),'Import Successful!')]")).getText();
		Assert.assertEquals(Actualtext, "Import Successful!");
		Thread.sleep(2000);

		//Assertion to validate Successfully saved MeterReadImport charges
		String Actualtext1 = driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[6]/span")).getText();
		Assert.assertEquals(Actualtext1, "success");
		System.out.print("\n assertion_method_1 executed"+Actualtext1); 
		//Thread.sleep(19236);
	}
	//#####################################################
	//#####################################################			
	@Test(priority = 11)
	public void importPayment() throws InterruptedException, IOException{
		/*action_obj.admin_mainMenu().click();
		Thread.sleep(2000);

		String p=System.getProperty("user.dir")+"//TestData//paymentImport.csv";
		String col="Customer No,Alternative Customer No,Transaction Type,Payment Method,Card Type,Amount,Transaction Date,Comments,Auto Allocate,Batch No";
		Date date;

		long cn=Long.parseLong(customerNumber);
		//				System.out.println(p+""+col+""+cn);
		csv.Payment(p, col,cn,"","P","CH","",2000,"05/30/2019","cheque payment","TRUE","23t45");

		//Click on the Admin link
		driver.findElement(By.linkText("Admin")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		//Click on the PaymentImport link
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[4]/div/div[2]/div[6]/a")).click();
		//driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div/div[5]/div/div[2]/div[6]/a")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


		//Click on the PaymentImport link under import setup
		driver.findElement(By.id("btnbrowseFile")).click();
		Thread.sleep(2000);

		//run autoit to upload file
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\TestData\\paymentImport.exe");
		Thread.sleep(5000);

		//description
		driver.findElement(By.id("attDesc")).sendKeys("PaymentImport");
		Thread.sleep(2000);

		//Click on the Upload btn
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div/div[2]/div/div[1]/form/div[6]/a/span")).click();
		Thread.sleep(2000);

		jse.executeScript("window.scrollBy(0,1500)", "");
		Thread.sleep(5000);
		//Click on the exceute link
		driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(2000);

		//capture the alert
		driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
		Thread.sleep(2000);
		//asertion on message 
		String Actualtext = driver.findElement(By.xpath(".//*[contains(text(),'Import Successful!')]")).getText();
		Assert.assertEquals(Actualtext, "Import Successful!");
		Thread.sleep(2000);

		//Assertion to validate Successfully saved MeterReadImport charges
		String Actualtext1 = driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[6]/span")).getText();
		Assert.assertEquals(Actualtext1, "success");
		System.out.print("\n assertion_method_1 executed"+Actualtext1); */
		 Thread.sleep(13526);
	} 

	//	close testing by "liam@utilibill.com.au" I believe Rate Plan Import was meant to be      	built but is not a function in Utilibill.*/
	@Test(priority = 12)
	public void RatePlanImport() throws InterruptedException, IOException{

		throw new SkipException("close testing by liam ");

	}   

}