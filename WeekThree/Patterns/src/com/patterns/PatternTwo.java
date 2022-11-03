package com.patterns;

public class PatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i = 5; i >0; --i) {
			for (int j = 0; j<i; ++j) {	
					System.out.print("*" + ' ');
			}
			
			System.out.println();
		}

	}

}
