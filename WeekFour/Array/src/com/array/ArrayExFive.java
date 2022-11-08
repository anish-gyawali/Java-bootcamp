//Write a program to find out the even, odd, smallest and largest number from array
package com.array;

public class ArrayExFive {

	static void even(int arr[]) {
		int num = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("even number: " + arr[i]);
			}
		}
	}

	static void odd(int arr[]) {
		int num = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println("odd number: " + arr[i]);
			}
		}
	}

	static void smallest(int arr[]) {
		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("smallest value from the array is :" + smallest);
	}

	static void largest(int arr[]) {
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("largest value from the array is :" + largest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 3, 4, 5, 10, 22, 33, 55, 77, 80 };
		even(arr);
		odd(arr);
		smallest(arr);
		largest(arr);
	}

}
