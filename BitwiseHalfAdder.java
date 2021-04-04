/* 10. Implement a JAVA program to implement a Half adder using Bitwise operator. */

class BitwiseHalfAdder {
	public static void main(String args[]) {
		int a=1, b=2;
		int sum,carry;
		
		sum = a ^ b;
		carry = a & b;
		System.out.println("Sum: "+sum +" Carry: "+carry);
	}
}