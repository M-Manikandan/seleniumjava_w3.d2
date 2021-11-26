package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		/*
		 * String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		 */
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)	
//		get the length of the array		

//		sort the array			

//		Iterate it in the reverse order

//		print the array

//		Required Output: Wipro, HCL , CTS, Aspire Systems */

		String[] input = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		List<String> values = new ArrayList<String>();

		for (String eachData : input) {
			values.add(eachData);
		}
		System.out.println("Before sorting " + values);
		// System.out.println(values.size());
		Collections.sort(values);
		System.out.println("After sorting " + values);
		int length = values.size();
		for (int i = length - 1; i >= 0; i--) {
			System.out.println("Reverse order" + values.get(i));
		}
	}

}
