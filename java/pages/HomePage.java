package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramSpecificMethod;

public class HomePage extends ProgramSpecificMethod {

	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public void leadsTab() {
		driver.findElement(By.linkText("Leads")).click();
		
	}
	
	public AccountsPage AccountsTab() {
		driver.findElement(By.linkText("Accounts")).click();
		return new AccountsPage(driver);
	}
}
