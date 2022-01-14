package reports;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Utility.Bill.Re_Usable.Assertion_Test;
import com.Utility.Bill.Re_Usable.Repo_Test;
import com.Utility.Bill.Re_Usable.Sauce_Instance_Login_Test;

public class Statement extends Sauce_Instance_Login_Test {

	String stmt_no;
	String cno;
	JavascriptExecutor jse;
	
				@Test(priority = 0)
				public void bill_run_Details() throws Exception{
					action_obj.bill_run_mainMenu().click();
					//validate welcome to bill run wizard text
					Assertion_obj.Welcome_to_Bill_Run_Wizard_text_assertion();
					//click on bill run search button
					action_obj.billRunsearchButton().click();
					stmt_no = action_obj.statementnobr().getText();
					action_obj.viewDetailsIcon().click();
					cno = action_obj.brscustomer().getText();
				
				}
				@Test(priority = 1)
				public void Meter_Usage_and_Charges_By_Leasee() throws Exception{
					
					action_obj.reports().click();
					Assertion_obj.reportsname();
					action_obj.statementicon().click();
					Assertion_obj.statementpage();
					action_obj.mucbl().click();
					Assertion_obj.mucblpage();
					Select sel = new Select(action_obj.stmtnomucbl());
					sel.selectByVisibleText(stmt_no);
					action_obj.nextbuttonmrs().click();
					String ac_cno = action_obj.mucblcno().getText();
					Assert.assertEquals(cno,ac_cno);
				}
				@Test(priority = 2)
				public void Meter_usage_and_charges_by_customer() throws Exception
				{
					action_obj.reports().click();
					Assertion_obj.reportsname();
					action_obj.statementicon().click();
					Assertion_obj.statementpage();
					action_obj.mucbc().click();
					Select sel = new Select(action_obj.stmtnomucbl());
//already selected  			sel.deselectByVisibleText(stmt_no);
					action_obj.nextbuttonmrs().click();
					
					Assertion_obj.compnamemucbc();
					//incomplete horizontal scroll pending
				}
							
				
}
