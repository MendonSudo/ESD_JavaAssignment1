/* 36. Implement a Program in Java to check whether a number is a Keith Number or not */
//An n-digit number N is a Keith Number if it forms a Fibonacci-like sequence that begins with the digits of the number itself. 
//The most significant digit is followed by the rest of the digits. 
//Now each subsequent term is the sum of the previous n terms, and the number N itself appears in this sequence.


public class CheckKeithNum {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int n1 = n;
		
		String str1 = Integer.toString(n);
		int len = str1.length();
		int arr[] = new int[n];
		int i,sum=0;
		
		for(i=len-1; i>=0; i--) {
			arr[i] = n1 % 10;
			n1 /= 10;
		}
		
		i=len; 
		while(sum< n) {
			sum = 0;
			for(int j=1; j<=len; j++) {
				sum += arr[i-j];
			}
			arr[i] = sum;
			i++;
		}
		
		if(sum==n) 
			System.out.println(n +" is a Keith number");
		else
			System.out.println(n +" is not a Keith number");
	}

}
