/* 24. Implement a Java program to check whether a number is a Pronic Number or Heteromecic Number or not. */
//Pronic -> Product of two consecutive numbers

import java.util.Scanner;

public class CheckPronicHeteromecic {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int n = sc.nextInt();
			int i;
			
			for(i=0;i<n;i++) {
				if(i*(i+1) == n) {
					System.out.println(n +" is a Pronic Number");
					System.exit(0);
				}
			}
			System.out.println(n +" is not a Pronic Number");
		}
		
	}

}
