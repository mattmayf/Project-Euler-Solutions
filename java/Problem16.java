//Matthew Mayfield 
//Project Euler - Problem 16
//May 27 2019

package projecteuler;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {
		

		BigInteger b1, b2, b3, b4;
		
		b1 = new BigInteger("2");
		b2 = new BigInteger("0");
		b3 = new BigInteger("10");
		b4 = new BigInteger("0");
		
		BigInteger num = b1.pow(1000);
		
		while(num.compareTo(b2)>0)
		{
		    b4 = b4.add(num.mod(b3));
		    num = num.divide(b3);
		}
		System.out.println(b4);
	}
	
}
