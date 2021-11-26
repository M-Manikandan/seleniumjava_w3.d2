package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class W3D2SecondLargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * // Here is the input
		 */
			//int[] data = { 3, 2, 11, 4, 6, 7 };

		/*
		 * Pseudo Code: 1) Arrange the array in ascending order 2) Pick the 2nd element
		 * from the last and print it
		 */

		Integer[] inputdata = { 3, 2, 11, 4, 6, 7 };
		List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(inputdata));
		Collections.sort(dataList);
		System.out.println("The Second Largest Number is " + dataList.get(dataList.size() - 2));

	}

}
