package com.Utility.Bill.webdriver;

import com.Utility.Bill.Browsers.BrowserList;

public class DriverManagerFactory {

	public static DriverManager getManager(BrowserList browserName) {
		switch (browserName) 
		{
		case chrome:
			return new ChromedriverManager();
		case firefox:
			return new FirefoxDriverManager();
		default:
			return null;
		}
	}

}
