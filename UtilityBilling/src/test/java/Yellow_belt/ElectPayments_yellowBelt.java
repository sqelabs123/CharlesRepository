package Yellow_belt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class ElectPayments_yellowBelt extends Sauce_Instance_Login_Test{
	public String custid="";
	static String mno="";
	//String planNo="582";
	JavascriptExecutor executor;

	//###########################################################
	//###########################################################
	
	@Test(priority = 0)
	public void customer() throws Exception {
		action_obj=new Repo_Test(driver);
		Assertion_obj=new Assertion_Test(driver);
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
		action_obj.BEmail().sendKeys("mr.vipulkkr@gmail.com");
		executor.executeScript("window,scrollBy(0,1800)", "");
		action_obj.save_customer().click();
		action_obj.ok().click();
		
		Assertion_obj.sucessfully_saved_customer_message_validation();
		custid=driver.findElement(By.xpath(".//*[@id='nav']/div/div/div[1]/div[2]/div[1]/label/a")).getText();
		
	}
 
	@Test(priority = 1)
	public void createCustElectrictyService() throws Exception{

	action_obj.overview_menu().click();

	action_obj.electricity_plus_icon().click(); 
	Assertion_obj.Electricity_service_page_header_validation(); 


	 Select mydrpdwn = new Select(action_obj.plan_drop_down()); 
	 mydrpdwn.selectByIndex(1); 


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
	 

	}
	
	//###########################################################
	//###########################################################
	@Test(priority = 2)
	public void addManualCharges() throws Exception {

		//search user
		action_obj.search_field().sendKeys("Ele"+mno);
		action_obj.search_button().click();
		//validate overview
		Assertion_obj.Overview_text_Validation();
		//charges main menu
		action_obj.ChargesMainMenu().click();
		//charges + icon
		JavascriptExecutor  executor = (JavascriptExecutor) driver;
		executor.executeScript("javascript:goAdd_Onceoff()",  action_obj.ChargesPlusIcon());
		//select service
		Select mydrpdown = new Select(action_obj.select_service());
		mydrpdown.selectByIndex(1);
		//get selected option
		String string=mydrpdown.getOptions().get(1).getText();
		System.out.println(string+"Second");
		Thread.sleep(5000);
		//select charges description
		Select mydrpdown1 = new Select(action_obj.changes_description_dropDown());
		mydrpdown1.selectByIndex(1);
		//select today date
		action_obj.ChargeStartDate().click();
		action_obj.select_today_date().click();
		//click in end date charge field
		action_obj.ChargesEndDate().click();
		//next button of calendar
		action_obj.next_button_calander().click();
		//select any random date
		action_obj.select_end_date_as().click();
		//enter charge unit
		action_obj.charges_unit().sendKeys("20");
		//enter charge rate
		action_obj.ChargesRate().sendKeys("20");
		//enter charge
		action_obj.Charges().sendKeys("200");
		//save button
		executor.executeScript("javascript:formsubmit();", action_obj.ChargesSaveButton());
		//select all option from dropdown
		Select  electMeter = new Select(action_obj.AllDrop_Down());
		electMeter.selectByVisibleText("All");
		//validate by meter number
		Thread.sleep(5000);
		String string1=driver.findElement(By.xpath(".//*[text()='"+string+"'] ")).getText();
		System.out.println(string1+"First");
		Assert.assertEquals(string1, string);
	}

	//###########################################################
	//###########################################################
	@Test(priority = 3)
	public void addRecurringCharges() throws Exception {
		//search user
		action_obj.search_field().sendKeys("Ele"+mno);
		action_obj.search_button().click();
		Thread.sleep(2000);
		//validate overview
		Assertion_obj.Overview_text_Validation();
		//charge main menu
		action_obj.ChargesMainMenu().click();
		//charges + icon
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("javascript:goAdd_Recurring();", action_obj.ChargesPlusIcon());
		//select service
		Select mydrpdown = new Select( action_obj.select_service());
		mydrpdown.selectByIndex(1);
		//select selected option
		String string=mydrpdown.getOptions().get(1).getText();
		Thread.sleep(5000);
		//select charges description
		Select mydrpdown1 = new Select(action_obj.RecurringChargesDesacriptionDrop());
		mydrpdown1.selectByIndex(1);
		//select today date
		action_obj.ChargeStartDate().click();
		action_obj.select_today_date().click();
		//enter no of period 
		action_obj.No_of_period().sendKeys("1");
		//check ongoing check box
		action_obj.ongoing_CheckBox().click();
		Thread.sleep(3000);
		//save button
		executor.executeScript("javascript:formsubmit();", action_obj.ChargesSaveButton());
		//select all option
		Select  electMeter = new Select(action_obj.AllDrop_Down());
		electMeter.selectByVisibleText("All");
		//validate by meter number
		Thread.sleep(5000);

		String string1=driver.findElement(By.xpath(".//*[text()='"+string+"'] ")).getText();
		Assert.assertEquals(string1, string);

	}
	//###########################################################
	//###########################################################
	@Test(priority = 4)
	public void updateRatePlan() throws InterruptedException {

		//plan main menu
		action_obj.plan_mainmebu().click();
		//search plan
		//action_obj.searchPlanField().sendKeys("autogenerated");
		//driver.findElement(By.xpath(".//*[@id='datatablePlnList']/thead/tr/th[3]")).click();
		Thread.sleep(2000);
		//plan edit icon
		action_obj.PlanEditIcon().click();
		
		//edit tarif icon
		action_obj.TarifEditIcon().click();
		//enter rate
		action_obj.rate().clear();
		action_obj.rate().sendKeys("60");
		//update button
		action_obj.updateTerifButton().click();
		//get amount to validate
		String Actualtext2 =  action_obj.getPlanUpdateRate().getText();
		Assert.assertEquals(Actualtext2, "$60.000000");
		Thread.sleep(5000);
		//publish button
		action_obj.PublicshButton().click();
		action_obj.X().click();
		driver.navigate().refresh();

	}
	
	@Test(priority = 5)
	public void makePayments() throws Exception {
 //With Bank account 
		action_obj.search_field().sendKeys("Ele"+mno);
		action_obj.search_button().click();
		Thread.sleep(700);
		//validate overview
		Assertion_obj.Overview_text_Validation();
		//payment menu
		action_obj.Payment_mainMenu().click();

		//Select transaction type from dropdown menu
		Select mydrpdwn = new Select(action_obj.transaction_type_DropDown());
		mydrpdwn.selectByVisibleText("Payment");

		//print all options
		List<WebElement> oSize = mydrpdwn.getOptions();
		int iListSize = oSize.size();
		for(int i =0; i < iListSize ; i++){
			String sValue = mydrpdwn.getOptions().get(i).getText();
			System.out.println(sValue);  }

		//Select Payment method from dropdown
		Select mydrpdown = new Select(action_obj.Payment_method_dropDown());
		mydrpdown.selectByVisibleText("Bank Account");
		/*
		//print all options
		List<WebElement> oSize1 = mydrpdwn.getOptions();
		int iListSize1 = oSize1.size();
		for(int i =0; i < iListSize1 ; i++){
			String sValue = mydrpdown.getOptions().get(i).getText();
			System.out.println(sValue);  }
*/
		//email
		driver.findElement(By.xpath(".//*[@id='receiptEmail']")).clear();
		driver.findElement(By.xpath(".//*[@id='receiptEmail']")).sendKeys("chandan.verma@sqelabs.com");
		//Enter transaction date
		//action_obj.transactionDate().click();
		//action_obj.select_end_date_as().click();
		Thread.sleep(10000);
		//enter amount
		action_obj.PaymentAmount().sendKeys("10");
		//Duplicate check box
		action_obj.duplicate_payment_chechBox().click();
		//comments
		action_obj.comments().sendKeys("hey!!!!! this is the comment section under Payment tab");
		//make payment button
		action_obj.MakePaymentButton().click();
		//ok
//		action_obj.ok().click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(".//button[contains(text(),'Save')]")).click();
		
		//validate message
		Assertion_obj.Transaction_processed_successfully_validationbnk();
		
//With cash 
//				action_obj.search_field().sendKeys("Ele"+mno);
//				action_obj.search_button().click();
//				Thread.sleep(700);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;	 
		jse.executeScript("window.scrollBy(0,700)", "");
		action_obj.makenewpayment().click();
				//validate overview
				Assertion_obj.Overview_text_Validation();
				//payment menu
				action_obj.Payment_mainMenu().click();

				//Select transaction type from dropdown menu
				Select mydrpdwn1 = new Select(action_obj.transaction_type_DropDown());
				mydrpdwn1.selectByVisibleText("Payment");

				//Select Payment method from dropdown
				Select mydrpdown1 = new Select(action_obj.Payment_method_dropDown());
				mydrpdown1.selectByVisibleText("Cash");
				/*
				//print all options
				List<WebElement> oSize1 = mydrpdwn.getOptions();
				int iListSize1 = oSize1.size();
				for(int i =0; i < iListSize1 ; i++){
					String sValue = mydrpdown.getOptions().get(i).getText();
					System.out.println(sValue);  }
		*/
				//email
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).clear();
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).sendKeys("chandan.verma@sqelabs.com");
				//Enter transaction date
				//action_obj.transactionDate().click();
				//action_obj.select_end_date_as().click();
				Thread.sleep(10000);
				//enter amount
				action_obj.PaymentAmount().sendKeys("10");
				//Duplicate check box
				action_obj.duplicate_payment_chechBox().click();
				//comments
				action_obj.comments().sendKeys("hey!!!!! this is the comment section under Payment tab");
				//make payment button
				action_obj.MakePaymentButton().click();
				//ok
