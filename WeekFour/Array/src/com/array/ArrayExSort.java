//bubble sort 
//sorting algorithm that repeatedly steps element by element, comparing the current element with the one after it, swapping their values if needed.

package com.array;

public class ArrayExSort {

	static void sort(int arr[]) {
		int temp= 0;
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				//swapping variable to sort
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int j : arr) {
			System.out.println(j);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,3,55,6,77,88};
		sort(arr);
	}

}
