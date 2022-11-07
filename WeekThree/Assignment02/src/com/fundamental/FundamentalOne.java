/*
1) Write a java program swap two numbers Using Temp variable and with out temp
Input : 100 200
Output: 200 100

*/
package com.fundamental;

import java.util.Scanner;

public class FundamentalOne {

	 void swapUsingTemp(int a, int b) {
		
		System.out.println("Input :" + " " + a + " " + b);

		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("output :" + " " + a + " " + b);
	}

	void swapWithOutUsingTemp(int a, int b) {
		System.out.println("\nWithout temp Variable");
		System.out.println("Input :" + " " + a + " " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("output :" + " " + a + " " + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FundamentalOne swap =new FundamentalOne();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int fno = sc.nextInt();

		System.out.println("Enter Second number: ");
		int sno = sc.nextInt();

		swap.swapUsingTemp(fno, sno);
		swap.swapWithOutUsingTemp(fno, sno);
	}

}
