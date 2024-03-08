package week2.day4;

public class TextField extends WebElement{

	public void getText() {
		System.out.println("I am used to get the text");
	}

	public static void main(String[] args) {
		TextField text = new TextField();
		text.getText();
	}
}
