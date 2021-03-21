/* 3. Implement a JAVA program to print the ASCII values of A-Z, a-z , 0-9. */

class PrintAscii {
	public static void main(String args[]) {
		char ele;
		System.out.println("ASCII values of 0-9:");
		for(ele = '0';ele <='9'; ele++) {
			System.out.println(ele+' ');
		}
		System.out.println("ASCII values of A-Z:");
		for(ele = 'A';ele <='Z'; ele++) {
			System.out.println(ele+' ');
		}
		System.out.println("ASCII values of a-z:");
		for(ele = 'a';ele <='z'; ele++) {
			System.out.println(ele+' ');
		}
	}
}