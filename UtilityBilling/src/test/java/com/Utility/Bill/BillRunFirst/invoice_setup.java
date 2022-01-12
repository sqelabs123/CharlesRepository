package com.Utility.Bill.BillRunFirst;


import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;
import com.Utility.Bill.Re_Usable.Sauce_instance_Test;

public class invoice_setup extends Sauce_Instance_Login_Test{
	
//	public class invoice_setup extends Sauce_instance_Test {
	
		
		public Repo_Test action_obj;
		public Assertion_Test Assertion_obj;
	
	
	
    
	String name=""; 
	JavascriptExecutor executor;

	//################################################

	@Test(priority = 1)

	public void create_invoice() throws InterruptedException, Exception {
       //admin main menu
		
		action_obj=new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		
		action_obj.admin_mainMenu().click();
		//invoice setup under admin menu
		action_obj.invoice_setup().click();
		
		
		
		//click on create nre invoice
		action_obj.createNewInvoice().click();

		//date
		Date date = new Date();
		name=date.toString();
		System.out.println("The Time Is :-----------"+name);
		name= name.replace(":", "");
		name=name.replace(" ", "");
		System.out.println(name);
		//enter invoice name
		action_obj.invoiceName().sendKeys(name);
		//scroll down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");


		//check all checkboxes
		// Only for this   
	//	WebElement  element1 = action_obj.maincheck();
	//	while(element1.isSelected()==false)
	//	element1.click();
		
		action_obj.chargeCheck().click();
		action_obj.listcheck().click();
		action_obj.itemCheck().click();
		action_obj.itemlistheadercheck().click();
		action_obj.ITEMIZATION_LIST().click();
		action_obj.GRAPH().click();
		action_obj.GRAPH_IMAGE().click();
		//add vinod  
		action_obj.Water_Graph().click();
		Thread.sleep(1000);
		action_obj.Elec_Graph().click();
		Thread.sleep(3000);
		action_obj.CarbonEmmissionGraph().click();
		Thread.sleep(3000);
		//save invoice
		executor=(JavascriptExecutor) driver;
		executor.executeScript("scrollBy(0,500)", "");
		action_obj.saveInvoice().click();
		Thread.sleep(5000);
        
		
		
	 //add options by double click
		//Actions action = new Actions(driver);
	//	action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
		//action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
		//action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
		//action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
		//scroll
      	
		executor=(JavascriptExecutor) driver;
		executor.executeScript("scrollBy(0,1000)", "");
		//click on save this template
		action_obj.savethis_template().click();
		//ok
		action_obj.ok().click();

		Thread.sleep(2000);
		//driver.navigate().refresh();
		//action_obj.PreviewallButton().click();
		//action_obj.closePreview().click();
		executor.executeScript("scrollBy(0,-1000)", "");
		Thread.sleep(1000);
//1. Statement and Usage bar graph 
		 
		Actions builder = new Actions(driver);
	 builder.moveToElement(action_obj.Invocie_Category()).build().perform();
	
	 Select InvocieCatgry=new Select(action_obj.Invocie_Category());
	 InvocieCatgry.selectByVisibleText("7 - Statement and Usage bar graph - [GRAPH]");
 	 Thread.sleep(2000);
	 
	 //Assetion On Graph Place Holder
	  //driver.switchTo().frame("invoice_content_area_ifr");
	  // Assertion_obj.AssertGasGraphPlaceHolder();
	  driver.switchTo().defaultContent();
     //	driver.switchTo().defaultContent();
	// Thread.sleep(3000);
 //2. Carbon Emission Graph
	//Actions builder1 = new Actions(driver);
	
	/*builder.moveToElement(action_obj.Invocie_Category()).build().perform();
	Thread.sleep(2000);
	
	Select InvocieCatgry2=new Select(action_obj.Invocie_Category());
	
	InvocieCatgry2.selectByVisibleText("7 - Carbon Emission Graph  [CARBON-GRAPH]");
	
	Thread.sleep(2000);*/
	
	//assetion Carbon Emission Graph 
	
//	driver.switchTo().frame("invoice_content_area_ifr");  
	
//	Assertion_obj.AssertCarbonGraphPlaceHolder();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	//Back To From Iframe
	
	//3.  Water Statement and Usage Graph
	
	//Actions builder2 = new Actions(driver);
	/*builder.moveToElement(action_obj.Invocie_Category()).build().perform();
	
	Select InvocieCatgry3=new Select(action_obj.Invocie_Category());
	InvocieCatgry3.selectByVisibleText("7 - Water Statement and Usage Graph  [WATER-GRAPH]");
	Thread.sleep(2000);*/
	//Assertion on Water Statement and Usage Graph 
//	driver.switchTo().frame("invoice_content_area_ifr");
//	Assertion_obj.AssertWaterGraphPlaceHolder();
	
	//4. Electricity Statement and Usage Graph 
	//Actions builder3 = new Actions(driver);
	
	/*builder.moveToElement(action_obj.Invocie_Category()).build().perform();
	
	Select InvocieCatgry4=new Select(action_obj.Invocie_Category());
	// #141 in (7 - Electricity Statement and Usage Graph  [ELECTRICITY-GRAPH])  
	InvocieCatgry4.selectByVisibleText("7 - Electricity Statement and Usage Graph  [ELECTRICITY-GRAPH]"); 
	Thread.sleep(2000);*/
	//Assertion on Electricity Statement and Usage Graph 
    //	driver.switchTo().frame("invoice_content_area_ifr");
    //	Assertion_obj.AssertElecGraphPlaceHolder();
	
	Thread.sleep(2000);
	///// add end vinod
		//finish button
		executor.executeScript("scrollBy(0,-1000)", "");
	//	WebElement f= action_obj.finishpreviewButton();
//	some time use this xpath 
		
		driver.findElement(By.xpath("//button[@type='button'][contains(.,'Finish')]")).click();
	//	f.click();
//		action_obj.finishpreviewButton().click();
//
//		System.out.println("=============================================================\n");
	}