//				action_obj.ok().click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(".//button[contains(text(),'Save')]")).click();
				
				//validate message
				Assertion_obj.Transaction_processed_successfully_validationcash();

//With cheque 
//				action_obj.search_field().sendKeys("Ele"+mno);
//				action_obj.search_button().click();
//				Thread.sleep(700);
			 
		jse.executeScript("window.scrollBy(0,700)", "");
		action_obj.makenewpayment().click();
				//validate overview
				Assertion_obj.Overview_text_Validation();
				//payment menu
				action_obj.Payment_mainMenu().click();

				//Select transaction type from dropdown menu
				Select mydrpdwn2 = new Select(action_obj.transaction_type_DropDown());
				mydrpdwn2.selectByVisibleText("Payment");

				//Select Payment method from dropdown
				Select mydrpdown2 = new Select(action_obj.Payment_method_dropDown());
				mydrpdown2.selectByVisibleText("Cheque");
				/*
				//print all options
				List<WebElement> oSize1 = mydrpdwn.getOptions();
				int iListSize1 = oSize1.size();
				for(int i =0; i < iListSize1 ; i++){
					String sValue = mydrpdown.getOptions().get(i).getText();
					System.out.println(sValue);  }
		*/
				//email
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).clear();
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).sendKeys("chandan.verma@sqelabs.com");
				//Enter transaction date
				//action_obj.transactionDate().click();
				//action_obj.select_end_date_as().click();
				Thread.sleep(10000);
				//enter amount
				action_obj.PaymentAmount().sendKeys("10");
				//Duplicate check box
				action_obj.duplicate_payment_chechBox().click();
				//comments
				action_obj.comments().sendKeys("hey!!!!! this is the comment section under Payment tab");
				//make payment button
				action_obj.MakePaymentButton().click();
				//ok
