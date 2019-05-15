//Matthew Mayfield 
//Project Euler - Problem 7
//May 7 2019

package projecteuler;

import java.util.Scanner;


//Heads up. this program list primes not based on which prime you want, 
//but based on the number prime you entered. 
//so if you enter 13, it will list primes up to 13.
//but i put a counter on to it which is nice.
//FOR PROBLEM 7: 104759 IS THE # YOU WANT TO ENTER!

public class Problem7 {

	
	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter a number: ");
	       int n = scanner.nextInt();
	       Problem7 sieve = new Problem7();
	       sieve.primes(n);
	   }
		
		
	public void primes(int n) {
	       boolean[] primes = new boolean[n + 1];
	       for (int i = 2; i < primes.length; i++) {
	           primes[i] = true;
	       }
	       int num = 2;
	       while (true) {
	           for (int i = 2;; i++) {
	               int multiple = num * i;
	               if (multiple > n) {
	                   break;
	               } else {
	                   primes[multiple] = false;
	               }
	           }
	           boolean nextNumFound = false;
	           for (int i = num + 1; i < n + 1; i++) {
	               if (primes[i]) {
	                   num = i;
	                   nextNumFound = true;
	                   break;
	               }
	           }
	           if (!nextNumFound) {
	               break;
	           }
	       }
	       int counter = 1;
	       
	       for (int i = 0; i < primes.length; i++) {
	           if (primes[i]) {
	               System.out.println(counter + "." + " " + i);
	               counter++;
	           }
	       }
	   }
	
}
