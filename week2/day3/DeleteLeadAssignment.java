package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadAssignment {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");

		driver.manage().window().maximize();

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click the "Leads" link
		driver.findElement(By.xpath("(//div[@class='frameSectionHeader'])[2]")).click();

		// Click "Find leads.
		driver.findElement(By.linkText("Find Leads")).click();

		// Click on the "Phone" tab
		driver.findElement(By.xpath("(//a[@class='x-tab-right'])[2]")).click();

		// Passing '123' number to phoneNumber tab(3)
		driver.findElement(By.xpath(
				"(//div[contains(@class,'x-plain-body x-plain-body-noheader x-plain-body-noborder')]/input)[13]"))
				.sendKeys("123");

		// Click on the "Find Leads" tab
		driver.findElement(By.xpath("(//div[@class='x-panel-btns x-panel-btns-center'])[6]/table")).click();

		// Click on first Lead ID
		Thread.sleep(2000);

		WebElement id = driver
				.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a)[1]"));
		String leadId = id.getText();
		System.out.println("Lead ID : " + leadId);
		id.click();

		// Click on "Delete" button
		driver.findElement(By.className("subMenuButtonDangerous")).click();

		// Go to "Find Lead" Tab again
		driver.findElement(By.linkText("Find Leads")).click();

		// Passing the captured lead ID again by using argument "leadId" from WebElement 'id' 
		WebElement leadId1 = driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']"));
		leadId1.sendKeys(leadId);

		// Click on "Find Leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(3000);

		// Getting 'No records to display' message
		WebElement notification = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String actualMessage = notification.getText();

		// Verifying for 'No records to display' message
		String expectedMessage = "No records to display";
		if (actualMessage.contains(expectedMessage))
			System.out.println("Yes, getting 'No records to display' message");
		else
			System.out.println("No, Not getting 'No records to display' message");

		driver.close();

	}

}
