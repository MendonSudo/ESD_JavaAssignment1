/* 50. Implement a java program to find the LCD of the given numbers. */

public class FindLCD {
	public static int lcm(int a, int b) {
		int gcf=1;
		int num,i;
	
		if(a>b)
			num = b;
		else
			num = a;
	
		for(i=1;i<=num;i++) {
			if(a%i == 0 && b%i == 0)
				gcf = i;
		}
		return ((a*b)/gcf);
	}

	public static void findLCD(int num1, int den1, int num2, int den2) {
		int lcd = lcm(den1, den2);
		num1 *= (lcd / den1);
		num2 *= (lcd / den2);

		int res_num = num1 + num2;

		System.out.print( res_num + "/" + lcd);
}
	
	
	public static void main(String[] args) {
		int num1 = 1, den1= 3;
		int num2 = 7, den2 = 15;
		
		findLCD(num1,den1,num2,den2);
	}

}
