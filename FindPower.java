/* 18. Find the power of the number without using existing methods.  */

class FindPower {
	public static void main(String args[]) {
		int num,exp;
		long result=1;
		num = 3; exp = 3;
		
		while(exp != 0) {
			result *= num;
			exp--;
		}
		System.out.println("Result is "+result);
	}
	
	
}