package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfNumbers {

	public static void main(String[] args) {

		Integer[] arr1 = {3, 2, 11, 4, 6, 7};
        Integer[] arr2 = {1, 2, 8, 4, 9, 7};

        // Passing Array values into the List
        List<Integer> num1 = new ArrayList<Integer>(Arrays.asList(arr1)); 
        int number1 = num1.size();
        
        List<Integer> num2 = new ArrayList<Integer>(Arrays.asList(arr2)); 
        int number2 = num2.size();
        
        // Finding the same numbers between two arrays 
		  for(int i = 0; i < number1; i ++ ) {
			  for(int j = 0; j < number2; j++) {
				  if(num1.get(i)==num2.get(j)) {
					  System.out.println(num1.get(i));
				  }
			  }
		  }
			 
	}

}
