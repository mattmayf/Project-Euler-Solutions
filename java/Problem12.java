//Matthew Mayfield 
//Project Euler - Problem 12
//May 8 2019

package projecteuler;

public class Problem12 {

	public static void main(String[] args) {
		
		long begin = System.currentTimeMillis();
		
		int sum = 1;
		
		for(int i = 2; i < 2147483647; i++){
			sum = sum + i;
			if(countDivisors(sum) > 500){
				System.out.println(sum);
			break;
			}
			
			
		}
		long end = System.currentTimeMillis();
		System.out.println(end-begin + "ms");
	}
	
	public static int countDivisors(int n){
		
		int counter = 0;
		
		for(int i = 1; i*i <= n; i++){
			if(n%i==0){
				counter+=2;
			}
		}
		return counter;
	}

}
