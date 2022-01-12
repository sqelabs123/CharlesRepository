package com.Utility.Bill.BillRunFirst;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;
import com.Utility.Bill.Re_Usable.Sauce_instance_Test;

public class ElectPayments extends Sauce_Instance_Login_Test{
	//public class ElectPayments extends Sauce_instance_Test {
	
	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	public JavascriptExecutor executor;

	
	 public String custid="";
	static String mno="";
	//String planNo="582";
	//JavascriptExecutor executor;


	//###########################################################
	//###########################################################
	
	@Test(priority = 0)
	public void customer() throws Exception {
		
		action_obj=new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);

		executor = (JavascriptExecutor) driver;

		action_obj.customer_main_menu().click();
		action_obj.customer_F_name().sendKeys("Robert");
		action_obj.customer_sure_name().sendKeys("Taylor");
		Select select = new Select(action_obj.Category_drop());
		select.selectByVisibleText("Business");
		
		List<WebElement> oSize2 = select.getOptions();
		int iListSize2 = oSize2.size();
		for(int i =0; i < iListSize2 ; i++){
		String sValue = select.getOptions().get(i).getText();
		System.out.println(sValue);  
		}
		// Enter Company Name
		 driver.findElement(By.id("companyName")).sendKeys("Company Moryieo");
		
		action_obj.cus_address1().sendKeys("Worth Avenue");
		action_obj.cus_address2().sendKeys("Palm Beach");
		action_obj.billingState().sendKeys("FL");
		action_obj.toggle_button().click();
		action_obj.customer_country().sendKeys("US");
		action_obj.Phone_Mobile().sendKeys("78898525");
		Select select2 = new Select(action_obj.select_plan());
		select2.selectByVisibleText("Electricity Residential plan");// 17 nov changed on Electricity Flat Template Plan
		
		action_obj.Email().sendKeys("kingtest123@yopmail.com");
		action_obj.BEmail().sendKeys("kingtest@yopmail.com");
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
	mydrpdwn.selectByVisibleText("Electricity Residential plan");// 17 nov changed on Electricity Flat Template Plan
	 
	 
	 
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
	Thread.sleep(21956);
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
	//	action_obj.once_description().sendKeys("Onceoff- charge description");
		action_obj.once_description().sendKeys("Connection Fee");
		 Actions action = new Actions(driver);
	    action.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(2000);
		//Enter Roll up Description
	//	action_obj.rollupDescription().sendKeys("Rollup Description");
		Thread.sleep(3000);
//	12 dec	Select mydrpdown1 = new Select(action_obj.changes_description_dropDown());
//	12 dec	mydrpdown1.selectByIndex(1);
		//select today date
		action_obj.ChargeStartDate().click();
		action_obj.select_today_date().click();
		//click in end date charge field
		action_obj.ChargesEndDate().click();
		Thread.sleep(2000);
		//next button of calendar
		action_obj.next_button_calander().click();
		Thread.sleep(2000);
		//select any random date
		action_obj.select_end_date_as().click();
		//enter charge unit
		action_obj.charges_unit().sendKeys("20");
		//enter charge rate
		action_obj.ChargesRate().sendKeys("20");
		//enter charge
		action_obj.Charges().sendKeys("200");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;	 
		jse.executeScript("window.scrollBy(0,800)", "");
		//save button
		//action_obj.ChargesSaveButton().click();
		executor.executeScript("javascript:formsubmit();", action_obj.ChargesSaveButton());
		//select all option from dropdown
		Thread.sleep(5000); //sleep time
//		12 dec		Select  electMeter = new Select(action_obj.AllDrop_Down());
//		12 dec		electMeter.selectByIndex(1);// selectByVisibleText("All");
		//validate by meter number
		Thread.sleep(5000);
		/*String string1=driver.findElement(By.xpath(".//*[text()='"+string+"'] ")).getText();
		System.out.println(string1+"First");
		Assert.assertEquals(string1, string); */
		
