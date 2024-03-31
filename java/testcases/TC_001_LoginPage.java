package testcases;

import org.testng.annotations.Test;

import base.ProgramSpecificMethod;
import pages.LoginPage;

public class TC_001_LoginPage extends ProgramSpecificMethod{

	@Test
	public void runLoginPage() {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername().enterPassword().clickLogin();
	}
}
