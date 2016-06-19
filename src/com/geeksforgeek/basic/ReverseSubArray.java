package com.geeksforgeek.basic;

import java.util.Scanner;

public class ReverseSubArray {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			int size = scan.nextInt();

			int arr[] = new int[size];

			for(int j=0; j<size; j++){
				arr[j]=scan.nextInt();
			}

			int firstIndex = scan.nextInt();
			int lastIndex = scan.nextInt();
			
			reverseSubArray(arr,firstIndex-1,lastIndex-1);

		}	
	

	}

	private static void reverseSubArray(int[] array, int startIndex, int endIndex) {
		int half = (startIndex + endIndex) / 2;
		int endCount = endIndex;
		for (int startCount = startIndex; startCount < half; startCount++) {
		    int temp = array[startCount];
		    array[startCount] = array[endCount];
		    array[endCount] = temp;
		    endCount--;
		}
		
		for(int k : array){
			System.out.print( k + " ");
		}
		
		System.out.println(" ");
	}

	private static void swap(int i, int j) {
		 int temp =i;
		 i=j;
		 j=temp;
		
	}

}
