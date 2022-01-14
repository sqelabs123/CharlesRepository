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

public class Finalcial extends Sauce_Instance_Login_Test {
	
	public static String customer ="21000";
	public static String stmt_NUm ="613";
	public static String t_Type ="Misc Credit";
	public static String date ="01 Sep 15";
	public static String post_code ="30096";
	public static String cus_name="Peter Andrews";	
	public static String header="html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[1]/h2";
	public String furl="https://test.electricitybilling.com/billingtest/Report_Financial.jsp";
	
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
				
		
				//click on financial under report section
				driver.findElement(By.linkText("Financial")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Financial page open up under reports section
				String Actualtext1 = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td")).getText();
				Assert.assertEquals(Actualtext1, "Financial Reports");	
		
		}
	@Test(priority =1)
	public void Aged_Receivables_by_Group_390days() throws InterruptedException, IOException
		{
				//************************************************************************************************************************
				//Click on Aged Receivables by Group (390 days) link
				driver.findElement(By.linkText("Aged Receivables by Group (390 days)")).click();
				Thread.sleep(2000);
			
				//Assertion to validate "Aged Receivable by Group Report" page open up with all records 
				String Actualtext2 = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext2, "Aged Receivable by Group Report");
				System.out.print("\n assertion_method_ executed 2.1 "+Actualtext2);
				
				
				//Select "All" option from "record per page" drop down
				Select all2 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all2.selectByVisibleText("All");
				Thread.sleep(2000);
				
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();
				//search the record
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);		
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
				
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
				Thread.sleep(5000);
				
