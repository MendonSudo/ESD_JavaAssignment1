/* 19. Implement a Java program to calculate the Binomial Coefficient of two positive numbers. */

import java.util.*;

class BinomCoeff {
	
	static int fact(int a) {
		if(a <= 1)
			return 1;
		else
			return a * fact(a-1);
	}
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int n,k;
			long res=0;
			System.out.println("Enter the first number:");
			n = sc.nextInt();
			System.out.println("Enter the second number:");
			k = sc.nextInt();
			
			if((k > n) || k == 0) {
				System.out.println("First number must be greater than or equal to second number");
				System.exit(0);
			}
			else
				res = fact(n) /(fact(k) * fact(n-k));
			
			System.out.println("Binomial coefficient of "+ n + " and "+ k +" is "+res);
		}
	}
}