package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		
		driver.manage().window().maximize();
		
		// click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		// Verify that the title of the page is ‘dashboard’
        String actualTitle = driver.getTitle();
        String expectedTitle = "dashboard";
        
        if(actualTitle.equalsIgnoreCase(expectedTitle)) 
        	System.out.println("Yes, getting same title as 'Dashboard'");
        else
        	System.out.println("No, getting different title");
        
        driver.navigate().back();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        // Check if the button with the text ‘Confirm if the button is disabled’ is disabled
        WebElement disableButton = driver.findElement(By.xpath("//button[contains(@name,'j_idt88:j_idt92')]"));
        System.out.println("Confirm if the button is disabled - " +disableButton.isEnabled());
        
        // print the position of the button with the text ‘Submit.’
        Point submitBtnLocation = driver.findElement(By.xpath("(//span[contains(@class,'ui-button-text ui-c')])[3]")).getLocation();
        System.out.println("The Location of submit button is : "+submitBtnLocation);
        
        // print the background color of the button with the text ‘Find the Save button color.’
        String savebtnColor = driver.findElement(By.name("j_idt88:j_idt96")).getCssValue("background-color");
        System.out.println("Color of the save button is " +savebtnColor);
		
        // print the height and width of the button with the text ‘Find the height and width of this button.’
        Dimension height_width = driver.findElement(By.name("j_idt88:j_idt98")).getSize();
        System.out.println("Button height and width is " +height_width);
        
        // Close the browser window
        driver.close();
	}

}
