package week4.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://dev210045.service-now.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// locate to username
		driver.findElement(By.xpath("//div[@class='login-form-field']/input")).sendKeys("admin");
		
		// locate to password
		driver.findElement(By.xpath("//div[@class='input-group password-group']/input")).sendKeys("tdY0ES=5luW-");
		
		// login
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(20);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(10);
		
		// choose service catalog
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		
		WebElement frame = shadow.findElementByXPath("//iframe[@name='gsft_main']");
		driver.switchTo().frame(frame);
		
		// clicking mobile
		driver.findElement(By.xpath("(//td[@class='homepage_category_only_description_cell'])[8]/a")).click();
		
		// clicking apple iphone 13 pro
		driver.findElement(By.xpath("(//a[@class='service_catalog'])[3]")).click();
		
		// select 'yes' for a lost or broken iPhone
		driver.findElement(By.xpath("//span[@class='input-group-radio']/label")).click();
		
		// Passing '99' in phone number
		driver.findElement(By.xpath("(//div[@class='col-xs-6  form-field input_controls sc-form-field '])[2]/input[2]")).sendKeys("99");
		
		// select 'Unlimited [add $4.00]' in dropdown
		WebElement dropdown = driver.findElement(By.xpath("(//div[@class='col-xs-6  form-field input_controls sc-form-field '])[3]/select"));
		dropdown.click();
		Select select = new Select(dropdown);
		select.selectByVisibleText("Unlimited [add $4.00]");
		
		// click 'SierraBlue' for color
		driver.findElement(By.xpath("//div[@class='sc-radio']//label[text()='Yes']")).click();
		
		// click '512 GB'
		driver.findElement(By.xpath("//span[@class='input-group-radio']//label[text()='512 GB [add $300.00]']")).click();
		
		// clicking order now button
		driver.findElement(By.xpath("//button[contains(text(),'Order Now')]")).click();
		
		// getting request number
		String reqNo = driver.findElement(By.xpath("//a[@id='requesturl']/b")).getText();
		System.out.println("Request Number : "+reqNo);
		
		// Taking screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snap/OrderSnap.png");
		FileUtils.copyFile(src, des);
		
		driver.quit();
	}

}
