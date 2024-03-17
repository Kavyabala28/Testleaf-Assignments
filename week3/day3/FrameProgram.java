package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameProgram {

	public static void main(String[] args) throws InterruptedException {
		
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Switch to the frame using "id"
		driver.switchTo().frame("iframeResult");
		
		// Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		// Click the "Try It" button inside the frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		// Switch to the Alert to access the pop-up message
		Alert alert = driver.switchTo().alert();
		
		// Click Ok - so using accept method
		alert.accept();
		
		// Wait for sometimes to load the text
		Thread.sleep(2000);
		
		// Locate to text message
		WebElement text = driver.findElement(By.id("demo"));
		
		// Get the text
		String actualText = text.getText();
		
		String expectedText = "You pressed OK!";
		
		// Verifying the text 
		if(actualText.contains(expectedText))
			System.out.println("Getting same 'You pressed OK!' message");
		else
			System.out.println("Not getting 'You pressed OK!' message");
		
		// close browser
		driver.close();
		
	}

}
