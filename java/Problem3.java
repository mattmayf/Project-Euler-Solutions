//Matthew Mayfield 
//Project Euler - Problem 3
//May 3 2019

package projecteuler;
import java.util.Scanner;

public class Problem3 {

	
public static void main(String[] args) {
		
	System.out.println(run());
    
		}


public static String run() {
	long n = 600851475143L;
	while (true) {
		long p = smallestFactor(n);
		if (p < n)
			n /= p;
		else
			return Long.toString(n);
	}
}
private static long smallestFactor(long n) {
	if (n <= 1)
		throw new IllegalArgumentException();
	for (long i = 2, end = (long) Math.sqrt(n); i <= end; i++) {
		if (n % i == 0)
			return i;
	}
	return n;  // n itself is prime
}


}
