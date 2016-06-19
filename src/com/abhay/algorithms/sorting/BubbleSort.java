package com.abhay.algorithms.sorting;

import java.util.Scanner;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
	
		int[] arr = new int[number];
		for(int i=0; i<number; i++){
			arr[i]= scan.nextInt();
		}
		int arrResult [] = bubbleSort(arr,arr.length);
		for(int a: arrResult){
			System.out.println(a);
		}

	}


	private static int[] bubbleSort(int[] arr, int n) {
		boolean flag = false;
		for(int k =1; k<n; k++){
			for(int j =0; j<n-k; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					flag= true;
				}

			}
			if(!flag){
				break;
			}
		}
		return arr;


	}

}
