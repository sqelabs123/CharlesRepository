package reports;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Re_usable.Sauce_Instance_Login_Test;

public class Meter_reading_taps extends Sauce_Instance_Login_Test{
	public static String customer ="21000";
	public static String header="html/body/div[5]/div/div[2]/div[2]/div[2]/div[1]/h2";
	public static String cus_name="Vicky Singhania";
	

	
	
				@Test(priority = 0)
				public void click_reports_tab() throws InterruptedException, IOException
				{
				 				
				//Click on the Reports link
				driver.findElement(By.linkText("Reports")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Assertion to validate Reports page open up
				String Actualtext = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div/div[3]/div/div/div/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext, "Reports");
				System.out.print("\n assertion_method_ executed -> MAIN MENU "+Actualtext);
				
				//click on Meter, Readings, Taps under reports section
				driver.findElement(By.linkText("Meters")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Meter, Reading, Taps Reports page open up under reports section
				String Actualtext1 = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td")).getText();
				Assert.assertEquals(Actualtext1, "Meter, Reading, Taps Reports");
				System.out.print("\n assertion_method_ executed 1) "+Actualtext1);	
				
				}
				@Test(priority = 1)
				public void Meter_Reading_Sheet() throws InterruptedException, IOException
				{
				//********************************************************************************************
				//Click on Meter Reading Sheet link
				driver.findElement(By.linkText("Meter Reading Sheet")).click();
				Thread.sleep(2000);
				


				//Assertion to validate Meter Reading Sheets Report page open up with all records 
				String Actualtext2 = driver.findElement(By.xpath(header)).getText();
				Assert.assertEquals(Actualtext2, "Meter Reading Sheets Report");
				System.out.print("\n assertion_method_ executed 1.1) "+Actualtext2);

				Select f_mtr = new Select(driver.findElement(By.name("meterFirst")));
				f_mtr.selectByIndex(1);
				Thread.sleep(2000);
				
				Select l_mtr = new Select(driver.findElement(By.name("meterLast")));
				l_mtr.selectByVisibleText("3177");
				Thread.sleep(2000);
				
			Select def1 = new Select(driver.findElement(By.name("UserDef1")));
				def1.selectByIndex(0);
				Thread.sleep(2000);
				
				Select def2 = new Select(driver.findElement(By.name("UserDef2")));
				def2.selectByIndex(0);
				Thread.sleep(2000);
				
				
				//nxt
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);
				
				
				
				//Select "All" option from "record per page" drop down
				Select all = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all.selectByVisibleText("All");
				Thread.sleep(2000);
				
				//search the record
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys(cus_name);
			Thread.sleep(2000);
				
				//download CSV file
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
				Thread.sleep(5000);
				
		
			
				}
				
				
		@Test(priority = 2)
				public void Meter_Reading_Sheet_with_Peak_Off_Peak_Shoulder() throws InterruptedException, IOException
				{
				//click back button of web browser
				driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_MeterReadingsTaps.jsp");
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[4]/td[1]")).click();	
				Thread.sleep(500);
				String Actualtext2 = driver.findElement(By.xpath(header)).getText();
				Assert.assertEquals(Actualtext2, "Meter Reading Sheet with Peak, Off Peak, Shoulder Report");
				}
				
		@Test(priority = 3)
				public void Prepaid_Tokens() throws InterruptedException, IOException
				{
				//click back button of web browser
				driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_MeterReadingsTaps.jsp");
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[5]/td[1]/a")).click();	
				Thread.sleep(500);
				String Actualtext2 = driver.findElement(By.xpath(header)).getText();
				Assert.assertEquals(Actualtext2, "Prepaid Tokens Report");
				}
				
}
