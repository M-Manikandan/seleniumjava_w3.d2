package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class W3D2MissingElement {
	
	public static void main(String[] args) {
	
		// Here is the input
				//int[] arr = {1,2,3,4,7,6,8};

				// Sort the array	
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
	
				Integer[] inputnum = {1,2,3,4,7,6,8};
				
				List<Integer> number = new ArrayList<Integer>(Arrays.asList(inputnum));
				Collections.sort(number);
				
				for (int i=0; i<= number.size()-1; i++)
				{
					if (number.get(i)!=i+1)
					{
						System.out.println("Missing number " +(i+1));
						break;
					}
					
					}
					
	}

}
