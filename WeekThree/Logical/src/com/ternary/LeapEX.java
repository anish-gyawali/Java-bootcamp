package com.ternary;
import java.util.Scanner;

public class LeapEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int num = sc.nextInt();
		
		String msg=((num%4==0)?"It is a leap year":"It is not a leap year");
		System.out.println(msg);
	}

}
