package com.geeksforgeek.basic;

import java.util.Scanner;

public class ArrayOfAlternatePositveAndNegative {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			int size = scan.nextInt();

			int arr[] = new int[size];

			for(int j=0; j<size; j++){
				arr[j]=scan.nextInt();
			}

			alternateNos(arr);

		}	
	}

	private static void alternateNos(int[] arr) {
		int k =0;
		int newArr[] = new int[arr.length];
		 newArr[k]=arr[0];
		 
		for(int j=1; j<arr.length; j++){
			for(int m=1; m<arr.length; m++){	
				if(newArr[k]>0 && j!=m){
					if(arr[j]<0){
						newArr[++k] = arr[j];
						arr[j]=0;
					}
				}else if(newArr[k]<0 && j!=m){
					if(arr[j]>0){
						newArr[++k] = arr[j];
						arr[j]=0;
					}
				}
				
				
			}
	
		}
		for(int a : newArr){
			System.out.print(a + " ");
		}
		
	}

}
