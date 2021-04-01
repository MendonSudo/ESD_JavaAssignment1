/* 16. Find the determinant, for the quadratic equations. */

import java.util.*;

class FindDet {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the value of a: ");
			double a = sc.nextDouble();
			System.out.println("Enter the value of b: ");
			double b = sc.nextDouble();
			System.out.println("Enter the value of c: ");
			double c = sc.nextDouble();
			
			double det = (b*b) - (4*a*c);
			
			System.out.println("Determinant of the equation is "+det);
		}
	}
}