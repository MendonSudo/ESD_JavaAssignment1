/* 45. Implement a java program to check whether there is any occurance of characters in a n-digit input number. */

import java.util.*;

public class RepeatAnyDigit {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number: ");
			int num = sc.nextInt();
			
			int cnt[] = new int[10];
			
			int n1=num;
			
			while(n1>0) {
				int rem = n1 % 10;
				cnt[rem]++;
				n1 /= 10;
			}
			int i;
			
			for(i=0; i<10; i++) {
				if(cnt[i]>1)
					System.out.println(i +" is repeated "+ cnt[i] +" times in "+ num);
					
			}			
		}
	}

}
