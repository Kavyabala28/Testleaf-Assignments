package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {

		Integer[] arr = { 3, 2, 11, 4, 6, 7 }; // 2, 3, 4, 6, 7, 11

		// Adding array into list
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

		// Sorting the list
		Collections.sort(list);

		System.out.println(list);

		// To find second largest number
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) < list.get(j)) {
					Collections.swap(list, i, j);
				}
			}
		}

		// checking list size greater than 2
		if (list.size() >= 2) 
			System.out.println("The second largest number is " + list.get(1));
		else 
			System.out.println("Don't have a second largest number in the array");
		
	}

}
