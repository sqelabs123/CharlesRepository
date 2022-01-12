package com.Utility.Bill.BillRunFirst;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.csv;
import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class Payments_and_ManagingAllocations_Test extends Sauce_Instance_Login_Test{
	public String customerNumber, perposedate;
	public JavascriptExecutor executor, jse;
	static String mno="";
	String MtrNo4CSV="";
	static String wno="";
	public String planNo;
	public String bill_amount="";
	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	public int importpayment;
	public int allocationimount=500;
	public int unallocatedAmount;

	public DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	Date date = new Date();

 	@Test(priority=1)
	public void AddCustomenrWithService_Nd_Meter_Reads() throws Exception
	{
		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);

		action_obj.customer_main_menu().click();
		action_obj.customer_F_name().sendKeys("James");
		action_obj.customer_sure_name().sendKeys("Smith");
		Select select = new Select(action_obj.Category_drop());
		//select.selectByVisibleText("Business");
		select.selectByVisibleText("Residential");

		action_obj.cus_address1().sendKeys("Samon Town");
		action_obj.cus_address2().sendKeys("Teaxas");
		action_obj.billingState().sendKeys("Texas");
		action_obj.toggle_button().click();
		action_obj.customer_country().sendKeys("UA");
		action_obj.Phone_Mobile().sendKeys("456123789");

		// sleep time
		Thread.sleep(5000);
		action_obj.Email().sendKeys("tetester591@gmail.com");
		action_obj.BEmail().sendKeys("tetester591@gmail.com");
		Thread.sleep(10000);
		//executor.executeScript("window.scrollBy(0,1500)", "");
		Select select2 = new Select(action_obj.select_plan());
		select2.selectByVisibleText("Commercial plan");// 17 nov changed
		executor = (JavascriptExecutor) driver; 
		executor.executeScript("window.scrollBy(0,1000)", "");
		action_obj.save_customer().click();
		action_obj.ok().click();

		Assertion_obj.sucessfully_saved_customer_message_validation();
		Thread.sleep(2000);
		customerNumber=driver.findElement(By.xpath(".//*[@id='nav']/div/div/div[1]/div[2]/div[1]/label/a")).getText();

		action_obj.search_field().sendKeys(customerNumber);
		action_obj.search_button().click(); Thread.sleep(2000);
		action_obj.overview_menu().click(); Thread.sleep(2000);
		Thread.sleep(3000);
		action_obj.electricity_plus_icon().click(); Thread.sleep(2000);
		Assertion_obj.Electricity_service_page_header_validation(); 
		Select mydrpdwn = new Select(action_obj.plan_drop_down()); 
		mydrpdwn.selectByVisibleText("Commercial plan");
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
		//executor.executeScript("window.scrollBy(0,1000)", "");
		//Thread.sleep(2000); action_obj.toggle_button().click();
		Select mydrpdwn2 = new Select(action_obj.readding_drop_down()); 
		mydrpdwn2.selectByVisibleText("Reads"); 
		executor.executeScript("window.scrollBy(0,1500)", "");
		//jse.executeScript("window.scrollBy(0,1500)", "");
		action_obj.create_service_button().click();
		action_obj.ok().click(); 
		Thread.sleep(1000);
		Assertion_obj.utilities_header_validation(); 
		Thread.sleep(2000);
		Assertion_obj.Overview_text_Validation(); 
		action_obj.Meter_Reads_mainMenu().click();
		//select meter no for readSing
		Thread.sleep(8000);
		Select mydrpdwn2s = new Select(action_obj.MeterNoForMeterReading());
		//			mydrpdwn2s.selectByIndex(1);

		mydrpdwn2s.selectByVisibleText("Ele"+mno); 


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

		Assertion_obj.viewRead_Text_validation();

		Thread.sleep(500);

		//mydrpdwn2.selectByVisibleText("Ele"+mno);
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

		Assertion_obj.viewRead_Text_validation();
	}
	@Test(priority=2)
	public void AddCycle_nd_BillRun() throws Exception
	{
		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);	

		//		driver.navigate().refresh();
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

		Assertion_obj.cycleConfirmationMessage_text_assertion();

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
		Thread.sleep(12000);
		action_obj.viewButton().click();
		Thread.sleep(6000);

		//get statement number 
		String no = driver.findElement(By.xpath(".//*[contains(text(),'Statement Summary #') ]")).getText();

		Thread.sleep(5000);
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
	}
	@Test(priority=3)
	public void MakepaymentwithAutoAllocatevalueTRUE() throws InterruptedException, IOException
	{
		action_obj.admin_mainMenu().click();
		Thread.sleep(2000);
		perposedate= dateFormat.format(date);

		String p=System.getProperty("user.dir")+"//TestData//paymentImport.csv";
		String col="Customer No,Alternative Customer No,Transaction Type,Payment Method,Card Type,Amount,Transaction Date,Comments,Auto Allocate,Batch No";
		Date date;
		importpayment=100;
		long cn=Long.parseLong(customerNumber);
		//				System.out.println(p+""+col+""+cn);
		csv.Payment(p, col,cn,"","P","CH","",importpayment,perposedate,"Make payment with Allocate value set in TRUE","TRUE","");

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
		JavascriptExecutor jse = (JavascriptExecutor)driver;
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
		System.out.print("\n assertion_method_1 executed"+Actualtext1);
	}  
	@Test(priority=4)
	public void AllocateStatementafterMakepayment() throws Exception
	{
		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		//	Check only once time
			action_obj.search_field().sendKeys(customerNumber);

		//action_obj.search_field().sendKeys("196652");
        
		//Click on Search Icon
		action_obj.search_button().click();
		Thread.sleep(5000);
		action_obj.Payment_mainMenu().click();
		Thread.sleep(5000);
		//View History Button Click
		action_obj.viewhistorypaymentpage().click();
		Thread.sleep(2000);
		//Search payment
		action_obj.searchpayment().sendKeys("Payment received");
		//Assert with 'Payment Method'
		Thread.sleep(8000);
		//Assertion_obj.ValidateTranscation_Amount();
		String validateamountrecord=driver.findElement(By.xpath("//div[@id='tbl-trans-history_wrapper']/table/tbody/tr[1]/td[5]")).getText();
		Assert.assertEquals(validateamountrecord, "Cheque");
		Thread.sleep(10000);
		//action_obj.ModifyAllocation_Btn().click();
		driver.findElement(By.xpath("//div[@id='tbl-trans-history_wrapper']/table/tbody//following::span[2]")).click();
 
	 
		Thread.sleep(7000);
		 //   String amountpaid=action_obj.Transaction_amountget().getText();
		String amountpaid=driver.findElement(By.xpath("(//div[@class='col-sm-9']/input)[1]")).getText();
		 // transaction amount
	 	Thread.sleep(3000);
		//Assertion_obj.unallocatedamountequalzero();		
		String unallocatedamount=driver.findElement(By.id("unallocated_amount")).getAttribute("value");
		System.out.println(unallocatedamount);
		
		Assert.assertEquals(unallocatedamount, "0.00");
		
		String Totalbillamount=driver.findElement(By.xpath("//label[@id='total_balance']/strong")).getText();
       System.out.println(Totalbillamount);
       
       double TotalBillAmount = Double.parseDouble(Totalbillamount);
       System.out.println("Total Bill Amount Is ="+TotalBillAmount);
      // int Totalbalanc = Integer.parseInt(Totalamount);
       double Getnewbalance=TotalBillAmount-100.0;
       String actNewblance=driver.findElement(By.xpath("//label[@id='total_new_bal']/strong")).getText();
       double newbalanc=Double.parseDouble(actNewblance);
       Assert.assertEquals(newbalanc, Getnewbalance);
       driver.findElement(By.xpath("(//i[@class='icon-remove'])[1]")).click();
	} 

}
