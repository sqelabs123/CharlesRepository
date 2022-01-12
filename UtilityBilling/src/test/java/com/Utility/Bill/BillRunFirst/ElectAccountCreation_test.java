package com.Utility.Bill.BillRunFirst;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_instance_Test;

public class ElectAccountCreation_test extends Sauce_instance_Test 
{

	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	public JavascriptExecutor executor;

	public String companyname="";
	public String contactemail="kingtest@yopmail.com";
	public String pass="C123456789@c";
	public String changepass="C123456789@c";
 	public String lname="Build";
	public String groupName="";
	public String Fname="John";
	public int random= (new Random()).nextInt(90000000)+10000000;
	
	@Test(priority = 1)
	public void signUpForm() throws Exception 
	{  
	
	    throw new SkipException("Testing skip due to already provided credentials.");
	  /* action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor=(JavascriptExecutor) driver;
		Date date = new Date();
		companyname=date.toString();
		companyname=companyname.replace(":", "");
		groupName=date.toString();
		groupName=groupName.replace(":", "");
		//click on try it free button 
		action_obj.try_it_for_free().click();
		//Get all the window handles in a set
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		//iterate through your windows
		while (it.hasNext())
		{
			String parent = it.next();
			String newwin = it.next();
			driver.switchTo().window(newwin);

			//Assertion to validate Overview text is present on new open page
			Assertion_obj.Start_your_free_trial_by_signing_up_Validation();
           driver.navigate().refresh();
			//current date user entry
			String  last=date.toString();
			System.out.println("The Time Is :-----------"+last);
			last= last.replace(":", "");
			last=last.replace(" ", "");

			//Enter Company Name on Registration page
			action_obj.reg_Company_name().sendKeys(companyname+last);
			//Enter First Name on Registration page
			action_obj.reg_f_name().sendKeys(Fname+last);
			//Enter Sur Name on Registration page
			action_obj.reg_sur_name().sendKeys(lname+last);
			//Enter Email on Registration page
			action_obj.reg_email().sendKeys(last+contactemail);
			
			Thread.sleep(1000);

			//Enter Phone number on Reg page
			action_obj.reg_phone().sendKeys("98"+random);
			//Select customer_base DropDown
			action_obj.reg_customer().sendKeys("2 - 250");
			Thread.sleep(5000);
			//Select Country as Australia
			Select mydrpdwn = new Select(action_obj.country()); 
			Thread.sleep(10000);
			mydrpdwn.selectByIndex(102);
			Thread.sleep(4000);
			
			//Click on captcha field
//			action_obj.captha_code().click();
			Thread.sleep(45000);
			//Click on Submit button
			action_obj.reg_submit().click();
			//validate Confirmation message
			Assertion_obj.email_sent_confirmation_message_Validation();
			//Click on 'here' link
			action_obj.here().click();
			//Close the second window
			driver.close();
			//Switch to the first window
			driver.switchTo().window(parent); 
		
		}  */ 
  //Thread.sleep(91023);
	}
	@Test(priority = 2)
	@Parameters({"userId"})
	public void login(String userId) throws InterruptedException, IOException { 
  	  
				
		/*Set <String> handles =driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();*/
		
		
	    //  String newwin = it.next();
	    //  driver.switchTo().window(newwin);
        //	driver.close();
		//  Switch to the first window
       //	driver.switchTo().window(parent); */
	
// This Section to adding only when 1st #signUpForm test case section is skipped then this 136 to 143 lins enable		
		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor=(JavascriptExecutor) driver;
		Date date = new Date();
		companyname=date.toString();
		companyname=companyname.replace(":", "");
		groupName=date.toString();
		groupName=groupName.replace(":", "");  
		
		
		

		driver.navigate().refresh();
		//Enter User Name
		action_obj.useranme().clear();
		action_obj.useranme().sendKeys(userId);
		//Enter Password
		action_obj.Password().clear();
		action_obj.Password().sendKeys(pass);
		//Click to login
		action_obj.loginbutton().click();  
		
    try {
		boolean ChooseGroup = driver.findElement(By.xpath("//span[contains(text(),'Choose a group to login to: ')]")).isDisplayed();
		if(ChooseGroup==true)
		{		
        Select dropdown = new Select(action_obj.dropdownButton());
        dropdown.selectByVisibleText("UI Administrator"); 
        System.out.println("Dropdown-btn displayed!");
        
        action_obj.final_login().click();
		}
		else {
			System.out.println("Dropdown-btn not displayed!");
		}    
		
	} catch (NoSuchElementException e) {
        return;
    }
}
	@Test(priority = 3)
	public void changePassword() throws Exception { 
   //Click on Admin main menu
       action_obj.admin_mainMenu().click();
		//Click password button under UserManagement
		action_obj.password_under_userManager().click();
		//Validate Change password text
		Assertion_obj.change_password_title_assertion();
		//Enter New Password
		action_obj.change_new_Pass().clear();
		action_obj.change_new_Pass().sendKeys(changepass);
		//Enter Re Password
		action_obj.change_re_new_Pass().clear();
		action_obj.change_re_new_Pass().sendKeys(changepass);

		//Click to change password button
		action_obj.change_password_button().click();
		//Click on ok button
		action_obj.ok().click();
		//validate change password message
		Thread.sleep(1000);
		Assertion_obj.pass_change_message_assertion();  
	 //	Thread.sleep(9023);
	}

