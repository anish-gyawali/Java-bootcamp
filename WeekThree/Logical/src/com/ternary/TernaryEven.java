package com.ternary;
import java.util.Scanner;

public class TernaryEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt();
		
		String msg=((num%2==0)?"Given Number is Even":"Given number is Odd");
		System.out.println(msg);
	}

}
