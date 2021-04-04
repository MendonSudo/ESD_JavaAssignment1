/* 49. Implement a java program to find the straight line equation giving input m and c. */

import java.util.*;

public class LineEqn {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter m: ");
			int m = sc.nextInt();
			
			System.out.print("Enter c: ");
			int c = sc.nextInt();
			
			System.out.print("Straight line equation is: y = "+ m +"x+"+c);

		}
		
	}

}
