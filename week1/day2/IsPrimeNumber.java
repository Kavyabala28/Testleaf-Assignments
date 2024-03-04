package week1.day2;

import java.util.Scanner;

public class IsPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();

		int fact = 0;

		for (int i = 1; i <= num; i++) {
			fact = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					fact++;
				}
			}
		}

		if (fact == 2) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

}
