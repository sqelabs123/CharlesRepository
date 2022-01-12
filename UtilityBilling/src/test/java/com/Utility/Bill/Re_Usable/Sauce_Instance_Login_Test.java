package com.Utility.Bill.Re_Usable;

import org.testng.annotations.AfterClass;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.Utility.Bill.Browsers.BrowserList;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.csv;
import com.Utility.Bill.webdriver.DriverManager;
import com.Utility.Bill.webdriver.DriverManagerFactory;

public class Sauce_Instance_Login_Test {

	protected WebDriver driver;
	protected DriverManager driverManager;
	public static DesiredCapabilities capability;
	 
	public Repo_Test action_obj;
	public Assertion_Test Assertion_obj;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	@Parameters({"userId","password","url"})
	public void Login(String userId,String password,String url) throws IOException, InterruptedException  {
		
		action_obj = new Repo_Test(driver);

		String downloadFilepath = "D:";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);	

//	 	String exePath =  System.getProperty("user.dir") + "\\TestData\\chromedriver1.exe";  //chrome driver address		
//	 	System.setProperty("webdriver.chrome.driver", exePath);
		
	    this.driverManager = DriverManagerFactory.getManager(BrowserList.chrome);
	    this.driver = this.driverManager.getDriver();
		
	//	driver = new ChromeDriver(cap);
    //  driver = new FirefoxDriver();
		action_obj = new Repo_Test(driver);
		Assertion_obj = new Assertion_Test(driver);

		System.out.println("---------------------------------------------------------------------------------------------------------------");
		//Open URL
		System.out.println("@URL Opening......."+url);
		driver.get(url);
		driver.manage().window().maximize();		
		action_obj.useranme().sendKeys(userId);
		action_obj.Password().sendKeys(password);
		action_obj.loginbutton().click();
		
		try {
			boolean ChooseGroup = driver.findElement(By.xpath("//span[contains(text(),'Choose a group to login to: ')]")).isDisplayed();
			if(ChooseGroup==true)
			{		
	        Select dropdown = new Select(action_obj.dropdownButton());
	        dropdown.selectByVisibleText("UI Administrator"); 
	        System.out.println("Dropdown-btn displayed!");
	        
	        action_obj.final_login().click();
			}
			else {
				System.out.println("Dropdown-btn not displayed!");
			}    
			
		} catch (NoSuchElementException e) {
	        return;
	    }
}
	@AfterClass
	public void logout() throws InterruptedException, MalformedURLException {
	List<WebElement> lout=(List<WebElement>) driver.findElements(By.xpath(".//*[@title='User'] "));
		if(lout.size()==1)
		{
	    System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println("@#############################################################");
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("scrollBy(0,-2000)", "");		
		  action_obj.user_icon_logout().click();
		  action_obj.logout().click();
		  driver.quit();
		  
		 
		} 
	}
	
}
