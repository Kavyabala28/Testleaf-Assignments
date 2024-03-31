package week4.day1;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");

		// To maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Locate to "From" and sending value as "MAS"
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS");

		// Locate to "To" and sending value as "MDU"
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU");

		// Uncheck the "sort on Date"
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();

		// Set<String> name = new LinkedHashSet<String>();

		// Getting the size of "Train Name"
		int size = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]/tbody/tr")).size();

		Thread.sleep(2000);

		// Printing all train names
		for (int i = 2; i <= size; i++) {
			String text = driver
					.findElement(By.xpath("//table[contains(@class,'DataTable TrainList')]/tbody/tr[" + i + "]/td[2]"))
					.getText();
			System.out.println("Train name for row" + i + " is " + text);

			// adding train names into set
			// name.add(text);
		}

		// Printing unique names
		// System.out.println("Unique train names : " + name);

		driver.close();
	}
}
