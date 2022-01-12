package com.Utility.Bill.Re_Usable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.Bill.webdriver.DriverManager;
import com.Utility.Bill.Browsers.BrowserList;
import com.Utility.Bill.webdriver.DriverManagerFactory;


public class buildNo {
	String[] arr = {

			"https://test.utilitybilling.com/billing/"			
	};
	String x1= ".loginbody>div>p>span";
	
	protected DriverManager driverManager;
	protected WebDriver driver;
	
	@Test
	public void f() throws InterruptedException {

		this.driverManager = DriverManagerFactory.getManager(BrowserList.chrome);
		this.driver = this.driverManager.getDriver();
		driver.manage().window().maximize();
	
//		System.setProperty("webdriver.chrome.driver", "D:\\A_Projects\\Customer_Portal_Utility\\library_files\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver( );

		for(int i=0;i<24;i++)
		{
			try {

				driver.get(arr[i]);
				Thread.sleep(2000);
				WebElement element = driver.findElement(By.cssSelector(x1));
				System.out.println(element.getText());
				System.out.println(driver.getCurrentUrl());

			} catch (Exception e) {

				System.out.println("Url error");   	}

		}
	}
}