//				action_obj.ok().click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(".//button[contains(text(),'Save')]")).click();
				
				//validate message
				Assertion_obj.Transaction_processed_successfully_validationchk();

//With credit card 
//				action_obj.search_field().sendKeys("Ele"+mno);
//				action_obj.search_button().click();
//				Thread.sleep(700);

		jse.executeScript("window.scrollBy(0,700)", "");
		action_obj.makenewpayment().click();
				//validate overview
				Assertion_obj.Overview_text_Validation();
				//payment menu
				action_obj.Payment_mainMenu().click();

				//Select transaction type from dropdown menu
				Select mydrpdwn3 = new Select(action_obj.transaction_type_DropDown());
				mydrpdwn3.selectByVisibleText("Payment");

				//Select Payment method from dropdown
				Select mydrpdown3 = new Select(action_obj.Payment_method_dropDown());
				mydrpdown3.selectByVisibleText("Credit Card");
				/*
				//print all options
				List<WebElement> oSize1 = mydrpdwn.getOptions();
				int iListSize1 = oSize1.size();
				for(int i =0; i < iListSize1 ; i++){
					String sValue = mydrpdown.getOptions().get(i).getText();
					System.out.println(sValue);  }
		*/
				//email
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).clear();
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).sendKeys("chandan.verma@sqelabs.com");
				//Enter transaction date
				//action_obj.transactionDate().click();
				//action_obj.select_end_date_as().click();
				Thread.sleep(10000);
				//enter amount
				action_obj.PaymentAmount().sendKeys("10");
				//Duplicate check box
				action_obj.duplicate_payment_chechBox().click();
				//comments
				action_obj.comments().sendKeys("hey!!!!! this is the comment section under Payment tab");
				//make payment button
				action_obj.MakePaymentButton().click();
				//ok