	@Test(priority = 4)
	public void editGroup() throws Exception {
 //Thread.sleep(35263);
  //click to admin main menu
       action_obj.admin_mainMenu().click();
		//Click edit Group button under Group Management
		action_obj.edit_group_under_groupManage().click();
		//Enter Group Name
		action_obj.group_name().clear();
		action_obj.group_name().sendKeys(groupName);
		//Enter Group Owner1 name
		action_obj.group_owner1_name().clear();
		action_obj.group_owner1_name().sendKeys("Aida");
		//Enter Group Owner2 name
		action_obj.group_owner2_name().clear();
		action_obj.group_owner2_name().sendKeys("Barkley");
		//Enter finance Name
		action_obj.financeName().clear();
		action_obj.financeName().sendKeys("Elias");
		//Enter Operation name
		action_obj.operationName().clear();
		action_obj.operationName().sendKeys("Charli");
		//Enter Sales Name
		action_obj.salesName().clear();
		action_obj.salesName().sendKeys("Hartley");
		//Enter Collections/Credit Contact 'Name'
		action_obj.collectionsname().clear();
		action_obj.collectionsname().sendKeys("Bob");
		//Enter Owner1 Email
		action_obj.owner1Email().clear();
		action_obj.owner1Email().sendKeys("Aida@gmail.com");
		//enter Owner2 Email
		action_obj.owner2Email().clear();
		action_obj.owner2Email().sendKeys("Barkley@gmail.com");
		//Enter Finance Email
		action_obj.financeEmail().clear();
		action_obj.financeEmail().sendKeys("Elias@gmail.com");
		//Enter Operation Email
		action_obj.operationEmail().clear();
		action_obj.operationEmail().sendKeys("Charli@gmail.com");
		//Enter Sales Email
		action_obj.salesEmail().clear();
		action_obj.salesEmail().sendKeys("Hartley@gmail.com");
		//Enter Collections/Credit Contact 'Email'
		action_obj.collectionsemail().clear();
		action_obj.collectionsemail().sendKeys("bob@gmail.com");
		//Enter Owner1 Phone1
		action_obj.owner1Phone1().clear();
		action_obj.owner1Phone1().sendKeys("123456789aa");
		//Enter Owner2 Phone1
		action_obj.owner2Phone1().clear();
		action_obj.owner2Phone1().sendKeys("987654321aa");
		//Enter Finance Phone1
		action_obj.financePhone1().clear();
		action_obj.financePhone1().sendKeys("65525655789aa");
		//Enter operation Phone1
		action_obj.operationPhone1().clear();
		action_obj.operationPhone1().sendKeys("12345545849aa");
		//Enter sales Phone1
		action_obj.salesPhone1().clear();
		action_obj.salesPhone1().sendKeys("558156789aa");
		//Enter Collections/Credit Contact 'Phone1'
		action_obj.collectionsphone1().clear();
		action_obj.collectionsphone1().sendKeys("5566332211");
		//Enter owner1 phone2
		action_obj.owner1Phone2().clear();
		action_obj.owner1Phone2().sendKeys("84888589aa");
		//Enter owner2 phone2
		action_obj.owner2Phone2().clear();
		action_obj.owner2Phone2().sendKeys("455875789aa");
		//Enter Finance Phone2
		action_obj.financePhone2().clear();
		action_obj.financePhone2().sendKeys("898586789aa");
		//Enter Operation Phone2
		action_obj.operationPhone2().clear();
		action_obj.operationPhone2().sendKeys("898996789");
		//Enter Sales Phone2
		action_obj.salesPhone2().clear();
		action_obj.salesPhone2().sendKeys("52887789aa");
		//Enter Collections/Credit Contact 'Phone2'
		action_obj.collectionsphone2().clear();
		action_obj.collectionsphone2().sendKeys("8521479630");
		//Enter Owner1 Fax
		action_obj.owner1Fax() .clear();
		action_obj.owner1Fax().sendKeys("10006789aa");
		//Enter Owner2 Fax
		action_obj. owner2Fax() .clear();
		action_obj. owner2Fax() .sendKeys("111186789aa");
		//Enter Finance Fax
		action_obj.financeFax() .clear();
		action_obj.financeFax().sendKeys("02286789aa");
		//Enter Operation fax
		action_obj.operationFax() .clear();
		action_obj.operationFax() .sendKeys("115789aa");
		//Enter sales Fax
		action_obj.salesFax() .clear();
		action_obj.salesFax().sendKeys("55586789aa");
		//Enter Collections/Credit Contact 'Fax'
		action_obj.collectionsfax().clear();
		action_obj.collectionsfax().sendKeys("635241789aa");
		
		//Select type of cc
		Select mydrpdwn = new Select( action_obj.typeOfCreditcard()); 
		mydrpdwn.selectByVisibleText("Visa");
		//print all options of dropdown
		List<WebElement> oSize = mydrpdwn.getOptions();	 
		int iListSize = oSize.size();
		for(int i =0; i < iListSize ; i++)
		{
			String sValue = mydrpdwn.getOptions().get(i).getText();
			System.out.println(sValue); 
		}

		//bankName
		action_obj. bankName() .clear();
		action_obj. bankName().sendKeys("PNB");
		//bankAccount 
		action_obj.bankAccount().clear();
		action_obj.bankAccount() .sendKeys("Sonia12");
		//bankAccountNumber 
		action_obj.bankAccountNumber() .clear();
		action_obj.bankAccountNumber() .sendKeys("01015545858");
		//creditcardHolder
		Thread.sleep(1000);
		action_obj.creditcardHolder() .clear();
		action_obj.creditcardHolder() .sendKeys("abhi12");
		//creditCardNumber 
		action_obj.creditCardNumber().clear();
		action_obj.creditCardNumber().sendKeys("12514aa");
		//dateExpired
		action_obj.dateExpired() .clear();
		action_obj.dateExpired()  .sendKeys("032019");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,550)", "");

