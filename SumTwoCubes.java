/* 32. Implement java program to find any number between 1 and n that can be expressed as the sum of two cubes in two (or more) different ways */

public class SumTwoCubes {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		//int cube_root = (int) Math.cbrt(n);
		int a,b,c,d,a3,b3,c3,d3; // 4 numbers to check a^3+b^3 = c^3+d^3
		
		for(a=1; a<= n; a++) {
			a3 = a*a*a;
			if(a3> n) break;
			
			for(b=a; b<= n; b++) {
				b3 = b*b*b;
				if(a3+b3 > n) break;
				
				for(c= a+1; c<=n; c++) {
					c3 = c*c*c;
					if(c3> n) break;
					
					for(d = c; d<=n; d++) {
						d3 = d*d*d;
						if(c3+d3 > n) break;
						
						if(a3+b3 == c3+d3) {
							System.out.println((a3+b3) +" = "+ a +"^3 + "+ b +"^3 = "+ c +"^3 +"+ d +"^3");
						}
					}
				}
			}
		}

	}

}
