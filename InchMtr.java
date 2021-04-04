/* 38. Implement a Java program that reads a number in inches, converts it to meters(CLA) */
// 1 inch is 0.0254 mtr
public class InchMtr {

	public static void main(String[] args) {
		double inch = Double.parseDouble(args[0]);
		double mtr = inch * 0.0254;
		System.out.println("Inch: "+inch +" Meters: "+mtr);
	}

}
