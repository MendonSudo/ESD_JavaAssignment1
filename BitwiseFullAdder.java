/* 11. Implement a JAVA program to implement a Full adder using Bitwise operator. */

class BitwiseFullAdder {
	public static void main(String args[]) {
		int A = 3, B = 2, Cin = 0;
		int sum,carry;
		sum = A ^ B ^ Cin;
		carry = (A&B) | (B&Cin) | (Cin&A);
		
		System.out.println("Sum: "+sum +" Carry: "+carry);

	}
}