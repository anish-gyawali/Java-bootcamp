/*
write a program to print following pattern
 
12345
12345
12345
12345

*/

package com.patterns;

public class PatternSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		for (i = 1; i < 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
