package reports;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Re_usable.Sauce_Instance_Login_Test;

public class Rating extends Sauce_Instance_Login_Test {
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
		
		//click on Customer under reports section
		driver.findElement(By.linkText("Rating")).click();
		Thread.sleep(2000);
		
		//Assertion to validate Customer page open up under reports section
		String Actualtext1 = driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td")).getText();
		Assert.assertEquals(Actualtext1, "Rating Reports");
		System.out.print("\n assertion_method_ executed 3) "+Actualtext1);	
		
		}
	@Test(priority = 1)/////blank page
	public void Active_Customers() throws InterruptedException, IOException
		{
		//********************************************************************************************
		//Click on All Active customer link
		driver.findElement(By.linkText("All Active Overrides")).click();
		Thread.sleep(2000);
		
		//Assertion to validate Active customer page open up with all records 
		String Actualtext2 = driver.findElement(By.xpath(header)).getText();
		Assert.assertEquals(Actualtext2, "All Active Overrides");
		System.out.print("\n assertion_method_ executed 3.1) "+Actualtext2);
		

		}
	@Test(priority = 2)//blank page
	public void Audit_Change_Of_Customer_Rate_Overrides() throws InterruptedException, IOException
		{
		//****************************************************************************************************
		//click back button of web browser
		driver.navigate().back();
		
		//Click on Customer Email List link
		driver.findElement(By.linkText("Audit Change Of Customer Rate Overrides")).click();
		Thread.sleep(2000);
		
		//Assertion to validate E-Mail List page open up with all records 
		String Actualtext3 = driver.findElement(By.xpath(header)).getText();
		Assert.assertEquals(Actualtext3, "Parameters to fetch Audit Change of Customer Rate Overrides Report");
		System.out.print("\n assertion_method_ executed 3.2) "+Actualtext3);
		
		//Enter customer number
		driver.findElement(By.id("cust_no")).sendKeys("1");
		Thread.sleep(2000);
		//select start date
		driver.findElement(By.id("start_date")).click();
		driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[1]/td[1]")).click();
		Thread.sleep(1000);
		
		//select end date
		driver.findElement(By.id("end_date")).click();
		driver.findElement(By.xpath("html/body/div[15]/div[1]/table/tbody/tr[1]/td[4]")).click();
		Thread.sleep(1000);
		
		//next
		driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[2]/div[3]/form/div[4]/a")).click();
		Thread.sleep(2000);

		
		//Select "All" option from "record per page" drop down
		Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
		all1.selectByVisibleText("All");
		Thread.sleep(2000);
		
		//search the record
		driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[3]/div/div[2]/label/input")).sendKeys(customer);
		Thread.sleep(2000);
		
		//download CSV file
		driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div[2]/div[3]/div/div/div[2]/button")).click();
		


		}	
	@Test(priority = 3) 
	public void Plan_Tariffs_Summary() throws InterruptedException, IOException
		{		//click back button of web browser
		driver.navigate().back();
		
		driver.findElement(By.linkText("Plan Tariffs Summary")).click();
		Assert.assertEquals("Plan Tariffs Summary", driver.findElement(By.xpath(".//*[text()='Plan Tariffs Summary '] ")).getText());

		//Select "All" option from "record per page" drop down
		Select all1 = new Select(driver.findElement(By.name("DataTables_Table_0_length")));
		all1.selectByVisibleText("All");
		Thread.sleep(1000);
		
		customer=driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr[6]/td[1]")).getText();

		
		//search the record
		driver.findElement(By.xpath(".//*[@type='search']")).sendKeys(customer);
		Thread.sleep(1000);
		Assert.assertEquals(customer, driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText());

		//download CSV file
		driver.findElement(By.id("exportToCSV")).click();
		}

}
