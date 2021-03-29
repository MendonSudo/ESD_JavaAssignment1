/* 7. Implement a JAVA program to find the GCF  and LCM of given numbers.  */

class GcfLcm {
	public static void main(String args[]) {
		int a=15, b=5, gcf=1;
		int num,i;
		
		if(a>b)
			num = b;
		else
			num = a;
		
		for(i=1;i<=num;i++) {
			if(a%i == 0 && b%i == 0)
				gcf = i;
		}
		System.out.printf("GCF(%d,%d) = %d \n",a,b,gcf);
		System.out.printf("LCM(%d,%d) = %d \n",a,b,(a*b)/gcf);

	}
}