//				action_obj.ok().click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(".//button[contains(text(),'Save')]")).click();
				action_obj.viewhistory().click();
				//validate message
				Assertion_obj.Transaction_processed_successfully_validationcc();

//With Others 
//				action_obj.search_field().sendKeys("Ele"+mno);
//				action_obj.search_button().click();
//				Thread.sleep(700);

		jse.executeScript("window.scrollBy(0,700)", "");
		action_obj.makenewpayment().click();
				//validate overview
				Assertion_obj.Overview_text_Validation();
				//payment menu
				action_obj.Payment_mainMenu().click();

				//Select transaction type from dropdown menu
				Select mydrpdwn4 = new Select(action_obj.transaction_type_DropDown());
				mydrpdwn4.selectByVisibleText("Payment");

				//Select Payment method from dropdown
				Select mydrpdown4 = new Select(action_obj.Payment_method_dropDown());
				mydrpdown4.selectByVisibleText("Others");
				/*
				//print all options
				List<WebElement> oSize1 = mydrpdwn.getOptions();
				int iListSize1 = oSize1.size();
				for(int i =0; i < iListSize1 ; i++){
					String sValue = mydrpdown.getOptions().get(i).getText();
					System.out.println(sValue);  }
		*/
				//email
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).clear();
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).sendKeys("chandan.verma@sqelabs.com");
				//Enter transaction date
				//action_obj.transactionDate().click();
				//action_obj.select_end_date_as().click();
				Thread.sleep(10000);
				//enter amount
				action_obj.PaymentAmount().sendKeys("10");
				//Duplicate check box
				action_obj.duplicate_payment_chechBox().click();
				//comments
				action_obj.comments().sendKeys("hey!!!!! this is the comment section under Payment tab");
				//make payment button
				action_obj.MakePaymentButton().click();
				//ok
//				action_obj.ok().click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(".//button[contains(text(),'Save')]")).click();
				
				//validate message
				Assertion_obj.Transaction_processed_successfully_validationothers();
	
//SecurityDepositSection
//Deposit
//				action_obj.search_field().sendKeys("Ele"+mno);
//				action_obj.search_button().click();
//				Thread.sleep(700);
			 
		jse.executeScript("window.scrollBy(0,700)", "");
		action_obj.makenewpayment().click();
				//validate overview
				Assertion_obj.Overview_text_Validation();
				//payment menu
				action_obj.Payment_mainMenu().click();

				//Select transaction type from dropdown menu
				Select mydrpdwn21 = new Select(action_obj.transaction_type_DropDown());
				mydrpdwn21.selectByVisibleText("Security Deposit");

				//Select Payment method from dropdown
				Select mydrpdown22 = new Select(action_obj.Payment_method_dropDown());
				mydrpdown22.selectByVisibleText("Deposit");
				/*
				//print all options
				List<WebElement> oSize1 = mydrpdwn.getOptions();
				int iListSize1 = oSize1.size();
				for(int i =0; i < iListSize1 ; i++){
					String sValue = mydrpdown.getOptions().get(i).getText();
					System.out.println(sValue);  }
		*/
				//email
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).clear();
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).sendKeys("chandan.verma@sqelabs.com");
				//Enter transaction date
				//action_obj.transactionDate().click();
				//action_obj.select_end_date_as().click();
				Thread.sleep(10000);
				//enter amount
				action_obj.PaymentAmount().sendKeys("30");
				//Duplicate check box
				action_obj.duplicate_payment_chechBox().click();
				//comments
				action_obj.comments().sendKeys("hey!!!!! this is the comment section under Payment tab");
				//make payment button
				action_obj.MakePaymentButton().click();
				//ok
