/* 17. Find the dictance between two points, using euclidean distance. */

import java.util.*;

class FindEucDist {
	
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the coordinates of the 1st point");
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			System.out.println("Enter the coordinates of the 2nd point");
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			double distance = Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1));
			System.out.println("Distance is "+distance);
		}
	}
}