//Matthew Mayfield 
//Project Euler - Problem 20
//May 28 2019

package projecteuler;

import java.math.BigInteger;

public class Problem20 {

	public static void main(String[] args) {
		
		BigInteger b1, b2, b3, b4, b5;
		
		b1 = new BigInteger("1");
		b2 = new BigInteger("0");
		b3 = new BigInteger("101");
		b4 = new BigInteger("0");
		b5 = new BigInteger("10");
		
		
		
		
		for(BigInteger bi = BigInteger.valueOf(1); bi.compareTo(b3) < 0; //while bi < 101
	            bi = bi.add(BigInteger.ONE))
		{
			b1 = b1.multiply(bi);
		}
		
		b2 = b1;
		BigInteger sum =new BigInteger("0");
		
		while(b2.compareTo(b4)>0)//while b2>0
		{
			sum = sum.add(b2.mod(b5));
			b2 = b2.divide(b5);
		}
		System.out.print(sum);
	}

}