//				driver.navigate().back();
		}
	@Test(priority =2)
	public void Aged_Receivables_by_Trandate() throws InterruptedException, IOException
		{		
			driver.navigate().to(furl);
				//********************************************************************************************************************
				//Click on Aged Receivables by Trandate link
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[4]/td[1]/a")).click();
				Thread.sleep(2000);
			
				//Assertion to validate "Aged Receivable by Group Report" page open up with all records 
				String Actualtext3 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext3, "Parameter to fetch Aged Receivables By Trandate Report");
				System.out.print("\n assertion_method_ executed 2.2 "+Actualtext3);
				//select date
				driver.findElement(By.name("start_date")).click();
				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[5]/td[4]")).click();
				Thread.sleep(2000);
				//clk next
				driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[3]/form/div[2]/a/span")).click();
				Thread.sleep(1000);
				
				//Select "All" option from "record per page" drop down
				Select all3 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all3.selectByVisibleText("All");
				Thread.sleep(2000);
				
				
				//search the record
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[3]")).getText();

				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);		
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[3]")).getText());
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
		}	
	
	@Test(priority =3)//Blank page
	public void Aged_Receivables_With_Breakdown() throws InterruptedException, IOException
		{		
			driver.navigate().to(furl);
				//********************************************************************************************************************
				//Click on Aged Receivables with breakdown
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[5]/td[1]/a")).click();
				Thread.sleep(2000);
			
				//Assertion to validate "Aged Receivable by Group Report" page open up with all records 
				String Actualtext3 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext3, "Aged Receivables with Breakdown");
				System.out.print("\n assertion_method_ executed 2.2 "+Actualtext3);
				//select date
				driver.findElement(By.id("monthYear")).click();
				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tfoot/tr[1]/th")).click();
				Thread.sleep(2000);
				//clk next
				driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[4]/a/span")).click();
				Thread.sleep(500);

				
				//Select "All" option from "record per page" drop down
				Select all3 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all3.selectByVisibleText("All");
				Thread.sleep(2000);
				
				
				//search the record
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[3]")).getText();

				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);		
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[3]")).getText());
				
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
			
		}			
	
	@Test(priority = 4)//blank page
	public void Balance_Over_The_Credit_Limit() throws InterruptedException, IOException
		{				
		driver.navigate().to(furl);
		Thread.sleep(500);
				//**************************************************************************************************************
				//Click on Balance Over The Credit Limit link
				driver.findElement(By.linkText("Balance Over The Credit Limit")).click();
				Thread.sleep(2000);
			
				//Assertion to validate " Balance Over The Credit Limit link" page open up with all records 
				String Actualtext4 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[3]/div/div/div[1]/h2/span")).getText();
				Assert.assertEquals(Actualtext4, "Balance Over the Credit Limit Report");
				System.out.print("\n assertion_method_ executed 2.3 ");
	
				//Select "All" option from "record per page" drop down
				Select all3 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all3.selectByVisibleText("All");
				Thread.sleep(2000);
				
				
				//search the record
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();

				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(2000);		
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
				
		}
	@Test(priority = 5)
	public void Billing_Report() throws InterruptedException, IOException
		{
				//**************************************************************************************************************
		driver.navigate().to(furl);
		Thread.sleep(500);
				//click on Billing Report link
				driver.findElement(By.linkText("Billing Report")).click();

				//Assertion to validate "Aged Receivable by Group Report" page open up with all records 
				String Actual5text = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actual5text, "Billing Report");
				System.out.print("\n assertion_method_ executed 2.4 "+Actual5text);
				
				//select year
				Select year = new Select(driver.findElement(By.id("year")));
				year.selectByIndex(0);
				Thread.sleep(2000);
				
				//select month
				Select month = new Select(driver.findElement(By.id("monthNum")));
				month.selectByVisibleText("AUGUST");
				Thread.sleep(2000);
				
				//clk next
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				 Thread.sleep(1000);
				
				//Assertion to validate "Aged Receivable by Group Report" page open up with all records 
				String Actual6text = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[3]/div/div/div[1]/h2/span")).getText();
				Assert.assertEquals(Actual6text, "Billing Report");
				System.out.print("\n assertion_method_ executed 2.4 ");
				
				//search the record
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();

				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);		
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
				
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
		}
	@Test(priority = 6)//blank page
	public void Individual_Payments_Report_with_allocations() throws InterruptedException, IOException
		{				
		driver.navigate().to(furl);
		Thread.sleep(500);
				//**************************************************************************************************************
				//Click on Balance Over The Credit Limit link
				driver.findElement(By.linkText("Individual Payments Report with allocations")).click();
				Thread.sleep(2000);
			
				//Assertion to validate " Balance Over The Credit Limit link" page open up with all records 
				String Actualtext4 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext4, "Individual Payments Report with allocations");
				System.out.print("\n assertion_method_ executed 2.3 ");
				
				Select all3 = new Select(driver.findElement(By.id("comboCustomer")));
				all3.selectByIndex(0);
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[4]/a")).click();
				Thread.sleep(1000);
				//Select "All" option from "record per page" drop down
				Select all3a = new Select(driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_length']/label/select")));
				all3a.selectByVisibleText("All");
				Thread.sleep(2000);
				
				
				//search the record
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[2]")).getText();

				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);		
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[2]")).getText());
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
				
		}
	@Test(priority = 7)
	public void Miscellaneous_Credits_And_Debits_Report() throws InterruptedException, IOException
		{
		driver.navigate().to(furl);
		Thread.sleep(500);
				//*****************************************************************************************************************
				//clk on Miscellaneous Credits And Debits Report link
				driver.findElement(By.linkText("Miscellaneous Credits And Debits Report")).click();
				Thread.sleep(2000);
				
				//Assertion to validate "Aged Receivable by Group Report" page open up with all records 
				String Actualtext5 = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext5, "Miscellaneous Credits And Debits Report");
				System.out.print("\n assertion_method_ executed 2.5 "+Actualtext5);
				
				//select year
				Select year1 = new Select(driver.findElement(By.id("year")));
				year1.selectByVisibleText("2016");
				Thread.sleep(2000);
				
				//select month
				Select month1 = new Select(driver.findElement(By.id("monthNum")));
				month1.selectByVisibleText("SEPTEMBER");
				Thread.sleep(2000);
				
				//clk next
				driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[3]/form/div[3]/a/span")).click();
				Thread.sleep(2000);
				
				String Actualtext6 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext6, "Miscellaneous Credits And Debits Report");
				System.out.print("\n assertion_method_ executed 2.5 ");
				
				//Select "All" option from "record per page" drop down
				Select all3 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all3.selectByVisibleText("All");
				Thread.sleep(2000);
				
				
				//search the record
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys("21006");
				Thread.sleep(1000);		
