/* 21. Implement Java program to check if a given number is Fibonacci number or not. */

// If 5n^2+4 or 5n^2-4 is a square number then n is Fibonacci number.

class CheckFibonacci {
	
	static boolean checkSqure(int a) { 		//Check for perfect square using sqrt function
		int i = (int) Math.sqrt(a);
		if(a == i*i) {
			return true;
		}
		else return false;
	}
	public static void main(String args[]) {
		int n=21;
		
		if(checkSqure(5*n*n + 4) || checkSqure(5*n*n - 4))
			System.out.println(n +" is a Fibonacci number");
		else
			System.out.println(n +" is not a Fibonacci number");
		
	}
}