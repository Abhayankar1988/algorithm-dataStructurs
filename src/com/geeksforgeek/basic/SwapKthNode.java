package com.geeksforgeek.basic;

import java.util.Scanner;

public class SwapKthNode {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			int size = scan.nextInt();
			int number = scan.nextInt();

			int arr[] = new int[size];

			for(int j=0; j<size; j++){
				arr[j]=scan.nextInt();
			}

			
			swapNumbers(arr, number-1, arr.length-number);
			
			for(int k : arr){
				System.out.print(k + " ");
			}

		}	
	}

	private static void swapNumbers(int[] arr, int i, int j) {	
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	
}
