package week3.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {

       ChromeDriver driver = new ChromeDriver();
       
       driver.get("https://www.abhibus.com/");
       
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
       Thread.sleep(3000);
       
       // sending chennai to from box
       driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
       
       // clicking chennai
       driver.findElement(By.xpath("//div[text()='Chennai']")).click();
       
       // sending bangalore to To box
       driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
       
       // clicking bangalore
       driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
       
       // clicking tomorrow
       driver.findElement(By.xpath("(//button[@class='btn active text tertiary md active button'])[2]")).click();
       
       Thread.sleep(4000);
       
       // click search
       driver.findElement(By.xpath("//a[text()='Search']")).click();
       
       // Getting first bus title
       WebElement firstBusTitle = driver.findElement(By.xpath("//h5[@class='title']"));
       
       String busTitle = firstBusTitle.getText();
       
       System.out.println("First Bus Title : "+busTitle);
       
       // clicking sleeper
       driver.findElement(By.xpath("(//a[@class='btn  outlined tertiary sm inactive button'])[4]/span[text()='Sleeper']")).click();
       
       // getting no.of.seats
       WebElement noOfSeats = driver.findElement(By.xpath("//div[@class='text-grey']"));
       
       String seatsNum = noOfSeats.getText();
       
       System.out.println("Available seat : "+seatsNum);
       
       // clicking show seats
       driver.findElement(By.xpath("//button[@class='btn bus-info-btn filled primary sm inactive button']")).click();
       
       Thread.sleep(3000);
       
       WebElement seat2 = driver.findElement(By.xpath("//table[@id='seat-layout-details']//button"));
       seat2.click();
       
       // Select boarding point
       driver.findElement(By.xpath("(//div[@class='label']/p)[1]")).click();
       
       // Select dropping point
       driver.findElement(By.xpath("(//div[@class='label']/p)[1]")).click();
       
       WebElement seatText = driver.findElement(By.xpath("//span[@class='text-primary']"));
       String seatName = seatText.getText();
       
       System.out.println("Seat name  : " +seatName);
       
       WebElement seatFare = driver.findElement(By.xpath("(//span[@class='text-primary'])[2]"));
       String BaseFare = seatFare.getText();
       
       System.out.println("Base Fare  : " +BaseFare);
       
       String title = driver.getTitle();
       System.out.println("Title : "+title);
       
       driver.close();
	}

}
