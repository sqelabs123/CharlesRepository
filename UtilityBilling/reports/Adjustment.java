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

public class Adjustment extends Sauce_Instance_Login_Test{
	public static String customer ="21210";
	public static String stmt_NUm ="613";
	public static String t_Type ="Misc Credit";
	public static String date ="01 Sep 15";
	public static String post_code ="30096";
	public static String cus_name="Peter Andrews";
	public static String header="html/body/div[5]/div/div[2]/div[2]/div[2]/div[1]/h2";
		
	@Test(priority = 0)
	public void payment_for_report() throws InterruptedException, IOException
	{
		driver.findElement(By.id("btn_search")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]/a")).click();
			Thread.sleep(500);
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/div/div/ul/li[7]/a")).click();
			Thread.sleep(500);
			Select ttype = new Select(driver.findElement(By.id("tranType")));
			ttype.selectByVisibleText("Adjustment");
				Thread.sleep(500);
		driver.findElement(By.id("receiptEmail")).sendKeys("cverma28@gmail.com");
		Thread.sleep(500);
			driver.findElement(By.id("amount")).sendKeys("999");
		Thread.sleep(500);
			driver.findElement(By.id("tranDate")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tfoot/tr[1]/th")).click();
		Thread.sleep(500);
				driver.findElement(By.id("submitBtn")).click();
	}
	
		@Test(priority = 1 )
				public void click_reports_tab() throws InterruptedException, IOException
				{
				 				
				//Click on the Reports link
				driver.findElement(By.linkText("Reports")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Assertion to validate Reports page open up
				String Actualtext = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div/div[3]/div/div/div/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext, "Reports");
				System.out.print("\n assertion_method_ executed -> MAIN MENU "+Actualtext);
				
				//click on Adjustment under reports section
				driver.findElement(By.linkText("Adjustment")).click();
				Thread.sleep(1000);
				
				//Assertion to validate Adjustment Reports page open up under reports section
				String Actualtext1 = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td")).getText();
				Assert.assertEquals(Actualtext1, "Adjustment Reports");
				System.out.print("\n assertion_method_ executed 1) "+Actualtext1);	
				
				}
		
		@Test(priority = 2)
				public void Adjustment_Journal_By_Changes_Report() throws InterruptedException, IOException
				{
				//********************************************************************************************
				//Click on Adjustment Journal By Changes Report link
				driver.findElement(By.linkText("Adjustment Journal By Changes Report")).click();
				Thread.sleep(1000);



				//Assertion to validate Disconnects-New Connects And Other Changes Report page open up with all records 
				String Actualtext2 = driver.findElement(By.xpath(header)).getText();
				Assert.assertEquals(Actualtext2, "Disconnects-New Connects And Other Changes Report");
				System.out.print("\n assertion_method_ executed 1.1) "+Actualtext2);

				Select year = new Select(driver.findElement(By.name("year")));
				year.selectByIndex(0);
				Thread.sleep(1000);
				
				Select month = new Select(driver.findElement(By.name("monthNum")));
				month.selectByVisibleText("AUGUST");
				Thread.sleep(1000);
				//next button//
				
				//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);
				
			
				
				
				//Select "All" option from "record per page" drop down
				Select all = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all.selectByVisibleText("All");
				Thread.sleep(1000);
				
				//search the record
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);
				Assert.assertEquals(cno, driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
				Thread.sleep(3000);
				
//				driver.navigate().back();
				Thread.sleep(500);

				}
				
				
		@Test(priority = 3)
				public void Adjustment_Journal_By_Month_Report() throws InterruptedException, IOException
				{
					
					//click back button of web browser
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Adjustments.jsp");
					Thread.sleep(500);
									//****************************************************************************************************
				//Click on Adjustment Journal By Month Report List link
				driver.findElement(By.linkText("Adjustment Journal By Month Report")).click();
				Thread.sleep(1000);



				//Assertion to validate Adjustment Journal By Month Report page open up with all records 
				String Actualtext3 = driver.findElement(By.xpath(header)).getText();
				Assert.assertEquals(Actualtext3, "Adjustment Journal By Month Report");
				System.out.print("\n assertion_method_ executed 1.2) "+Actualtext3);
				

				Select year = new Select(driver.findElement(By.name("year")));
				year.selectByIndex(0);
				Thread.sleep(1000);
				
				Select month = new Select(driver.findElement(By.name("monthNum")));
				month.selectByVisibleText("AUGUST");
				Thread.sleep(1000);
				
				//nxt btn
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				 Thread.sleep(2000);
	
				//Select "All" option from "record per page" drop down
				Select all = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all.selectByVisibleText("All");
				Thread.sleep(1000);
				
				
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText();
				//search the record
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);
				Assert.assertEquals(cno, driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText());
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
				Thread.sleep(1000);					
				}	
}