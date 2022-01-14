package reports;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Re_usable.Sauce_Instance_Login_Test;

public class Statement extends Sauce_Instance_Login_Test {

	
	public static String t_Type ="Misc Credit";
	public static String date ="01 Sep 15";
	public static String post_code ="30096";
	public static String cus_name="Peter Andrews";
	
	
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
				
				//click on Customer under reports section
				driver.findElement(By.linkText("Statement")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Customer page open up under reports section
				String Actualtext1 = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td")).getText();
				Assert.assertEquals(Actualtext1, "Statement Reports");
				System.out.print("\n assertion_method_ executed 1) "+Actualtext1);	
				}
				
				@Test(priority = 1)
				public void Meter_Usage_Supply_Charges() throws InterruptedException, IOException
				{
					//********************************************************************************************
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
					Thread.sleep(500);
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollBy(0,500)", "");
					Thread.sleep(500);
					driver.findElement(By.linkText("Meter Usage & Supply Charges")).click();
					Thread.sleep(1000);
				
					
					//Assertion to validate SMeter Usage & Supply Charges page open up with all records 
					String Actualtext2 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
					Assert.assertEquals(Actualtext2, "Meter Usage and Supply Charges Report");
					System.out.print("\n assertion_method_ executed 1.5) "+Actualtext2);
					

					Select stmt_no = new Select(driver.findElement(By.name("stmt_no")));
					stmt_no.selectByIndex(6);
					Thread.sleep(2000);
					
					 WebElement element = driver.findElement(By.tagName("a"));
					 JavascriptExecutor executor = (JavascriptExecutor)driver;
					 executor.executeScript("javascript:getReport();", element);
					Thread.sleep(1000);
																			
					//Select "All" option from "record per page" drop down
					Select all4 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
					all4.selectByVisibleText("All");
					Thread.sleep(2000);
					
					String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText();
					//search the record
					driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
					Thread.sleep(1000);
					Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText());
					//download CSV file
					driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
										
				}
				
