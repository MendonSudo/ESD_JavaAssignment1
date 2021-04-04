/* 37. Implement a Java program to create the first twenty Hamming numbers */
//Whose only prime factors are 2,3 and 5

public class HammingSeries {
	public static int HammingNumg(int n) {
		int[] h = new int[n];
		h[0] = 1;
		int i=0,j=0,k=0;
		int x2=2,x3=3,x5=5,ind;
		
		for(ind=1; ind<n; ind++) {
			h[ind] = Math.min(x2, Math.min(x3, x5)); //take min of three
			//series can be created by incrementing the power of 2,3 & 5
			if(h[ind] == x2) x2 = 2* h[++i];
			if(h[ind] == x3) x3 = 3* h[++j];
			if(h[ind] == x5) x5 = 5* h[++k];
		}
		return (h[n-1]);
	}

	public static void main(String[] args) {
		int num;
		for(num=1;num<=20;num++)
				System.out.print(HammingNumg(num) +" ");
		}
	}
