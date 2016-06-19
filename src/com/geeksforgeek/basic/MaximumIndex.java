package com.geeksforgeek.basic;

import java.util.Scanner;

public class MaximumIndex {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			int size = scan.nextInt();

			int arr[] = new int[size];

			for(int j=0; j<size; j++){

				arr[j]=scan.nextInt();
			}

			int max = arr[1] -arr[0];
			int min = arr[0];
			int k,l;
			int count =0;
			
			for(k=0; k<arr.length; k++){/*
				for(l=0; l<arr.length; l++){
					if(arr[l]<=arr[k] && max<(k-l)){
						max = k-l;
					}
				}

			*/
			 if(arr[k]-arr[0]>max){
				 max = arr[k] - arr[0];
				 count = k- (k+1);
			 }
			 
			 if(arr[k]<min){
				 min = arr[k];
			 }
			}
			System.out.println(max);
		}	
	}

}
