package com.Utility.Bill.Re_Usable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.Utility.Bill.webdriver.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Repo_Test
{

	public WebDriver driver;
	public static String last="";
	JavascriptExecutor executor = (JavascriptExecutor)driver;




	public Repo_Test(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		this.driver=driver; 		
	}


	Properties prop;
	//String  path = System.getProperty("user.dir") + "\\TestData\\UI.properties";
	String  path = System.getProperty("user.dir") + "\\UI.properties";
	ObjectMap_Test objMap = new ObjectMap_Test(path);


	public String date()
	{
		Date date = new Date();
		//current date user entry
		last=date.toString();
		System.out.println("The Time Is :-----------"+last);
		last= last.replace(":", "");
		last=last.replace(" ", "");

		// display time and date using toString()
		System.out.println(last);
		return last;
	}



	//Locating the userName text filed
	public WebElement useranme()   
	{		
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*UserName Text field should be displayed");
			WebElement ele =  wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("useranme")));
			return ele; 
		} catch (Exception e) {
			Reporter.log("*UserName Text field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*UserName Text field not displayed-----");

		}
		return null;
	}




	//Locating the USER PASSWORD text field on Login page..
	public WebElement Password()
	{
		try{ 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*'USER PASSWORD' text field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("password")));
			return ele;
		}catch(Exception e){
			Reporter.log("*'USER PASSWORD' text field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*'USER PASSWORD' text field not displayed-----");

		}
		return null;

	}


	//Locating the LOGIN button on Login page..
	public WebElement loginbutton()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*'LOGIN' button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("loginbutton")));
			return ele;
		} catch (Exception e) {		
			Reporter.log("*'LOGIN' button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*'LOGIN' button not displayed-----");

		}
		return null;
	}

	public WebElement dropdownButton()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*'DropDown' button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dropdown_btn")));
			return ele;
		} catch (Exception e) {		
			Reporter.log("*'DropDown' button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*'DropDown' button not displayed-----");

		}
		return null;
	}
	
	public WebElement final_login()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("'LOGIN' button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(objMap.getLocator("login_btn")));
			return ele;
		} catch (Exception e) {		
			Reporter.log("*'LOGIN' button not displayed-----"+e.getLocalizedMessage());
			System.out.println("'LOGIN' button not displayed-----");

		}
		return null;
	}

	//Admin main menu
	public WebElement admin_mainMenu()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Admin main menu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("admin")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Admin main menu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Admin main menu not displayed-----");

		}
		return null;
	}

	//billRunCycle
	public WebElement billRunCycle()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*billRunCycle should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("billRunCycle")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*billRunCycle not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*billRunCycle not displayed-----");

		}
		return null;
	}

	//cycleName
	public WebElement cycleName()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*cycleName should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("cycleName")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*cycleName not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*cycleName not displayed-----");

		}
		return null;
	}


	//cycleDropDown
	public WebElement cycleDropDown()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*cycleDropDown should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("cycleDropDown")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*cycleDropDown not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*cycleDropDown not displayed-----");

		}
		return null;
	}

	//cycleDropDown
	public WebElement cycleID()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*cycleID should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("cycleID")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*cycle ID not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*cycle ID not displayed-----");

		}
		return null;
	}

	//saveCycle
	public WebElement saveCycle()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*saveCycle should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("saveCycle")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*saveCycle not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*saveCycle not displayed-----");

		}
		return null;
	}

	//cycleConfirmationMessage
	public WebElement cycleConfirmationMessage()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*cycleConfirmationMessage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("cycleConfirmationMessage")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*cycleConfirmationMessage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*cycleConfirmationMessage not displayed-----");

		}
		return null;
	}
	//Locating the LOGOUT text under HELLO<USERNAME> Drop-down on Home page..
	public WebElement Users_under_user_manager() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Users_under_user_manager should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Users_under_user_manager")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*Users_under_user_manager not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Users_under_user_manager not displayed-----");

		}
		return null;
	}


	//create_new_user_button
	public WebElement create_new_user_button()    
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*create_new_user_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("create_new_user_button")));
			//ser.clear();
			return ele;
		} catch (Exception e) {
			Reporter.log("*create_new_user_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*create_new_user_button not displayed-----");

		}
		return null;
	}
	public WebElement Groupclick() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Group field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Grouplist")));
			return ele;
		} catch (Exception e) {
			Reporter.log("Group field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*new_user_id text field not displayed-----");

		}
		return null;
	}

	// select Group  in User name
	public WebElement selectGroup() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Select Group option should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("selctGrp")));
			return ele;
		} catch (Exception e) {
			Reporter.log("Group fieldSelect Group option not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*new_user_id text field not displayed-----");

		}
		return null;
	}
	//new_user_id
	public WebElement new_user_id() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*new_user_id text field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("new_user_id")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*new_user_id text field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*new_user_id text field not displayed-----");

		}
		return null;
	}


	//new_user_password
	public WebElement new_user_password() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*new_user_password field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("new_user_password")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*new_user_password field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*new_user_password field not displayed-----");

		}
		return null;
	}


	//save_user button
	public WebElement save_user_button()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*save_user button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("save_user")));
			return ele;		
		} catch (Exception e) {
			Reporter.log("*save_user button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*save_user button not displayed-----");

		}
		return null;
	}




	//ok
	public WebElement ok() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*ok button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ok")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*ok button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*ok button not displayed-----");

		}
		return null;
	}



	//user_icon_logout
	public WebElement user_icon_logout()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*user_icon_logout button should be displayed  ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("user_icon_logout")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*user_icon_logout button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*user_icon_logout button not displayed-----");

		}
		return null;


	}


	//logout
	public WebElement logout() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*logout button should be displayed on Delivery Address page..");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("logout")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*logout button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*logout button not displayed-----");

		}
		return null;
	}


	//back_button
	public WebElement back_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);			
			System.out.println("	*back_button button should be displayed  ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("back_button")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*back_button button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*back_button button not displayed-----");

		}
		return null;
	}


	//try_it_for_free
	public WebElement try_it_for_free() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*try_it_for_free button should be displayed on Your Shopping Cart page..");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("try_it_for_free")));
			return ele;		
		} catch (Exception e) {
			Reporter.log("*try_it_for_free button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*try_it_for_free button not displayed-----");

		}
		return null;
	}


	//reg_Company_name
	public WebElement reg_Company_name() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*reg_Company_name field should be displayed on Your Shopping Cart page..");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reg_Company_name")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*reg_Company_name field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*reg_Company_name filed not displayed-----");

		}
		return null;


	}


	//reg_f_name
	public WebElement reg_f_name() 
	{try {
		WebDriverWait wait= new WebDriverWait(driver,60);
		System.out.println("	*reg_f_name field should be displayed on Your Shopping Cart page..");
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reg_f_name")));
		return ele;	
	} catch (Exception e) {
		Reporter.log("*reg_f_name field not displayed-----"+e.getLocalizedMessage());
		System.out.println("	*reg_f_name filed not displayed-----");

	}
	return null;
	}






	//reg_sur_name
	public WebElement reg_sur_name () 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*reg_sur_name filed should be displayed on Home page..");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reg_sur_name")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*reg_sur_name filed not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*reg_sur_name filed not displayed-----");

		}
		return null;
	}




	//reg_email
	public WebElement reg_email ()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,6);
			System.out.println("	*'reg_email field should be displayed..");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reg_email")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*reg_email field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*reg_email field not displayed-----");

		}
		return null;
	}


	//country
	public WebElement country ()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*country drop-down should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("country")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*country drop-down not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*country drop-down not displayed-----");

		}
		return null;
	}

	//reg_phone
	public WebElement reg_phone () 
	{
		try {WebDriverWait wait= new WebDriverWait(driver,60);
		System.out.println("	*reg_phone field should be displayed");
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reg_phone")));
		return ele;	
		} catch (Exception e) {
			Reporter.log("*reg_phone field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*reg_phone field not displayed-----");

		}
		return null;
	}


	//reg_customer
	public WebElement reg_customer ()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*reg_customer_Base field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reg_customer")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*reg_customer_Base field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*reg_customer_Base field not displayed-----");

		}
		return null;
	}


	//captha_code field
	public WebElement captha_code ()  
	{try {
		WebDriverWait wait= new WebDriverWait(driver,60);
		System.out.println("	*captha_code field should be displayed");
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("captha_code")));
		return ele;	
	} catch (Exception e) {
		Reporter.log("*captha_code field not displayed-----"+e.getLocalizedMessage());
		System.out.println("	*captha_code field not displayed-----");

	}
	return null;
	}


	//reg_submit button
	public WebElement reg_submit() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*reg_submit button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reg_submit")));
			return ele;
		} catch (Exception e) {
			Reporter.log("* reg_submit button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*reg_submit button not displayed-----");

		}
		return null;
	}

	//here
	public WebElement here() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*here link should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("here")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*here link not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*here link not displayed-----");
		}
		return null;
	}

	//activation_email_field
	public WebElement activation_email_field()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*activation_email_field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("activation_email_field")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*activation_email_field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*activation_email_field not displayed-----");
		}
		return null;
	}


	//password_under_userManager
	public WebElement password_under_userManager() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*password_under_userManager button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("password_under_userManager")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*password_under_userManager button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*password_under_userManager button not displayed-----");

		}
		return null;
	}



	//change_new_Pass
	public WebElement change_new_Pass() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*change_new_Pass field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("change_new_Pass")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*change_new_Pass field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*change_new_Pass field not displayed-----");
		}
		return null;
	}

	//change_re_new_Pass
	public WebElement change_re_new_Pass() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*change_re_new_Pass filed should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("change_re_new_Pass")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*change_re_new_Pass filed not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*change_re_new_Pass filed not displayed-----");
		}
		return null;
	}

	//change_password
	public WebElement change_password_button()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*change_password_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("change_password_button")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*change_password_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*change_password_button not displayed-----");
		}
		return null;
	}

	//edit_group_under_groupManage
	public WebElement edit_group_under_groupManage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*edit_group_under_groupManage button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("edit_group_under_groupManage")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*edit_group_under_groupManage button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*edit_group_under_groupManage button not displayed-----");
		}
		return null;
	}

	//group_name
	public WebElement group_name()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*group_name field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("group_name")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*group_name field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*group_name field not displayed-----");
		}
		return null;
	}

	//group_owner1_name
	public WebElement group_owner1_name()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*group_owner1_name field should be displayed to add more product");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("group_owner1_name")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*group_owner1_name field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*group_owner1_name field not displayed-----");
		}
		return null;
	}
	//group_owner2_name
	public WebElement group_owner2_name()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*group_owner2_name field should be displayed to add more product");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("group_owner2_name")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*group_owner2_name field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*group_owner1_name field not displayed-----");
		}
		return null;
	}

	//operationName
	public WebElement operationName()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*operationName field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("operationName")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*operationName field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*operationName field not displayed-----");
		}
		return null;
	}
	//financeName
	public WebElement financeName() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*financeName filed should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("financeName")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*financeName filed not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*financeName filed not displayed-----");
		}
		return null;
	}
	//salesName
	public WebElement salesName() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*salesName filed should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("salesName")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*salesName filed not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*salesName field not displayed-----");
		}
		return null;
	}

	//owner1Email
	public WebElement owner1Email() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*owner1Email field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("owner1Email")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*owner1Email field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*owner1Email field not displayed-----");
		}
		return null;
	}


	//owner2Email
	public WebElement owner2Email() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*owner2Email field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("owner2Email")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*owner2Email field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*owner2Email field not displayed-----");
		}
		return null;
	}
	//operationEmail
	public WebElement operationEmail()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*operationEmail filed should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("operationEmail")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*operationEmail filed not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*operationEmail filed not displayed-----");
		}
		return null;
	}

	//financeEmail
	public WebElement financeEmail() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*financeEmail field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("financeEmail")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*financeEmail field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*financeEmail field not displayed-----");
		}
		return null;	
	}


	//salesEmail
	public WebElement salesEmail()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*salesEmail field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("salesEmail")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*salesEmail field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*salesEmail field not displayed-----");
		}
		return null;
	}

	//owner1Phone1
	public WebElement owner1Phone1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*owner1Phone1 field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("owner1Phone1")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*owner1Phone1 field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*owner1Phone1 field not displayed-----");
		}
		return null;


	}


	//owner2Phone1
	public WebElement owner2Phone1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*owner2Phone1 field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("owner2Phone1")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*owner2Phone1 field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*owner2Phone1 field not displayed-----");
		}
		return null;


	}
	//operationPhone1
	public WebElement operationPhone1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*operationPhone1 field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("operationPhone1")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*operationPhone1 field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*operationPhone1 field not displayed-----");
		}
		return null;
	}

	//financePhone1
	public WebElement financePhone1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*financePhone1 field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("financePhone1")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*financePhone1 field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*financePhone1 field not displayed-----");
		}
		return null;	
	}
	//salesPhone1
	public WebElement salesPhone1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*salesPhone1 field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("salesPhone1")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*salesPhone1 field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*salesPhone1 field not displayed-----");
		}
		return null;
	}


	//owner1Phone2
	public WebElement owner1Phone2()   
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*owner1Phone2 field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("owner1Phone2")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*owner1Phone2 field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*owner1Phone2 field not displayed-----");
		}
		return null;

	}

	//owner2Phone2
	public WebElement owner2Phone2()   
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*owner2Phone2 field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("owner2Phone2")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*owner2Phone2 field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*owner2Phone2 field not displayed-----");
		}
		return null;

	}

	//operationPhone2
	public WebElement operationPhone2()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*operationPhone2 field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("operationPhone2")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*operationPhone2 field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*operationPhone2 field not displayed-----");
		}
		return null;


	}

	//financePhone2
	public WebElement financePhone2() 
	{try {
		WebDriverWait wait= new WebDriverWait(driver,60);
		System.out.println("	*financePhone2 field should be displayed");
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("financePhone2")));
		return ele;	
	} catch (Exception e) {
		Reporter.log("*financePhone2 field not displayed-----"+e.getLocalizedMessage());
		System.out.println("	*financePhone2 field not displayed-----");
	}
	return null;
	}

	//salesPhone2
	public WebElement salesPhone2() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*salesPhone2 field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("salesPhone2")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*salesPhone2 field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*salesPhone2 field not displayed-----");
		}
		return null;


	}

	//owner1Fax
	public WebElement owner1Fax() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*owner1Fax field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("owner1Fax")));
			return ele;
		} catch (Exception e) {
			Reporter.log("* owner1Fax text field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*owner1Fax text field not displayed-----");
		}
		return null;
	}

	//owner2Fax
	public WebElement owner2Fax() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*owner2Fax field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("owner2Fax")));
			return ele;
		} catch (Exception e) {
			Reporter.log("* owner2Fax text field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*owner2Fax text field not displayed-----");
		}
		return null;
	}


	//operationFax
	public WebElement operationFax()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*operationFax text field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("operationFax")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*operationFax text field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*operationFax text field not displayed-----");
		}
		return null;


	}

	//financeFax
	public WebElement financeFax()  
	{
		try {WebDriverWait wait= new WebDriverWait(driver,60);
		System.out.println("	*financeFax field should be displayed");
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("financeFax")));
		return ele;	

		} catch (Exception e) {
			Reporter.log("*financeFax field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*financeFax field not displayed-----");
		}
		return null;


	}

	//salesFax
	public WebElement salesFax() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*salesFax field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("salesFax")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*salesFax field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*salesFax field not displayed-----");
		}
		return null;
	}

	//collectionsname
	public WebElement collectionsname() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*collectionsname field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("collectionsname")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*collectionsname field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*collectionsname field not displayed-----");
		}
		return null;
	}

	//collectionsemail
	public WebElement collectionsemail() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*collectionsemail field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("collectionsemail")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*collectionsemail field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*collectionsemail field not displayed-----");
		}
		return null;
	}

	//collectionsphone1
	public WebElement collectionsphone1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*collectionsphone1 field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("collectionsphone1")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*collectionsphone1 field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*collectionsphone1 field not displayed-----");
		}
		return null;
	}

	//collectionsphone2
	public WebElement collectionsphone2() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*collectionsphone2 field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("collectionsphone2")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*collectionsphone2 field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*collectionsphone2 field not displayed-----");
		}
		return null;
	}

	//collectionsfax
	public WebElement collectionsfax() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*collectionsfax field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("collectionsfax")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*collectionsfax field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*collectionsfax field not displayed-----");
		}
		return null;
	}	

	//gasmoveout
	public WebElement gasmoveout() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*gas moveout icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("gasmoveout")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*gas moveout icon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*gas moveout icon not displayed-----");
		}
		return null;
	}		



	//typeOfCreditcard
	public WebElement typeOfCreditcard() 
	{try {
		WebDriverWait wait= new WebDriverWait(driver,60);
		System.out.println("	*typeOfCreditcard field should be displayed");
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("typeOfCreditcard")));
		return ele;	
	} catch (Exception e) {
		Reporter.log("*typeOfCreditcard field not displayed-----"+e.getLocalizedMessage());
		System.out.println("	*typeOfCreditcard field not displayed-----");
	}
	return null;
	}


	//bankName
	public WebElement bankName() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*bankName field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("bankName")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*bankName field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*bankName field not displayed-----");
		}
		return null;


	}

	//bankAccount
	public WebElement bankAccount() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,80);
			System.out.println("	*bankAccount field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("bankAccount")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*bankAccount field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*bankAccount field not displayed-----");
		}
		return null;
	}
	//bankAccountNumber
	public WebElement bankAccountNumber() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*bankAccountNumber field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("bankAccountNumber")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("* bankAccountNumber field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	* bankAccountNumber field not displayed-----");
		}
		return null;


	}
	//creditcardHolder
	public WebElement creditcardHolder() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*creditcardHolder field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("creditcardHolder")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*creditcardHolder field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*creditcardHolder field not displayed-----");
		}
		return null;


	}

	//creditCardNumber
	public WebElement creditCardNumber() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*creditCardNumber field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("creditCardNumber")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*creditCardNumber field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*creditCardNumber field not displayed-----");

		}
		return null;


	}

	//dateExpired
	public WebElement dateExpired()    {
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*dateExpired field should be displayed on Login page..");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dateExpired")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*dateExpired field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*dateExpired field not displayed-----");

		}
		return null;
	}

	//postAddress
	public WebElement postAddress()  
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*postAddress text field should be displayed on Home page..");
			WebElement  ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("postAddress")));
			return ele;
		} catch (Exception e) {		
			Reporter.log("*postAddress text field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*postAddress text field not displayed-----");

		}
		return null;


	}


	//postSub
	public WebElement postSub() throws Exception {
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*postSub field should be displayed..");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("postSub")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*postSub field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*postSub field not displayed-----");

		}
		return null;



	}


	//postState 
	public WebElement postState ()  {
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*postState field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("postState")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*postState field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*postState field not displayed-----");

		}
		return null;



	}

	//postCode
	public WebElement postCode()   {
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*postCode field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("postCode")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*postCode field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*postCode field not displayed-----");

		}
		return null;



	}





	//billingAddress
	public WebElement billingAddress()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*billingAddress field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("billingAddress")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*'billingAddress field' not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*'billingAddress field' not displayed-----");
		}
		return null;
	}


	//billingSub
	public WebElement billingSub()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*billingSub field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("billingSub")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*billingSub field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*billingSub field not displayed-----");
		}
		return null;
	}

	//billingState
	public WebElement billingState()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*billingState field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("billingState")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*billingState field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*billingState field not displayed-----");
		}
		return null;
	}



	//billingCode
	public WebElement billingCode()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*billingCode should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("billingCode")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*billingCode not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*billingCode not displayed-----");
		}
		return null;
	}


	//Use_reference_only_invoice
	public WebElement Use_reference_only_invoice()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Use_reference_only_invoice should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Use_reference_only_invoice")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*Use_reference_only_invoice not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Use_reference_only_invoice not displayed-----");
		}
		return null;

	}


	//tiabNotes
	public WebElement tiabNotes()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*tiabNotes field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("tiabNotes")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*tiabNotes field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*tiabNotes field not displayed-----");
		}
		return null;

	}

	//franchiseeNotes
	public WebElement franchiseeNotes()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*franchiseeNotes field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("franchiseeNotes")));
			return ele;
		} catch (Exception e) {
			Reporter.log("*franchiseeNotes field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*franchiseeNotes field not displayed-----");
		}
		return null;

	}


	//save_changes
	public WebElement save_changes() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*save_changes button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("save_changes")));

			return ele;

		} catch (Exception e) {
			Reporter.log("*save_changes button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*save_changes button not displayed-----");
		}
		return null;
	}
	//proRataDate
	public WebElement proRataDate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*proRataDate button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("proRataDate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*proRataDate button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*proRataDate button not displayed-----");
		}
		return null;
	}








	//bill_run_mainMenu
	public WebElement bill_run_mainMenu() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*bill_run_mainMenu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("billRunMainMenu")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*bill_run_mainMenu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*bill_run_mainMenu not displayed-----");
		}
		return null;
	}


	//run_the_bill_button
	public WebElement run_the_bill_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*run_the_bill_button  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("run_the_bill_button")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*run_the_bill_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*run_the_bill_button not displayed-----");
		}
		return null;
	}



	//Recurring_harge_Date
	public WebElement Recurring_harge_Date() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Recurring_charge_Date field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Recurring_harge_Date")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Recurring_charge_Date field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Recurring_harge_Date field not displayed-----");
		}
		return null;
	}


	//issueDate
	public WebElement issueDate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*issueDate field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("issueDate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*issueDate field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*issueDate field not displayed-----");
		}
		return null;
	}

	//dueDate
	public WebElement dueDate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*dueDate field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dueDate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*dueDate field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*dueDate field not displayed-----");
		}
		return null;
	}

	//cycleno
	public WebElement cycleno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*cycleno field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("cycleno")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*cycleno field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*cycleno field not displayed-----");
		}
		return null;
	}



	//bill_run_button
	public WebElement bill_run_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*bill_run_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("bill_run_button")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*bill_run_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*bill_run_button not displayed-----");
		}
		return null;
	}



	//Welcome_to_Bill_Run_Wizard_text
	public WebElement Welcome_to_Bill_Run_Wizard_text() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Welcome_to_Bill_Run_Wizard_text should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Welcome_to_Bill_Run_Wizard_text")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Welcome_to_Bill_Run_Wizard_text not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Welcome_to_Bill_Run_Wizard_text not displayed-----");
		}
		return null;
	}


	//changes_save_message
	public WebElement changes_save_message() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*changes_save_message should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("changes_save_message")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*changes_save_message not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*changes_save_message not displayed-----");
		}
		return null;
	}





	//pass_change_message
	public WebElement pass_change_message() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*pass_change_message should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("pass_change_message")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*pass_change_message not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*pass_change_message not displayed-----");
		}
		return null;
	}


	//change_password_title
	public WebElement change_password_title() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*change_password_title should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("change_password_title")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*change_password_title not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*change_password_title not displayed-----");
		}
		return null;
	}

	//active_your_account_text
	public WebElement active_your_account_text() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*active_your_account_text should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("active_your_account_text")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*active_your_account_text not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*active_your_account_text not displayed-----");
		}
		return null;
	}


	//email_sent_confirmation_message
	public WebElement email_sent_confirmation_message() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*email_sent_confirmation_message should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("email_sent_confirmation_message")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*email_sent_confirmation_message not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*email_sent_confirmation_message not displayed-----");
		}
		return null;
	}


	//userlist_assertion
	public WebElement userlist_assertion() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*userlist_assertion text should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("userlist_assertion")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*userlist_assertion text not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*userlist_assertion text not displayed-----");
		}
		return null;
	}

	//permission text
	public WebElement permission_text() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*permission_text should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("permission_text")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*permission_text not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*permission_text not displayed-----");
		}
		return null;
	}




	//Start_your_free_trial_by_signing_up
	public WebElement Start_your_free_trial_by_signing_up() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Start_your_free_trial_by_signing_up should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Start_your_free_trial_by_signing_up")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Start_your_free_trial_by_signing_up not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Start_your_free_trial_by_signing_up not displayed-----");
		}
		return null;
	}

	//Overview_text
	public WebElement Overview_text() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Overview_text should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Overview_text")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Overview_text not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Overview_text not displayed-----");
		}
		return null;
	}

	//customer_main_menu
	public WebElement customer_main_menu() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* customer_main_menu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customer_main_menu")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*customer_main_menu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*customer_main_menu not displayed-----");
		}
		return null;
	}
	//logo_home
	public WebElement logo_home() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* logo_home should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("logo_home")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*logo_home not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*logo_home not displayed-----");
		}
		return null;
	}

	//customer_F_name
	public WebElement customer_F_name() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* customer_F_name should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customer_F_name")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*customer_F_name not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*customer_F_name not displayed-----");
		}
		return null;
	}
	//customer_sure_name
	public WebElement customer_sure_name() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* customer_sure_name should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customer_sure_name")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*customer_sure_name not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*customer_sure_name not displayed-----");
		}
		return null;
	}

	// comp_name
	public WebElement company_name()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Company name Field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("comp_name")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Company name Field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Company name Field not displayed-----");
		}
		return null;
	}

	//Category_drop
	public WebElement Category_drop() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Category_drop should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Category_drop")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Category_drop not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Category_drop not displayed-----");
		}
		return null;
	}
	//toggle_button
	public WebElement toggle_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* toggle_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("toggle_button")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*toggle_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*toggle_button not displayed-----");
		}
		return null;
	}
	//tax-type
	//toggle_button
	public WebElement taxTypeplan() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* toggle_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("taxtypedropdown")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*toggle_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*toggle_button not displayed-----");
		}
		return null;
	}


	//address1
	public WebElement cus_address1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* address1 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("address1")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*address1 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*address1 not displayed-----");
		}
		return null;
	}
	//address2
	public WebElement cus_address2() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* address2 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("address2")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*address2 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*address2 not displayed-----");
		}
		return null;
	}

	//Suburb
	public WebElement Suburb() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Suburb should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Suburb")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Suburb not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Suburb not displayed-----");
		}
		return null;
	}
	//City_Town
	public WebElement City_Town() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* City_Town should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("City_Town")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*City_Town not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*City_Town not displayed-----");
		}
		return null;
	}


	//Zip_Code
	public WebElement Zip_Code() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Zip_Code should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Zip_Code")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Zip_Code not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Zip_Code not displayed-----");
		}
		return null;
	}
	//customer_country
	public WebElement customer_country() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* customer_country should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customer_country")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*customer_country not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*customer_country not displayed-----");
		}
		return null;
	}
	//Phone_Mobile
	public WebElement Phone_Mobile() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Phone_Mobile should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Phone_Mobile")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Phone_Mobile not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Phone_Mobile not displayed-----");
		}
		return null;
	}

	//select_plan
	public WebElement select_plan() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* select_plan should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("select_plan")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*select_plan not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*select_plan not displayed-----");
		}
		return null;
	}

	//Email
	public WebElement Email() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Email should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Email")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Email not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Email not displayed-----");
		}
		return null;
	}
	//BEmail
	public WebElement BEmail() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Billing Email should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("BEmail")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Email not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Email not displayed-----");
		}
		return null;
	}

	//save_customer
	public WebElement save_customer() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* save_customer should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("save_customer")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*save_customer not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*save_customer not displayed-----");
		}
		return null;
	}

	//sucessfully_saved_customer_message
	public WebElement sucessfully_saved_customer_message() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* sucessfully_saved_customer_message should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("sucessfully_saved_customer_message")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*sucessfully_saved_customer_message not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*sucessfully_saved_customer_message not displayed-----");
		}
		return null;
	}


	//customer_under_import
	public WebElement customer_under_import() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* customer_under_import should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customer_under_import")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*customer_under_import not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*customer_under_import not displayed-----");
		}
		return null;
	}


	//importdemandReads
	public WebElement importdemandReads() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* importdemandReads should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("importdemandReads")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*importdemandReads not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*importdemandReads not displayed-----");
		}
		return null;
	}

	//importPayment
	public WebElement importPayment() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* importPayment should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("importPayment")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*importPayment not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*importPayment not displayed-----");
		}
		return null;
	}

	//importMeterNumberImport
	public WebElement importMeterNumberImport() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* importMeterNumberImport should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("importMeterNumberImport")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*importMeterNumberImport not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*importMeterNumberImport not displayed-----");
		}
		return null;
	}

	//importManualRecurringCharge
	public WebElement importManualRecurringCharge() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* importManualRecurringCharge should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("importManualRecurringCharge")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*importManualRecurringCharge not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*importManualRecurringCharge not displayed-----");
		}
		return null;
	}

	//importManualOnceOffCharges
	public WebElement importManualOnceOffCharges() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* importManualOnceOffCharges should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("importManualOnceOffCharges")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*importManualOnceOffCharges not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*importManualOnceOffCharges not displayed-----");
		}
		return null;
	}
	//browse_button
	public WebElement browse_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* browse_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("browse_button")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*browse_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*browse_button not displayed-----");
		}
		return null;
	}


	//description
	public WebElement description() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* description should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("description")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*description not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*description not displayed-----");
		}
		return null;
	}



	//Upload_btn
	public WebElement Upload_btn() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Upload_btn should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Upload_btn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Upload_btn not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Upload_btn not displayed-----");
		}
		return null;
	}


	//play_button
	public WebElement play_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* play_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("play_button")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*play_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*play_button not displayed-----");
		}
		return null;
	}

	//Import_Successful
	public WebElement Import_Successful() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Import_Successful should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Import_Successful")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Import_Successful not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Import_Successful not displayed-----");
		}
		return null;
	}	

	//Generic_service_under_import
	public WebElement Generic_service_under_import() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Generic_service_under_import should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Generic_service_under_import")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Generic_service_under_import not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Generic_service_under_import not displayed-----");
		}
		return null;
	}	
	//search_list
	public WebElement search_list() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* search_list should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("search_list")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*search_list not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*search_list not displayed-----");
		}
		return null;
	}				
	//search_list_customer
	public WebElement search_list_customer() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* search_list_customer should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("search_list_customer")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*search_list_customer not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*search_list_customer not displayed-----");
		}
		return null;
	}	
	//select_customer
	public WebElement select_customer() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* select_customer should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("select_customer")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*select_customer not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*select_customer not displayed-----");
		}
		return null;
	}	

	//select_customer_Address
	public WebElement select_customer_address() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* select_customer_address should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customeraddress")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*select_customer__address not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*select_customer_address not displayed-----");
		}
		return null;
	}	

	//search_field
	public WebElement search_field() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* search_field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("search_field")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*search_field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*search_field not displayed-----");
		}
		return null;
	}				
	//search_button
	public WebElement search_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* search_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("search_button")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*search_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*search_button not displayed-----");
		}
		return null;
	}	
	//search_button
	public WebElement ReportTab() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Report Tab should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Reportbutton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Report Tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("Report tab not displayed-----");
		}
		return null;
	}	

	public WebElement Ratingbtn() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Rating button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Ratingbutton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Report Tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("Rating button not displayed-----");
		}
		return null;
	}	

	public WebElement PlanTariffLink() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Plan Tariffs Summary link should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("PlanTariffSummary")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Plan Tariffs Summary link not displayed-----"+e.getLocalizedMessage());
			System.out.println("Plan Tariffs Summary link not displayed-----");
		}
		return null;
	}
	//  //*[@id="tariffOpt"]/input
	public WebElement tariffchecked() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Tariffs Summary link should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Tariffcheckbox")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Plan Tariffs Summary link not displayed-----"+e.getLocalizedMessage());
			System.out.println("Plan Tariffs Summary link not displayed-----");
		}
		return null;
	}
	//Prorataoptn
	public WebElement Prorataoptionchk() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Prorata option checkbox should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Prorataoptn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Plan Tariffs Summary link not displayed-----"+e.getLocalizedMessage());
			System.out.println("Plan Tariffs Summary link not displayed-----");
		}
		return null;
	}

	//  allotpprorata
	public WebElement AllProrataopt() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("All prorated rates checkbox should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AllProrataedrates")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("All prorated rates checkbox not displayed-----"+e.getLocalizedMessage());
			System.out.println("All prorated rates checkbox not displayed-----");
		}
		return null;
	}

	//  NEXTbtn
	public WebElement Nextbutton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("NEXT button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("NEXTbtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("NEXT button not displayed-----"+e.getLocalizedMessage());
			System.out.println("NEXT button not displayed-----");
		}
		return null;
	}
	//SearchPlanfortarif  
	public WebElement enterplan() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Search field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SearchPlanfortarif")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Search field not displayed-----"+e.getLocalizedMessage());
			System.out.println("Search field not displayed-----");
		}
		return null;
	}
	// tariffcode
	public WebElement gettariff()
	{
		try {
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Tariff code value should be display");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("tariffcode")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Tariff code value should be display..."+e.getLocalizedMessage());
			System.out.println();

		} return null;
	}


	//customer address search 1st entry
	public WebElement custadd1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* 1st search customer address should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custadd1")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*1st search customer address not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*1st search customer address not displayed-----");
		}
		return null;
	}	

	//Settings Tab
	public WebElement settingstab() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Settings Tab should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("settingstab")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Settings Tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Settings Tab not displayed-----");
		}
		return null;
	}

	//customer detail page address
	public WebElement detailpageaddress() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* customer detail page address should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("detailpageaddress")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*customer detail page address not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*customer detail page address not displayed-----");
		}
		return null;
	}

	//customer detail select service address
	public WebElement selectservice() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* customer detail page select service address should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("selectservice")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*customer detail page service page address not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*customer detail page select service address not displayed-----");
		}
		return null;
	}

	//customer detail select service address
	public WebElement serviceadd() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* customer no service address should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("serviceadd")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*customer no service page address not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*customer no select service address not displayed-----");
		}
		return null;
	}

	//customer detail service page address
	public WebElement serviceaddress() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* customer detail page service address should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("detailpageaddress")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*customer detail page service address not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*customer detail page service address not displayed-----");
		}
		return null;
	}

	//admincheckBox
	public WebElement admincheckBox() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* admincheckBox should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("admincheckBox")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*admincheckBox not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*admincheckBox not displayed-----");
		}
		return null;
	}

	//admincheckBox
	public WebElement admininquirynow() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* admininquiry now should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("admininquirynow")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*admininquirynow not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*admininquiry not displayed-----");
		}
		return null;
	}


	//searchnewcreatedUser
	public WebElement searchnewcreatedUser() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* searchnewcreatedUser should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchnewcreatedUser")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*searchnewcreatedUser not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*searchnewcreatedUser not displayed-----");
		}
		return null;
	}
	//overview_menu
	public WebElement overview_menu() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* overview_menu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("overview_menu")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*overview_menu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*overview_menu not displayed-----");
		}
		return null;
	}				
	//generic_plus_icon
	public WebElement generic_plus_icon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* generic_plus_icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("generic_plus_icon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*generic_plus_icon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*generic_plus_icon not displayed-----");
		}
		return null;
	}				
	//service_page_header
	public WebElement service_page_header() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* service_page_header should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("service_page_header")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*service_page_header not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*service_page_header not displayed-----");
		}
		return null;
	}	
	//ele_service_page_header
	public WebElement ele_service_page_header() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* ele_service_page_header should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ele_service_page_header")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*ele_service_page_header not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*ele_service_page_header not displayed-----");
		}
		return null;
	}

	//product_description
	public WebElement product_description() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* product_description should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("product_description")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*product_description not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*product_description not displayed-----");
		}
		return null;
	}				
	//protata_date
	public WebElement protata_date() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* protata_date should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("protata_date")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*protata_date not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*protata_date not displayed-----");
		}
		return null;
	}				
	//select_today_date
	public WebElement select_today_date() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* select_today_date should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("select_today_date")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*select_today_date not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*select_today_date not displayed-----");
		}
		return null;
	}				
	//end_date
	public WebElement end_date() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* end_date should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("end_date")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*end_date not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*end_date not displayed-----");
		}
		return null;
	}				
	//next_button_calander
	public WebElement next_button_calander() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* next_button_calander should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("next_button_calander")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*next_button_calander not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*next_button_calander not displayed-----");
		}
		return null;
	}				
	//select_end_date_as    //   /html[1]/body[1]/div[15]/div[1]/table[1]/tbody[1]/tr[5]/td[1]
	public WebElement select_end_date_as() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* select_end_date_as should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("select_end_date_as")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*select_end_date_as not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*select_end_date_as not displayed-----");
		}
		return null;
	}	
	public WebElement select_end_date_2nd() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* select_end_date_as should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("select_end_date_2nd")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*select_end_date_as not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*select_end_date_as not displayed-----");
		}
		return null;
	}	
	//quantity
	public WebElement quantity() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* quantity should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("quantity")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*quantity not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*quantity not displayed-----");
		}
		return null;
	}				

	//charge_typr_drop_drop
	public WebElement charge_typr_drop_drop() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* charge_typr_drop_drop should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("charge_typr_drop_drop")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*charge_typr_drop_drop not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*charge_typr_drop_drop not displayed-----");
		}
		return null;
	}				
	//unit_type_drop
	public WebElement unit_type_drop() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* unit_type_drop should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("unit_type_drop")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*unit_type_drop not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*unit_type_drop not displayed-----");
		}
		return null;
	}				
	//rate
	public WebElement rate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* rate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*rate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*rate not displayed-----");
		}
		return null;
	}				

	//saveSrv
	public WebElement saveSrv() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* saveSrv should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("saveSrv")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*saveSrv not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*saveSrv not displayed-----");
		}
		return null;
	}	
	//updateSev
	public WebElement updateSev() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* updateSev should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("updateSev")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*updateSev not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*updateSev not displayed-----");
		}
		return null;
	}


	//finishBtn
	public WebElement finishBtn() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* finishBtn should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("finishBtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*finishBtn not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*finishBtn not displayed-----");
		}
		return null;
	}				
	//generic_services_header
	public WebElement generic_services_header() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* generic_services_header should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("generic_services_header")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*generic_services_header not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*generic_services_header not displayed-----");
		}
		return null;
	}				
	//services_mainMenu
	public WebElement services_mainMenu() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* services_mainMenu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("services_mainMenu")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*services_mainMenu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*services_mainMenu not displayed-----");
		}
		return null;
	}				
	//generic_servic_search
	public WebElement generic_servic_search() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* generic_servic_search should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("generic_servic_search")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*generic_servic_search not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*generic_servic_search not displayed-----");
		}
		return null;
	}				
	//generic_edit_button
	public WebElement generic_edit_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* generic_edit_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("generic_edit_button")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*generic_edit_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*generic_edit_button not displayed-----");
		}
		return null;
	}				

	//water_plus_icon
	public WebElement water_plus_icon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* water_plus_icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("water_plus_icon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*water_plus_icon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*water_plus_icon not displayed-----");
		}
		return null;
	}	

	//water_service_page_header
	public WebElement water_service_page_header() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* water_service_page_header should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("water_service_page_header")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*water_service_page_header not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*water_service_page_header not displayed-----");
		}
		return null;
	}	

	//plan_drop_down
	public WebElement plan_drop_down() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* plan_drop_down should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("plan_drop_down")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*plan_drop_down not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*plan_drop_down not displayed-----");
		}
		return null;
	}				
	//meterConfig_drop_down
	public WebElement meterConfig_drop_down() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* meterConfig_drop_down should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterConfig_drop_down")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*meterConfig_drop_down not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*meterConfig_drop_down not displayed-----");
		}
		return null;
	}				
	//readding_drop_down
	public WebElement readding_drop_down() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* readding_drop_down should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("readding_drop_down")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*readding_drop_down not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*readding_drop_down not displayed-----");
		}
		return null;
	}				
	//meter_number
	public WebElement meter_number() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* meter_number should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meter_number")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*meter_number not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*meter_number not displayed-----");
		}
		return null;
	}				
	//create_service_button
	public WebElement create_service_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* create_service_button should be displayed");
			WebElement ele = driver.findElement(objMap.getLocator("create_service_button"));
			return ele;

		} catch (Exception e) {
			Reporter.log("*create_service_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*create_service_button not displayed-----");
		}
		return null;
	}				
	//utilities_header
	public WebElement utilities_header() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* utilities_header should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("utilities_header")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*utilities_header not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*utilities_header not displayed-----");
		}
		return null;
	}				
	//water_edit_icon
	public WebElement water_edit_icon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* water_edit_icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("water_edit_icon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*water_edit_icon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*water_edit_icon not displayed-----");
		}
		return null;
	}		

	//Search_utility
	public WebElement SearchUtility() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* SearchUtility should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SearchUtility")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*SearchUtility not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*SearchUtility not displayed-----");
		}
		return null;
	}		

	//Edit_Gas_utility
	public WebElement gas_edit_icon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* gas_Manage_icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("gas_edit_icon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*gas_Manage_icon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*gas_Manage_icon not displayed-----");
		}
		return null;
	}

	//Gas_heating_Value
	public WebElement gas_Heating_Value() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* gas_Heating_Value should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("gasHeatingValue")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*gas_Heating_Value not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*gas_Heating_Value not displayed-----");
		}
		return null;
	}
	//Gas_heating_Value
	public WebElement gaspressurefactor() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* gas pressure factor should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("gaspressurefactor")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*gas pressure factor not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*gas pressure factor not displayed-----");
		}
		return null;
	}
	//walkOrder
	public WebElement walkOrder() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* walkOrder should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("walkOrder")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*walkOrder not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*walkOrder not displayed-----");
		}
		return null;
	}				
	//meterSize
	public WebElement meterSize() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* meterSize should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterSize")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*meterSize not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*meterSize not displayed-----");
		}
		return null;
	}				
	//moveout_water
	public WebElement moveout_water() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* moveout_water should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("watermoveOut")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*moveout_water not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*moveout_water not displayed-----");
		}
		return null;
	}				
	//electricity_plus_icon
	public WebElement electricity_plus_icon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* electricity_plus_icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("electricity_plus_icon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*electricity_plus_icon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*electricity_plus_icon not displayed-----");
		}
		return null;
	}	

	//electricity_edit_icon
	public WebElement electricity_edit_icon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* electricity_edit_icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("electricity_edit_icon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*electricity_edit_icon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*electricity_edit_icon not displayed-----");
		}
		return null;
	}				

	//gas_plus_icon
	public WebElement gas_plus_icon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* gas_plus_icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("gas_plus_icon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*gas_plus_icon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*gas_plus_icon not displayed-----");
		}
		return null;
	}
	//Gas_plus_icon
	public WebElement Gas_plus_icon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* gas_plus_icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("gass_plus_icon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*gas_plus_icon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*gas_plus_icon not displayed-----");
		}
		return null;
	}









	//gas_service_page
	public WebElement gas_service_page() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* gas_service_page should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("gas_service_page")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*gas_service_page not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*gas_service_page not displayed-----");
		}
		return null;
	}






	//threephase
	public WebElement threephase() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* threephase should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("threephase")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*threephase not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*threephase not displayed-----");
		}
		return null;
	}				
	//kFactor
	public WebElement kFactor() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* kFactor should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("kFactor")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*kFactor not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*kFactor not displayed-----");
		}
		return null;
	}				
	//gasCook
	public WebElement gasCook() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* gasCook should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("gasCook")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*gasCook not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*gasCook not displayed-----");
		}
		return null;
	}				
	//notes
	public WebElement notes() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* notes should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("notes")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*notes not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*notes not displayed-----");
		}
		return null;
	}				

	//gasnotes
	public WebElement gasnotes() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* gas notes should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("gasnotes")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*gas notes not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*gas notes not displayed-----");
		}
		return null;
	}	
	//once_description
	public WebElement once_description() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* once_description should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("once_description")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*once_description not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*once_description not displayed-----");
		}
		return null;
	}	
	//rollupDescription
	public WebElement rollupDescription() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* rollupDescription should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rollupDescription")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*rollupDescription not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*rollupDescription not displayed-----");
		}
		return null;
	}	

	//set_pro_rata_button
	public WebElement set_pro_rata_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* set_pro_rata_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("set_pro_rata_button")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*set_pro_rata_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*set_pro_rata_button not displayed-----");
		}
		return null;
	}				
	//new_prorata_date
	public WebElement new_prorata_date() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* new_prorata_date should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("new_prorata_date")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*new_prorata_date not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*new_prorata_date not displayed-----");
		}
		return null;
	}				
	//set_prorata_button
	public WebElement set_prorata_button_to_save() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* set_prorata_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("set_prorata_button")));
			return ele;



		} catch (Exception e) {
			Reporter.log("*set_prorata_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*set_prorata_button not displayed-----");
		}
		return null;
	}				
	//electricity_moveout_button
	public WebElement electricity_moveout_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* electricity_moveout_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("moveout_button")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*electricity_moveout_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*electricity_moveout_button not displayed-----");
		}
		return null;
	}				
	//moveout_date
	public WebElement moveout_date() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* moveout_date should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("moveout_date")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*moveout_date not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*moveout_date not displayed-----");
		}
		return null;
	}				
	//select_moveout_date
	public WebElement select_moveout_date() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* select_moveout_date should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("select_moveout_date")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*select_moveout_date not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*select_moveout_date not displayed-----");
		}
		return null;
	}				
	//final_read_date
	public WebElement final_read_date() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* final_read_date should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("final_read_date")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*final_read_date not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*final_read_date not displayed-----");
		}
		return null;
	}				
	//final_rate
	public WebElement final_rate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* final_rate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("final_rate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*final_rate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*final_rate not displayed-----");
		}
		return null;
	}				

	//changemeter_button
	public WebElement changemeter_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Change Meter_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("changemeter")));
			return ele;


		} catch (Exception e) {
			Reporter.log("*Change Meter_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Change Meter_button not displayed-----");
		}
		return null;
	}	

	//changemeter_notes
	public WebElement changemeter_notes() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Change Meter_notes should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("changemeternotes")));
			return ele;


		} catch (Exception e) {
			Reporter.log("*Change Meter_notes not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Change Meter_notes not displayed-----");
		}
		return null;
	}

	//changemeter_confirm
	public WebElement confirmChange() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Change Meter_confirm should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("confirmChange")));
			return ele;


		} catch (Exception e) {
			Reporter.log("*Change Meter_confirm not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Change Meter_confirm not displayed-----");
		}
		return null;
	}

	//changemeterpage
	public WebElement changemeterpage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* change meter page should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("changemeterpage")));
			return ele;


		} catch (Exception e) {
			Reporter.log("*change meter page not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*change meter page not displayed-----");
		}
		return null;
	}

	//New Meter Number
	public WebElement newmeterno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* New meter Number should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("nwmtrno")));
			return ele;


		} catch (Exception e) {
			Reporter.log("*New meter Number not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*New meter Number not displayed-----");
		}
		return null;
	}

	//continueMoveOut_button
	public WebElement continueMoveOut_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* continueMoveOut_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("continueMoveOut_button")));
			return ele;


		} catch (Exception e) {
			Reporter.log("*continueMoveOut_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*continueMoveOut_button not displayed-----");
		}
		return null;
	}				
	//water_service_details
	public WebElement water_service_details() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* water_service_details should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("water_service_details")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*water_service_details not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*water_service_details not displayed-----");
		}
		return null;
	}				
	//service_save_message
	public WebElement service_save_message() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* service_save_message should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("service_save_message")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*service_save_message not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*service_save_message not displayed-----");
		}
		return null;
	}				


	//select_update_end_date_as
	public WebElement select_update_end_date_as() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* select_update_end_date_as should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("select_update_end_date_as")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*select_update_end_date_as not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*select_update_end_date_as not displayed-----");
		}
		return null;
	}

	//customer_number
	public WebElement customer_number() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* customer_number should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customer_number")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*customer_number not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*customer_number not displayed-----");
		}
		return null;
	}
	//Meter_Reads_mainMenu
	public WebElement Meter_Reads_mainMenu() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Meter_Reads_mainMenu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Meter_Reads_mainMenu")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Meter_Reads_mainMenu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Meter_Reads_mainMenu not displayed-----");
		}
		return null;
	}				
	//MeterNoForMeterReading
	public WebElement MeterNoForMeterReading() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* MeterNoForMeterReading should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("MeterNoForMeterReading")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*MeterNoForMeterReading not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*MeterNoForMeterReading not displayed-----");
		}
		return null;
	}				
	//addReadButton
	public WebElement addReadButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* addReadButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("addReadButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*addReadButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*addReadButton not displayed-----");
		}
		return null;
	}				
	//AddMeterReadPopupText
	public WebElement AddMeterReadPopupText() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* AddMeterReadPopupText should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AddMeterReadPopupText")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*AddMeterReadPopupText not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*AddMeterReadPopupText not displayed-----");
		}
		return null;
	}				
	//readTypeDropDown
	public WebElement readTypeDropDown() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* readTypeDropDown should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("readTypeDropDown")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*readTypeDropDown not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*readTypeDropDown not displayed-----");
		}
		return null;
	}				
	//Meter_readdate
	public WebElement Meter_readdate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Meter_readdate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Meter_readdate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Meter_readdate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Meter_readdate not displayed-----");
		}
		return null;
	}				
	//Meter_Read
	public WebElement Meter_Read() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Meter_Read should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Meter_Read")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Meter_Read not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Meter_Read not displayed-----");
		}
		return null;
	}

	//save_Read_button
	public WebElement save_Read_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* save_Read_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("save_Read_button")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*save_Read_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*save_Read_button not displayed-----");
		}
		return null;
	}
	//save_demandRead_button
	public WebElement save_demandRead_button() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* save_demandRead_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("save_demandRead_button")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*save_demandRead_button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*save_demandRead_button not displayed-----");
		}
		return null;
	}

	//demandRead
	public WebElement demandRead() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* demandRead should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("demandRead")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*demandRead not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*demandRead not displayed-----");
		}
		return null;
	}				
	//addDemandReadButton
	public WebElement addDemandReadButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* addDemandReadButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("addDemandReadButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*addDemandReadButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*addDemandReadButton not displayed-----");
		}
		return null;
	}				
	//demandtypeDropDown
	public WebElement demandtypeDropDown() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* demandtypeDropDown should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("demandtypeDropDown")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*demandtypeDropDown not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*demandtypeDropDown not displayed-----");
		}
		return null;
	}				
	//DemandReadDate
	public WebElement DemandReadDate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* DemandReadDate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("DemandReadDate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*DemandReadDate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*DemandReadDate not displayed-----");
		}
		return null;
	}				
	//timeofDemandRead
	public WebElement timeofDemandRead() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* timeofDemandRead should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("timeofDemandRead")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*timeofDemandRead not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*timeofDemandRead not displayed-----");
		}
		return null;
	}				
	//increase_demand_readTime
	public WebElement increase_demand_readTime() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* increase_demand_readTime should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("increase_demand_readTime")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*increase_demand_readTime not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*increase_demand_readTime not displayed-----");
		}
		return null;
	}				
	//demandReading
	public WebElement demandReading() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* demandReading should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("demandReading")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*demandReading not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*demandReading not displayed-----");
		}
		return null;
	}				
	//reading_comment
	public WebElement reading_comment() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* reading_comment should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reading_comment")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*reading_comment not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*reading_comment not displayed-----");
		}
		return null;
	}				
	//demandReadSaveButton
	public WebElement demandReadSaveButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* demandReadSaveButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("demandReadSaveButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*demandReadSaveButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*demandReadSaveButton not displayed-----");
		}
		return null;
	}

	//viewRead_Text
	public WebElement viewRead_Text() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* viewRead_Text should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("viewRead_Text")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*viewRead_Text not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*viewRead_Text not displayed-----");
		}
		return null;
	}

	//Payment_mainMenu
	public WebElement Payment_mainMenu() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Payment_mainMenu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Payment_mainMenu")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Payment_mainMenu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Payment_mainMenu not displayed-----");
		}
		return null;
	}			
	//transaction_type_DropDown
	public WebElement transaction_type_DropDown() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* transaction_type_DropDown should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("transaction_type_DropDown")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*transaction_type_DropDown not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*transaction_type_DropDown not displayed-----");
		}
		return null;
	}			
	//Payment_method_dropDown
	public WebElement Payment_method_dropDown() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Payment_method_dropDown should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Payment_method_dropDown")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Payment_method_dropDown not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Payment_method_dropDown not displayed-----");
		}
		return null;
	}			
	//transactionDate
	public WebElement transactionDate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* transactionDate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("transactionDate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*transactionDate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*transactionDate not displayed-----");
		}
		return null;
	}			
	//PaymentAmount
	public WebElement PaymentAmount() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* PaymentAmount should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("PaymentAmount")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*PaymentAmount not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*PaymentAmount not displayed-----");
		}
		return null;
	}			
	//duplicate_payment_chechBox
	public WebElement duplicate_payment_chechBox() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* duplicate_payment_chechBox should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("duplicate_payment_chechBox")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*duplicate_payment_chechBox not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*duplicate_payment_chechBox not displayed-----");
		}
		return null;
	}			
	//comments
	public WebElement comments() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* comments should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("comments")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*comments not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*comments not displayed-----");
		}
		return null;
	}			
	//MakePaymentButton
	public WebElement MakePaymentButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* MakePaymentButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("MakePaymentButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*MakePaymentButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*MakePaymentButton not displayed-----");
		}
		return null;
	}			
	//Transaction_processed_successfully
	public WebElement Transaction_processed_successfully() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Transaction_processed_successfully should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Transaction_processed_successfully")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Transaction_processed_successfully not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Transaction_processed_successfully not displayed-----");
		}
		return null;
	}			
	//Transaction_processed_successfullyact
	public WebElement Transaction_processed_successfullyact() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Transaction_processed_successfullyact button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Transaction_processed_successfullyact")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Transaction_processed_successfullyact message not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Transaction_processed_successfullyact message not displayed-----");
		}
		return null;
	}	
	//makenewpayment
	public WebElement makenewpayment() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* makenewpayment button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("makenewpayment")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*makenewpayment button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*makenewpayment button not displayed-----");
		}
		return null;
	}	
	//viewhistory
	public WebElement viewhistory() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* viewhistory button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("viewhistory")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*viewhistory button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*viewhistory button not displayed-----");
		}
		return null;
	}	
	//ChargesMainMenu
	public WebElement ChargesMainMenu() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* ChargesMainMenu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ChargesMainMenu")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*ChargesMainMenu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*ChargesMainMenu not displayed-----");
		}
		return null;
	}			
	//ChargesPlusIcon
	public WebElement ChargesPlusIcon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* OnceoffChargesPlusIcon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("OnceoffChargesPlusIcon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*OnceoffChargesPlusIcon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*OnceoffChargesPlusIcon not displayed-----");
		}
		return null;
	}			
	//select_service
	public WebElement select_service() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* select_service should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("select_service")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*select_service not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*select_service not displayed-----");
		}
		return null;
	}			
	//changes_description_dropDown
	public WebElement changes_description_dropDown() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* changes_description_dropDown should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("changes_description_dropDown")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*changes_description_dropDown not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*changes_description_dropDown not displayed-----");
		}
		return null;
	}			
	//ChargeStartDate
	public WebElement ChargeStartDate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* ChargeStartDate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ChargeStartDate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*ChargeStartDate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*ChargeStartDate not displayed-----");
		}
		return null;
	}			
	//ChargesEndDate
	public WebElement ChargesEndDate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* ChargesEndDate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ChargesEndDate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*ChargesEndDate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*ChargesEndDate not displayed-----");
		}
		return null;
	}			
	//charges_unit
	public WebElement charges_unit() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* charges_unit should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("charges_unit")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*charges_unit not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*charges_unit not displayed-----");
		}
		return null;
	}			
	//ChargesRate
	public WebElement ChargesRate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* ChargesRate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ChargesRate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*ChargesRate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*ChargesRate not displayed-----");
		}
		return null;
	}			
	//Charges
	public WebElement Charges() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Charges should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Charges")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Charges not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Charges not displayed-----");
		}
		return null;
	}			
	//ChargesSaveButton
	public WebElement ChargesSaveButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* ChargesSaveButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ChargesSaveButton")));
			return ele;	
		} catch (Exception e) {
			/*Reporter.log("*ChargesSaveButton not displayed-----"+e.getLocalizedMessage());
						System.out.println("	*ChargesSaveButton not displayed-----");*/
		}
		return null;
	}			
	//AllDrop_Down
	public WebElement AllDrop_Down()//
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* AllDrop_Down should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AllDrop_Down")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*AllDrop_Down not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*AllDrop_Down not displayed-----");
		}
		return null;
	}			
	//meterNo_OnCharges_page
	public WebElement meterNo_OnCharges_page() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* meterNo_OnCharges_page should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterNo_OnCharges_page")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*meterNo_OnCharges_page not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*meterNo_OnCharges_page not displayed-----");
		}
		return null;
	}			
	//RecurringChargesDesacriptionDrop
	public WebElement RecurringChargesDesacriptionDrop() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* RecurringChargesDesacriptionDrop should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("RecurringChargesDesacriptionDrop")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*RecurringChargesDesacriptionDrop not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*RecurringChargesDesacriptionDrop not displayed-----");
		}
		return null;
	}			
	//No_of_period
	public WebElement No_of_period() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* No_of_period should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("No_of_period")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*No_of_period not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*No_of_period not displayed-----");
		}
		return null;
	}			
	//ongoing_CheckBox
	public WebElement ongoing_CheckBox() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* ongoing_CheckBox should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ongoing_CheckBox")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*ongoing_CheckBox not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*ongoing_CheckBox not displayed-----");
		}
		return null;
	}			
	//RecurringChargeAmount
	public WebElement RecurringChargeAmount() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* RecurringChargeAmount should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("RecurringChargeAmount")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*RecurringChargeAmount not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*RecurringChargeAmount not displayed-----");
		}
		return null;
	}		
	//plan_mainmebu
	public WebElement plan_mainmebu() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* plan_mainmebu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("plan_mainmebu")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*plan_mainmebu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*plan_mainmebu not displayed-----");
		}
		return null;
	}		
	//searchPlanField
	public WebElement searchPlanField() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* searchPlanField should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchPlanField")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*searchPlanField not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*searchPlanField not displayed-----");
		}
		return null;
	}		
	//PlanEditIcon
	public WebElement PlanEditIcon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* PlanEditIcon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("PlanEditIcon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*PlanEditIcon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*PlanEditIcon not displayed-----");
		}
		return null;
	}		
	//TarifEditIcon
	public WebElement TarifEditIcon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* TarifEditIcon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("TarifEditIcon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*TarifEditIcon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*TarifEditIcon not displayed-----");
		}
		return null;
	}		
	//   AddTerifButton
	public WebElement updateTerifButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* updateTerifButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AddTerifButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*updateTerifButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*updateTerifButton not displayed-----");
		}
		return null;
	}		
	//getPlanUpdateRate
	public WebElement getPlanUpdateRate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* getPlanUpdateRate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("getPlanUpdateRate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*getPlanUpdateRate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*getPlanUpdateRate not displayed-----");
		}
		return null;
	}



	//PublicshButton
	public WebElement PublicshButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* PublicshButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("PublicshButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*PublicshButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*PublicshButton not displayed-----");
		}
		return null;
	}


	//X
	public WebElement X() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* X should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("X")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*X not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*X not displayed-----");
		}
		return null;
	}	

	//createNewPlan
	public WebElement createNewPlan() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* createNewPlan should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("createNewPlan")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*createNewPlan not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*createNewPlan not displayed-----");
		}
		return null;
	}

	//planGroup
	public WebElement planGroup() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* planGroup should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("planGroup")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*planGroup not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*planGroup not displayed-----");
		}
		return null;
	}

	//planUsageType
	public WebElement planUsageType() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* planUsageType should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("planUsageType")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*planUsageType  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*planUsageType  not displayed-----");
		}
		return null;
	}

	//planName
	public WebElement planName() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* planName should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("planName")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*planName not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*planName not displayed-----");
		}
		return null;
	}

	//planStartDate
	public WebElement planStartDate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* planStartDate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("planStartDate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*planStartDate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*planStartDate not displayed-----");
		}
		return null;
	}
	//calanderPreviousButton
	public WebElement calanderPreviousButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* calanderPreviousButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("calanderPreviousButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*calanderPreviousButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*calanderPreviousButton not displayed-----");
		}
		return null;
	}
	//PlanEndDate
	public WebElement PlanEndDate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* PlanEndDate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("PlanEndDate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*PlanEndDate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*PlanEndDate not displayed-----");
		}
		return null;
	}
	//getplanName
	public WebElement getplanNameon_popup() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* getplanNameon_popup should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("getplanNameon_popup")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*getplanNameon_popup not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*getplanNameon_popup not displayed-----");
		}
		return null;
	}
	//addTrfBtn
	public WebElement addTrfBtn() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* addTrfBtn should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("addTrfBtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*addTrfBtn not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*addTrfBtn not displayed-----");
		}
		return null;
	}
	//charge_desc
	public WebElement charge_desc() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* charge_desc should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("charge_desc")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*charge_desc not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*charge_desc not displayed-----");
		}
		return null;
	}
	//rollup_desc
	public WebElement rollup_desc() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* rollup_desc should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rollup_desc")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*rollup_desc not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*rollup_desc not displayed-----");
		}
		return null;
	}
	//charge_type
	public WebElement charge_type() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* charge_type should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("charge_type")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*charge_type not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*charge_type not displayed-----");
		}
		return null;
	}
	//method_type
	public WebElement method_type() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* method_type should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("method_type")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*method_type not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*method_type not displayed-----");
		}
		return null;
	}
	//unit_type
	public WebElement unit_type() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* unit_type should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("unit_type")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*unit_type not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*unit_type not displayed-----");
		}
		return null;
	}
	//rateonmonthlyTeriff
	public WebElement rateonmonthlyTeriff() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* rateonmonthlyTeriff should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rateonmonthlyTeriff")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*rateonmonthlyTeriff not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*rateonmonthlyTeriff not displayed-----");
		}
		return null;
	}
	//from
	public WebElement from() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* from should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("from")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*from not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*from not displayed-----");
		}
		return null;
	}
	//to
	public WebElement to() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* to should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("to")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*to not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*to not displayed-----");
		}
		return null;
	}
	//addRangeBtn
	public WebElement addRangeBtn() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* addRangeBtn should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("addRangeBtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*addRangeBtn not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*addRangeBtn not displayed-----");
		}
		return null;
	}

	//RatePlansPage_Title
	public WebElement RatePlansPage_Title() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* RatePlansPage_Title should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("RatePlansPage_Title")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*RatePlansPage_Title not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*RatePlansPage_Title not displayed-----");
		}
		return null;
	}

	//plan_created
	public WebElement plan_created() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Autocreated plan should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("plan_created")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Autocreated plan not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Auto created plan not displayed-----");
		}
		return null;
	}

	//planpopupheader
	public WebElement planpopupheader() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* planpopupheader should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("planpopupheader")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*planpopupheader not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*planpopupheader not displayed-----");
		}
		return null;
	}
	//planNameonPlanPage
	public WebElement planNameonPlanPage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* planNameonPlanPage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("planNameonPlanPage")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*planNameonPlanPage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*planNameonPlanPage not displayed-----");
		}
		return null;
	}


	//getplanNumber
	public WebElement getplanNumber() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* getplanNumber should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("getplanNumber")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*getplanNumber not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*getplanNumber not displayed-----");
		}
		return null;
	}


	//billRunMainMenu
	public WebElement billRunMainMenu() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* billRunMainMenu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("billRunMainMenu")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*billRunMainMenu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*billRunMainMenu not displayed-----");
		}
		return null;
	}

	//viewButton
	public WebElement viewButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,120);
			System.out.println("	* viewButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("viewButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*viewButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*viewButton not displayed-----");
		}
		return null;
	}
	//select_allcheck
	public WebElement select_allcheck() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* select_allcheck should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("select_allcheck")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*select_allcheck not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*select_allcheck not displayed-----");
		}
		return null;
	}
	//emailDrop_down
	public WebElement emailDrop_down() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* emailDrop_down should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("emailDrop_down")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*emailDrop_down not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*emailDrop_down not displayed-----");
		}
		return null;
	}
	//allcutomerforemail
	public WebElement allcutomerforemail() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* allcutomerforemail should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("allcutomerforemail")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*allcutomerforemail not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*allcutomerforemail not displayed-----");
		}
		return null;
	}
	//Continue_email
	public WebElement Continue_email() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Continue_email should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Continue_email")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Continue_email not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Continue_email not displayed-----");
		}
		return null;
	}
	//closeemail
	public WebElement closeemail() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* closeemail should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("closeemail")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*closeemail not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*closeemail not displayed-----");
		}
		return null;
	}
	//closeBillrun
	public WebElement closeBillrun() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* closeBillrun should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("closeBillrun")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*closeBillrun not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*closeBillrun not displayed-----");
		}
		return null;
	}
	//yesButton
	public WebElement yesButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* yesButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("yesButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*yesButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*yesButton not displayed-----");
		}
		return null;
	}
	//billRunsearchButton
	public WebElement billRunsearchButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* billRunsearchButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("billRunsearchButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*billRunsearchButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*billRunsearchButton not displayed-----");
		}
		return null;
	}
	//viewDetailsIcon
	public WebElement viewDetailsIcon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* viewDetailsIcon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("viewDetailsIcon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*viewDetailsIcon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*viewDetailsIcon not displayed-----");
		}
		return null;
	}
	//statementPageHeader
	public WebElement statementPageHeader() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* statementPageHeader should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("statementPageHeader")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*statementPageHeader not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*statementPageHeader not displayed-----");
		}
		return null;
	}
	//downloadDropDown
	public WebElement downloadDropDown() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* downloadDropDown should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("downloadDropDown")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*downloadDropDown not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*downloadDropDown not displayed-----");
		}
		return null;
	}
	//downloadSelected
	public WebElement downloadSelected() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* downloadSelected should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("downloadSelected")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*downloadSelected not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*downloadSelected not displayed-----");
		}
		return null;
	}
	//downloadbutton
	public WebElement downloadbutton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* downloadbutton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("downloadbutton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*downloadbutton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*downloadbutton not displayed-----");
		}
		return null;
	}
	//commitButton
	public WebElement commitButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* commitButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("commitButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*commitButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*commitButton not displayed-----");
		}
		return null;
	}
	//Continue_commit
	public WebElement Continue_commit() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Continue_commit should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Continue_commit")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Continue_commit not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Continue_commit not displayed-----");
		}
		return null;
	}
	//commitmessage
	public WebElement commitmessage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* commitmessage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("commitmessage")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*commitmessage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*commitmessage not displayed-----");
		}
		return null;
	}
	//smtpmainmenu
	public WebElement smtpmainmenu() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* smtpmainmenu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("smtpmainmenu")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*smtpmainmenu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*smtpmainmenu not displayed-----");
		}
		return null;
	}
	//smtpPageTitle
	public WebElement smtpPageTitle() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* smtpPageTitle should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("smtpPageTitle")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*smtpPageTitle not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*smtpPageTitle not displayed-----");
		}
		return null;
	}
	//server
	public WebElement server() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* server should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("server")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*server not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*server not displayed-----");
		}
		return null;
	}
	//port
	public WebElement port() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* port should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("port")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*port not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*port not displayed-----");
		}
		return null;
	}
	//portcheck
	public WebElement smtpcheck() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* smtp checkbox should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("smtpcheck")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*smtp checkbox not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*smtp checkbox not displayed-----");
		}
		return null;
	}
	//smtp_username
	public WebElement smtp_username() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* smtp_username should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("smtp_username")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*smtp_username not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*smtp_username not displayed-----");
		}
		return null;
	}
	//smtp_password
	public WebElement smtp_password() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* smtp_password should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("smtp_password")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*smtp_password not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*smtp_password not displayed-----");
		}
		return null;
	}
	//updateSMTP
	public WebElement updateSMTP() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* updateSMTP should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("updateSMTP")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*updateSMTP not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*updateSMTP not displayed-----");
		}
		return null;
	}
	//SMTPSucessfullMessage
	public WebElement SMTPSucessfullMessage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* SMTPSucessfullMessage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SMTPSucessfullMessage")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*SMTPSucessfullMessage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*SMTPSucessfullMessage not displayed-----");
		}
		return null;
	}
	//Templatesmainmenu
	public WebElement Templatesmainmenu() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Templatesmainmenu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Templatesmainmenu")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Templatesmainmenu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Templatesmainmenu not displayed-----");
		}
		return null;
	}
	//email_message_type
	public WebElement email_message_type() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* email_message_type should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("email_message_type")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*email_message_type not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*email_message_type not displayed-----");
		}
		return null;
	}

	//select_route
	public WebElement select_route() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Route dropdown should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("metersicon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Route dropdown not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Route dropdown not displayed-----");
		}
		return null;
	}

	//nextbuttonmrs
	public WebElement nextbuttonmrs() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Next Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("nextbuttonmrs")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Next Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Next Button not displayed-----");
		}
		return null;
	}

	//reportsname
	public WebElement reportsname() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Reports page should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reportsname")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Reports page not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Reports page not displayed-----");
		}
		return null;
	}

	//meters report page
	public WebElement meterspage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Meters Reports page should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterspage")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Meter Reports page not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Meter Reports page not displayed-----");
		}
		return null;
	}

	//meters report page
	public WebElement mrssearch() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*MRS Search should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mrssearch")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*MRS Search not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*MRS Search not displayed-----");
		}
		return null;
	}

	//email_rem_from
	public WebElement email_rem_from() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* email_rem_from should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("email_rem_from")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*email_rem_from not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*email_rem_from not displayed-----");
		}
		return null;
	}
	//email_SaveButton
	public WebElement email_SaveButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* email_SaveButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("email_SaveButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*email_SaveButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*email_SaveButton not displayed-----");
		}
		return null;
	}

	//templateEmailsucessfulMessage
	public WebElement templateEmailsucessfulMessage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* templateEmailsucessfulMessage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("templateEmailsucessfulMessage")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*templateEmailsucessfulMessage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*templateEmailsucessfulMessage not displayed-----");
		}
		return null;
	}
	//smsTab
	public WebElement smsTab() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* smsTab should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("smsTab")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*smsTab not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*smsTab not displayed-----");
		}
		return null;
	}
	//sms_message_type
	public WebElement sms_message_type() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* sms_message_type should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("sms_message_type")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*sms_message_type not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*sms_message_type not displayed-----");
		}
		return null;
	}
	//sms_saveButton
	public WebElement sms_saveButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* sms_saveButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("sms_saveButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*sms_saveButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*sms_saveButton not displayed-----");
		}
		return null;
	}
	//templateSMSsucessfulmessage
	public WebElement templateSMSsucessfulmessage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* templateSMSsucessfulmessage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("templateSMSsucessfulmessage")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*templateSMSsucessfulmessage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*templateSMSsucessfulmessage not displayed-----");
		}
		return null;
	}
	//detailsCustomerTab
	public WebElement detailsCustomerTab() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* detailsCustomerTab should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("detailsCustomerTab")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*detailsCustomerTab not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*detailsCustomerTab not displayed-----");
		}
		return null;
	}
	//accounttypetextUnderDetailsCustomerMenu
	public WebElement accounttypetextUnderDetailsCustomerMenu() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* accounttypetextUnderDetailsCustomerMenu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("accounttypetextUnderDetailsCustomerMenu")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*accounttypetextUnderDetailsCustomerMenu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*accounttypetextUnderDetailsCustomerMenu not displayed-----");
		}
		return null;
	}

	//old invoice section				
	//invoice_setup
	public WebElement invoice_setup() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* invoice_setup should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("invoice_setup")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*invoice_setup not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*invoice_setup not displayed-----");
		}
		return null;
	}				//createNewInvoice
	public WebElement createNewInvoice() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* createNewInvoice should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("createNewInvoice")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*createNewInvoice not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*createNewInvoice not displayed-----");
		}
		return null;
	}				//invoiceName
	public WebElement invoiceName() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* invoiceName should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("invoiceName")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*invoiceName not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*invoiceName not displayed-----");
		}
		return null;
	}				//maincheck
	public WebElement maincheck() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* maincheck should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("maincheck")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*maincheck not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*maincheck not displayed-----");
		}
		return null;
	}				//chargeCheck
	public WebElement chargeCheck() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* chargeCheck should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("chargeCheck")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*chargeCheck not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*chargeCheck not displayed-----");
		}
		return null;
	}				//listcheck
	public WebElement listcheck() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* listcheck should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("listcheck")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*listcheck not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*listcheck not displayed-----");
		}
		return null;
	}				//itemCheck
	public WebElement itemCheck() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* itemCheck should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("itemCheck")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*itemCheck not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*itemCheck not displayed-----");
		}
		return null;
	}				//itemlistheadercheck
	public WebElement itemlistheadercheck() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* itemlistheadercheck should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("itemlistheadercheck")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*itemlistheadercheck not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*itemlistheadercheck not displayed-----");
		}
		return null;
	}				//ITEMIZATION_LIST
	public WebElement ITEMIZATION_LIST() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* ITEMIZATION_LIST should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ITEMIZATION_LIST")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*ITEMIZATION_LIST not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*ITEMIZATION_LIST not displayed-----");
		}
		return null;
	}				//GRAPH
	public WebElement GRAPH() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* GRAPH should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("GRAPH")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*GRAPH not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*GRAPH not displayed-----");
		}
		return null;
	} 
	//GRAPH_IMAGE
	public WebElement GRAPH_IMAGE() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* GRAPH_IMAGE should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("GRAPH_IMAGE")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*GRAPH_IMAGE not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*GRAPH_IMAGE not displayed-----");
		}
		return null;
	}		
	public WebElement EziDebit_BPay() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* EziDebit_BPay should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("EziDebit_BPay")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*EziDebit_BPay not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*EziDebit_BPay not displayed-----");
		}
		return null;
	}


	//saveInvoice
	public WebElement saveInvoice() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* saveInvoice should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("saveInvoice")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*saveInvoice not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*saveInvoice not displayed-----");
		}
		return null;
	}
	public WebElement clickinvoicepage1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* clickinvoicepage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("clickinvoicepage1")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*clickinvoicepage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*clickinvoicepage not displayed-----");
		}
		return null;					
	}	
	public WebElement clickinvoicepage4() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* clickinvoicepage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("clickinvoicepage4")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*clickinvoicepage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*clickinvoicepage not displayed-----");
		}
		return null;					
	}	

	public WebElement clickinvoicepage5st() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* clickinvoicepage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("clickinvoicepage5st")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*clickinvoicepage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*clickinvoicepage not displayed-----");
		}
		return null;					
	}		
	public WebElement clickinvoicepage5() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* clickinvoicepage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("clickinvoicepage5")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*clickinvoicepage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*clickinvoicepage not displayed-----");
		}
		return null;					
	}		
	public WebElement clickinvoicepage7() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* clickinvoicepage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("clickinvoicepage7")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*clickinvoicepage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*clickinvoicepage not displayed-----");
		}
		return null;					
	}		

	public WebElement clickinvoicepage9one() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* clickinvoicepage one_time should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("clickinvoicepage9one")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*clickinvoicepage one_time not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*clickinvoicepage one_time not displayed-----");

		}
		return null;					
	}
	public WebElement clickinvoicepage9() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* clickinvoicepage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("clickinvoicepage9")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*clickinvoicepage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*clickinvoicepage not displayed-----");
		}
		return null;					
	}	

	public WebElement categoryselect() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* categoryselect should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("categoryselect")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*categoryselect not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*categoryselect not displayed-----");
		}
		return null;					
	}		

	public WebElement clickinvoicepage2() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* clickinvoicepage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("clickinvoicepage2")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*clickinvoicepage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*clickinvoicepage not displayed-----");
		}
		return null;					
	}		

	public WebElement fields_invoice() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* fields_invoice should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("fields_invoice")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*fields_invoice not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*fields_invoice not displayed-----");
		}
		return null;					
	}	
	//Adjustmentsdoubleclick
	public WebElement Adjustmentsdoubleclick() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Adjustmentsdoubleclick should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Adjustmentsdoubleclick")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Adjustmentsdoubleclick not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Adjustmentsdoubleclick not displayed-----");
		}
		return null;
	}				//Alternativedoubleclick
	public WebElement Alternativedoubleclick() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Alternativedoubleclick should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Alternativedoubleclick")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Alternativedoubleclick not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Alternativedoubleclick not displayed-----");
		}
		return null;
	}				//Amountdoubleclick
	public WebElement Amountdoubleclick() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Amountdoubleclick should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Amountdoubleclick")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Amountdoubleclick not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Amountdoubleclick not displayed-----");
		}
		return null;
	}			

	//Authenticationdoubleclick
	public WebElement Authenticationdoubleclick() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Authenticationdoubleclick should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Authenticationdoubleclick")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Authenticationdoubleclick not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Authenticationdoubleclick not displayed-----");
		}
		return null;
	} 

	//Authenticationtypedoubleclick
	public WebElement Authenticationtypedoubleclick() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Authenticationtypedoubleclick should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Authenticationtypedoubleclick")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Authenticationtypedoubleclick not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Authenticationtypedoubleclick not displayed-----");
		}
		return null;
	}
	//Averagedoubleclick
	public WebElement Averagedoubleclick() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Averagedoubleclick should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Averagedoubleclick")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Averagedoubleclick not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Averagedoubleclick not displayed-----");
		}
		return null;
	}
	//Billingthreemonths
	public WebElement Billingthreemonths() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Billingthreemonths should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Billingthreemonths")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Billingthreemonths not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Billingthreemonths not displayed-----");
		}
		return null;
	}
	//Billingsixmonths
	public WebElement Billingsixmonths() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Billingsixmonths should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Billingsixmonths")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Billingsixmonths not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Billingsixmonths not displayed-----");
		}
		return null;
	}
	//Billingpmonths
	public WebElement Billingpmonths() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Billingpmonths should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Billingpmonths")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Billingpmonths not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Billingpmonths not displayed-----");
		}
		return null;
	}
	//Billingpyear
	public WebElement Billingpyear() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Billingpmonths should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Billingpyear")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Billingpyear not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Billingpyear not displayed-----");
		}
		return null;
	}
	//carriedfwd
	public WebElement carriedfwd() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* carriedfwd should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("carriedfwd")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*carriedfwd not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*carriedfwd not displayed-----");
		}
		return null;
	}
	//category
	public WebElement category() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* category should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("category")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*category not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*category not displayed-----");
		}
		return null;
	}
	//companyfax
	public WebElement companyfax() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* companyfax should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("companyfax")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*companyfax not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*companyfax not displayed-----");
		}
		return null;
	}
	//companyname
	public WebElement companyname() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* companyname should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("companyname")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*companyname not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*companyname not displayed-----");
		}
		return null;
	}
	//companyphone
	public WebElement companyphone() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* companyphone should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("companyphone")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*companyphone not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*companyphone not displayed-----");
		}
		return null;
	}
	//companyphyadd
	public WebElement companyphyadd() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* companyphyadd should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("companyphyadd")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*companyphyadd not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*companyphyadd not displayed-----");
		}
		return null;
	}


	//companypostadd
	public WebElement companypostadd() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* companypostadd should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("companypostadd")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*companypostadd not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*companypostadd not displayed-----");
		}
		return null;
	}
	//countryin
	public WebElement countryin() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* countryin should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("countryin")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*countryin not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*countryin not displayed-----");
		}
		return null;
	}
	//coveredenddate
	public WebElement coveredenddate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* coveredenddate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("coveredenddate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*coveredenddate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*coveredenddate not displayed-----");
		}
		return null;
	}
	//coveredstartdate
	public WebElement coveredstartdate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* coveredstartdate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("coveredstartdate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*coveredstartdate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*coveredstartdate not displayed-----");
		}
		return null;
	}
	//currentbalamt
	public WebElement currentbalamt() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* currentbalamt should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("currentbalamt")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*currentbalamt not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*currentbalamt not displayed-----");
		}
		return null;
	}
	//currentchrgamt
	public WebElement currentchrgamt() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* currentchrgamt should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("currentchrgamt")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*currentchrgamt not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*currentchrgamt not displayed-----");
		}
		return null;
	}
	//currentmonthusage
	public WebElement currentmonthusage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* currentmonthusage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("currentmonthusage")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*currentmonthusage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*currentmonthusage not displayed-----");
		}
		return null;
	}


	//currentread
	public WebElement currentread() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* currentread should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("currentread")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*currentread not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*currentread not displayed-----");
		}
		return null;
	}
	public WebElement customerabn() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* customerabn should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customerabn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*customerabn not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*customerabn not displayed-----");
		}
		return null;
	}
	public WebElement customeracn() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* customeracn should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customeracn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*customeracn not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*customeracn not displayed-----");
		}
		return null;
	}
	public WebElement customeradd() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* customeradd should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customeradd")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*customeradd not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*customeradd not displayed-----");
		}
		return null;
	}
	//custcompname
	public WebElement custcompname() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* custcompname should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custcompname")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*custcompname not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*custcompname not displayed-----");
		}
		return null;
	}
	//custfaxno
	public WebElement custfaxno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* custfaxno should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custfaxno")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*custfaxno not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*custfaxno not displayed-----");
		}
		return null;
	}
	//custnamecompname
	public WebElement custnamecompname() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* custnamecompname should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custnamecompname")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*custnamecompname not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*custnamecompname not displayed-----");
		}
		return null;
	}
	//custno
	public WebElement custno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* custno should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custno")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*custno not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*custno not displayed-----");
		}
		return null;
	}
	//custphah
	public WebElement custphah() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* custphah should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custphah")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*custphah not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*custphah not displayed-----");
		}
		return null;
	}
	//custphbh
	public WebElement custphbh() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* custphbh should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custphbh")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*custphbh not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*custphbh not displayed-----");
		}
		return null;
	}
	//custphmo
	public WebElement custphmo() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* custphmo should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custphmo")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*custphmo not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*custphmo not displayed-----");
		}
		return null;
	}
	//custphyadd
	public WebElement custphyadd() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* custphyadd should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custphyadd")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*custphyadd not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*custphyadd not displayed-----");
		}
		return null;
	}
	//custtname
	public WebElement custtname() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* custtname should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custtname")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*custtname not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*custtname not displayed-----");
		}
		return null;
	}
	//custtype
	public WebElement custtype() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* custtype should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custtype")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*custtype not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*custtype not displayed-----");
		}
		return null;
	}
	//dateofbirth
	public WebElement dateofbirth() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* dateofbirth should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dateofbirth")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*dateofbirth not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*dateofbirth not displayed-----");
		}
		return null;
	}

	//discounts
	public WebElement discounts() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* discounts should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("discounts")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*discounts not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*discounts not displayed-----");
		}
		return null;
	}
	//emailadd
	public WebElement emailadd() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* emailadd should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("emailadd")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*emailadd not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*emailadd not displayed-----");
		}
		return null;
	}
	//firstname
	public WebElement firstname() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* firstname should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("firstname")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*firstname not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*firstname not displayed-----");
		}
		return null;
	}
	//gst
	public WebElement gst() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* gst should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("gst")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*gst not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*gst not displayed-----");
		}
		return null;
	}
	//icpt
	public WebElement icpt() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* icpt should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("icpt")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*icpt not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*icpt not displayed-----");
		}
		return null;
	}
	//nmi
	public WebElement nmi() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* nmi should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("nmi")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*nmi not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*nmi not displayed-----");
		}
		return null;
	}
	//nextreaddateanu
	public WebElement nextreaddateanu() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* nextreaddateanu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("nextreaddateanu")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*nextreaddateanu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*nextreaddateanu not displayed-----");
		}
		return null;
	}
	//nextreaddatemnth
	public WebElement nextreaddatemnth() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* nextreaddatemnth should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("nextreaddatemnth")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*nextreaddatemnth not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*nextreaddatemnth not displayed-----");
		}
		return null;
	}
	//nextreaddatequa
	public WebElement nextreaddatequa() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* nextreaddatequa should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("nextreaddatequa")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*nextreaddatequa not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*nextreaddatequa not displayed-----");
		}
		return null;
	}
	//nextreaddatesemianu
	public WebElement nextreaddatesemianu() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* nextreaddatesemianu should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("nextreaddatesemianu")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*nextreaddatesemianu not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*nextreaddatesemianu not displayed-----");
		}
		return null;
	}
	//nextschreaddate
	public WebElement nextschreaddate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* nextschreaddate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("nextschreaddate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*nextschreaddate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*nextschreaddate not displayed-----");
		}
		return null;
	}
	//openingbal
	public WebElement openingbal() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* openingbal should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("openingbal")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*openingbal not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*openingbal not displayed-----");
		}
		return null;
	}
	//otherpayreceive
	public WebElement otherpayreceive() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* otherpayreceive should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("otherpayreceive")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*otherpayreceive not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*otherpayreceive not displayed-----");
		}
		return null;
	}
	//potdiscount
	public WebElement potdiscount() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* potdiscount should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("potdiscount")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*potdiscount not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*potdiscount not displayed-----");
		}
		return null;
	}
	//potdiscountrate
	public WebElement potdiscountrate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* potdiscountrate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("potdiscountrate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*potdiscountrate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*potdiscountrate not displayed-----");
		}
		return null;
	}
	//potreversal
	public WebElement potreversal() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* potreversal should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("potreversal")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*potreversal not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*potreversal not displayed-----");
		}
		return null;
	}
	//payamt
	public WebElement payamt() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* payamt should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("payamt")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*payamt not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*payamt not displayed-----");
		}
		return null;
	}
	//penaltyamt
	public WebElement penaltyamt() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* penaltyamt should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("penaltyamt")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*penaltyamt not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*penaltyamt not displayed-----");
		}
		return null;
	}
	//penaltylabel
	public WebElement penaltylabel() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* penaltylabel should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("penaltylabel")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*penaltylabel not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*penaltylabel not displayed-----");
		}
		return null;
	}
	//postcode
	public WebElement postcode() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* postcode should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("postcode")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*postcode not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*postcode not displayed-----");
		}
		return null;
	}
	//prebalamt
	public WebElement prebalamt() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* prebalamt should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("prebalamt")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*prebalamt not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*prebalamt not displayed-----");
		}
		return null;
	}
	//preread
	public WebElement preread() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* preread should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("preread")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*preread not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*preread not displayed-----");
		}
		return null;
	}
	//rebate
	public WebElement rebate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* rebate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rebate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*rebate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*rebate not displayed-----");
		}
		return null;
	}
	//salutation
	public WebElement salutation() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* salutation should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("salutation")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*salutation not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*salutation not displayed-----");
		}
		return null;
	}
	//securedipamt
	public WebElement securedipamt() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* securedipamt should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("securedipamt")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*securedipamt not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*securedipamt not displayed-----");
		}
		return null;
	}
	//servicesupplyadd
	public WebElement servicesupplyadd() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* servicesupplyadd should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("servicesupplyadd")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*servicesupplyadd not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*servicesupplyadd not displayed-----");
		}
		return null;
	}
	//shortaddress
	public WebElement shortaddress() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* shortaddress should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("shortaddress")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*shortaddress not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*shortaddress not displayed-----");
		}
		return null;
	}
	//shortaddresstwo
	public WebElement shortaddresstwo() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* shortaddresstwo should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("shortaddresstwo")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*shortaddresstwo not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*shortaddresstwo not displayed-----");
		}
		return null;
	}
	//state
	public WebElement state() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* state should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("state")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*state not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*state not displayed-----");
		}
		return null;
	}
	//stmtbillperiod
	public WebElement stmtbillperiod() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* stmtbillperiod should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("stmtbillperiod")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*stmtbillperiod not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*stmtbillperiod not displayed-----");
		}
		return null;
	}
	//stmtduedate
	public WebElement stmtduedate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* stmtduedate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("stmtduedate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*stmtduedate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*stmtduedate not displayed-----");
		}
		return null;
	}
	//stmtissuedate
	public WebElement stmtissuedate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* stmtissuedate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("stmtissuedate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*stmtissuedate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*stmtissuedate not displayed-----");
		}
		return null;
	}
	//stmtno
	public WebElement stmtno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* stmtno should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("stmtno")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*stmtno not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*stmtno not displayed-----");
		}
		return null;
	}
	//stmtseqno
	public WebElement stmtseqno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* stmtseqno should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("stmtseqno")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*stmtseqno not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*stmtseqno not displayed-----");
		}
		return null;
	}
	//suburb
	public WebElement suburb() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* suburb should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("suburb")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*suburb not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*suburb not displayed-----");
		}
		return null;
	}
	//supplystartdate
	public WebElement supplystartdate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* supplystartdate should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("supplystartdate")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*supplystartdate not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*supplystartdate not displayed-----");
		}
		return null;
	}
	//surename
	public WebElement surename() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* surename should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("surename")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*surename not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*surename not displayed-----");
		}
		return null;
	}
	//taxunit
	public WebElement taxunit() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* taxunit should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("taxunit")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*taxunit not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*taxunit not displayed-----");
		}
		return null;
	}
	//totalgstapp
	public WebElement totalgstapp() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* totalgstapp should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("totalgstapp")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*totalgstapp not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*totalgstapp not displayed-----");
		}
		return null;
	}
	//totalreading
	public WebElement totalreading() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* totalreading should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("totalreading")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*totalreading not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*totalreading not displayed-----");
		}
		return null;
	}
	//totalusage
	public WebElement totalusage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* totalusage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("totalusage")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*totalusage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*totalusage not displayed-----");
		}
		return null;
	}
	//totalusagekwh
	public WebElement totalusagekwh() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* totalusagekwh should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("totalusagekwh")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*totalusagekwh not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*totalusagekwh not displayed-----");
		}
		return null;
	}
	//unit
	public WebElement unit() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* unit should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("unit")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*unit not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*unit not displayed-----");
		}
		return null;
	}
	//usagegstapp
	public WebElement usagegstapp() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* usagegstapp should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("usagegstapp")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*usagegstapp not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*usagegstapp not displayed-----");
		}
		return null;
	}
	//usagegstnon
	public WebElement usagegstnon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* usagegstnon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("usagegstnon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*usagegstnon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*usagegstnon not displayed-----");
		}
		return null;
	}
	//usagerebateamt
	public WebElement usagerebateamt() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* usagerebateamt should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("usagerebateamt")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*usagerebateamt not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*usagerebateamt not displayed-----");
		}
		return null;
	}
	//usagerebatelabel
	public WebElement usagerebatelabel() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* usagerebatelabel should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("usagerebatelabel")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*usagerebatelabel not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*usagerebatelabel not displayed-----");
		}
		return null;
	}

	//usagerebategst
	public WebElement usagerebategst() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* usagerebategst should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("usagerebategst")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*usagerebategst not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*usagerebategst not displayed-----");
		}
		return null;
	}
	//opt1
	public WebElement opt1() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* opt1 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("opt1")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*opt1 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*opt1 not displayed-----");
		}
		return null;
	}
	//opt2
	public WebElement opt2() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* opt2 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("opt2")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*opt2 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*opt2 not displayed-----");
		}
		return null;
	}
	//opt3
	public WebElement opt3() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* opt3 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("opt3")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*opt3 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*opt3 not displayed-----");
		}
		return null;
	}
	//opt3
	public WebElement opt4() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* opt4 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("opt4")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*opt4 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*opt4 not displayed-----");
		}
		return null;
	}
	//opt3
	public WebElement opt5() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* opt5 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("opt5")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*opt5 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*opt5 not displayed-----");
		}
		return null;
	}
	//opt3
	public WebElement opt6() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* opt6 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("opt6")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*opt6 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*opt6 not displayed-----");
		}
		return null;
	}
	//opt3
	public WebElement opt7() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* opt7 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("opt7")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*opt7 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*opt7 not displayed-----");
		}
		return null;
	}
	//opt3
	public WebElement opt8() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* opt8 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("opt8")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*opt8 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*opt8 not displayed-----");
		}
		return null;
	}
	//opt3
	public WebElement opt9() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* opt9 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("opt9")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*opt9 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*opt9 not displayed-----");
		}
		return null;
	}
	//opt3
	public WebElement opt10() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* opt10 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("opt10")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*opt10 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*opt10 not displayed-----");
		}
		return null;
	}











	//savethis_template
	public WebElement savethis_template() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* savethis_template should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("savethis_template")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*savethis_template not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*savethis_template not displayed-----");
		}
		return null;
	}	
	//Category DRopdown
	public WebElement category_dropdown() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* category_dropdown should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("category_dropdown")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*category_dropdown not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*category_dropdown not displayed-----");
		}
		return null;
	}	


	//invoiceNEXTButton
	public WebElement invoiceNEXTButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* invoiceNEXTButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("invoiceNEXTButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*invoiceNEXTButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*invoiceNEXTButton not displayed-----");
		}
		return null;
	}


	//PreviewallButton
	public WebElement PreviewallButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* PreviewallButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("PreviewallButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*PreviewallButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*PreviewallButton not displayed-----");
		}
		return null;
	}
	//previewval1
	public WebElement previewval() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* previewval should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("previewval")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*previewval not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*previewval not displayed-----");
		}
		return null;
	}
	//previewval15
	public WebElement previewval15() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* previewval15 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("previewval15")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*previewval15 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*previewval15 not displayed-----");
		}
		return null;
	}
	//For 6th category
	//previewval15
	public WebElement previewval6() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* previewval6 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("previewval6")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*previewval6 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*previewval6 not displayed-----");
		}
		return null;
	}

	//previewval19
	public WebElement previewval19() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* previewval19 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("previewval19")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*previewval19 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*previewval19 not displayed-----");
		}
		return null;
	}

	//previewval25
	public WebElement previewval25() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* previewval25 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("previewval25")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*previewval25 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*previewval not displayed-----");
		}
		return null;
	}
	//previewval26
	public WebElement previewval26() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* previewval26 should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("previewval26")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*previewval26 not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*previewval26 not displayed-----");
		}
		return null;
	}
	//closePreview
	public WebElement closePreview() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* closePreview should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("closePreview")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*closePreview not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*closePreview not displayed-----");
		}
		return null;
	}				//finishpreviewButton
	public WebElement finishpreviewButton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* finishButton should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("finishpreviewButton")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*finishButton not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*finishButton not displayed-----");
		}
		return null;
	}				//edittemplateIcon
	public WebElement edittemplateIcon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* edittemplateIcon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("edittemplateIcon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*edittemplateIcon not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*edittemplateIcon not displayed-----");
		}
		return null;
	}				//primary_front
	public WebElement primary_front() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* primary_front should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("primary_front")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*primary_front not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*primary_front not displayed-----");
		}
		return null;
	}				//primary_back
	public WebElement primary_back() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* primary_back should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("primary_back")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*primary_back not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*primary_back not displayed-----");
		}
		return null;
	}				//secondary_front
	public WebElement secondary_front() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* secondary_front should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("secondary_front")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*secondary_front not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*secondary_front not displayed-----");
		}
		return null;
	}				//secondary_back
	public WebElement secondary_back() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* secondary_back should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("secondary_back")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*secondary_back not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*secondary_back not displayed-----");
		}
		return null;
	}		

	//Bill_Run_Results_text
	public WebElement Bill_Run_Results_text() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Bill_Run_Results_text should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Bill_Run_Results_text")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Bill_Run_Results_text not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Bill_Run_Results_text not displayed-----");
		}
		return null;
	}		


	//rollbackbuttin
	public WebElement rollbackbuttin() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* rollbackbuttin should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rollbackbuttin")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*rollbackbuttin not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*rollbackbuttin not displayed-----");
		}
		return null;
	}		


	//continueTORollback
	public WebElement continueTORollback() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* continueTORollback should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("continueTORollback")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*continueTORollback not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*continueTORollback not displayed-----");
		}
		return null;
	}		

	//rollbackMessage
	public WebElement rollbackMessage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* rollbackMessage should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rollbackMessage")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*rollbackMessage not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*rollbackMessage not displayed-----");
		}
		return null;
	}		

	//closeRollback
	public WebElement closeRollback() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* closeRollback should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("closeRollback")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*closeRollback not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*closeRollback not displayed-----");
		}
		return null;
	}		

	//meterReadImport
	public WebElement meterReadImport() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* secondary_back should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterReadImport")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*meterReadImport not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*meterReadImport not displayed-----");
		}
		return null;
	}		

	//invoice_updated_class				

	public WebElement updatedinvoiceheader() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * invoice page should be open");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("invoice_firstpage_header")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" invoice page headings not displayed-----");
		}
		return null;
	}		

	public WebElement ddbankno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * ddbankno should be display");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ddbankno")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" invoice page headings not displayed-----");
		}
		return null;
	}		

	public WebElement ddaccno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * ddbankno should be display");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ddaccno")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" invoice page headings not displayed-----");
		}
		return null;
	}		

	public WebElement replayemail() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * ddbankno should be display");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("replayemail")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" invoice page headings not displayed-----");
		}
		return null;
	}	

	public WebElement mainmsg() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * ddbankno should be display");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mainmsg")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" invoice page headings not displayed-----");
		}
		return null;
	}	

	public WebElement custsrvno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * ddbankno should be display");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custsrvno")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" invoice page headings not displayed-----");
		}
		return null;
	}	

	public WebElement facno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * ddbankno should be display");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("facno")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" invoice page headings not displayed-----");
		}
		return null;
	}

	public WebElement ftelno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * ddbankno should be display");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ftelno")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" invoice page headings not displayed-----");
		}
		return null;
	}

	public WebElement paytno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * ddbankno should be display");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("paytno")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" invoice page headings not displayed-----");
		}
		return null;
	}

	public WebElement invoiceemail() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * invoice page should be open");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("invoicecontactemail")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" invoice page email not displayed-----");
		}
		return null;
	}	

	public WebElement website() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * ddbankno should be display");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("website")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" invoice page headings not displayed-----");
		}
		return null;
	}

	public WebElement invoiceupdatebutton() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * invoice page should be open");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("invoiceupdatebutton")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" invoice page update button not displayed-----");
		}
		return null;
	}		

	public WebElement assertionmsg() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * invoice page should be open");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("assertionmsg")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" invoice page update button not displayed-----");
		}
		return null;
	}		

	public WebElement pdflogo() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * pdf logo upload should display");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("pdflogo")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" pdf logo upload not displayed-----");
		}
		return null;
	}		

	public WebElement advlogo() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * adv logo upload should display");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("advlogo")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" adv logo upload not displayed-----");
		}
		return null;
	}		

	public WebElement footer() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * invoice footer upload should be display");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("footer")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" invoice footer upload not be displayed-----");
		}
		return null;
	}		

	public WebElement uploadfile() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * upload files button page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("uploadfilebutton")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" upload files button page not displayed-----");
		}
		return null;
	}

	public WebElement reminders_admin() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Reminders button page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reminders_admin")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" Reminders button page not displayed-----");
		}
		return null;
	}		

	public WebElement billrunassert() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Bill Run Assert should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("billrunassert")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  Bill Run Assert not displayed-----");
		}
		return null;
	}	

	public WebElement reminderassert() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Reminder Assertion text should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reminderassert")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  Reminder Assertion text not displayed-----");
		}
		return null;
	}

	public WebElement remindertype() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Reminder Type should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("remindertype")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  Reminder Type not displayed-----");
		}
		return null;
	}

	public WebElement statementno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Statement No. should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("statementno")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  Statement No. not displayed-----");
		}
		return null;
	}
	public WebElement dayoverdue() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Overdue days textbox should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dayoverdue")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  Overdue days textbox not displayed-----");
		}
		return null;
	}

	public WebElement generatereminder() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Generate Reminder button should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("generatereminder")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  Generate Reminder button not displayed-----");
		}
		return null;
	}

	public WebElement customerno_reminder_assert() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Generate Reminder customer number should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customernoreminderassert")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  Generate Reminder customer number not displayed-----");
		}
		return null;
	}
	public WebElement customerno_reminder_checkbox() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Checkbox on Reminder page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("remindercheckbox")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  Checkbox on Reminder page not displayed-----");
		}
		return null;
	}

	public WebElement customerno_reminder_download() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Download icon on Reminder page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reminderdownload")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  Download icon on Reminder page not displayed-----");
		}
		return null;
	}
	public WebElement customerno_reminder_email() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Email icon on Reminder page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reminderemail")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  Email icon on Reminder page not displayed-----");
		}
		return null;
	}

	public WebElement customerno_reminder_email_continue() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Email continue on Reminder page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("remindercontinueemail")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  Email continue on Reminder page not displayed-----");
		}
		return null;
	}
	public WebElement emailassert() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Email customer on popup should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("emailassert")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  Email customer on popup is not displayed-----");
		}
		return null;
	}
	public WebElement emailpopupclose() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Email popup close button should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("closeemailpopup")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  Email popup close button is not displayed-----");
		}
		return null;
	}

	public WebElement enablelifesupport() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Life Support Toggle Button should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("enablelifesupport")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  Life Support Toggle Button is not displayed-----");
		}
		return null;
	}

	public WebElement savesettings() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * save settings Button should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("savesettings")));
			return ele;	
		} catch (Exception e) {

			System.out.println("  save settings Button is not displayed-----");
		}
		return null;
	}

	public WebElement lyfsprtalrt() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Life Support Alert should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("lyfsprtalrt")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" Life Support Alert is not displayed-----");
		}
		return null;
	}

	public WebElement contacttab() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Contact Tab should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("contacttab")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" Contact Tab is not displayed-----");
		}
		return null;
	}
	public WebElement lifesupportcontact() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" * Life Support Contact should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("lifesupportcontact")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" Life Support Contact is not displayed-----");
		}
		return null;
	}

	public WebElement meterreadingsheet() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Meter Reading Sheet Report should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterreadingsheet")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Meter Reading Sheet Report is not displayed-----");
		}
		return null;
	}

	public WebElement reports() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Reports tab should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reports")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Reports tab is not displayed-----");
		}
		return null;
	}

	public WebElement metersicon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Meters icon should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("metersicon")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Meters icon is not displayed-----");
		}
		return null;
	}

	public WebElement mrsmeterno() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *MRS Meter No. should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mrsmeterno")));
			return ele;	
		} catch (Exception e) {

			System.out.println("MRS Meter No. is not displayed-----");
		}
		return null;
	}

	public WebElement searchmtr() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Search Meter option should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchmtr")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Search meter option not displayed-----");
		}
		return null;
	}

	public WebElement searchfield() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Search field should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchfield")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Search field not displayed-----");
		}
		return null;
	}

	public WebElement watertext() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Search result should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("watertext")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Search result not displayed-----");
		}
		return null;
	}

	public WebElement meterreport() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Meter Report link should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterreport")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Meter Report link not displayed-----");
		}
		return null;
	}

	public WebElement watermnorpt() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Water reports should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("watermnorpt")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Water Reports not displayed-----");
		}
		return null;
	}

	public WebElement meterwithoutacc() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Meter without Acc report page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("meterwithoutacc")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Meter without Acc report page not displayed-----");
		}
		return null;
	}
	public WebElement mwastartdate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Meter without Acc Start date should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mwastartdate")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Meter without Acc Start Date not displayed-----");
		}
		return null;
	}

	public WebElement mwaenddate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Meter without Acc End date should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mwaenddate")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Meter without Acc End Date not displayed-----");
		}
		return null;
	}

	public WebElement mwapre() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Previous button should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mwapre")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Previous button not displayed-----");
		}
		return null;
	}

	public WebElement mwanxt() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Next button should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mwanxt")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Next button not displayed-----");
		}
		return null;
	}

	public WebElement nxtmwa() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Next button on Meters Without Accounts page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("nxtmwa")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Next button on Meters Without Accounts page not displayed-----");
		}
		return null;
	}

	public WebElement sdate() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Start Date should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("sdate")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Start Date not displayed-----");
		}
		return null;
	}

	public WebElement getmtr() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Get Meter should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("getmtr")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Get Meter not displayed-----");
		}
		return null;
	}

	public WebElement status() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Status should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("status")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Status not displayed-----");
		}
		return null;
	}

	public WebElement financialicon() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Financial icon should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("financialicon")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Financial icon not displayed-----");
		}
		return null;
	}

	public WebElement financialpage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Financial report page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("financialpage")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Financial report page not displayed-----");
		}
		return null;
	}
	public WebElement billingsummaryreport() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *billing summary report link should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("billingsummaryreport")));
			return ele;	
		} catch (Exception e) {

			System.out.println("billing summary report link not displayed-----");
		}
		return null;
	}

	public WebElement rateplansummary() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *rate plan summary report link should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rateplansummary")));
			return ele;	
		} catch (Exception e) {

			System.out.println("rate plan summary report link not displayed-----");
		}
		return null;
	}

	public WebElement rateplanpage() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *rate plan page link should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rateplanpage")));
			return ele;	
		} catch (Exception e) {

			System.out.println("rate plan page link not displayed-----");
		}
		return null;
	}

	public WebElement arreport() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Account receivables report should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("arreport")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Account receivables report not displayed-----");
		}
		return null;
	}

	public WebElement searcharr() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Account receivables report search should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searcharr")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Account receivables report search not displayed-----");
		}
		return null;
	}

	public WebElement arrassert() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *ARR page assert should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("arrassert")));
			return ele;	
		} catch (Exception e) {

			System.out.println("ARR page assert not displayed-----");
		}
		return null;
	}

	public WebElement bsrassert() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *BSR page assert should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("bsrassert")));
			return ele;	
		} catch (Exception e) {

			System.out.println("BSR page assert not displayed-----");
		}
		return null;
	}
	public WebElement mucbl()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Meter Usage and Charges By Leasee link should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mucbl")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Meter Usage and Charges By Leasee link not displayed-----");
		}
		return null;
	}

	public WebElement statementicon()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *statement icon should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("statementicon")));
			return ele;	
		} catch (Exception e) {

			System.out.println("statement icon not displayed-----");
		}
		return null;
	}

	public WebElement statementpage()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *statement page assert should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("statementpage")));
			return ele;	
		} catch (Exception e) {

			System.out.println("statement page assert not displayed-----");
		}
		return null;
	}
	public WebElement statementnobr()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *statement no. should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("statementnobr")));
			return ele;	
		} catch (Exception e) {

			System.out.println("statement no. not displayed-----");
		}
		return null;
	}

	public WebElement brscustomer()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Customer no on Statement Summery page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("brscustomer")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Customer no on Statement Summery page not displayed-----");
		}
		return null;
	}

	public WebElement stmtnomucbl()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Statement no on Meter Usage and Charges By Leasee report should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("stmtnomucbl")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Statement no on Meter Usage and Charges By Leasee report not displayed-----");
		}
		return null;
	}
	public WebElement mucblpage()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Meter Usage and Charges By Leasee report should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mucblpage")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Meter Usage and Charges By Leasee report not displayed-----");
		}
		return null;
	}

	public WebElement mucblcno()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Customer no on Meter Usage and Charges By Leasee report should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mucblcno")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Customer no on Meter Usage and Charges By Leasee report not displayed-----");
		}
		return null;
	}

	public WebElement mucbc()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Meter Usage and Charges By Customer report should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mucbc")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Meter Usage and Charges By Customer report not displayed-----");
		}
		return null;
	}

	public WebElement compnamemucbc()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Company name on Meter Usage and Charges By Customer report should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("compnamemucbc")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Company name on Meter Usage and Charges By Customer report not displayed-----");
		}
		return null;
	}

	public WebElement customerno()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Customer number should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customerno")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Customer number not displayed-----");
		}
		return null;
	}

	public WebElement customerreport()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Customer report should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customerreport")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Customer report not displayed-----");
		}
		return null;
	}
	public WebElement customerreportassert()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Customer report assert should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customerreportassert")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Customer report assert not displayed-----");
		}
		return null;
	}

	public WebElement customerswithlifesupport()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Customers with life support should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customerswithlifesupport")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Customers with life support not displayed-----");
		}
		return null;
	}

	public WebElement searchcwls()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Search of Customers with life support should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchcwls")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Search of Customers with life support not displayed-----");
		}
		return null;
	}

	public WebElement cwlssearchassert()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Search assert of Customers with life support should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("cwlssearchassert")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Search assert of Customers with life support not displayed-----");
		}
		return null;
	}

	public WebElement moveinmoveoutreport()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *move in move out report should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("moveinmoveoutreport")));
			return ele;	
		} catch (Exception e) {

			System.out.println("move in move out report not displayed-----");
		}
		return null;
	}

	public WebElement moveinmoveoutassert()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *move in move out report page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("moveinmoveoutassert")));
			return ele;	
		} catch (Exception e) {

			System.out.println("move in move out report page not displayed-----");
		}
		return null;
	}

	public WebElement mimormtrno()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *move in move out meterno should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mimormtrno")));
			return ele;	
		} catch (Exception e) {

			System.out.println("move in move out meter no not displayed-----");
		}
		return null;
	}

	public WebElement mimornext()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *move in move out mimor next should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("mimornext")));
			return ele;	
		} catch (Exception e) {

			System.out.println("move in move out mimor next not displayed-----");
		}
		return null;
	}

	public WebElement allowaccesstoggle()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *allow access toggle should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("allowaccesstoggle")));
			return ele;	
		} catch (Exception e) {

			System.out.println("allow access toggle not displayed-----");
		}
		return null;
	}

	public WebElement portalpassword()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Portal password field should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("portalpassword")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Portal password field not displayed-----");
		}
		return null;
	}

	public WebElement portalusername()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Customer portal username should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("portalusername")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Customer portal username not displayed-----");
		}
		return null;
	}

	public WebElement loginportal()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Customer portal login button should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("loginportal")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Customer portal login button not displayed-----");
		}
		return null;
	}
	public WebElement custportal()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Customer Portal icon on 'Admin' page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custportal")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Customer Portal icon on 'Admin' page not displayed-----");
		}
		return null;
	}
	public WebElement accountdetail()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Account Detail Toggle button should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("accountdetail")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Account Detail Toggle Button not displayed-----");
		}
		return null;
	}

	public WebElement serviceedit()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Service Edit Toggle button should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("serviceedit")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Service Edit Toggle Button not displayed-----");
		}
		return null;
	}

	public WebElement serviceset()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Service Setting Edit Toggle button should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("accountdetail")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Service Setting Edit Toggle Button not displayed-----");
		}
		return null;
	}

	public WebElement userportalservices()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *User portal Services Tab should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("userportalservices")));
			return ele;	
		} catch (Exception e) {

			System.out.println("User portal Services Tab not displayed-----");
		}
		return null;
	}

	public WebElement portalsave()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Save of button of customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("portalsave")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Save button of customer portal not displayed-----");
		}
		return null;
	}
	public WebElement moveoutundr_portal()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Moveout button on customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("moveoutundr_portal")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Moveout button on customer portal not displayed-----");
		}
		return null;
	}

	public WebElement portalmeterdetail()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Meter Details heading on customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("portalmeterdetail")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Meter Details heading on customer portal not displayed-----");
		}
		return null;
	}

	public WebElement disablemoveoutportal()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Move Out button on customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("disablemoveoutportal")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Move Out button on customer portal not displayed-----");
		}
		return null;
	}

	public WebElement accountdetailstab()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Account Details Tab on customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("accountdetailstab")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Account Details Tab on customer portal not displayed-----");
		}
		return null;
	}

	public WebElement pititleonportal()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Persional Information Title on customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("pititleonportal")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Persional Information Title on customer portal not displayed-----");
		}
		return null;
	}

	public WebElement piphoneonportal()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Persional Information Phone no on customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("piphoneonportal")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Persional Information Phone no on customer portal not displayed-----");
		}
		return null;
	}

	public WebElement pipageinportal()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Persional Information Page on customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("pipageinportal")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Persional Information Page on customer portal not displayed-----");
		}
		return null;
	}

	public WebElement savechangesportal()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Save Changes button on customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("savechangesportal")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Save changes button on customer portal not displayed-----");
		}
		return null;
	}

	public WebElement pisavemessage()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Save Changes success message on customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("pisavemessage")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Save changes success message on customer portal not displayed-----");
		}
		return null;
	}

	public WebElement servicesettingedit()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Service Settings Edit under admin panel should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("servicesettingedit")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Service Settings Edit under admin panel not displayed-----");
		}
		return null;
	}
	public WebElement servicesettingtabportal()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Service Settings tab under customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("servicesettingtabportal")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Service Settings tab under customer portal not displayed-----");
		}
		return null;
	}

	public WebElement servicesendemailcustomerportal()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Send my bills via email' under Service Settings of customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("servicesendemailcustomerportal")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Send my bills via email' under Service Settings of customer portal not displayed-----");
		}
		return null;
	}

	public WebElement savechangesportal2()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Save Changes' button under Service Settings of customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("savechangesportal2")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Save Changes' button under Service Settings of customer portal not displayed-----");
		}
		return null;
	}

	public WebElement successmessageonservice()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Success' on Service Settings of customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("successmessageonservice")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Success' on Service Settings of customer portal not displayed-----");
		}
		return null;
	}

	public WebElement servicesettingstab()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Service Settings tab of customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("servicesettingstab")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Service Settings tab of customer portal not displayed-----");
		}
		return null;
	}

	public WebElement disabledbuttonofportal()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Disabled button Account Details tab of customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("disabledbuttonofportal")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Disabled button Account Details tab of customer portal not displayed-----");
		}
		return null;
	}

	public WebElement disabledbuttonservicesettings()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Disabled button Service Settings tab of customer portal should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("disabledbuttonservicesettings")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Disabled button Service Settings tab of customer portal not displayed-----");
		}
		return null;
	}

	public WebElement localesettings()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Locale Settings of 'Admin' should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("localesettings")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Locale Settings of 'Admin' not displayed-----");
		}
		return null;
	}

	public WebElement currencysettings()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Locale Settings page of 'Admin' should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("currencysettings")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Locale Settings page of 'Admin' not displayed-----");
		}
		return null;
	}

	public WebElement currencysymbol()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Currency Symbol' dropdown on Locale Settings page of 'Admin' should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("currencysymbol")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Locale Settings' dropdown on Locale Settings page of 'Admin' not displayed-----");
		}
		return null;
	}

	public WebElement decimalpoints()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Decimal Points' dropdown on Locale Settings page of 'Admin' should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("decimalpoints")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Decimal Points' dropdown on Locale Settings page of 'Admin' not displayed-----");
		}
		return null;
	}

	public WebElement thousandseparator()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Thousand Separator' dropdown on Locale Settings page of 'Admin' should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("thousandseparator")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Thousand Separator' dropdown on Locale Settings page of 'Admin' not displayed-----");
		}
		return null;
	}

	public WebElement decimalsymbol()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Decimal Symbol' textfield on Locale Settings page of 'Admin' should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("decimal_symbol")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Decimal Symbol' textfield on Locale Settings page of 'Admin' not displayed-----");
		}
		return null;
	}

	public WebElement tax_unit()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Tax Unit' dropdown on Locale Settings page of 'Admin' should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("tax_unit")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Tax Unit' dropdown on Locale Settings page of 'Admin' not displayed-----");
		}
		return null;
	}

	public WebElement date_format()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Date format' dropdown on Locale Settings page of 'Admin' should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("date_format")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Date Format' dropdown on Locale Settings page of 'Admin' not displayed-----");
		}
		return null;
	}

	public WebElement time_format()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Time format' dropdown on Locale Settings page of 'Admin' should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("time_format")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Time Format' dropdown on Locale Settings page of 'Admin' not displayed-----");
		}
		return null;
	}

	public WebElement localepage()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Confirmatio message on Locale Settings page of 'Admin' should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("localepage")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Confirmation message on Locale Settings page of 'Admin' not displayed-----");
		}
		return null;
	}

	public WebElement workflow_types()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Workflow' button of 'Admin' should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("workflow_types")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Workflow' button of 'Admin' not displayed-----");
		}
		return null;
	}

	public WebElement workflow_page()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Workflow' Page of 'Admin' should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("workflow_page")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Workflow' Page of 'Admin' not displayed-----");
		}
		return null;
	}

	public WebElement addnewlogtypepopup()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Add New Log Type' Pop up should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("addnewlogtypepopup")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Add New Log Type' pop up not displayed-----");
		}
		return null;
	}

	public WebElement typename()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Type Name' field on 'Add New Log Type' Pop up should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("typename")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Type Name' field on 'Add New Log Type' pop up not displayed-----");
		}
		return null;
	}

	public WebElement displayname()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Display Name' field on 'Add New Log Type' Pop up should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("displayname")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Display Name' field on 'Add New Log Type' pop up not displayed-----");
		}
		return null;
	}

	public WebElement savelogtype()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Save' button on 'Add New Log Type' Pop up should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("savelogtype")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Save' button on 'Add New Log Type' pop up not displayed-----");
		}
		return null;
	}

	public WebElement searchlog()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Search' field on 'Workflow Types' page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchlog")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Search' field on 'Workflow Types' not displayed-----");
		}
		return null;
	}

	public WebElement searchlogresult()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Search log result on 'Workflow Types' page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchlogresult")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Search log result on 'Workflow Types' not displayed-----");
		}
		return null;
	}

	public WebElement emailsubject()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *email subject on 'Template' page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("emailsubject")));
			return ele;	
		} catch (Exception e) {

			System.out.println("email subject on 'Template' page not displayed-----");
		}
		return null;
	}

	public WebElement emailmessage()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *email message on 'Template' page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("emailmessage")));
			return ele;	
		} catch (Exception e) {

			System.out.println("email message on 'Template' page not displayed-----");
		}
		return null;
	}

	public WebElement usermanageruserdetails()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'User Details' icon under 'User Manager' section of admin panel should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("usermanageruserdetails")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'User Details' icon under 'User Manager' section of admin panel not displayed-----");
		}
		return null;
	}

	public WebElement userdetailspage()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'User Details' page of admin panel should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("userdetailspage")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'User Details' page of admin panel not displayed-----");
		}
		return null;
	}

	public WebElement firstnameuserdetail()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'First Name' field on 'User Details' page under admin panel should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("firstnameuserdetail")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'First Name' field on 'User Details' page of admin panel not displayed-----");
		}
		return null;
	}

	public WebElement lastnameuserdetail()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Last Name' field on 'User Details' page under admin panel should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("lastnameuserdetail")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Last Name' field on 'User Details' page of admin panel not displayed-----");
		}
		return null;
	}

	public WebElement emailuserdetail()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Email Address' field on 'User Details' page under admin panel should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("emailuserdetail")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Email Address' field on 'User Details' page of admin panel not displayed-----");
		}
		return null;
	}

	public WebElement saveuserdetails()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Save' button on 'User Details' page under admin panel should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("saveuserdetails")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Save' button on 'User Details' page of admin panel not displayed-----");
		}
		return null;
	}

	public WebElement addcontactlog()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Add Contact Log' button on 'Contact Log' page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("addcontactlog")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Add Contact Log' button on 'Contact Log' page not displayed-----");
		}
		return null;
	}

	public WebElement newcontactlogpage()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'New Contact Log' page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("newcontactlogpage")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'New Contact Log' page not displayed-----");
		}
		return null;
	}

	public WebElement newcontactlogtype()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'New Contact Log' page 'Type' dropdown should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("newcontactlogtype")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'New Contact Log' page 'Type' dropdown not displayed-----");
		}
		return null;
	}

	public WebElement assigntouser()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'New Contact Log' page 'Assign To User' dropdown should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("assigntouser")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'New Contact Log' page 'Assign To User' dropdown not displayed-----");
		}
		return null;
	}

	public WebElement dateaction()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'New Contact Log' page 'Action Date' should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("dateaction")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'New Contact Log' page 'Action Date' not displayed-----");
		}
		return null;
	}

	public WebElement savebutton()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'New Contact Log' page 'Save' button should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("savebutton")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'New Contact Log' page 'Save' button not displayed-----");
		}
		return null;
	}

	public WebElement searchcontactlog()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Contact Log' page 'Search' field should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchcontactlog")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Contact Log' page 'Search' field not displayed-----");
		}
		return null;
	}

	public WebElement detailcontactlog()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Contact Log' page 'Search' field should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("detailcontactlog")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Contact Log' page 'Search' field not displayed-----");
		}
		return null;
	}

	public WebElement contactlogstatus()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Contact Log' page 'Status' field should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("contactlogstatus")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Contact Log' page 'Status' field not displayed-----");
		}
		return null;
	}

	public WebElement ticketnocontactlog()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Contact Log' page 'Ticket' field should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ticketnocontactlog")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Contact Log' page 'Ticket' field not displayed-----");
		}
		return null;
	}

	public WebElement assertstatus()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Contact Log' page 'Status' column should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("assertstatus")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Contact Log' page 'Status' column not displayed-----");
		}
		return null;
	}

	public WebElement viewhistoryofpayment()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'View History' button afer paymant should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("viewhistoryofpayment")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'View History' button after payment not displayed-----");
		}
		return null;
	}

	public WebElement makenewpaymentbutton()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Transaction History' page 'Make New Payment' button should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("makenewpaymentbutton")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Transaction History' page 'Make New Payment' button not displayed-----");
		}
		return null;
	}

	public WebElement viewhistorypaymentpage()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Payments' page 'View History' button should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("viewhistorypaymentpage")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Payments' page 'View history' button not displayed-----");
		}
		return null;
	}

	public WebElement searchpayment()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Payments' page 'Search Payment' field should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchpayment")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Payments' page 'Search Payment' field not displayed-----");
		}
		return null;
	}

	public WebElement transactionpayment()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Transaction History' page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("transactionpayment")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Payments' pages not displayed-----");
		}
		return null;
	}

	public WebElement deposithistory()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Deposit History' button on 'Payments' page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("deposithistory")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Deposite Payments' button on 'Payment' page not displayed-----");
		}
		return null;
	}

	public WebElement assertdeposit()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Deposit entry on 'Security Deposit History' page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("assertdeposit")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Deposit entry on 'Security Deposit History' page not displayed-----");
		}
		return null;
	}

	public WebElement pinvoicefront()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Primary invoice 'Front' dropdown on page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("pinvoicefront")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Primary invoice 'Front' dropdown on page not displayed-----");
		}
		return null;
	}

	public WebElement pinvoiceback()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Primary invoice 'Back' dropdown on page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("pinvoiceback")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Primary invoice 'Back' dropdown on page not displayed-----");
		}
		return null;
	}

	public WebElement sinvoicefront()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Secondary invoice 'Front' dropdown on page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("sinvoicefront")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Primary invoice 'Front' dropdown on page not displayed-----");
		}
		return null;
	}
	public WebElement sinvoiceback()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *Secondary invoice 'Back' dropdown on page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("sinvoiceback")));
			return ele;	
		} catch (Exception e) {

			System.out.println("Primary invoice 'Back' dropdown on page not displayed-----");
		}
		return null;
	}

	public WebElement search_cycle()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Search' field on 'Bill Run Cycles' page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("search_cycle")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'Search' field on 'Bill Run Cycles' page not displayed-----");
		}
		return null;
	}

	public WebElement noofcustomers()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'No of customers' column on 'Bill Run Cycles' page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("noofcustomers")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'No of customers' column on 'Bill Run Cycles' page not displayed-----");
		}
		return null;
	}


	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	//add vkp

	//Allocation Enable
	public WebElement EnablePayment_Allocation()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'No of customers' column on 'Bill Run Cycles' page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Enable_Payment_Allocation")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'No of customers' column on 'Bill Run Cycles' page not displayed-----");
		}
		return null;
	}	
	//Allocation Enable
	public WebElement EnablePayment_AllocationBYrollup()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'No of customers' column on 'Bill Run Cycles' page should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Enable_Payment_AllocationBY_rollup")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'No of customers' column on 'Bill Run Cycles' page not displayed-----");
		}
		return null;
	}	

	//Meter_Read roll_over
	public WebElement Roll_over() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Roll_over should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("roll_over")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Meter_Read not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Roll_over not displayed-----");
		}
		return null;
	}
	//Meter_Security Deposit
	public WebElement Security_DepositsImport() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Security Deposit Import should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Secuirtydeposit_import")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Security Deposit  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Security Deposit Import not displayed-----");
		}
		return null;
	}
	//Prorated_Tariff_Import
	public WebElement Prorated_Tariff_Import()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Prorated Tariff Import should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ProratedTariffImport")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Meter_Read not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Prorated Tariff Import  not displayed-----");
		}
		return null;
	}
	//click on Penalty Button
	public WebElement Penalty_click()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Penality Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Penality")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Penality Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Penality Button not displayed-----");
		}
		return null;
	}
	//click on Penalty Button
	public WebElement Create_Penalty()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Create_Penalty should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Create_Penality")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Create_Penalty not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Create_Penalty not displayed-----");
		}
		return null;
	}

	//click on Penalty option type
	public WebElement Penalty_Options()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* penalty option  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Penalityoption")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Meter_Read not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Penalty option not displayed-----");
		}
		return null;
	}
	//Ptoptionselect
	public WebElement SelectPenalty_Options()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Select option  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Ptoptionselect")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Select option not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Select option not displayed-----");
		}
		return null;
	}




	//Description 			
	public WebElement PenaltyDescription()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* penalty option  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Penalty_Description")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Meter_Read not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Penalty option not displayed-----");
		}
		return null;
	}
	//Grace Days 
	public WebElement Grace_Day()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* penalty option  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("GraceDay")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Meter_Read not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Penalty option not displayed-----");
		}
		return null;
	}
	//savePenalty
	public WebElement Save_Penalty()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Save penalty option  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("savepenalty")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Meter_Read not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Save Penalty  not displayed-----");
		}
		return null;
	}
	//save Penalty 
	public WebElement assertsavepenalty()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Save Penalty' under 'Penalty' Section should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("save_Penalty")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" 'Save Penalty' under 'Penalty' Section not displayed-----");
		}
		return null;
	}
	//editPenalty	
	public WebElement edit_Penalty()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* penalty option  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("penalty_edit")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Meter_Read not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Penalty option not displayed-----");
		}
		return null;
	}

	//change_Description 
	public WebElement change_Description()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* change_Description text box should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("chngdescription")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Meter_Read not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*change_Description text box not displayed-----");
		}
		return null;
	}
	//save Penalty 
	public WebElement UpdateSave_Penalty()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* penalty option  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("updatesavepenalty")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Meter_Read not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Penalty option not displayed-----");
		}
		return null;
	}
	//assertupdatesavepenalty
	public WebElement assertupdatesavepenalty()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'Save Penalty' under 'Penalty' Section should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("updatePenalty")));
			return ele;	
		} catch (Exception e) {

			System.out.println(" 'Save Penalty' under 'Penalty' Section not displayed-----");
		}
		return null;
	}
	//Detele record under Penalty Record
	public WebElement Del_penalty()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Del_penalty should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("DelPenality")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Del_penalty not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Del_penalty not displayed-----");
		}
		return null;
	}
	public WebElement ConfirmDel_penalty()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* ConfirmDel_penalty should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("confDel")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*ConfirmDel_penalty not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*ConfirmDel_penalty not displayed-----");
		}
		return null;
	}
	//check record witch del

	public WebElement Serach_del_record()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* ConfirmDel_penalty should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("serch_del_Record")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*ConfirmDel_penalty not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*ConfirmDel_penalty not displayed-----");
		}
		return null;
	}
	//allocation_btn
	public WebElement allocation()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* allocation should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("allocation_btn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*allocation not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*allocation not displayed-----");
		}
		return null;
	}
	//Source locator
	public WebElement Sourcelocator_allocation()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Sourcelocator_allocation should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SourcelocatorAllocatn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Sourcelocator_allocation not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Sourcelocator_allocation not displayed-----");
		}
		return null;
	}
	//DestinationlocatorAllocation
	public WebElement Destinationlocator_allocation()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Destinationlocator should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("DestinationlocatorAllocation")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Destinationlocator not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Destinationlocator not displayed-----");
		}
		return null;
	}
	// Update Allocation	

	public WebElement Update_allocation()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Update Allocation Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("updateallocation")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Update Allocation not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Update Allocation not displayed-----");
		}
		return null;
	}
	//Late_Fee_Settings
	public WebElement Late_Fee_Settings()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Late_Fee_Settings Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("latefeeSetting")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Late_Fee_Settings not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Late_Fee_Settings not displayed-----");
		}
		return null;
	}
	//	
	public WebElement AccountCharg_opt()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Account Charge_option Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ac_chrg_opt")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Late_Fee_option not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Account Charge_option not displayed-----");
		}
		return null;
	}	
	//Elec_rollup_desc
	public WebElement ElecRollup_description_opt()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Account Charge_option Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Elec_rollup_desc")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Late_Fee_option not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Account Charge_option not displayed-----");
		}
		return null;
	}	

	//payment batch
	public WebElement payment_batch()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Payment_batch tab Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("paymentbatch")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Payment_batch tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Payment_batch tab not displayed-----");
		}
		return null;
	}
	//Batch_NO
	public WebElement BatchNO()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Batch_no field Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Batch_no")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Batch_no field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Batch_no field not displayed-----");
		}
		return null;
	}
	//Transaction Type 
	public WebElement Transation_type()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Transation_type dropdown Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("transactiontyp")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Transation_type dropdown not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Transation_type dropdown not displayed-----");
		}
		return null;
	}
	//Payment Method
	public WebElement PaymentMethod()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Payment method dropdown Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("pay_method")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Payment method dropdown not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Payment method dropdown not displayed-----");
		}
		return null;
	}

	//	ID_Used
	public WebElement cutmrIDUsed()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*ID Used dropdown Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ID_used")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*ID Used dropdown not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*ID Used dropdown not displayed-----");
		}
		return null;
	}
	//customer_no
	public WebElement customer_no1()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*ID Used dropdown Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customer_no")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*ID Used dropdown not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*ID Used dropdown not displayed-----");
		}
		return null;
	}
	//Enter Amount 
	public WebElement amountentr()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Amount Enter Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("entramunt")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Amount Enter  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Amount Enter  not displayed-----");
		}
		return null;
	}
	//add comments for Batch payments in Admin
	public WebElement batch_Comments()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Batch Payment comment box Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("commentforBatchpay")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Amount Enter  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Batch Payment comment box not displayed-----");
		}
		return null;
	}


	//Assertion On batch name 

	public WebElement assertionsavebatchno()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Save 'Batch no' Record under 'Payment Batch History' Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("assertbatchnosave")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Save 'Batch no' Record under 'Payment Batch History' not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Save 'Batch no' Record under 'Payment Batch History'  not displayed-----");
		}
		return null;
	}
	//customer Portal Setting 
	public WebElement customerportalsetting()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Amount Enter Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custportalsetting")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Amount Enter  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Amount Enter  not displayed-----");
		}
		return null;
	}
	//enablE_servicE_ediT
	public WebElement EnablEservicE_edit()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Amount Enter Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("onserviceedit")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Amount Enter  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Amount Enter  not displayed-----");
		}
		return null;
	}



	//enablE_accounT_detailS_ediT
	public WebElement EnableAccounTDetailS_edit()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Amount Enter Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("onacdetailedit")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Amount Enter  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Amount Enter  not displayed-----");
		}
		return null;
	}



	//enablE_servicE_settingS_ediT

	public WebElement EnableServiceSettings_edit()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Amount Enter Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("onserviceseting")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Amount Enter  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Amount Enter  not displayed-----");
		}
		return null;
	}
	public WebElement save_cutsmr_portalsetting()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Amount Enter Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("savecuststigportl")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Amount Enter  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Amount Enter  not displayed-----");
		}
		return null;
	}


	public WebElement customer_attachment()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Customer Attachment toggle button Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("customer_attachmnt")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Customer Attachment toggle button  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Customer Attachment toggle button not displayed-----");
		}
		return null;
	}
	//reminders button click
	public WebElement Reminders_click()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Reminder button Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("remindersbtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Reminders button  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Reminders button not displayed-----");
		}
		return null;
	}
	//add reminder update
	public WebElement addreminderdays()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Reminder day field Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("addreminderdays")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Reminder day field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Reminder day field not displayed-----");
		}
		return null;
	}
	//update reminder
	public WebElement UpdateReminder()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Update reminder button Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("updatereminderbtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Update reminder button  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Update reminder button not displayed-----");
		}
		return null;
	}
	// Update reminder save confirm
	public WebElement OKUpdatesfreminder()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*'OK' Confirm  button Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("okbtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*'OK' Confirm  button  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*'OK' Confirm  button not displayed-----");
		}
		return null;
	}	
	//Outbox button

	public WebElement outboxbutton()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*'Outbox' button Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("outboxbtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*'Outbox' button  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*'Outbox' button not displayed-----");
		}
		return null;
	}
	//Generate Reminder Button 
	public WebElement generatereminderbtn()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*'Generate Reminder' button Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Generatereminderbtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*'Generate Reminder' button  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*'Generate Reminder' button not displayed-----");
		}
		return null;
	}
	//	Generate Reminder Confirm 
	public WebElement okConfirm_GenerateReminder()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*'OK' confirm Generate Reminder button Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("OkConfirmGenReminder")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*'OK' confirm Generate Reminder button  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*'OK' confirm Generate Reminder not displayed-----");
		}
		return null;
	}



	//assert on Outbox 

	public WebElement assertionoutbox()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Outbox section  Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("assertOutbox")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Outbox section  not displayed-----"+e.getLocalizedMessage());
			System.out.println("*Outbox section not displayed-----");
		}
		return null;
	}
	public WebElement searchCustomer()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*SearchCustomer filed Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("serchcustmr")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Outbox section  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Search Customer filed not displayed-----");
		}
		return null;
	}

	//Select Customer select under 	Outbox

	public WebElement selectCustomer_outbox()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Customer  Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("CustSelectundrOutbox")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Customer  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Customer not displayed-----");
		}
		return null;
	}	
	//select communication 	under Customer menu
	public WebElement communicationclick()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Communication tab Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Cummunicationtab")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Communication tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Communication tab not displayed-----");
		}
		return null;
	}		

	//assertion on Customer tab Enable Or Disable under Workflow Setting
	public WebElement assertionrecordCUMMN()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Communication tab Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("recordtabundercommunication")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Communication tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Communication tab not displayed-----");
		}
		return null;
	}		
	//click Attachment under Customer menu
	public WebElement customerAttachment()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Customer Attachment tab Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("cust_attachments")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Customer Attachment tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Customer Attachment tab not displayed-----");
		}
		return null;
	}		

	//click 'add Attachment' under Customer attachment 	
	public WebElement customerAddAttachment()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Customer Add Attachment button Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("addattchmnt")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Customer Add Attachment button not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Customer Add Attachment button not displayed-----");
		}
		return null;
	}	
	//file Classification under add Attachment
	public WebElement file_classification()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*File Classification Field  Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("fileClassification")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*File Classification Field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*File Classification Field  not displayed-----");
		}
		return null;
	}	
	// Title attachment name 
	public WebElement TitleNameAttch()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Title Name Field  Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("titlename")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Title Name Field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Title Name Field not displayed-----");
		}
		return null;
	}	
	//File Upload Under Attachment
	public WebElement fileUploadUnderAttchmnt()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*File Upload Button Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("fileload")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*File Upload Button  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*File Upload Button  not displayed-----");
		}
		return null;
	}	
	//Save  attchment 
	public WebElement saveattchment()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Save  Upload File Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("save1")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Save  Upload File not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*File Upload Button  not displayed-----");
		}
		return null;
	}	
	//Search Attachment
	public WebElement SearchAttchment()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* search text field Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchattachment")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*search text field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Fsearch text field not displayed-----");
		}
		return null;
	}		
	//Assertion On Record 

	public WebElement Assrtionrecordsearch()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* search record field Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("searchattachment")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*search record field not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*search record field not displayed-----");
		}
		return null;
	}			

	//  CARBON-GRAPH
	public WebElement CarbonEmmissionGraph()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Carbon Emmission check box  Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ClickCarbon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Carbon Emmission check box  not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Carbon Emmission check box  not displayed-----");
		}
		return null;
	}	
	//	ElectricityGraph

	public WebElement Elec_Graph()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Electricity Graph check box Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ElectricityGraph")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Electricity Graph check box not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Electricity Graph check box not displayed-----");
		}
		return null;
	}		
	//WATER-GRAPH
	public WebElement Water_Graph()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Water Graph check box Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Water_graph")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Water Graph check box not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Water Graph check box not displayed-----");
		}
		return null;
	}		

	//GAS-GRAPH-IMAGE
	public WebElement GasGraph_Images()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*GAS-GRAPH-IMAGE check box Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Gas_Graph_Img")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*GAS-GRAPH-IMAGE check box not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*GAS-GRAPH-IMAGE check box not displayed-----");
		}
		return null;
	}	
	// Category
	public WebElement Invocie_Category()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Invocie Category Dropdown Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Selectcategory")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Invocie Category Dropdown not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Invocie Category Dropdown not displayed-----");
		}
		return null;
	}
	//Assertion On Graph Placeholder 

	public WebElement AssertGasGraphPlaceHolder()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Gas Graph Placeholder Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AssertGasGraph")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Gas Graph Placeholder not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Gas Graph Placeholder not displayed-----");
		}
		return null;
	}

	//aseertion  on Carbon Graph 
	public WebElement AssertCarbonGraphPlaceHolder()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Carbon Graph  Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AssertcarbonGraph")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Carbon Graph not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Carbon Graph not displayed-----");
		}
		return null;
	}
	//Assertion Water Graph 
	public WebElement AssertWaterGraphPlaceHolder()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Water Graph Placeholder Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AssertWaterGraph")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Water Graph Placeholder not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Water Graph Placeholder not displayed-----");
		}
		return null;
	}
	// AssertElecGraphPlaceHolder()  	
	public WebElement AssertElecGraphPlaceHolder()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Water Graph Placeholder Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Assert_elec_Graph")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Water Graph Placeholder not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Water Graph Placeholder not displayed-----");
		}
		return null;
	}

	//water Icon CLick
	public WebElement waterIcon()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Water service tab Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("water_icon_CLick")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Water service tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Water service tab not displayed-----");
		}
		return null;
	}
	//Gas Icon Click
	public WebElement Gas_btn_click()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Gas service tab Should  be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("gas_icon_CLick")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Gas service tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Gas service tab not displayed-----");
		}
		return null;
	}

	public WebElement Payment_HistoryView()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *'View History' button afer paymant should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("payedHistory")));
			return ele;	
		} catch (Exception e) {

			System.out.println("'View History' button after payment not displayed-----");
		}
		return null;
	}
	public WebElement AssertTransactionHistory()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println(" *' Transaction History' section should display ");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("transactionHistory")));
			return ele;	
		} catch (Exception e) {

			System.out.println("' Transaction History' section not displayed-----");
		}
		return null;
	}

	public WebElement ENdDate_select()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* select_end_date should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("select_end_date")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*select_end_date not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*select_end_date_as not displayed-----");
		}
		return null;
	}
	//Assertcurrentbalance()
	public WebElement Assertcurrentbalance()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Current balance '0' after payment should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("chkBalanceafterpay")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Current balance '0.00' after payment not displayed-----"+e.getLocalizedMessage());
			System.out.println("*Current balance '0.00' after payment not displayed-----");
		}
		return null;
	}
	public WebElement ENdDate_SelectBill()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* select_end_date should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Selc_end_date")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*select_end_date not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*select_end_date_as not displayed-----");
		}
		return null;
	}

	//07.05.2018	
	public WebElement Select_cust_UnderBill()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Customer  should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Selc_CustomerBillSection")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Customer not displayed-----"+e.getLocalizedMessage());
			System.out.println("Customer not displayed-----");
		}
		return null;
	}

	//Select_StatmentsTab
	public WebElement Statementstab()
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Statements Tab should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Select_StatmentsTab")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Statements Tab not displayed-----"+e.getLocalizedMessage());
			System.out.println("Statements Tab not displayed-----");
		}
		return null;
	}
	//Statements_text
	public WebElement Statements_text_Validation() 
	{
		try {
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	* Statements_text should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Statements_text")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("*Statements_text not displayed-----"+e.getLocalizedMessage());
			System.out.println("	*Statements_text not displayed-----");
		}
		return null;
	}
	//Click_Statment_Detail_icon
	public WebElement StatmentsDetail_icon() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Detail_icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("detail_Icon")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Detail_icon not displayed-----"+e.getLocalizedMessage());
			System.out.println("Detail_icon not displayed-----");
		}
		return null;
	}
	//Click_Statment_Detail_icon
	public WebElement rolbackbutton() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*rolback_button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rollbackclick")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("rollback_Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("rollback_Button not displayed-----");
		}
		return null;
	}
	//rollbackconfirmpopup

	public WebElement rollbackconfirmpopup() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*rolback_popup should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rollbackconfirm")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("rolback_popup not displayed-----"+e.getLocalizedMessage());
			System.out.println("rrolback_popup not displayed-----");
		}
		return null;
	}
	//Rollback reason 

	public WebElement rollbackreason() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Rollback text area should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rollbacktext")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Rollback text area not displayed-----"+e.getLocalizedMessage());
			System.out.println("Rollback text area not displayed-----");
		}
		return null;
	}

	// Confirm rollback complete  

	public WebElement confirmrollbackcomplete() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Confirm 'OK' button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rollbackconfirmDel")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Confirm 'OK' button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Confirm 'OK' button not displayed-----");
		}
		return null;
	} 

	// View rollback History  

	public WebElement viewrollbackhistoryclick() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*'View rollback History' button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("viewrollbackHistorybtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("'View rollback History' button not displayed-----"+e.getLocalizedMessage());
			System.out.println("'View rollback History' button not displayed-----");
		}
		return null;
	} 
	//rollbackrecord()
	public WebElement rollbackrecord() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*'View rollback History' button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("recordrollback")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("'View rollback History' button not displayed-----"+e.getLocalizedMessage());
			System.out.println("'View rollback History' button not displayed-----");
		}
		return null;	
	}
	//SelecStatmentsTab
	public WebElement Select_statments() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Statements Tab should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SelecStatmentsTab")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Statements Tab button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Statements Tab not displayed-----");
		}
		return null;	
	}

	//   rebillingempty
	public WebElement rebillingempty() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*'Rebilling data should be no data displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("RebillDateEmpty")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("'Rebilling data displayed-----"+e.getLocalizedMessage());
			System.out.println("'Rebilling data displayed-----");
		}
		return null;	
	}	
	//stmtnoempty()
	public WebElement stmtnoempty() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("*'Stmt No' data should be no data displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("NewStmtNoempty")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("'Stmt No' data displayed-----"+e.getLocalizedMessage());
			System.out.println("'Stmt No' data displayed-----");
		}
		return null;	
	}	
	//SelecStatmentsTab
	public WebElement rebillingicon() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Rebilling 'Detail' icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rebillicon_click")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("SRebilling 'Detail' icon not displayed-----"+e.getLocalizedMessage());
			System.out.println("Rebilling 'Detail' icon not displayed-----");
		}
		return null;	
	}

	//rebilling popup
	public WebElement rebillingpopupvalidation() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Rebilling 'Detail' icon should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("rebilling_popup")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("SRebilling 'Detail' icon not displayed-----"+e.getLocalizedMessage());
			System.out.println("Rebilling 'Detail' icon not displayed-----");
		}
		return null;	
	}

	public WebElement newStmtnochange() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*NewStmtno field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("NewStmtnochange")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("NewStmtno field not displayed-----"+e.getLocalizedMessage());
			System.out.println("NewStmtno field not displayed-----");
		}
		return null;	
	}

	//rebilling complete
	public WebElement rebilling_RunBill() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Run Bill Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("runbill_rebill")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Run Bill Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Run Bill Button not displayed-----");
		}
		return null;	
	}
	//Newstmtnocheck
	public WebElement Newstmtnocheck() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Rebill new Statements no. should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("checkNewStmt_no")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Rebill new Statements no. not displayed-----"+e.getLocalizedMessage());
			System.out.println("Rebill new Statements no. not displayed-----");
		}
		return null;	
	}

	//SelecStatmentsTab
	public WebElement click_statments() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("	*Statements Tab should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("clickStatmentsTab")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Statements Tab button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Statements Tab not displayed-----");
		}
		return null;	
	}	
	//	Plan Search	
	public WebElement SearchPlan() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Plan Search field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("plan_search")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Plan Search field  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Plan Search field  not displayed-----");
		}
		return null;	
	}
	//Gasplan

	public WebElement Gasplan() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Atugenerated Gas Plan should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Validate_Gas_plan")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Atugenerated Gas Plan  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Atugenerated Gas Plan not displayed-----");
		}
		return null;	
	}
	//peak_ofpeak_Elec1	
	public WebElement peak_ofpeak_Elec1() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Atugenerated peak, offpeak,shoulder Plan should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Validate_first_ELect_plan")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Atugenerated peak, offpeak,shoulder Plan  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Atugenerated peak, offpeak,shoulder Plan not displayed-----");
		}
		return null;	
	}	
	//ElectricityPlan_Elec2	
	public WebElement ElectricityPlan_Elec2() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Atugenerated Electricity Template Plan should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("validation_second_Elect_plan")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Atugenerated Electricity Template Plan  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Atugenerated Electricity Template Plan not displayed-----");
		}
		return null;	
	}
	//waterplan()
	public WebElement waterplan() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Atugenerated water Template Plan should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("validation_water_plan")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Atugenerated water Template Plan  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Atugenerated water Template Plan not displayed-----");
		}
		return null;	
	}

	//Meter read (Peak )
	public WebElement peak_MeaterRead() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Meter Read (Peak) should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("peakmeaterRead")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Meter Read (Peak)  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Meter Read (Peak) not displayed-----");
		}
		return null;	
	}		

	//Meter read (Off Peak )
	public WebElement OffPeak_MeaterRead() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Meter Read (Off-Peak) should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("OffpkeakMterRead")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Meter Read (Off-Peak)  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Meter Read (Off-Peak) not displayed-----");
		}
		return null;	
	}			
	//Meter read (Off Peak )
	public WebElement shoulder_MeaterRead() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Meter Read (Shoulder) should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("shouldermeterread")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Meter Read (shoulder)  not displayed-----"+e.getLocalizedMessage());
			System.out.println("Meter Read (shoulder) not displayed-----");
		}
		return null;	
	}					
	//ChangesReminder	
	public WebElement ChangesReminder() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Reminder days changed should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("reminder_changesvalidation")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Reminder days changed not displayed-----"+e.getLocalizedMessage());
			System.out.println("Reminder days changed not displayed-----");
		}
		return null;	
	}		
	//ChangesReminder	
	public WebElement monthsfirstdate() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("monthly first date should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("first_day")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("monthly first date  not displayed-----"+e.getLocalizedMessage());
			System.out.println("monthly first date  not displayed-----");
		}
		return null;	
	}		
	//last_day	

	public WebElement monthslastdate() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("monthly last date should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("last_day")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("monthly last date  not displayed-----"+e.getLocalizedMessage());
			System.out.println("monthly Last date  not displayed-----");
		}
		return null;	
	}	
	//Rate plan Import

	public WebElement RatePlanClick() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Rate Plan should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("RatePlan")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Rate Plan not displayed-----"+e.getLocalizedMessage());
			System.out.println("Rate Plan not displayed-----");
		}
		return null;	
	}

	//New_groupSeelct		
	public WebElement Select_newGroup() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("New Gorup Option should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("New_groupSeelct")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("New Gorup Optionn not displayed-----"+e.getLocalizedMessage());
			System.out.println("New Gorup Option not displayed-----");
		}
		return null;	
	}	
	//SubmintGroup	
	public WebElement SelectGroup() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Login Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SubmintGroup")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Login Button not displayed-----");
		}
		return null;	
	}	

	public WebElement CustomerToDisplay() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Login Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custmToDisplay")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Login Button not displayed-----");
		}
		return null;	
	}	
	public WebElement CustomertoDispaytypeDropdown() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Login Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("custToDsipayoption")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Login Button not displayed-----");
		}
		return null;	
	}	

	// SelectAllopt

	public WebElement AllSelectForCycle() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Login Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SelectAllopt")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Login Button not displayed-----");
		}
		return null;	
	}	
	//  ShowingAllFilter

	public WebElement FilterAllSelectCustomer() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Login Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ShowingAllFilter")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Login Button not displayed-----");
		}
		return null;	
	}	

	//  SelectSearchCustomer

	public WebElement selectcustomerinCycle() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Login Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SelectSearchCustomer")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Login Button not displayed-----");
		}
		return null;	
	}

	//  Search_FeildINCycle

	public WebElement SearcFieldUnderBillRunCyclePage() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Search Field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Search_FeildINCycle")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Search Field is not displayed-----");
		}
		return null;	
	}
	// EditCycle	
	public WebElement EditBIll_RunCycle() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Search Field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("EditCycle")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Search Field is not displayed-----");
		}
		return null;	
	}

	// CustomerDetail	
	public WebElement GetCustomerNoAndName() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Search Field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("CustomerDetail")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Search Field is not displayed-----");
		}
		return null;	
	}
	//  CancelBtnonCycle	
	public WebElement CancelButtonOnCustomenr() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Search Field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("CancelBtnonCycle")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Search Field is not displayed-----");
		}
		return null;	
	}	
	//  NoCustomer	
	public WebElement CustomenrCountisZero() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Search Field should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("NoCustomer")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Search Field is not displayed-----");
		}
		return null;	
	}		

	// AddNewBucketBtn

	public WebElement AddNewBucket_Button() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Add New Bucket Button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AddNewBucketBtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Add New Bucket Button is not displayed-----");
		}
		return null;	
	}		

	// AddNewBucketPopup
	public WebElement AddNewBucket_Popup_TItle() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Add New Bucket Popup should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AddNewBucketPopup")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Add New Bucket Popup is not displayed-----");
		}
		return null;	
	}

	// BucketDescription

	public WebElement BucketDescriptionName() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Add New Bucket Popup should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("BucketDescription")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Add New Bucket Popup is not displayed-----");
		}
		return null;	
	}
	// AdListBtn
	public WebElement Add_List_ButtonOnAllocationBycket() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Add to List button should be displayed");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AdListBtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Add to List button is not displayed");
		}
		return null;	
	}
	//  GetDescription
	public WebElement AddedDescriptionValue() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Added Description should be added");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("GetDescription")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Added Description is not displayed-----");
		}
		return null;	
	}

	// SaveChangesBtn
	public WebElement SaveChangesButton() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Added Description should be added");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SaveChangesBtn")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Added Description is not displayed-----");
		}
		return null;	
	}
	// Successmsg
	public WebElement Successmessage() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Added Description should be added");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Successmsg")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Added Description is not displayed-----");
		}
		return null;	
	}
	//  GetvalueBucket
	public WebElement GetSecondVaule() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Added value should be get");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("GetvalueBucket")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Added value is not get-----");
		}
		return null;	
	}
	// CheckEqual
	public WebElement GetFirstDescriptionValue() 
	{
		try { 
			WebDriverWait wait= new WebDriverWait(driver,60);
			System.out.println("Both Vlaue are should be Same");
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("CheckEqual")));
			return ele;	
		} catch (Exception e) {
			Reporter.log("Login Button not displayed-----"+e.getLocalizedMessage());
			System.out.println("Both vlaue are different-----");
		}
		return null;	
	}
	// EditIConOfBucket
	public WebElement EditIconOFAddedBucket()
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Edit Icon should Be Clickable");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("EditIConOfBucket")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Edit Icon of the Allocation Bucket"+e.getLocalizedMessage());
			System.out.println("Edit icon is not present or not clickable");
		} return null;
	}
	//  updateBucketpopup
	public WebElement Edit_AllocationPopupTitle()
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Edit Allocation popup should Be appear");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("updateBucketpopup")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Edit Icon of the Allocation Bucket"+e.getLocalizedMessage());
			System.out.println("Edit icon is not present or not clickable");
		} return null;
	}
	//	Update_Desc_Field	
	public WebElement Description_FieldOnEdit()
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Edit Allocation popup should Be appear");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Update_Desc_Field")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Edit Icon of the Allocation Bucket"+e.getLocalizedMessage());
			System.out.println("Edit icon is not present or not clickable");
		} return null;
	}
