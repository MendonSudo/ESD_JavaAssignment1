/*1. Implement JAVA program to check whether a given number is ARMSTRONG or not. */

class Armstrong {
	public static void main(String args[]) {
		int num = 1634;
		int sum=0,temp,digit,iter=0;
		
		temp = num;
		while(temp > 0) {
			temp /= 10;
			iter++;
			//System.out.println(iter);
		}
		
		temp = num;
		while(temp > 0) {
			digit = temp % 10;
			sum += Math.pow(digit,iter);
			temp = temp / 10;
		}
		
		if(sum == num) {
			System.out.println("Armstrong\n");
		}
		else
			System.out.println("Not Armstrong\n");
	}
}