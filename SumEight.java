/* 9. Implement a JAVA program to find the number between 0 - 1000 where the sum is 8. */

class SumEight {
	public static void main(String args[]) {
		int start = 1, end = 1000;
		int sum = 8;
		
		while(start < end) {
			if(start+end == sum) {
				System.out.println("Two numbers are "+start +" and "+end);
				break;
			}
			else if(start+end < sum)
				start++;
			else end--;
		}
	}
}