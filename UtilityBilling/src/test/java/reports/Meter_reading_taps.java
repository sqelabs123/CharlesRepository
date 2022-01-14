package reports;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

public class Meter_reading_taps extends Sauce_Instance_Login_Test{
	Repo_Test action_obj;
	 Assertion_Test Assertion_obj;
		JavascriptExecutor executor;
		String customerNumber;
		String MtrNo4rpt;	

			@Test(priority = 1)
			public void create_customer_readings() throws Exception{
				
				System.out.println("...........................................ElectCreateCustomer_test class..................................................................");
				action_obj = new Repo_Test(driver);
				Assertion_obj = new Assertion_Test(driver);
				executor = (JavascriptExecutor) driver;
				action_obj.customer_main_menu().click();
				action_obj.customer_F_name().sendKeys("Johen");
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
				
			
				action_obj.overview_menu().click();
				action_obj.electricity_plus_icon().click(); 
				Assertion_obj.Electricity_service_page_header_validation(); 
				 Select mydrpdwn = new Select(action_obj.plan_drop_down()); 
				mydrpdwn.selectByVisibleText("Electricity Flat Template Plan");			///3
				String planNo=mydrpdwn.getFirstSelectedOption().getText();
				System.out.println(planNo);
				DateFormat dateFormat = new SimpleDateFormat("HHmmss");
				Calendar cal = Calendar.getInstance();
				System.out.println(dateFormat.format(cal.getTime()));
				String mno=cal.getTime().toString(); 
				System.out.println(mno=mno.substring(11,19));
				mno=mno.replaceAll(":","");
				action_obj.meter_number().sendKeys("Ele"+mno); 
				MtrNo4rpt="Ele"+mno;
				 Select mydrpdwn1 = new Select(action_obj.meterConfig_drop_down()); 
				mydrpdwn1.selectByVisibleText("Flat Rate"); 
				Thread.sleep(2000);
				executor=(JavascriptExecutor) driver;
				executor.executeScript("window.scrollBy(0,1000)", "");
				action_obj.toggle_button().click(); 
				Select mydrpdwn2 = new Select(action_obj.readding_drop_down()); 
				mydrpdwn2.selectByVisibleText("Reads"); 
				JavascriptExecutor jse = (JavascriptExecutor)driver;	 
				jse.executeScript("window.scrollBy(0,1500)", "");
				action_obj.create_service_button().click();
				 action_obj.ok().click(); 
				Assertion_obj.utilities_header_validation(); 
				 Assertion_obj.Overview_text_Validation(); 
				 
				 
				 
				 
				//@@@@@@@@@@@@@@@@@@@@@@@@ MTR READ 11111111111  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

					//meter read main menu
					action_obj.Meter_Reads_mainMenu().click();
					//select meter no for readSing
					Thread.sleep(3000);
					Select mydrpdwn2s = new Select(action_obj.MeterNoForMeterReading());
//					mydrpdwn2s.selectByIndex(1);
					
					mydrpdwn2s.selectByVisibleText("Ele"+mno);
					//validate view read text
					Assertion_obj.viewRead_Text_validation();
					//add read button
					action_obj.addReadButton().click();
					//validate add meter read text
					Assertion_obj.AddMeterReadPopupText_validation();
					//select reading type
					Select mydrpdwn25 = new Select(action_obj.readTypeDropDown());
					mydrpdwn25.selectByVisibleText("Initial");
//					String vali_str=mydrpdwn25.getFirstSelectedOption().getText();
					//select today date
					action_obj.Meter_readdate().click();
					action_obj.select_today_date().click();
					Thread.sleep(2000);
					//enter reading 
					action_obj.Meter_Read().sendKeys("100");
					//save read button
//					executor.executeScript("javascript:saveRead();",  action_obj.save_Read_button());
					action_obj.save_Read_button().click();
					//validate by read type text selected in dropdown
					//Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()="+vali_str+"'])[1]")).getText(),vali_str);
					//validate view read text
					Assertion_obj.viewRead_Text_validation();
					//@@@@@@@@@@@@@@@@@@@@@@@@ MTR READ 222222222222222222222222  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//					driver.navigate().refresh();
//					Thread.sleep(3000);
					Thread.sleep(500);
//					mydrpdwn2s.selectByIndex(1);
					
		 		    mydrpdwn2s.selectByVisibleText("Ele"+mno);
					//add read button
		 		    Thread.sleep(1000);
					action_obj.addReadButton().click();
					//validate add meter read popup message
					Assertion_obj.AddMeterReadPopupText_validation();
					//select read type
					Select mydrpdwn25a = new Select(action_obj.readTypeDropDown());
					mydrpdwn25a.selectByIndex(2);
//					String vali_str1=mydrpdwn25a.getFirstSelectedOption().getText();
					
					//click on merter read date field
					action_obj.Meter_readdate().click();
					//click on next button of calander
					action_obj.next_button_calander().click();
					//select any random date
					action_obj.select_end_date_as().click();
					//meter read enter
					action_obj.Meter_Read().sendKeys("500");
					//save read button
					action_obj.save_Read_button().click();
					//validate by read type text selected in dropdown
				//	Assert.assertEquals(driver.findElement(By.xpath("(.//*[text()="+vali_str1+"'])[1]")).getText(),vali_str1);
					//validate view read text
					Assertion_obj.viewRead_Text_validation();
					driver.navigate().refresh();

				
				
			}
	
			@Test(priority = 2)
		
			public void Meter_Reading_Sheet_Report() throws Exception{
				
				action_obj.reports().click();
				Assertion_obj.reportsname();
				action_obj.metersicon().click();
				Assertion_obj.meterspage();
				action_obj.meterreadingsheet().click();
				//select meter reading sheets
//				Select mydrpdown1 = new Select(action_obj.select_route());
//				mydrpdown1.selectByVisibleText("All");
				action_obj.nextbuttonmrs().click();
				action_obj.mrssearch().sendKeys(MtrNo4rpt);
				String mno= action_obj.mrsmeterno().getText();
				Assert.assertEquals(mno,MtrNo4rpt);
			}
		
			@Test(priority=3)
			public void Meter_Report() throws Exception{

			action_obj.search_list().click();
			Thread.sleep(500);
			action_obj.searchmtr().click();
			action_obj.search_button().click();
			action_obj.searchfield().sendKeys("water");
			String watermno = action_obj.watertext().getText();
			action_obj.reports().click();
			Assertion_obj.reportsname();
			action_obj.metersicon().click();
			Assertion_obj.meterspage();
			action_obj.meterreport().click();
			action_obj.mrssearch().sendKeys(watermno);
			String wmno = action_obj.watermnorpt().getText();
			Assert.assertEquals(watermno,wmno);
			
		}
							
			@Test(priority=4)
			public void meter_without_account() throws Exception{
				
				action_obj.reports().click();
				Assertion_obj.reportsname();
				action_obj.metersicon().click();
				Assertion_obj.meterspage();
				action_obj.meterwithoutacc().click();
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
				action_obj.nxtmwa().click();
				String mwamno = action_obj.getmtr().getText();
				action_obj.search_list().click();
				Thread.sleep(500);
				action_obj.searchmtr().click();
				action_obj.search_field().sendKeys(mwamno);
				action_obj.search_button().click();
				String status = action_obj.status().getText();
				Assert.assertEquals(status,"Date Disconnected");
				
				
				
				
				
				
			}
	
	
}
