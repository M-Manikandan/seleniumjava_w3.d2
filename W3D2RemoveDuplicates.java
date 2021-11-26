package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class W3D2RemoveDuplicates {

	public static void main(String[] args) {

		/*
		 * Pseudo code
		 * 
		 * a) Use the declared String text as input String text =
		 * "We learn java basics as part of java sessions in java week1"; b) Initialize
		 * an integer variable as count c) Split the String into array and iterate over
		 * it d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. f) if the count > 1 then
		 * replace the word as ""
		 * 
		 * g) Displaying the String without duplicate words
		 */
		// TODO Auto-generated method stub

		String input = "We learn java basics as part of java sessions in java week1";

		// need to split the sentence
		String[] strgssplit = input.split(" ");
		// System.out.println(Arrays.toString(strgssplit)+ "");
		List<String> stringsent = new ArrayList<String>(Arrays.asList(strgssplit));
		Set<String> duplicate = new LinkedHashSet<String>(stringsent);
		System.out.println(duplicate);
		/*
		 * 
		 * Set<String> newset = new LinkedHashSet<String>(); for (String eachvalue:
		 * strgssplit) newset.add(eachvalue); { System.out.println(newset); }
		 */

	}
}