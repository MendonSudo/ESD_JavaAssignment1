/* 25. Implement a Java program check whether a number is an Automorphic number or not. */
// Automorphic -> n is Automorphic if last digit of square of n is n

import java.util.*;

public class CheckAutomorphic {
	
	static boolean Automorphic(int a) {
		int sqr = a*a;
		
		//compare each digit of the number to its corresponding digit in its square.
		while(a>0) {
			
			if(sqr%10 != a%10) 
				return false;
			
			sqr /= 10;
			a /= 10;
		}
		return true;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int n = sc.nextInt();
			
			if(Automorphic(n))
				System.out.println(n +" is Automorphic");
			else
				System.out.println(n +" is not Automorphic");
		}

	}

}
