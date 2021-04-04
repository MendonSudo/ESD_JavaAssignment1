/* 47. Implement a java program to find whether a circle is inside another circle or not. (consider all the possibel cases) */

public class CircleInCircle {
	public static void check_circle(int x1, int y1, int x2, int y2, int r1, int r2) {
    int distance = (int)Math.sqrt(((x1 - x2) * (x1 - x2))  + ((y1 - y2) * (y1 - y2)));
 
    if (distance + r2 == r1)
    {
        System.out.println("The smaller circle lies completely inside the bigger circle with touching each other");
    }
             
    else if (distance + r2 < r1)
    {
        System.out.println("The smaller circle lies completely inside the bigger circle without touching each other at a point of circumference.") ;
    }
             
    else
    {
        System.out.println("The smaller does not lies inside  the bigger circle completely.") ;
    }
             
}
	
	
	public static void main(String[] args) {
        int x1 = 10, y1 = 8;
        int x2 = 1, y2 = 2;
        int r1 = 30, r2 = 10;
        check_circle(x1, y1, x2, y2, r1, r2);
	}

}
