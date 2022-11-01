package com.bitwise;

public class BitWiseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=5;
		int c=2;
		
		//example use of '&'
		//It will check for both the condition
		System.out.println(a<b & ++a>c); //false
		System.out.println(a); //11
		
		System.out.println(a>b & ++a>c); //true
		System.out.println(a); //12
		
		// example use of '&&'
		//if first condition is true then only it will check for another condition
		System.out.println(a<b && ++a>c); //false
		System.out.println(a); //12
		
		System.out.println(a>b && ++a>c); //true
		System.out.println(a); //13
		
		//example use of '|' (Bitwise Or)
		//single 'or' operator checks both the condition, any one of condition is true then it will return true
		System.out.println(a<b | ++a>c); //true
		System.out.println(a); //14
		
		System.out.println(a>b | ++a>c); //true
		System.out.println(a); //15
		
		
		//example use of '||' (Logical Or)
		// first condition is true it will not checks the second condition, any one of the condition true it return true
		// First condition is false it checks the second condition, ,if second condition true it returns true. 
		System.out.println(a<b || ++a>c); //true
		System.out.println(a); //16
		
		System.out.println(a>b || ++a>c); //true
		System.out.println(a); //16
		
	}

}