	@Test(priority = 2)
	public void Edit_created_invoice() throws InterruptedException, IOException {
	   action_obj=new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		//search by above created 
       action_obj.searchnewcreatedUser().sendKeys(name);

		//validate by name
//		String string= driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]/a")).getText();
//		Assert.assertEquals(string, name);
		//click on edit icon  once time only
		
       // action_obj.edittemplateIcon().click();
        driver.findElement(By.xpath("//a[contains(@class,'btn btn-info')]")).click();
		//edit invoice name
		action_obj.invoiceName().clear();
		action_obj.invoiceName().sendKeys("After edit "+name);

		//scroll down
		 
		executor.executeScript("window.scrollBy(0,500)");

		//uncheck few check boxes
		action_obj.itemCheck().click();
		action_obj.itemlistheadercheck().click();
		action_obj.ITEMIZATION_LIST().click();
		action_obj.GRAPH().click();
		action_obj.GRAPH_IMAGE().click();
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		executor.executeScript("scrollBy(0,500)", "");
		//save invoice
		action_obj.saveInvoice().click();
		driver.navigate().refresh();
		//sctoll
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("scrollBy(0,-2000)", "");
		Thread.sleep(2000);
		//next button
		action_obj.invoiceNEXTButton().click();
		Thread.sleep(5000);
		//action_obj.PreviewallButton().click();
		//action_obj.closePreview().click();
		//click on finish button of preview
		action_obj.finishpreviewButton().click();
		//search by name, above created
		action_obj.searchnewcreatedUser().sendKeys(name);

		//assertion
		String string1= driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]/a")).getText();
		Assert.assertEquals(string1, "After edit "+name);

		System.out.println("2nd priority done\n");
		System.out.println("=============================================================\n"); 
	}

	@Test(priority = 3)
	public void invoice_edit_group() throws Exception {
		 action_obj=new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		//admin
     	action_obj.admin_mainMenu().click();
		//edit group under admin
		action_obj.edit_group_under_groupManage().click();
		//scroll down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)","");
		//invoice setting section
		//FRONT
		Select select1 = new Select(action_obj.primary_front());
		select1.selectByVisibleText("After edit "+name);
		//BACK
		Select select2 = new Select(action_obj.primary_back());
		select2.selectByVisibleText("After edit "+name);
		Thread.sleep(2000);
		//FRONT
		Select select3 = new Select(action_obj.secondary_front());
		select3.selectByVisibleText("After edit "+name);
		Thread.sleep(2000);
		//BACK
		Select select4 = new Select(action_obj.secondary_back());
		select4.selectByVisibleText("After edit "+name);
		Thread.sleep(2000);
//		driver.navigate().refresh();
		//scroll
		jse.executeScript("window.scrollBy(0,3000)","");
//		jse.executeScript("window.scrollBy(0,3000)","");
		Thread.sleep(5000);
		//save change
		action_obj.save_changes().click();
		Thread.sleep(3000);
		//ok
		action_obj.ok().click();
		Thread.sleep(5000);
		//Scroll
		
				JavascriptExecutor executor= (JavascriptExecutor)driver;
				executor.executeScript("window.scrollBy(0,1700)", "");
				
				//Assertions for invoice dropdowns
				Thread.sleep(700);
				Assertion_obj.edit_invoice_primary_front();
				Thread.sleep(700);
				Assertion_obj.edit_invoice_primary_back();
				Thread.sleep(700);
				Assertion_obj.edit_invoice_secondary_font();
				Thread.sleep(700);
				Assertion_obj.edit_invoice_secondary_back();
		//validage by message
		Assertion_obj.changes_save_message_assertion();
        
		System.out.println("3rd priority done\n");
		System.out.println("=============================================================\n");
 
	}

}
