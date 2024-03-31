package testcases;

import org.testng.annotations.Test;

import base.ProgramSpecificMethod;
import pages.LoginPage;

public class TC_003_CreateAccount extends ProgramSpecificMethod{

	@Test
	public void runCreateAccount() {
		 new LoginPage(driver).enterUsername().enterPassword().clickLogin()
		                .clickCRMSFA().AccountsTab()
		                .createAccount().accountName().localName()
		                .createAccountBtn();		 
		 
		 
	}
}
