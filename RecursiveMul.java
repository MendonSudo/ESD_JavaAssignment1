/* 15. Implement a JAVA program to multiply two numbers using recursive multiplication. */

class RecursiveMul {
	
	static int Mul(int a, int b) {
		if(a==0 || b==0)
			return 0;
		else
			return (a + Mul(a, b-1));  // add a b-times
	}
	public static void main(String args[]) {
		int num1 = 12, num2 = 3;
		System.out.println("Result is "+Mul(num1,num2));
	}
}