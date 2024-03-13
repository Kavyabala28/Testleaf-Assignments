package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String a = "PayPal India";

		char[] charPaypal = a.toCharArray();

		Set<Character> charSet = new LinkedHashSet<Character>();

		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		for (char charPay : charPaypal) {

			if (!charSet.contains(charPay)) {
				charSet.add(charPay);
			} else {
				dupCharSet.add(charPay);
			}

		}
		
		System.out.println("Before removing duplicates : " + a);

		System.out.println("Duplicate Letters are " + dupCharSet);

	}

}
