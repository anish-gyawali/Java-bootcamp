/*
 write a program to print following pattern
 
	@@@@@
	@   @
	@   @
	@@@@@
 
 * */
package com.patterns;

public class PatternFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				if (i == 0 || j == 0 || i == 3 || j == 4)
					System.out.print("@");
				else
					System.out.print(' ');
			}
			System.out.println();
		}
	}

}
