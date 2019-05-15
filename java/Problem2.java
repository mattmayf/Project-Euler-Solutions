//Matthew Mayfield 
//Project Euler - Problem 2
//May 3 2019

package projecteuler;

public class Problem2 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		int temp = 0;
		
		do{
			if(num2 % 2 ==0){
				sum = sum + num2;
			}
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
		}while(num2<4000000);
			System.out.println(sum);
		}
		
		

	

}
