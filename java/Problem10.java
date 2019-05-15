//Matthew Mayfield 
//Project Euler - Problem 10
//May 7 2019

package projecteuler;

import java.util.Scanner;


public class Problem10 {


public static void main (String[] args) throws java.lang.Exception
{
    System.out.println(sumOfPrimes(2000000));
}

public static boolean[] simpleSieve(int n)
{
    boolean[] sieve = new boolean[n+1];  //false = prime, true = composite
    sieve[0] = true; sieve[1] = true; sieve[2] = false;

    for(int i = 4; i <= n; i+=2)
    { sieve[i] = true; }

    int limit = (int)Math.sqrt(n)+1;
    for(int i = 3; i < limit; i+=2)
    {
        if(!sieve[i]) //if prime (or not composite)
        {
            for(int j = i*i; j <= n; j+=i) //mark all multiples of i as composite
            { sieve[j] = true; }
        }
    }

    return sieve;
}

public static long sumOfPrimes(int n)
{
    //get primes
    boolean[] primes = simpleSieve(n);
    long sum = 0;

    for(int i = 0; i < primes.length; i++)
    {
        if(!primes[i])
        { sum += i; }
    }

    return sum;
}
}