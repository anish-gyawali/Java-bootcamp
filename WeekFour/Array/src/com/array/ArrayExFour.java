// write a program to read data from console and store inside the array
package com.array;

import java.util.Scanner;

public class ArrayExFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[3];
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<arr.length;i++) 
		{
		System.out.println("Enter the number to store in the array: ");
		arr[i]=sc.nextInt();
		}
		
		System.out.println("Display the list");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}

}
