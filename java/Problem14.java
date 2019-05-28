//Matthew Mayfield 
//Project Euler - Problem 14
//May 3 2019

package projecteuler;

import java.util.LinkedList;

public class Problem14 {

	public static void main(String[] args) {
		
		long begin = System.currentTimeMillis();
		
		LinkedList<Long> list = new LinkedList<Long>();
		
		int answer = 0;
		long length = 0;
		
		
		for(int i = 10; i < 1000000; i++)
		{			
			long n = i;
			
			while(n != 1)
			{
				if( n%2 == 0)
				{
					n /= 2;
					list.add(n);
				}
				else
				{
					n = 3*n + 1;
					list.add(n);
				}
			}
			
			if(list.size() > length)
			{
				length = list.size();
				answer = i;
			}
			list.clear();
		}	
		long end = System.currentTimeMillis();
			 
		System.out.println(answer +" with chain size: "+ length);
		System.out.println(end-begin + "ms");	
		
		

	}

}
