/* 28. Implement a Java program to check if a given number is circular prime or not. */
// A prime number is a circular prime if it remains prime if any combination of digits is prime

import java.util.*;

public class CheckCircularPrime {
	
	public static int rotate(int n, int divide) {
		if(n < 10) return n;
		else return (n % divide) * 10 + n/divide;
	}
	
	public static boolean Prime(int num) { //check if the number is prime
		int i;
		if(num < 2) return false;
		else if(num == 2) return true;
		else if(num % 2 == 0) return false;
		else {
			for(i=3; i<= (int) Math.sqrt(num); i+=2) {
				if(num % i == 0)
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int n = sc.nextInt();
			int i, divide=1, circular = n, flag=1;
			
			for(i=n; i>0; i /= 10) {
				divide *= 10;
			}
			divide /= 10;
			
			do {
				circular = rotate(circular, divide);
				if(!Prime(circular)) flag = 0;
			} while(circular != n);
			
			if(flag==1)
				System.out.println(n +" is a Circular Prime number");
			else
				System.out.println(n +" is not a Circular number");
			
		}
		

	}

}
