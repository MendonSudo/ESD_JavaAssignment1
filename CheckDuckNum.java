/* 26. Implement a Java program to check whether a number is a Duck Number or not */
//Number with leading zeros. Eg: 3510, 7806 etc.

import java.util.*;

public class CheckDuckNum {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			String n = sc.next();
			int flag = 0;
			int len = n.length();
			
			for(int i=0; i<len; i++) {
				if(n.charAt(i) > '0')  // set flag when non-zero
					flag = 1;
				if(n.charAt(i) == '0' && flag == 1) { //check for zero after flag is set
					System.out.println("Duck number");
					System.exit(0);
				}
			}
			System.out.println("Not a Duck number");
		}
		

	}

}
