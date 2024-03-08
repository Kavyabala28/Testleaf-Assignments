package week2.day4;

public class RadioButton extends Button{
	
	public void selectRadioButton() {
		System.out.println("Selecting Radio Button");
	}
	
	public static void main(String[] args) {
		RadioButton RadioButton = new RadioButton();
		RadioButton.selectRadioButton();
		RadioButton.submit();
	}

}
