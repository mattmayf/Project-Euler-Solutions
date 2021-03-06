//Matthew Mayfield 
//Project Euler - Problem 21
//May 28 2019

package projecteuler;


public class Problem21 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 10000; i++) {
			if (isAmicable(i))
				sum += i;
		}
		System.out.println(sum);
	}	
	
	private static boolean isAmicable(int n) {
		int temp = sumofDivisors(n);
		return temp != n && sumofDivisors(temp) == n;
	}	
	
	private static int sumofDivisors(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}
	
}
