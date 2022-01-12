package com.Utility.Bill.Re_Usable;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Assertion_Test  {
	public Repo_Test Robj;
	public WebDriver driver;

	public String Statements;
	public String Statements1;
	public String Statements2;
	public String  no="";

	//      public String stno;
	public Assertion_Test(WebDriver driver) throws IOException {
		this.driver=driver;
		Robj = new Repo_Test(driver);
	}
	Properties prop;
	//String  path = System.getProperty("user.dir") + "\\TestData\\UI.properties";
	//ObjectMap_Test123 objMap = new ObjectMap_Test123(path);

	//Bill_Run_Results_text_assertion
	public static  String Ex_Bill_Run_Results_text;
	public static  String Act_Bill_Run_Results_text;
	public  void Bill_Run_Results_text_assertion()  throws Exception 
	{ 
		//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
		Act_Bill_Run_Results_text=Robj.Bill_Run_Results_text().getText();
		Ex_Bill_Run_Results_text="Bill Run Results";
		Assert.assertEquals(Act_Bill_Run_Results_text,Ex_Bill_Run_Results_text);
		System.out.println("   # Validation == PASS :: Home Text is present");

	}


	//cycleConfirmationMessage_assertion
	public static  String Ex_cycleConfirmationMessage_text;
	public static  String Act_cycleConfirmationMessage_text;
	public  void cycleConfirmationMessage_text_assertion()  throws Exception 
	{ 
		//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
		Act_cycleConfirmationMessage_text=Robj.cycleConfirmationMessage().getText();
		Ex_cycleConfirmationMessage_text="Successfully added new bill run cycle.";
		Assert.assertEquals(Act_cycleConfirmationMessage_text,Ex_cycleConfirmationMessage_text);
		System.out.println("	# Validation == PASS :: Home Text is present");

	}

	//rollback_Message_text_assertion
	public static  String Ex_rollback_Message_text;
	public static  String act_rollback_Message_text;
	public  void rollback_Message_text_assertion()  throws Exception 
	{ 
		//System.out.println(Ex_home=td.get_string_CellData("Assertion", 0, 0));
		act_rollback_Message_text=Robj.rollbackMessage().getText();
		Ex_rollback_Message_text="Rollback complete.";
		Assert.assertEquals(act_rollback_Message_text,Ex_rollback_Message_text);
		System.out.println("	# Validation == PASS :: Roll Back is Complete");

	}
	//Welcome_to_Bill_Run_Wizard_text_assertion
	public static  String Ex_Welcome_to_Bill_Run_Wizard_text;
	public static  String Act_Welcome_to_Bill_Run_Wizard_text;
	public  void Welcome_to_Bill_Run_Wizard_text_assertion()  throws Exception 
	{ 
		Act_Welcome_to_Bill_Run_Wizard_text=Robj.Welcome_to_Bill_Run_Wizard_text().getText();
		Ex_Welcome_to_Bill_Run_Wizard_text="Welcome to Bill Run Wizard";
		Assert.assertEquals(Act_Welcome_to_Bill_Run_Wizard_text,Ex_Welcome_to_Bill_Run_Wizard_text);
		System.out.println("	# Validation == PASS :: Home Text is present");

	}

	//changes_save_message_assertion
	public static  String Ex_changes_save_message;
	public static  String Act_changes_save_message;
	public  void changes_save_message_assertion() throws Exception 
	{
		Ex_changes_save_message="Success! Changes have been updated successfully.";
		Act_changes_save_message=Robj.changes_save_message().getText();
		Assert.assertEquals(Act_changes_save_message, Ex_changes_save_message);
		System.out.println("	# Validation == PASS :: Please login text is present");

	}


	//Assertion to validate  Bill Run Results text is present
	public static  String Expectedtext03;
	public static  String Actualtext03;
	public  void bill_run_results_message_assertion() throws Exception 
	{
		Expectedtext03="Bill Run Results";
		Actualtext03=Robj.billrunassert().getText();
		Assert.assertEquals(Actualtext03, Expectedtext03);
		System.out.println("	# Validation == PASS :: Please login text is present");

	}

	//pass_change_message_assertion
	public static String Ex_pass_change_message;
	public static String Act_pass_change_message;
	public  void pass_change_message_assertion() throws Exception 
	{
		Act_pass_change_message=Robj.pass_change_message().getText();
		Ex_pass_change_message="Password has been successfully updated.";

		Assert.assertEquals(Act_pass_change_message,Ex_pass_change_message);
		System.out.println("	# Validation == PASS :: Entered user name retained in Box");

	}

	//change_password_title_assertion
	public static String Ex_change_password_title;
	public static String Act_change_password_title;
	public  void change_password_title_assertion() throws Exception 
	{
		Ex_change_password_title=Robj.change_password_title().getText();
		Act_change_password_title="Change Password";
		Assert.assertEquals(Ex_change_password_title,Act_change_password_title);
		System.out.println("	# Validation == PASS :: Entered user password retained in Box");

	}

	//val_invoice
	public static String Ex_val_invoice;
	public static String Act_val_invoice;
	public  void val_invoice_assertion() throws Exception 
	{
		Ex_val_invoice=Robj.previewval().getText();
		Act_val_invoice="[Adjustments-Amount][Alternative Customer ID][Amount Due][Authentication No.][Authentication Type][Average Use][Billing Period - Previous 3 Months][Billing Period - Previous 6 Months][Billing Period - Previous Month][Billing Period - Previous Year][Carried Forward-Amount][Category][Company Fax][Company Name][Company Phone][Company Physical Address][Company Postal Address][Country][Covered End Date][Covered Start Date][Current Balance+Late Fee][Current Balance-Amount][Current Charges-Amount][Current Month Usage][Current Read][Customer ABN][Customer ACN][Customer Address][Customer Company Name][Customer Fax Number][Customer Name / Company Name][Customer Number][Customer Phone (ah)][Customer Phone (bh)][Customer Phone (mobile)][Customer Physical Address][Customer Trading Name][Customer Type][Date of Birth][Discounts][Email Address][Firstname][GST][ICPT (RM 0.0128)][Late Fee][Late Payment Charge][NMI][Next Reading Date (Annual)][Next Reading Date (Montly)][Next Reading Date (Quarterly)][Next Reading Date (Semi-Annual)][Next Scheduled Read Date][Opening Balance][Other Payments Received][POT Discount][POT Discount Rate][POT Reversal][Payments-Amount][PenaltyAmount][PenaltyLabel][Postcode][Previous Balance-Amount][Previous Read][Rebate][Salutation][Secure Deposit-Amount][Service Supply Address][Short Address][Short Address 2][State][Statement Billing Period][Statement Due Date][Statement Issued Date][Statement Number][Statement Seqno][Suburb][Supply Start Date][Surname][Tax Unit][Total GST Applicable][Total Reading][Total Usage][Total Usage Kwh][Unit][Usage GST Applicable][Usage GST Not Applicable][Usage Kwh GST Applicable][Usage Kwh GST Not Applicable][Usage Rebate Amount][Usage Rebate Label][Usage Rebate With GST]";
		Assert.assertEquals(Ex_val_invoice,Act_val_invoice);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	////Not using this free to use		
	public  void val_invoice_assertion0() throws Exception 
	{
		Ex_val_invoice=Robj.previewval().getText();
		Act_val_invoice="[Adjustments-Amount][Alternative Customer ID][Amount Due][Authentication No.][Authentication Type][Average Use][Billing Period - Previous 3 Months][Billing Period - Previous 6 Months][Billing Period - Previous Month][Billing Period - Previous Year][Carried Forward-Amount][Category][Company Fax][Company Name][Company Phone][Company Physical Address][Company Postal Address][Country][Covered End Date][Covered Start Date][Current Balance-Amount][Current Charges-Amount][Current Month Usage][Current Read][Customer ABN][Customer ACN][Customer Address][Customer Company Name][Customer Fax Number][Customer Name / Company Name][Customer Number][Customer Phone (ah)][Customer Phone (bh)][Customer Phone (mobile)][Customer Physical Address][Customer Trading Name][Customer Type][Date of Birth][Discounts][Email Address][Firstname][GST][ICPT (RM 0.0128)][NMI][Next Reading Date (Annual)][Next Reading Date (Montly)][Next Reading Date (Quarterly)][Next Reading Date (Semi-Annual)][Next Scheduled Read Date][Opening Balance][Other Payments Received][POT Discount][POT Discount Rate][POT Reversal][Payments-Amount][PenaltyAmount][PenaltyLabel][Postcode][Previous Balance-Amount][Previous Read][Rebate][Salutation][Discounts][Secure Deposit-Amount][Service Supply Address][Short Address][Short Address 2][State][Statement Billing Period][Statement Due Date][Statement Issued Date][Statement Number][Statement Seqno][Suburb][Supply Start Date][Surname][Tax Unit][Total GST Applicable][Total Reading][Total Usage][Total Usage Kwh][Unit][Usage GST Applicable][Usage GST Not Applicable][Usage Kwh GST Applicable][Usage Kwh GST Not Applicable][Usage Rebate Amount][Usage Rebate Label][Usage Rebate Tax]";
		Assert.assertEquals(Ex_val_invoice,Act_val_invoice);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}

	//val_invoic
	public static String Ex_val_invoice1;
	public static String Act_val_invoice1;
	public  void val_invoice_assertion1() throws Exception 
	{
		Ex_val_invoice1=Robj.previewval().getText();
		Act_val_invoice1="[Gross Charge-Amount][Gross Tax Inc-Amount][Gross Tax-Amount][Rollup Code][Rollup Description][Total Charge-Amount][Total Inc Tax-Amount][Total Tax-Amount]";
		Assert.assertEquals(Ex_val_invoice1,Act_val_invoice1);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice2;
	public static String Act_val_invoice2;
	public  void val_invoice_assertion2() throws Exception 
	{
		Ex_val_invoice2=Robj.previewval().getText();
		Act_val_invoice2="[/Unit][Bill Days][Charge Description][Covered End Date][Covered Start Date][Current Read][Current Read Date][K Factor][Loss Factor][NMI][Plan Name][Previous Read][Previous Read Date][Quantity][Rate-Amount][Read Type][Reference Number][Rollup Description][Service Number][Service Supply Address][Short Read Type][Special Type][Tariff Code][Tax-Amount][Total Ex Tax-Amount][Total Inc Tax-Amount][Total Tax-Amount][Total Usage][Total-Amount][Unit]";
		Assert.assertEquals(Ex_val_invoice2,Act_val_invoice2);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}	
	//val_invoice
	public static String Ex_val_invoice3;
	public static String Act_val_invoice3;
	public  void val_invoice_assertion3() throws Exception 
	{
		Ex_val_invoice3=Robj.previewval().getText();
		Act_val_invoice3="[Average Cost-Amount][Average Use][Average Use per Quarter][Covered End Date][Covered Start Date][Current Read][Green Gas][Number of days covered][Previous Read][Price Charge-Amount][Statement Month][Statement Number][Statement Year][Total Reading][Unit][benchmark1][benchmark2][benchmark3][benchmark4][benchmark5][current_read_date][distributor][kFactor][previous_read_date]";
		Assert.assertEquals(Ex_val_invoice3,Act_val_invoice3);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}	
	//val_invoice
	public static String Ex_val_invoice4;
	public static String Act_val_invoice4;
	public  void val_invoice_assertion4() throws Exception 
	{
		Ex_val_invoice4=Robj.previewval().getText();
		Act_val_invoice4="[BPAY Logo][Biller Code][Reference Number]";
		Assert.assertEquals(Ex_val_invoice4,Act_val_invoice4);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice5;
	public static String Act_val_invoice5;
	public  void val_invoice_assertion5() throws Exception 
	{
		Ex_val_invoice5=Robj.previewval15().getText();
		Act_val_invoice5="[Adjustments-Amount][Alternative Customer ID][Amount Due][Authentication No.][Authentication Type][Average Use][Billing Period - Previous 3 Months][Billing Period - Previous 6 Months][Billing Period - Previous Month][Billing Period - Previous Year][Carried Forward-Amount][Category][Company Fax][Company Name][Company Phone][Company Physical Address][Company Postal Address][Country][Covered End Date][Covered Start Date][Current Balance+Late Fee][Current Balance-Amount][Current Charges-Amount][Current Month Usage][Current Read][Customer ABN][Customer ACN][Customer Address][Customer Company Name][Customer Fax Number][Customer Name / Company Name][Customer Number][Customer Phone (ah)][Customer Phone (bh)][Customer Phone (mobile)][Customer Physical Address][Customer Trading Name][Customer Type][Date of Birth][Discounts][Email Address][Firstname][GST][ICPT (RM 0.0128)][Late Fee][Late Payment Charge][NMI][Next Reading Date (Annual)][Next Reading Date (Montly)][Next Reading Date (Quarterly)][Next Reading Date (Semi-Annual)][Next Scheduled Read Date][Opening Balance][Other Payments Received][POT Discount][POT Discount Rate][POT Reversal][Payments-Amount][PenaltyAmount][PenaltyLabel][Postcode][Previous Balance-Amount][Previous Read][Rebate][Salutation][Secure Deposit-Amount][Service Supply Address][Short Address][Short Address 2][State][Statement Billing Period][Statement Due Date][Statement Issued Date][Statement Number][Statement Seqno][Suburb][Supply Start Date][Surname]GST[Total GST Applicable][Total Reading][Total Usage][Total Usage Kwh][Unit][Usage GST Applicable][Usage GST Not Applicable][Usage Kwh GST Applicable][Usage Kwh GST Not Applicable][Usage Rebate Amount][Usage Rebate Label][Usage Rebate With GST]";
		Assert.assertEquals(Ex_val_invoice5,Act_val_invoice5);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}

	//val_invoice
	public static String Ex_val_invoice6;
	public static String Act_val_invoice6;
	public  void val_invoice_assertion6() throws Exception 
	{
		Ex_val_invoice6=Robj.previewval15().getText();
		Act_val_invoice6="[Gross Charge-Amount][Gross Tax Inc-Amount][Gross Tax-Amount][Rollup Code][Rollup Description][Total Charge-Amount][Total Inc Tax-Amount][Total Tax-Amount]";
		Assert.assertEquals(Ex_val_invoice6,Act_val_invoice6);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice7;
	public static String Act_val_invoice7;
	public  void val_invoice_assertion7() throws Exception 
	{
		Ex_val_invoice7=Robj.previewval15().getText();
		Act_val_invoice7="[/Unit][Bill Days][Charge Description][Covered End Date][Covered Start Date][Current Read][Current Read Date][K Factor][Loss Factor][NMI][Plan Name][Previous Read][Previous Read Date][Quantity][Rate-Amount][Read Type][Reference Number][Rollup Description][Service Number][Service Supply Address][Short Read Type][Special Type][Tariff Code][Tax-Amount][Total Ex Tax-Amount][Total Inc Tax-Amount][Total Tax-Amount][Total Usage][Total-Amount][Unit]";
		Assert.assertEquals(Ex_val_invoice7,Act_val_invoice7);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}	
	//val_invoice
	public static String Ex_val_invoice8;
	public static String Act_val_invoice8;
	public  void val_invoice_assertion8() throws Exception 
	{
		Ex_val_invoice8=Robj.previewval15().getText();
		Act_val_invoice8="[Average Cost-Amount][Average Use][Average Use per Quarter][Covered End Date][Covered Start Date][Current Read][Green Gas][Number of days covered][Previous Read][Price Charge-Amount][Statement Month][Statement Number][Statement Year][Total Reading][Unit][benchmark1][benchmark2][benchmark3][benchmark4][benchmark5][current_read_date][distributor][kFactor][previous_read_date]";
		Assert.assertEquals(Ex_val_invoice8,Act_val_invoice8);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}	
	//val_invoice
	public static String Ex_val_invoice9;
	public static String Act_val_invoice9;
	public  void val_invoice_assertion9() throws Exception 
	{
		Ex_val_invoice9=Robj.previewval15().getText();
		Act_val_invoice9="[BPAY Logo][Biller Code][Reference Number]";
		Assert.assertEquals(Ex_val_invoice9,Act_val_invoice9);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}	

	//val_invoice
	public static String Ex_val_invoice15;
	public static String Act_val_invoice15;
	public  void val_invoice_assertion15() throws Exception 
	{
		Ex_val_invoice15=Robj.previewval6().getText();
		Act_val_invoice15="[Adjustments-Amount][Alternative Customer ID][Amount Due][Authentication No.][Authentication Type][Average Use][Billing Period - Previous 3 Months][Billing Period - Previous 6 Months][Billing Period - Previous Month][Billing Period - Previous Year][Carried Forward-Amount][Category][Company Fax][Company Name][Company Phone][Company Physical Address][Company Postal Address][Country][Covered End Date][Covered Start Date][Current Balance+Late Fee][Current Balance-Amount][Current Charges-Amount][Current Month Usage][Current Read][Customer ABN][Customer ACN][Customer Address][Customer Company Name][Customer Fax Number][Customer Name / Company Name][Customer Number][Customer Phone (ah)][Customer Phone (bh)][Customer Phone (mobile)][Customer Physical Address][Customer Trading Name][Customer Type][Date of Birth][Discounts][Email Address][Firstname][GST][ICPT (RM 0.0128)][Late Fee][Late Payment Charge][NMI][Next Reading Date (Annual)][Next Reading Date (Montly)][Next Reading Date (Quarterly)][Next Reading Date (Semi-Annual)][Next Scheduled Read Date][Opening Balance][Other Payments Received][POT Discount][POT Discount Rate][POT Reversal][Payments-Amount][PenaltyAmount][PenaltyLabel][Postcode][Previous Balance-Amount][Previous Read][Rebate][Salutation][Secure Deposit-Amount][Service Supply Address][Short Address][Short Address 2][State][Statement Billing Period][Statement Due Date][Statement Issued Date][Statement Number][Statement Seqno][Suburb][Supply Start Date][Surname]GST[Total GST Applicable][Total Reading][Total Usage][Total Usage Kwh][Unit][Usage GST Applicable][Usage GST Not Applicable][Usage Kwh GST Applicable][Usage Kwh GST Not Applicable][Usage Rebate Amount][Usage Rebate Label][Usage Rebate With GST]";
		Assert.assertEquals(Ex_val_invoice15,Act_val_invoice15);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice16;
	public static String Act_val_invoice16;
	public  void val_invoice_assertion16() throws Exception 
	{
		Ex_val_invoice16=Robj.previewval6().getText();
		Act_val_invoice16="[Gross Charge-Amount][Gross Tax Inc-Amount][Gross Tax-Amount][Rollup Code][Rollup Description][Total Charge-Amount][Total Inc Tax-Amount][Total Tax-Amount]";
		Assert.assertEquals(Ex_val_invoice16,Act_val_invoice16);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice17;
	public static String Act_val_invoice17;
	public  void val_invoice_assertion17() throws Exception 
	{
		Ex_val_invoice17=Robj.previewval6().getText();
		Act_val_invoice17="[/Unit][Bill Days][Charge Description][Covered End Date][Covered Start Date][Current Read][Current Read Date][K Factor][Loss Factor][NMI][Plan Name][Previous Read][Previous Read Date][Quantity][Rate-Amount][Read Type][Reference Number][Rollup Description][Service Number][Service Supply Address][Short Read Type][Special Type][Tariff Code][Tax-Amount][Total Ex Tax-Amount][Total Inc Tax-Amount][Total Tax-Amount][Total Usage][Total-Amount][Unit]";
		Assert.assertEquals(Ex_val_invoice17,Act_val_invoice17);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}	
	//val_invoice
	public static String Ex_val_invoice18;
	public static String Act_val_invoice18;
	public  void val_invoice_assertion18() throws Exception 
	{
		Ex_val_invoice18=Robj.previewval6().getText();
		Act_val_invoice18="[Average Cost-Amount][Average Use][Average Use per Quarter][Covered End Date][Covered Start Date][Current Read][Green Gas][Number of days covered][Previous Read][Price Charge-Amount][Statement Month][Statement Number][Statement Year][Total Reading][Unit][benchmark1][benchmark2][benchmark3][benchmark4][benchmark5][current_read_date][distributor][kFactor][previous_read_date]";
		Assert.assertEquals(Ex_val_invoice18,Act_val_invoice18);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice19;
	public static String Act_val_invoice19;
	public  void val_invoice_assertion19() throws Exception 
	{
		Ex_val_invoice19=Robj.previewval6().getText();
		Act_val_invoice19="[BPAY Logo][Biller Code][Reference Number]";
		Assert.assertEquals(Ex_val_invoice19,Act_val_invoice19);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice20;
	public static String Act_val_invoice20;
	public  void val_invoice_assertion20() throws Exception 
	{
		Ex_val_invoice20=Robj.previewval19().getText();
		Act_val_invoice20="[Adjustments-Amount][Alternative Customer ID][Amount Due][Authentication No.][Authentication Type][Average Use][Billing Period - Previous 3 Months][Billing Period - Previous 6 Months][Billing Period - Previous Month][Billing Period - Previous Year][Carried Forward-Amount][Category][Company Fax][Company Name][Company Phone][Company Physical Address][Company Postal Address][Country][Covered End Date][Covered Start Date][Current Balance+Late Fee][Current Balance-Amount][Current Charges-Amount][Current Month Usage][Current Read][Customer ABN][Customer ACN][Customer Address][Customer Company Name][Customer Fax Number][Customer Name / Company Name][Customer Number][Customer Phone (ah)][Customer Phone (bh)][Customer Phone (mobile)][Customer Physical Address][Customer Trading Name][Customer Type][Date of Birth][Discounts][Email Address][Firstname][GST][ICPT (RM 0.0128)][Late Fee][Late Payment Charge][NMI][Next Reading Date (Annual)][Next Reading Date (Montly)][Next Reading Date (Quarterly)][Next Reading Date (Semi-Annual)][Next Scheduled Read Date][Opening Balance][Other Payments Received][POT Discount][POT Discount Rate][POT Reversal][Payments-Amount][PenaltyAmount][PenaltyLabel][Postcode][Previous Balance-Amount][Previous Read][Rebate][Salutation][Secure Deposit-Amount][Service Supply Address][Short Address][Short Address 2][State][Statement Billing Period][Statement Due Date][Statement Issued Date][Statement Number][Statement Seqno][Suburb][Supply Start Date][Surname]GST[Total GST Applicable][Total Reading][Total Usage][Total Usage Kwh][Unit][Usage GST Applicable][Usage GST Not Applicable][Usage Kwh GST Applicable][Usage Kwh GST Not Applicable][Usage Rebate Amount][Usage Rebate Label][Usage Rebate With GST]";
		Assert.assertEquals(Ex_val_invoice20,Act_val_invoice20);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice21;
	public static String Act_val_invoice21;
	public  void val_invoice_assertion21() throws Exception 
	{
		Ex_val_invoice21=Robj.previewval19().getText();
		Act_val_invoice21="[Gross Charge-Amount][Gross Tax Inc-Amount][Gross Tax-Amount][Rollup Code][Rollup Description][Total Charge-Amount][Total Inc Tax-Amount][Total Tax-Amount]";
		Assert.assertEquals(Ex_val_invoice21,Act_val_invoice21);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice22;
	public static String Act_val_invoice22;
	public  void val_invoice_assertion22() throws Exception 
	{
		Ex_val_invoice22=Robj.previewval19().getText();
		Act_val_invoice22="[/Unit][Bill Days][Charge Description][Covered End Date][Covered Start Date][Current Read][Current Read Date][K Factor][Loss Factor][NMI][Plan Name][Previous Read][Previous Read Date][Quantity][Rate-Amount][Read Type][Reference Number][Rollup Description][Service Number][Service Supply Address][Short Read Type][Special Type][Tariff Code][Tax-Amount][Total Ex Tax-Amount][Total Inc Tax-Amount][Total Tax-Amount][Total Usage][Total-Amount][Unit]";
		Assert.assertEquals(Ex_val_invoice22,Act_val_invoice22);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}	
	//val_invoice
	public static String Ex_val_invoice23;
	public static String Act_val_invoice23;
	public  void val_invoice_assertion23() throws Exception 
	{
		Ex_val_invoice23=Robj.previewval19().getText();
		Act_val_invoice23="[Average Cost-Amount][Average Use][Average Use per Quarter][Covered End Date][Covered Start Date][Current Read][Green Gas][Number of days covered][Previous Read][Price Charge-Amount][Statement Month][Statement Number][Statement Year][Total Reading][Unit][benchmark1][benchmark2][benchmark3][benchmark4][benchmark5][current_read_date][distributor][kFactor][previous_read_date]";
		Assert.assertEquals(Ex_val_invoice23,Act_val_invoice23);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice24;
	public static String Act_val_invoice24;
	public  void val_invoice_assertion24() throws Exception 
	{
		Ex_val_invoice24=Robj.previewval19().getText();
		Act_val_invoice24="[BPAY Logo][Biller Code][Reference Number]";
		Assert.assertEquals(Ex_val_invoice24,Act_val_invoice24);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}

	//val_invoice
	public static String Ex_val_invoice25;
	public static String Act_val_invoice25;
	public  void val_invoice_assertion25() throws Exception 
	{
		Ex_val_invoice25=Robj.previewval25().getText();
		Act_val_invoice25="[Adjustments-Amount][Alternative Customer ID][Amount Due][Authentication No.][Authentication Type]0[Billing Period - Previous 3 Months][Billing Period - Previous 6 Months][Billing Period - Previous Month][Billing Period - Previous Year][Carried Forward-Amount][Category][Company Fax][Company Name][Company Phone][Company Physical Address][Company Postal Address][Country]00[Current Balance+Late Fee][Current Balance-Amount][Current Charges-Amount][Current Month Usage]0[Customer ABN][Customer ACN][Customer Address][Customer Company Name][Customer Fax Number][Customer Name / Company Name][Customer Number][Customer Phone (ah)][Customer Phone (bh)][Customer Phone (mobile)][Customer Physical Address][Customer Trading Name][Customer Type][Date of Birth][Discounts][Email Address][Firstname][GST][ICPT (RM 0.0128)][Late Fee][Late Payment Charge][NMI][Next Reading Date (Annual)][Next Reading Date (Montly)][Next Reading Date (Quarterly)][Next Reading Date (Semi-Annual)][Next Scheduled Read Date][Opening Balance][Other Payments Received][POT Discount][POT Discount Rate][POT Reversal][Payments-Amount][PenaltyAmount][PenaltyLabel][Postcode][Previous Balance-Amount]0[Rebate][Salutation][Secure Deposit-Amount][Service Supply Address][Short Address][Short Address 2][State][Statement Billing Period][Statement Due Date][Statement Issued Date]0[Statement Seqno][Suburb][Supply Start Date][Surname]GST[Total GST Applicable]0[Total Usage][Total Usage Kwh][Unit][Usage GST Applicable][Usage GST Not Applicable][Usage Kwh GST Applicable][Usage Kwh GST Not Applicable][Usage Rebate Amount][Usage Rebate Label][Usage Rebate With GST]";
		Assert.assertEquals(Ex_val_invoice25,Act_val_invoice25);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice26;
	public static String Act_val_invoice26;
	public  void val_invoice_assertion26() throws Exception 
	{
		Ex_val_invoice26=Robj.previewval25().getText();
		Act_val_invoice26="[Gross Charge-Amount][Gross Tax Inc-Amount][Gross Tax-Amount][Rollup Code][Rollup Description][Total Charge-Amount][Total Inc Tax-Amount][Total Tax-Amount]";
		Assert.assertEquals(Ex_val_invoice26,Act_val_invoice26);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice27;
	public static String Act_val_invoice27;
	public  void val_invoice_assertion27() throws Exception 
	{
		Ex_val_invoice27=Robj.previewval25().getText();
		Act_val_invoice27="[/Unit][Bill Days][Charge Description]000[Current Read Date][K Factor][Loss Factor][NMI][Plan Name]0[Previous Read Date][Quantity][Rate-Amount][Read Type][Reference Number][Rollup Description][Service Number][Service Supply Address][Short Read Type][Special Type][Tariff Code][Tax-Amount][Total Ex Tax-Amount][Total Inc Tax-Amount][Total Tax-Amount][Total Usage][Total-Amount][Unit]";
		Assert.assertEquals(Ex_val_invoice27,Act_val_invoice27);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}	
	//val_invoice
	public static String Ex_val_invoice28;
	public static String Act_val_invoice28;
	public  void val_invoice_assertion28() throws Exception 
	{
		Ex_val_invoice28=Robj.previewval25().getText();
		Act_val_invoice28="0.000[Average Use per Quarter]00000000000[Unit][benchmark1][benchmark2][benchmark3][benchmark4][benchmark5]0[distributor]00";
		Assert.assertEquals(Ex_val_invoice28,Act_val_invoice28);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice29;
	public static String Act_val_invoice29;
	public  void val_invoice_assertion29() throws Exception 
	{
		Ex_val_invoice29=Robj.previewval25().getText();
		Act_val_invoice29="[BPAY Logo][Biller Code][Reference Number]";
		Assert.assertEquals(Ex_val_invoice29,Act_val_invoice29);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}

	//val_invoice
	public static String Ex_val_invoice30;
	public static String Act_val_invoice30;
	public  void val_invoice_assertion30() throws Exception 
	{
		Ex_val_invoice30=Robj.previewval26().getText();
		Act_val_invoice30="[Adjustments-Amount][Alternative Customer ID][Amount Due][Authentication No.][Authentication Type][Average Use][Billing Period - Previous 3 Months][Billing Period - Previous 6 Months][Billing Period - Previous Month][Billing Period - Previous Year][Carried Forward-Amount][Category][Company Fax][Company Name][Company Phone][Company Physical Address][Company Postal Address][Country][Covered End Date][Covered Start Date][Current Balance+Late Fee][Current Balance-Amount][Current Charges-Amount][Current Month Usage][Current Read][Customer ABN][Customer ACN][Customer Address][Customer Company Name][Customer Fax Number][Customer Name / Company Name][Customer Number][Customer Phone (ah)][Customer Phone (bh)][Customer Phone (mobile)][Customer Physical Address][Customer Trading Name][Customer Type][Date of Birth][Discounts][Email Address][Firstname][GST][ICPT (RM 0.0128)][Late Fee][Late Payment Charge][NMI][Next Reading Date (Annual)][Next Reading Date (Montly)][Next Reading Date (Quarterly)][Next Reading Date (Semi-Annual)][Next Scheduled Read Date][Opening Balance][Other Payments Received][POT Discount][POT Discount Rate][POT Reversal][Payments-Amount][PenaltyAmount][PenaltyLabel][Postcode][Previous Balance-Amount][Previous Read][Rebate][Salutation][Secure Deposit-Amount][Service Supply Address][Short Address][Short Address 2][State][Statement Billing Period][Statement Due Date][Statement Issued Date][Statement Number][Statement Seqno][Suburb][Supply Start Date][Surname][Tax Unit][Total GST Applicable][Total Reading][Total Usage][Total Usage Kwh][Unit][Usage GST Applicable][Usage GST Not Applicable][Usage Kwh GST Applicable][Usage Kwh GST Not Applicable][Usage Rebate Amount][Usage Rebate Label][Usage Rebate With GST]";
		Assert.assertEquals(Ex_val_invoice30,Act_val_invoice30);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice31;
	public static String Act_val_invoice31;
	public  void val_invoice_assertion31() throws Exception 
	{
		Ex_val_invoice31=Robj.previewval26().getText();
		Act_val_invoice31="[Gross Charge-Amount][Gross Tax Inc-Amount][Gross Tax-Amount][Rollup Code][Rollup Description][Total Charge-Amount][Total Inc Tax-Amount][Total Tax-Amount]";
		Assert.assertEquals(Ex_val_invoice31,Act_val_invoice31);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice32;
	public static String Act_val_invoice32;
	public  void val_invoice_assertion32() throws Exception 
	{
		Ex_val_invoice32=Robj.previewval26().getText();
		Act_val_invoice32="[/Unit][Bill Days][Charge Description][Covered End Date][Covered Start Date][Current Read][Current Read Date][K Factor][Loss Factor][NMI][Plan Name][Previous Read][Previous Read Date][Quantity][Rate-Amount][Read Type][Reference Number][Rollup Description][Service Number][Service Supply Address][Short Read Type][Special Type][Tariff Code][Tax-Amount][Total Ex Tax-Amount][Total Inc Tax-Amount][Total Tax-Amount][Total Usage][Total-Amount][Unit]";
		Assert.assertEquals(Ex_val_invoice32,Act_val_invoice32);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}	
	//val_invoice
	public static String Ex_val_invoice33;
	public static String Act_val_invoice33;
	public  void val_invoice_assertion33() throws Exception 
	{
		Ex_val_invoice33=Robj.previewval26().getText();
		Act_val_invoice33="[Average Cost-Amount][Average Use][Average Use per Quarter][Covered End Date][Covered Start Date][Current Read][Green Gas][Number of days covered][Previous Read][Price Charge-Amount][Statement Month][Statement Number][Statement Year][Total Reading][Unit][benchmark1][benchmark2][benchmark3][benchmark4][benchmark5][current_read_date][distributor][kFactor][previous_read_date]";
		Assert.assertEquals(Ex_val_invoice33,Act_val_invoice33);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}
	//val_invoice
	public static String Ex_val_invoice34;
	public static String Act_val_invoice34;
	public  void val_invoice_assertion34() throws Exception 
	{
		Ex_val_invoice34=Robj.previewval26().getText();
		Act_val_invoice34="[BPAY Logo][Biller Code][Reference Number]";
		Assert.assertEquals(Ex_val_invoice34,Act_val_invoice34);
		System.out.println("	# Validation == PASS :: Invoice contents are same");
	}			



	//active_your_account_text
	public static  String Ex_active_your_account_text;
	public static  String Act_active_your_account_text;
	public  void active_your_account_text_Validation() throws Exception
	{
		Ex_active_your_account_text="Activate your account";
		Act_active_your_account_text=Robj.active_your_account_text().getText();
		Assert.assertEquals(Act_active_your_account_text,Ex_active_your_account_text);
		System.out.println("	# Validation == PASS :: logout text is present");

	}

	//payment message validation
	public static  String Ex_email_sent_confirmation_message;
	public static  String Act_email_sent_confirmation_message;
	public  void email_sent_confirmation_message_Validation() throws Exception
	{
		Ex_email_sent_confirmation_message="An email has been sent to the registered address to with instructions to continue the registration process.\nPlease click here to go back to Main Page";
		Act_email_sent_confirmation_message=Robj.email_sent_confirmation_message().getText();
		Assert.assertEquals(Act_email_sent_confirmation_message, Ex_email_sent_confirmation_message);
		System.out.println("	# Validation == PASS :: Payment confirmation message is present");

	}

	//Buyer registration text validate
	public static  String Ex_userlist_assertion;
	public static  String Act_userlist_assertion;
	public  void userlist_assertion_Validation() throws Exception
	{
		Ex_userlist_assertion="User List";
		Act_userlist_assertion=Robj.userlist_assertion().getText();
		Assert.assertEquals(Act_userlist_assertion, Ex_userlist_assertion);
		System.out.println("	# Validation == PASS :: Buyer Registration text is present");

	}


	public static  String Ex_permission_text;
	public static  String Act_permission_text;
	public  void permission_text_Validation() throws Exception
	{
		Ex_permission_text="You do not have permission to view that page.";
		Act_permission_text=Robj.permission_text().getText();
		Assert.assertEquals(Act_permission_text, Ex_permission_text);
		System.out.println("	# Validation == PASS :: Buyer Registration text is present");

	}

	public static  String Ex_Start_your_free_trial_by_signing_up;
	public static  String Act_Start_your_free_trial_by_signing_up;
	public  void Start_your_free_trial_by_signing_up_Validation() throws Exception
	{
		Ex_Start_your_free_trial_by_signing_up="Start your free trial by signing up";
		Act_Start_your_free_trial_by_signing_up=Robj.Start_your_free_trial_by_signing_up().getText();
		Assert.assertEquals(Act_Start_your_free_trial_by_signing_up,Ex_Start_your_free_trial_by_signing_up);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");

	}


	public static  String Ex_Overview_text;
	public static  String Act_Overview_text;
	public  void Overview_text_Validation() throws Exception
	{
		Ex_Overview_text="Overview";
		Act_Overview_text=Robj.Overview_text().getText();
		Assert.assertEquals(Act_Overview_text,Ex_Overview_text);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");

	}


	public static  String Ex_sucessfully_saved_customer_message;
	public static  String Act_sucessfully_saved_customer_message;
	public  void sucessfully_saved_customer_message_validation() throws Exception
	{
		Ex_sucessfully_saved_customer_message="Successfully saved customer.";
		Act_sucessfully_saved_customer_message = Robj.sucessfully_saved_customer_message().getText();
		Assert.assertEquals(Act_sucessfully_saved_customer_message,Ex_sucessfully_saved_customer_message);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");

	}


	public static  String Ex_Import_Successful;
	public static  String Act_Import_Successful;
	public  void Import_Successful_validation() throws Exception
	{
		Ex_Import_Successful="Import Successful!";
		Act_Import_Successful=Robj.Import_Successful().getText();
		Assert.assertEquals(Act_Import_Successful,Ex_Import_Successful);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");
	}


	public static  String Ex_water_service_details;
	public static  String Act_water_service_details;
	public  void water_service_details_validation() throws Exception
	{
		Ex_water_service_details="Water Service Details";
		Act_water_service_details=Robj.water_service_details().getText();
		Assert.assertEquals(Act_water_service_details,Ex_water_service_details);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");

	}



	public static  String Ex_service_save_message;
	public static  String Act_service_save_message;
	public  void service_save_message_validation() throws Exception
	{
		Ex_service_save_message="Successfully updated service details.";
		Act_service_save_message=Robj.service_save_message().getText();
		Assert.assertEquals(Act_service_save_message,Ex_service_save_message);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");

	}


	public static  String Ex_water_service_page_header;
	public static  String Act_water_service_page_header;
	public  void water_service_page_header_validation() throws Exception
	{
		Ex_water_service_page_header="New Water Service";
		Act_water_service_page_header = Robj.water_service_page_header().getText();
		Assert.assertEquals(Act_water_service_page_header,Ex_water_service_page_header);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");

	}

	public static  String Ex_change_meter_page_header;
	public static  String Act_change_meter_page_header;
	public  void change_meter_page_header_validation() throws Exception
	{
		Ex_change_meter_page_header="Change Electricity Meter Details";
		Act_change_meter_page_header = Robj.changemeterpage().getText();
		Assert.assertEquals(Act_change_meter_page_header,Ex_change_meter_page_header);
		System.out.println("	# Validation == PASS :: 'Change Electricity Meter Details' page is present");

	}
	public static  String Ex_change_wmeter_page_header;
	public static  String Act_change_wmeter_page_header;
	public  void change_wmeter_page_header_validation() throws Exception
	{
		Ex_change_wmeter_page_header="Change Water Meter Details";
		Act_change_wmeter_page_header = Robj.changemeterpage().getText();
		Assert.assertEquals(Act_change_wmeter_page_header,Ex_change_wmeter_page_header);
		System.out.println("	# Validation == PASS :: 'Change Water Meter Details' page is present");

	}

	public static  String Ex_change_gmeter_page_header;
	public static  String Act_change_gmeter_page_header;
	public  void change_gmeter_page_header_validation() throws Exception
	{
		Ex_change_gmeter_page_header="Change Gas Meter Details";
		Act_change_gmeter_page_header = Robj.changemeterpage().getText();
		Assert.assertEquals(Act_change_gmeter_page_header,Ex_change_gmeter_page_header);
		System.out.println("	# Validation == PASS :: 'Change Gas Meter Details' page is present");

	}
	public static  String Ex_ele_service_page_header;
	public static  String Act_ele_service_page_header;
	public  void Electricity_service_page_header_validation() throws Exception
	{
		Ex_ele_service_page_header= "New Retail Electricity Service";
		Act_ele_service_page_header=Robj.ele_service_page_header().getText();
		Assert.assertEquals(Act_ele_service_page_header,Ex_ele_service_page_header);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");

	}


	public static  String Ex_Gen_service_page_header;
	public static  String Act_Gen_service_page_header;
	public  void Gen_service_page_header_validation() throws Exception
	{
		Ex_Gen_service_page_header= "New Generic Service";
		Act_Gen_service_page_header=Robj.service_page_header().getText();
		Assert.assertEquals(Act_Gen_service_page_header,Ex_Gen_service_page_header);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");

	}
	public static  String Ex_generic_services_header;
	public static  String Act_generic_services_header;
	public  void generic_services_header_validation() throws Exception
	{
		Ex_generic_services_header="New Generic Service";
		Act_generic_services_header=Robj.generic_services_header().getText();
		Assert.assertEquals(Act_generic_services_header,Ex_generic_services_header);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");

	}
	public static  String Ex_utilities_header;
	public static  String Act_utilities_header;
	public  void utilities_header_validation() throws Exception
	{
		Ex_utilities_header="Utilities";
		Act_utilities_header=Robj.utilities_header().getText();
		Assert.assertEquals(Act_utilities_header,Ex_utilities_header);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");

	}

	public static  String Ex_AddMeterReadPopupText;
	public static  String Act_AddMeterReadPopupText;
	public  void AddMeterReadPopupText_validation() throws Exception
	{
		Ex_AddMeterReadPopupText="Add Read";
		Act_AddMeterReadPopupText = Robj.AddMeterReadPopupText().getText() ;
		Assert.assertEquals(Act_AddMeterReadPopupText,Ex_AddMeterReadPopupText);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");

	} 
	public static  String Ex_viewRead_Text;
	public static  String Act_viewRead_Text;
	public  void viewRead_Text_validation() throws Exception
	{
		Ex_viewRead_Text="View Reads";
		Act_viewRead_Text=Robj.viewRead_Text().getText();
		Assert.assertEquals(Act_viewRead_Text,Ex_viewRead_Text);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");
	}
	//bankaccount validation
	public static  String Ex_Transaction_processed_successfully;
	public static  String Act_Transaction_processed_successfully;
	public  void Transaction_processed_successfully_validation() throws Exception
	{
		Ex_Transaction_processed_successfully="Transaction processed successfully.";
		Act_Transaction_processed_successfully=Robj.Transaction_processed_successfullyact().getText();
		Assert.assertEquals(Act_Transaction_processed_successfully,Ex_Transaction_processed_successfully);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");
	} 
	//bankaccount validation
	public static  String Ex_Transaction_processed_successfullybnk;
	public static  String Act_Transaction_processed_successfullybnk;
	public  void Transaction_processed_successfully_validationbnk() throws Exception
	{
		Ex_Transaction_processed_successfullybnk="Bank Account";
		Act_Transaction_processed_successfullybnk=Robj.Transaction_processed_successfully().getText();
		Assert.assertEquals(Act_Transaction_processed_successfullybnk,Ex_Transaction_processed_successfullybnk);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");
	} 
	//cash validation	
	public static  String Ex_Transaction_processed_successfullycash;
	public static  String Act_Transaction_processed_successfullycash;
	public  void Transaction_processed_successfully_validationcash() throws Exception
	{
		Ex_Transaction_processed_successfullycash="Cash";
		Act_Transaction_processed_successfullycash=Robj.Transaction_processed_successfully().getText();
		Assert.assertEquals(Act_Transaction_processed_successfullycash,Ex_Transaction_processed_successfullycash);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");

	} 
	//cheque validation	
	public static  String Ex_Transaction_processed_successfullychk;
	public static  String Act_Transaction_processed_successfullychk;
	public  void Transaction_processed_successfully_validationchk() throws Exception
	{
		Ex_Transaction_processed_successfullychk="Cheque";
		Act_Transaction_processed_successfullychk=Robj.Transaction_processed_successfully().getText();
		Assert.assertEquals(Act_Transaction_processed_successfullychk,Ex_Transaction_processed_successfullychk);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");

	} 
	//creditcard validation
	public static  String Ex_Transaction_processed_successfullycc;
	public static  String Act_Transaction_processed_successfullycc;
	public  void Transaction_processed_successfully_validationcc() throws Exception
	{
		Ex_Transaction_processed_successfullycc="Credit Card";
		Act_Transaction_processed_successfullycc=Robj.Transaction_processed_successfully().getText();
		Assert.assertEquals(Act_Transaction_processed_successfullycc,Ex_Transaction_processed_successfullycc);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");

	} 
	//Others validation
	public static  String Ex_Transaction_processed_successfullyothers;
	public static  String Act_Transaction_processed_successfullyothers;
	public  void Transaction_processed_successfully_validationothers() throws Exception
	{
		Ex_Transaction_processed_successfullyothers="Others";
		Act_Transaction_processed_successfullyothers=Robj.Transaction_processed_successfully().getText();
		Assert.assertEquals(Act_Transaction_processed_successfullyothers,Ex_Transaction_processed_successfullyothers);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");
	} 
	//security deposit deposite
	public static  String Ex_Transaction_processed_successfullysecdeposit;
	public static  String Act_Transaction_processed_successfullysecdeposit;
	public  void Transaction_processed_successfully_validationsecdeposit() throws Exception
	{
		Ex_Transaction_processed_successfullysecdeposit="PhoneDirect";
		Act_Transaction_processed_successfullysecdeposit=Robj.Transaction_processed_successfully().getText();
		Assert.assertEquals(Act_Transaction_processed_successfullysecdeposit,Ex_Transaction_processed_successfullysecdeposit);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");
	} 	
	//security deposit returnedsec
	public static  String Ex_Transaction_processed_successfullyreturnedsec;
	public static  String Act_Transaction_processed_successfullyreturnedsec;
	public  void Transaction_processed_successfully_validationreturnedsec() throws Exception
	{
		Ex_Transaction_processed_successfullyreturnedsec="";
		Act_Transaction_processed_successfullyreturnedsec=Robj.Transaction_processed_successfully().getText();
		Assert.assertEquals(Act_Transaction_processed_successfullyreturnedsec,Ex_Transaction_processed_successfullyreturnedsec);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");
	} 	
	//security deposit transfer
	public static  String Ex_Transaction_processed_successfullytransfer;
	public static  String Act_Transaction_processed_successfullytransfer;
	public  void Transaction_processed_successfully_validationtransfer() throws Exception
	{
		Ex_Transaction_processed_successfullytransfer="";
		Act_Transaction_processed_successfullytransfer=Robj.Transaction_processed_successfully().getText();
		Assert.assertEquals(Act_Transaction_processed_successfullytransfer,Ex_Transaction_processed_successfullytransfer);
		System.out.println("	# Validation == PASS :: Wrong email validation is present");
	} 	
	//RatePlansPage_Title_assertion
	public static  String Ex_RatePlansPage_Title;
	public static  String Act_RatePlansPage_Title;
	public  void RatePlansPage_Title_assertion() throws Exception 
	{
		Ex_RatePlansPage_Title="Rate Plans";
		Act_RatePlansPage_Title= Robj.RatePlansPage_Title().getText() ;
		Assert.assertEquals(Act_RatePlansPage_Title, Ex_RatePlansPage_Title);
		System.out.println("	# Validation == PASS :: Please login text is present");

	}

	//Plan_ID
	public static  String Ex_Plan_ID;
	public static  String Act_Plan_ID;
	public  void Plan_ID() throws Exception 
	{
		Ex_Plan_ID="autogenerated";
		Act_Plan_ID= Robj.plan_created().getText() ;
		Assert.assertEquals(Act_Plan_ID, Ex_Plan_ID);
		System.out.println("	# Validation == PASS :: 'Auto Generated Gas plan is available");

	}

	//planpopupheader_assertion
	public static  String Ex_planpopupheader;
	public static  String Act_planpopupheader;
	public  void planpopupheader_assertion() throws Exception 
	{
		Ex_planpopupheader="Rate Plan";
		Act_planpopupheader=Robj.planpopupheader().getText();
		Assert.assertEquals(Act_planpopupheader, Ex_planpopupheader);
		System.out.println("	# Validation == PASS :: Please login text is present");

	}

	//smtpPageTitle_assertion
	public static  String Ex_smtpPageTitle;
	public static  String Act_smtpPageTitle;
	public  void smtpPageTitle_assertion() throws Exception 
	{
		Ex_smtpPageTitle="SMTP Information";
		Act_smtpPageTitle=Robj.smtpPageTitle().getText();
		Assert.assertEquals(Act_smtpPageTitle, Ex_smtpPageTitle);
		System.out.println("	# Validation == PASS :: Please login text is present");

	}


	//SMTPSucessfullMessage_assertion
	public static  String Ex_SMTPSucessfullMessage;
	public static  String Act_SMTPSucessfullMessage;
	public  void SMTPSucessfullMessage_assertion() throws Exception 
	{
		Ex_SMTPSucessfullMessage="SMTP server is successfully updated.";
		Act_SMTPSucessfullMessage=Robj.SMTPSucessfullMessage().getText();
		Assert.assertEquals(Act_SMTPSucessfullMessage, Ex_SMTPSucessfullMessage);
		System.out.println("	# Validation == PASS :: Please login text is present");

	}
	//templateEmailsucessfulMessage_assertion
	public static  String Ex_templateEmailsucessfulMessage;
	public static  String Act_templateEmailsucessfulMessage;
	public  void templateEmailsucessfulMessage_assertion() throws Exception 
	{
		Ex_templateEmailsucessfulMessage="Successfully saved message.";
		Act_templateEmailsucessfulMessage=Robj.templateEmailsucessfulMessage().getText();
		Assert.assertEquals(Act_templateEmailsucessfulMessage, Ex_templateEmailsucessfulMessage);
		System.out.println("	# Validation == PASS :: Please login text is present");

	}
	//templateSMSsucessfulmessage_assertion
	public static  String Ex_templateSMSsucessfulmessage;
	public static  String Act_templateSMSsucessfulmessage;
	public  void templateSMSsucessfulmessage_assertion() throws Exception 
	{
		Ex_templateSMSsucessfulmessage="Successfully saved message.";
		Act_templateSMSsucessfulmessage=Robj.templateSMSsucessfulmessage().getText();
		Assert.assertEquals(Act_templateSMSsucessfulmessage, Ex_templateSMSsucessfulmessage);
		System.out.println("	# Validation == PASS :: Please login text is present");

	}


	//accounttypetextUnderDetailsCustomerMenu_assertion
	public static  String Ex_accounttypetextUnderDetailsCustomerMenu;
	public static  String Act_accounttypetextUnderDetailsCustomerMenu;
	public  void accounttypetextUnderDetailsCustomerMenu_assertion() throws Exception 
	{
		Ex_accounttypetextUnderDetailsCustomerMenu="Account Type";
		Act_accounttypetextUnderDetailsCustomerMenu=Robj.accounttypetextUnderDetailsCustomerMenu().getText();
		Assert.assertEquals(Act_accounttypetextUnderDetailsCustomerMenu, Ex_accounttypetextUnderDetailsCustomerMenu);
		System.out.println("	# Validation == PASS :: Please login text is present");

	}

	//Invoice_setup_updated

	//invoicefirstpage_assertion
	public static  String Ex_updatedinvoicefirstpage;
	public static  String Act_updatedinvoicefirstpage;
	public  void updatedinvoicefirstpageassertion() throws Exception 
	{
		Ex_updatedinvoicefirstpage="Billing Details";
		Act_updatedinvoicefirstpage=Robj.updatedinvoiceheader().getText();
		Assert.assertEquals(Act_updatedinvoicefirstpage, Ex_updatedinvoicefirstpage);
		System.out.println(" invoic first page assertion pass.");

	}

	//successmsg_assertion
	public static  String Ex_successmsg;
	public static  String Act_successmsg;
	public  void successmsg() throws Exception 
	{
		Ex_successmsg="Changes have been updated successfully.";
		Act_successmsg=Robj.assertionmsg().getText();
		Assert.assertEquals(Act_updatedinvoicefirstpage, Ex_updatedinvoicefirstpage);
		System.out.println(" invoice first page assertion pass.");

	}


	//admin_editpage_invoice_assertion
	public static  String Ex_edit_invoice_primary_front;
	public static  String Act_edit_invoice_primary_front;
	public  void edit_invoice_primary_front() throws Exception 
	{
		Ex_edit_invoice_primary_front="---";
		Select select1 = new Select(Robj.primary_front());
		String abc = select1.getFirstSelectedOption().getText();
		System.out.println(abc);
		Act_edit_invoice_primary_front=select1.getFirstSelectedOption().getText();
		Assert.assertNotEquals(Act_edit_invoice_primary_front, Ex_edit_invoice_primary_front);
		System.out.println(" Edit page primary front invoice assertion pass.");

	}	

	//admin_editpage_invoice_assertion
	public static  String Ex_edit_invoice_primary_back;
	public static  String Act_edit_invoice_primary_back;
	public  void edit_invoice_primary_back() throws Exception 
	{
		Ex_edit_invoice_primary_back="---";
		Select select2 = new Select(Robj.primary_back());
		String abc = select2.getFirstSelectedOption().getText();
		System.out.println(abc);
		Act_edit_invoice_primary_back=select2.getFirstSelectedOption().getText();
		Assert.assertNotEquals(Act_edit_invoice_primary_back, Ex_edit_invoice_primary_back);
		System.out.println(" Edit page primary back invoice assertion pass.");

	}	

	//admin_editpage_invoice_assertion
	public static  String Ex_edit_invoice_secondary_font;
	public static  String Act_edit_invoice_secondary_font;
	public  void edit_invoice_secondary_font() throws Exception 
	{
		Ex_edit_invoice_secondary_font="---";
		Select select3 = new Select(Robj.secondary_front());
		String abc = select3.getFirstSelectedOption().getText();
		System.out.println(abc);
		Act_edit_invoice_secondary_font=select3.getFirstSelectedOption().getText();
		Assert.assertNotEquals(Act_edit_invoice_secondary_font, Ex_edit_invoice_secondary_font);
		System.out.println(" Edit page 3rd invoice assertion pass.");

	}


	//admin_editpage_invoice_assertion
	public static  String Ex_edit_invoice_secondary_back;
	public static  String Act_edit_invoice_secondary_back;
	public  void edit_invoice_secondary_back() throws Exception 
	{
		Ex_edit_invoice_secondary_back="---";
		Select select4 = new Select(Robj.secondary_back());
		String abc = select4.getFirstSelectedOption().getText();
		System.out.println(abc);
		Act_edit_invoice_secondary_back=select4.getFirstSelectedOption().getText();
		Assert.assertNotEquals(Act_edit_invoice_secondary_back, Ex_edit_invoice_secondary_back);
		System.out.println(" Edit page secondary back invoice assertion pass.");

	}





	//////reminder section yellow belt

	//reminderpage_assertion
	public static  String Ex_reminderpage;
	public static  String Act_reminderpage;
	public  void reminderpage() throws Exception 
	{
		Ex_reminderpage="Reminders";
		Act_reminderpage=Robj.reminderassert().getText();
		Assert.assertEquals(Act_reminderpage, Ex_reminderpage);
		System.out.println(" Reminder page assertion pass.");

	}
	public static  String Ex_reminderemail;
	public static  String Act_reminderemail;
	public  void reminderemail() throws Exception 
	{
		Ex_reminderemail="Norve Mark";
		Act_reminderemail=Robj.emailassert().getText();
		Assert.assertEquals(Act_reminderemail, Ex_reminderemail);
		System.out.println(" Reminder popup email assertion pass.");

	}

	public static  String Ex_gas_service;
	public static  String Act_gas_service;
	public  void gas_service() throws Exception 
	{
		Ex_gas_service="New Gas Service";
		Act_gas_service=Robj.gas_service_page().getText();
		Assert.assertEquals(Act_gas_service, Ex_gas_service);
		System.out.println("New Gas Service Page assertion pass.");

	}

	public static  String Ex_detailpageaddress;
	public static  String Act_detailpageaddress;
	public  void detailpageaddress() throws Exception 
	{
		Ex_detailpageaddress="Calle Ocho Miami, FL";
		Act_detailpageaddress=Robj.detailpageaddress().getText();
		Assert.assertEquals(Act_detailpageaddress, Ex_detailpageaddress);
		System.out.println("Customer Detail page address assertion pass.");

	}

	public static  String Ex_lyfsprtalrt;
	public static  String Act_lyfsprtalrt;
	public  void lyfsprtalrt() throws Exception 
	{
		Ex_lyfsprtalrt="LIFE SUPPORT ALERT";
		Act_lyfsprtalrt=Robj.lyfsprtalrt().getText();
		Assert.assertEquals(Act_lyfsprtalrt, Ex_lyfsprtalrt);
		System.out.println("Life Support Alert icon assertion pass.");

	}

	public static  String Ex_lifesupportcontact;
	public static  String Act_lifesupportcontact;
	public  void lifesupportcontact() throws Exception 
	{
		Ex_lifesupportcontact="Life Support";// 1 dec win energy url change  "Life Support" to "Changes" 
		Act_lifesupportcontact=Robj.lifesupportcontact().getText();
		Assert.assertEquals(Act_lifesupportcontact, Ex_lifesupportcontact);
		System.out.println("Life Support contect assertion pass.");
	}
	public static  String Ex_reportsname;
	public static  String Act_reportsname;
	public  void reportsname() throws Exception 
	{
		Ex_reportsname="Reports";
		Act_reportsname=Robj.reportsname().getText();
		Assert.assertEquals(Act_reportsname, Ex_reportsname);
		System.out.println("Reports page assertion pass.");
	}

	public static  String Ex_meterspage;
	public static  String Act_meterspage;
	public  void meterspage() throws Exception 
	{
		Ex_meterspage="Meter, Reading, Taps Reports";
		Act_meterspage=Robj.meterspage().getText();
		Assert.assertEquals(Act_meterspage, Ex_meterspage);
		System.out.println("Meters Reports page assertion pass.");

	}

	public static  String Ex_financialpage;
	public static  String Act_financialpage;
	public  void financialpage() throws Exception 
	{
		Ex_financialpage="Financial Reports";
		Act_financialpage=Robj.financialpage().getText();
		Assert.assertEquals(Act_financialpage, Ex_financialpage);
		System.out.println("Financial Reports page assertion pass.");

	}

	public static  String Ex_rateplanpage;
	public static  String Act_rateplanpage;
	public  void rateplanpage() throws Exception 
	{
		Ex_rateplanpage="REPORT TOTALS";
		Act_rateplanpage=Robj.rateplanpage().getText();
		Assert.assertEquals(Act_rateplanpage, Ex_rateplanpage);
		System.out.println("REPORT TOTALS on Financial Reports page assertion pass.");

	}

	public static  String Ex_bsrassert;
	public static  String Act_bsrassert;
	public  void bsrassert() throws Exception 
	{
		Ex_bsrassert="Consumption Billed";
		Act_bsrassert=Robj.bsrassert().getText();
		Assert.assertEquals(Act_bsrassert, Ex_bsrassert);
		System.out.println("REPORT TOTALS on Financial Reports page assertion pass.");

	}

	public static  String Ex_statementpage;
	public static  String Act_statementpage;
	public  void statementpage() throws Exception 
	{
		Ex_statementpage="Statement Reports";
		Act_statementpage=Robj.statementpage().getText();
		Assert.assertEquals(Act_statementpage, Ex_statementpage);
		System.out.println("Statement Reports page assertion pass.");

	}

	public static  String Ex_mucblpage;
	public static  String Act_mucblpage;
	public  void mucblpage() throws Exception 
	{
		Ex_mucblpage="Meter Usage and Charges By Leasee";
		Act_mucblpage=Robj.mucblpage().getText();
		Assert.assertEquals(Act_mucblpage, Ex_mucblpage);
		System.out.println("Meter Usage and Charges By Leasee report page assertion pass.");

	}

	public static  String Ex_compnamemucbc;
	public static  String Act_compnamemucbc;
	public  void compnamemucbc() throws Exception 
	{
		Ex_compnamemucbc="Company Name";
		Act_compnamemucbc=Robj.compnamemucbc().getText();
		Assert.assertEquals(Act_compnamemucbc, Ex_compnamemucbc);
		System.out.println("Company name on Meter Usage and Charges By Customer report assertion pass.");

	}

	public static  String Ex_customerreportassert;
	public static  String Act_customerreportassert;
	public  void customerreportassert() throws Exception 
	{
		Ex_customerreportassert="Customer Reports";
		Act_customerreportassert=Robj.customerreportassert().getText();
		Assert.assertEquals(Act_customerreportassert, Ex_customerreportassert);
		System.out.println("Customer report assertion pass.");

	}

	public static  String Ex_moveinmoveoutassert;
	public static  String Act_moveinmoveoutassert;
	public  void moveinmoveoutassert() throws Exception 
	{
		Ex_moveinmoveoutassert="Move in-Move Out Report";
		Act_moveinmoveoutassert=Robj.moveinmoveoutassert().getText();
		Assert.assertEquals(Act_moveinmoveoutassert, Ex_moveinmoveoutassert);
		System.out.println("move in move out page assertion pass.");

	}

	public static  String Ex_portalmeterdetail;
	public static  String Act_portalmeterdetail;
	public  void portalmeterdetail() throws Exception 
	{
		Ex_portalmeterdetail="Meter Details";
		Act_portalmeterdetail=Robj.portalmeterdetail().getText();
		Assert.assertEquals(Act_portalmeterdetail, Ex_portalmeterdetail);
		System.out.println("Meter Details page on customer portal assertion pass.");

	}

	public static  String Ex_pipageinportal;
	public static  String Act_pipageinportal;
	public  void pipageinportal() throws Exception 
	{
		Ex_pipageinportal="Personal Information";
		Act_pipageinportal=Robj.pipageinportal().getText();
		Assert.assertEquals(Act_pipageinportal, Ex_pipageinportal);
		System.out.println("Personal Information page on customer portal assertion pass.");

	}

	public static  String Ex_pisavemessage;
	public static  String Act_pisavemessage;
	public  void pisavemessage() throws Exception 
	{
		Ex_pisavemessage="Success!";
		Act_pisavemessage=Robj.pisavemessage().getText();
		Assert.assertEquals(Act_pisavemessage, Ex_pisavemessage);
		System.out.println("'Success message under customer portal assertion pass.");

	}

	public static  String Ex_successmessageonservice;
	public static  String Act_successmessageonservice;
	public  void successmessageonservice() throws Exception 
	{
		Ex_successmessageonservice="Success!";
		Act_successmessageonservice=Robj.successmessageonservice().getText();
		Assert.assertEquals(Act_successmessageonservice, Ex_successmessageonservice);
		System.out.println("'Success' message under under 'Service Settings' tab of customer portal assertion pass.");

	}

	public static  String Ex_servicesettingstab;
	public static  String Act_servicesettingstab;
	public  void servicesettingstab() throws Exception 
	{
		Ex_servicesettingstab="Bill Options";
		Act_servicesettingstab=Robj.servicesettingstab().getText();
		Assert.assertEquals(Act_servicesettingstab, Ex_servicesettingstab);
		System.out.println("'Service Settings' tab of customer portal assertion pass.");

	}

	public static  String Ex_currencysettings;
	public static  String Act_currencysettings;
	public  void currencysettings() throws Exception 
	{
		Ex_currencysettings="Currency Settings";
		Act_currencysettings=Robj.currencysettings().getText();
		Assert.assertEquals(Act_currencysettings, Ex_currencysettings);
		System.out.println("'Currency Settings' page header assertion pass.");

	}

	public static  String Ex_localepage;
	public static  String Act_localepage;
	public  void localepage() throws Exception 
	{
		Ex_localepage="Successfully saved changes.";
		Act_localepage=Robj.localepage().getText();
		Assert.assertEquals(Act_localepage, Ex_localepage);
		System.out.println("'Locale Settings' page confirmation message assertion pass.");
	}

	public static  String Ex_workflow_page;
	public static  String Act_workflow_page;
	public  void workflow_page() throws Exception 
	{
		Ex_workflow_page="Workflow Types";
		Act_workflow_page=Robj.workflow_page().getText();
		Assert.assertEquals(Act_workflow_page, Ex_workflow_page);
		System.out.println("'workflow page' assertion pass.");
	}

	public static  String Ex_addnewlogtypepopup;
	public static  String Act_addnewlogtypepopup;
	public  void addnewlogtypepopup() throws Exception 
	{
		Ex_addnewlogtypepopup="Add New Log Type";
		Act_addnewlogtypepopup=Robj.addnewlogtypepopup().getText();
		Assert.assertEquals(Act_addnewlogtypepopup, Ex_addnewlogtypepopup);
		System.out.println("'New Log Type' pop up assertion pass.");
	}

	public static  String Ex_userdetailspage;
	public static  String Act_userdetailspage;
	public  void userdetailspage() throws Exception 
	{
		Ex_userdetailspage="User Details";
		Act_userdetailspage=Robj.userdetailspage().getText();
		Assert.assertEquals(Act_userdetailspage, Ex_userdetailspage);
		System.out.println("'User Details' page assertion pass.");
	}

	public static  String Ex_newcontactlogpage;
	public static  String Act_newcontactlogpage;
	public  void newcontactlogpage() throws Exception 
	{
		Ex_newcontactlogpage="Create New Contact Log";
		Act_newcontactlogpage=Robj.newcontactlogpage().getText();
		Assert.assertEquals(Act_newcontactlogpage, Ex_newcontactlogpage);
		System.out.println("'Create New Contact Log' page assertion pass.");
	}

	public static  String Ex_assertstatus;
	public static  String Act_assertstatus;
	public  void assertstatus() throws Exception 
	{
		Ex_assertstatus="Closed";
		Act_assertstatus=Robj.assertstatus().getText();
		Assert.assertEquals(Act_assertstatus, Ex_assertstatus);
		System.out.println("'Contact Log' page 'Closed' status assertion pass.");
	}

	public static  String Ex_transactionpayment;
	public static  String Act_transactionpayment;
	public  void transactionpayment() throws Exception 
	{
		Ex_transactionpayment="Credit Card";
		Thread.sleep(1000);
		Act_transactionpayment=Robj.transactionpayment().getText();
		Assert.assertEquals(Act_transactionpayment, Ex_transactionpayment);
		System.out.println("'Transaction History' page assertion pass.");
	}

	public static  String Ex_assertdeposit;
	public static  String Act_assertdeposit;
	public  void assertdeposit() throws Exception 
	{
		Ex_assertdeposit="Deposit Added";
		Act_assertdeposit=Robj.assertdeposit().getText();
		Assert.assertEquals(Act_assertdeposit, Ex_assertdeposit);
		System.out.println("'Security Deposite History' page assertion pass.");
	}

	public static  String Ex_noofcustomers;
	public static  String Act_noofcustomers;
	public  void noofcustomers() throws Exception 
	{
		Ex_noofcustomers="1";
		Act_noofcustomers=Robj.noofcustomers().getText();
		Assert.assertEquals(Act_noofcustomers, Ex_noofcustomers);
		System.out.println("'No of customers' column on 'Bill Run Cycles' page assertion pass.");
	}

	//////////////////////////////////////////////////////////////////////////////////////////

	//add Vinod

	public static  String Ex_assertsavepenalty;
	public static  String Act_assertsavepenalty;
	public  void assertsavepenalty() throws Exception 
	{
		Ex_assertsavepenalty="Successfully added new penalty.";
		Act_assertsavepenalty=Robj.assertsavepenalty().getText();
		Assert.assertEquals(Act_assertsavepenalty, Ex_assertsavepenalty);
		System.out.println("'Save Penenalty page assertion pass.");
	}
	//assert update save penalty	
	public static  String Ex_assertupdatesavepenalty;
	public static  String Act_assertupdatesavepenalty;
	public  void assertupdatesavepenalty() throws Exception 
	{
		Ex_assertsavepenalty="Successfully updated the Penalty with ID ="+"pID";
		Act_assertsavepenalty=Robj.assertupdatesavepenalty().getText();
		Assert.assertEquals(Act_assertupdatesavepenalty, Ex_assertupdatesavepenalty);
		System.out.println("Successfully updated the Penalty assertion pass.");
	}	
	//Assertion on Save Batch Name
	public static  String Ex_assertbatchno;
	public static  String Act_assertbatchno;
	public  void assertionsavebatchno() throws Exception 
	{
		Ex_assertsavepenalty="Batchno";
		Act_assertsavepenalty=Robj.assertionsavebatchno().getText();
		Assert.assertEquals(Act_assertbatchno, Ex_assertbatchno);
		System.out.println("Batch number assertion pass.");
	}

	//Assertion on Outbox 
	public static  String Ex_assertoutbox;
	public static  String Act_assertoutbox;
	public  void assertionoutbox() throws Exception 
	{
		Ex_assertsavepenalty="Outbox Items";
		Act_assertsavepenalty=Robj.assertionoutbox().getText();
		Assert.assertEquals(Act_assertoutbox, Ex_assertoutbox);
		System.out.println("'Outbox' page assertion pass.");
	}
	//Assertion on record under Communication same as Outbox list
	public static  String Ex_assertrecordundercommunication;
	public static  String Act_assertrecordundercommunication;
	public  void assertionrecordCUMMN() throws Exception 
	{
		String stno=driver.findElement(By.xpath(".//*[@id='outboxTable']/tbody/tr[1]/td[4]")).getText();
		Ex_assertrecordundercommunication=stno;
		Act_assertrecordundercommunication=Robj.assertionrecordCUMMN().getText();
		Assert.assertEquals(Act_assertrecordundercommunication, Ex_assertrecordundercommunication);
		System.out.println("'Satetment number show under communication page assertion pass.");
	}

	//Assrtionrecordsearch()

	public static  String Ex_Assertrecordsearch;
	public static  String Act_Assertrecordsearch;
	public  void Assrtionrecordsearch() throws Exception 
	{
		Ex_Assertrecordsearch="title";
		Act_Assertrecordsearch=Robj.Assrtionrecordsearch().getText();
		Assert.assertEquals(Act_Assertrecordsearch, Ex_Assertrecordsearch);
		System.out.println("'Record  title show under site assertion pass.");
	}

	// Assertion on Gas Statement and Usage Graph  
	public static  String Ex_AssertGraphPlaceHolder;
	public static  String Act_AssertGraphPlaceHolder;
	public  void AssertGasGraphPlaceHolder() throws Exception 
	{
		Ex_AssertGraphPlaceHolder="[GRAPH-IMAGE]";
		Act_AssertGraphPlaceHolder=Robj.AssertGasGraphPlaceHolder().getText();
		Assert.assertEquals(Act_AssertGraphPlaceHolder, Ex_AssertGraphPlaceHolder);
		System.out.println("Graph_Impages Place holder  assertion pass.");
	}
	// Assertion on Carbon Graph Placeholder	
	public static  String Ex_AssertCarbonGraph;
	public static  String Act_AssertCarbonGraph;
	public  void AssertCarbonGraphPlaceHolder() throws Exception 
	{
		Ex_AssertCarbonGraph="[CARBON-GRAPH-IMAGE]";
		Act_AssertCarbonGraph=Robj.AssertCarbonGraphPlaceHolder().getText();
		Assert.assertEquals(Act_AssertCarbonGraph, Ex_AssertCarbonGraph);
		System.out.println("Carbon_Graph_Impages Place holder  assertion pass.");
	}		
	//[WATER-GRAPH-IMAGE]	
	public static  String Ex_AssertwaterGraph;
	public static  String Act_AssertwaterGraph;
	public  void AssertWaterGraphPlaceHolder() throws Exception 
	{
		Ex_AssertwaterGraph="[WATER-GRAPH-IMAGE]";
		Act_AssertwaterGraph=Robj.AssertWaterGraphPlaceHolder().getText();
		Assert.assertEquals(Act_AssertwaterGraph, Ex_AssertwaterGraph);
		System.out.println("Water_Graph_Impages Place holder  assertion pass.");
	}	

	//AssertElecGraphPlaceHolder
	public static  String Ex_AssertElecGraph;
	public static  String Act_AssertElecGraph;
	public  void AssertElecGraphPlaceHolder() throws Exception 
	{
		Ex_AssertElecGraph="[ELECTRICITY-GRAPH-IMAGE]";
		Act_AssertElecGraph=Robj.AssertElecGraphPlaceHolder().getText();
		Assert.assertEquals(Act_AssertElecGraph, Ex_AssertElecGraph);
		System.out.println("Electricity_Graph_Impages Place holder  assertion pass.");
	}	

	//Assert Transction History
	public static  String Ex_TransHistrySection;
	public static  String Act_TransHistrySection;
	public  void AssertTransactionHistory() throws Exception 
	{
		Ex_TransHistrySection="Transaction History";
		Act_TransHistrySection=Robj.AssertTransactionHistory().getText();
		Assert.assertEquals(Act_TransHistrySection, Ex_TransHistrySection);
		System.out.println("Transection history section is displayed assertion pass.");
	}	
	//Check CurrentBalance After outstanding balance 
	//Assert Transction History
	public static  String Ex_currentbalance;
	public static  String Act_currentbalance;
	public  void Assertcurrentbalance() throws Exception 
	{
		Ex_currentbalance="0.00";
		Act_currentbalance=Robj.Assertcurrentbalance().getText();
		Assert.assertEquals(Act_TransHistrySection, Ex_currentbalance);
		System.out.println("Transection history section is displayed assertion pass.");
	}
	public static  String Ex_Statements_text;
	public static  String Act_Statements_text;
	public  void Statements_text_Validation() throws Exception
	{
		Ex_Statements_text="Statements";
		Act_Statements_text=Robj.Statements_text_Validation().getText();
		Assert.assertEquals(Act_Statements_text,Ex_Statements_text);
		System.out.println("	# Validation == PASS ::Statements tab is present");
	}
	//Confirm Statement Rollback
	//.//*[contains(text(),'Confirm Statement Rollback')]
	public static  String Ex_rollbackconfirm;
	public static  String Act_rollbackconfirm;
	public  void rollbackconfirmpopup() throws Exception
	{
		Ex_rollbackconfirm="Confirm Statement Rollback";
		Act_Statements_text=Robj.rollbackconfirmpopup().getText();
		Assert.assertEquals(Act_Statements_text,Ex_rollbackconfirm);
		System.out.println("# Validation == PASS :: 'Confirm Statement Rollback' text validation is present");
	}

	//Rollback Hosry unde 'View rollback History' 
	public static  String Ex_rollbackrecord;
	public static  String Act_rollbackrecord;
	public  void rollbackrecord() throws Exception
	{
		Ex_rollbackrecord= "Stmt No";
		Act_rollbackrecord=Robj.rollbackrecord().getText();
		Assert.assertEquals(Act_rollbackrecord,Ex_rollbackrecord);
		System.out.println("# Validation == PASS :: 'Confirm Statement Rollback' record validation is present");
	}

	//Rollback Hosry unde 'View rollback History' 
	public static  String Ex_rebillingempty;
	public static  String Act_rebillingempty;
	public  void rebillingempty() throws Exception
	{
		Ex_rebillingempty="";
		Act_rebillingempty=Robj.rebillingempty().getText();
		Assert.assertEquals(Act_rebillingempty,Ex_rebillingempty);
		System.out.println("# Validation == PASS :: 'Rebilling date' validation is present");
	}
	//Rollback Hosry unde 'View rollback History' 
	public static  String Ex_stmtnoempty;
	public static  String Act_stmtnoempty;
	public  void stmtnoempty() throws Exception
	{
		Ex_stmtnoempty="";
		Act_stmtnoempty=Robj.stmtnoempty().getText();
		Assert.assertEquals(Act_stmtnoempty,Ex_stmtnoempty);
		System.out.println("# Validation == PASS :: 'Stmt No.' record validation is present");
	}
	//rebillingpopupvalidation	
	//Rollback Hosry unde 'View rollback History' 
	public static  String Ex_rebillingpopup;
	public static  String Act_rebillingpopup;
	public  void rebillingpopupvalidation() throws Exception
	{
		Statements=driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText();
		Ex_rebillingpopup="You are rebilling statement # "+Statements;
		Act_rebillingpopup=Robj.rebillingpopupvalidation().getText();
		Assert.assertEquals(Act_rebillingpopup,Ex_rebillingpopup);
		System.out.println("# Validation == PASS :: 'Stmt No.' record validation is present");
	}


	//Rollback Hosry unde 'View rollback History' 
	public static  String Ex_newstmtnocheck;
	public static  String Act_newstmtnocheck;
	public  void Newstmtnocheck() throws Exception
	{
		Statements1=driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[1]")).getText();
		Ex_newstmtnocheck= Statements1;
		Act_newstmtnocheck=Robj.Newstmtnocheck().getText();
		Assert.assertEquals(Act_newstmtnocheck,Ex_newstmtnocheck);
		System.out.println("# Validation == PASS :: 'New Stmt No.' record validation is present");
	}	

	// verifiy that Gas plan Avialable under rate plan
	public static  String Ex_gasplan;
	public static  String Act_gasplan;
	public  void GasPlan() throws Exception
	{
		Ex_gasplan= "Gas Flat Template Plan";
		Act_gasplan=Robj.Gasplan().getText();
		Assert.assertEquals(Act_gasplan,Ex_gasplan);
		System.out.println("# Validation == PASS :: Gass Plan record validation is present");
	}	

	// verifiy that Electricity Peak/Off Peak/Shoulder Template Plan(Electricity Plan Avialable under rate plan
	public static  String Ex_peak_ofpeak_Elec1;
	public static  String Act_peak_ofpeak_Elec1;
	public  void peak_ofpeak_Elec1() throws Exception
	{
		Ex_peak_ofpeak_Elec1= "Electricity Peak/Off Peak/Shoulder Template Plan";
		Act_peak_ofpeak_Elec1=Robj.peak_ofpeak_Elec1().getText();
		Assert.assertEquals(Act_peak_ofpeak_Elec1,Ex_peak_ofpeak_Elec1);
		System.out.println("# Validation == PASS :: first Electricity plan record validation is present");
	}		

	// verifiy that Electricity  Template Plan(Electricity Plan Avialable under rate plan
	public static  String Ex_ElectricityPlan_Elec2;
	public static  String Act_ElectricityPlan_Elec2;
	public  void ElectricityPlan_Elec2() throws Exception
	{
		Ex_ElectricityPlan_Elec2= "Electricity Flat Template Plan";
		Act_ElectricityPlan_Elec2=Robj.ElectricityPlan_Elec2().getText();
		Assert.assertEquals(Act_ElectricityPlan_Elec2,Ex_ElectricityPlan_Elec2);
		System.out.println("# Validation == PASS :: first Electricity plan record validation is present");
	}

	// verifiy that Electricity  Template Plan(Electricity Plan Avialable under rate plan
	public static  String Ex_waterplan;
	public static  String Act_waterplan;
	public  void waterplan() throws Exception
	{
		Ex_waterplan= "Water Flat Template Plan";
		Act_waterplan=Robj.waterplan().getText();
		Assert.assertEquals(Act_waterplan,Ex_waterplan);
		System.out.println("# Validation == PASS :: first Electricity plan record validation is present");
	}	

	// verifiy that Electricity  Template Plan(Electricity Plan Avialable under rate plan
	public static  String Ex_remindersChanges;
	public static  String Act_remindersChanges;
	public  void ChangesReminder() throws Exception
	{
		Statements2=driver.findElement(By.xpath("html/body/div[5]/div[1]/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/input")).getText();
		Ex_remindersChanges= "1";
		Act_remindersChanges=Robj.ChangesReminder().getText();
		Assert.assertEquals(Act_remindersChanges,Ex_remindersChanges);
		System.out.println("# Validation == PASS :: first Electricity plan record validation is present");
	}	

	public static  String Ex_CustomenrCount;
	public static  String Act_CustomenrCount;
	public  void CustomenrZero() throws Exception
	{
		Ex_CustomenrCount= "0";
		Act_CustomenrCount=Robj.CustomenrCountisZero().getText();
		Assert.assertEquals(Act_CustomenrCount,Ex_CustomenrCount);
		System.out.println("# Validation == PASS :: first Electricity plan record validation is present");
	}		
	// AddNewBucket_Popup_TItle
	public static  String Ex_AddNewBucketPopup;
	public static  String Act_AddNewBucketPopup;
	public  void Validate_AddNewBucketPopupTitle() throws Exception
	{
		Ex_AddNewBucketPopup= "Add New Allocation / Bucket";
		Act_AddNewBucketPopup=Robj.AddNewBucket_Popup_TItle().getText();
		Assert.assertEquals(Act_AddNewBucketPopup,Ex_AddNewBucketPopup);
		System.out.println("# Validation == PASS :: 'Add New Allocation / Bucket' Title appears for Add New Bucket Popup.");
	}

	//AddedDescriptionValue
	 
		public static  String Ex_AddedDescription1;
		public static  String Act_AddedDescription1;
		public  void ValidateAddedDescription() throws Exception
		{
			
			Ex_AddedDescription1= Robj.BucketDescriptionName().getText();
			Act_AddedDescription1=Robj.AddedDescriptionValue().getText();
			Assert.assertEquals(Act_AddedDescription1,Ex_AddedDescription1);
			System.out.println("# Validation == PASS :: Add Allocation Bucket appears in the section");
		}
	//Successmessage
		public static  String Ex_SuccessmsgafterBucketCreate;
		public static  String Act_SuccessmsgafterBucketCreate;
		public  void Success_Message_afterCreateBucket() throws Exception
		{
			
			Ex_SuccessmsgafterBucketCreate= "Allocation setup has been successfully saved.";
			Act_SuccessmsgafterBucketCreate=Robj.Successmessage().getText();
			Assert.assertEquals(Act_SuccessmsgafterBucketCreate,Ex_SuccessmsgafterBucketCreate);
			System.out.println("# Validation == PASS :: Add Allocation Bucket appears in the section");
		}
	//  Edit_UpdateAllocationPopupTitle
	
	public static String Ex_UpdateAllocationBucketPopupTilte;
	public static String Act_UpdateAllocationBucketPopupTilte;
	public void ValidateEditBucketPopupTitleName() throws Exception
	{
		Ex_UpdateAllocationBucketPopupTilte="Edit Allocation / Bucket ";
		Act_UpdateAllocationBucketPopupTilte=Robj.Edit_AllocationPopupTitle().getText();
		Assert.assertEquals(Act_UpdateAllocationBucketPopupTilte, Ex_UpdateAllocationBucketPopupTilte);
		System.out.println("# Validation == PASS :: 'Edit Allocation / Bucket' Popup Title is Present");
	}
	
	//  TransamountRecieved
	public static String Ex_Transactionmessgae;
	public static String Act_Transactionmessgae;
	public void ValidateTranscation_Amount() throws Exception
	{
		Ex_Transactionmessgae="Cheque";
		Act_Transactionmessgae=Robj.Recieved_Payment().getText();
		Assert.assertEquals(Act_Transactionmessgae, Ex_Transactionmessgae);
		System.out.println("# Validation == PASS :: 'Cheque' value is Present");
	}
	
//  Transaction_amountget
	
	public static String Ex_unallocatedamountget;
	public static String Act_unallocatedamountget;
	public void unallocatedamountequalzero() throws Exception
	{
		Ex_unallocatedamountget="0.00";
		Act_unallocatedamountget=Robj.unallocated_amountget().getText();
		Assert.assertEquals(Act_unallocatedamountget, Ex_unallocatedamountget);
		System.out.println("# Validation == PASS :: 'Amount of unallocated amount is Zero ");
	}

	
	
	
	

}		
