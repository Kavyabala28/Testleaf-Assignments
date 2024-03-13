package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 10, 6, 8 }; // 1, 2, 3, 4, 6, 8, 10

		// Passing arrays into list
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

		// Sorting the list
		Collections.sort(list);

		System.out.println("After Sorting : " + list);

		// To find missing element
		for (int i = 0; i < list.size()-1; i++) {
           if (list.get(i) + 1 != list.get(i + 1)) {
				int missing = list.get(i) + 1;
				System.out.println(missing);
			}
		}
	}

}
