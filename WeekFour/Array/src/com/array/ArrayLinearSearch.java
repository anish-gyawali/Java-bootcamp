//Linear search
package com.array;

import java.util.Scanner;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,66,77,88};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to search : ");
		int num=sc.nextInt();
		
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println("Given value found: "+ num);
				k++;
			}
			
		}
		if(k==0) {
			System.out.println("Given number not found");
		}
				
	}

}