//				action_obj.ok().click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(".//button[contains(text(),'Save')]")).click();
				
				//validate message
				Assertion_obj.Transaction_processed_successfully_validationsecdeposit();
//ReturnedSecurity
//				action_obj.search_field().sendKeys("Ele"+mno);
//				action_obj.search_button().click();
//				Thread.sleep(700);
			 
		jse.executeScript("window.scrollBy(0,700)", "");
		action_obj.makenewpayment().click();
				//validate overview
				Assertion_obj.Overview_text_Validation();
				//payment menu
				action_obj.Payment_mainMenu().click();

				//Select transaction type from dropdown menu
				Select mydrpdwn22 = new Select(action_obj.transaction_type_DropDown());
				mydrpdwn22.selectByVisibleText("Security Deposit");

				//Select Payment method from dropdown
				Select mydrpdown23 = new Select(action_obj.Payment_method_dropDown());
				mydrpdown23.selectByVisibleText("Returned Security");
				/*
				//print all options
				List<WebElement> oSize1 = mydrpdwn.getOptions();
				int iListSize1 = oSize1.size();
				for(int i =0; i < iListSize1 ; i++){
					String sValue = mydrpdown.getOptions().get(i).getText();
					System.out.println(sValue);  }
		*/
				//email
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).clear();
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).sendKeys("chandan.verma@sqelabs.com");
				//Enter transaction date
				//action_obj.transactionDate().click();
				//action_obj.select_end_date_as().click();
				Thread.sleep(10000);
				//enter amount
				action_obj.PaymentAmount().sendKeys("10");
				//Duplicate check box
				action_obj.duplicate_payment_chechBox().click();
				//comments
				action_obj.comments().sendKeys("hey!!!!! this is the comment section under Payment tab");
				//make payment button
				action_obj.MakePaymentButton().click();
				//ok
//				action_obj.ok().click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(".//button[contains(text(),'Save')]")).click();
				
				//validate message
				Assertion_obj.Transaction_processed_successfully_validationreturnedsec();	
				
//Transfer
//				action_obj.search_field().sendKeys("Ele"+mno);
//				action_obj.search_button().click();
//				Thread.sleep(700);
			 
		jse.executeScript("window.scrollBy(0,700)", "");
		action_obj.makenewpayment().click();
				//validate overview
				Assertion_obj.Overview_text_Validation();
				//payment menu
				action_obj.Payment_mainMenu().click();

				//Select transaction type from dropdown menu
				Select mydrpdwn24 = new Select(action_obj.transaction_type_DropDown());
				mydrpdwn24.selectByVisibleText("Security Deposit");

				//Select Payment method from dropdown
				Select mydrpdown25 = new Select(action_obj.Payment_method_dropDown());
				mydrpdown25.selectByVisibleText("Transfer");
				/*
				//print all options
				List<WebElement> oSize1 = mydrpdwn.getOptions();
				int iListSize1 = oSize1.size();
				for(int i =0; i < iListSize1 ; i++){
					String sValue = mydrpdown.getOptions().get(i).getText();
					System.out.println(sValue);  }
		*/
				//email
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).clear();
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).sendKeys("chandan.verma@sqelabs.com");
				//Enter transaction date
				//action_obj.transactionDate().click();
				//action_obj.select_end_date_as().click();
				Thread.sleep(10000);
				//enter amount
				action_obj.PaymentAmount().sendKeys("10");
				//Duplicate check box
				action_obj.duplicate_payment_chechBox().click();
				//comments
				action_obj.comments().sendKeys("hey!!!!! this is the comment section under Payment tab");
				//make payment button
				action_obj.MakePaymentButton().click();
				//ok
//				action_obj.ok().click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath(".//button[contains(text(),'Save')]")).click();
				
				//validate message
				Assertion_obj.Transaction_processed_successfully_validationtransfer();
	}
}


