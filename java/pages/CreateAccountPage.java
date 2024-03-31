package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramSpecificMethod;

public class CreateAccountPage extends ProgramSpecificMethod {

	public CreateAccountPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateAccountPage accountName() {
		driver.findElement(By.name("accountName")).sendKeys("Account1");
		return this;
	}
	
	public CreateAccountPage localName() {
		driver.findElement(By.name("groupNameLocal")).sendKeys("Kavya");
		return this;
	}
	
	public AccountsPage createAccountBtn() {
		driver.findElement(By.className("smallSubmit")).click();
		return new AccountsPage(driver);
	}
}
