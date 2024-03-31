package week5.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class W3Schools {
	
	@Test(dataProvider = "keys")
	public void details(String fname, String email, String add, String city, String zip, String state,
			String cName, String cNum, String expMon, String cvv, String expYear) {
	
        ChromeDriver driver = new ChromeDriver();
		
        driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        
        driver.switchTo().frame(frame);
        
        driver.findElement(By.name("firstname")).sendKeys(fname);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("address")).sendKeys(add);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("zip")).sendKeys(zip);
        driver.findElement(By.id("state")).sendKeys(state);
        driver.findElement(By.name("cardname")).sendKeys(cName);
        driver.findElement(By.name("cardnumber")).sendKeys(cNum);
        driver.findElement(By.name("expmonth")).sendKeys(expMon);
        driver.findElement(By.name("cvv")).sendKeys(cvv);
        driver.findElement(By.name("expyear")).sendKeys(expYear);
        
        driver.close();
        
	}	
	
	@DataProvider(name = "keys")
	public String[][] dataProvider() throws IOException {
		return W3SchoolDetail.excelDetails("W3SchoolDetails");
	}

}
