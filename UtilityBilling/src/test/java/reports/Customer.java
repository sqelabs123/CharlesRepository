package reports;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class Customer extends Sauce_Instance_Login_Test {
	String cwlscustomer;
/*	
	@Test(priority = 0)
	public void Search_customer() throws InterruptedException
	{
		action_obj.search_list().click();
		Thread.sleep(500);
		action_obj.select_customer_address().click();
		action_obj.search_button().click();
		action_obj.custadd1().click();
		cno = action_obj.customerno().getText();
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		
		
		
		try {
			

			List<WebElement> x=driver.findElements(By.xpath(".//*[@id='textLifeSupport']/b"));
			Thread.sleep(1000);

			if(x.size()!=0){
				
			}
			else{
				
		
				Thread.sleep(1000);
				action_obj.settingstab().click();
		    executor.executeScript("window.scrollBy(0,800)", "");
	    	action_obj.enablelifesupport().click();
			Thread.sleep(2000);
			}	
	 		} catch (Exception e) {

		}
		
		
	/*	
	    if (!action_obj.lyfsprtalrt().isDisplayed())
	    {
	    	action_obj.settingstab().click();
		    executor.executeScript("window.scrollBy(0,800)", "");
	    	action_obj.enablelifesupport().click();
	    }	
	    
	    else
	    {
	    	System.out.println("Life support button is already enabled");
	    }
		*//*
		executor.executeScript("window.scrollBy(0,800)", "");
		action_obj.savesettings().click();
	}
	*/
	@Test(priority = 1)
	public void Customers_with_Life_Support() throws Exception
	{
		driver.navigate().refresh();
		action_obj.reports().click();
		Assertion_obj.reportsname();
		action_obj.customerreport().click();
		Assertion_obj.customerreportassert();
		action_obj.customerswithlifesupport().click();
		
		cwlscustomer = action_obj.getmtr().getText();
		action_obj.search_list().click();
		action_obj.search_list_customer().click();
		action_obj.search_field().sendKeys(cwlscustomer);
		action_obj.search_button().click();
		Assertion_obj.lyfsprtalrt();
		
	}
	
	@Test(priority = 2)
	public void Move_in_Move_Out_Report() throws Exception{
		driver.navigate().refresh();
		action_obj.reports().click();
		Assertion_obj.reportsname();
		action_obj.customerreport().click();
		Assertion_obj.customerreportassert();
		JavascriptExecutor jse =(JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,500)", "");
	    action_obj.moveinmoveoutreport().click();
	    Assertion_obj.moveinmoveoutassert();
	    action_obj.mwastartdate().click();
	    action_obj.mwastartdate().click();
		Thread.sleep(1500);
		action_obj.mwapre().click();
		Thread.sleep(1000);
		action_obj.mwapre().click();
		Thread.sleep(500);
		action_obj.sdate().click();
		Thread.sleep(1000);
		action_obj.mwaenddate().click();
		Thread.sleep(1500);
		action_obj.mwanxt().click();
		Thread.sleep(1000);
		action_obj.mwanxt().click();
		Thread.sleep(500);
		action_obj.sdate().click();
		Thread.sleep(1000);
		action_obj.mimornext().click();
		String minmtrno = action_obj.mimormtrno().getText();
		action_obj.search_list().click();
		action_obj.searchmtr().click();
		action_obj.search_field().sendKeys(minmtrno);
		action_obj.search_button().click();
		Thread.sleep(500);
		String abc = driver.findElement(By.xpath(".//*[@id='serviceEditPage']/div[1]/form/div[2]/div[2]/div[2]/div/div[1]/div/input[1]")).getText();
		System.out.println(abc);
		driver.findElement(By.xpath(".//*[@id='serviceEditPage']/div[1]/form/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[3]")).isDisplayed();
		
	}	
}
