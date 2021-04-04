/* 33. Implement a program to check if a number is Mersenne number or not. */
//Mersenne number is a prime number that is one less than power of 2. Mersenne prime is n = 2^i-1 if n is prime

public class CheckMersenne {

	public static boolean isPrime(int n) {
		int i;
		if(n==0 || n==1) return false;
		else {
			for(i=2; i<n/2; i++) {
				if(n%i == 0) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int i;
		
		for(i=1; i<n; i++) {
			int k = (int) Math.pow(2, i);
			if(k > n+1)
				break;
			if(n+1 == k && isPrime(n)) {
				System.out.println(n +" is a Mersenne prime number");
				System.exit(0);
			}
		}
		
		System.out.println(n +" is not a Mersenne prime number");		
	}

}
