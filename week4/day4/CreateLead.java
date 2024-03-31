package week4.day4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends MainExecution {

	@Test(dataProvider = "dynamicParameters")
	public void createLeadRun(String cname, String fname, String lname) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider(indices= {0})
	public String[][] dynamicParameters() throws IOException {
		

		/*String[][] data = new String[3][3];

		data[0][0] = "Infosys";
		data[0][1] = "Kavya";
		data[0][2] = "B";

		data[1][0] = "TCS";
		data[1][1] = "Barath";
		data[1][2] = "B";

		data[2][0] = "CTS";
		data[2][1] = "Mahilthini";
		data[2][2] = "J";

		return data;*/

		return ReadExcelData.excelData("CreateLeads");
	}
}
