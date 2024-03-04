package week1.day3;

//Assignment - 1

public class Mobile {

	public void makeCall() {
		String sendMsg = "Calling..";
		float mobileWeight = 1.5f;
		System.out.println("I am used to make call");
		System.out.println("Send Message : " +sendMsg + " , " + " Mobile Weight "+mobileWeight );
	}
	
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 250000;
		System.out.println("I am used to send a message");
		System.out.println("Is Fully recharged : " +isFullCharged + " , " + " Mobile Cost : " +mobileCost);
	}
	
	
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.makeCall();
		mob.sendMsg();
		System.out.println("This is my mobile");
	}
}
