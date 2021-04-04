/* 6. Implement a JAVA program to find the square root using newton raphson method. */

class SqrtNewtonRaphson {
	public static void main(String args[]) {
		long n = 144;				
		double precision = 0.0001;
		float x = n;
		
		while((Math.abs(n - x*x)) > precision) {
			x = (x + n/x)/2;
			//System.out.println("Here");
		}
		System.out.println("Square root of "+n+" is "+x);
	}
}