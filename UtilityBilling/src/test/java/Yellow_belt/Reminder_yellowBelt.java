package Yellow_belt;

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
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class Reminder_yellowBelt extends Sauce_Instance_Login_Test {
	 public String customerNumber;
	 public String no;
	 public JavascriptExecutor executor;
	 static String mno="";
	 String MtrNo4CSV="";
	 static String wno="";
		public String planNo;
		public String bill_amount="";
		
		@Test(priority = 1)
		public void changeCustEMail() throws Exception{
			
			executor = (JavascriptExecutor) driver;

			action_obj.customer_main_menu().click();
			action_obj.customer_F_name().sendKeys("Norve");
			action_obj.customer_sure_name().sendKeys("Mark");
			Select select = new Select(action_obj.Category_drop());
			select.selectByVisibleText("Business");
			
			List<WebElement> oSize2 = select.getOptions();
			int iListSize2 = oSize2.size();
			for(int i =0; i < iListSize2 ; i++){
			String sValue = select.getOptions().get(i).getText();
			System.out.println(sValue);  
			}
			
			action_obj.cus_address1().sendKeys("Main Street");
			action_obj.cus_address2().sendKeys("TR city");
			action_obj.billingState().sendKeys("New City");
			action_obj.toggle_button().click();
			action_obj.customer_country().sendKeys("US");
			action_obj.Phone_Mobile().sendKeys("0649641230");
			Select select2 = new Select(action_obj.select_plan());
			select2.selectByIndex(1);
			
			action_obj.Email().sendKeys("vipul.sharma@sqelabs.com");
			action_obj.BEmail().sendKeys("natasha.verma@sqelabs.com");
			executor.executeScript("window,scrollBy(0,1800)", "");
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
			action_obj.Email().sendKeys("testreport@sqelabs.com");
			//scroll
			JavascriptExecutor executor =(JavascriptExecutor) driver;
			executor.executeScript("scrollBy(0,2500)", "");
			//click on save customer
			action_obj.save_customer().click();
			//OK
			action_obj.ok().click();
			//Confirmation message
			Assertion_obj. sucessfully_saved_customer_message_validation();

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
			MtrNo4CSV="Ele"+mno;
			 Select mydrpdwn1 = new Select(action_obj.meterConfig_drop_down()); 
			mydrpdwn1.selectByVisibleText("Flat Rate"); 
			Thread.sleep(2000);
			executor=(JavascriptExecutor) driver;
			executor.executeScript("window.scrollBy(0,1000)", "");
			action_obj.toggle_button().click(); 
			Select mydrpdwn2 = new Select(action_obj.readding_drop_down()); 
			mydrpdwn2.selectByVisibleText("Consumption"); 
			JavascriptExecutor jse = (JavascriptExecutor)driver;	 
			jse.executeScript("window.scrollBy(0,1500)", "");
			action_obj.create_service_button().click();
			action_obj.ok().click(); 
			Assertion_obj.utilities_header_validation(); 
			Assertion_obj.Overview_text_Validation(); 
			 
		
			 
			//@@@@@@@@@@@@@@@@@@@@@@@@ MTR READ 11111111111  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
			 
				//meter read main menu
				action_obj.Meter_Reads_mainMenu().click();
				//select meter no for reading
				Select mydrpdwn2s = new Select(action_obj.MeterNoForMeterReading());
				Thread.sleep(2000);
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
				executor.executeScript("javascript:saveRead();",  action_obj.save_Read_button());
				//validate by read type text selected in dropdown
				//Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()="+vali_str+"'])[1]")).getText(),vali_str);
				//validate view read text
				Assertion_obj.viewRead_Text_validation();
				//@@@@@@@@@@@@@@@@@@@@@@@@ MTR READ 222222222222222222222222  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
				driver.navigate().refresh();
				//add read button
				Thread.sleep(1000);
				action_obj.addReadButton().click();
				//validate add meter read popup message
				Assertion_obj.AddMeterReadPopupText_validation();
				//select read type
				Select mydrpdwn25a = new Select(action_obj.readTypeDropDown());
				mydrpdwn25a.selectByIndex(2);
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
				//validate by read type text selected in dropdown
			//	Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()="+vali_str1+"'])[1]")).getText(),vali_str1);
				//validate view read text
				Assertion_obj.viewRead_Text_validation();
				driver.navigate().refresh();

			
		}
		
		@Test(priority = 4)
		public void bill_run() throws Exception{
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
			//Thread.sleep(120000);
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
	        Thread.sleep(700);
			action_obj.viewButton().click();
			Thread.sleep(7000);

			
			//Assertion to validate  Bill Run Results text is present
			Assertion_obj.bill_run_results_message_assertion();
//			String Actualtext03 = driver.findElement(By.xpath(".//*[@id='myBillRunResultsModal']/div/div/div[1]/h4")).getText();
//			Assert.assertEquals(Actualtext03, "Bill Run Results");
//			System.out.print("\n assertion_method_1() ->Bill Run Results Part executed");

			//get statement number 
			String no = driver.findElement(By.xpath(".//*[contains(text(),'Statement Summary #') ]")).getText();
			System.out.println(no);
			////By vipul
			//close bill run popup
			action_obj.closeBillrun().click();
			//yes button
			action_obj.yesButton().click();
			//ADMIN main_menu
		}
		
			@Test(priority = 5)
			public void Soft_reminder() throws Exception
			{
			action_obj.admin_mainMenu().click();
			//Click on reminders
			action_obj.reminders_admin().click();
			//Assertion for reminder page
			Assertion_obj.reminderpage();
			//Select reminder type
			Select remindertype = new Select(action_obj.remindertype());
			remindertype.selectByValue("SREM");
			
//			String[] stmtno = no.split("#");
//			String stmtnofnl = stmtno[1];
//			System.out.println(stmtnofnl);
			Thread.sleep(1000);
			//select statement number
			Select statementno = new Select(action_obj.statementno());
			statementno.selectByIndex(0);
			
			//Number of Days Overdue
//leaving overdue days empty			action_obj.dayoverdue().sendKeys("2");
			
			//Click on generate reminder button
			action_obj.generatereminder().click();
			
			//Assertion for customer no. on reminder page
			String Actualtext03 = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[2]/div")).getText();
			Assert.assertEquals(Actualtext03, customerNumber);
			System.out.println("Soft Reminder customer is appears");
				
		}		
			@Test(priority = 6)
			public void Soft_reminder_csv_download() throws Exception
			{
				Thread.sleep(1000);
				//click on checkbox
				action_obj.customerno_reminder_checkbox().click();
				Thread.sleep(500);
				//click on download icon
				action_obj.customerno_reminder_download().click();
				Thread.sleep(1000);
				
			}
			@Test(priority = 7)
			public void Soft_reminder_email() throws Exception
			{
				Thread.sleep(1000);
				//click on check box
				if ( ! action_obj.customerno_reminder_checkbox().isSelected() )
				{
					action_obj.customerno_reminder_checkbox().click();
				}  
//				action_obj.customerno_reminder_checkbox().click();
				Thread.sleep(500);
				//click on email icon
				action_obj.customerno_reminder_email().click();
				Thread.sleep(500);
				//Click on continue button
				action_obj.customerno_reminder_email_continue().click();
				Thread.sleep(3500);
				//asertion for email
				Assertion_obj.reminderemail();
				//click on close button
				action_obj.emailpopupclose().click();
			}
			
			@Test (priority = 8)
			public void Hard_reminder() throws Exception
			{
				Thread.sleep(1000);
				action_obj.admin_mainMenu().click();
				//Click on reminders
				action_obj.reminders_admin().click();
				//Assertion for reminder page
				Assertion_obj.reminderpage();
				//Select reminder type
				Select remindertype = new Select(action_obj.remindertype());
				remindertype.selectByValue("HREM");
				//select statement number
				Select statementno = new Select(action_obj.statementno());
				statementno.selectByIndex(0);
				
				//Number of Days Overdue
//leaving overdue days empty			action_obj.dayoverdue().sendKeys("2");
				
				//Click on generate reminder button
				action_obj.generatereminder().click();
				
				//Assertion for customer no. on reminder page
				String Actualtext03 = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[2]/div")).getText();
				Assert.assertEquals(Actualtext03, customerNumber);
				System.out.println("Hard Reminder customer is appears");
			}
			@Test (priority = 9)
			public void Hard_reminder_csv_download() throws Exception
			{
				Thread.sleep(1000);
				//click on checkbox
				action_obj.customerno_reminder_checkbox().click();
				Thread.sleep(500);
				//click on download icon
				action_obj.customerno_reminder_download().click();
				Thread.sleep(1000);
			}
			
			@Test (priority = 10)
			public void Hard_reminder_email() throws Exception
			{
				Thread.sleep(1000);
				//click on check box
				if ( ! action_obj.customerno_reminder_checkbox().isSelected() )
				{
					action_obj.customerno_reminder_checkbox().click();
				}  
//				action_obj.customerno_reminder_checkbox().click();
				Thread.sleep(500);
				//click on email icon
				action_obj.customerno_reminder_email().click();
				Thread.sleep(500);
				//Click on continue button
				action_obj.customerno_reminder_email_continue().click();
				Thread.sleep(3500);
				//asertion for email
				Assertion_obj.reminderemail();
				//click on close button
				action_obj.emailpopupclose().click();
			}
			@Test (priority = 11)
			public void Final_Notice_reminder() throws Exception
			{
				Thread.sleep(1000);
				action_obj.admin_mainMenu().click();
				//Click on reminders
				action_obj.reminders_admin().click();
				//Assertion for reminder page
				Assertion_obj.reminderpage();
				//Select reminder type
				Select remindertype = new Select(action_obj.remindertype());
				remindertype.selectByValue("FNLNTC");
				//select statement number
				Select statementno = new Select(action_obj.statementno());
				statementno.selectByIndex(0);
				
				//Number of Days Overdue
	//leaving overdue days empty			action_obj.dayoverdue().sendKeys("2");
				
				//Click on generate reminder button
				action_obj.generatereminder().click();
				
				//Assertion for customer no. on reminder page
				String Actualtext03 = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[2]/div")).getText();
				Assert.assertEquals(Actualtext03, customerNumber);
				System.out.println("Final Notice Reminder customer is appears");
			}
			@Test (priority = 12)
			public void Final_Notice_reminder_csv_download() throws Exception
			{
				Thread.sleep(1000);
				//click on checkbox
				action_obj.customerno_reminder_checkbox().click();
				Thread.sleep(500);
				//click on download icon
				action_obj.customerno_reminder_download().click();
				Thread.sleep(1000);
			}
			@Test (priority = 13)
			public void Final_Notice_reminder_email() throws Exception
			{
				Thread.sleep(1000);
				//click on check box
				if ( ! action_obj.customerno_reminder_checkbox().isSelected() )
				{
					action_obj.customerno_reminder_checkbox().click();
				}  
//				action_obj.customerno_reminder_checkbox().click();
				Thread.sleep(500);
				//click on email icon
				action_obj.customerno_reminder_email().click();
				Thread.sleep(500);
				//Click on continue button
				action_obj.customerno_reminder_email_continue().click();
				Thread.sleep(3500);
				//asertion for email
				Assertion_obj.reminderemail();
				//click on close button
				action_obj.emailpopupclose().click();
			}
		
			@Test (priority = 14)
			public void Disconnection_Notice_reminder() throws Exception
			{
				Thread.sleep(1000);
				action_obj.admin_mainMenu().click();
				//Click on reminders
				action_obj.reminders_admin().click();
				//Assertion for reminder page
				Assertion_obj.reminderpage();
				//Select reminder type
				Select remindertype = new Select(action_obj.remindertype());
				remindertype.selectByValue("NDIS");
				//select statement number
				Select statementno = new Select(action_obj.statementno());
				statementno.selectByIndex(0);
				
				//Number of Days Overdue
	//leaving overdue days empty			action_obj.dayoverdue().sendKeys("2");
				
				//Click on generate reminder button
				action_obj.generatereminder().click();
				
				//Assertion for customer no. on reminder page
				String Actualtext03 = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[2]/div")).getText();
				Assert.assertEquals(Actualtext03, customerNumber);
				System.out.println("Disconnection Notice Reminder customer is appears");
			}

			@Test (priority = 15)
			public void Disconnection_Notice_reminder_csv_download() throws Exception
			{
				Thread.sleep(1000);
				//click on checkbox
				action_obj.customerno_reminder_checkbox().click();
				Thread.sleep(500);
				//click on download icon
				action_obj.customerno_reminder_download().click();
				Thread.sleep(5000);
			}
			
			@Test (priority = 16)
			public void Disconnection_Notice_email_csv_reminders() throws Exception
			{
				Thread.sleep(1000);
				//click on check box
				if ( ! action_obj.customerno_reminder_checkbox().isSelected() )
				{
					action_obj.customerno_reminder_checkbox().click();
				}  
//				action_obj.customerno_reminder_checkbox().click();
				Thread.sleep(500);
				//click on email icon
				action_obj.customerno_reminder_email().click();
				Thread.sleep(500);
				//Click on continue button
				action_obj.customerno_reminder_email_continue().click();
				Thread.sleep(5000);
				//asertion for email
				Assertion_obj.reminderemail();
				//click on close button
				action_obj.emailpopupclose().click();
			}
}