		//verification id
//		driver.findElement(By.name("veriNo")).clear();
//		driver.findElement(By.name("veriNo")).sendKeys("032019");
//		Thread.sleep(2000); 

		//postAddress 
		action_obj.postAddress() .clear();
		action_obj.postAddress() .sendKeys("The Strip - Las Vegas, NV");
		Thread.sleep(2000); 

		//postSub 
		action_obj. postSub() .clear();
		action_obj. postSub() .sendKeys("The Strip");
		//postState 
		action_obj.postState() .clear();
		action_obj.postState() .sendKeys("Las Vegas");
		//postCode 
		action_obj. postCode() .clear();
		action_obj. postCode() .sendKeys("14445");
		//billingAddress 
		action_obj.billingAddress() .clear();
		action_obj.billingAddress() .sendKeys("h.no:25,NV");
		//billingSub 
		action_obj.billingSub() .clear();
		action_obj.billingSub() .sendKeys("Las Vegas");
		//billingState 
		action_obj. billingState() .clear();
		action_obj. billingState() .sendKeys("Las Vegas");
		Thread.sleep(2000);  
		//billingAddress 
		action_obj.billingCode() .clear();
		action_obj.billingCode() .sendKeys("6635");
		//Scroll 
		executor.executeScript("window.scrollBy(0,1000)", "");

