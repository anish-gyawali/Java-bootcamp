/*
 write a program to print following pattern
 
  * * * * *
  * * * * *
  * * * * *
    
 */
package com.patterns;

public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("*" + ' ');
			}
			System.out.println();
		}
	}

}
