package week3.day2;

public class W3D2Intersection {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
	
		Integer[] Array1 = { 3, 2, 11, 4, 6, 7 };
		Integer[] Array2 = { 1, 2, 8, 4, 9, 7 };

		System.out.println("Intersection of the two arrays ::");
		for(int i = 0; i<Array1.length; i++ ) {
	    for(int j = 0; j<Array2.length; j++) {
	    if(Array1[i]==Array2[j]) {
	    System.out.println(Array2[j]);
	               
	             /*        HashSet<Integer> set = new HashSet<Integer>();
		         	       set.addAll(Arrays.asList(firstArray));
	         			   set.retainAll(Arrays.asList(secondArray));
		       				System.out.println(set);
		       
		       */
		
	}

	         }
		}
		
	}
}

