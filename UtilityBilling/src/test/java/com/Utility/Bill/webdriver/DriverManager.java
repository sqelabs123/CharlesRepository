package com.Utility.Bill.webdriver;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	
	protected abstract void Startservice();
	protected abstract void Createservice();
	protected WebDriver driver;
	
	public WebDriver getDriver() {
		this.Startservice();
		this.Createservice();
		return driver;
	}
	

}
