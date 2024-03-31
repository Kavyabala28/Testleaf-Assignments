package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramSpecificMethod;

public class LoginPage extends ProgramSpecificMethod{

	public LoginPage(ChromeDriver driver) {
       this.driver = driver;
	}

	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
}
