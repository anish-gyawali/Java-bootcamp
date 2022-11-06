/*
write a program to print following pattern

	abcdef
	abcdef
	abcdef

*/
package com.patterns;

public class PatternTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		char j;
		for (i = 0; i < 3; i++) {
			for (j = 'a'; j <= 'f'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
