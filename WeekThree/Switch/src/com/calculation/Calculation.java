package com.calculation;
import java.util.Scanner;

public class Calculation {

	int fno;
	int sno;
	int result;
	
	void add() {
		System.out.println("----------Perform addition----------");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number: ");
		fno=sc.nextInt();
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter second number: ");
		sno=sc1.nextInt();
		
		result=fno+sno;
		System.out.println("Addition of two number is : "+ result);
	}
	
	void subtract() {
		System.out.println("----------Perform subtraction----------");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number: ");
		fno=sc.nextInt();
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter second number: ");
		sno=sc1.nextInt();
		
		result=fno-sno;
		System.out.println("Subtraction of two number is : "+ result);
	}
	
	void multiply() {
		System.out.println("----------Perform multiplication----------");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number: ");
		fno=sc.nextInt();
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter second number: ");
		sno=sc1.nextInt();
		
		result=fno*sno;
		
		System.out.println("Multiplication of two number is : "+ result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a= new Scanner(System.in);
		
		Calculation calculate=new Calculation();
		while(true) 
		{
		System.out.println("**********Calculation**********");
		System.out.println("1. ADD");
		System.out.println("2. SUBTRACT");
		System.out.println("3. MULTIPLY");
		System.out.println("4. EXIT");
		
		
		System.out.println("Choose the number to perform calculation ");
		int num=a.nextInt();
		
		switch(num) {
		case 1:
			calculate.add();
			break;
		case 2:
			calculate.subtract();
			break;
		case 3:
			calculate.multiply();
			break;
		case 4:
			System.out.println("thank you for using");
			System.exit(0);
		default:
			System.out.println("Choose between 1 to 4");
		}
		}
		
	}

}
