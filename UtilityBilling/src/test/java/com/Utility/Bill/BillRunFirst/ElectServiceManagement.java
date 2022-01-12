package com.Utility.Bill.BillRunFirst;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.csv;
import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;
import com.Utility.Bill.Re_Usable.Sauce_instance_Test;


public class ElectServiceManagement extends Sauce_Instance_Login_Test
//public class ElectServiceManagement extends Sauce_instance_Test

{


public 	Repo_Test action_obj;
public	Assertion_Test Assertion_obj;
String ServiceMGT="Savi";
String electPlan="Electricity Residential plan"; // "Electricity Flat Template Plan"  17 nov changed 
String waterPlan="Water Residential plan(Flat)";// "Water Flat Template Plan"  17 nov changed 
static String mno="";
static String wno="";
static String last="";
static String de="";
static String gno;
JavascriptExecutor jse  ;	 
public String customerNumber;

//############################################################
//############################################################

@Test(priority = 1)
public void insFrontGenericService() throws Exception{
	
	action_obj = new Repo_Test(driver);
	Assertion_obj = new Assertion_Test(driver);
	
	jse = (JavascriptExecutor)driver;	
	de=action_obj.date();
	System.out.println("start of insFrontGenericServices");
	//String date_=action_obj.date();
 	//action_obj.search_field().sendKeys(123);	 
	/*action_obj.search_button().click();	 
	driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/thead/tr/th[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]/a")).click();
	Thread.sleep(2000);*/
	
	action_obj.customer_main_menu().click();
	action_obj.customer_F_name().sendKeys("Kevin");
	action_obj.customer_sure_name().sendKeys("Allen");
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
	action_obj.cus_address1().sendKeys("Calle Ocho");
	action_obj.cus_address2().sendKeys("Miami");
	action_obj.billingState().sendKeys("FL");
	action_obj.toggle_button().click();
	action_obj.customer_country().sendKeys("US");
	action_obj.Phone_Mobile().sendKeys("78898525");
	Select select2 = new Select(action_obj.select_plan());
	select2.selectByVisibleText(waterPlan);
	
	action_obj.Email().sendKeys("kingtest@yopmail.com");
	action_obj.BEmail().sendKeys("kingtest321@yopmail.com");
	jse.executeScript("window.scrollBy(0,1800)", "");
	action_obj.save_customer().click();
	action_obj.ok().click();
	
	Assertion_obj.sucessfully_saved_customer_message_validation();
	customerNumber=driver.findElement(By.xpath(".//*[@id='nav']/div/div/div[1]/div[2]/div[1]/label/a")).getText();
	
	action_obj.overview_menu().click();	 
//	Assertion_obj.Overview_text_Validation();
	Thread.sleep(3000); // Sleep time
	action_obj.generic_plus_icon().click();	 
	Thread.sleep(3000);
	Assertion_obj.Gen_service_page_header_validation();	 
	action_obj.product_description().sendKeys(de); 
 
	//action_obj.meter_number().sendKeys("951");	
	action_obj.protata_date().click();	 
	Thread.sleep(1000);

	//action_obj.next_button_calander().click();	 
	action_obj.select_today_date().click();
	Select mydrpdwn = new Select(action_obj.charge_typr_drop_drop());	 
	mydrpdwn.selectByVisibleText("Account Level Charges");	 
	Thread.sleep(5000);
	action_obj.end_date().click();	 
	action_obj.next_button_calander().click();	 
	action_obj.select_end_date_as().click();	 
	action_obj.quantity().sendKeys("2");	 
	action_obj.rollup_desc().sendKeys("rollup descrip t xyzxaa");	 

 	Select mydrpdwn1 = new Select(action_obj.unit_type_drop());	 
	mydrpdwn1.selectByVisibleText("Month");	 
	action_obj.rate().sendKeys("10");	 
	action_obj.notes().sendKeys("hi i am writing notes in generic services");	 
	action_obj.saveSrv().click();
	action_obj.ok().click();	 
	action_obj.finishBtn().click();	 
//	JavascriptExecutor jse = (JavascriptExecutor)driver;	 
//	jse.executeScript("window.scrollBy(0,200)", "");	 
	//action_obj.services_mainMenu().click();	System.out.println("1");
	//Thread.sleep(3000);
//	Assertion_obj.service_save_message_validation();	System.out.println("1");

}

//############################################################
//############################################################
///////////////////////////////////ADD NEW WATER SERVICE FOR USER///////////////////////////////////////////

@Test(priority = 2)
public void editGenericservice() throws InterruptedException, IOException{
	System.out.println("editGenericservice");
	
	//action_obj.search_field().sendKeys(cus);
	//System.out.println("1");
	//action_obj.search_button().click();
	//System.out.println("1");
	action_obj.services_mainMenu().click();
	JavascriptExecutor jse = (JavascriptExecutor)driver;	 
	jse.executeScript("window.scrollBy(0,500)", "");
	action_obj.generic_servic_search().sendKeys(de);
	Thread.sleep(3000);
 action_obj.generic_edit_button().click();
 action_obj.product_description().clear();
 action_obj.product_description().sendKeys("Gen Service elect qsqsqsq");
 action_obj.protata_date().click();
 action_obj.select_today_date().click();
	Thread.sleep(3000);
 action_obj.end_date().click();
 action_obj.next_button_calander().click();
 action_obj.next_button_calander().click(); 
 Thread.sleep(5000);
 //action_obj.select_update_end_date_as().click();
 
action_obj.quantity().clear();
Select mydrpdwn = new Select(action_obj.charge_typr_drop_drop());
action_obj.quantity().sendKeys("20");
 action_obj.rollup_desc().clear();
 
 
 action_obj.rollup_desc().sendKeys("rollup descript abdcaa");

mydrpdwn.selectByVisibleText("Account Level Charges");
 
Select mydrpdwn1 = new Select(action_obj.unit_type_drop());	 
action_obj.rate().clear();	 
action_obj.rate().sendKeys("100");	 
action_obj.notes().clear();	 
mydrpdwn1.selectByIndex(1); 

action_obj.notes().sendKeys("Editing Generic services ok"); 
 action_obj.updateSev().click();	 
 action_obj.ok().click();	 


    
}
//############################################################
//############################################################
@Test(priority = 3)
public void createCustElectrictyService() throws Exception{
	System.out.println("createCustElectrictyService");
	driver.navigate().refresh();
action_obj.overview_menu().click();


action_obj.electricity_plus_icon().click(); 
Assertion_obj.Electricity_service_page_header_validation(); 


 Select mydrpdwn = new Select(action_obj.plan_drop_down()); 
mydrpdwn.selectByVisibleText(electPlan);


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
//############################################################
//############################################################

@Test(priority = 4,dependsOnMethods="createCustElectrictyService")
public void editcreatedElectricity() throws Exception {
System.out.println("editcreatedElectricity");
//action_obj.services_mainMenu().click();

Assertion_obj.utilities_header_validation();
action_obj.electricity_edit_icon().click();
 
Select mydrpdwn1 = new Select(action_obj.plan_drop_down());
mydrpdwn1.selectByVisibleText("Electricity Residential plan");
 /////4,5
action_obj.threephase().sendKeys("YES");
 action_obj.kFactor().sendKeys("5");
 action_obj.gasCook().sendKeys("10");
action_obj.notes().sendKeys("Editing done");
jse.executeScript("window.scrollBy(0,1500)", "");

action_obj.save_changes().click();;

Thread.sleep(5000);
 action_obj.ok().click();
 
 Assertion_obj.service_save_message_validation();
 
 action_obj.set_pro_rata_button().click();
  //action_obj.ok().click();
 //action_obj.set_pro_rata_button().click();
 action_obj.proRataDate().click();
 
 action_obj.select_today_date().click();
 
action_obj.set_prorata_button_to_save().click();
 
 
action_obj.ok().click();
 
 action_obj.services_mainMenu().click(); 
  action_obj.electricity_moveout_button().click(); 
  Thread.sleep(700);
  jse.executeScript("window.scrollBy(0,1500)", "");
Thread.sleep(5000);
 action_obj.moveout_date().click(); 
 Thread.sleep(2500);

 action_obj.next_button_calander().click(); 
 Thread.sleep(2500);
 
// action_obj.next_button_calander().click(); 
// Thread.sleep(2000);

 action_obj.select_end_date_as().click(); 
 Thread.sleep(5000);

 
 action_obj.final_read_date().click(); 
 Thread.sleep(3000);
 
// action_obj.next_button_calander().click(); 
// Thread.sleep(5000);

 //action_obj.select_today_date().click(); 
 
 action_obj.select_end_date_as().click(); 
 Thread.sleep(2000);

 
 action_obj.final_rate().sendKeys("1000"); 
jse.executeScript("window.scrollBy(0,1500)", "");
//Change Meter
jse.executeScript("javascript:BtnActionChangeMeter('15260')", action_obj.changemeter_button());
action_obj.changemeter_notes().sendKeys("No reason, Only for testing purpose.");
action_obj.confirmChange().click();
Assertion_obj.change_meter_page_header_validation();
DateFormat dateFormat = new SimpleDateFormat("HHmmss");
Calendar cal = Calendar.getInstance();
System.out.println(dateFormat.format(cal.getTime()));
mno=cal.getTime().toString(); 
System.out.println(mno=mno.substring(11,19));
mno=mno.replaceAll(":","");
action_obj.newmeterno().sendKeys("NewEle"+mno);
jse.executeScript("window.scrollBy(0,1000)", "");
action_obj.create_service_button().click();
action_obj.ok().click();
action_obj.SearchUtility().sendKeys("NewEle"+mno);
////////////MoveOut

 action_obj.electricity_moveout_button().click(); 
 Thread.sleep(700);
 jse.executeScript("window.scrollBy(0,1500)", "");
Thread.sleep(5000);
action_obj.moveout_date().click(); 
Thread.sleep(2500);

action_obj.next_button_calander().click(); 
Thread.sleep(2500);

action_obj.next_button_calander().click(); 
Thread.sleep(2000);

action_obj.select_end_date_as().click(); 
Thread.sleep(2000);


action_obj.final_read_date().click(); 
Thread.sleep(3000);

//action_obj.next_button_calander().click(); 
//Thread.sleep(5000);

//action_obj.select_today_date().click(); 

action_obj.select_end_date_as().click(); 
Thread.sleep(2000);


action_obj.final_rate().sendKeys("1000"); 
jse.executeScript("window.scrollBy(0,1500)", "");



jse.executeScript("javascript:BtnActionMoveOut();", action_obj.continueMoveOut_button());   
   Thread.sleep(5000);

  Assertion_obj.utilities_header_validation(); 

}

@Test(priority = 5)
public void createWater() throws Exception {
	 
	//action_obj.logo_home().click();
	/*driver.navigate().refresh();
action_obj.customer_main_menu().click();
Select select = new Select(action_obj.Category_drop());
select.selectByVisibleText("Residential");

 action_obj.customer_F_name().sendKeys(ServiceMGT); 
action_obj.customer_sure_name().sendKeys("Parmar"); 
action_obj.cus_address1().sendKeys("345 street"); 
action_obj.toggle_button().click(); 
action_obj.Phone_Mobile().sendKeys("78898525"); 
JavascriptExecutor jse = (JavascriptExecutor)driver;	 
jse.executeScript("window.scrollBy(0,1500)", "");
action_obj.save_customer().click(); 

 action_obj.ok().click(); 
 
	action_obj.search_button().click();	 
	driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/thead/tr/th[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]/a")).click();
	Thread.sleep(2000);
	 */
	driver.navigate().refresh();
	Thread.sleep(2000);
action_obj.overview_menu().click(); 
Thread.sleep(2000);
action_obj.water_plus_icon().click(); 

Thread.sleep(2000);// sleep time
Assertion_obj.water_service_page_header_validation(); 

 Select mydrpdwn = new Select(action_obj.plan_drop_down()); 
mydrpdwn.selectByVisibleText(waterPlan); 
 

 Select mydrpdwn1 = new Select(action_obj.meterConfig_drop_down()); 
mydrpdwn1.selectByVisibleText("Flat Rate"); 
 


 

//***************Enter meter number under Add new water service page******************************************
DateFormat dateFormat = new SimpleDateFormat("HHmmss");
Calendar cal = Calendar.getInstance();
System.out.println(dateFormat.format(cal.getTime()));
wno=cal.getTime().toString(); 
System.out.println(wno=wno.substring(11,19));
wno=wno.replaceAll(":","");
Select mydrpdwn2 = new Select(action_obj.readding_drop_down()); 
mydrpdwn2.selectByVisibleText("Reads"); 

action_obj.meter_number().sendKeys("Water"+wno); 
JavascriptExecutor jse1 = (JavascriptExecutor)driver;	 
jse1.executeScript("window.scrollBy(0,1500)", "");
  
//WebElement  element = driver.findElement(By.xpath(".//*[text()=' Create service']"));
//create_service_button
action_obj.create_service_button().click() ;
 Thread.sleep(2000);
 action_obj.ok().click(); ;
 
 //Assertion_obj.utilities_header_validation();System.out.println("1");
 Assertion_obj.Overview_text_Validation(); 
 

}

//############################################################
//############################################################

@Test(priority = 6,dependsOnMethods="createWater")
public void editcreatedWaterservice() throws Exception{
System.out.println("editcreatedWaterservice");
action_obj.SearchUtility().sendKeys("water");
 action_obj.water_edit_icon().click();
 
 
// Plan didn't match with dropdown // If problem occurs then make plan with plan management class of same name.
 Select mydrpdwn1 = new Select(action_obj.plan_drop_down());
 
 
//If Gas service is available
// mydrpdwn1.selectByIndex(2);
//Else
mydrpdwn1.selectByVisibleText("Water Residential plan(Flat)");

 action_obj.walkOrder().clear();
action_obj.walkOrder().sendKeys("20");
// action_obj.meterSize().clear();
// action_obj.meterSize().sendKeys("5");
 action_obj.notes().sendKeys("Editing done");
 action_obj.save_changes().click();
 action_obj.ok().click();
 Assertion_obj.service_save_message_validation();
 action_obj.set_pro_rata_button().click();
 action_obj.proRataDate().click();
action_obj.select_today_date().click();
jse.executeScript("javascript:commitDate();", action_obj.set_prorata_button_to_save());
 
action_obj.ok().click();
 
Assertion_obj.water_service_details_validation();
 action_obj.services_mainMenu().click();
 
 action_obj.SearchUtility().sendKeys("water");
 Thread.sleep(2000);
 action_obj.moveout_water().click();
 Thread.sleep(2000);
 jse.executeScript("window.scrollBy(0,600)", "");
 Thread.sleep(800);
 action_obj.moveout_date().click(); 
 Thread.sleep(2500);

 action_obj.next_button_calander().click(); 
 Thread.sleep(2500);
 
 action_obj.next_button_calander().click(); 
Thread.sleep(2000);

 action_obj.select_end_date_as().click(); 
 Thread.sleep(2000);

 
 action_obj.final_read_date().click(); 
 Thread.sleep(3000);
 
 action_obj.next_button_calander().click(); 
 Thread.sleep(3000);

//action_obj.select_today_date().click(); 
// action_obj.next_button_calander().click(); 
 Thread.sleep(2500);
 action_obj.select_end_date_as().click(); 
 Thread.sleep(4000);

 action_obj.moveout_date().click();
// action_obj.select_moveout_date().click();
 Thread.sleep(1000);

 
 action_obj.final_rate().sendKeys("1000"); 
jse.executeScript("window.scrollBy(0,1500)", "");
//Change Meter
jse.executeScript("javascript:BtnActionChangeMeter('15260')", action_obj.changemeter_button());
action_obj.changemeter_notes().sendKeys("No reason, Only for testing purpose.");
action_obj.confirmChange().click();
Assertion_obj.change_wmeter_page_header_validation();
DateFormat dateFormat = new SimpleDateFormat("HHmmss");
Calendar cal = Calendar.getInstance();
System.out.println(dateFormat.format(cal.getTime()));
mno=cal.getTime().toString(); 
System.out.println(mno=mno.substring(11,19));
mno=mno.replaceAll(":","");
action_obj.newmeterno().sendKeys("NewWater"+mno);
jse.executeScript("window.scrollBy(0,1000)", "");
action_obj.create_service_button().click();
action_obj.ok().click();
action_obj.SearchUtility().sendKeys("NewWater"+mno);
////////////MoveOut

 action_obj.electricity_moveout_button().click(); 
 Thread.sleep(700);
 jse.executeScript("window.scrollBy(0,1500)", "");
Thread.sleep(5000);
action_obj.moveout_date().click(); 
Thread.sleep(2500);

action_obj.next_button_calander().click(); 
Thread.sleep(2500);

action_obj.next_button_calander().click(); 
Thread.sleep(2500);

action_obj.next_button_calander().click(); 
Thread.sleep(2000);

action_obj.next_button_calander().click(); 
Thread.sleep(2000);

action_obj.select_end_date_as().click(); 
Thread.sleep(2000);


action_obj.final_read_date().click(); 
Thread.sleep(3000);

action_obj.next_button_calander().click(); 
Thread.sleep(2000);
action_obj.next_button_calander().click(); 
Thread.sleep(2000);
action_obj.next_button_calander().click(); 
Thread.sleep(1000);
action_obj.next_button_calander().click(); 
Thread.sleep(1000);

//action_obj.select_today_date().click(); 

action_obj.select_end_date_as().click(); 
Thread.sleep(2000);


action_obj.final_rate().sendKeys("1000"); 
jse.executeScript("window.scrollBy(0,1500)", "");

Thread.sleep(3000);
action_obj.continueMoveOut_button().click() ;
 
 Assertion_obj.utilities_header_validation();
 
}
//############################################################
//############################################################



@Test(priority = 7)
public void createGas() throws Exception{
	action_obj.overview_menu().click();
	
	DateFormat dateFormat = new SimpleDateFormat("HHmmss");
	Calendar cal = Calendar.getInstance();
	System.out.println(dateFormat.format(cal.getTime()));
	gno=cal.getTime().toString(); 
	System.out.println(gno=gno.substring(11,19));
	gno=gno.replaceAll(":","");
	
	//Click on '+' icon with Gas
	action_obj.gas_plus_icon().click();
	//Assertion of Gas service hadder
	Assertion_obj.gas_service();
	//Select Gas Plan
	Select mydrpdwn = new Select(action_obj.select_plan()); 
	mydrpdwn.selectByVisibleText("Gas Flat Template Plan");
	//Enter meter no.
	action_obj.meter_number().sendKeys("Gas"+gno);
	//Meter Configuration
	Select mydrpdwn1 = new Select(action_obj.meterConfig_drop_down()); 
	mydrpdwn1.selectByVisibleText("Flat Rate");
	//Reading Type
	Select mydrpdwn2 = new Select(action_obj.readding_drop_down()); 
	mydrpdwn2.selectByVisibleText("Consumption");
	
	//Scroll
	JavascriptExecutor jse = (JavascriptExecutor)driver;	 
	jse.executeScript("window.scrollBy(0,800)", "");
	//Click on 'Create Service' button
	action_obj.create_service_button().click();
	action_obj.ok().click(); 
	
	Assertion_obj.utilities_header_validation();
	Assertion_obj.Overview_text_Validation();
	
}

@Test(priority = 8,dependsOnMethods="createGas")
public void editGasService() throws Exception{

	Assertion_obj.utilities_header_validation();
	Assertion_obj.Overview_text_Validation();
	System.out.println("Edit Gas Service");
	//Search Gas
	action_obj.SearchUtility().sendKeys("gas");
	//Gas Manage button
	action_obj.gas_edit_icon().click();
	action_obj.gas_Heating_Value().clear();
	action_obj.gas_Heating_Value().sendKeys("2.0");
	action_obj.gaspressurefactor().clear();
	action_obj.gaspressurefactor().sendKeys("2.0");
	JavascriptExecutor jse = (JavascriptExecutor)driver;	 
	jse.executeScript("window.scrollBy(0,800)", "");
	Thread.sleep(500);
	action_obj.gasnotes().sendKeys("Editing done");
	action_obj.save_changes().click();
	action_obj.ok().click(); 
	Assertion_obj.service_save_message_validation();
	 action_obj.services_mainMenu().click();
	//Search Gas
	action_obj.SearchUtility().sendKeys("gas");	
	action_obj.gasmoveout().click();
	
	 Thread.sleep(2000);
	 jse.executeScript("window.scrollBy(0,600)", "");
	 Thread.sleep(800);
	 action_obj.moveout_date().click(); 
	 Thread.sleep(2500);

	 action_obj.next_button_calander().click(); 
	 Thread.sleep(2500);
	 
//	 action_obj.next_button_calander().click(); 
//	 Thread.sleep(2000);

	 action_obj.select_end_date_as().click(); 
	 Thread.sleep(2000);

	 
	 action_obj.final_read_date().click(); 
	 Thread.sleep(3000);
	 action_obj.next_button_calander().click(); 
	 Thread.sleep(4500);
	 action_obj.select_end_date_as().click(); 
	 Thread.sleep(3000);

	 action_obj.moveout_date().click();
	 Thread.sleep(3000);
	 //action_obj.select_moveout_date().click();
	 
	 action_obj.final_rate().sendKeys("1000"); 
	jse.executeScript("window.scrollBy(0,1500)", "");
	//Change Meter
	jse.executeScript("javascript:BtnActionChangeMeter('15260')", action_obj.changemeter_button());
	action_obj.changemeter_notes().sendKeys("No reason, Only for testing purpose.");
	action_obj.confirmChange().click();
	Assertion_obj.change_gmeter_page_header_validation();
	DateFormat dateFormat = new SimpleDateFormat("HHmmss");
	Calendar cal = Calendar.getInstance();
	System.out.println(dateFormat.format(cal.getTime()));
	mno=cal.getTime().toString(); 
	System.out.println(mno=mno.substring(11,19));
	mno=mno.replaceAll(":","");
	action_obj.newmeterno().sendKeys("NewGas"+mno);
	jse.executeScript("window.scrollBy(0,1000)", "");
	action_obj.create_service_button().click();
	action_obj.ok().click();
	action_obj.SearchUtility().sendKeys("NewGas"+mno);
	////////////MoveOut

	 action_obj.electricity_moveout_button().click(); 
	 Thread.sleep(700);
	 jse.executeScript("window.scrollBy(0,1500)", "");
	Thread.sleep(5000);
	action_obj.moveout_date().click(); 
	Thread.sleep(2500);

	action_obj.next_button_calander().click(); 
	Thread.sleep(2500);
	
	action_obj.next_button_calander().click(); 
	Thread.sleep(2500);
	
	action_obj.next_button_calander().click(); 
	Thread.sleep(2000);

	action_obj.select_end_date_as().click(); 
	Thread.sleep(2000);


	action_obj.final_read_date().click(); 
	Thread.sleep(3000);

	action_obj.next_button_calander().click(); 
	Thread.sleep(2000);
//	 action_obj.next_button_calander().click(); 
//	 Thread.sleep(1000);
//	 action_obj.next_button_calander().click(); 
//	 Thread.sleep(1000);
//	 action_obj.next_button_calander().click(); 
//	 Thread.sleep(1000);
//	 action_obj.next_button_calander().click(); 
	 Thread.sleep(1000);
	 action_obj.next_button_calander().click(); 
	 Thread.sleep(1000);
	//action_obj.select_today_date().click(); 

	action_obj.select_end_date_as().click(); 
	Thread.sleep(2000);


	action_obj.final_rate().sendKeys("1000"); 
	jse.executeScript("window.scrollBy(0,1500)", "");


	 Thread.sleep(2000);
	action_obj.continueMoveOut_button().click() ;
	 
	 Assertion_obj.utilities_header_validation();
	//Thread.sleep(19456);
	
}

@Test(priority = 9)
public void importGenericService() throws Exception{
	
driver.navigate().refresh();
	String p=System.getProperty("user.dir")+"//TestData/genericServiceImportTemplate.csv";
	String col="Customer No,Product/Charge Description,Prorata Date,End Date,Quantity,Notes,Rollup Description,Unit,Rate,Is Once Off?,Charge Type";
	Date date;
	
	csv.Generic_service(p, col, customerNumber, "Car", "10/10/2016", "", 1, "This is just a test.", "Elec Rollup Description", "KW", 2, "No", "Electricity Charges");
	//csv.Generic_service(p, col, customerNumber, "Car", "10/10/2016", "", 1, "This is just a test.", "Elec Rollup Description", "KW", 2, "No", "Electricity Charges");

	action_obj.admin_mainMenu().click();
	Thread.sleep(3000);
	action_obj.Generic_service_under_import().click();
	action_obj.browse_button().click();
//	Thread.sleep(1000);
	Runtime.getRuntime().exec(System.getProperty("user.dir")+"//TestData/genericServiceImportTemplate.exe");
	Thread.sleep(8000);
	action_obj.description().sendKeys("csv file");
	
	Thread.sleep(8000);
	action_obj.Upload_btn().click();
	
	Thread.sleep(8000);
	 jse.executeScript("window.scrollBy(0,500)", "");
	 Thread.sleep(4000);
	action_obj.play_button().click();
	Thread.sleep(2000); // sleep time
	action_obj.ok().click();
	Thread.sleep(3000); // sleep time
	Assertion_obj.Import_Successful_validation();
	}

}


