/* 8. Implement a JAVA program to find the odd numbers between 0-100. */

class OddNum {
	public static void main(String args[]) {
		int i=0;
		while(i<100) {
			if(i%2 != 0)  //Check
				System.out.printf(i+" "); //print with a space between two odd numbers
			i++;
		}
	}
}