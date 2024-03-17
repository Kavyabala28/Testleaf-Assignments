package week3.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		

	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.amazon.in/");
	       
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       Thread.sleep(3000);
	       
	       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
	       
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("//div[@class='left-pane-results-container']//div[@class='s-suggestion-container']")).click();
	       
	       //driver.findElement(By.id("nav-search-submit-button")).click();
	       
	       WebElement text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));                                                                                      
	       String text1 = text.getText();
	       System.out.println("Result for bags :" +text1);
	       
	       driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[12]")).click();
	       
	       driver.findElement(By.xpath("//span[@class='a-expander-prompt']")).click();
	       
	       Thread.sleep(3000);
	       
	       driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[19]")).click();
	       
	       driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	       
	       driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	       
	       WebElement bag = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
	       String firstBag = bag.getText();
	       System.out.println("First filtered bag name :" +firstBag);
	       
	       WebElement bagDiscount = driver.findElement(By.xpath("//span[@class='a-price']"));
	       String discount = bagDiscount.getText();
	       System.out.println("First filtered bag discount price :" +discount);
	       
	      
	       String title = driver.getTitle();
	       System.out.println("Title :" +title);
	       
	       driver.close();
	       
	       
	       
	     
	}

}
