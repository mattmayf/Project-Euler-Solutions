//Matthew Mayfield 
//Project Euler - Problem 4
//May 4 2019

package projecteuler;

public class Problem4 {

	public static void main(String[] args) {
				
		System.out.println(Palindrome());
	
			}
				
		public static int Palindrome(){
			
			int largest = 0;
			
			for(int i=100; i<1000; i++){
				for(int j=100; j<1000; j++){
					int multiply = i*j;
					if(
//							(getPrefix(multiply) == getSuffix(multiply) && (multiply>largest) 
//							&& 
							(getSize(multiply)==5 && (getSecondDigit(multiply) == getNexttoLastdigit(multiply) ) 
							&& (getPrefix(multiply) == getSuffix(multiply)) && (multiply>largest))
							|| 
							(getSize(multiply)==6 && getSecondDigit(multiply) == getNexttoLastdigit(multiply))
							&& 
							(getThirdDigit(multiply) == getFourthDigit(multiply))
							&&
							(getPrefix(multiply) == getSuffix(multiply)) && (multiply>largest)
						)
						largest = multiply;
					}
				}
			
			return largest;
		}
		
		public static int getPrefix(int number) {
					  //  int result = number; //123456
					    
					    while (number > 9) {
					        number /= 10;
					    }
					    return number;
//					    for (int i = 0; i < getSize(number); i++) //size6    12345
//					      result /= 10;
//					    
//					    return result;
				 }
		public static int getSize(int d) {
					    int numberOfDigits = 0;
					    
					    while (d != 0) {
					      numberOfDigits++; //123456
					      d = d / 10;
					    }
					    
					    return numberOfDigits;
					  }
		public static int getSuffix(int number) {
					   return Math.abs(number%10);
				 }// 123456      123456/10=12345
		
		public static int getSecondDigit(int number){
					
					 number/=10000;
					 number = number%10;
					 return number;
				 }
				 
		public static int getNexttoLastdigit(int number){
					 number = Math.abs(number%100);
					 number /= 10;
					 return number;
					 
				 }
		public static int getThirdDigit(int number){
					 number /=1000;
					 return Math.abs(number%10);
				 }
		public static int getFourthDigit(int number){
					 number /=100;
					 return Math.abs(number%10);
				 }

}

