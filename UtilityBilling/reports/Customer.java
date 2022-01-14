package reports;

import java.awt.dnd.DragGestureRecognizer;
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

public class Customer extends Sauce_Instance_Login_Test {
	public static String customer  ;
	public static String stmt_NUm ="613";
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
				driver.findElement(By.linkText("Customer")).click();
				Thread.sleep(1000);
				
				//Assertion to validate Customer page open up under reports section
				String Actualtext1 = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td")).getText();
				Assert.assertEquals(Actualtext1, "Customer Reports");
				System.out.print("\n assertion_method_ executed 1) "+Actualtext1);	
				
				} 
				@Test(priority = 1)
				public void Active_Customers() throws InterruptedException, IOException
				{
				//********************************************************************************************
				//Click on Active customer link
				driver.findElement(By.linkText("Active Customers")).click();
				Thread.sleep(1000);
				
				//Assertion to validate Active customer page open up with all records 
				String Actualtext2 = driver.findElement(By.className("box-header")).getText();
				Assert.assertEquals(Actualtext2, "Active Customers");
				System.out.print("\n assertion_method_executed 1.1) "+Actualtext2);
				
				//Select "All" option from "record per page" drop down
				Select all = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all.selectByVisibleText("All");
				Thread.sleep(1000);
				customer=driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[6]/td[4]")).getText();
				//search the record
				driver.findElement(By.xpath(".//*[@type='search']")).sendKeys(customer);
				Thread.sleep(1000);
				
				String searched_cus=driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[4]")).getText();
				Assert.assertEquals(searched_cus, customer);
				//download CSV file
				driver.findElement(By.id("exportToCSV")).click();
				driver.findElement(By.id("exportToCSV")).click();
				Thread.sleep(5000);
				
				
				//click back button of web browser
				driver.navigate().back();
				driver.navigate().back();
				}
				@Test(priority = 2)
				public void Concessions_by_Month_Report() throws InterruptedException, IOException
				{
					driver.findElement(By.linkText("Concessions by Month Report")).click();
					Assert.assertEquals("Concessions by Month Report", driver.findElement(By.xpath(".//*[text()='Concessions by Month Report'] ")).getText());
				driver.findElement(By.xpath(".//*[@id='monthYear']")).click();
				driver.findElement(By.xpath(".//*[text()='Today']")).click();
				driver.findElement(By.xpath(".//*[span='Next'] ")).click();
				
				Thread.sleep(3000);
				//click back button of web browser
				driver.navigate().back();
				driver.navigate().back();
				}
				@Test(priority = 3)
				public void Concessions_by_Statement_Report() throws InterruptedException, IOException
				{
					driver.findElement(By.linkText("Concessions by Statement Report")).click();
					
					Assert.assertEquals("Concessions by Statement Report", driver.findElement(By.xpath(".//*[text()='Concessions by Statement Report'] ")).getText());
					driver.findElement(By.xpath(".//*[span='Next'] ")).click();
					Assert.assertEquals(" ", "");
					//click back button of web browser
				
				}
				
		 
				
				@Test(priority = 4)
				public void Customer_Email_List() throws InterruptedException, IOException
				{
					driver.navigate().back();
					driver.navigate().back();
				//****************************************************************************************************
				//Click on Customer Email List link
				driver.findElement(By.linkText("Customer Email List")).click();
				Thread.sleep(1000);
				
				//Assertion to validate E-Mail List page open up with all records 
				String Actualtext3 = driver.findElement(By.className("box-header")).getText();
				Assert.assertEquals(Actualtext3, "E-Mail List");
				System.out.print("\n assertion_method_ executed 1.2) "+Actualtext3);
				
				//Select "All" option from "record per page" drop down
				Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all1.selectByVisibleText("All");
				Thread.sleep(1000);
				
				//search the record
				driver.findElement(By.xpath(".//*[@type='search']")).sendKeys(customer);
				Thread.sleep(1000);
				
				//download CSV file
				driver.findElement(By.id("exportToCSV")).click();
				
				//click back button of web browser
		
				}	
				
				@Test(priority = 5)
				public void Customer_Listing() throws InterruptedException, IOException
				{
					driver.navigate().back();
					driver.navigate().back();

				//****************************************************************************************************
				
				//Click on Customer Listing link
				driver.findElement(By.linkText("Customer Listing")).click();
				Thread.sleep(1000);
				
				//Assertion to validate Customer Listing page open up with all records 
				String Actualtext4 = driver.findElement(By.className("box-header")).getText();
				Assert.assertEquals(Actualtext4, "Customer Listing");
				System.out.print("\n assertion_method_ executed 1.3) "+Actualtext4);
				
				//Select "All" option from "record per page" drop down
				Select all2 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all2.selectByVisibleText("All");
				Thread.sleep(1000);
				
				//search the record
				driver.findElement(By.xpath(".//*[@type='search']")).sendKeys(customer);
				Thread.sleep(1000);
				
				//download CSV file
				driver.findElement(By.id("exportToCSV")).click();
				
				//click back button of web browser
				driver.navigate().back();
				driver.navigate().back();
				}
				
				@Test(priority = 6)////////////////////Redirect to the same page ,enabled=false 
				public void Customer_Plan_Summary() throws InterruptedException, IOException
				{
		
				//****************************************************************************************************
				
				//Click on Customer Plan Summary link
				driver.findElement(By.linkText("Customer Plan Summary")).click();
				Thread.sleep(1000);
				
				//Assertion to validate Customer Plan Summary page open up with all records 
	 
				Thread.sleep(2000);
				Assert.assertEquals("Customer Plan Summary Report", driver.findElement(By.xpath(".//*[text()='Customer Plan Summary Report ']")).getText());

				
				System.out.print("\n assertion_method_ executed 1.4) ");
				customer=driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[6]/td[1]")).getText();
			
				//Select "All" option from "record per page" drop down
				Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all1.selectByVisibleText("All");
				Thread.sleep(1000);
				
				//search the record
				driver.findElement(By.xpath(".//*[@type='search']")).sendKeys(customer);
				Thread.sleep(1000);
				Assert.assertEquals(customer, driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText());
 				//download CSV file
				driver.findElement(By.id("exportToCSV")).click();
				
				}
				
				@Test(priority = 7)//no data
				public void Customer_Wins_And_Losses_Report() throws InterruptedException, IOException
				{
				//****************************************************************************************************
				//click back button of web browser
				driver.navigate().back();
				driver.navigate().back();

				//Click on Customer Wins And Losses Report link
				driver.findElement(By.linkText("Customer Wins And Losses Report")).click();
				Thread.sleep(1000);
			
				//Assertion to validate Customer Wins and Losses Report page open up 
				
				Assert.assertEquals("Customer Wins and Losses Report", driver.findElement(By.xpath(".//*[text()='Customer Wins and Losses Report']")).getText());
				System.out.print("\n assertion_method_ executed 1.5) " );
			
				//select year
				Select year = new Select(driver.findElement(By.id("year")));
				year.selectByVisibleText("2015");
				Thread.sleep(1000);
				
				//select month
				Select month = new Select(driver.findElement(By.id("monthNum")));
				month.selectByVisibleText("AUGUST");
				Thread.sleep(1000);
				
				//nxt btn
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				 Thread.sleep(1000);
				
				//Select "All" option from "record per page" drop down
				Select all3 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all3.selectByVisibleText("All");
				Thread.sleep(1000);
				
				//search the record
				driver.findElement(By.xpath(".//*[@type='search']")).sendKeys(cus_name);
				Thread.sleep(1000);
				
				//download CSV file
				driver.findElement(By.id("exportToCSV")).click();
				
			
				}
				 
				@Test(priority = 8)
				public void Customers_Added() throws InterruptedException, IOException
				{
				//****************************************************************************************************
					//click back button of web browser
					driver.navigate().back();				
					driver.navigate().back();
				//Click on Customers Added link   
				driver.findElement(By.linkText("Customers Added")).click();
				Thread.sleep(1000);
				//Assertion to validate Customers Added Report page open up  
				Assert.assertEquals("Customers Added Report", driver.findElement(By.xpath(".//*[text()='Customers Added Report']")).getText());

			 
				System.out.print("\n assertion_method_ executed 1.6) ");
				//select start date
				driver.findElement(By.id("start_date")).click();
				driver.findElement(By.xpath(".//*[text()='«']")).click();
				driver.findElement(By.xpath(".//*[text()='«']")).click();
				driver.findElement(By.xpath(".//*[text()='«']")).click();
				driver.findElement(By.xpath(".//*[text()='«']")).click();

				driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[6]/td[7]")).click();
				
				//select end date
				driver.findElement(By.id("end_date")).click();
				driver.findElement(By.xpath(".//*[text()='Today']")).click();
				
				//nxt btn
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				 Thread.sleep(1000);
				
			 		customer=driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[6]/td[1]")).getText();

				 
				//Select "All" option from "record per page" drop down
				Select all4 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all4.selectByVisibleText("All");
				Thread.sleep(1000);
				
				
				
				//search the record
				driver.findElement(By.xpath(".//*[@type='search']")).sendKeys(customer);
				Thread.sleep(1000);
				
				Assert.assertEquals(customer, driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText());

 				//download CSV file
				driver.findElement(By.id("exportToCSV")).click();
				//click back button of web browser
				driver.navigate().back();				
				driver.navigate().back();
				driver.navigate().back();
				
				
				}
				
			
				@Test(priority = 9)
				public void Date_Customers_Added() throws InterruptedException, IOException
				{
				//****************************************************************************************************

				//Click on Date Customers Added link
				driver.findElement(By.linkText("Date Customers Added")).click();
				Thread.sleep(1000);
				
				//Assertion to validate Date Customers Added report page open up with all records 
				Assert.assertEquals("Date Customers Added Report", driver.findElement(By.xpath(".//*[text()='Date Customers Added Report ']")).getText());
				System.out.print("\n assertion_method_ executed 1.7) ");
				
				//Select "All" option from "record per page" drop down
				Select all5 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all5.selectByVisibleText("All");
				Thread.sleep(1000);
				
				//search the record
				driver.findElement(By.xpath(".//*[@type='search']")).sendKeys("25");
				Thread.sleep(1000);
				
				//download CSV file
				driver.findElement(By.id("exportToCSV")).click();
				


				}
			
				@Test(priority = 10)//no data
				public void Disconnected_Customers_Only() throws InterruptedException, IOException
				{
					//click back button of web browser
					driver.navigate().back();
					driver.navigate().back();
				//****************************************************************************************************
				
				//Click on Disconnected Customers Only link
				driver.findElement(By.linkText("Disconnected Customers Only")).click();
				Thread.sleep(1000);
				
				
				String Actualtext8 = driver.findElement(By.className("box-header")).getText();
				Assert.assertEquals(Actualtext8, "Disconnected Customers Only Report");
				System.out.print("\n assertion_method_ executed 1.8) "+Actualtext8);
				
				//blank 

				}
				
				@Test(priority = 11) 
				public void Move_in_Move_Out_Report() throws InterruptedException, IOException
				{
					//click back button of web browser
					driver.navigate().back();
			 
					 JavascriptExecutor jse = (JavascriptExecutor)driver;
					 jse.executeScript("window.scrollBy(0,1000)", "");
					Thread.sleep(500);
					//Click on Move in-Move Out Report link
					driver.findElement(By.linkText("Move in-Move Out Report")).click();
					Thread.sleep(1000);
					
					Assert.assertEquals("Move in-Move Out Report", driver.findElement(By.xpath(".//*[text()='Move in-Move Out Report']")).getText());

					Select select = new Select(driver.findElement(By.xpath(".//*[@id='monthNum']")));
					select.selectByVisibleText("AUGUST");
					
					Select select2 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
					select2.selectByVisibleText("2016");
					
					driver.findElement(By.xpath(".//*[span='Next'] ")).click();

					
			 		customer=driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[6]/td[1]")).getText();

					 
					//Select "All" option from "record per page" drop down
					Select all4 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
					all4.selectByVisibleText("All");
					Thread.sleep(1000);
					
					
					
					//search the record
					driver.findElement(By.xpath(".//*[@type='search']")).sendKeys(customer);
					Thread.sleep(1000);
					
					
					Assert.assertEquals(customer, driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText());

					//download CSV file
					driver.findElement(By.id("exportToCSV")).click();
					//click back button of web browser
					driver.navigate().back();				
					driver.navigate().back();
				}
				
				@Test(priority = 12)
				public void Postcode_breakdown() throws InterruptedException, IOException
				{
					
				//****************************************************************************************************
					//click back button of web browser
					driver.navigate().back();

					 JavascriptExecutor jse = (JavascriptExecutor)driver;
					 jse.executeScript("window.scrollBy(0,1000)", "");
					Thread.sleep(500);
			 
				//Click on Postcode breakdown link
				driver.findElement(By.linkText("Postcode breakdown")).click();
				Thread.sleep(1000);
				
				//Assertion to validate Postcode Summary page open up with all records 
				String Actualtext9 = driver.findElement(By.className("box-header")).getText();
				Assert.assertEquals(Actualtext9, "Postcode Summary");
				System.out.print("\n assertion_method_ executed 1.9) "+Actualtext9);
				
				//Select "All" option from "record per page" drop down
				Select all6 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all6.selectByVisibleText("All");
				Thread.sleep(1000);
				
		 		customer=driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[6]/td[1]")).getText();

				//search the record
				driver.findElement(By.xpath(".//*[@type='search']")).sendKeys(customer);
				Thread.sleep(1000);
				Assert.assertEquals(customer, driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText());

				//download CSV file
				driver.findElement(By.id("exportToCSV")).click();
				
				//click back button of web browser
				} 
				@Test(priority = 13)
				public void Service_Number_List() throws InterruptedException, IOException
				{
				//****************************************************************************************************
					driver.navigate().back();
					driver.navigate().back();

					 JavascriptExecutor jse = (JavascriptExecutor)driver;
					 jse.executeScript("window.scrollBy(0,1000)", "");
					Thread.sleep(500);
				//Click on Service Number List link
				driver.findElement(By.linkText("Service Number List")).click();
				Thread.sleep(1000);
				
				//Assertion to validate Postcode Summary page open up with all records 
				String Actualtext10 = driver.findElement(By.className("box-header")).getText();
				Assert.assertEquals(Actualtext10, "Service Number List Report");
				System.out.print("\n assertion_method_ executed 1.10) "+Actualtext10+"\n \n");
				
				//select drop down menu
				Select cus_num = new Select(driver.findElement(By.id("custno")));
				cus_num.selectByVisibleText("222287");
				Thread.sleep(1000);
				
				//nxt btn
				 WebElement element = driver.findElement(By.tagName("a"));
				 JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("javascript:getReport();", element);
				 Thread.sleep(1000);
		
				
				//Select "All" option from "record per page" drop down
				Select all7 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
				all7.selectByVisibleText("All");
				Thread.sleep(1000);
				
		 		customer=driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[2]/td[1]")).getText();

				//search the record
				driver.findElement(By.xpath(".//*[@type='search']")).sendKeys(customer);
				Thread.sleep(1000);
				Assert.assertEquals(customer, driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText());
				
				//download CSV file
				driver.findElement(By.id("exportToCSV")).click();
				
				//Click on the Reports link
				driver.findElement(By.linkText("Reports")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
				}	
 
}
