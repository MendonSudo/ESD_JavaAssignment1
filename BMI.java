/* 40. Implement a Java program to compute body mass index (BMI). */
//BMI = weight/(height*height)
import java.util.*;

public class BMI {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter wight in KG");
			double weight = sc.nextDouble();
			System.out.println("Enter height in meters");
			double height = sc.nextDouble();
			
			System.out.println("BMI is: "+(weight/(height*height))+ " kg/m^2");
		}

	}

}
