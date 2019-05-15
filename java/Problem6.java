//Matthew Mayfield 
//Project Euler - Problem 6
//May 7 2019

package projecteuler;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int n = input.nextInt();
		System.out.println(squareOfSum(n) - sumOfSquares(n));
	}
	
	public static int sumOfSquares(int n){
		int sum = 0;
		
		for(int i = 1; i<=n; i++){
			sum = sum + (i*i);
		}
		return sum;
	}
	
	
	public static int squareOfSum(int n){
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		return sum*sum;
	}

}
