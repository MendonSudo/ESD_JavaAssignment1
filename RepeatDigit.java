/* 44. Implement a java program to count the repeted occurance of a digit in a n-digit number. */

import java.util.*;

public class RepeatDigit {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number: ");
			int num = sc.nextInt();

			System.out.print("Enter the digit: ");
			int dig = sc.nextInt();
			
			int count=0;
			int n1=num;
			
			while(n1>0) {
				if(n1 % 10 == dig)
					count++;
				n1 /= 10;
			}
			
			System.out.println(dig +" is repeated "+ count +" times in "+ num);
		}
	}

}