//Assertion require				
				//download CSV file
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
				
			
//				driver.navigate().back();
//				driver.navigate().back();
				
		}
	
	@Test(priority = 8)
	public void Miscellaneous_Credits_And_Debits_Report_id() throws InterruptedException, IOException
		{
		driver.navigate().to(furl);
		Thread.sleep(500);
				//*****************************************************************************************************************
				//clk on Miscellaneous Credits And Debits Report link
				driver.findElement(By.linkText("Miscellaneous Credits And Debits with Alternative ID Report")).click();
				Thread.sleep(2000);
				
				//Assertion to validate "Aged Receivable by Group Report" page open up with all records 
				String Actualtext5 = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext5, "Miscellaneous Credits And Debits With Alternative Id Report");
				System.out.print("\n assertion_method_ executed 2.5 "+Actualtext5);
				
				//select year
				Select year1 = new Select(driver.findElement(By.id("year")));
				year1.selectByIndex(0);
				Thread.sleep(2000);
				
				//select month
				Select month1 = new Select(driver.findElement(By.id("monthNum")));
				month1.selectByVisibleText("AUGUST");
				Thread.sleep(2000);
				
				//clk next
				driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[3]/form/div[3]/a/span")).click();
				Thread.sleep(2000);
				
				String Actualtext6 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext6, "Miscellaneous Credits And Debits Report");
				System.out.print("\n assertion_method_ executed 2.5 ");
				
				//Select "All" option from "record per page" drop down
				Select all3 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all3.selectByVisibleText("All");
				Thread.sleep(2000);
				
				
				//search the record
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys("21006");
				Thread.sleep(2000);		
//assertion require				
				//download CSV file
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
		}
	
	@Test(priority = 9)
	public void Payment_Allocations_Report_By_Customer() throws InterruptedException, IOException
		{
				//****************************************************************************************************************************
				driver.navigate().to(furl);
				Thread.sleep(500);
				 JavascriptExecutor jse = (JavascriptExecutor)driver;
				 jse.executeScript("window.scrollBy(0,1000)", "");
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[11]/td[1]/a")).click();
				Thread.sleep(1000);
				
				//Assertion to validate  page open up with all records 
				String Actualtext6 = driver.findElement(By.className("box-header")).getText();
				Assert.assertEquals(Actualtext6, "Individual Payments With Allocations Report");
				System.out.print("\n assertion_method_ executed 2.6 "+Actualtext6);
				
				//select start date
				Select year2 = new Select(driver.findElement(By.id("custId")));
				year2.selectByIndex(0);
				
				Thread.sleep(500);
				//select end date
				Select year21 = new Select(driver.findElement(By.id("year")));
				year21.selectByIndex(0);
				Thread.sleep(2000);
				//clk next
				WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);


				//Select "All" option from "record per page" drop down
				Select all = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all.selectByVisibleText("All");
				Thread.sleep(1000);
				
				//search the record
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys(customer);
				Thread.sleep(1000);
