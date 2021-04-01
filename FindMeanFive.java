/* 14. Implement a JAVA program to find the Mean of given 5 numbers. */

import java.util.*;

class FindMeanFive {
	public static void main(String args[]) {
		int n=5,i;
		double sum=0;
		int[] arr1 = new int[n];
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter "+ n +" numbers");
			for(i=0; i<n; i++)
				arr1[i] = sc.nextInt();
		}
		for(i=0; i<n; i++)
			sum +=arr1[i];
		
		double mean = sum/n;
		System.out.println("Mean of the given number is "+mean);
	}
}