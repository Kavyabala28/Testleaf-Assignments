package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int input = 121;
		int output = input;
		int rem, rev;
		
		/*
		 * while(output > 0) { \
		 * rem = output % 10;  // 121%10 = 1  // 12%10 = 2 // 1%10 = 1
		 * rev = rev * 10 + rem; // 0*10 + 1 --> rev = 1 // 10+2 = 12 // 20+1 = 21
		 * output = output / 10; // 121 / 10 = 12.5 // 12/10 = 1 // 21/10 = 1
		 */
		
		for( rev = 0; output > 0; output /= 10 ) {
			rem = output % 10;
			rev = rev * 10 + rem;
			
		}
		
		if(input == rev) {
			System.out.println( input + " is a palindrome Number");
		}else {
			System.out.println( input + " is a not a palindrome Number");
		}
		
	}
		
}