//assertion require
				//download CSV file
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
				Thread.sleep(4000);
														
		}

	@Test(priority = 10)
	public void Payment_Allocations_Report_By_Customer1() throws InterruptedException, IOException
		{
				//****************************************************************************************************************************
				driver.navigate().to(furl);
				Thread.sleep(500);
				 JavascriptExecutor jse = (JavascriptExecutor)driver;
				 jse.executeScript("window.scrollBy(0,1000)", "");
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[12]/td[1]/a")).click();
				Thread.sleep(1000);
				
				//Assertion to validate page open up with all records 
				String Actualtext6 = driver.findElement(By.className("box-header")).getText();
				Assert.assertEquals(Actualtext6, "Group Payments With Allocations Report");
				System.out.print("\n assertion_method_ executed 2.6 "+Actualtext6);
				
				//select start date
				driver.findElement(By.id("start_date")).click();
				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[1]/td[1]")).click();
				
				Thread.sleep(500);
				//select end date
				driver.findElement(By.id("end_date")).click();
				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[6]/td[7]")).click();
				Thread.sleep(2000);
				//clk next
				WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);


				//Select "All" option from "record per page" drop down
				Select all = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all.selectByVisibleText("All");
				Thread.sleep(1000);
				
				//search the record
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys(customer);
				Thread.sleep(1000);
//assertion require				
				//download CSV file
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
				Thread.sleep(9000);
														
		}

	@Test(priority = 11)
	public void Payments_By_Date() throws InterruptedException, IOException
		{
				//****************************************************************************************************************************
				driver.navigate().to(furl);
				Thread.sleep(500);
				 JavascriptExecutor jse = (JavascriptExecutor)driver;
				 jse.executeScript("window.scrollBy(0,1000)", "");
				Thread.sleep(500);
				driver.findElement(By.linkText("Payments By Date")).click();
				Thread.sleep(2000);
				
				//Assertion to validate "Aged Receivable by Group Report" page open up with all records 
				String Actualtext6 = driver.findElement(By.className("box-header")).getText();
				Assert.assertEquals(Actualtext6, "Payments By Date Report");
				System.out.print("\n assertion_method_ executed 2.6 "+Actualtext6);
				
				//select start date
				driver.findElement(By.id("start_date")).click();
				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[1]/td[1]")).click();
				
				Thread.sleep(2000);
				//select end date
				driver.findElement(By.id("end_date")).click();
				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[6]/td[7]")).click();
				Thread.sleep(2000);
				//clk next
				WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);


				//Select "All" option from "record per page" drop down
				Select all = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all.selectByVisibleText("All");
				Thread.sleep(1000);
				
				//search the record
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys(customer);
				Thread.sleep(1000);
//assertion require				
				//download CSV file
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
				Thread.sleep(9000);
				
		
	
			
				
		}
	@Test(priority = 12)
	public void Payments_By_Group() throws InterruptedException, IOException
		{
				//*************************************************************************************************************
				driver.navigate().to(furl);		
				Thread.sleep(500);
				 JavascriptExecutor jse = (JavascriptExecutor)driver;
				 jse.executeScript("window.scrollBy(0,1000)", "");
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[14]/td[1]/a")).click();
				Thread.sleep(2000);
				
				//Assertion to validate "Aged Receivable by Group Report" page open up with all records 
				String Actualtext6 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext6, "Payments By Group Report");
				System.out.print("\n assertion_method_ executed 2.7 "+Actualtext6);
				
				//select year
				driver.findElement(By.id("start_date")).click();
				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[1]/td[1]")).click();
			
				Thread.sleep(2000);
				
				//select month
				driver.findElement(By.id("end_date")).click();
				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[6]/td[7]")).click();

				Thread.sleep(1000);
				
				WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);
				

				//Select "All" option from "record per page" drop down
				Select all = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all.selectByVisibleText("All");
				Thread.sleep(1000);
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();
				//search the record
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
				Thread.sleep(9000);
				
				
		}
	@Test(priority = 13)/////////////////////no data still
	
	public void Payments_For_A_Day() throws InterruptedException, IOException
		{
				//**************************************************************************************************************
		driver.navigate().to(furl);		
		Thread.sleep(500);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(500);
		
				//clk on  Payments For A Day link
							
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[15]/td[1]/a")).click();
				Thread.sleep(2000);

				//Assertion to validate "Aged Receivable by Group Report" page open up with all records 
				String Actualtext7 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext7, "Payments For A Day");
				System.out.print("\n assertion_method_ executed 2.8 "+Actualtext7);
				
				//select start date
				driver.findElement(By.id("date")).click();
				driver.findElement(By.xpath("html/body/div[5]/div[1]/table/tbody/tr[1]/td[1]")).click();
				Thread.sleep(2000);

				
				
				//clk next
				WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);
				

				//Select "All" option from "record per page" drop down
				Select all = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all.selectByVisibleText("All");
				Thread.sleep(1000);
				
				//search the record
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys(customer);
				Thread.sleep(1000);
