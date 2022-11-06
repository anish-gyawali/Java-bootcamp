/*
 write a program to print following pattern

* * * * * 
* * * * 
* * * 
* * 
* 
 
*/
package com.patterns;

public class PatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int j;

		for (i = 0; i < 5; i++) {
			for (j = 5; j > i; j--) {
				System.out.print("*" + ' ');
			}
			System.out.println();
		}
	}

}