		//WebElement element= action_obj.Use_reference_only_invoice();
		//element.click();
		 
		
		//invoice setting section
				//FRONT
				Select select1 = new Select(action_obj.primary_front());
				select1.selectByIndex(1);					
				Thread.sleep(1000);
				//BACK
				Select select2 = new Select(action_obj.primary_back());
				select2.selectByIndex(1);
				Thread.sleep(2000);
				//FRONT
				Select select3 = new Select(action_obj.secondary_front());
				select3.selectByIndex(1);
				Thread.sleep(2000);
				//BACK
				Select select4 = new Select(action_obj.secondary_back());
				select4.selectByIndex(1);  
				Thread.sleep(2000);

		//add vkp
		
				
		//enable Allocation 
		Thread.sleep(3000);	
		//click on check box
  //   if ( ! action_obj.EnablePayment_Allocation().isSelected())
//				{
  //  	 action_obj.EnablePayment_Allocation().click();
	//			}  

		
		executor.executeScript("window.scrollBy(0,900)", "");
		Thread.sleep(4000);
	 //  action_obj.EnablePayment_Allocation().click();
	   action_obj.EnablePayment_AllocationBYrollup().click();
	    
	    Thread.sleep(1000);
	    executor.executeScript("window.scrollBy(0,800)", "");
	 //enable customer attachment
	if ( ! action_obj.customer_attachment().isEnabled());
		{
	 	action_obj.customer_attachment().click();
		}   
	   // driver.findElement(By.cssSelector("data-on=\"Yes")).click();
	  //  executor.executeScript("window.scrollBy(0,500)", "");
	//	action_obj.customer_attachment().click();	
		
		Thread.sleep(2000);
		//tiabNotes 
		action_obj. tiabNotes() .clear();
		action_obj. tiabNotes() .sendKeys("making notes for admin tab");
		//franchiseeNotes 
		action_obj. franchiseeNotes() .clear();
		action_obj. franchiseeNotes() .sendKeys("making notes for Service provider field");
		//scroll
		executor.executeScript("window.scrollBy(0,1800)", "");

		//Click on the Update  button
		action_obj.save_changes().click();
		//OK confirmation
		action_obj.ok().click();
		//Assertion to validate Changes have been updated text is present on new open page
		Assertion_obj.changes_save_message_assertion();
		//Assert.assertEquals(action_obj.changes_save_message().getText(), "Success! Changes have been updated successfully.");
 
	}

	@Test(priority = 5)
	public void locale_settings() throws Exception{

   //Click on Admin main menu
       action_obj.admin_mainMenu().click();
		//Click on 'Locale Settings' link
		action_obj.localesettings().click();
		//Assertion with 'Currency Settings' text.
		Assertion_obj.currencysettings();
		//Select currency symbol
		Thread.sleep(1000);
		Select currency = new Select(action_obj.currencysymbol());
		currency.selectByVisibleText("Dollar");
		//Select Decimal points
		Select decimal = new Select(action_obj.decimalpoints());
		decimal.selectByVisibleText("2");
		//Select separator
		Select separator = new Select(action_obj.thousandseparator());
		separator.selectByVisibleText("Comma(,)");
		//Enter 'Decimal Symbol'
		Thread.sleep(500);
		action_obj.decimalsymbol().clear();
		Thread.sleep(500);
		action_obj.decimalsymbol().sendKeys(".");
		//Select tax unit
		Thread.sleep(500);
		
		//Remove Test
		// Select tax_unit = new Select (action_obj.tax_unit());
		// tax_unit.selectByVisibleText("GST");
		
		//Select date format
		Select date_format = new Select (action_obj.date_format());
		date_format.selectByValue("MM/dd/yyyy");
		//Select Time format
		Select time_format = new Select (action_obj.time_format());
		time_format.selectByValue("hh:mm a");
		//Click on 'Save' button
		executor.executeScript("window.scrollBy(0,500)", "");
		action_obj.save_changes().click();
		Thread.sleep(500);
		
		
		//-----------------------------------------------Add logout setting new 
		
		//Click on the UserIcon
				action_obj.user_icon_logout().click();
				Thread.sleep(10000);
				//scroll
				executor.executeScript("window.scrollBy(0,500)", "");
				//Click to logout from application
				action_obj.logout().click(); 
  
	}
}
