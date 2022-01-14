package Yellow_belt;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class invoice_setup_yellowBelt extends Sauce_Instance_Login_Test{

	String name=""; 

	//################################################

	@Test

	public void create_invoice() throws InterruptedException, Exception {

		//admin main menu
		action_obj.admin_mainMenu().click();
		//invoice setup under admin menu
		action_obj.invoice_setup().click();
		//click on create new invoice
		action_obj.createNewInvoice().click();

		//date
		Date date = new Date();
		name=date.toString();
		System.out.println("The Time Is :-----------"+name);
		name= name.replace(":", "");
		name=name.replace(" ", "");
		System.out.println(name);
		//enter invoice name
		action_obj.invoiceName().sendKeys(name);
		//scroll down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");

		//check all checkboxes
		WebElement  element1 = action_obj.maincheck();
		while(element1.isSelected()==false)
			element1.click();
		action_obj.chargeCheck().click();
		action_obj.listcheck().click();
		action_obj.itemCheck().click();
		action_obj.itemlistheadercheck().click();
		action_obj.ITEMIZATION_LIST().click();
		action_obj.GRAPH().click();
//		action_obj.GRAPH_IMAGE().click();
		action_obj.EziDebit_BPay().click();
		//save invoice
		action_obj.saveInvoice().click();
		
	}

		@Test(priority=2)
		public void front_page_main() throws Exception{
			try{
				Thread.sleep(1000);
				action_obj.closePreview().click();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			Thread.sleep(1000);
			Select mydrpdowncat = new Select(action_obj.categoryselect());
			mydrpdowncat.selectByIndex(0);	
			Thread.sleep(7000);	
			driver.switchTo().frame("invoice_content_area_ifr");
			action_obj.clickinvoicepage1().clear();
			action_obj.clickinvoicepage1().click();
			driver.switchTo().defaultContent();
			Select mydrpdown = new Select(action_obj.fields_invoice());
			mydrpdown.selectByVisibleText("Global Fields");
			Thread.sleep(1500);
			//add options by double click
			Actions action = new Actions(driver);
			action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
			action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
			action.moveToElement(action_obj.category()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
			action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
			action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
			action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentread()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.customerabn()).doubleClick().build().perform();
			action.moveToElement(action_obj.customeracn()).doubleClick().build().perform();
			action.moveToElement(action_obj.customeradd()).doubleClick().build().perform();
			action.moveToElement(action_obj.custcompname()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.custfaxno()).doubleClick().build().perform();
			action.moveToElement(action_obj.custnamecompname()).doubleClick().build().perform();
			action.moveToElement(action_obj.custno()).doubleClick().build().perform();
			action.moveToElement(action_obj.custphah()).doubleClick().build().perform();
		
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("scrollBy(0,700)", "");
			
			action.moveToElement(action_obj.custphbh()).doubleClick().build().perform();
			action.moveToElement(action_obj.custphmo()).doubleClick().build().perform();
			action.moveToElement(action_obj.custphyadd()).doubleClick().build().perform();
			action.moveToElement(action_obj.custtname()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.custtype()).doubleClick().build().perform();
			action.moveToElement(action_obj.dateofbirth()).doubleClick().build().perform();     
			action.moveToElement(action_obj.discounts()).doubleClick().build().perform();		
			action.moveToElement(action_obj.emailadd()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.firstname()).doubleClick().build().perform();
			action.moveToElement(action_obj.gst()).doubleClick().build().perform();
			action.moveToElement(action_obj.icpt()).doubleClick().build().perform();
			action.moveToElement(action_obj.nmi()).doubleClick().build().perform();

			action.moveToElement(action_obj.nextreaddateanu()).doubleClick().build().perform();
			action.moveToElement(action_obj.nextreaddatemnth()).doubleClick().build().perform();
			action.moveToElement(action_obj.nextreaddatequa()).doubleClick().build().perform();
			action.moveToElement(action_obj.nextreaddatesemianu()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.nextschreaddate()).doubleClick().build().perform();
			action.moveToElement(action_obj.openingbal()).doubleClick().build().perform();
			action.moveToElement(action_obj.otherpayreceive()).doubleClick().build().perform();
			action.moveToElement(action_obj.potdiscount()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.potdiscountrate()).doubleClick().build().perform();
			action.moveToElement(action_obj.potreversal()).doubleClick().build().perform();
			action.moveToElement(action_obj.payamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.penaltyamt()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.penaltylabel()).doubleClick().build().perform();
			action.moveToElement(action_obj.postcode()).doubleClick().build().perform();
			action.moveToElement(action_obj.prebalamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.preread()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.rebate()).doubleClick().build().perform();
			action.moveToElement(action_obj.salutation()).doubleClick().build().perform();
//			action.moveToElement(action_obj.discounts()).doubleClick().build().perform();
			action.moveToElement(action_obj.securedipamt()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.servicesupplyadd()).doubleClick().build().perform();
			action.moveToElement(action_obj.shortaddress()).doubleClick().build().perform();
			action.moveToElement(action_obj.shortaddresstwo()).doubleClick().build().perform();
			action.moveToElement(action_obj.state()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.stmtbillperiod()).doubleClick().build().perform();
			action.moveToElement(action_obj.stmtduedate()).doubleClick().build().perform();
			action.moveToElement(action_obj.stmtissuedate()).doubleClick().build().perform();
			action.moveToElement(action_obj.stmtno()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.stmtseqno()).doubleClick().build().perform();
			action.moveToElement(action_obj.suburb()).doubleClick().build().perform();
			action.moveToElement(action_obj.supplystartdate()).doubleClick().build().perform();
			action.moveToElement(action_obj.surename()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.taxunit()).doubleClick().build().perform();
			action.moveToElement(action_obj.totalgstapp()).doubleClick().build().perform();
			action.moveToElement(action_obj.totalreading()).doubleClick().build().perform();
			action.moveToElement(action_obj.totalusage()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.totalusagekwh()).doubleClick().build().perform();
			action.moveToElement(action_obj.unit()).doubleClick().build().perform();
			action.moveToElement(action_obj.usagegstapp()).doubleClick().build().perform();
			action.moveToElement(action_obj.usagegstnon()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.usagerebateamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.usagerebatelabel()).doubleClick().build().perform();
			action.moveToElement(action_obj.usagerebategst()).doubleClick().build().perform();
			//Opts are added in script to cover all feature
			action.moveToElement(action_obj.opt1()).doubleClick().build().perform();
			action.moveToElement(action_obj.opt2()).doubleClick().build().perform();
			action.moveToElement(action_obj.opt3()).doubleClick().build().perform();
			action.moveToElement(action_obj.opt4()).doubleClick().build().perform();
			action.moveToElement(action_obj.opt5()).doubleClick().build().perform();
//			action.moveToElement(action_obj.opt6()).doubleClick().build().perform();
//			action.moveToElement(action_obj.opt7()).doubleClick().build().perform();
//			action.moveToElement(action_obj.opt8()).doubleClick().build().perform();
//			action.moveToElement(action_obj.opt9()).doubleClick().build().perform();
//			action.moveToElement(action_obj.opt10()).doubleClick().build().perform();
		
		
		
		
		
		
		//scroll
		executor.executeScript("scrollBy(0,1000)", "");
		//click on save this template
		action_obj.savethis_template().click();
		//ok
		action_obj.ok().click();

		Thread.sleep(5000);
//		driver.navigate().refresh();
		action_obj.PreviewallButton().click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		String preval=driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td[1]/table[1]/tbody/tr[2]/td")).getText();
		System.out.println(preval);	
		Assertion_obj.val_invoice_assertion();
/*		
		{
		Assertion_obj.val_invoice_assertion();
		} catch (Exception e) {
			Assertion_obj.val_invoice_assertion0();
		}
		*/
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		action_obj.closePreview().click();
		
//////////////////////////////Iterator Field///////////////////////////////////		
		
		Thread.sleep(5000);
		driver.switchTo().frame("invoice_content_area_ifr");
		action_obj.clickinvoicepage1().clear();
		action_obj.clickinvoicepage1().click();
		driver.switchTo().defaultContent();
		
		mydrpdown.selectByVisibleText("Iterator Fields(Charge Summary)");
		//add options by double click
		Thread.sleep(1500);
				action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
				action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
				executor.executeScript("scrollBy(0,1000)", "");
				//click on save this template
				action_obj.savethis_template().click();
				//ok
				action_obj.ok().click();

				Thread.sleep(2000);
//				driver.navigate().refresh();
				action_obj.PreviewallButton().click();
				Thread.sleep(5000);
				driver.switchTo().frame(0);
				executor.executeScript("scrollBy(0,700)", "");
				String preval1=driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td[1]/table[1]/tbody/tr[2]/td")).getText();
				System.out.println(preval1);		
				Assertion_obj.val_invoice_assertion1();
				Thread.sleep(1000);
				driver.switchTo().defaultContent();
				action_obj.closePreview().click();
////////////////////////////////////////Iterator Fields(Itemization)	
								Thread.sleep(5000);
				driver.switchTo().frame("invoice_content_area_ifr");
				action_obj.clickinvoicepage1().clear();
				action_obj.clickinvoicepage1().click();
				driver.switchTo().defaultContent();
				
				mydrpdown.selectByVisibleText("Iterator Fields(Itemization)");
				//add options by double click
				Thread.sleep(1500);
				action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
				action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
				action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
				action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
				action.moveToElement(action_obj.category()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
				action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
				action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
				action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
				action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
				action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
				action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
				action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
				action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
				action.moveToElement(action_obj.currentread()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.customerabn()).doubleClick().build().perform();
				action.moveToElement(action_obj.customeracn()).doubleClick().build().perform();
				action.moveToElement(action_obj.customeradd()).doubleClick().build().perform();
				action.moveToElement(action_obj.custcompname()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.custfaxno()).doubleClick().build().perform();
				action.moveToElement(action_obj.custnamecompname()).doubleClick().build().perform();
						executor.executeScript("scrollBy(0,1000)", "");
						//click on save this template
						action_obj.savethis_template().click();
						//ok
						action_obj.ok().click();

						Thread.sleep(5000);
//						driver.navigate().refresh();
						action_obj.PreviewallButton().click();
						Thread.sleep(2000);
						driver.switchTo().frame(0);
						executor.executeScript("scrollBy(0,700)", "");
						String preval2=driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td[1]/table[1]/tbody/tr[2]/td")).getText();
						System.out.println(preval2);		
						Assertion_obj.val_invoice_assertion2();
						Thread.sleep(1000);
						driver.switchTo().defaultContent();
						action_obj.closePreview().click();		
////////////////////////////////////////Graph Fields
						
						Thread.sleep(5000);
						driver.switchTo().frame("invoice_content_area_ifr");
						executor.executeScript("scrollBy(0,300)", "");
						action_obj.clickinvoicepage1().clear();
						action_obj.clickinvoicepage1().click();
						driver.switchTo().defaultContent();
				
						mydrpdown.selectByVisibleText("Graph Fields");
						//add options by double click
						Thread.sleep(1500);
						action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
						action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
						action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
						action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();

						action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
						action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
						action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
						action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();

						action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
						action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
						action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
						action.moveToElement(action_obj.category()).doubleClick().build().perform();

						action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
						action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
						action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
						action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();

						action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
						action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
						action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
						action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();

						action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
						action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
						action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
						action.moveToElement(action_obj.currentread()).doubleClick().build().perform();

		executor.executeScript("scrollBy(0,1000)", "");
		//click on save this template
		action_obj.savethis_template().click();
		//ok
		action_obj.ok().click();

		Thread.sleep(5000);
//		driver.navigate().refresh();
		action_obj.PreviewallButton().click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		executor.executeScript("scrollBy(0,700)", "");
		String preval3=driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td[1]/table[1]/tbody/tr[2]/td")).getText();
		System.out.println(preval3);		
		Assertion_obj.val_invoice_assertion3();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		action_obj.closePreview().click();				
		
////////////////////////////////////////Ezidebit	
				Thread.sleep(5000);
		driver.switchTo().frame("invoice_content_area_ifr");
		executor.executeScript("scrollBy(0,300)", "");
		action_obj.clickinvoicepage1().clear();
		action_obj.clickinvoicepage1().click();
		driver.switchTo().defaultContent();
		
		mydrpdown.selectByVisibleText("EziDebit BPay");
		//add options by double click
		Thread.sleep(1500);
		action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();

		executor.executeScript("scrollBy(0,1000)", "");
		//click on save this template
		action_obj.savethis_template().click();
		//ok
		action_obj.ok().click();

		Thread.sleep(5000);
		//driver.navigate().refresh();
		action_obj.PreviewallButton().click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		executor.executeScript("scrollBy(0,700)", "");
		String preval4=driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td[1]/table[1]/tbody/tr[2]/td")).getText();
		System.out.println(preval4);		
		Assertion_obj.val_invoice_assertion4();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		action_obj.closePreview().click();		
				
		Thread.sleep(1000);
		driver.switchTo().frame("invoice_content_area_ifr");
		executor.executeScript("scrollBy(0,300)", "");
		action_obj.clickinvoicepage1().clear();
		driver.switchTo().defaultContent();
		executor.executeScript("scrollBy(0,1000)", "");
		//click on save this template
		action_obj.savethis_template().click();
		//ok
		action_obj.ok().click();
		Thread.sleep(3000);
		System.out.println("===========================1-front page-main==================================\n");
	}
	
		
/*	@Test(priority = 3)
	public void front_page_chargesummary() throws Exception {
	Thread.sleep(2000);
		Select mydrpdown1 = new Select(action_obj.category_dropdown());
		mydrpdown1.selectByVisibleText("2 - Front Page - CHARGESUMMARY");
		Thread.sleep(5000);
		Select mydrpdown = new Select(action_obj.fields_invoice());
		mydrpdown.selectByVisibleText("Global Fields");
		Thread.sleep(10000);
		driver.switchTo().frame("invoice_content_area_ifr");
		action_obj.clickinvoicepage2().clear();
		action_obj.clickinvoicepage2().click();
		driver.switchTo().defaultContent();
		Select mydrpdown = new Select(action_obj.fields_invoice());
		mydrpdown.selectByVisibleText("Global Fields");
		Thread.sleep(1500);
	//add options by double click
	Actions action = new Actions(driver);
	action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
	action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
	action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
	action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
	action.moveToElement(action_obj.category()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
	action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
	action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
	action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
	action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
	action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
	action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
	action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
	action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
	action.moveToElement(action_obj.currentread()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.customerabn()).doubleClick().build().perform();
	action.moveToElement(action_obj.customeracn()).doubleClick().build().perform();
	action.moveToElement(action_obj.customeradd()).doubleClick().build().perform();
	action.moveToElement(action_obj.custcompname()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.custfaxno()).doubleClick().build().perform();
	action.moveToElement(action_obj.custnamecompname()).doubleClick().build().perform();
	action.moveToElement(action_obj.custno()).doubleClick().build().perform();
	action.moveToElement(action_obj.custphah()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.custphbh()).doubleClick().build().perform();
	action.moveToElement(action_obj.custphmo()).doubleClick().build().perform();
	action.moveToElement(action_obj.custphyadd()).doubleClick().build().perform();
	action.moveToElement(action_obj.custtname()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.custtype()).doubleClick().build().perform();
	action.moveToElement(action_obj.dateofbirth()).doubleClick().build().perform();
	action.moveToElement(action_obj.discounts()).doubleClick().build().perform();
	action.moveToElement(action_obj.emailadd()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.firstname()).doubleClick().build().perform();
	action.moveToElement(action_obj.gst()).doubleClick().build().perform();
	action.moveToElement(action_obj.icpt()).doubleClick().build().perform();
	action.moveToElement(action_obj.nmi()).doubleClick().build().perform();

	action.moveToElement(action_obj.nextreaddateanu()).doubleClick().build().perform();
	action.moveToElement(action_obj.nextreaddatemnth()).doubleClick().build().perform();
	action.moveToElement(action_obj.nextreaddatequa()).doubleClick().build().perform();
	action.moveToElement(action_obj.nextreaddatesemianu()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.nextschreaddate()).doubleClick().build().perform();
	action.moveToElement(action_obj.openingbal()).doubleClick().build().perform();
	action.moveToElement(action_obj.otherpayreceive()).doubleClick().build().perform();
	action.moveToElement(action_obj.potdiscount()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.potdiscountrate()).doubleClick().build().perform();
	action.moveToElement(action_obj.potreversal()).doubleClick().build().perform();
	action.moveToElement(action_obj.payamt()).doubleClick().build().perform();
	action.moveToElement(action_obj.penaltyamt()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.penaltylabel()).doubleClick().build().perform();
	action.moveToElement(action_obj.postcode()).doubleClick().build().perform();
	action.moveToElement(action_obj.prebalamt()).doubleClick().build().perform();
	action.moveToElement(action_obj.preread()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.rebate()).doubleClick().build().perform();
	action.moveToElement(action_obj.salutation()).doubleClick().build().perform();
	action.moveToElement(action_obj.discounts()).doubleClick().build().perform();
	action.moveToElement(action_obj.securedipamt()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.servicesupplyadd()).doubleClick().build().perform();
	action.moveToElement(action_obj.shortaddress()).doubleClick().build().perform();
	action.moveToElement(action_obj.shortaddresstwo()).doubleClick().build().perform();
	action.moveToElement(action_obj.state()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.stmtbillperiod()).doubleClick().build().perform();
	action.moveToElement(action_obj.stmtduedate()).doubleClick().build().perform();
	action.moveToElement(action_obj.stmtissuedate()).doubleClick().build().perform();
	action.moveToElement(action_obj.stmtno()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.stmtseqno()).doubleClick().build().perform();
	action.moveToElement(action_obj.suburb()).doubleClick().build().perform();
	action.moveToElement(action_obj.supplystartdate()).doubleClick().build().perform();
	action.moveToElement(action_obj.surename()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.taxunit()).doubleClick().build().perform();
	action.moveToElement(action_obj.totalgstapp()).doubleClick().build().perform();
	action.moveToElement(action_obj.totalreading()).doubleClick().build().perform();
	action.moveToElement(action_obj.totalusage()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.totalusagekwh()).doubleClick().build().perform();
	action.moveToElement(action_obj.unit()).doubleClick().build().perform();
	action.moveToElement(action_obj.usagegstapp()).doubleClick().build().perform();
	action.moveToElement(action_obj.usagegstnon()).doubleClick().build().perform();
	
	action.moveToElement(action_obj.usagerebateamt()).doubleClick().build().perform();
	action.moveToElement(action_obj.usagerebatelabel()).doubleClick().build().perform();
	action.moveToElement(action_obj.usagerebategst()).doubleClick().build().perform();
		//also add other fields
		 
		 		
	//scroll
	JavascriptExecutor executor=(JavascriptExecutor) driver;
	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
//	driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	String preval=driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td[1]/table[1]/tbody/tr[2]/td")).getText();
	System.out.println(preval);	
	Assertion_obj.val_invoice_assertion();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();
//////////////////////////////Iterator Field///////////////////////////////////		
	Thread.sleep(5000);
	driver.switchTo().frame("invoice_content_area_ifr");
	action_obj.clickinvoicepage2().clear();
	action_obj.clickinvoicepage2().click();
	driver.switchTo().defaultContent();
	
	mydrpdown1.selectByVisibleText("Iterator Fields(Charge Summary)");
	//add options by double click
	Thread.sleep(1500);
			action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
			executor.executeScript("scrollBy(0,1000)", "");
			//click on save this template
			action_obj.savethis_template().click();
			//ok
			action_obj.ok().click();

			Thread.sleep(2000);
//			driver.navigate().refresh();
			action_obj.PreviewallButton().click();
			Thread.sleep(5000);
			driver.switchTo().frame(0);
			executor.executeScript("scrollBy(0,700)", "");
			String preval1=driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td[1]/table[1]/tbody/tr[2]/td")).getText();
			System.out.println(preval1);		
			Assertion_obj.val_invoice_assertion1();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			action_obj.closePreview().click();
////////////////////////////////////////Iterator Fields(Itemization)	
			Thread.sleep(5000);
			driver.switchTo().frame("invoice_content_area_ifr");
			action_obj.clickinvoicepage2().clear();
			action_obj.clickinvoicepage2().click();
			driver.switchTo().defaultContent();
		
			mydrpdown.selectByVisibleText("Iterator Fields(Itemization)");
			//add options by double click
			Thread.sleep(1500);
			action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
			action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
			action.moveToElement(action_obj.category()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
			action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
			action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
			action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentread()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.customerabn()).doubleClick().build().perform();
			action.moveToElement(action_obj.customeracn()).doubleClick().build().perform();
			action.moveToElement(action_obj.customeradd()).doubleClick().build().perform();
			action.moveToElement(action_obj.custcompname()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.custfaxno()).doubleClick().build().perform();
			action.moveToElement(action_obj.custnamecompname()).doubleClick().build().perform();
					executor.executeScript("scrollBy(0,1000)", "");
					//click on save this template
					action_obj.savethis_template().click();
					//ok
					action_obj.ok().click();

					Thread.sleep(5000);
//					driver.navigate().refresh();
					action_obj.PreviewallButton().click();
					Thread.sleep(2000);
					driver.switchTo().frame(0);
					executor.executeScript("scrollBy(0,700)", "");
					String preval2=driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td[1]/table[1]/tbody/tr[2]/td")).getText();
					System.out.println(preval2);		
					Assertion_obj.val_invoice_assertion2();
					Thread.sleep(1000);
					driver.switchTo().defaultContent();
					action_obj.closePreview().click();		
////////////////////////////////////////Iterator Fields(Itemization)	
					Thread.sleep(5000);
					driver.switchTo().frame("invoice_content_area_ifr");
					executor.executeScript("scrollBy(0,300)", "");
					action_obj.clickinvoicepage2().clear();
					action_obj.clickinvoicepage2().click();
					driver.switchTo().defaultContent();
				
					mydrpdown.selectByVisibleText("Graph Fields");
					//add options by double click
					Thread.sleep(1500);
					action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();

					action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();

					action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
					action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
					action.moveToElement(action_obj.category()).doubleClick().build().perform();

					action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();

					action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
					action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
					action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
					action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();

					action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentread()).doubleClick().build().perform();

	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
//	driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	executor.executeScript("scrollBy(0,700)", "");
	String preval3=driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td[1]/table[1]/tbody/tr[2]/td")).getText();
	System.out.println(preval3);		
	Assertion_obj.val_invoice_assertion3();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();				
	
////////////////////////////////////////Iterator Fields(Itemization)	
	Thread.sleep(5000);
	driver.switchTo().frame("invoice_content_area_ifr");
	executor.executeScript("scrollBy(0,300)", "");
	action_obj.clickinvoicepage2().clear();
	action_obj.clickinvoicepage2().click();
	driver.switchTo().defaultContent();
	
	mydrpdown.selectByVisibleText("EziDebit BPay");
	//add options by double click
	Thread.sleep(1500);
	action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();

	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
	//driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	executor.executeScript("scrollBy(0,700)", "");
	String preval4=driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td[1]/table[1]/tbody/tr[2]/td")).getText();
	System.out.println(preval4);		
	Assertion_obj.val_invoice_assertion4();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();		
			
	//finish button
	executor.executeScript("scrollBy(0,-1000)", "");
//	WebElement f= action_obj.finishpreviewButton();
//	f.click();
	Thread.sleep(1000);
	action_obj.finishpreviewButton().click();
	

	System.out.println("============================2-front page-charge summary=================================\n");
		
	}
	
	

	@Test(priority = 3)
	public void Front_Page_CHARGESUMMARY_LIST() throws Exception {
		
		
	}
*///These two categories are not working.	Problem in preview field	

	
	
	@Test(priority = 4)
	public void Account_Summary_ITEMIZATION() throws Exception{
		try{
			Thread.sleep(1000);
			action_obj.closePreview().click();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(1000);
		Select mydrpdowncat = new Select(action_obj.categoryselect());
		mydrpdowncat.selectByIndex(3);	
		Thread.sleep(7000);	
		driver.switchTo().frame("invoice_content_area_ifr");
		action_obj.clickinvoicepage4().clear();
		action_obj.clickinvoicepage4().click();
		driver.switchTo().defaultContent();
		Select mydrpdown = new Select(action_obj.fields_invoice());
		mydrpdown.selectByVisibleText("Global Fields");
		Thread.sleep(1500);
		//add options by double click
				Actions action = new Actions(driver);
				action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
				action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
				action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
				action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
				action.moveToElement(action_obj.category()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
				action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
				action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
				action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
				action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
				action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
				action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
				action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
				action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
				action.moveToElement(action_obj.currentread()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.customerabn()).doubleClick().build().perform();
				action.moveToElement(action_obj.customeracn()).doubleClick().build().perform();
				action.moveToElement(action_obj.customeradd()).doubleClick().build().perform();
				action.moveToElement(action_obj.custcompname()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.custfaxno()).doubleClick().build().perform();
				action.moveToElement(action_obj.custnamecompname()).doubleClick().build().perform();
				action.moveToElement(action_obj.custno()).doubleClick().build().perform();
				action.moveToElement(action_obj.custphah()).doubleClick().build().perform();
			
				JavascriptExecutor executor=(JavascriptExecutor) driver;
				executor.executeScript("scrollBy(0,700)", "");
				
				action.moveToElement(action_obj.custphbh()).doubleClick().build().perform();
				action.moveToElement(action_obj.custphmo()).doubleClick().build().perform();
				action.moveToElement(action_obj.custphyadd()).doubleClick().build().perform();
				action.moveToElement(action_obj.custtname()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.custtype()).doubleClick().build().perform();
				action.moveToElement(action_obj.dateofbirth()).doubleClick().build().perform();     
				action.moveToElement(action_obj.discounts()).doubleClick().build().perform();		
				action.moveToElement(action_obj.emailadd()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.firstname()).doubleClick().build().perform();
				action.moveToElement(action_obj.gst()).doubleClick().build().perform();
				action.moveToElement(action_obj.icpt()).doubleClick().build().perform();
				action.moveToElement(action_obj.nmi()).doubleClick().build().perform();

				action.moveToElement(action_obj.nextreaddateanu()).doubleClick().build().perform();
				action.moveToElement(action_obj.nextreaddatemnth()).doubleClick().build().perform();
				action.moveToElement(action_obj.nextreaddatequa()).doubleClick().build().perform();
				action.moveToElement(action_obj.nextreaddatesemianu()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.nextschreaddate()).doubleClick().build().perform();
				action.moveToElement(action_obj.openingbal()).doubleClick().build().perform();
				action.moveToElement(action_obj.otherpayreceive()).doubleClick().build().perform();
				action.moveToElement(action_obj.potdiscount()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.potdiscountrate()).doubleClick().build().perform();
				action.moveToElement(action_obj.potreversal()).doubleClick().build().perform();
				action.moveToElement(action_obj.payamt()).doubleClick().build().perform();
				action.moveToElement(action_obj.penaltyamt()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.penaltylabel()).doubleClick().build().perform();
				action.moveToElement(action_obj.postcode()).doubleClick().build().perform();
				action.moveToElement(action_obj.prebalamt()).doubleClick().build().perform();
				action.moveToElement(action_obj.preread()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.rebate()).doubleClick().build().perform();
				action.moveToElement(action_obj.salutation()).doubleClick().build().perform();
//				action.moveToElement(action_obj.discounts()).doubleClick().build().perform();
				action.moveToElement(action_obj.securedipamt()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.servicesupplyadd()).doubleClick().build().perform();
				action.moveToElement(action_obj.shortaddress()).doubleClick().build().perform();
				action.moveToElement(action_obj.shortaddresstwo()).doubleClick().build().perform();
				action.moveToElement(action_obj.state()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.stmtbillperiod()).doubleClick().build().perform();
				action.moveToElement(action_obj.stmtduedate()).doubleClick().build().perform();
				action.moveToElement(action_obj.stmtissuedate()).doubleClick().build().perform();
				action.moveToElement(action_obj.stmtno()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.stmtseqno()).doubleClick().build().perform();
				action.moveToElement(action_obj.suburb()).doubleClick().build().perform();
				action.moveToElement(action_obj.supplystartdate()).doubleClick().build().perform();
				action.moveToElement(action_obj.surename()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.taxunit()).doubleClick().build().perform();
				action.moveToElement(action_obj.totalgstapp()).doubleClick().build().perform();
				action.moveToElement(action_obj.totalreading()).doubleClick().build().perform();
				action.moveToElement(action_obj.totalusage()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.totalusagekwh()).doubleClick().build().perform();
				action.moveToElement(action_obj.unit()).doubleClick().build().perform();
				action.moveToElement(action_obj.usagegstapp()).doubleClick().build().perform();
				action.moveToElement(action_obj.usagegstnon()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.usagerebateamt()).doubleClick().build().perform();
				action.moveToElement(action_obj.usagerebatelabel()).doubleClick().build().perform();
				action.moveToElement(action_obj.usagerebategst()).doubleClick().build().perform();
				//Opts are added in script to cover all feature
				action.moveToElement(action_obj.opt1()).doubleClick().build().perform();
				action.moveToElement(action_obj.opt2()).doubleClick().build().perform();
				action.moveToElement(action_obj.opt3()).doubleClick().build().perform();
				action.moveToElement(action_obj.opt4()).doubleClick().build().perform();
				action.moveToElement(action_obj.opt5()).doubleClick().build().perform();
//				action.moveToElement(action_obj.opt6()).doubleClick().build().perform();
//				action.moveToElement(action_obj.opt7()).doubleClick().build().perform();
//				action.moveToElement(action_obj.opt8()).doubleClick().build().perform();
//				action.moveToElement(action_obj.opt9()).doubleClick().build().perform();
//				action.moveToElement(action_obj.opt10()).doubleClick().build().perform();
	
	
	//scroll
//	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
//	driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,2000)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(1000);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval11=action_obj.previewval15().getText();
	System.out.println(preval11);
	Assertion_obj.val_invoice_assertion5();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();
//////////////////////////////Iterator Field///////////////////////////////////		
	Thread.sleep(5000);
	driver.switchTo().frame("invoice_content_area_ifr");
	action_obj.clickinvoicepage4().clear();
	action_obj.clickinvoicepage4().click();
	driver.switchTo().defaultContent();

	mydrpdown.selectByVisibleText("Iterator Fields(Charge Summary)");
	//add options by double click
	Thread.sleep(1500);
			action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
			executor.executeScript("scrollBy(0,1000)", "");
			//click on save this template
			action_obj.savethis_template().click();
			//ok
			action_obj.ok().click();

			Thread.sleep(2000);
//			driver.navigate().refresh();
			action_obj.PreviewallButton().click();
			Thread.sleep(2000);
			executor.executeScript("scrollBy(0,2000)", "");
			driver.switchTo().frame("previewall-final");
			Thread.sleep(700);
//			executor.executeScript("scrollBy(0,2000)", "");
			String preval12=action_obj.previewval15().getText();
			System.out.println(preval12);	
			Assertion_obj.val_invoice_assertion6();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			action_obj.closePreview().click();
////////////////////////////////////////Iterator Fields(Itemization)	
			Thread.sleep(5000);
			driver.switchTo().frame("invoice_content_area_ifr");
			action_obj.clickinvoicepage4().clear();
			action_obj.clickinvoicepage4().click();
			driver.switchTo().defaultContent();
			
			mydrpdown.selectByVisibleText("Iterator Fields(Itemization)");
			//add options by double click
			Thread.sleep(1500);
			action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
			action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
			action.moveToElement(action_obj.category()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
			action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
			action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
			action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentread()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.customerabn()).doubleClick().build().perform();
			action.moveToElement(action_obj.customeracn()).doubleClick().build().perform();
			action.moveToElement(action_obj.customeradd()).doubleClick().build().perform();
			action.moveToElement(action_obj.custcompname()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.custfaxno()).doubleClick().build().perform();
			action.moveToElement(action_obj.custnamecompname()).doubleClick().build().perform();
					executor.executeScript("scrollBy(0,1000)", "");
					//click on save this template
					action_obj.savethis_template().click();
					//ok
					action_obj.ok().click();

					Thread.sleep(5000);
//					driver.navigate().refresh();
					action_obj.PreviewallButton().click();
					Thread.sleep(2000);
					executor.executeScript("scrollBy(0,2000)", "");
					driver.switchTo().frame("previewall-final");
					Thread.sleep(700);
//					executor.executeScript("scrollBy(0,2000)", "");
					String preval13=action_obj.previewval().getText();
					System.out.println(preval13);
					Assertion_obj.val_invoice_assertion7();
					Thread.sleep(1000);
					driver.switchTo().defaultContent();
					action_obj.closePreview().click();		
////////////////////////////////////////Iterator Fields(Itemization)	
					Thread.sleep(5000);
					driver.switchTo().frame("invoice_content_area_ifr");
					executor.executeScript("scrollBy(0,300)", "");
					action_obj.clickinvoicepage4().clear();
					action_obj.clickinvoicepage4().click();
					driver.switchTo().defaultContent();
			
					mydrpdown.selectByVisibleText("Graph Fields");
					//add options by double click
					Thread.sleep(1500);
					action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();

					action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();

					action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
					action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
					action.moveToElement(action_obj.category()).doubleClick().build().perform();

					action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();

					action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
					action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
					action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
					action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();

					action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentread()).doubleClick().build().perform();

	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
//	driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,2000)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(700);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval14=action_obj.previewval15().getText();
	System.out.println(preval14);		
	Assertion_obj.val_invoice_assertion8();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();				
	
////////////////////////////////////////Iterator Fields(Itemization)	
	Thread.sleep(5000);
	driver.switchTo().frame("invoice_content_area_ifr");
	executor.executeScript("scrollBy(0,300)", "");
	action_obj.clickinvoicepage4().clear();
	action_obj.clickinvoicepage4().click();
	driver.switchTo().defaultContent();
	
	mydrpdown.selectByVisibleText("EziDebit BPay");
	//add options by double click
	Thread.sleep(1500);
	action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();

	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
	//driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,2000)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(700);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval15=action_obj.previewval15().getText();
	System.out.println(preval15);			
	Assertion_obj.val_invoice_assertion9();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();		
	Thread.sleep(1000);
	driver.switchTo().frame("invoice_content_area_ifr");
	executor.executeScript("scrollBy(0,300)", "");
	action_obj.clickinvoicepage4().clear();
	driver.switchTo().defaultContent();
	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();
	Thread.sleep(3000);
	System.out.println("================================4-Account Summary-ITEMIZATION=============================\n");	
	}
	

	@Test(priority = 5)
	public void Account_Summary_ITEMIZATION_LIST_HEADER() throws Exception{
		try{
			Thread.sleep(1000);
			action_obj.closePreview().click();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(1000);
		Select mydrpdowncat = new Select(action_obj.categoryselect());
		mydrpdowncat.selectByIndex(4);	
		Thread.sleep(7000);		
		driver.switchTo().frame("invoice_content_area_ifr");
		action_obj.clickinvoicepage5st().clear();
		action_obj.clickinvoicepage5().clear();
		action_obj.clickinvoicepage5().click();
		driver.switchTo().defaultContent();
		Select mydrpdown = new Select(action_obj.fields_invoice());
		mydrpdown.selectByVisibleText("Global Fields");
		Thread.sleep(1500);
		//add options by double click
		Actions action = new Actions(driver);
		action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
		action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
		action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
		action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
		action.moveToElement(action_obj.category()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
		action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
		action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
		action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
		action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
		action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
		action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
		action.moveToElement(action_obj.currentread()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.customerabn()).doubleClick().build().perform();
		action.moveToElement(action_obj.customeracn()).doubleClick().build().perform();
		action.moveToElement(action_obj.customeradd()).doubleClick().build().perform();
		action.moveToElement(action_obj.custcompname()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.custfaxno()).doubleClick().build().perform();
		action.moveToElement(action_obj.custnamecompname()).doubleClick().build().perform();
		action.moveToElement(action_obj.custno()).doubleClick().build().perform();
		action.moveToElement(action_obj.custphah()).doubleClick().build().perform();
	
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("scrollBy(0,700)", "");
		
		action.moveToElement(action_obj.custphbh()).doubleClick().build().perform();
		action.moveToElement(action_obj.custphmo()).doubleClick().build().perform();
		action.moveToElement(action_obj.custphyadd()).doubleClick().build().perform();
		action.moveToElement(action_obj.custtname()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.custtype()).doubleClick().build().perform();
		action.moveToElement(action_obj.dateofbirth()).doubleClick().build().perform();     
		action.moveToElement(action_obj.discounts()).doubleClick().build().perform();		
		action.moveToElement(action_obj.emailadd()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.firstname()).doubleClick().build().perform();
		action.moveToElement(action_obj.gst()).doubleClick().build().perform();
		action.moveToElement(action_obj.icpt()).doubleClick().build().perform();
		action.moveToElement(action_obj.nmi()).doubleClick().build().perform();

		action.moveToElement(action_obj.nextreaddateanu()).doubleClick().build().perform();
		action.moveToElement(action_obj.nextreaddatemnth()).doubleClick().build().perform();
		action.moveToElement(action_obj.nextreaddatequa()).doubleClick().build().perform();
		action.moveToElement(action_obj.nextreaddatesemianu()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.nextschreaddate()).doubleClick().build().perform();
		action.moveToElement(action_obj.openingbal()).doubleClick().build().perform();
		action.moveToElement(action_obj.otherpayreceive()).doubleClick().build().perform();
		action.moveToElement(action_obj.potdiscount()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.potdiscountrate()).doubleClick().build().perform();
		action.moveToElement(action_obj.potreversal()).doubleClick().build().perform();
		action.moveToElement(action_obj.payamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.penaltyamt()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.penaltylabel()).doubleClick().build().perform();
		action.moveToElement(action_obj.postcode()).doubleClick().build().perform();
		action.moveToElement(action_obj.prebalamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.preread()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.rebate()).doubleClick().build().perform();
		action.moveToElement(action_obj.salutation()).doubleClick().build().perform();
//		action.moveToElement(action_obj.discounts()).doubleClick().build().perform();
		action.moveToElement(action_obj.securedipamt()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.servicesupplyadd()).doubleClick().build().perform();
		action.moveToElement(action_obj.shortaddress()).doubleClick().build().perform();
		action.moveToElement(action_obj.shortaddresstwo()).doubleClick().build().perform();
		action.moveToElement(action_obj.state()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.stmtbillperiod()).doubleClick().build().perform();
		action.moveToElement(action_obj.stmtduedate()).doubleClick().build().perform();
		action.moveToElement(action_obj.stmtissuedate()).doubleClick().build().perform();
		action.moveToElement(action_obj.stmtno()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.stmtseqno()).doubleClick().build().perform();
		action.moveToElement(action_obj.suburb()).doubleClick().build().perform();
		action.moveToElement(action_obj.supplystartdate()).doubleClick().build().perform();
		action.moveToElement(action_obj.surename()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.taxunit()).doubleClick().build().perform();
		action.moveToElement(action_obj.totalgstapp()).doubleClick().build().perform();
		action.moveToElement(action_obj.totalreading()).doubleClick().build().perform();
		action.moveToElement(action_obj.totalusage()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.totalusagekwh()).doubleClick().build().perform();
		action.moveToElement(action_obj.unit()).doubleClick().build().perform();
		action.moveToElement(action_obj.usagegstapp()).doubleClick().build().perform();
		action.moveToElement(action_obj.usagegstnon()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.usagerebateamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.usagerebatelabel()).doubleClick().build().perform();
		action.moveToElement(action_obj.usagerebategst()).doubleClick().build().perform();
		//Opts are added in script to cover all feature
		action.moveToElement(action_obj.opt1()).doubleClick().build().perform();
		action.moveToElement(action_obj.opt2()).doubleClick().build().perform();
		action.moveToElement(action_obj.opt3()).doubleClick().build().perform();
		action.moveToElement(action_obj.opt4()).doubleClick().build().perform();
		action.moveToElement(action_obj.opt5()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt6()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt7()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt8()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt9()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt10()).doubleClick().build().perform();
	
	//scroll
	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
//	driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,2000)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(1200);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval15=action_obj.previewval19().getText();
	System.out.println(preval15);	
	Assertion_obj.val_invoice_assertion20();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();
//////////////////////////////Iterator Field///////////////////////////////////		
	Thread.sleep(5000);
	driver.switchTo().frame("invoice_content_area_ifr");
	action_obj.clickinvoicepage5().clear();
	action_obj.clickinvoicepage5().click();
	driver.switchTo().defaultContent();
	mydrpdown.selectByVisibleText("Iterator Fields(Charge Summary)");
	//add options by double click
	Thread.sleep(1500);
			action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
			executor.executeScript("scrollBy(0,1000)", "");
			//click on save this template
			action_obj.savethis_template().click();
			//ok
			action_obj.ok().click();

			Thread.sleep(2000);
//			driver.navigate().refresh();
			action_obj.PreviewallButton().click();
			Thread.sleep(2000);
			executor.executeScript("scrollBy(0,2000)", "");
			driver.switchTo().frame("previewall-final");
			Thread.sleep(700);
//			executor.executeScript("scrollBy(0,2000)", "");
			String preval16=action_obj.previewval19().getText();
			System.out.println(preval16);	
			Assertion_obj.val_invoice_assertion21();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			action_obj.closePreview().click();
////////////////////////////////////////Iterator Fields(Itemization)	
			Thread.sleep(5000);
			driver.switchTo().frame("invoice_content_area_ifr");
			action_obj.clickinvoicepage5().clear();
			action_obj.clickinvoicepage5().click();
			driver.switchTo().defaultContent();
			
			mydrpdown.selectByVisibleText("Iterator Fields(Itemization)");
			//add options by double click
			Thread.sleep(1500);
			action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
			action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
			action.moveToElement(action_obj.category()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
			action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
			action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
			action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentread()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.customerabn()).doubleClick().build().perform();
			action.moveToElement(action_obj.customeracn()).doubleClick().build().perform();
			action.moveToElement(action_obj.customeradd()).doubleClick().build().perform();
			action.moveToElement(action_obj.custcompname()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.custfaxno()).doubleClick().build().perform();
			action.moveToElement(action_obj.custnamecompname()).doubleClick().build().perform();
					executor.executeScript("scrollBy(0,1000)", "");
					//click on save this template
					action_obj.savethis_template().click();
					//ok
					action_obj.ok().click();

					Thread.sleep(5000);
//					driver.navigate().refresh();
					action_obj.PreviewallButton().click();
					Thread.sleep(2000);
					executor.executeScript("scrollBy(0,2000)", "");
					driver.switchTo().frame("previewall-final");
					Thread.sleep(700);
//					executor.executeScript("scrollBy(0,2000)", "");
					String preval17=action_obj.previewval19().getText();
					System.out.println(preval17);			
					Assertion_obj.val_invoice_assertion22();
					Thread.sleep(1000);
					driver.switchTo().defaultContent();
					action_obj.closePreview().click();		
////////////////////////////////////////Iterator Fields(Itemization)	
					Thread.sleep(5000);
					driver.switchTo().frame("invoice_content_area_ifr");
					executor.executeScript("scrollBy(0,300)", "");
					action_obj.clickinvoicepage5().clear();
					action_obj.clickinvoicepage5().click();
					driver.switchTo().defaultContent();
			
					mydrpdown.selectByVisibleText("Graph Fields");
					//add options by double click
					Thread.sleep(1500);
					action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();

					action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();

					action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
					action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
					action.moveToElement(action_obj.category()).doubleClick().build().perform();

					action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();

					action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
					action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
					action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
					action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();

					action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentread()).doubleClick().build().perform();

	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
//	driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,2000)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(700);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval18=action_obj.previewval19().getText();
	System.out.println(preval18);			
	Assertion_obj.val_invoice_assertion23();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();				
	
////////////////////////////////////////Iterator Fields(Itemization)	
	Thread.sleep(5000);
	driver.switchTo().frame("invoice_content_area_ifr");
	executor.executeScript("scrollBy(0,300)", "");
	action_obj.clickinvoicepage5().clear();
	action_obj.clickinvoicepage5().click();
	driver.switchTo().defaultContent();
	
	mydrpdown.selectByVisibleText("EziDebit BPay");
	//add options by double click
	Thread.sleep(1500);
	action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();

	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
	//driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,2000)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(700);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval19=action_obj.previewval19().getText();
	System.out.println(preval19);			
	Assertion_obj.val_invoice_assertion24();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();		
	Thread.sleep(1000);
	driver.switchTo().frame("invoice_content_area_ifr");
	executor.executeScript("scrollBy(0,300)", "");
	action_obj.clickinvoicepage5().clear();
	driver.switchTo().defaultContent();
	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();
	Thread.sleep(3000);
	System.out.println("================================5-Account Summary - [ITEMIZATION-LIST-HEADER] =============================\n");	
	}		

	//1
	@Test(priority = 1)
	public void Account_Summary_ITEMIZATION_LIST() throws Exception{
		try{
			Thread.sleep(1000);
			action_obj.closePreview().click();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(1000);
		Select mydrpdowncat = new Select(action_obj.categoryselect());
		mydrpdowncat.selectByIndex(5);	
		Thread.sleep(7000);
		driver.switchTo().frame("invoice_content_area_ifr");
		action_obj.clickinvoicepage2().clear();
		action_obj.clickinvoicepage2().clear();
		action_obj.clickinvoicepage2().click();
		driver.switchTo().defaultContent();
		Select mydrpdown = new Select(action_obj.fields_invoice());
		mydrpdown.selectByVisibleText("Global Fields");
		Thread.sleep(1500);
		//add options by double click
		Actions action = new Actions(driver);
		action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
		action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
		action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
		action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
		action.moveToElement(action_obj.category()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
		action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
		action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
		action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
		action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
		action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
		action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
		action.moveToElement(action_obj.currentread()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.customerabn()).doubleClick().build().perform();
		action.moveToElement(action_obj.customeracn()).doubleClick().build().perform();
		action.moveToElement(action_obj.customeradd()).doubleClick().build().perform();
		action.moveToElement(action_obj.custcompname()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.custfaxno()).doubleClick().build().perform();
		action.moveToElement(action_obj.custnamecompname()).doubleClick().build().perform();
		action.moveToElement(action_obj.custno()).doubleClick().build().perform();
		action.moveToElement(action_obj.custphah()).doubleClick().build().perform();
	
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("scrollBy(0,700)", "");
		
		action.moveToElement(action_obj.custphbh()).doubleClick().build().perform();
		action.moveToElement(action_obj.custphmo()).doubleClick().build().perform();
		action.moveToElement(action_obj.custphyadd()).doubleClick().build().perform();
		action.moveToElement(action_obj.custtname()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.custtype()).doubleClick().build().perform();
		action.moveToElement(action_obj.dateofbirth()).doubleClick().build().perform();     
		action.moveToElement(action_obj.discounts()).doubleClick().build().perform();		
		action.moveToElement(action_obj.emailadd()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.firstname()).doubleClick().build().perform();
		action.moveToElement(action_obj.gst()).doubleClick().build().perform();
		action.moveToElement(action_obj.icpt()).doubleClick().build().perform();
		action.moveToElement(action_obj.nmi()).doubleClick().build().perform();

		action.moveToElement(action_obj.nextreaddateanu()).doubleClick().build().perform();
		action.moveToElement(action_obj.nextreaddatemnth()).doubleClick().build().perform();
		action.moveToElement(action_obj.nextreaddatequa()).doubleClick().build().perform();
		action.moveToElement(action_obj.nextreaddatesemianu()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.nextschreaddate()).doubleClick().build().perform();
		action.moveToElement(action_obj.openingbal()).doubleClick().build().perform();
		action.moveToElement(action_obj.otherpayreceive()).doubleClick().build().perform();
		action.moveToElement(action_obj.potdiscount()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.potdiscountrate()).doubleClick().build().perform();
		action.moveToElement(action_obj.potreversal()).doubleClick().build().perform();
		action.moveToElement(action_obj.payamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.penaltyamt()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.penaltylabel()).doubleClick().build().perform();
		action.moveToElement(action_obj.postcode()).doubleClick().build().perform();
		action.moveToElement(action_obj.prebalamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.preread()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.rebate()).doubleClick().build().perform();
		action.moveToElement(action_obj.salutation()).doubleClick().build().perform();
//		action.moveToElement(action_obj.discounts()).doubleClick().build().perform();
		action.moveToElement(action_obj.securedipamt()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.servicesupplyadd()).doubleClick().build().perform();
		action.moveToElement(action_obj.shortaddress()).doubleClick().build().perform();
		action.moveToElement(action_obj.shortaddresstwo()).doubleClick().build().perform();
		action.moveToElement(action_obj.state()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.stmtbillperiod()).doubleClick().build().perform();
		action.moveToElement(action_obj.stmtduedate()).doubleClick().build().perform();
		action.moveToElement(action_obj.stmtissuedate()).doubleClick().build().perform();
		action.moveToElement(action_obj.stmtno()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.stmtseqno()).doubleClick().build().perform();
		action.moveToElement(action_obj.suburb()).doubleClick().build().perform();
		action.moveToElement(action_obj.supplystartdate()).doubleClick().build().perform();
		action.moveToElement(action_obj.surename()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.taxunit()).doubleClick().build().perform();
		action.moveToElement(action_obj.totalgstapp()).doubleClick().build().perform();
		action.moveToElement(action_obj.totalreading()).doubleClick().build().perform();
		action.moveToElement(action_obj.totalusage()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.totalusagekwh()).doubleClick().build().perform();
		action.moveToElement(action_obj.unit()).doubleClick().build().perform();
		action.moveToElement(action_obj.usagegstapp()).doubleClick().build().perform();
		action.moveToElement(action_obj.usagegstnon()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.usagerebateamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.usagerebatelabel()).doubleClick().build().perform();
		action.moveToElement(action_obj.usagerebategst()).doubleClick().build().perform();
		//Opts are added in script to cover all feature
		action.moveToElement(action_obj.opt1()).doubleClick().build().perform();
		action.moveToElement(action_obj.opt2()).doubleClick().build().perform();
		action.moveToElement(action_obj.opt3()).doubleClick().build().perform();
		action.moveToElement(action_obj.opt4()).doubleClick().build().perform();
		action.moveToElement(action_obj.opt5()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt6()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt7()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt8()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt9()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt10()).doubleClick().build().perform();
	
	
	
	
	//scroll
	
	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
//	driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,2000)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(1200);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval15=action_obj.previewval19().getText();
	System.out.println(preval15);	
	Assertion_obj.val_invoice_assertion15();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();
//////////////////////////////Iterator Field///////////////////////////////////		
	Thread.sleep(5000);
	driver.switchTo().frame("invoice_content_area_ifr");
	action_obj.clickinvoicepage2().clear();
	action_obj.clickinvoicepage2().click();
	driver.switchTo().defaultContent();
	mydrpdown.selectByVisibleText("Iterator Fields(Charge Summary)");
	//add options by double click
	Thread.sleep(1500);
			action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
			executor.executeScript("scrollBy(0,1000)", "");
			//click on save this template
			action_obj.savethis_template().click();
			//ok
			action_obj.ok().click();

			Thread.sleep(2000);
//			driver.navigate().refresh();
			action_obj.PreviewallButton().click();
			Thread.sleep(2000);
			executor.executeScript("scrollBy(0,2000)", "");
			driver.switchTo().frame("previewall-final");
			Thread.sleep(700);
//			executor.executeScript("scrollBy(0,2000)", "");
			String preval16=action_obj.previewval19().getText();
			System.out.println(preval16);	
			Assertion_obj.val_invoice_assertion16();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			action_obj.closePreview().click();
////////////////////////////////////////Iterator Fields(Itemization)	
			Thread.sleep(5000);
			driver.switchTo().frame("invoice_content_area_ifr");
			action_obj.clickinvoicepage2().clear();
			action_obj.clickinvoicepage2().click();
			driver.switchTo().defaultContent();
			
			mydrpdown.selectByVisibleText("Iterator Fields(Itemization)");
			//add options by double click
			Thread.sleep(1500);
			action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
			action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
			action.moveToElement(action_obj.category()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
			action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
			action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
			action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentread()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.customerabn()).doubleClick().build().perform();
			action.moveToElement(action_obj.customeracn()).doubleClick().build().perform();
			action.moveToElement(action_obj.customeradd()).doubleClick().build().perform();
			action.moveToElement(action_obj.custcompname()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.custfaxno()).doubleClick().build().perform();
			action.moveToElement(action_obj.custnamecompname()).doubleClick().build().perform();
					executor.executeScript("scrollBy(0,1000)", "");
					//click on save this template
					action_obj.savethis_template().click();
					//ok
					action_obj.ok().click();

					Thread.sleep(5000);
//					driver.navigate().refresh();
					action_obj.PreviewallButton().click();
					Thread.sleep(2000);
					executor.executeScript("scrollBy(0,2000)", "");
					driver.switchTo().frame("previewall-final");
					Thread.sleep(700);
//					executor.executeScript("scrollBy(0,2000)", "");
					String preval17=action_obj.previewval19().getText();
					System.out.println(preval17);			
					Assertion_obj.val_invoice_assertion17();
					Thread.sleep(1000);
					driver.switchTo().defaultContent();
					action_obj.closePreview().click();		
////////////////////////////////////////Iterator Fields(Itemization)	
					Thread.sleep(5000);
					driver.switchTo().frame("invoice_content_area_ifr");
					executor.executeScript("scrollBy(0,300)", "");
					action_obj.clickinvoicepage2().clear();
					action_obj.clickinvoicepage2().click();
					driver.switchTo().defaultContent();
			
					mydrpdown.selectByVisibleText("Graph Fields");
					//add options by double click
					Thread.sleep(1500);
					action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();

					action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();

					action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
					action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
					action.moveToElement(action_obj.category()).doubleClick().build().perform();

					action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();

					action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
					action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
					action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
					action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();

					action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentread()).doubleClick().build().perform();

	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
//	driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,2000)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(700);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval18=action_obj.previewval19().getText();
	System.out.println(preval18);			
	Assertion_obj.val_invoice_assertion18();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();				
	
////////////////////////////////////////Iterator Fields(Itemization)	
	Thread.sleep(5000);
	driver.switchTo().frame("invoice_content_area_ifr");
	executor.executeScript("scrollBy(0,300)", "");
	action_obj.clickinvoicepage2().clear();
	action_obj.clickinvoicepage2().click();
	driver.switchTo().defaultContent();
	
	mydrpdown.selectByVisibleText("EziDebit BPay");
	//add options by double click
	Thread.sleep(1500);
	action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();

	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
	//driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,1300)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(700);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval19=action_obj.previewval19().getText();
	System.out.println(preval19);			
	Assertion_obj.val_invoice_assertion19();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();		
	
	Thread.sleep(1000);
	driver.switchTo().frame("invoice_content_area_ifr");
	executor.executeScript("scrollBy(0,-800)", "");
	action_obj.clickinvoicepage2().clear();
	driver.switchTo().defaultContent();
	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();
	Thread.sleep(3000);
	System.out.println("================================6-Account Summary - [ITEMIZATION-LIST]  =============================\n");	
	}	
	
	@Test(priority = 7)
	public void Statement_and_Usage_bar_graph_GRAPH() throws Exception{
		try{
			Thread.sleep(1000);
			action_obj.closePreview().click();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(1000);
		Select mydrpdowncat = new Select(action_obj.categoryselect());
		mydrpdowncat.selectByIndex(6);	
		Thread.sleep(7000);	
		driver.switchTo().frame("invoice_content_area_ifr");
		action_obj.clickinvoicepage7().clear();
		action_obj.clickinvoicepage7().click();
		driver.switchTo().defaultContent();
		Select mydrpdown = new Select(action_obj.fields_invoice());
		mydrpdown.selectByVisibleText("Global Fields");
		Thread.sleep(1500);
		//add options by double click
				Actions action = new Actions(driver);
				action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
				action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
				action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
				action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
				action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
				action.moveToElement(action_obj.category()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
				action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
				action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
				action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
				action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
				action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
				action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
				action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
				action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
				action.moveToElement(action_obj.currentread()).doubleClick().build().perform();
				
				Thread.sleep(700);
				JavascriptExecutor executor=(JavascriptExecutor) driver;
				executor.executeScript("scrollBy(0,700)", "");
				
				action.moveToElement(action_obj.customerabn()).doubleClick().build().perform();
				action.moveToElement(action_obj.customeracn()).doubleClick().build().perform();
				action.moveToElement(action_obj.customeradd()).doubleClick().build().perform();
				action.moveToElement(action_obj.custcompname()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.custfaxno()).doubleClick().build().perform();
				action.moveToElement(action_obj.custnamecompname()).doubleClick().build().perform();
				action.moveToElement(action_obj.custno()).doubleClick().build().perform();
				action.moveToElement(action_obj.custphah()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.custphbh()).doubleClick().build().perform();
				action.moveToElement(action_obj.custphmo()).doubleClick().build().perform();
				action.moveToElement(action_obj.custphyadd()).doubleClick().build().perform();
				action.moveToElement(action_obj.custtname()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.custtype()).doubleClick().build().perform();
				action.moveToElement(action_obj.dateofbirth()).doubleClick().build().perform();     
				action.moveToElement(action_obj.discounts()).doubleClick().build().perform();		
				action.moveToElement(action_obj.emailadd()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.firstname()).doubleClick().build().perform();
				action.moveToElement(action_obj.gst()).doubleClick().build().perform();
				action.moveToElement(action_obj.icpt()).doubleClick().build().perform();
				action.moveToElement(action_obj.nmi()).doubleClick().build().perform();

				action.moveToElement(action_obj.nextreaddateanu()).doubleClick().build().perform();
				action.moveToElement(action_obj.nextreaddatemnth()).doubleClick().build().perform();
				action.moveToElement(action_obj.nextreaddatequa()).doubleClick().build().perform();
				action.moveToElement(action_obj.nextreaddatesemianu()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.nextschreaddate()).doubleClick().build().perform();
				action.moveToElement(action_obj.openingbal()).doubleClick().build().perform();
				action.moveToElement(action_obj.otherpayreceive()).doubleClick().build().perform();
				action.moveToElement(action_obj.potdiscount()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.potdiscountrate()).doubleClick().build().perform();
				action.moveToElement(action_obj.potreversal()).doubleClick().build().perform();
				action.moveToElement(action_obj.payamt()).doubleClick().build().perform();
				action.moveToElement(action_obj.penaltyamt()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.penaltylabel()).doubleClick().build().perform();
				action.moveToElement(action_obj.postcode()).doubleClick().build().perform();
				action.moveToElement(action_obj.prebalamt()).doubleClick().build().perform();
				action.moveToElement(action_obj.preread()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.rebate()).doubleClick().build().perform();
				action.moveToElement(action_obj.salutation()).doubleClick().build().perform();
//				action.moveToElement(action_obj.discounts()).doubleClick().build().perform();
				action.moveToElement(action_obj.securedipamt()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.servicesupplyadd()).doubleClick().build().perform();
				action.moveToElement(action_obj.shortaddress()).doubleClick().build().perform();
				action.moveToElement(action_obj.shortaddresstwo()).doubleClick().build().perform();
				action.moveToElement(action_obj.state()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.stmtbillperiod()).doubleClick().build().perform();
				action.moveToElement(action_obj.stmtduedate()).doubleClick().build().perform();
				action.moveToElement(action_obj.stmtissuedate()).doubleClick().build().perform();
				action.moveToElement(action_obj.stmtno()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.stmtseqno()).doubleClick().build().perform();
				action.moveToElement(action_obj.suburb()).doubleClick().build().perform();
				action.moveToElement(action_obj.supplystartdate()).doubleClick().build().perform();
				action.moveToElement(action_obj.surename()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.taxunit()).doubleClick().build().perform();
				action.moveToElement(action_obj.totalgstapp()).doubleClick().build().perform();
				action.moveToElement(action_obj.totalreading()).doubleClick().build().perform();
				action.moveToElement(action_obj.totalusage()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.totalusagekwh()).doubleClick().build().perform();
				action.moveToElement(action_obj.unit()).doubleClick().build().perform();
				action.moveToElement(action_obj.usagegstapp()).doubleClick().build().perform();
				action.moveToElement(action_obj.usagegstnon()).doubleClick().build().perform();
				
				action.moveToElement(action_obj.usagerebateamt()).doubleClick().build().perform();
				action.moveToElement(action_obj.usagerebatelabel()).doubleClick().build().perform();
				action.moveToElement(action_obj.usagerebategst()).doubleClick().build().perform();
				//Opts are added in script to cover all feature
				action.moveToElement(action_obj.opt1()).doubleClick().build().perform();
				action.moveToElement(action_obj.opt2()).doubleClick().build().perform();
				action.moveToElement(action_obj.opt3()).doubleClick().build().perform();
				action.moveToElement(action_obj.opt4()).doubleClick().build().perform();
				action.moveToElement(action_obj.opt5()).doubleClick().build().perform();
//				action.moveToElement(action_obj.opt6()).doubleClick().build().perform();
//				action.moveToElement(action_obj.opt7()).doubleClick().build().perform();
//				action.moveToElement(action_obj.opt8()).doubleClick().build().perform();
//				action.moveToElement(action_obj.opt9()).doubleClick().build().perform();
//				action.moveToElement(action_obj.opt10()).doubleClick().build().perform();
	
	
	
	
	//scroll
	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
//	driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,2000)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(1200);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval20=action_obj.previewval25().getText();
	System.out.println(preval20);	
	Assertion_obj.val_invoice_assertion25();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();
//////////////////////////////Iterator Field///////////////////////////////////		
	Thread.sleep(5000);
	driver.switchTo().frame("invoice_content_area_ifr");
	action_obj.clickinvoicepage7().clear();
	action_obj.clickinvoicepage7().click();
	driver.switchTo().defaultContent();
	mydrpdown.selectByVisibleText("Iterator Fields(Charge Summary)");
	//add options by double click
	Thread.sleep(1500);
			action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
			executor.executeScript("scrollBy(0,1000)", "");
			//click on save this template
			action_obj.savethis_template().click();
			//ok
			action_obj.ok().click();

			Thread.sleep(2000);
//			driver.navigate().refresh();
			action_obj.PreviewallButton().click();
			Thread.sleep(2000);
			executor.executeScript("scrollBy(0,2000)", "");
			driver.switchTo().frame("previewall-final");
			Thread.sleep(700);
//			executor.executeScript("scrollBy(0,2000)", "");
			String preval21=action_obj.previewval25().getText();
			System.out.println(preval21);	
			Assertion_obj.val_invoice_assertion26();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			action_obj.closePreview().click();
////////////////////////////////////////Iterator Fields(Itemization)	
			Thread.sleep(5000);
			driver.switchTo().frame("invoice_content_area_ifr");
			action_obj.clickinvoicepage7().clear();
			action_obj.clickinvoicepage7().click();
			driver.switchTo().defaultContent();
			
			mydrpdown.selectByVisibleText("Iterator Fields(Itemization)");
			//add options by double click
			Thread.sleep(1500);
			action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
			action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
			action.moveToElement(action_obj.category()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
			action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
			action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
			action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentread()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.customerabn()).doubleClick().build().perform();
			action.moveToElement(action_obj.customeracn()).doubleClick().build().perform();
			action.moveToElement(action_obj.customeradd()).doubleClick().build().perform();
			action.moveToElement(action_obj.custcompname()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.custfaxno()).doubleClick().build().perform();
			action.moveToElement(action_obj.custnamecompname()).doubleClick().build().perform();
					executor.executeScript("scrollBy(0,1000)", "");
					//click on save this template
					action_obj.savethis_template().click();
					//ok
					action_obj.ok().click();

					Thread.sleep(5000);
//					driver.navigate().refresh();
					action_obj.PreviewallButton().click();
					Thread.sleep(2000);
					executor.executeScript("scrollBy(0,2000)", "");
					driver.switchTo().frame("previewall-final");
					Thread.sleep(700);
//					executor.executeScript("scrollBy(0,2000)", "");
					String preval22=action_obj.previewval25().getText();
					System.out.println(preval22);			
					Assertion_obj.val_invoice_assertion27();
					Thread.sleep(1000);
					driver.switchTo().defaultContent();
					action_obj.closePreview().click();		
////////////////////////////////////////Iterator Fields(Itemization)	
					Thread.sleep(5000);
					driver.switchTo().frame("invoice_content_area_ifr");
					executor.executeScript("scrollBy(0,300)", "");
					action_obj.clickinvoicepage7().clear();
					action_obj.clickinvoicepage7().click();
					driver.switchTo().defaultContent();
			
					mydrpdown.selectByVisibleText("Graph Fields");
					//add options by double click
					Thread.sleep(1500);
					action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();

					action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();

					action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
					action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
					action.moveToElement(action_obj.category()).doubleClick().build().perform();

					action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();

					action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
					action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
					action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
					action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();

					action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentread()).doubleClick().build().perform();

	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
//	driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,2000)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(700);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval23=action_obj.previewval25().getText();
	System.out.println(preval23);			
	Assertion_obj.val_invoice_assertion28();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();				
	
////////////////////////////////////////Iterator Fields(Itemization)	
	Thread.sleep(5000);
	driver.switchTo().frame("invoice_content_area_ifr");
	executor.executeScript("scrollBy(0,300)", "");
	action_obj.clickinvoicepage7().clear();
	action_obj.clickinvoicepage7().click();
	driver.switchTo().defaultContent();
	
	mydrpdown.selectByVisibleText("EziDebit BPay");
	//add options by double click
	Thread.sleep(1500);
	action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();

	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
	//driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,2000)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(700);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval24=action_obj.previewval25().getText();
	System.out.println(preval24);			
	Assertion_obj.val_invoice_assertion29();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();		
	System.out.println("================================7-Statement and Usage bar graph - [GRAPH]  =============================\n");	
	}	
	
	
	
	//8----GRAPH- 2 Blocked Due to some issue and pending
	
	
	@Test(priority = 8)
	public void EziDebit_BPay_BPAY() throws Exception{
		try{
			Thread.sleep(1000);
			action_obj.closePreview().click();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(1000);
		Select mydrpdowncat = new Select(action_obj.categoryselect());
		mydrpdowncat.selectByValue("BPAY");
		Thread.sleep(7000);	
		driver.switchTo().frame("invoice_content_area_ifr");
//		action_obj.clickinvoicepage9one().clear();
		action_obj.clickinvoicepage9().clear();
		action_obj.clickinvoicepage9().click();
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		Select mydrpdown = new Select(action_obj.fields_invoice());
		mydrpdown.selectByVisibleText("Global Fields");
		Thread.sleep(1500);
		//add options by double click
		Actions action = new Actions(driver);
		action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
		action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
		action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
		action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
		action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
		action.moveToElement(action_obj.category()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
		action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
		action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
		action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
		action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
		action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
		action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
		action.moveToElement(action_obj.currentread()).doubleClick().build().perform();
		
		Thread.sleep(700);
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("scrollBy(0,700)", "");
		
		action.moveToElement(action_obj.customerabn()).doubleClick().build().perform();
		action.moveToElement(action_obj.customeracn()).doubleClick().build().perform();
		action.moveToElement(action_obj.customeradd()).doubleClick().build().perform();
		action.moveToElement(action_obj.custcompname()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.custfaxno()).doubleClick().build().perform();
		action.moveToElement(action_obj.custnamecompname()).doubleClick().build().perform();
		action.moveToElement(action_obj.custno()).doubleClick().build().perform();
		action.moveToElement(action_obj.custphah()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.custphbh()).doubleClick().build().perform();
		action.moveToElement(action_obj.custphmo()).doubleClick().build().perform();
		action.moveToElement(action_obj.custphyadd()).doubleClick().build().perform();
		action.moveToElement(action_obj.custtname()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.custtype()).doubleClick().build().perform();
		action.moveToElement(action_obj.dateofbirth()).doubleClick().build().perform();     
		action.moveToElement(action_obj.discounts()).doubleClick().build().perform();		
		action.moveToElement(action_obj.emailadd()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.firstname()).doubleClick().build().perform();
		action.moveToElement(action_obj.gst()).doubleClick().build().perform();
		action.moveToElement(action_obj.icpt()).doubleClick().build().perform();
		action.moveToElement(action_obj.nmi()).doubleClick().build().perform();

		action.moveToElement(action_obj.nextreaddateanu()).doubleClick().build().perform();
		action.moveToElement(action_obj.nextreaddatemnth()).doubleClick().build().perform();
		action.moveToElement(action_obj.nextreaddatequa()).doubleClick().build().perform();
		action.moveToElement(action_obj.nextreaddatesemianu()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.nextschreaddate()).doubleClick().build().perform();
		action.moveToElement(action_obj.openingbal()).doubleClick().build().perform();
		action.moveToElement(action_obj.otherpayreceive()).doubleClick().build().perform();
		action.moveToElement(action_obj.potdiscount()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.potdiscountrate()).doubleClick().build().perform();
		action.moveToElement(action_obj.potreversal()).doubleClick().build().perform();
		action.moveToElement(action_obj.payamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.penaltyamt()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.penaltylabel()).doubleClick().build().perform();
		action.moveToElement(action_obj.postcode()).doubleClick().build().perform();
		action.moveToElement(action_obj.prebalamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.preread()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.rebate()).doubleClick().build().perform();
		action.moveToElement(action_obj.salutation()).doubleClick().build().perform();
//		action.moveToElement(action_obj.discounts()).doubleClick().build().perform();
		action.moveToElement(action_obj.securedipamt()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.servicesupplyadd()).doubleClick().build().perform();
		action.moveToElement(action_obj.shortaddress()).doubleClick().build().perform();
		action.moveToElement(action_obj.shortaddresstwo()).doubleClick().build().perform();
		action.moveToElement(action_obj.state()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.stmtbillperiod()).doubleClick().build().perform();
		action.moveToElement(action_obj.stmtduedate()).doubleClick().build().perform();
		action.moveToElement(action_obj.stmtissuedate()).doubleClick().build().perform();
		action.moveToElement(action_obj.stmtno()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.stmtseqno()).doubleClick().build().perform();
		action.moveToElement(action_obj.suburb()).doubleClick().build().perform();
		action.moveToElement(action_obj.supplystartdate()).doubleClick().build().perform();
		action.moveToElement(action_obj.surename()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.taxunit()).doubleClick().build().perform();
		action.moveToElement(action_obj.totalgstapp()).doubleClick().build().perform();
		action.moveToElement(action_obj.totalreading()).doubleClick().build().perform();
		action.moveToElement(action_obj.totalusage()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.totalusagekwh()).doubleClick().build().perform();
		action.moveToElement(action_obj.unit()).doubleClick().build().perform();
		action.moveToElement(action_obj.usagegstapp()).doubleClick().build().perform();
		action.moveToElement(action_obj.usagegstnon()).doubleClick().build().perform();
		
		action.moveToElement(action_obj.usagerebateamt()).doubleClick().build().perform();
		action.moveToElement(action_obj.usagerebatelabel()).doubleClick().build().perform();
		action.moveToElement(action_obj.usagerebategst()).doubleClick().build().perform();
		//Opts are added in script to cover all feature
		action.moveToElement(action_obj.opt1()).doubleClick().build().perform();
		action.moveToElement(action_obj.opt2()).doubleClick().build().perform();
		action.moveToElement(action_obj.opt3()).doubleClick().build().perform();
		action.moveToElement(action_obj.opt4()).doubleClick().build().perform();
		action.moveToElement(action_obj.opt5()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt6()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt7()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt8()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt9()).doubleClick().build().perform();
//		action.moveToElement(action_obj.opt10()).doubleClick().build().perform();

	
	
	//scroll
	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
//	driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,2000)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(1200);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval25=action_obj.previewval25().getText();
	System.out.println(preval25);	
	Assertion_obj.val_invoice_assertion30();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();
//////////////////////////////Iterator Field///////////////////////////////////		
	Thread.sleep(5000);
	driver.switchTo().frame("invoice_content_area_ifr");
	action_obj.clickinvoicepage9().clear();
	action_obj.clickinvoicepage9().click();
	driver.switchTo().defaultContent();
	mydrpdown.selectByVisibleText("Iterator Fields(Charge Summary)");
	//add options by double click
	Thread.sleep(1500);
			action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
			executor.executeScript("scrollBy(0,1000)", "");
			//click on save this template
			action_obj.savethis_template().click();
			//ok
			action_obj.ok().click();

			Thread.sleep(2000);
//			driver.navigate().refresh();
			action_obj.PreviewallButton().click();
			Thread.sleep(2000);
			executor.executeScript("scrollBy(0,2000)", "");
			driver.switchTo().frame("previewall-final");
			Thread.sleep(700);
//			executor.executeScript("scrollBy(0,2000)", "");
			String preval26=action_obj.previewval25().getText();
			System.out.println(preval26);	
			Assertion_obj.val_invoice_assertion31();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			action_obj.closePreview().click();
////////////////////////////////////////Iterator Fields(Itemization)	
			Thread.sleep(5000);
			driver.switchTo().frame("invoice_content_area_ifr");
			action_obj.clickinvoicepage9().clear();
			action_obj.clickinvoicepage9().click();
			driver.switchTo().defaultContent();
			
			mydrpdown.selectByVisibleText("Iterator Fields(Itemization)");
			//add options by double click
			Thread.sleep(1500);
			action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
			action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
			action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
			action.moveToElement(action_obj.category()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
			action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
			action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
			action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
			action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
			action.moveToElement(action_obj.currentread()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.customerabn()).doubleClick().build().perform();
			action.moveToElement(action_obj.customeracn()).doubleClick().build().perform();
			action.moveToElement(action_obj.customeradd()).doubleClick().build().perform();
			action.moveToElement(action_obj.custcompname()).doubleClick().build().perform();
			
			action.moveToElement(action_obj.custfaxno()).doubleClick().build().perform();
			action.moveToElement(action_obj.custnamecompname()).doubleClick().build().perform();
					executor.executeScript("scrollBy(0,1000)", "");
					//click on save this template
					action_obj.savethis_template().click();
					//ok
					action_obj.ok().click();

					Thread.sleep(5000);
//					driver.navigate().refresh();
					action_obj.PreviewallButton().click();
					Thread.sleep(2000);
					executor.executeScript("scrollBy(0,2000)", "");
					driver.switchTo().frame("previewall-final");
					Thread.sleep(700);
//					executor.executeScript("scrollBy(0,2000)", "");
					String preval27=action_obj.previewval25().getText();
					System.out.println(preval27);			
					Assertion_obj.val_invoice_assertion32();
					Thread.sleep(1000);
					driver.switchTo().defaultContent();
					action_obj.closePreview().click();		
////////////////////////////////////////Iterator Fields(Itemization)	
					Thread.sleep(5000);
					driver.switchTo().frame("invoice_content_area_ifr");
					executor.executeScript("scrollBy(0,300)", "");
					action_obj.clickinvoicepage9().clear();
					action_obj.clickinvoicepage9().click();
					driver.switchTo().defaultContent();
			
					mydrpdown.selectByVisibleText("Graph Fields");
					//add options by double click
					Thread.sleep(1500);
					action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Authenticationdoubleclick()).doubleClick().build().perform();

					action.moveToElement(action_obj.Authenticationtypedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Averagedoubleclick()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingthreemonths()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingsixmonths()).doubleClick().build().perform();

					action.moveToElement(action_obj.Billingpmonths()).doubleClick().build().perform();
					action.moveToElement(action_obj.Billingpyear()).doubleClick().build().perform();
					action.moveToElement(action_obj.carriedfwd()).doubleClick().build().perform();
					action.moveToElement(action_obj.category()).doubleClick().build().perform();

					action.moveToElement(action_obj.companyfax()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyname()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyphone()).doubleClick().build().perform();
					action.moveToElement(action_obj.companyphyadd()).doubleClick().build().perform();

					action.moveToElement(action_obj.companypostadd()).doubleClick().build().perform();
					action.moveToElement(action_obj.countryin()).doubleClick().build().perform();
					action.moveToElement(action_obj.coveredenddate()).doubleClick().build().perform();
					action.moveToElement(action_obj.coveredstartdate()).doubleClick().build().perform();

					action.moveToElement(action_obj.currentbalamt()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentchrgamt()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentmonthusage()).doubleClick().build().perform();
					action.moveToElement(action_obj.currentread()).doubleClick().build().perform();

	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
//	driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,2000)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(700);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval28=action_obj.previewval25().getText();
	System.out.println(preval28);			
	Assertion_obj.val_invoice_assertion33();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();				
	
////////////////////////////////////////Iterator Fields(Itemization)	
	Thread.sleep(5000);
	driver.switchTo().frame("invoice_content_area_ifr");
	executor.executeScript("scrollBy(0,300)", "");
	action_obj.clickinvoicepage9().clear();
	action_obj.clickinvoicepage9().click();
	driver.switchTo().defaultContent();
	
	mydrpdown.selectByVisibleText("EziDebit BPay");
	//add options by double click
	Thread.sleep(1500);
	action.moveToElement(action_obj.Adjustmentsdoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Alternativedoubleclick()).doubleClick().build().perform();
	action.moveToElement(action_obj.Amountdoubleclick()).doubleClick().build().perform();

	executor.executeScript("scrollBy(0,1000)", "");
	//click on save this template
	action_obj.savethis_template().click();
	//ok
	action_obj.ok().click();

	Thread.sleep(5000);
	//driver.navigate().refresh();
	action_obj.PreviewallButton().click();
	Thread.sleep(2000);
	executor.executeScript("scrollBy(0,2000)", "");
	driver.switchTo().frame("previewall-final");
	Thread.sleep(700);
//	executor.executeScript("scrollBy(0,2000)", "");
	String preval29=action_obj.previewval25().getText();
	System.out.println(preval29);			
	Assertion_obj.val_invoice_assertion34();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	action_obj.closePreview().click();		
	System.out.println("================================9 - EziDebit BPay - [BPAY] =============================\n");	
	}	
	
	
	
		
		
		
		
	@Test(priority = 10)
	public void finish_preview() throws InterruptedException{
		//finish button
//////////////		executor.executeScript("scrollBy(0,-1000)", "");
//		WebElement f= action_obj.finishpreviewButton();
//		f.click();
		Thread.sleep(1000);
		action_obj.finishpreviewButton().click();
	}
}
