package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the "Login" Button.
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the "CRM/SFA" Link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		// Click on the "Create Leads" Button.
		driver.findElement(By.xpath("//a[text()='Create Account']/preceding::a[text()='Create Lead']")).click();
		
		// Enter the "CompanyName" Field 
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@name='companyName']")).sendKeys("TestLeaf");
		
		// Enter the "FirstName" Field
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@name='firstName']")).sendKeys("xxx");
		
		// Enter the "LastName" Field
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@name='lastName']")).sendKeys("yyy");
		
		// Enter the "FirstNameLocal" Field
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("zzz");
		
		// Enter the "Department" Field
		driver.findElement(By.name("departmentName")).sendKeys("Management");
		
		// Enter the "Description" Field
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("abcd..............");
		
		// Enter your email in the "E-mail address" Field 
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz123@gmail.com");
		
		// Select "State/Province" as NewYork
		WebElement dropdownWe = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		dropdownWe.click();
		Select dropdownValue = new Select(dropdownWe);
        dropdownValue.selectByVisibleText("New York");
        
        // Click on the "Create" Button
        driver.findElement(By.name("submitButton")).click();
        
        // Click on the "Edit" button.
        driver.findElement(By.linkText("Edit")).click();
        
        // Clear the "Description" Field.
        WebElement clearDescription = driver.findElement(By.id("updateLeadForm_description"));
        clearDescription.clear();
        
        // Fill the "Important Note" Field with Any text.
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("xzy............");
        
        // Click on the update button.
        driver.findElement(By.name("submitButton")).click();
        
        
		/*
		 * WebElement text = driver.findElement(By.id("viewLead_companyName_sp"));
		 * String companyNameId = text.getText(); String companyId =
		 * companyNameId.replaceAll("[^0-9]", ""); System.out.println("Company Id : "
		 * +companyId);
		 */
        
        // Get the "Title" of the Resulting Page.
        System.out.println("Title of the page: "+driver.getTitle());
        
        // Close Browser
        driver.close();
	}

}
