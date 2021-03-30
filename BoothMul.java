/* 12. Implement a JAVA program to implement a Booth multiplier.  */

class BoothMul {
	
	static void add(int[] A, int[] B) {
		int c = 0,i;
		for(i=8; i>=0;i--) {
			int temp = A[i] + B[i] + c;
			A[i] = temp % 2;
			c = temp / 2;
		}
	}
	//to convert into binary
	static int[] binary(int n) {
		int[] bin = new int[4];
		int ctr = 3;
		int num = n;
		if(n<0)
			num = 16 + n;
		while(num != 0) {
			bin[ctr--] = num % 2;
			num /= 2;
		}
		return bin;
	}
		
	public static void main(String args[]) {
		int num1=3,num2=-7,i;
		int[] m = binary(num1);
		int[] m1 = binary(-num1);
		int[] q = binary(num2);
		int[] A = new int[9];
		int[] S = new int[9];
		int[] P = new int[9];
		
		for(i=0;i<4;i++) {
			A[i] = m[i];
			S[i] = m1[i];
			P[i+4] = q[i];
		}
		
		for(i=0;i<4;i++) {
			if(P[7] == 0 && P[8] == 0);
			
			else if(P[7] == 1 && P[8] == 0)
				add(P,S);
			else if(P[7] == 0 && P[8] == 1)
				add(P,A);
			else;
			
			//right shift
			for(int j=8; j>=1; j--)
				P[j] = P[j-1];
		}
		
		//to get decimal equivalent
		int p = 0;
		int t = 1;
		for(i=7;i>=0;i--, t *=2)
			p += (P[i] * t);
		if(p>64)
			p = -(256 - p);
		
		System.out.println(p);
	}
}