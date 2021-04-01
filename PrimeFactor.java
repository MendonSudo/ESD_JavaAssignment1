/* 20. Implemen a Java program to print all prime factors of a given number. */

class PrimeFactor {
	public static void main(String args[]) {
		int num = 125;
		
		// number of 2s
		while(num%2 == 0) {
			System.out.print("2 ");
			num /= 2;
		}
		
		//n is odd now. Start from 3 and can skip one number
		//print all the divisible numbers till sqrt.
		for(int i=3; i<=Math.sqrt(num); i += 2) {
			while(num%i == 0) {
				System.out.print(i+" ");
				num /= i;
			}
		}
		
		//to print the highest prime factor
		if(num > 2) 
			System.out.print(num);
	}
}