//assertion require				
				//download CSV file
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
				Thread.sleep(9000);
				
		
			
		
		}
	@Test(priority = 14)
	public void Payments_For_A_Month() throws InterruptedException, IOException
		{
				//***************************************************************************************************************
		driver.navigate().to(furl);		
		Thread.sleep(500);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(500);
			
				//clk on Payments For A Month link
				
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[16]/td[1]/a")).click();
				Thread.sleep(2000);
				//Assertion to validate "Aged Receivable by Group Report" page open up with all records 
				String Actualtext8 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext8, "Parameter to fetch Payments for a Month Report");
				System.out.print("\n assertion_method_ executed 2.9 "+Actualtext8);
				
				//select start date
				driver.findElement(By.id("month_year")).click();
				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/thead/tr[1]/th[1]")).click();
				
				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[1]/td[1]")).click();
				Thread.sleep(2000);
				
					//nxt btn
				WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);
				
				//Select "All" option from "record per page" drop down
				Select all3a = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all3a.selectByVisibleText("All");
				Thread.sleep(2000);
				
				
				//search the record
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys("21000");
				Thread.sleep(2000);		
//assertion require				
				//download CSV file
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
				
		
				
				
				
		}
	@Test(priority = 15)
	public void Payments_Without_Allocations_Report() throws InterruptedException, IOException
		{
				//****************************************************************************************************************
				
			
		driver.navigate().to(furl);		
		Thread.sleep(500);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(500);
				// click on Payments Without Allocations Report link
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[17]/td[1]/a")).click();
				Thread.sleep(2000);
		
				//Assertion to validate "Payments Without Allocations Report" page open up with all records 
				String Actualtext6a = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext6a, "Payments Without Allocations Report");
				System.out.print("\n assertion_method_ executed 2.10 "+Actualtext6a);
				
				//select year
				Select year2 = new Select(driver.findElement(By.id("year")));
				year2.selectByIndex(0);
				Thread.sleep(2000);
				
				//select month
				Select month2 = new Select(driver.findElement(By.id("monthNum")));
				month2.selectByVisibleText("AUGUST");
				Thread.sleep(2000);
				
				//select scope
				Select scope = new Select(driver.findElement(By.id("scope")));
				scope.selectByIndex(0);
				Thread.sleep(2000);
				
				//select order
				Select order = new Select(driver.findElement(By.id("order")));
				order.selectByIndex(0);
				Thread.sleep(2000);
				
				//clk next
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);
		

				//Select "All" option from "record per page" drop down
				Select all3b = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all3b.selectByVisibleText("All");
				Thread.sleep(2000);
				
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[2]/td[1]")).getText();
				//search the record
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);		
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[2]/td[1]")).getText());
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).click();
				
		}
	@Test(priority = 16)
	public void Prepaid_Transactions_Report() throws InterruptedException, IOException
		{
				//****************************************************************************************************************
				// click on Transactions By Group & Dates link
		driver.navigate().to(furl);		
		Thread.sleep(500);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(500);
				
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[18]/td[1]/a")).click();
				Thread.sleep(2000);
				
				//Assertion to validate "Transactions By Group & Dates" page open up with all records 
				String Actualtext8a = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext8a, "Prepaid Transactions Report");
				System.out.print("\n assertion_method_ executed 2.11 "+Actualtext8a);
				
				//select start date
				Select all3c = new Select(driver.findElement(By.id("monthNum")));
				all3c.selectByVisibleText("AUGUST");

				Thread.sleep(2000);
				
				//select end date
				Select allc = new Select(driver.findElement(By.id("year")));
				allc.selectByVisibleText("2016");
				Thread.sleep(2000);
				
				//next btn
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);
		
				
				//Select "All" option from "record per page" drop down
				Select all13c = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all13c.selectByVisibleText("All");
				Thread.sleep(2000);
				
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")).getText();
				//search the record
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);	
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")).getText());
				
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
			 
		}
	@Test(priority = 17)
	public void Static_Prepaid_Meters_Report() throws InterruptedException, IOException
		{
				//****************************************************************************************************************
				// click on Transactions By Group & Dates link
		driver.navigate().to(furl);		
		Thread.sleep(500);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(500);
				
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[19]/td[1]/a")).click();
				Thread.sleep(2000);
				
				//Assertion to validate "Transactions By Group & Dates" page open up with all records 
				String Actualtext8a = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext8a, "Static Prepaid Meters Report");
				System.out.print("\n assertion_method_ executed 2.11 "+Actualtext8a);
				
				//select start date
				Select all3c = new Select(driver.findElement(By.id("monthNum")));
				all3c.selectByVisibleText("AUGUST");
				Thread.sleep(2000);
				
				//select end date
				Select allc = new Select(driver.findElement(By.id("year")));
				allc.selectByVisibleText("2016");
				Thread.sleep(2000);
				
				//next btn
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);
		
				
				//Select "All" option from "record per page" drop down
				Select all31c = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all31c.selectByVisibleText("All");
				Thread.sleep(2000);
				
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")).getText();
				//search the record
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")).getText());
				
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
			 
		}
		
	@Test(priority = 18)
	public void Transactions_By_Group_and_Dates() throws InterruptedException, IOException
		{
				//****************************************************************************************************************
				// click on Transactions By Group & Dates link
		driver.navigate().to(furl);		
		Thread.sleep(500);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(500);
				
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[20]/td[1]/a")).click();
				Thread.sleep(2000);
				
				//Assertion to validate "Transactions By Group & Dates" page open up with all records 
				String Actualtext8a = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div[1]/h2")).getText();
				Assert.assertEquals(Actualtext8a, "Parameters to fetch Transactions By Group And Date Report");
				System.out.print("\n assertion_method_ executed 2.11 "+Actualtext8a);
				
				//select start date
				driver.findElement(By.id("start_date")).click();
				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[4]/td[5]")).click();
				Thread.sleep(2000);
				
				//select end date
				driver.findElement(By.id("end_date")).click();
				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[4]/td[6]")).click();
				Thread.sleep(2000);
				
				//next btn
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);
		
				
				//Select "All" option from "record per page" drop down
				Select all3c = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all3c.selectByVisibleText("All");
				Thread.sleep(2000);
				
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")).getText();
				//search the record
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);		
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")).getText());
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
			 
		}
	 
	@Test(priority = 19)
	public void Transactions_By_Month() throws InterruptedException, IOException
		{
		driver.navigate().to(furl);		
		Thread.sleep(500);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(500);
				//*************************************************************************************************************

		
		
				driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[21]/td[1]/a")).click();
				Thread.sleep(2000);
				
				//Assertion to validate "Transactions By Group & Dates" page open up with all records
				String Actualtext3 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[3]/div/div/div[1]/h2/span")).getText();
				Assert.assertEquals(Actualtext3, "Transactions By Month Report");
				System.out.print("\n assertion_method_ executed 2.12 "+Actualtext3);
				
								
				//Select "All" option from "record per page" drop down
				Select all3d = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all3d.selectByVisibleText("All");
				Thread.sleep(2000);
				
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")).getText();
				//search the record
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);
				Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")).getText());
				
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
	
				//driver.findElement(By.xpath("html/body/div[5]/div/div[1]/div/div/div/ul/li[3]/a")).click();
		 
			} 
	
}
