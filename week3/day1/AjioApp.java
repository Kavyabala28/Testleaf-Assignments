package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioApp {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get(" https://www.ajio.com/");

		driver.manage().window().maximize();

		// Locate to "Search" Tab and passing value as "bags"
		WebElement searchBox = driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input ')]"));
		searchBox.sendKeys("bags");

		// Locate to "Search Symbol"
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();

		// Locate to "Men" checkbox under Gender
		driver.findElement(By.xpath("//label[contains(@class,'facet-linkname-genderfilter facet-linkname-Men')]"))
				.click();

		Thread.sleep(3000);

		// Locate to "Fashion Bags" under Category
		driver.findElement(By.xpath("//label[contains(@class,' Fashion Bags')]")).click();

		Thread.sleep(2000);

		// Locate to print the count of filtered fashion bags
		WebElement bagsCount = driver.findElement(By.xpath("//div[@class='length']"));
		String count = bagsCount.getText();
		System.out.println("Count of the Fashion Bags: " + count);

		// Get the list of brands
		List<String> brandOfProducts = new ArrayList<String>();

		// Getting all "Brand" name
		List<WebElement> brandName = driver.findElements(By.xpath("//div[@class='brand']"));
		
		int brandSize = brandName.size();
		
		for(int i = 0; i < brandSize; i++) {
		   WebElement num = brandName.get(i); 
		   String brands = num.getText();
		   brandOfProducts.add(brands);
		}
		
		System.out.println("The List of brands are " +brandOfProducts);
        
		// Get the list of names
		List<String> names = new ArrayList<String>();
		
		List<WebElement> bagsName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		int bagSize = bagsName.size();
		
		for(int i = 0; i < bagSize; i++) {
			WebElement bags = bagsName.get(i);
			String bagsNameText = bags.getText();
			names.add(bagsNameText);
		}
		
		System.out.println("The List of bag names are " +names);
		
        // Closing the browser
		driver.close();

	}

}
