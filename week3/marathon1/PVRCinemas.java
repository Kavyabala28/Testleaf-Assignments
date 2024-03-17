package week3.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
	       
	       driver.get("https://www.pvrcinemas.com/");
	       
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.findElement(By.xpath("//input[@class='p-inputtext p-component p-autocomplete-input p-autocomplete-input']")).sendKeys("Chennai");
	       
	       driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	       
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("//span[text()='Cinema']")).click();
	       
	       driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
	       Thread.sleep(2000);
	       
	       // select cinema
	       driver.findElement(By.xpath("//li[text()='PVR AEROHUB Chennai']")).click();
	      
	       Thread.sleep(2000);
	       
	       // select date
	       //driver.findElement(By.xpath("//span[text()='Select Date']")).click();
	       
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("//li[contains(text(),'Tomorrow, 16 Mar')]")).click();
	       
	       // select movie
	       
	       Thread.sleep(2000);
	       // bdriver.findElement(By.xpath("//span[text()='Select Movie']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//li[contains(@class,'p-dropdown-item')]")).click();
	       
	       
	       // select timing
	       Thread.sleep(2000);
	       //driver.findElement(By.xpath("//span[text()='Select Timing']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//li[contains(@class,'p-dropdown-item')]")).click();
	       
	       // book
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//button[@class='p-button p-component sc-dJGMql iqPuEM bgColor filter-btn']")).click();
	       
	       // accept
	       driver.findElement(By.xpath("//button[text()='Accept']")).click();
	       
	       // select seat
	       driver.findElement(By.xpath("//span[@class='seat-current-pvr']")).click();
	       
	       // summary
	       WebElement summary = driver.findElement(By.xpath("//div[@class='summary-movies-content']"));
	       String summary1 = summary.getText();
	       System.out.println("Movie Summary : " +summary1);
	       
	       WebElement tot = driver.findElement(By.xpath("//div[@class='grand-prices']"));
	       String grandTotal = tot.getText();
	       System.out.println("Grand Total : " +grandTotal);
	       
	       driver.close();
	       
		
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	}

}
