package reports;

import java.io.IOException;
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
	public void All_Disconnected_Services() throws InterruptedException, IOException
		{
		//********************************************************************************************
		//Click on All_Disconnected_Services link
		driver.findElement(By.linkText("All Disconnected Services")).click();
		Thread.sleep(2000);
		
		//Assertion to validate All Disconnected Services page open up with all records 
		String Actualtext2 = driver.findElement(By.tagName("h2")).getText();
		
		Assert.assertEquals(Actualtext2, "Disconnected Services Report");
		System.out.print("\n assertion_method_ executed 4.1) "+Actualtext2);
		
		//select start date
		driver.findElement(By.id("start_date")).click();
		driver.findElement(By.xpath("html/body/div[5]/div[1]/table/thead/tr[1]/th[1]")).click();
		driver.findElement(By.xpath("html/body/div[5]/div[1]/table/thead/tr[1]/th[1]")).click();
		driver.findElement(By.xpath("html/body/div[5]/div[1]/table/thead/tr[1]/th[1]")).click();
		
		driver.findElement(By.xpath("html/body/div[5]/div[1]/table/tbody/tr[1]/td[1]")).click();
		Thread.sleep(1000);
				
		//select end date
		driver.findElement(By.id("end_date")).click();
		driver.findElement(By.xpath("html/body/div[5]/div[1]/table/tfoot/tr[1]/th")).click();
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
			driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys("21184");
			Thread.sleep(1000);
			
			//download CSV file
			driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
			Thread.sleep(9000);
			
	
			//click back button of web browser
			driver.navigate().back();driver.navigate().back();
		}
	@Test(priority = 2)
	public void Customers_With_No_Service() throws InterruptedException, IOException
	{
	//****************************************************************************************************
	
		//Click on Customers With No Service link
		driver.findElement(By.linkText("Customers With No Service")).click();
		Thread.sleep(2000);
		
		//Assertion to validate Customers With No Service page open up with all records 
		String Actualtext3 = driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(Actualtext3, "Customers With No Services Reports");
		System.out.print("\n assertion_method_ executed 4.2) "+Actualtext3);
		
				
		//Select "All" option from "record per page" drop down
		Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
		all1.selectByVisibleText("All");
		Thread.sleep(2000);
		
		//search the record
		driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys("21001");
		Thread.sleep(2000);
		
		//download CSV file
		driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
		
		//click back button of web browser
		driver.navigate().back();

	}	
	@Test(priority = 3)
	public void Meter_Plan_Summary() throws InterruptedException, IOException
	{
	//****************************************************************************************************
		
		//Click on Meter Plan Summary link
		driver.findElement(By.linkText("Meter Plan Summary")).click();
		Thread.sleep(2000);
		
		//Assertion to validate Customers With No Service page open up with all records 
		String Actualtext3 = driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(Actualtext3, "Meter Plan Summary Report");
		System.out.print("\n assertion_method_ executed 4.3) "+Actualtext3);
		
		
		//Select "All" option from "record per page" drop down
		Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
		all1.selectByVisibleText("All");
		Thread.sleep(2000);
		
		//search the record
		driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys("658");
		Thread.sleep(2000);
		
		//download CSV file
		driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
		
		//click back button of web browser
		driver.navigate().back();

	}	
	@Test(priority = 4)//////////////////blank page
	public void Meter_Read_Exceptions() throws InterruptedException, IOException
	{
	//****************************************************************************************************
				
		//Click on Meter Read Exceptions link
		driver.findElement(By.linkText("Meter Read Exceptions")).click();
		Thread.sleep(2000);
		
		//Assertion to validate Customers With No Service page open up with all records 
		String Actualtext3 = driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(Actualtext3, "Meter Read Exceptions Report");
		System.out.print("\n assertion_method_ executed 4.4) "+Actualtext3);
				
		

	}	
	@Test(priority = 5)
	public void Meter_With_Kfactor() throws InterruptedException, IOException
	{
	//****************************************************************************************************
		//click back button of web browser
		driver.navigate().back();
		
		
		//Click on Meter With Kfactor link
		driver.findElement(By.linkText("Meter With Kfactor")).click();
		Thread.sleep(2000);
		
		//Assertion to validate Customers With No Service page open up with all records 
		String Actualtext3 = driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(Actualtext3, "Meter and Kfactor Report");
		System.out.print("\n assertion_method_ executed 4.5) "+Actualtext3);
		
			
		//Select "All" option from "record per page" drop down
		Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
		all1.selectByVisibleText("All");
		Thread.sleep(2000);
		
		//search the record
		driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys("1209");
		Thread.sleep(2000);
		
		//download CSV file
		driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
		
	
		}	

}
