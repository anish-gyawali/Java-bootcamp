/*
  Pascal's Triangle Pattern
	
	1 
	1 1 
	1 2 1 
	1 3 3 1 
	1 4 6 4 1 
	1 5 10 10 5 1 
	1 6 15 20 15 6 1 
*/
package com.patterns;

public class PatternTwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;	
		int num=7;
		for (i = 1; i <= num; i++) {

			int k = 1;
			for (j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k = k * (i - j) / j;
			}
			System.out.println();
		}
	}

}
