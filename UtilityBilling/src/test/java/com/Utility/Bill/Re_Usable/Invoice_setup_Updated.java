package com.Utility.Bill.Re_Usable;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class Invoice_setup_Updated extends Sauce_Instance_Login_Test {

	
	@Test(priority=0)
	@Parameters({"userId","url"})
	public void create_invoice(String userId,String url) throws Exception{
		//admin main menu
		action_obj.admin_mainMenu().click();
		//invoice setup under admin menu
		action_obj.invoice_setup().click();
		//assertion for invoice setup page
		Assertion_obj.updatedinvoicefirstpageassertion();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//Direct Debit Bank and Branch No 
		action_obj.ddbankno().clear();
		action_obj.ddbankno().sendKeys("05241369870");
		//Direct Debit Account Number 
		action_obj.ddaccno().clear();
		action_obj.ddaccno().sendKeys("7845963210");
		//Reply to email Address 
		action_obj.replayemail().clear();
		action_obj.replayemail().sendKeys("vipul.sharma@sqelabs.com");
		//Main message (front page)
		action_obj.mainmsg().clear();
		action_obj.mainmsg().sendKeys("Your Bill is Ready");
		//Customer Service Phone Number
		action_obj.custsrvno().clear();
		action_obj.custsrvno().sendKeys("9898969695");
		//Facsimile Number
		action_obj.facno().clear();
		action_obj.facno().sendKeys("852147");
		//Faults Telephone Number
		action_obj.ftelno().clear();
		action_obj.ftelno().sendKeys("9896953214");
		//Pay By Phone Telephone Number
		action_obj.paytno().clear();
		action_obj.paytno().sendKeys("9897949596");
		//Contact Email
		action_obj.invoiceemail().clear();
		action_obj.invoiceemail().sendKeys(userId);
		//Website
		action_obj.website().clear();
		action_obj.website().sendKeys(url);
		jse.executeScript("window.scrollBy(0,1500)","");
		action_obj.invoiceupdatebutton().click();
		//Click on ok button
		action_obj.ok().click();
		Assertion_obj.successmsg();
		jse.executeScript("window.scrollBy(0,2500)","");
        //upload_section
		//for pdf logo
		action_obj.pdflogo().click();
		Thread.sleep(2000);
		
		//run autoit to upload file
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//invoice_uploads/pdflogoinvoice.exe");
		Thread.sleep(5000);
		
		//for advlogo
		action_obj.advlogo().click();
		Thread.sleep(2000);
		
		//run autoit to upload file
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//invoice_uploads/advlogoinvoice.exe");
		Thread.sleep(5000);
		
		//for footer upload
				action_obj.footer().click();
				Thread.sleep(2000);
				
				//run autoit to upload file
				Runtime.getRuntime().exec(System.getProperty("user.dir")+"//invoice_uploads/footerinvoice.exe");
				Thread.sleep(5000);
				
		action_obj.uploadfile().click();		
		Thread.sleep(1000);
		//assertion for invoice setup page
		Assertion_obj.updatedinvoicefirstpageassertion();
		Thread.sleep(1000);
		
	}
}