//sale reports
				@Test(priority = 2)
				public void Sales_Report_Monthly_RM() throws InterruptedException, IOException
				{
				//********************************************************************************************
				//Click on Sent Email History link
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
					Thread.sleep(500);
				driver.findElement(By.linkText("Sales Report - Monthly RM")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Active customer page open up with all records 
				String Actualtext2 = driver.findElement(By.tagName("h2")).getText();
				Assert.assertEquals(Actualtext2, "Sales - Monthly RM Report");
				}
				
				@Test(priority = 3)
				public void Sales_Report_Monthly_RM_and_Unit() throws InterruptedException, IOException
				{
				//********************************************************************************************
				//Click on Sent Email History link
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
					Thread.sleep(500);
				driver.findElement(By.linkText("Sales Monthly RM and Unit Report")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Active customer page open up with all records 
				String Actualtext2 = driver.findElement(By.tagName("h2")).getText();
				Assert.assertEquals(Actualtext2, "Sales Report Monthly RM and Unit Report");
				}
				
				@Test(priority = 4)
				public void Sales_Report_Monthly_Unit() throws InterruptedException, IOException
				{
				//********************************************************************************************
				//Click on Sent Email History link
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
					Thread.sleep(500);
				driver.findElement(By.linkText("Sales Monthly Unit Report")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Active customer page open up with all records 
				String Actualtext2 = driver.findElement(By.tagName("h2")).getText();
				Assert.assertEquals(Actualtext2, "Sales_Report_Monthly_Unit");
				}
				
				@Test(priority = 5)
				public void Sales_Report_Year_to_Date_RM() throws InterruptedException, IOException
				{
				//********************************************************************************************
				//Click on Sent Email History link
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
					Thread.sleep(500);
				driver.findElement(By.linkText("Sales Report Year to Date RM")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Active customer page open up with all records 
				String Actualtext2 = driver.findElement(By.tagName("h2")).getText();
				Assert.assertEquals(Actualtext2, "Sales Year to Date RM Report");
				}
				
				@Test(priority = 6)
				public void Sales_Report_Year_to_Date_RM_and_unit() throws InterruptedException, IOException
				{
				//********************************************************************************************
				//Click on Sent Email History link
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
					Thread.sleep(500);
				driver.findElement(By.linkText("Sales Report - Year to Date RM and Unit")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Active customer page open up with all records 
				String Actualtext2 = driver.findElement(By.tagName("h2")).getText();
				Assert.assertEquals(Actualtext2, "Sales Report - Year to Date RM and Unit Report");
				}
				
				@Test(priority = 7)
				public void Sales_Report_Year_to_Date_RM_and_Unit() throws InterruptedException, IOException
				{
				//********************************************************************************************
				//Click on Sent Email History link
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
					Thread.sleep(500);
				driver.findElement(By.linkText("Sales Report - Year to Date RM and Unit")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Active customer page open up with all records 
				String Actualtext2 = driver.findElement(By.tagName("h2")).getText();
				Assert.assertEquals(Actualtext2, "Sales - Year to Date RM and Unit Report");
				}
				
				@Test(priority = 8)
				public void Sales_Report_Year_to_Date_Unit() throws InterruptedException, IOException
				{
				//********************************************************************************************
				//Click on Sent Email History link
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
					Thread.sleep(500);
				driver.findElement(By.linkText("Sales Report - Year to Date Unit")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Active customer page open up with all records 
				String Actualtext2 = driver.findElement(By.tagName("h2")).getText();
				Assert.assertEquals(Actualtext2, "Sales - Year to Date Unit Report");
				}
				
				@Test(priority = 9)
				public void Sent_Email_History() throws InterruptedException, IOException
				{
				//********************************************************************************************
				//Click on Sent Email History link
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
					Thread.sleep(500);
				driver.findElement(By.linkText("Sent Email History")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Active customer page open up with all records 
				String Actualtext2 = driver.findElement(By.tagName("h2")).getText();
				Assert.assertEquals(Actualtext2, "Send Email History");
				System.out.print("\n assertion_method_ executed 1.1) "+Actualtext2);
				
				Select stmt_no = new Select(driver.findElement(By.name("stmtno")));
				stmt_no.selectByIndex(1);
				Thread.sleep(2000);
				
				Select type = new Select(driver.findElement(By.name("msgType")));
				type.selectByVisibleText("Invoice");
				Thread.sleep(2000);
				
				Select status = new Select(driver.findElement(By.name("sendStatus")));
				status.selectByVisibleText("Success");
				Thread.sleep(2000);
				
				
				//select start date
				driver.findElement(By.id("sendStartDate")).click();
				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[1]/td[2]")).click();
				
				//select end date
				driver.findElement(By.id("sendEndDate")).click();
				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[6]/td[7]")).click();
			
				//nxt
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);
				

				//Select "All" option from "record per page" drop down
				Select all2 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all2.selectByVisibleText("All");
				Thread.sleep(2000);
				
				
				//search the record
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys("21068");
				Thread.sleep(1000);		
//assertion require
				//download CSV file
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
				Thread.sleep(5000);
				
				
	
				}
				
				
				
				@Test(priority = 10)
				public void Statement_Breakdown_By_Customer() throws InterruptedException, IOException
				{
					Thread.sleep(500);
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
					Thread.sleep(500);
				//********************************************************************************************
				//Click on Electricity Statement Breakdown by Customer link
				driver.findElement(By.linkText("Statement Breakdown By Customer")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Electricity Statement Breakdown by Customer Report page open up with all records 
				String Actualtext2 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext2, "Electricity Statement Breakdown by Customer Report");
				System.out.print("\n assertion_method_ executed 1.2) "+Actualtext2);
				
				Select stmt_no = new Select(driver.findElement(By.name("stmt_no")));
				stmt_no.selectByIndex(6);
				Thread.sleep(2000);
				
			
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);
				
				
			
				
				//Select "All" option from "record per page" drop down
				Select all4 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all4.selectByVisibleText("All");
				Thread.sleep(2000);
				
				//search the record
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[2]")).getText();
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[2]")).getText());
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
				

			
				
				}
				
				
				@Test(priority = 11)
				public void Statement_Detail() throws InterruptedException, IOException
				{
				//********************************************************************************************
					Thread.sleep(500);
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
				//Click on Statement Detail link
				driver.findElement(By.linkText("Statement Detail")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Statement Details Report page open up with all records 
				String Actualtext2 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext2, "Statement Details Report");
				System.out.print("\n assertion_method_ executed 1.3) "+Actualtext2);
				
				Select stmt_no = new Select(driver.findElement(By.name("stmt_no")));
				stmt_no.selectByIndex(6);
				Thread.sleep(2000);
				
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);
				
				
			
				
				//Select "All" option from "record per page" drop down
				Select all4 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all4.selectByVisibleText("All");
				Thread.sleep(2000);
				
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText();
				//search the record
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(2000);
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText());
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
											
				}
				
				@Test(priority = 12)
				public void Statement_Details_With_Alternative_ID_Report() throws InterruptedException, IOException
				{
				//********************************************************************************************
					Thread.sleep(500);
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
				//Click on Statement Detail link
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollBy(0,500)", "");
					Thread.sleep(500);
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[13]/td[1]/a")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Statement Details Report page open up with all records 
				String Actualtext2 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext2, "Statement Details With Alternative ID Report");
				System.out.print("\n assertion_method_ executed 1.3) "+Actualtext2);
				
				Select stmt_no = new Select(driver.findElement(By.name("stmt_no")));
				stmt_no.selectByIndex(6);
				Thread.sleep(2000);
				
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);
				
				
			
				
				//Select "All" option from "record per page" drop down
				Select all4 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all4.selectByVisibleText("All");
				Thread.sleep(1000);
				
				//search the record
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText();
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText());
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
											
				}
// Statement of GST Report		
				@Test(priority = 13)
				public void Statement_of_GST_Report() throws InterruptedException, IOException
				{
				//********************************************************************************************
				//Click on Sent Email History link
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
					Thread.sleep(500);
				driver.findElement(By.linkText("Statement of GST Report")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Active customer page open up with all records 
				String Actualtext2 = driver.findElement(By.tagName("h2")).getText();
				Assert.assertEquals(Actualtext2, "Statement of GST Report Report");
				}
				
				@Test(priority = 14)
				public void Statement_Summary() throws InterruptedException, IOException
				{
					Thread.sleep(500);
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
				//********************************************************************************************
				//Click on Statement Summary link
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,500)", "");
				Thread.sleep(500);
				driver.findElement(By.linkText("Statement Summary")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Statement Summary Report page open up with all records 
				String Actualtext2 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[3]/div/div/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext2, "Statement Summary Report");
				System.out.print("\n assertion_method_ executed 1.4) "+Actualtext2);
								
				//Select "All" option from "record per page" drop down
				Select all4 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all4.selectByVisibleText("All");
				Thread.sleep(2000);
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();
				//search the record
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
				
			Thread.sleep(500);
				
				
				}

				@Test(priority = 15)
				public void Statement_Summary_with_Breakdown_Report() throws InterruptedException, IOException
				{
					Thread.sleep(500);
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Statement.jsp");
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollBy(0,500)", "");
					Thread.sleep(500);
				//********************************************************************************************
				//Click on link
			
		
		
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[16]/td[1]/a")).click();
				Thread.sleep(1000);
				
				//Assertion to validate Statement Summary Report page open up with all records 
				String Actualtext2 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[3]/div/div/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext2, "Statement Summary with Breakdown Report");
				System.out.print("\n assertion_method_ executed 1.4) "+Actualtext2);
								
				//Select "All" option from "record per page" drop down
				Select all4 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all4.selectByVisibleText("All");
				Thread.sleep(1000);
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();
				//search the record
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
				
			Thread.sleep(500);
				
				
				}

				
				
}
