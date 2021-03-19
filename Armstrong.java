/*1. Implement JAVA program to check whether a given number is ARMSTRONG or not. */

class Armstrong {
	public static void main(String args[]) {
		int num = 153;
		int sum=0,temp,digit,iter=0;
		temp = num;
		
		while(temp !=0) {
			iter = iter+1;
			temp = temp / 10;
			System.out.println(iter);
		}
		/*
		while(num > 0) {
			digit = num % 10;
			sum += Math.pow(digit,num);
			num = num / 10;
		} */
		if(sum == temp) {
			System.out.println("Armstrong\n");
		}
		else
			System.out.println("Not Armstrong\n");
	}
}