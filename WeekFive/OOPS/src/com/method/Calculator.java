//Simple example of method overriding

package com.method;

public class Calculator {
	
	void add(int x, int y) {
		int total=x+y;
		System.out.println("total sum of two int is :"+ total);
	}
	
	void add(int x, int y, int z) {
		int total=x+y+z;
		System.out.println("total sum of Three int is :"+ total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal=new Calculator();
		cal.add(100,200,300);
	}

}
