package com.Utility.Bill.BillRunFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class test_Temp extends Sauce_Instance_Login_Test{
	@Test
	public void test() throws InterruptedException{
	action_obj.admin_mainMenu().click();
	action_obj.billRunCycle().click();
	action_obj.createNewPlan().click();
	action_obj.cycleName().sendKeys("testCycle");
	action_obj.cycleDropDown().click();
	//Select select = new Select(driver.findElement(By.xpath(".//*[@id='custnos']")));
	//select.selectByVisibleText(customerNumber+"- Chandan verma");
	driver.findElement(By.xpath(".//*[contains(span,'226074')]")).click();
	Actions action = new Actions(driver);
	action.sendKeys(Keys.ESCAPE).build().perform();
	action_obj.saveCycle().click();
	Thread.sleep(500);
	if(driver.findElement(By.xpath(".//*[@id='cycleBody']/tr[1]/td[1]")).isEnabled()){
	
		System.out.println("Done");
	}
	else
	{
		System.out.println("Problem");
	}
}
}