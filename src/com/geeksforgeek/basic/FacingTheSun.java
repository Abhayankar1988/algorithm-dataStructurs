package com.geeksforgeek.basic;

import java.util.Scanner;

public class FacingTheSun {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			int size = scan.nextInt();

			int arr[] = new int[size];

			for(int j=0; j<size; j++){
				arr[j]=scan.nextInt();
			}

			System.out.println(facingTheSun(arr));

		}	
	}

	private static int facingTheSun(int[] arr) {
		
		int count =1;
		int max = arr[0];
		for(int i=0; i<arr.length; i++){
			if(i!=arr.length-1 && max<arr[i+1]){
				max = arr[i+1];
				System.out.println(max);
				++count;
			}
		}
		return count;
	}

}
