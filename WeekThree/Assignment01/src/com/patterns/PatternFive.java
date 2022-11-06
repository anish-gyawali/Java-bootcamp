/*
write a program to print following pattern
 
11111
22222
33333
44444
55555
 
 */
package com.patterns;

public class PatternFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
