package com.ifcon;
import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		//Check even or Odd
		if (num%2==0) {
			System.out.println("Given number "+num+" is Even");
		}
		else {
			System.out.println("Given number "+num+" is Odd");
		}
		
		//Check leap year
		Scanner sc1= new Scanner (System.in);
		System.out.println("Enter a number:");
		int year = sc1.nextInt();
		
		if (year%4==0) {
			System.out.println("Given year "+year+" is Leap year");
		}
		else {
			System.out.println("Given year "+year+" is not a Leap year");
		}
	}

}
