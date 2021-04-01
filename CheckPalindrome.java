/* 22. Check whether the number is a palindrome number or not. */

import java.util.*;

class CheckPalindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int temp,digit,rev=0,num=n;
		
		while(num > 0) {  //create another number by taking each digit in reverse order
			digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		
		if(rev == n)
			System.out.println(n +" is a Palindrome");
		else
			System.out.println(n +" is not a Palindrome");
	}
}