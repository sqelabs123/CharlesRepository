package com.Utility.Bill.Re_Usable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class buildNo {
	String[] arr = {

			"https://test.electricitybilling.com/billingtest/",
			"https://prod.electricitybilling.com/billing",
			"https://test.waterworkslms.com/waterworks",
			"https://prod.waterworkslms.com/waterworks",  
	    	"https://testing.utilibill.com.au/billingtest",
			"https://utbr8.utilibill.com.au/billing/",
			"https://tvs.utilibill.com.au/truevaluesolaruat",
			"https://tvs.utilibill.com.au/truevaluesolar",
			"https://winenergy.utilibill.com.au/winenergyuat",
			"https://winenergy.utilibill.com.au/winenergy",
			"https://nuruat.utilibill.com.au/nur/",
			"https://utbr8uat.utilibill.com.au/billing",
			"https://edp.waterworkslms.com/edp",
			"https://utbr8git.utilibill.com.au/billing/",
			"https://test.utilitybilling.com/billing/",
			"https://go.utilitybilling.com/billing/",
			"https://markettest.utilibill.com.au/marketbilling/",
			"https://markettestv8.utilibill.com.au/marketbilling/",
			"https://stanwelluat.utilibill.com.au/stanwell/",
			"https://stanwell5msuat.utilibill.com.au/stanwell/",
			"https://powerclubuat.utilibill.com.au/powerclub/",
			"https://futurexenergyuat.utilibill.com.au/futurexenergy",
			"https://utbrxuat.utilibill.com.au/utbrx/",
			"https://test.utilitybilling.com/marketbilling/",
			"https://go2.utilitybilling.com/billing/",
			"https://test2.utilitybilling.com/billing/"
			
	};
	String x1= ".loginbody>div>p>span";
	@Test
	public void f() throws InterruptedException {
		/*FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setAcceptUntrustedCertificates(false);

		 WebDriver driver = new FirefoxDriver(firefoxProfile);
		 */
		System.setProperty("webdriver.chrome.driver", "D:\\A_Projects\\Customer_Portal_Utility\\library_files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver( );

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
