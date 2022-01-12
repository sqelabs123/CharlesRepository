package com.Utility.Bill.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverManager extends DriverManager {

	
	@Override
	protected void Startservice() {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
	}

	@Override
	protected void Createservice() {
		// TODO Auto-generated method stub
        FirefoxOptions option= new FirefoxOptions();
		
 		this.driver= new FirefoxDriver(option);
	}

}
