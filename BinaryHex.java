/* 51. Find the hexadecimal equivalent for a given 4-digit binary number. */

import java.util.*;

public class BinaryHex {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int hex[] = new int[100];
			int rem,dec=0,i=1,j=0;
			System.out.println("Enter the binary number: ");
			int bin = sc.nextInt();
			
			while(bin>0) {
				rem = bin % 2;
				dec = dec + rem * i;
				i = i*2;
				bin = bin / 10;
			}
			i = 0;
			while(dec != 0) {
				hex[i] = dec % 16;
				dec = dec / 16;
				i++;
			}
			
			System.out.println("Hex value: ");
			for(j=i-1; j>=0; j--) {
				if(hex[j]>9)
					System.out.print((char) (hex[j] + 55));
				else 
					System.out.print(hex[j]);
			}
		}
		
	}

}
