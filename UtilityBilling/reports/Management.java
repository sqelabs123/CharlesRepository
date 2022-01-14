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

public class Management extends Sauce_Instance_Login_Test{
	public static String customer ="21000";
	public static String stmt_NUm ="613";
	public static String t_Type ="Misc Credit";
	public static String date ="01 Sep 15";
	public static String post_code ="30096";
	public static String cus_name="Peter Andrews";
	public static String header="html/body/div[5]/div/div[2]/div[2]/div[2]/div[1]/h2";
	
	public String email = "sunidhisaini353@gmail.com";
	
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
				
				//click on Management under reports section
				driver.findElement(By.linkText("Management")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Management Reports page open up under reports section
				String Actualtext1 = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td")).getText();
				Assert.assertEquals(Actualtext1, "Management Reports");
				System.out.print("\n assertion_method_ executed 1) "+Actualtext1);	
				
				}/*
				@Test(priority = 1)//link deleted or not found
				public void Phone_Calls_Plan_Margin() throws InterruptedException, IOException
				{
				//********************************************************************************************
				//Click on Phone Calls Plan Margin link
				driver.findElement(By.linkText("Phone Calls Plan Margin")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Phone Calls Plan Margin page open up with all records 
				String Actualtext2 = driver.findElement(By.xpath(header)).getText();
				Assert.assertEquals(Actualtext2, "Phone Calls Plan Margin Report");
				System.out.print("\n assertion_method_ executed 1.1) "+Actualtext2);

				Select stmt_no = new Select(driver.findElement(By.name("stmt_no")));
				stmt_no.selectByIndex(6);
				Thread.sleep(2000);
				
		
				
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				Thread.sleep(1000);
				

				//Select "All" option from "record per page" drop down
				Select all = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all.selectByVisibleText("All");
				Thread.sleep(2000);
				
				//search the record
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys(customer);
				Thread.sleep(2000);
				
				//download CSV file
				driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
				Thread.sleep(5000);
				
		 
				
				}
				*/
				
				@Test(priority = 2)
				public void Statement_Trend() throws InterruptedException, IOException
				{
				 
				//****************************************************************************************************
				//Click on Statement Trend List link
				driver.findElement(By.linkText("Statement Trend")).click();
				Thread.sleep(2000);
				
				//Assertion to validate Statement Trend Report page open up with all records 
				String Actualtext3 = driver.findElement(By.xpath(header)).getText();
				Assert.assertEquals(Actualtext3, "Statement Trend Report");
				System.out.print("\n assertion_method_ executed 1.2) "+Actualtext3);
				
				Select stmt_no = new Select(driver.findElement(By.name("stmt_no")));
				stmt_no.selectByIndex(6);
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
				String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
				Thread.sleep(1000);
				Assert.assertEquals(cno, driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")));
				
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
				Thread.sleep(4000);
				
				
			
		
		
				}	
				@Test(priority = 3)
				public void User_Login_History() throws InterruptedException, IOException
				{
					Thread.sleep(500);
					driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Management.jsp");
				//****************************************************************************************************
				Thread.sleep(500);
				//Click on User Login History link
				driver.findElement(By.linkText("User Login History")).click();
				Thread.sleep(1000);
				
				//Assertion to validate User Login History page open up with all records 
				String Actualtext4 = driver.findElement(By.xpath(header)).getText();
				Assert.assertEquals(Actualtext4, "User Login History");
				System.out.print("\n assertion_method_ executed 1.3) "+Actualtext4);
				//username
				driver.findElement(By.id("username")).sendKeys(email);
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
				driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(email);
				Thread.sleep(1000);
				Assert.assertEquals(email, driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")));
				
				//download CSV file
				driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
				
		
				}

}
