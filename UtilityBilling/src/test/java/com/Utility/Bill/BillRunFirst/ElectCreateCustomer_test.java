package com.Utility.Bill.BillRunFirst;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Testdata;
import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;
import com.Utility.Bill.Re_Usable.Sauce_instance_Test;

public class ElectCreateCustomer_test extends Sauce_Instance_Login_Test 
//public class ElectCreateCustomer_test extends Sauce_instance_Test
{
	static String title="";
	//protected WebDriver driver;
	Repo_Test action_obj;
	Assertion_Test Assertion_obj;
	JavascriptExecutor executor;

	 //public Testdata td;

	public String customerNumber;
	@Test(priority = 1)
	public void insrtCustThroughFrontEnd() throws Exception { 
		System.out.println("...........................................ElectCreateCustomer_test class..................................................................");
		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		//Click on 'Customer' main menu.
		action_obj.customer_main_menu().click();
		//Enter First name
		action_obj.customer_F_name().sendKeys("Johen");
		//Enter sure name
		action_obj.customer_sure_name().sendKeys("Smith");
		//Select category
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
		//Enter customer address
		action_obj.cus_address1().sendKeys("Calle Ocho");
		action_obj.cus_address2().sendKeys("Miami");
		action_obj.billingState().sendKeys("FL");
		action_obj.toggle_button().click();
		action_obj.customer_country().sendKeys("US");
		//Enter mobile no
		action_obj.Phone_Mobile().sendKeys("78898525");
		//16 nov  	Select select2 = new Select(action_obj.select_plan());
		//16 nov    select2.selectByVisibleText("Electricity Flat Template Plan");
		//Enter email ids
		action_obj.Email().sendKeys("kingtesty6188@gmail.com");
		action_obj.BEmail().sendKeys("kingtest621@gmail.com");
		executor.executeScript("window,scrollBy(0,1800)", "");
		//Click on 'Save Changes' button
		action_obj.save_customer().click();
		//Click on 'OK' button
		action_obj.ok().click();
		//Assert with successful confirmation message
		Assertion_obj.sucessfully_saved_customer_message_validation();
		customerNumber=driver.findElement(By.xpath(".//*[@id='nav']/div/div/div[1]/div[2]/div[1]/label/a")).getText();
		System.out.println("working fine niya test");  
		// Thread.sleep(16532);

	}

	@Test(priority = 2)
	public void Customer_attachment() throws Exception
	{
		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
	
		//click on Customer Attachment under Customer Menu 
		action_obj.customerAttachment().click();
		
		//click add attachment under Attachment
		action_obj.customerAddAttachment().click();	

		Select attachmentType=new Select(action_obj.file_classification());	
		attachmentType.selectByVisibleText("Other Attachments");
		//Title name Under Attachment 

		//date format for editing the string value
		DateFormat dateFormat = new SimpleDateFormat("HHmmss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
		title=cal.getTime().toString(); 
		System.out.println(title=title.substring(11,19));
		title=title.replaceAll(":","");
		action_obj.TitleNameAttch().sendKeys(title);

		action_obj.fileUploadUnderAttchmnt().click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//TestData/upload_image.exe");
		Thread.sleep(10000);	
		action_obj.saveattchment().click();
		Thread.sleep(3000);
		action_obj.SearchAttchment().sendKeys(title); 
		//assertion on Record Attachment
		//	Assertion_obj.Assrtionrecordsearch()

	}

	@Test(priority = 3)
	public void SearchCustomer() throws Exception{	
		  Thread.sleep(28956);
		 action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;


		Thread.sleep(5000);
		//Click All dropdown
		action_obj.search_list().click(); //niya 7nov
		Thread.sleep(2000);
		//Select customer address
		//   action_obj.select_customer_address().click();
		//Search customer by using Custoker address

		//   action_obj.search_field().sendKeys("Calle Ocho");

		action_obj.search_field().sendKeys(customerNumber);
		//Click on Search Icon
		action_obj.search_button().click(); 
//  Extra Steps to execute
		  
		//Thread.sleep(12452);
		/*Thread.sleep(5000);

	    if(action_obj.custadd1().isEnabled())
	    {	
		 action_obj.custadd1().click();	
	 	}	
         ArrayList<String> window_number = new ArrayList<String> (driver.getWindowHandles());
         driver.switchTo().window(window_number.get(1));	
		  Thread.sleep(2000);
		//click on 'Overview'
		action_obj.Overview_text().click(); 
	   Assertion_obj.detailpageaddress(); 
	  Thread.sleep(1000);
	  driver.close();
	 driver.switchTo().window(window_number.get(0));
	 Thread.sleep(2000);
		//Click on search list
		action_obj.search_list().click();
		Thread.sleep(500);
		//Click on service address
		action_obj.selectservice().click();

	//Enter service address
		action_obj.search_field().clear();
		action_obj.search_field().sendKeys("Calle Ocho");
		//Click on search icon
		action_obj.search_button().click();

		//Thread.sleep(11000);

		 if(action_obj.serviceadd().isEnabled())
		{

			action_obj.serviceadd().click();	
			}	 
		 ArrayList<String> window_number2 = new ArrayList<String> (driver.getWindowHandles());
         driver.switchTo().window(window_number2.get(1));
		// driver.switchTo().window(window_number.get(2));
		// driver.switchTo().window(window_number.get(3));
		Thread.sleep(4000);    
		//click on 'Details'
			action_obj.Overview_text().click();
			Thread.sleep(2000);
			//Assertion on detail page
			Assertion_obj.detailpageaddress();
			 driver.close();
			 driver.switchTo().window(window_number.get(0));
			//Click on all dropdowns
			action_obj.search_list().click();
			Thread.sleep(500);
			//Select customer
			action_obj.search_list_customer().click();
			//Click on search icon
			action_obj.search_button().click();
			//Click on customer
			action_obj.custadd1().click();  
			driver.switchTo().window(window_number.get(3));
			Thread.sleep(2000);  */
// below step to commented to check
		//Click on 'Settings' tab
	 	// Thread.sleep(7152);	
		action_obj.settingstab().click();
		executor=(JavascriptExecutor) driver;
		Thread.sleep(3000);
		executor.executeScript("window.scrollBy(0,900)", "");
		Thread.sleep(3000);
		//Click on life support toggle button
		//Hide niya 7th nov		    
		action_obj.enablelifesupport().click();
		Thread.sleep(1000);
		//Hide niya 7th nov  
		executor.executeScript("window.scrollBy(0,800)","");
		//Click on save button
		//Hide niya 7th nov	
		action_obj.savesettings().click();
		Thread.sleep(1000); 
	}


	private WebElement string(WebElement findElement) {
		// TODO Auto-generated method stub
		return null;  
	}

	@Parameters({"userId"})
	@Test(priority = 4)
	public void Contact_Log(String userId) throws Exception{
		
		
		//Click on 'Overview' sub tab.
		//  driver.navigate().refresh();
		//only one time
	   // Thread.sleep(15000);
        action_obj.overview_menu().click();
		//Assertion on 'Settings' page

		Assertion_obj.lyfsprtalrt();

		//Click on 'Contact' sub tab.
		action_obj.contacttab().click();
		//Assertion on 'Contact' tab

		//Hide niya 7th nov				
		Assertion_obj.lifesupportcontact();
		//Click on 'Contact' subtab.
		action_obj.contacttab().click();
		//Click on 'Add Contact Log'
		action_obj.addcontactlog().click();
		//Assertion for 'Create New Contact Log' page.
		//Hide niya 7th nov 
		Assertion_obj.newcontactlogpage();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Select 'Type'
		Select log_type = new Select(action_obj.newcontactlogtype());
		log_type.selectByVisibleText("Audit Request");
		//Select 'Assign To User'
		Select assign_to_user = new Select(action_obj.assigntouser());
		assign_to_user.selectByVisibleText(userId);
		Thread.sleep(3000);
		//Select action date
		action_obj.dateaction().click();
		driver.findElement(By.xpath(".//*[contains(text(),'Today')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("datedue")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[contains(text(),'Today')]")).click();
		//Select last date of calendar
		//driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/tbody/tr[4]/td[7]")).click();
		// driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[6]/td[7]")).click();
		Thread.sleep(3000);
		//	driver.findElement(By.xpath(".//*[contains(text(),'Today')]")).click();

		//Scroll on 'Save' button
		executor.executeScript("window.scrollBy(0,800)", "");
		//Click on 'Save' button
		action_obj.savebutton().click();
		//Search the results
		action_obj.searchcontactlog().sendKeys("Open");
		//'Details' button on 'Contact Log' page
		action_obj.detailcontactlog().click();
		//Get Ticket No
		String ticketNo= action_obj.ticketnocontactlog().getText();
		//Select 'Closed' status
		Select contactstatus = new Select(action_obj.contactlogstatus());
		contactstatus.selectByVisibleText("Closed");
		executor.executeScript("window.scrollBy(0,800)", "");
		//Click on 'Save' button
		action_obj.savebutton().click();
		//Enter ticket in 'Search' field
		action_obj.searchcontactlog().sendKeys(ticketNo);
		Thread.sleep(500);
		Assertion_obj.assertstatus();  
		Thread.sleep(5000);  
	}
	@Test(priority = 5)
	public void Settings() throws Exception{
	 	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action_obj.search_field().clear();
		action_obj.search_field().sendKeys(customerNumber);
		//Click on Search Icon
		action_obj.search_button().click();

		DateFormat dateFormat = new SimpleDateFormat("HHmmss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
		String cno=cal.getTime().toString(); 
		System.out.println(cno=cno.substring(11,19));
		cno=cno.replaceAll(":","");
		Thread.sleep(2000);
		//Click on 'Settings' subtab.
		action_obj.settingstab().click();
		Thread.sleep(2000);
		//Select Front Primary Invoice Settings
		Select primary_front = new Select (action_obj.pinvoicefront());
		//			primary_front.selectByIndex(1);
		primary_front.selectByVisibleText("Full Bill Version 1.0");
		Thread.sleep(1000);
		//Select Back Primary Invoice Settings
		Select primary_back = new Select(action_obj.pinvoiceback());
		//			primary_back.selectByIndex(1);
		primary_back.selectByVisibleText("Full Bill Version 1.0");
		Thread.sleep(1000);
		//Select Front Secondary Invoice Settings
		Select secondary_front = new Select(action_obj.sinvoicefront());
		//			secondary_front.selectByIndex(1);
		secondary_front.selectByVisibleText("Full Bill Version 1.0");
		Thread.sleep(1000);
		//Select Back Secondary Invoice Settings
		Select secondary_back = new Select(action_obj.sinvoiceback());
		//			secondary_back.selectByIndex(1);
		secondary_back.selectByVisibleText("Full Bill Version 1.0");
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,1500)","");
		Thread.sleep(500);
		//Click on save button
		action_obj.savesettings().click();
		//Assertion pending due to no validation message appears on updating.
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//Click on adminmain menu
		action_obj.admin_mainMenu().click();
		//Click on 'Bill Run Cycle'
		action_obj.billRunCycle().click();
		//Create new cycle
		action_obj.createNewPlan().click();
		//Enter name of cycle
		action_obj.cycleName().sendKeys(cno);
		//Click on 'Save' button
		action_obj.saveCycle().click();
		//Assertion with confirmation message
		Assertion_obj.cycleConfirmationMessage_text_assertion();

		//Click on 'All' dropdown
		action_obj.search_list().click();
		//Select 'Customer' option
		action_obj.search_list_customer().click();
		//Enter customer no.
		action_obj.search_field().sendKeys(customerNumber);
		//Click on Search icon
		action_obj.search_button().click();

		//Click on 'Settings' subtab.
		action_obj.settingstab().click();
		//Select 'Cycle'
		Select cycleno = new Select(action_obj.cycleno());
		cycleno.selectByVisibleText(cno);
		Thread.sleep(4000);

		executor.executeScript("window.scrollBy(0,1500)","");
		Thread.sleep(3000);
		//Click on save button
		action_obj.savesettings().click();
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(1500);
		//Click on admin main menu
		action_obj.admin_mainMenu().click();
		//Click on bill run cycle
		action_obj.billRunCycle().click();
		//Enter in search field
		action_obj.search_cycle().sendKeys(cno);
		Assertion_obj.noofcustomers();  
  	   //Thread.sleep(68156);
	} 

	@Test(priority = 6)
	public void importCustomer() throws Exception{
		//Thread.sleep(15362);  
		/* action_obj.admin_mainMenu().click();
		action_obj.customer_under_import().click();
		Thread.sleep(15000);

		action_obj.browse_button().click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//TestData/Customer Import Template Chrome.exe");
		Thread.sleep(6000);

		action_obj.description().sendKeys("Customer");
		action_obj.Upload_btn().click();
		Thread.sleep(3000);
		executor.executeScript("window.scrollBy(0,1500)", "");
		action_obj.play_button().click();
		Thread.sleep(5000);
		action_obj.ok().click();
		Thread.sleep(5000);
		Assertion_obj.Import_Successful_validation(); */
		Thread.sleep(16362); 
	}

}
