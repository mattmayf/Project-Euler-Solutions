//Matthew Mayfield 
//Project Euler - Problem 9
//May 7 2019

package projecteuler;

public class Problem9 {

	public static void main(String[] args) {
		

		int prod = 0;
		
		for(int c = 3; c < 1000; c++){
			for(int b = 2; b < c; b++){
				for(int a = 1; a < b;a++){
					if((a+b+c==1000) && (a*a + b*b == c*c)){
						
						prod = a*b*c;
					}
				}
			}
		}
		System.out.println(prod);
	}

}
