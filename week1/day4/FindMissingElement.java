package week1.day4;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 2, 8, 6, 7 };

		Arrays.sort(arr); // 1,2,3,4,6,7,8

		int sum1 = 0;

		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];

		}

		int sum2 = 0;
		for (int j = 0; j <= 8; j++) {
			sum2 = sum2 + j;
		}

		System.out.println("Missing No : " + (sum2 - sum1));
	}

}
