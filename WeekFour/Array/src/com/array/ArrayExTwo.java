//write a program to represent group of name using array and for loop. 

package com.array;

public class ArrayExTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr= new String[3];
		arr[0]="Anish";
		arr[1]="Sabu";
		arr[2]="Rani";
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
