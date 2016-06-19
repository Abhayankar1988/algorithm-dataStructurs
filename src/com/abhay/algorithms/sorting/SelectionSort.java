package com.abhay.algorithms.sorting;

import java.util.Scanner;


public class SelectionSort {

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


		for (int i = 0; i<arr.length -1; i++)
		{
			int index = i;
			for (int j = i + 1; j <arr.length; j++){
				if (arr[j] < arr[index])
					index = j;
			}

			int smallerNumber = arr[index]; 
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}

		for(int i =0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

	}



}
