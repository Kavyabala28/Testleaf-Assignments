package testcases;

import org.testng.annotations.Test;

import base.ProgramSpecificMethod;
import pages.LoginPage;

public class TC_002_LogoutPage extends ProgramSpecificMethod{

	@Test
	public void runLogout() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername().enterPassword().clickLogin().clickLogout();
	}
}
