/* 13. Implement a JAVA program to find the max and min of given two numbers. */

import java.util.*;

class MaxMin {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter two numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a>b)
				System.out.println(a +" is greater than "+b);
			else
				System.out.println(b +" is greater than "+a);
		}
	}
}