		/*String obj = driver.findElement(By.xpath(".//*[text()='Success!']")).getText(); //get the text which you want to assert
		Assert.assertEquals("Success!", obj);*/
//      String onceoffcharg= driver.findElement(By.xpath(".//*[contains(text(),'Successfully once-off Charges')]")).getText();
//	  Assert.assertEquals(onceoffcharg, "Successfully once-off Charges"); 
		
	}

	//###########################################################
	//###########################################################
	@Test(priority = 3)
	public void addRecurringCharges() throws Exception {
		Thread.sleep(19458);
	Thread.sleep(5000);
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
		Thread.sleep(15000);
		//select charges description
		Select mydrpdown1 = new Select(action_obj.RecurringChargesDesacriptionDrop());
		mydrpdown1.selectByIndex(1);//08 dec changed index value 1
		//select today date
		action_obj.ChargeStartDate().click();
		action_obj.select_today_date().click();
		//enter no of period 
		action_obj.No_of_period().sendKeys("1");
		//check ongoing check box
		action_obj.ongoing_CheckBox().click();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;	 
		jse.executeScript("window.scrollBy(0,800)", "");
		//save button
	//	action_obj.ChargesSaveButton().click();
		executor.executeScript("javascript:formsubmit();", action_obj.ChargesSaveButton());
		Thread.sleep(14000);
		//select all option
//	12 dec Select  electMeter = new Select(action_obj.AllDrop_Down());
//	electMeter.selectByIndex(1);//changed with All//electMeter.selectByVisibleText("Usage charge"); 
		//validate by meter number
		Thread.sleep(5000);

		String string1=driver.findElement(By.xpath(".//*[text()='"+string+"'] ")).getText();
		Assert.assertEquals(string1, string);
		Thread.sleep(10000);
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
		Thread.sleep(3000);
		//plan edit icon
		action_obj.PlanEditIcon().click();
		
		//edit tarif icon
		// 8dec   action_obj.TarifEditIcon().click();
		//enter rate
		// 8dec  		action_obj.rate().clear();
		// 8dec  		action_obj.rate().sendKeys("60");
		//update button
		// 8dec  	action_obj.updateTerifButton().click();
		//get amount to validate
		Thread.sleep(5000);
		String Actualtext2 =  action_obj.getPlanUpdateRate().getText();
		//Assert.assertEquals(Actualtext2, "$65.000000");
		Thread.sleep(5000);
		//publish button
		action_obj.PublicshButton().click();
		action_obj.X().click();
		driver.navigate().refresh();
//Thread.sleep(4000);
	}
	
	@Test(priority = 5)
	public void makePayments() throws Exception {
     driver.navigate().refresh();
     Thread.sleep(3000);
		action_obj.search_field().sendKeys("Ele"+mno);
		action_obj.search_button().click();
		Thread.sleep(700);
		//validate overview
		Assertion_obj.Overview_text_Validation();
		//payment menu
		action_obj.Payment_mainMenu().click();
		Thread.sleep(3000);

		//Select transaction type from dropdown menu
		Select mydrpdwn = new Select(action_obj.transaction_type_DropDown());
		mydrpdwn.selectByVisibleText("Payment");

		//print all options
		List<WebElement> oSize = mydrpdwn.getOptions();
		int iListSize = oSize.size();
		for(int i =0; i < iListSize ; i++){
			String sValue = mydrpdwn.getOptions().get(i).getText();
			System.out.println(sValue);  }

		Thread.sleep(3000);
		//Select Payment method from dropdown
		Select mydrpdown = new Select(action_obj.Payment_method_dropDown());
		//mydrpdown.selectByVisibleText("Others");
		mydrpdown.selectByVisibleText("Credit Card");
		//email
		driver.findElement(By.xpath(".//*[@id='receiptEmail']")).clear();
		driver.findElement(By.xpath(".//*[@id='receiptEmail']")).sendKeys("sqelabs10@gmail.com");
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
		Thread.sleep(3000);
		
		action_obj.MakePaymentButton().click();
		Thread.sleep(4000);
		//ok
    	action_obj.ok().click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(".//button[contains(text(),'Save')]")).click();
		
		//validate message
		Thread.sleep(4000);
		Assertion_obj.Transaction_processed_successfully_validation();
		Thread.sleep(12000);
		//Click on 'View History' button
	 //comment for some time work A.
		/*action_obj.viewhistoryofpayment().click(); 
 
		//Click on 'Make New Payment' button
		action_obj.makenewpaymentbutton().click();
		//Click on 'View History' button
		action_obj.viewhistorypaymentpage().click();
		Thread.sleep(2000);
		//Search payment
		action_obj.searchpayment().sendKeys("Payment received");
		//Assert with 'Payment Method'
		Thread.sleep(1500);
		Assertion_obj.transactionpayment();
		//Click on 'Make New Payment' button
		action_obj.makenewpaymentbutton().click();*/
		//Thread.sleep(33000);
	//Thread.sleep(33000);
		}
	
	@Test(priority = 6)
	public void Security_Deposit() throws Exception {
 
	/*//Select transaction type from dropdown menu
				Select mydrpdwn = new Select(action_obj.transaction_type_DropDown());
				mydrpdwn.selectByVisibleText("Security Deposit");

				//print all options
				List<WebElement> oSize = mydrpdwn.getOptions();
				int iListSize = oSize.size();
				for(int i =0; i < iListSize ; i++){
					String sValue = mydrpdwn.getOptions().get(i).getText();
					System.out.println(sValue);  }

				//Select Payment method from dropdown
				Select mydrpdown = new Select(action_obj.Payment_method_dropDown());
				mydrpdown.selectByVisibleText("Deposit");
		
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).clear();
				driver.findElement(By.xpath(".//*[@id='receiptEmail']")).sendKeys("sqelabs10@gmail.com");
		
				Thread.sleep(10000);
		
				action_obj.PaymentAmount().sendKeys("75");
				//Duplicate check box
				action_obj.duplicate_payment_chechBox().click();
				//comments
				action_obj.comments().sendKeys("hey!!!!! this is the comment section under Payment tab(Security Deposit)");
				//make payment button
				action_obj.MakePaymentButton().click();
				//Click on 'OK' button				
				Thread.sleep(5000);
				action_obj.ok().click(); 
				//Click on 'Make New Payment' button
				Thread.sleep(8000);// sleep time
	// hide <	
				action_obj.makenewpayment().click(); 
				//Click on 'Deposit History' button
				Thread.sleep(2000); // sleep time
			    action_obj.deposithistory().click();
				Thread.sleep(4000); // sleep time
				//Search with payment
				action_obj.searchpayment().sendKeys("75");
				//Assert with security deposity
				Assertion_obj.assertdeposit();
			// hide >	
*/				
		Thread.sleep(20455);
				
	}
}