//  updatebtn
	public WebElement Update_Button()
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("'Update' button Should be clickable");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("updatebtn")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Update Button is not Present or not correct Name Appears"+e.getLocalizedMessage());
			System.out.println("Update Button is not Present or not correct Name Appears");
		} return null;
	}
// DeleteAllocationBtn
	
	public WebElement DeleteBtn()
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("'Delete' button Should be clickable");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("DeleteAllocationBtn")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Update Button is not Present either not correct Name Appears"+e.getLocalizedMessage());
			System.out.println("Update Button is not Present either not correct Name Appears");
		} return null;
	}

	// confDel
	public WebElement ConfirmationOk() 
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Confirmation Ok button  Should be clickable");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("confDel")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Confirmation OK Button is clickable onr not present"+e.getLocalizedMessage());
			System.out.println("Confirmation OK Button is clickable onr not present");
		} return null;
	}
	
	// SearchPlanNew
	public WebElement SearchPlan_Input() 
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Search Field Should be editable");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("SearchPlanNew")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Search field should be editable"+e.getLocalizedMessage());
			System.out.println("Search Field is not editable neither not present");
		} return null;
	}
	// EditPlanIcon
	public WebElement Edit_Search_Plan() 
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Edit icon Should be clickable");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("EditPlanIcon")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Edit icon is not editable"+e.getLocalizedMessage());
			System.out.println("Edit icon is not editable either is not present");
		} return null;
	}
	// TariffBtn
	public WebElement AddTariffButton() 
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Add Tariff Button Should be clickable");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("TariffBtn")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Edit icon is not editable"+e.getLocalizedMessage());
			System.out.println("Add Tarif is not editable either is not present");
		} return null;
	}
	// Allocationdropdown
	public WebElement AllocationDropdownonTariffpopup() 
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Allocation dropdown Should be clickable");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Allocationdropdown")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Allocation Dropdown is not editable"+e.getLocalizedMessage());
			System.out.println("Allcoation Dropdown under no option either is not present");
		} return null;
	}
	
	//  AdminPlan
	public WebElement Plans_Button() 
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Plans Button Should be clickable");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AdminPlan")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Plans is not editable"+e.getLocalizedMessage());
			System.out.println("Plans button under no option either is not present");
		} return null;
	}
	// ViewHistory
	public WebElement ModifyAllocation_Btn() 
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Modify Allcate Button Should be clickable");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("ModifyAllocate")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Modify Allcate Button is not editable"+e.getLocalizedMessage());
			System.out.println("Modify Allcate Button under no option either is not present");
		} return null;
	}
