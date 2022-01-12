package com.Utility.Bill.BillRunFirst;

import java.util.Date;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class Admin_Features extends Sauce_Instance_Login_Test{

//protected WebDriver driver;
	
	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	
	public Date date = new Date();
	public String clname="";
	
	
	//Using clname as contact log name. clname will be the current time and date.
	
	@Test(priority = 0)
	public void miscellaneous_workflow() throws Exception{
	
		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		
		//admin main menu
		action_obj.admin_mainMenu().click();
		//Click on Miscellaneous>Workflow Types
		action_obj.workflow_types().click();
		//Workflow page assertion
		Assertion_obj.workflow_page();
		//Click on 'Create new log type'
		action_obj.createNewPlan().click();
		Thread.sleep(3000);
		
		//current date user entry
				clname=date.toString();
				System.out.println("The Time Is :-----------"+clname);
				clname= clname.replace(":", "");
				clname=clname.replace(" ", "");
				//'AA' text will show the current record on the top.
				
				
		Assertion_obj.addnewlogtypepopup();
		action_obj.typename().sendKeys("AA TN"+clname);
		action_obj.displayname().sendKeys("AA DN"+clname);
		Thread.sleep(1000);
		action_obj.savelogtype().click();
		Thread.sleep(1000);
		action_obj.searchlog().sendKeys("AA TN"+clname);
		Thread.sleep(500);
		//Expected results is "AA TN+CurrentDate"
		String Ex_aatn ="AA TN"+clname;
		//Actual result appears on workflow page after search.
		String Act_aatn = action_obj.searchlogresult().getText();
		AssertJUnit.assertEquals(Ex_aatn,Act_aatn);
	
	}
	
	@Test(priority = 1)
	public void UserManager_Users() throws Exception{
	action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		
		//admin main menu
		action_obj.admin_mainMenu().click();
		//Click on Users icon under User Manager section
		action_obj.usermanageruserdetails().click();
		//Assertion with page name
		Assertion_obj.userdetailspage();
		//Enter First Name
		action_obj.firstnameuserdetail().clear();
		action_obj.firstnameuserdetail().sendKeys("Levin");
		//Enter Last name
		action_obj.lastnameuserdetail().clear();
		action_obj.lastnameuserdetail().sendKeys("Mark");
		//Enter Email Address
		action_obj.emailuserdetail().clear();
		action_obj.emailuserdetail().sendKeys("testreport@sqelabs.com");
		//Click on 'Save' button on 'User Details' page.
		action_obj.saveuserdetails().click();
		//Click on 'OK' button of 'Confirmation' popup window
		action_obj.ok().click();
		//No validation message appears..... So, currently i'm not able to assert. But the values gets saved. :D
		
		
		
	}

	
}
