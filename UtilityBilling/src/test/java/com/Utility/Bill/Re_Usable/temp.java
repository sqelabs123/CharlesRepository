package com.Utility.Bill.Re_Usable;

	
	import java.io.IOException;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class temp {
	// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@CHANGE@@@@@@@@@@@@@@@@@@@@@@@@@@
							static String last="";
							String groupName = "GroupS Electricity Company";
	// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@CHANGE@@@@@@@@@@@@@@@@@@@@@@@@@@

	String companyname = "Group verma Electricity";
	//String email = "cverma28@gmail.com";
	String contactemail = "kingtt616@gmail.com";
	String pass = "Testing004#";
	String changepass = "Testing004#";
	String login = "ccverma28@sqelabs.com";
	String Fname = "anshul";
	String lname = "verma";
	String Url = "https://test.electricitybilling.com/billingtest/";
	WebDriver driver = new FirefoxDriver();

			@Test(priority = 0)
			public void openBrowser() throws InterruptedException {
			System.out.print("\nBrowser open");
			
			driver.get(Url); // open the url
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			}
			//###############################################
			//###############################################	
			@Test(priority = 1)
			public void signUpForm() throws InterruptedException {
			// click on try it free button ntiopnN
			driver.findElement(By.xpath("//*[text()='Try it for free!']")).click();
			// click on submit button and The user is directed to the 'Home' page on
			// clicking the 'Login' button
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// Get all the window handles in a set
			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();
			// iterate through your windows
			while (it.hasNext()) {
			String parent = it.next();
		
			
					
			String newwin = it.next();
			driver.switchTo().window(newwin);
			// Assertion to validate Overview text is present on new open page
			String Actualtext = driver.findElement(By.xpath(".//*[@id='signup-header']/span")).getText();
			Assert.assertEquals(Actualtext,"Start your free trial by signing up");
			System.out.print("\n assertion_method_1() ->Start your free trial by signing up Part executed");
			
			/*Date date = new Date();
	        //current date user entry
	        String  last=date.toString();
	        System.out.println("The Time Is :-----------"+last);
	       last= last.replace(":", "");
	        last=last.replace(" ", "");*/
	        DateFormat dateFormat = new SimpleDateFormat("HHmmss");
			Calendar cal = Calendar.getInstance();
			System.out.println(dateFormat.format(cal.getTime()));
			last=cal.getTime().toString(); 
			System.out.println(last=last.substring(11,19));
			last=last.replaceAll(":","");
	        
	        // display time and date using toString()
	        System.out.println(last);
	        String email="Test"+last+"@gmail.com";
	        
	        
			// enter company name
			driver.findElement(By.name("company-name")).sendKeys(companyname + last);
			Thread.sleep(1000);
			// enter first name
			driver.findElement(By.name("contact-given-name")).sendKeys(
			Fname + last);
			Thread.sleep(1000);
			// enter surname 1
			driver.findElement(By.id("contact-surname")).sendKeys(lname + last);
			Thread.sleep(1000);
			// enter email
			driver.findElement(By.id("contact-email")).sendKeys(last + contactemail);
			Thread.sleep(1000);
			// Select country
			Select mydrpdwn = new Select(driver.findElement(By.id("country")));
			mydrpdwn.selectByVisibleText("Australia");
			Thread.sleep(2000);
			// enter phone-number
			driver.findElement(By.id("contact-phone-number")).sendKeys("421424740");
			Thread.sleep(1000);
			// customer-base
			driver.findElement(By.id("customer-base")).sendKeys("1 - 1,000");
			Thread.sleep(1000);
			// recaptcha_response_field
			driver.findElement(By.id("recaptcha_response_field")).click();
			Thread.sleep(20000);
			// Enter on submit-button
			driver.findElement(By.id("submit-button")).click();
			Thread.sleep(10000);
			String title = driver.getTitle();
			System.out.println(title);
			// Assertion to validate email sent text is present on new open page
			String Actualtext1 = driver.findElement(By.xpath(".//*[@id='signup-content']/div")).getText();
			Assert.assertEquals(Actualtext1,"An email has been sent to the registered address. Please click here to activate your account.");
			System.out.print("\n assertion_method_1() ->Activate your account Part executed");
			// Click on the here link
			driver.findElement(By.xpath("//*[text()='here']")).click();
			Thread.sleep(2000);
			// Assertion to validate Activate your account text is present on
			// new open page
			String Actualtext01 = driver.findElement(By.xpath(".//*[@id='signup-header']/span")).getText();
			Assert.assertEquals(Actualtext01, "Activate your account");
			System.out.print("\n assertion_method_1() ->Activate your account Part executed");
			driver.close();
			driver.switchTo().window(parent);
			}
			}
			
			//###############################################
			//###############################################		
			@Test(priority = 2)
			public void login() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.id("j_username")).sendKeys(login); // enter valid
			// username
			Thread.sleep(1000);
			driver.findElement(By.id("predigpass")).sendKeys(pass);// enter valid
			// password
			Thread.sleep(1000);
			driver.findElement(By.name("submit")).click(); // click on submit button
			// button
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String sTitle = driver.getTitle(); // verify tittle of page
			System.out.println(sTitle);
			}
			//###############################################
			//###############################################	
			@Test(priority = 3)
			public void changePassword() throws InterruptedException, IOException {
			// Click on the Admin link
			driver.findElement(By.linkText("Admin")).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			// Clik on the Password link
			driver.findElement(By.linkText("Password")).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			// Assertion to validate Change Password text is present on new open
			// page
			String Actualtext6 = driver.findElement(By.xpath(".//*[@id='utbFrmDiv']/form/div[2]/h2")).getText();
			Assert.assertEquals(Actualtext6, "Change Password");
			System.out.println("==================================================\n"+ Actualtext6);
			System.out.print("\nAssertion_method_4() ->Change PasswordPart executed");
			// new password
			driver.findElement(By.id("predigpass")).clear();
			driver.findElement(By.id("predigpass")).sendKeys(changepass);
			Thread.sleep(2000);
			// confirm password
			driver.findElement(By.id("repredigpass")).clear();
			driver.findElement(By.id("repredigpass")).sendKeys(changepass);
			Thread.sleep(2000);
			// Click on the chnge pswd btn link
			driver.findElement(By.linkText("Change Password")).click();
			Thread.sleep(1000);
			// OK confirmation
			driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
			Thread.sleep(2000);
			// Assertion to validate Change Password button is present on new open
			// page
			String Actualtext07 = driver.findElement(By.xpath(".//*[@id='utbFrmDiv']/form/div[1]/div/div/div/center/p")).getText();
			Assert.assertEquals(Actualtext07,"Password has been successfully updated.");
			System.out.print("\nAssertion_method_5() ->Change Password Part executed");
			}
			//###############################################
			//###############################################	
			
			@Test(priority = 4)
			public void editGroup() throws InterruptedException {
			// Click on the Admin link
			driver.findElement(By.linkText("Admin")).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			// Click on the edit grouplink
			driver.findElement(By.linkText("Edit Group")).click();
			Thread.sleep(2000);
			// Enter name in trading as a compny field name
			driver.findElement(By.name("name")).clear();
			driver.findElement(By.name("name")).sendKeys(groupName);
			Thread.sleep(2000);
			// ///////////////////////////////////////////Contact Details
			// section/////////////////////////////////////////
			// ////////////////////////Name///////////////////////////
			// owner1Name
			driver.findElement(By.name("owner1Name")).clear();
			driver.findElement(By.name("owner1Name")).sendKeys("Jimmy");
			// owner2Name
			driver.findElement(By.name("owner2Name")).clear();
			driver.findElement(By.name("owner2Name")).sendKeys("Sahil");
			// operationName
			driver.findElement(By.name("operationName")).clear();
			driver.findElement(By.name("operationName")).sendKeys("Test");
			Thread.sleep(2000);
			// financeName
			driver.findElement(By.name("financeName")).clear();
			driver.findElement(By.name("financeName")).sendKeys("financial test");
			// salesName
			driver.findElement(By.name("salesName")).clear();
			driver.findElement(By.name("salesName")).sendKeys("sale test");
			// ////////////////////////Email///////////////////////////
			// owner1Email
			driver.findElement(By.name("owner1Email")).clear();
			driver.findElement(By.name("owner1Email")).sendKeys("owneroneemail@gmail.com");
			Thread.sleep(2000);
			// owner2Email
			driver.findElement(By.name("owner2Email")).clear();
			driver.findElement(By.name("owner2Email")).sendKeys("ownertwoemail@gmail.com");
			// operationEmail
			driver.findElement(By.name("operationEmail")).clear();
			driver.findElement(By.name("operationEmail")).sendKeys("operationemail@gmail.com");
			// financeEmail
			driver.findElement(By.name("financeEmail")).clear();
			driver.findElement(By.name("financeEmail")).sendKeys("financeemail@gmail.com");
			// salesEmail
			driver.findElement(By.name("salesEmail")).clear();
			driver.findElement(By.name("salesEmail")).sendKeys("sale@gmail.com");
			// //////////////////////// PHONE 1///////////////////////////
			// owner1Phone1
			driver.findElement(By.name("owner1Phone1")).clear();
			driver.findElement(By.name("owner1Phone1")).sendKeys("123456789aa");
			Thread.sleep(2000);
			// owner2Phone1
			driver.findElement(By.name("owner2Phone1")).clear();
			driver.findElement(By.name("owner2Phone1")).sendKeys("987654321aa");
			// operationPhone1
			driver.findElement(By.name("operationPhone1")).clear();
			driver.findElement(By.name("operationPhone1")).sendKeys("12345545849aa");
			// financePhone1
			driver.findElement(By.name("financePhone1")).clear();
			driver.findElement(By.name("financePhone1")).sendKeys("65525655789aa");
			// salesPhone1
			driver.findElement(By.name("salesPhone1")).clear();
			driver.findElement(By.name("salesPhone1")).sendKeys("558156789aa");
			// //////////////////////// PHONE 2///////////////////////////
			// owner1Phone2
			driver.findElement(By.name("owner1Phone2")).clear();
			driver.findElement(By.name("owner1Phone2")).sendKeys("84888589aa");
			// owner2Phone2
			driver.findElement(By.name("owner2Phone2")).clear();
			driver.findElement(By.name("owner2Phone2")).sendKeys("455875789aa");
			Thread.sleep(2000);
			// operationPhone2
			driver.findElement(By.name("operationPhone2")).clear();
			driver.findElement(By.name("operationPhone2")).sendKeys("898996789");
			// financePhone2
			driver.findElement(By.name("financePhone2")).clear();
			driver.findElement(By.name("financePhone2")).sendKeys("898586789aa");
			// salesPhone2
			driver.findElement(By.name("salesPhone2")).clear();
			driver.findElement(By.name("salesPhone2")).sendKeys("52887789aa");
			
			// //////////////////////// FAX ///////////////////////////
			// owner1Fax
			driver.findElement(By.name("owner1Fax")).clear();
			driver.findElement(By.name("owner1Fax")).sendKeys("10006789aa");
			// owner2Fax
			driver.findElement(By.name("owner2Fax")).clear();
			driver.findElement(By.name("owner2Fax")).sendKeys("111186789aa");
			// operationFax
			driver.findElement(By.name("operationFax")).clear();
			driver.findElement(By.name("operationFax")).sendKeys("115789aa");
			// financeFax
			driver.findElement(By.name("financeFax")).clear();
			driver.findElement(By.name("financeFax")).sendKeys("02286789aa");
			// salesFax
			driver.findElement(By.name("salesFax")).clear();
			driver.findElement(By.name("salesFax")).sendKeys("55586789aa");
			// /////////////////////////////////////BANK
			// section///////////////////////////////////////////////
			// typeOfCreditcard
			Select mydrpdwn = new Select(driver.findElement(By.id("typeOfCreditcard")));
			mydrpdwn.selectByVisibleText("Visa");
			Thread.sleep(2000);
			List<WebElement> oSize = mydrpdwn.getOptions();
			int iListSize = oSize.size();
			System.out.println("Drop-Down Option\n");
			for (int i = 0; i < iListSize; i++) {
			String sValue = mydrpdwn.getOptions().get(i).getText();
			System.out.println(sValue);
			}
			// bankName
			driver.findElement(By.name("bankName")).clear();
			driver.findElement(By.name("bankName")).sendKeys("PNB");
			Thread.sleep(2000);
			// bankAccount
			driver.findElement(By.name("bankAccount")).clear();
			driver.findElement(By.name("bankAccount")).sendKeys("Sonia12");
			// bankAccountNumber
			driver.findElement(By.name("bankAccountNumber")).clear();
			driver.findElement(By.name("bankAccountNumber")).sendKeys("01015545858");
			// creditcardHolder
			driver.findElement(By.name("creditcardHolder")).clear();
			driver.findElement(By.name("creditcardHolder")).sendKeys("abhi12");
			// creditCardNumber
			driver.findElement(
			By.xpath(".//*[@id='franchisee']/div[4]/div[2]/div[3]/div[4]/input")).clear();
			driver.findElement(By.xpath(".//*[@id='franchisee']/div[4]/div[2]/div[3]/div[4]/input")).sendKeys("12514aa");
			// dateExpired
			driver.findElement(By.name("dateExpired")).clear();
			driver.findElement(By.name("dateExpired")).sendKeys("032019");
			// verification id
			driver.findElement(By.name("veriNo")).clear();
			driver.findElement(By.name("veriNo")).sendKeys("032019");
			Thread.sleep(2000);
			// //////////////////////////////////////////ADDRESS section
			// postAddress
			driver.findElement(By.name("postAddress")).clear();
			driver.findElement(By.name("postAddress")).sendKeys("hno:23,street no:2,greenland");
			// postSub
			driver.findElement(By.name("postSub")).clear();
			driver.findElement(By.name("postSub")).sendKeys("Jalandhar");
			// postState
			driver.findElement(By.name("postState")).clear();
			driver.findElement(By.name("postState")).sendKeys("Punjab");
			// postCode
			driver.findElement(By.name("postCode")).clear();
			driver.findElement(By.name("postCode")).sendKeys("1444045");
			// billingAddress
			driver.findElement(By.name("billingAddress")).clear();
			driver.findElement(By.name("billingAddress")).sendKeys("hn0:25,moti nagar");
			// billingSub
			driver.findElement(By.name("billingSub")).clear();
			driver.findElement(By.name("billingSub")).sendKeys("Hoshiarpur");
			// billingState
			driver.findElement(By.name("billingState")).clear();
			driver.findElement(By.name("billingState")).sendKeys("Punjab");
			Thread.sleep(2000);
			// billingAddress
			driver.findElement(By.name("billingCode")).clear();
			driver.findElement(By.name("billingCode")).sendKeys("6635ad");
			// ////////////////Social Media /////////////////////////////////
			// ////////////////////////Notes
			// section//////////////////////////////////////////////
			// tiabNotes
			driver.findElement(By.name("tiabNotes")).clear();
			driver.findElement(By.name("tiabNotes")).sendKeys("making notes for admin tab");
			// franchiseeNotes
			driver.findElement(By.name("franchiseeNotes")).clear();
			driver.findElement(By.name("franchiseeNotes")).sendKeys("making notes for Service provider field");
			// Click on the Update button
			driver.findElement(By.linkText("Save changes")).click();
			// OK confirmation
			driver.findElement(By.xpath(".//button[contains(text(),'OK')]")).click();
			// Assertion to validate Changes have been updated text is present on
			// new open page
			String Actualtext7 = driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[1]/div/div")).getText();
			Assert.assertEquals(Actualtext7,"Success! Changes have been updated successfully.");
			System.out.print("\nAssertion_method_6() ->Success! Changes have been updated successfully.  Part executed");
			// Click on the UserIcon
			driver.findElement(By.xpath("html/body/header/div/div/ul/li[4]/a")).click();
			// Assertion to validate Logout text is present on dropdown
			String Actualtext4 = driver.findElement(By.xpath(".//*[@id='upperHeaderRightPart']/li[4]/ul/li[5]/a")).getText();
			Assert.assertEquals(Actualtext4, "Logout");
			System.out.print("\nAssertion_method_7() -> Logout Part executed");
			// Click to logout from application
			driver.findElement(By.xpath(".//*[@id='upperHeaderRightPart']/li[4]/ul/li[5]/a")).click();
			Thread.sleep(2000);
			}
			}