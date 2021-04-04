/* 34. Implement a Java program to find all the narcissistic numbers between 1 and 1000. */
//Number which is sum of m-th power of its digits where m is number of digits.

public class FindNarcissistNum {
	public static boolean narc_num(int n) {
		if(n<0) return false;
		
		String str1 = Integer.toString(n);
		int len = str1.length();
		int sum=0;
		
		for(char c : str1.toCharArray() ) {
			sum += Math.pow(Character.digit(c, 10),len); 
		}
		if(sum == n) return true;
		else return false;
		
	}
	public static void main(String[] args) {
		int n;
		for(n=0; n<1000; n++) {
			if(narc_num(n))
				System.out.print(n +" ");
		}
	}

}
