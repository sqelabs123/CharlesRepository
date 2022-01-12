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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.csv;
import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class others_ImportService extends Sauce_Instance_Login_Test{

	public JavascriptExecutor jse ;	 
	public String customerNumber="";
	public static String mno="";
	public static String wno="";
	public String Plan="";
	static String gno; 
	static String meter4csv;
	
	
	
	@Test(priority=0)
  public void CustomerAndAddGasService() throws Exception {
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
		mydrpdwn1.selectByIndex(2);
		
		action_obj.planName().sendKeys("Gas Plan");
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
			mydrpdwn01.selectByIndex(1);
			//mydrpdwn01.selectByVisibleText("Gas Charges");
			Thread.sleep(3000);

			Select mydrpdwn02 = new Select(action_obj.method_type()); 
		//	mydrpdwn02.selectByVisibleText("Usage Charges");
			mydrpdwn02.selectByIndex(1);
			Thread.sleep(3000);

			Select mydrpdwn03 = new Select(action_obj.unit_type()); 
			mydrpdwn03.selectByIndex(2);
//			mydrpdwn03.selectByVisibleText("Kilowatt Hour (kWh)");		//If this statement is fail try upper on
		action_obj.rate().sendKeys("65");
		//	action_obj.toggle_button().click();
		
			action_obj.updateTerifButton().click();

Thread.sleep(1500);
action_obj.PublicshButton().click();

		 String Actualtext01 = action_obj.getplanNameon_popup().getText();
		 Assert.assertEquals(Actualtext01, "Gas Plan");
action_obj.X().click();
    Plan = driver.findElement(By.xpath(".//*[@id='plnListBody']/tr[1]/td[1]")).getText();

	Thread.sleep(2000);
	action_obj.customer_main_menu().click();
	action_obj.customer_F_name().sendKeys("Jennifer");
	action_obj.customer_sure_name().sendKeys("Scott");
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
	action_obj.cus_address1().sendKeys("Canyon Road");
	action_obj.cus_address2().sendKeys("Santa Fe");
	action_obj.billingState().sendKeys("NM");
	action_obj.toggle_button().click();
	action_obj.customer_country().sendKeys("US");
	action_obj.Phone_Mobile().sendKeys("78898525");
	Select select2 = new Select(action_obj.select_plan());
	select2.selectByVisibleText("Gas Plan");
	
	action_obj.Email().sendKeys("kingtest@yopmail.com");
	action_obj.BEmail().sendKeys("kingtest123@yopmail.com");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,1800)", "");
	action_obj.save_customer().click();
	action_obj.ok().click();
	
	Assertion_obj.sucessfully_saved_customer_message_validation();
	customerNumber=driver.findElement(By.xpath(".//*[@id='nav']/div/div/div[1]/div[2]/div[1]/label/a")).getText();
	System.out.println("Customer number is :="+customerNumber);
	
	action_obj.search_field().sendKeys(customerNumber);
	action_obj.search_button().click();  

	//Add Gas Services
		 action_obj.overview_menu().click();
			
			DateFormat dateFormat = new SimpleDateFormat("HHmmss");
			Calendar cal = Calendar.getInstance();
			System.out.println(dateFormat.format(cal.getTime()));
			gno=cal.getTime().toString(); 
			System.out.println(gno=gno.substring(11,19));
			gno=gno.replaceAll(":","");
			
			//Click on '+' icon with Gas
			action_obj.Gas_plus_icon().click();
			//Assertion of Gas service hadder
			Assertion_obj.gas_service();
			//Select Gas Plan
			Select mydrpdwn11 = new Select(action_obj.select_plan()); 
			mydrpdwn11.selectByVisibleText("Gas Flat Template Plan");
			//Enter meter no.
			action_obj.meter_number().sendKeys("Gas"+gno);
			//Meter Configuration
			Select mydrpdwn12 = new Select(action_obj.meterConfig_drop_down()); 
			mydrpdwn12.selectByVisibleText("Flat Rate");
			//Reading Type
			Select mydrpdwn2 = new Select(action_obj.readding_drop_down()); 
			mydrpdwn2.selectByVisibleText("Reads");
			
			//Scroll
				 
			jse.executeScript("window.scrollBy(0,800)", "");
			//Click on 'Create Service' button
			action_obj.create_service_button().click();
			action_obj.ok().click(); 
			Thread.sleep(6000);
	        meter4csv= driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText();
			Assertion_obj.utilities_header_validation();
			Assertion_obj.Overview_text_Validation();
	}
	//add method vinod
	@Test(priority = 2)
	public void importGasMeterNumberImport() throws InterruptedException, IOException{
 
  String p=System.getProperty("user.dir")+"//TestData//Gas Meter Number Import Template.csv";
		String col="Customer Number,Alternative Customer Number,*Plan Number,*Meter Number,*Meter Configuration [1-Flat / 2-Peak/OffPeak/Shoulder],*Prorata Date,*Meter Read Type [R-Reads/C-Consumption],*Kfactor, *Meter Type [HE - Electricity / WT - Water/ GS - Gas],Master Meter,Walk Order,Sub Address Type,Sub Address Number,Street Number,Street Name,Street Type,Suburb,State / Country,Postal (Zip) Code,Route,High Reading,Low Reading,Heating Value,Pressure factor,Conversion Factor,Unit";
		//String col="Customer Number, Alternative Customer Number, *Plan Number, *Meter Number, *Meter Configuration [1-Flat / 2-Peak/OffPeak/Shoulder], *Prorata Date, *Meter Read Type [R-Reads/C-Consumption], *Kfactor, Master Meter,Walk Order, SubAddress Type, SubAddress Number, Street Number, Street Name, Street type, Suburb, State/County, Post/Zip Code, Route, High Reading, Low Reading, Heating Value, Pressure Factor, conversion Factor, *Unit[GAC-Cubic meter(m3)/GAB-Cubic feet(ft3)/GAA-British thermal unit(btu)/GAD-Kilowatt hour(kWh)/GAE-Mega joules(MJ)/GAF-Therms(th)]"; 
				
		Date date;
		long cn=Long.parseLong(customerNumber);
       csv.GasMeterNumber(p, col, cn, Plan,mno+"114" );
		//csv.GasMeterNumber(p, col,customerNumber,"",Plan,mno+"114",'1',3/3/2018,'R',10,"GS" ); 
			System.out.println(mno);
	Thread.sleep(6533);
	//Click on the Admin link
	driver.findElement(By.linkText("Admin")).click();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	//Click on the MeterNumberImport link        
	driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[4]/div/div[2]/div[2]/a")).click();
	//driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div/div[5]/div/div[2]/div[2]/a")).click();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	//add vinod 21-march
	//Select meter Number 
	Select Metertype=new Select(driver.findElement(By.id("meterType")));
	Metertype.selectByVisibleText("Gas");
	//Click on the MeterNumberImport link under import setup
	driver.findElement(By.id("btnbrowseFile")).click();
	Thread.sleep(2000);
	
	
	//run autoit to upload file
	Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\TestData\\Gas Meter Number Import Template.exe");
	Thread.sleep(5000);
	
	//description
	driver.findElement(By.id("attDesc")).sendKeys("GasMeterNumberImport");
	Thread.sleep(2000);
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;	 
	jse.executeScript("window.scrollBy(0,500)", "");
	
	//Click on the Upload btn
	driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div/div[2]/div/div[1]/form/div[6]/a/span")).click();
	
	Thread.sleep(2000);
    jse.executeScript("window.scrollBy(0,1500)", "");

	//Click on the execute link
	driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[7]/a[1]")).click();
	Thread.sleep(2000);
	
	//capture the alert
	driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
	Thread.sleep(2000);
	
	//Assertion to validate Successfully saved MeterReadImport charges
	String Actualtext1 = driver.findElement(By.xpath(".//*[@id='importHistoryTable']/tbody/tr[1]/td[6]/span")).getText();
	Assert.assertEquals(Actualtext1, "success");
	System.out.print("\n assertion_method_1 executed"+Actualtext1); 
	}
	@Test(priority=3)
	
	public void importGasMeterRead() throws Exception{
	
	 driver.navigate().refresh();
		
		String p=System.getProperty("user.dir")+"//TestData//Meter Read Import Template.csv";
		//String p="E:\\MeterReadImportTemplate\\Meter Read Import Template.csv";
		String col="*Meter Number,	*Date of Read,	Flat Rate Read,	Peak Read,	Shoulder Read,	Off Peak Read,	*Read Type [I-Initial / A-Actual / C - Consumption / E-Estimate / F - Final],	Notes";
		Date date;
		
		csv.Meter_Read(p, col,meter4csv , "05/08/2018", 1000, 200, 300, 50, 'A', "Actual Read");
		
			//	csv.Meter_Read(p, col, MtrNo4CSV, "9/10/2016", 1000, 200, 300, 50, 'A', "Initial Read");

		action_obj.admin_mainMenu().click();
		JavascriptExecutor jse =(JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,500)", "");
		action_obj.meterReadImport().click();
		action_obj.browse_button().click();
//		JavascriptExecutor jse =(JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,500)", "");
//		Testdata testdata = new Testdata();
//		testdata.setCellData("Meter Read Import Template", 0, 1, "Ele"+mno);
//		System.out.println("Excel DOne");
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\TestData\\Meter Read Import Template.exe");
		Thread.sleep(6000);

		action_obj.description().sendKeys("MeterReadImport");
		Thread.sleep(1000);
		action_obj.Upload_btn().click();		
		Thread.sleep(2000);
//		JavascriptExecutor jse =(JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000); //sleep time
 		action_obj.play_button().click();
 		Thread.sleep(2000);
		action_obj.ok().click();
		Assertion_obj.Import_Successful_validation();

  }
}
