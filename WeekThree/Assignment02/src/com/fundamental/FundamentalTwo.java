/*
2) Write a java program swap three numbers Using Temp Variable and with out temp
Input : 100 200 300
Output: 300 200 100


*/

package com.fundamental;

import java.util.Scanner;

public class FundamentalTwo {

	void swapUsingTemp(int a, int b, int c) {

		System.out.println("Input :" + " " + a + " " + b + " " + c);

		int temp = 0;
		temp = a;
		a = c;
		c = temp;
		System.out.println("output :" + " " + a + " " + b + " " + c);
	}

	void swapWithOutUsingTemp(int a, int b, int c) {
		System.out.println("\nWithout temp Variable");
		System.out.println("Input :" + " " + a + " " + b + " " + c);
		a = a + b + c;
		c = a - (b + c);
		a = a - (b + c);
		System.out.println("output :" + " " + a + " " + b + " " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FundamentalTwo swap = new FundamentalTwo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int fno = sc.nextInt();

		System.out.println("Enter Second number: ");
		int sno = sc.nextInt();

		System.out.println("Enter Third number: ");
		int tno = sc.nextInt();

		swap.swapUsingTemp(fno, sno, tno);
		swap.swapWithOutUsingTemp(fno, sno, tno);
	}

}
