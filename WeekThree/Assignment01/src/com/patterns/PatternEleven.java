
/*Floyd's Triangle Pattern*/

package com.patterns;

public class PatternEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		int k=1;
		for (i = 7; i > 0; i--) {
			for (j = 7; j >= i; j--) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}

}
