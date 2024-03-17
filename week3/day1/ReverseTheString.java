package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseTheString {

	public static void main(String[] args) {

         String[] company = {"HCL", "Wipro", "Aspire Systems", "CTS"};
         
         // Inserting "Arrays" into "List"
         List<String> companyList = new ArrayList<String>(Arrays.asList(company));
         
         // Sorting to ascending order
         Collections.sort(companyList);
         
         System.out.println("Company Name after sorting " +companyList);
         
         // Reversing the List
         Collections.reverse(companyList);
        
         System.out.println("Company Name after reversing "+companyList);
         

	}

}
