package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramSpecificMethod;

public class WelcomePage extends ProgramSpecificMethod {
	
	public WelcomePage(ChromeDriver driver) {
	       this.driver = driver;
		}


	public HomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);
	}
	
	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}
}
