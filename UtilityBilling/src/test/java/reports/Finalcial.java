package reports;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class Finalcial extends Sauce_Instance_Login_Test {
	
		Repo_Test action_obj;
	 	Assertion_Test Assertion_obj;
		JavascriptExecutor executor;
		String customerNumber;
		String name = "Lara Mark";

	@Test(priority = 0)
	public void create_customer_readings() throws Exception{
		
		System.out.println("...........................................ElectCreateCustomer_test class..................................................................");
		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);
		executor = (JavascriptExecutor) driver;
		action_obj.customer_main_menu().click();
		action_obj.customer_F_name().sendKeys(name);
		action_obj.customer_sure_name().sendKeys("Smith");
		Select select = new Select(action_obj.Category_drop());
		select.selectByVisibleText("Business");
		
		List<WebElement> oSize2 = select.getOptions();
		int iListSize2 = oSize2.size();
		for(int i =0; i < iListSize2 ; i++){
		String sValue = select.getOptions().get(i).getText();
		System.out.println(sValue);  
		}
		
		action_obj.cus_address1().sendKeys("Calle Ocho");
		action_obj.cus_address2().sendKeys("Miami");
		action_obj.billingState().sendKeys("FL");
		action_obj.toggle_button().click();
		action_obj.customer_country().sendKeys("US");
		action_obj.Phone_Mobile().sendKeys("78898525");
		Select select2 = new Select(action_obj.select_plan());
		select2.selectByVisibleText("Electricity Flat Template Plan");
		
		action_obj.Email().sendKeys("mr.vipulkkr@gmail.com");
		action_obj.BEmail().sendKeys("vipul.sharma@sqelabs.com");
		executor.executeScript("window,scrollBy(0,1800)", "");
		action_obj.save_customer().click();
		action_obj.ok().click();
		
		Assertion_obj.sucessfully_saved_customer_message_validation();
		customerNumber=driver.findElement(By.xpath(".//*[@id='nav']/div/div/div[1]/div[2]/div[1]/label/a")).getText();
		}
	
	@Test(priority = 1)
	public void Billing_summary_report() throws Exception
		{
//		driver.navigate().refresh();
		action_obj.reports().click();
		Assertion_obj.reportsname();
		action_obj.financialicon().click();
		Assertion_obj.financialpage();
		action_obj.billingsummaryreport().click();	
		Assertion_obj.bsrassert();
		}
	
	@Test(priority = 2)
	public void Rate_plan_summary() throws Exception{
		action_obj.reports().click();
		Assertion_obj.reportsname();
		action_obj.financialicon().click();
		Assertion_obj.financialpage();
		JavascriptExecutor jse = (JavascriptExecutor)driver;	 
		jse.executeScript("window.scrollBy(0,1000)", "");
		action_obj.rateplansummary().click();
		Assertion_obj.rateplanpage();	
		}
	
	@Test(priority = 3)
	public void Accounts_receivables_report() throws Exception{
		action_obj.reports().click();
		Assertion_obj.reportsname();
		action_obj.financialicon().click();
		Assertion_obj.financialpage();
		action_obj.arreport().click();
		action_obj.searcharr().sendKeys(name);
		String exname = action_obj.arrassert().getText();
		Assert.assertEquals(name, exname);
		}
}