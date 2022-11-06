/*
write a program to print following pattern
	
	12345678910
	----------
	------up to 50
*/
package com.patterns;

public class PatternSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		int k = 1;
		for (i = 0; i < 5; i++) {
			for (j = 1; j <= 10; j++) {
				if (k <= 50)
					System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}

}
