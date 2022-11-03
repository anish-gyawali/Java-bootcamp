/* write a program to display 5 to 20 and check if the number is even or not*/

package com.whileLoop;

public class ProgramThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5;
		while (i<=20) {
			if (i % 2 == 0) {
				System.out.println(i+" is a Even number");
			
			}
//			else {
//				System.out.println(i+" is not a Even number");
//			}
			++i;
		}
	}

}
