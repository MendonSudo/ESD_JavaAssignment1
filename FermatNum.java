/* 31. Implement a Java program to display first 10 Fermat numbers. */
// Fermat number is a positive number whre kth term is 2^2^k + 1
public class FermatNum {

	public static void main(String[] args) {
		int n = 0;
		double term;
		
		while(n <= 10) {
			term = Math.pow(2, Math.pow(2, n)) + 1;
			System.out.println(term +" ");
			n++;
		}
	}

}
