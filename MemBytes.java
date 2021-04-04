/* 39. Implement a Java program that reads via CLA (size type) example: 1 KB / 1 MB, calculate the memory in bytes. */


public class MemBytes {

	public static void main(String[] args) {
		double n = Double.parseDouble(args[0]);
		double a;
		switch(args[1]) {
		case "KB": a=n*1024; break;
		case "MB": a=n*1024*1024; break;
		case "GB": a=n*1024*1024*1024; break;
		case "TB": a=n*1024*1024*1024*1024; break;
		default: a=0;
		}
		System.out.println("Memory in bytes: "+a);
	}

}
