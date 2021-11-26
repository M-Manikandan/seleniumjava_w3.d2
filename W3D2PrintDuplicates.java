package week3.day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class W3D2PrintDuplicates {

	public static void main(String[] args) {
		
		/*
		
        //int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// increase the count if both the arrays are equal
					
			// Out of the inner loop, check and print the first array variable if count is more than 0 */
			
		
			Integer[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

			List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(arr));
                  
			Set<Integer> duplicatesnum = new LinkedHashSet<Integer>();
			
			for (Integer eachValue : dataList) {

				if ((dataList.indexOf(eachValue)) != (dataList.lastIndexOf(eachValue)))

					duplicatesnum.add(eachValue);

			}
			System.out.println(duplicatesnum);
	}

}