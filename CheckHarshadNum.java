/* 23. Implement a Java program to check whether a number is a Harshad Number or not. */
//If the number is divisible by sum of the digits of the number 

import java.util.*;

public class CheckHarshadNum {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int n = sc.nextInt();
			int num=n, digit, sum=0;
			
			while(num > 0) {  //create another number by taking each digit in reverse order
				digit = num % 10;
				sum  += digit;
				num /= 10;
			}
			
			if(n % sum == 0) 
				System.out.println(n +" is a Harshad Number");
			else
				System.out.println(n +" is not a Harshad Number");
		}

	}

}
