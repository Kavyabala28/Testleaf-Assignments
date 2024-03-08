package week2.day4;

public class CheckBoxButton extends Button{
	
	public void clickCheckButton() {
		System.out.println("Successfully clicked on checkbox");
	}
	
	public static void main(String[] args) {
		CheckBoxButton checkBox = new CheckBoxButton();
		checkBox.clickCheckButton();
	}

}
