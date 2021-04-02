/* 27. Implement a Java program to check two numbers are Amicable numbers or not. */
// Amicable numbers are two numbers in which sum of proper divisors of each is equal to the other number

import java.util.*;

public class CheckAmicable {

	public static void main(String[] args) {
		int i,sum1=0,sum2=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first number");
			int n1 = sc.nextInt();
			System.out.println("Enter second number");
			int n2 = sc.nextInt();
			//to check all the divisors of the first number
			for(i=1; i<n1; i++) {
				if(n1%i == 0) 
					sum1 += i;
			}
			
			//to check all the divisors of the first number
			for(i=1; i<n2; i++) {
				if(n2%i == 0) 
					sum2 += i;
			}
			
			if(sum1 == n2 && sum2 == n1)
				System.out.println(n1 +" and "+ n2 +" are Amicable numbers");
			else
				System.out.println(n1 +" and "+ n2 +" are not Amicable numbers");
		}

		
	}

}
