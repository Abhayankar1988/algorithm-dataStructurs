package com.geeksforgeek.basic;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumDifferencePairs {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			int size = scan.nextInt();

			int arr[] = new int[size];

			for(int j=0; j<size; j++){
				arr[j]=scan.nextInt();
			}

			System.out.println(minimumDifference(arr));


		}	
	}

	private static int minimumDifference(int[] arr) {
		Arrays.sort(arr);

		int min = arr[1]-arr[0];

		for(int i=2; i<arr.length;i++){
			min = Math.min(min, arr[i] - arr[i-1]);
		}

		return min;
	}

}
