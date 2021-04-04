/* 35. Implement a Java program to print the first 15 numbers of the Pell series.   */
//Pell series starts with 0 and 1. Each number is the sum of twice the previous Pell number and the Pell number before that.

public class PellSeries {

	public static void main(String[] args) {
		int n1=0,n2=1,n3, n;
		System.out.print(n1+" "+ n2 +" ");
		for(n=1; n<=13; n++) {
			n3 = 2*n2 + n1;
			System.out.print(n3+ " ");
			n1 = n2;
			n2 = n3;
		}
	}

}
