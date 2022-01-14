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

public class Service extends Sauce_Instance_Login_Test {
public static String customer ="21000";
public static String header="html/body/div[5]/div/div[2]/div[2]/div[2]/div[1]/h2";

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
		
		//click on Rating under reports section
		driver.findElement(By.linkText("Service")).click();
		Thread.sleep(2000);
		
		//Assertion to validate Rating page open up under reports section
		String Actualtext1 = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td")).getText();
		Assert.assertEquals(Actualtext1, "Service Reports");
		System.out.print("\n assertion_method_ executed 4) "+Actualtext1);	
		
		}
	
	@Test(priority = 1) 
	public void Abnormal_Meter_Reads_Report() throws InterruptedException, IOException
		{
		//********************************************************************************************
		//Click on All_Disconnected_Services link
		driver.findElement(By.linkText("Abnormal Meter Reads Report")).click();
		Thread.sleep(2000);
		
		//Assertion to validate All Disconnected Services page open up with all records 
		String Actualtext2 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
		
		Assert.assertEquals(Actualtext2, "Abnormal Meter Reads Report");
		System.out.print("\n assertion_method_ executed 4.1) "+Actualtext2);
		
		//select start date
		Select month = new Select(driver.findElement(By.name("monthNum")));
		month.selectByVisibleText("AUGUST");
				
	
		Thread.sleep(1000);
				
		//select end date
		Select year = new Select(driver.findElement(By.name("year")));
		year.selectByVisibleText("2016");
		Thread.sleep(1000);
				
		//next
		 WebElement element = driver.findElement(By.tagName("a"));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("javascript:getReport();", element);
		 Thread.sleep(1000);
			
		 //Select "All" option from "record per page" drop down
			Select all = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
			all.selectByVisibleText("All");
			Thread.sleep(1000);
			
			//search the record
		String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")).getText();
			driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
			Thread.sleep(1000);
			Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")).getText());
			
			//download CSV file
			driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
			Thread.sleep(5000);
			
		}
	@Test(priority = 2) 
	public void All_Disconnected_Services() throws InterruptedException, IOException
		{
		//********************************************************************************************
		//Click on All_Disconnected_Services link
		driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Service.jsp");
		Thread.sleep(500);
		driver.findElement(By.linkText("All Disconnected Services")).click();
		Thread.sleep(2000);
		
		//Assertion to validate All Disconnected Services page open up with all records 
		String Actualtext2 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
		
		Assert.assertEquals(Actualtext2, "Disconnected Services Report");
		System.out.print("\n assertion_method_ executed 4.1) "+Actualtext2);
		
		//select start date
		driver.findElement(By.id("start_date")).click();
		driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[1]/td[1]")).click();
				
	
		Thread.sleep(1000);
				
		//select end date
		driver.findElement(By.id("end_date")).click();
		driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[6]/td[7]")).click();
		Thread.sleep(1000);
				
		//next
		 WebElement element = driver.findElement(By.tagName("a"));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("javascript:getReport();", element);
		 Thread.sleep(1000);
			
		 //Select "All" option from "record per page" drop down
			Select all = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
			all.selectByVisibleText("All");
			Thread.sleep(1000);
			
			//search the record
			String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")).getText();
			driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
			Thread.sleep(1000);
			Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")).getText());
			//download CSV file
			driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
			Thread.sleep(5000);
			
		}
	@Test(priority = 3)
	public void Customers_With_No_Service() throws InterruptedException, IOException
	{
	//****************************************************************************************************
	driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Service.jsp");
	Thread.sleep(500);
		//Click on Customers With No Service link
		driver.findElement(By.linkText("Customers With No Service")).click();
		Thread.sleep(1000);
		
		//Assertion to validate Customers With No Service page open up with all records 
		String Actualtext3 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[3]/div/div/div[1]/h2")).getText();
		Assert.assertEquals(Actualtext3, "Customers With No Services Reports");
		System.out.print("\n assertion_method_ executed 4.2) "+Actualtext3);
		
				
		//Select "All" option from "record per page" drop down
		Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
		all1.selectByVisibleText("All");
		Thread.sleep(2000);
		
		//search the record
		String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();
		driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
		Thread.sleep(1000);
		Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
		//download CSV file
		driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
		Thread.sleep(4000);


	}	
	@Test(priority = 4)
	public void Meter_Plan_Summary() throws InterruptedException, IOException
	{
	//****************************************************************************************************
		driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Service.jsp");
		Thread.sleep(500);
		//Click on Meter Plan Summary link
		driver.findElement(By.linkText("Meter Plan Summary")).click();
		Thread.sleep(2000);
		
		//Assertion to validate Customers With No Service page open up with all records 
		String Actualtext3 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[3]/div/div/div[1]/h2")).getText();
		Assert.assertEquals(Actualtext3, "Meter Plan Summary Report");
		System.out.print("\n assertion_method_ executed 4.3) "+Actualtext3);
		
		
		//Select "All" option from "record per page" drop down
		Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
		all1.selectByVisibleText("All");
		Thread.sleep(2000);
		
		//search the record
		String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();
		driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
		Thread.sleep(1000);
		Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
		//download CSV file
		driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();
		Thread.sleep(4000);
		
	}	
	@Test(priority = 5)//////////////////blank page
	public void Meter_Read_Exceptions() throws InterruptedException, IOException
	{
	//****************************************************************************************************
		driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Service.jsp");
		Thread.sleep(500);
		//Click on Meter Read Exceptions link
		driver.findElement(By.linkText("Meter Read Exceptions")).click();
		Thread.sleep(2000);
		
		//Assertion to validate Customers With No Service page open up with all records 
		String Actualtext3 = driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(Actualtext3, "Meter Read Exceptions Report");
		System.out.print("\n assertion_method_ executed 4.4) "+Actualtext3);
				
		

	}	
	@Test(priority = 6)
	public void Meter_With_Kfactor() throws InterruptedException, IOException
	{
	//****************************************************************************************************
	
		driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Service.jsp");
		Thread.sleep(500);
		
		
		//Click on Meter With Kfactor link
		driver.findElement(By.linkText("Meter With Kfactor")).click();
		Thread.sleep(500);
		
		//Assertion to validate Customers With No Service page open up with all records 
		String Actualtext3 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[3]/div/div/div[1]/h2")).getText();
		Assert.assertEquals(Actualtext3, "Meter and Kfactor Report");
		System.out.print("\n assertion_method_ executed 4.5) "+Actualtext3);
		
			
		//Select "All" option from "record per page" drop down
		Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
		all1.selectByVisibleText("All");
		Thread.sleep(2000);
		
		//search the record
		String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")).getText();
		driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
		Thread.sleep(1000);
		Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")).getText());
		//download CSV file
		driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();			
		}	
	
	@Test(priority = 7)
	public void Security_Deposits_Current_Deposits_Report() throws InterruptedException, IOException
	{
	//****************************************************************************************************
	
		driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Service.jsp");
		Thread.sleep(500);
		
		
		//Click on Meter With Kfactor link
		driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[9]/td[1]/a")).click();
		Thread.sleep(500);
		
		//Assertion to validate Customers With No Service page open up with all records 
		String Actualtext3 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[3]/div/div/div[1]/h2")).getText();
		Assert.assertEquals(Actualtext3, "Security Deposits - Current Deposits Report");
		System.out.print("\n assertion_method_ executed 4.5) "+Actualtext3);
		
			
		//Select "All" option from "record per page" drop down
		Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
		all1.selectByVisibleText("All");
		Thread.sleep(2000);
		
		//search the record
		String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();
		driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
		Thread.sleep(1000);
		Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
		//download CSV file
		driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();			
		}
	
	@Test(priority = 8)
	public void Security_Deposits_Deposit_Transactions_Report() throws InterruptedException, IOException
	{
	//****************************************************************************************************
	
		driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Service.jsp");
		Thread.sleep(500);
		
		
		//Click on Meter With Kfactor link
		driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[10]/td[1]/a")).click();
		Thread.sleep(500);
		
		//Assertion to validate Customers With No Service page open up with all records 
		String Actualtext3 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
		Assert.assertEquals(Actualtext3, "Security Deposits - Deposit Transactions Report");
		System.out.print("\n assertion_method_ executed 4.5) "+Actualtext3);
		
		Thread.sleep(500);
		//select month
				Select month = new Select(driver.findElement(By.name("monthNum")));
				month.selectByVisibleText("AUGUST");
				//select year
				Select year = new Select(driver.findElement(By.name("year")));
				year.selectByVisibleText("2016");
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[4]/a")).click();
		//Select "All" option from "record per page" drop down
				
		Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
		all1.selectByVisibleText("All");
		Thread.sleep(1000);
		
		//search the record
		String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();
		driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
		Thread.sleep(1000);
		Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
		//download CSV file
		driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();			
		}
	
	@Test(priority = 9)
	public void Security_Deposits_No_Meters_Attached_Report() throws InterruptedException, IOException
	{
	//****************************************************************************************************
	
		driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Service.jsp");
		Thread.sleep(500);
		
		
		//Click on Meter With Kfactor link
		driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[11]/td[1]/a")).click();
		Thread.sleep(500);
		
		//Assertion to validate Customers With No Service page open up with all records 
		String Actualtext3 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[3]/div/div/div[1]/h2")).getText();
		Assert.assertEquals(Actualtext3, "Security Deposits - No Meters Attached Report");
		System.out.print("\n assertion_method_ executed 4.5) "+Actualtext3);
		
		
		//Select "All" option from "record per page" drop down
				
		Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
		all1.selectByVisibleText("All");
		Thread.sleep(1000);
		
		//search the record
		String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();
		driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
		Thread.sleep(1000);
		Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
		//download CSV file
		driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();			
		}
	
	@Test(priority = 10)
	public void Security_Deposits_Returned_Security_Transactions_Report() throws InterruptedException, IOException
	{
	//****************************************************************************************************
	
		driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Service.jsp");
		Thread.sleep(500);
		
		
		//Click on Meter With Kfactor link
		driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[12]/td[1]/a")).click();
		Thread.sleep(500);
		
		//Assertion to validate Customers With No Service page open up with all records 
		String Actualtext3 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
		Assert.assertEquals(Actualtext3, "Security Deposits - Returned Security Transactions Report");
		System.out.print("\n assertion_method_ executed 4.5) "+Actualtext3);
		
		Thread.sleep(500);
		//select month
				Select month = new Select(driver.findElement(By.name("monthNum")));
				month.selectByVisibleText("AUGUST");
				//select year
				Select year = new Select(driver.findElement(By.name("year")));
				year.selectByVisibleText("2016");
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[4]/a")).click();
		//Select "All" option from "record per page" drop down
				
		Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
		all1.selectByVisibleText("All");
		Thread.sleep(1000);
		
		//search the record
		String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();
		driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
		Thread.sleep(1000);
		Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
		//download CSV file
		driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();			
		}
	
	@Test(priority = 11)
	public void Security_Deposits_Transfer_Transactions_Report() throws InterruptedException, IOException
	{
	//****************************************************************************************************
	
		driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Service.jsp");
		Thread.sleep(500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(500);
		//Click on  link
		driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[13]/td[1]/a")).click();
		Thread.sleep(500);
		
		//Assertion to validate Customers With No Service page open up with all records 
		String Actualtext3 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
		Assert.assertEquals(Actualtext3, "Security Deposits - Transfer Transactions Report");
		System.out.print("\n assertion_method_ executed 4.5) "+Actualtext3);
		
		Thread.sleep(500);
		//select month
				Select month = new Select(driver.findElement(By.name("monthNum")));
				month.selectByVisibleText("AUGUST");
				//select year
				Select year = new Select(driver.findElement(By.name("year")));
				year.selectByVisibleText("2016");
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[4]/a")).click();
		//Select "All" option from "record per page" drop down
				
		Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
		all1.selectByVisibleText("All");
		Thread.sleep(1000);
		
		//search the record
		String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();
		driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
		Thread.sleep(1000);
		Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
		//download CSV file
		driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();			
		}
/*	@Test(priority = 12)
	public void Security_Deposits_Returned_Security_Transactions_Report1() throws InterruptedException, IOException
	{
	//****************************************************************************************************
	
		driver.navigate().to("https://test.electricitybilling.com/billingtest/Report_Service.jsp");
		Thread.sleep(500);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(500);
		//Click on link
		driver.findElement(By.xpath(".//*[@id='utbListDiv']/table/tbody/tr[12]/td[1]/a")).click();
		Thread.sleep(500);
		
		//Assertion to validate Customers With No Service page open up with all records 
		String Actualtext3 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[1]/h2")).getText();
		Assert.assertEquals(Actualtext3, "Security Deposits - Returned Security Transactions Report");
		System.out.print("\n assertion_method_ executed 4.5) "+Actualtext3);
		
		Thread.sleep(500);
		//select month
				Select month = new Select(driver.findElement(By.name("monthNum")));
				month.selectByVisibleText("AUGUST");
				//select year
				Select year = new Select(driver.findElement(By.name("year")));
				year.selectByVisibleText("2016");
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div[4]/a")).click();
		//Select "All" option from "record per page" drop down
				
		Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
		all1.selectByVisibleText("All");
		Thread.sleep(1000);
		
		//search the record
		String cno = driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText();
		driver.findElement(By.xpath(".//*[@id='DataTables_Table_0_filter']/label/input")).sendKeys(cno);
		Thread.sleep(1000);
		Assert.assertEquals(cno,driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")).getText());
		//download CSV file
		driver.findElement(By.xpath(".//*[@id='exportToCSV']/i")).click();			
		}     */
}

