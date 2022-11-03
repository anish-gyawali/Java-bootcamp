package com.patterns;

public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (i == 0 || j == 0 || i == 4 || j == 4)
					System.out.print("@" + ' ');

				else
					System.out.print(" "+" ");

			}
			System.out.println();
		}

	}

}
