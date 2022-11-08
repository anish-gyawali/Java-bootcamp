// Write min and max value using

package com.array;

public class ArrayExThree {

	static void min(int arr[]) {
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Min value from the array is :" + min);
	}
	static void max(int arr[]) {
int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Max value from the array is :" + max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Anonymous array
		int arr[]= {10,20,30,40,100,500,900};
		min(arr);
		max(arr);
	}

}
