package com.abhay.algorithms.sorting;

import java.util.Scanner;

public class InsertionSort {

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
		
		int arrResult [] = insertionSort(arr,arr.length);
		for(int a: arrResult){
			System.out.println(a);
		}

	}

	private static int[] insertionSort(int[] arr, int length) {

		for(int i =1;i<=length-1;i++){
			int value = arr[i];
			int hole = i;
			while(hole>0 && arr[hole-1]> value){

				arr[hole]= arr[hole-1];
				hole= hole-1;

			}
			arr[hole]=value;
		}



		return arr;
		// TODO Auto-generated method stub

	}

}
