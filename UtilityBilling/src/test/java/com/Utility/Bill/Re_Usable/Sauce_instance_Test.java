package com.Utility.Bill.Re_Usable;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Utility.Bill.Browsers.BrowserList;
import com.Utility.Bill.webdriver.DriverManager;
import com.Utility.Bill.webdriver.DriverManagerFactory;



public class Sauce_instance_Test   {

	protected WebDriver driver;
	protected DriverManager driverManager;
	 
 	Repo_Test action_obj;
	//public Assertion_Test Assertion_obj;
	//public String Url="https://test.waterworkslms.com/waterworks";


	@BeforeClass
	@Parameters("url")

	
	public void Open_Browser(String u) throws InterruptedException, IOException {

	    this.driverManager = DriverManagerFactory.getManager(BrowserList.chrome);
	    this.driver = this.driverManager.getDriver();
	    
	//	String exePath =  System.getProperty("user.dir") + "\\TestData\\chromedriver1.exe";	
	//	System.setProperty("webdriver.chrome.driver", exePath);
	//	driver = new ChromeDriver();
		
 		action_obj = new Repo_Test(driver);
	  //Assertion_obj = new Assertion_Test(driver);
		driver.get(u);
		driver.manage().window().maximize();	
		
		/*//add new functionalily 
				Select NewGroup=new Select(action_obj.Select_newGroup());
				NewGroup.selectByIndex(2);
				action_obj.Select_newGroup().click();*/
	


	}
}





/*package Re_usable;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;



public class Sauce_instance_Test   {

	protected WebDriver driver;
	 
 	Repo_Test action_obj;
	//public Assertion_Test Assertion_obj;
	//public String Url="https://test.waterworkslms.com/waterworks";


	@BeforeClass
	@Parameters("url")
	
	
	public void Open_Browser(String u) throws InterruptedException, IOException {
 
//		String exePath = "E:\\chromedriver.exe";
		
		String exePath =  System.getProperty("user.dir") + "\\TestData\\chromedriver1.exe";
	//	String exePath="D:\\A_Projects\\M_Utility\\TestData\\chromedriver1.exe";
		
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		
 		action_obj = new Repo_Test(driver);
		//Assertion_obj = new Assertion_Test(driver);
		driver.get(u);
		driver.manage().window().maximize();	
		
		
		//once time only
		action_obj.useranme().sendKeys("testerone143@yopmail.com");
		action_obj.Password().sendKeys("C123456789@c");
		action_obj.loginbutton().click();
	


	}
}*/


















