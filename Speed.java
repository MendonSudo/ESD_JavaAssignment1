/* 41. Implement a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
 */
import java.util.*;

public class Speed {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			float times;
			float mps,kph, mph;
			
			System.out.print("Input distance in meters: ");
			float distance = sc.nextFloat();

			System.out.print("Input hour: ");
			float hr = sc.nextFloat();

			System.out.print("Input minutes: ");
			float min = sc.nextFloat();

			System.out.print("Input seconds: ");
			float sec = sc.nextFloat();
			
			times= hr*3600 + min*60 + sec;
			mps = distance/times;
			kph = (distance/1000.0f) / (times/3600.0f);
			mph = kph /1.609f;
			
			System.out.println("Speed in meters/second is "+mps);
			System.out.println("Speed in km/h is "+kph);
			System.out.println("Speed in miles/h is "+mph);
			
		}

	}

}
