package week2.day4;

public class LoginTestData extends TestData{

	public void enterUsername() {
		System.out.println("Enter your Username");
	}
	
	public void enterPassword() {
		System.out.println("Enter your Password");
	}

	
	public static void main(String[] args) {
		
		LoginTestData loginTest = new LoginTestData();
		loginTest.enterCredentials();
		loginTest.enterUsername();
		loginTest.enterPassword();
		loginTest.navigateToHomePage();
		

	}

}
