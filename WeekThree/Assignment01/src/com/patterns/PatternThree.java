/*
 write a program to print following pattern
 	* 
 	* * 
 	* * * 
 	* * * * 
 	* * * * * 


*/
package com.patterns;

public class PatternThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int j;
		for (i = 5; i > 0; i--) {
			for (j = 5; j >= i; j--) {
				System.out.print("*" + ' ');
			}
			System.out.println();
		}
	}

}