//AllpaymentforBuckets
	public WebElement AddpaymentforBuckets() 
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Modify Allcate Button Should be clickable");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("AllpaymentforBuckets")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Modify Allcate Button is not editable"+e.getLocalizedMessage());
			System.out.println("Modify Allcate Button under no option either is not present");
		} return null;
	}
// upatealloc
	public WebElement UpdateAllocation() 
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Update Button Should be clickable");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("upatealloc")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Update Button is not editable"+e.getLocalizedMessage());
			System.out.println("Update Button under no clickable either is not present");
		} return null;
	}
	// refreshbtn
	
	public WebElement Refreshbtn() 
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Refresh Button Should be clickable");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("refreshbtn")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Refresh Button is not editable"+e.getLocalizedMessage());
			System.out.println("Refresh Button under no clickable either is not present");
		} return null;
	}
	//  TransamountRecieved	
	public WebElement Recieved_Payment() 
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Transaction Amount should be Recieved");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("TransamountRecieved")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Transaction Amount is not Recieved"+e.getLocalizedMessage());
			System.out.println("Transaction Amount is not present");
		} return null;
	}
	// Paidamount
	public WebElement Transaction_amountget() 
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Transaction Amount should be Recieved");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("Paidamount")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Transaction Amount is not Recieved"+e.getLocalizedMessage());
			System.out.println("Transaction Amount is not present");
		} return null;
	}
	// unallocatedamount
	public WebElement unallocated_amountget() 
	{   
		try
		{
			WebDriverWait wait=new WebDriverWait(driver, 60);
			System.out.println("Unallocated Amount should be Recieved");
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(objMap.getLocator("unallocatedamount")));
			return ele;
		} catch (Exception e)
		{
			Reporter.log("Unallocated Amount is not Recieved"+e.getLocalizedMessage());
			System.out.println("Unallocated Amount is not present");
		} return null;
	}	
	
	
}







