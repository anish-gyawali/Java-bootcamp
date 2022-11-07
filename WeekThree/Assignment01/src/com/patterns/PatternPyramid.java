/*
write a program to print Pyramid pattern

    * 
   * * 
  * * * 
 * * * * 
* * * * * 

*/
package com.patterns;

public class PatternPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		int n=5;
		
		for(i=0;i<n;i++) {
			
			for(j=n-i;j>1;j--) {		
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
