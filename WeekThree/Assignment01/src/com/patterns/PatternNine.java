/*
write a program to print following pattern
	246810
	------
	---up to 50
*/
package com.patterns;

public class PatternNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		int k = 1;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 10; j++) {
				if (k % 2 == 0) {
					System.out.print(k);
				}
				k++;
			}
			System.out.println();
		}
	}

}
