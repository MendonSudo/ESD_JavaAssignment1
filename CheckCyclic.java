/* 30. Implement a Java program to check a number is a cyclic or not. */
// Multiples are cyclic permutations of same digits

public class CheckCyclic {

	public static String sort(String s) {
		char a[] = s.toCharArray();
		int i,j;
		char temp;
		String str1 = "";
		
		for(i=0; i<a.length; i++) {
			for(j=0; j<a.length-i-1; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for(i=0; i<a.length; i++)
			str1 += a[i];
		return str1;
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);  // reading number(storing as String)
		String str = Integer.toString(n);
		
		String str1 = sort(str); //sort the digits
		int i;
		String r,p;
		boolean flag = true;
		
		for(i=2; i<=str.length(); i++) {
			r = Integer.toString(n*i);  // multiples of the number
			p = sort(r);  //sort the digits of the multiple
			
			if(p.equals(str1) == false) {
				flag = false;
				break;
			}
		}
		
		if(flag)
			System.out.println(n +" is a cyclic number");
		else
			System.out.println(n +" is not a cyclic number");

	}

}
