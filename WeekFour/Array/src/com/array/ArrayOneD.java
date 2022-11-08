package com.array;

public class ArrayOneD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int [3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]);
		
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//use of for loop with array
		
		System.out.println("Using for loop");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
