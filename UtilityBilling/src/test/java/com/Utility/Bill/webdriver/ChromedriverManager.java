package com.Utility.Bill.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromedriverManager extends DriverManager {

	//private DriverManager instance;
	 

	@Override
	protected void Startservice() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		
	}

	@Override
	protected void Createservice() {
		// TODO Auto-generated method stub
		ChromeOptions option= new ChromeOptions();
		
		this.driver= new ChromeDriver(option);

		
	
	}
	
}
