package com.Utility.Bill.BillRunFirst;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;
import com.Utility.Bill.Re_Usable.Sauce_instance_Test;

public class ElectPlanMangement extends Sauce_Instance_Login_Test

//public class ElectPlanMangement extends Sauce_instance_Test 
{

	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;

	String[] animalsArray;
	@Test(priority = 0)
	public void clickPlans() throws Exception {

		action_obj=new Repo_Test(driver);
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
		///If Gas is available than
		mydrpdwn1.selectByIndex(3);
		///Else
		//		mydrpdwn1.selectByIndex(2);

		action_obj.planName().sendKeys("Water Residential plan(Flat)");
		action_obj.planStartDate().click();
		//action_obj.calanderPreviousButton().click();
		// action_obj.calanderPreviousButton().click();
		action_obj.select_today_date().click();
		action_obj.PlanEndDate().click();
		action_obj.select_today_date().click();
		/*Thread.sleep(2000);
action_obj.next_button_calander().click();
Thread.sleep(1000);
action_obj.next_button_calander().click();
Thread.sleep(1000);
action_obj.next_button_calander().click();  
Thread.sleep(2000);
action_obj.select_end_date_as().click();*/

		action_obj.addTrfBtn().click();
		action_obj.charge_desc().sendKeys("Usage charge");
		action_obj.rollup_desc().sendKeys("None");


		Thread.sleep(3000);
		Select mydrpdwn01 = new Select(action_obj.charge_type()); 
		mydrpdwn01.selectByVisibleText("Water Charges");
		Thread.sleep(3000);

		Select mydrpdwn02 = new Select(action_obj.method_type()); 
		mydrpdwn02.selectByVisibleText("Usage Flat Rate");
		Thread.sleep(3000);

		Select mydrpdwn03 = new Select(action_obj.unit_type()); 
		mydrpdwn03.selectByVisibleText("Kiloliter (kL)");

		action_obj.rate().sendKeys("65");
		//comment change 
		//action_obj.toggle_button().click();
		//	Select taxtype1=new Select(action_obj.taxTypeplan());
		//	taxtype1.selectByVisibleText("0 - No Tax (Default)");
		action_obj.updateTerifButton().click();


		Thread.sleep(1500);
		action_obj.PublicshButton().click();
		Thread.sleep(8000);
		String Actualtext01 = action_obj.getplanNameon_popup().getText();
		Assert.assertEquals(Actualtext01, "Water Residential plan(Flat)");
		action_obj.X().click();

		//	action_obj.searchPlanField().sendKeys("Gas Flat Template Plan");
		//	Assertion_obj.Plan_ID();

		System.out.println("--------------0");
	}

	@Test(priority = 1)
	public void addTarifPlans() throws Exception {

		 //action_obj.plan_mainmebu().click();
		driver.navigate().refresh();
		action_obj.createNewPlan().click();
		Assertion_obj.RatePlansPage_Title_assertion();

		Select mydrpdwn = new Select(action_obj.planGroup()); 
		mydrpdwn.selectByIndex(0);

		Select mydrpdwn1 = new Select(action_obj.planUsageType()); 
		mydrpdwn1.selectByVisibleText("Retail Electricity");
		action_obj.planName().sendKeys("Electricity Residential plan");
		action_obj.planStartDate().click();
		//action_obj.calanderPreviousButton().click();
		//action_obj.calanderPreviousButton().click();
		action_obj.select_today_date().click();
		//driver.findElement(By.xpath(".//*[text()='1']")).click();

		action_obj.PlanEndDate().click();

		action_obj.select_today_date().click();
		//Thread.sleep(2000);
// action_obj.next_button_calander().click();
// Thread.sleep(1000);
// action_obj.next_button_calander().click();
 //Thread.sleep(1000);
// action_obj.next_button_calander().click();  
// Thread.sleep(2000);
// action_obj.select_end_date_as().click();

		action_obj.addTrfBtn().click();
		action_obj.charge_desc().sendKeys("Usage charge");
		action_obj.rollup_desc().sendKeys("None");


		Thread.sleep(3000);
		Select mydrpdwn01 = new Select(action_obj.charge_type()); 
		mydrpdwn01.selectByVisibleText("Electricity Charges");
		Thread.sleep(3000);

		Select mydrpdwn02 = new Select(action_obj.method_type()); 
		mydrpdwn02.selectByVisibleText("Usage Flat Rate");
		Thread.sleep(5000);

		Select mydrpdwn03 = new Select(action_obj.unit_type()); 
		mydrpdwn03.selectByIndex(3);	//if fail change with "Kilowatt Hour
		action_obj.rate().sendKeys("65");
		// comments  for change text field replace from toggle button
		//	action_obj.toggle_button().click();   
		//	Select taxtype1=new Select(action_obj.taxTypeplan());
		//	taxtype1.selectByVisibleText("0 - No Tax (Default)");
		action_obj.updateTerifButton().click(); 


	}
	@Test(priority = 2)
	public void addTarifMonthly() throws InterruptedException {
		 Thread.sleep(1000);
		action_obj.addTrfBtn().click();
		action_obj.charge_desc().sendKeys("monthly administration fee");
		action_obj.rollup_desc().sendKeys("None");

		Thread.sleep(3000);

		Select mydrpdwn01 = new Select( action_obj.charge_type()); 
		mydrpdwn01.selectByVisibleText("Electricity Charges");
		Thread.sleep(3000);

		Select mydrpdwn02 = new Select(action_obj.method_type()); 
		mydrpdwn02.selectByVisibleText("Usage Tiered Monthly");
		Thread.sleep(5000);

		Select mydrpdwn03 = new Select(action_obj.unit_type()); 
		mydrpdwn03.selectByIndex(3);
		//mydrpdwn03.selectByVisibleText("Kilowatt Hour (kWh)");   //If fail then use upper
		//comments for dropdown replce from toggle button 	
		//action_obj.toggle_button().click();

		//select tax type 
		//	Select taxtype2=new Select(action_obj.taxTypeplan());
		//	taxtype2.selectByVisibleText("0 - No Tax (Default)");	

		action_obj.rateonmonthlyTeriff().sendKeys("10");
		action_obj.from().sendKeys("100");
		action_obj.to().sendKeys("1000");
		action_obj.addRangeBtn().click();
		action_obj.updateTerifButton().click();
		 

	}	 
	///////////////////////////////////////////////////////////////////////////////////////////////	 
	@Test(priority = 3)
	public void addTarifConnectionFee() throws InterruptedException {	 
		 	Thread.sleep(5000);	
		action_obj.addTrfBtn().click();

		action_obj.charge_desc().sendKeys("Connection Fee");
		action_obj.rollup_desc().sendKeys("None");
		Thread.sleep(3000);

		Select mydrpdwn01 = new Select(action_obj.charge_type()); 
		mydrpdwn01.selectByVisibleText("Account Level Charges");

		Thread.sleep(5000); // sleep time
		Select mydrpdwn02 = new Select(action_obj.method_type()); // Click with ctrl on method type
		//mydrpdwn02.selectByVisibleText("Access Fee");
		mydrpdwn02.selectByVisibleText("Access Fee Per Day");
		Thread.sleep(3000);

		Select mydrpdwn03 = new Select(action_obj.unit_type()); 
		mydrpdwn03.selectByVisibleText("Month");
		action_obj.rate().sendKeys("60");
		// changes in new build dropdown fields rplece from toggle button
		// action_obj.toggle_button().click();
		//	Select taxtype3=new Select(action_obj.taxTypeplan());
		//	taxtype3.selectByVisibleText("0 - No Tax (Default)");

		action_obj.updateTerifButton().click();
		Thread.sleep(700);
		action_obj.PublicshButton().click();
		//String Actualtext1 = action_obj.getplanNameon_popup().getText();
		//Assert.assertEquals(Actualtext1, "Connection Fee");
		Thread.sleep(5000);
		action_obj.X().click();
		//			Thread.sleep(5000);
		Thread.sleep(3000); 
		//			driver.findElement(By.xpath(".//*[@id='datatablePlnList']/thead/tr/th[1]")).click();
		//			Thread.sleep(3000);
		//	String Actualtext2 = action_obj.planNameonPlanPage().getText();
		//	Assert.assertEquals(Actualtext2, "Electricity Residential plan");
		//	Assert.assertEquals(Actualtext2, "Electricity Residential plan");
	}

	@Test(priority = 4)
	public void addCommericalPlan() throws Exception {	
	    
		action_obj=new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		action_obj.createNewPlan().click();
		Assertion_obj.RatePlansPage_Title_assertion();
		Thread.sleep(3000);

		Select mydrpdwn = new Select(action_obj.planGroup()); 
		mydrpdwn.selectByIndex(0);
		Thread.sleep(3000);

		Select mydrpdwn1 = new Select(action_obj.planUsageType()); 
		mydrpdwn1.selectByVisibleText("Retail Electricity");
		action_obj.planName().sendKeys("Commercial plan");
		action_obj.planStartDate().click();
		// action_obj.calanderPreviousButton().click();
		//action_obj.calanderPreviousButton().click();
		action_obj.select_today_date().click();

		action_obj.PlanEndDate().click();

		action_obj.select_today_date().click();

		// Thread.sleep(2000);
		//action_obj.next_button_calander().click();
		// Thread.sleep(1000);
		// action_obj.next_button_calander().click();
		// Thread.sleep(1000);
		// action_obj.next_button_calander().click();  
		// Thread.sleep(2000);
		// action_obj.select_end_date_as().click();

		action_obj.addTrfBtn().click();
		action_obj.charge_desc().sendKeys("Usage commerical");
		action_obj.rollup_desc().sendKeys("None");

		Thread.sleep(3000);

		Select mydrpdwn01 = new Select(action_obj.charge_type()); 
		mydrpdwn01.selectByVisibleText("Electricity Charges");		Thread.sleep(3000);

		Select mydrpdwn02 = new Select(action_obj.method_type()); 
		mydrpdwn02.selectByVisibleText("Usage Peak");
		Thread.sleep(3000);
		Select allocation1= new Select(action_obj.AllocationDropdownonTariffpopup());
		allocation1.selectByIndex(1);
		Thread.sleep(2000);
        			
		Select mydrpdwn03 = new Select(action_obj.unit_type()); 
		//		mydrpdwn03.selectByVisibleText("Kilowatt Hour (kWh)");
		mydrpdwn03.selectByIndex(3); //if upper one is fail
		action_obj.rate().sendKeys("85");
		//comment for change dropdown text fields rplece from toggle button
		//action_obj.toggle_button().click();

		//	Select taxtype4=new Select(action_obj.taxTypeplan());
		//	taxtype4.selectByVisibleText("0 - No Tax (Default)");

		action_obj.updateTerifButton().click();
		
		//action_obj.PublicshButton().click();
		Thread.sleep(3000);
		//action_obj.X().click(); 
 
	}
	@Test(priority = 5)
	public void addMontlyPlan() throws InterruptedException, IOException {	
		
		
		Thread.sleep(1000);
		action_obj.addTrfBtn().click();
		action_obj.charge_desc().sendKeys("monthly administration");
		action_obj.rollup_desc().sendKeys("None");		Thread.sleep(3000);
		Thread.sleep(3000);

		Select mydrpdwn01 = new Select( action_obj.charge_type()); 
		mydrpdwn01.selectByVisibleText("Electricity Charges");		Thread.sleep(3000);

		Select mydrpdwn02 = new Select(action_obj.method_type()); 
		mydrpdwn02.selectByVisibleText("Usage Tiered Monthly");		Thread.sleep(3000);
        
		Thread.sleep(3000);
		Select allocation1= new Select(action_obj.AllocationDropdownonTariffpopup());
		allocation1.selectByIndex(1);
		Thread.sleep(2000);

		Select mydrpdwn03 = new Select(action_obj.unit_type()); 
		mydrpdwn03.selectByIndex(1);
		//	 comment for dropdown fields replace from toggle button
		//action_obj.toggle_button().click();
		//	Select taxtype1=new Select(action_obj.taxTypeplan());
		//	taxtype1.selectByVisibleText("0 - No Tax (Default)");

		action_obj.rateonmonthlyTeriff().sendKeys("20");
		action_obj.from().sendKeys("100");
		action_obj.to().sendKeys("1000");
		action_obj.addRangeBtn().click();
		action_obj.updateTerifButton().click();
		
//		action_obj.PublicshButton().click();
//		Thread.sleep(3000);
//		action_obj.X().click(); 

  
	}
	@Test(priority = 6)
	public void addConnectionPlan() throws InterruptedException, IOException {	
	 
//		action_obj=new Repo_Test(driver);
//		Assertion_obj = new Assertion_Test(driver);
		Thread.sleep(5000);
		action_obj.addTrfBtn().click();
		action_obj.charge_desc().sendKeys("Connection Fee");
		action_obj.rollup_desc().sendKeys("None");		Thread.sleep(3000);

		Select mydrpdwn01 = new Select(action_obj.charge_type()); 
		mydrpdwn01.selectByVisibleText("Account Level Charges");		Thread.sleep(3000);

		Select mydrpdwn02 = new Select(action_obj.method_type()); 
		// mydrpdwn02.selectByVisibleText("Access Fee");
		mydrpdwn02.selectByVisibleText("Access Fee Per Day");
		Thread.sleep(3000);
		Select allocation1= new Select(action_obj.AllocationDropdownonTariffpopup());
		allocation1.selectByIndex(1);
		Thread.sleep(2000);

		Select mydrpdwn03 = new Select(action_obj.unit_type()); 
		mydrpdwn03.selectByVisibleText("Month");
		action_obj.rate().sendKeys("100");
		//comment for changes under dropdwon field replace from toggle button
		// Select taxtype1=new Select(action_obj.taxTypeplan());
		// taxtype1.selectByVisibleText("0 - No Tax (Default)");
		//comment for toggle button
		// action_obj.toggle_button().click();


		action_obj.updateTerifButton().click();
		Thread.sleep(500);
		action_obj.PublicshButton().click();
		Thread.sleep(3000);
		action_obj.X().click(); 

	}
	@Test(priority = 7)
	public void editRatePlan_WithAllocaionBucket() throws InterruptedException, IOException {
		action_obj=new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		
		Thread.sleep(3000);
		
	 	action_obj.plan_mainmebu().click();
		Thread.sleep(2000);
		//  action_obj.searchPlanField().sendKeys(animalsArray[1]);	

		Thread.sleep(2000);

		action_obj.PlanEditIcon().click();	
		Thread.sleep(3000);

		action_obj.TarifEditIcon().click();
		
		Thread.sleep(3000);
		Select allocation1= new Select(action_obj.AllocationDropdownonTariffpopup());
		allocation1.selectByIndex(1);
		Thread.sleep(2000);
		action_obj.rate().clear();
		action_obj.rate().sendKeys("50");
		Thread.sleep(2000);

		action_obj.updateTerifButton().click();	Thread.sleep(2000);

		String Actualtext2 =  action_obj.getPlanUpdateRate().getText();
		Assert.assertEquals(Actualtext2, "$50.000000");

		action_obj.PublicshButton().click();
		action_obj.X().click();

		driver.navigate().refresh(); 

	} 

	@Test(priority=8)
	public void Add_AllocationBucket_inPlansTariff() throws Exception
	{
		action_obj=new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		Thread.sleep(6000);
		action_obj.SearchPlan_Input().sendKeys("Commercial plan");
		Thread.sleep(3000);
		action_obj.PlanEditIcon().click();	
		Thread.sleep(3000);
		//action_obj.Edit_Search_Plan().click();
		action_obj.AddTariffButton().click();
		//add Electric Discount
		action_obj.charge_desc().sendKeys("Electric Discount");
		action_obj.rollup_desc().sendKeys("None");
		Thread.sleep(3000);
		Select allocation1= new Select(action_obj.AllocationDropdownonTariffpopup());
		allocation1.selectByIndex(1);
		Thread.sleep(3000);
		Select mydrpdwn01 = new Select(action_obj.charge_type()); 
		mydrpdwn01.selectByVisibleText("Electricity Charges");
		Thread.sleep(3000);

		Select mydrpdwn02 = new Select(action_obj.method_type()); 
		mydrpdwn02.selectByVisibleText("Usage Flat Rate");
		Thread.sleep(5000);

		Select mydrpdwn03 = new Select(action_obj.unit_type()); 
		mydrpdwn03.selectByIndex(3);	//if fail change with "Kilowatt Hour
		action_obj.rate().sendKeys("10");

		action_obj.updateTerifButton().click();
		Thread.sleep(5000);
		action_obj.PublicshButton().click();
		action_obj.X().click();

		driver.navigate().refresh(); 

	}
	@Test(priority=9)
	public void autogenrate_Four_plans() throws Exception {

		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);

		//plan_mainmebu click 
		action_obj.plan_mainmebu().click();
		//find autogenrated plans 
		WebElement searchplan=action_obj.SearchPlan();
		searchplan.clear();
		searchplan.sendKeys("autogenerated");
		Thread.sleep(2000);
		// gass plan Search 
		WebElement searchplan1=action_obj.SearchPlan();
		searchplan1.clear();
		searchplan1.sendKeys("Gas Flat Template Plan");
		Thread.sleep(2000);

		Assertion_obj.GasPlan();

		// peak,off Peak, Shoulder plan Search 
		WebElement searchplan2=action_obj.SearchPlan();
		Thread.sleep(2000);
		searchplan2.clear();
		searchplan2.sendKeys("Electricity Peak/Off Peak/Shoulder Template Plan");
		Thread.sleep(2000);
		Assertion_obj.peak_ofpeak_Elec1();
		//Electricity plan
		WebElement searchplan3=action_obj.SearchPlan();
		searchplan3.clear();
		searchplan3.sendKeys("Electricity Flat Template Plan");
		Thread.sleep(2000);
		Assertion_obj.ElectricityPlan_Elec2();
		//Water plan
		WebElement searchplan4=action_obj.SearchPlan();
		searchplan4.clear();
		searchplan4.sendKeys("Water Flat Template Plan");
		Thread.sleep(2000);

		Assertion_obj.waterplan();

	}

 
}
