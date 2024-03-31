package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class MainExecution {
	
	public RemoteWebDriver driver;
	
	@Parameters({"username","password","url","browser"})
	@BeforeMethod
	public void preExecution(String user, String pass, String url, String browser) {
		
	switch(browser) {
	
	case "Chrome":
		driver = new ChromeDriver(); break;
		
	case "Edge":
		driver = new EdgeDriver(); break;
		
	default:
		driver = new ChromeDriver(); break;
		
	}
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	}
	
	@AfterMethod
	public void postExecution() {
		driver.close();
	}

}
