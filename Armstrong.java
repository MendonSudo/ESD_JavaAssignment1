/*1. Implement JAVA program to check whether a given number is ARMSTRONG or not. */

class Armstrong {
	public static void main(String args[]) {
		int num = 153;
		int sum=0,temp,digit;
		temp = num;
		
		while(num > 0) {
			digit = num % 10;
			sum += (digit * digit * digit);
			num = num / 10;
		}
		if(sum == temp) {
			System.out.println("Armstrong\n");
		}
		else
			System.out.println("Not Armstrong\n");
	}
}