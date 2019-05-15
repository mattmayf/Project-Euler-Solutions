//Matthew Mayfield 
//Project Euler - Problem 5
//May 7 2019

package projecteuler;

public class Problem5 {

	
		
		public static void main(String[] args) {
			int smallest = 2520;

	        for (int nextFactor = 11; nextFactor <= 20; nextFactor++) {
	            for (int previous = smallest; smallest % nextFactor != 0; smallest += previous) ;
	        }

	        System.out.println(smallest);
	    }

}
