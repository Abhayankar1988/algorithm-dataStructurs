package com.abhay.algorithms.sorting;

import java.util.Scanner;

public class QuickSort {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();

		int[] arr = new int[number];
		for(int i=0; i<number; i++){
			arr[i]= scan.nextInt();
		}

		quickSort(arr, 0, arr.length);
		for(int a: arr){
			System.out.println(a);
		}

}
	
	private static void quickSort(int[] a, int start, int end) {
		
		if(start < end){
			int partitionIndex = Partition(a, start, end);
			quickSort(a, start, partitionIndex-1);
			quickSort(a, partitionIndex+1, end);
		}
		
		
	}

	private static int Partition(int[] a, int start, int end) {
		
		int pivot  = a[end];
		int partitionIndex = start;
		
		for(int k=start; k<end; k++){
			if(a[k]<=pivot){
			
				int temp = a[k];
				a[k]= a[partitionIndex];
				a[partitionIndex]= temp;
				partitionIndex++;
			}
		}
		swap(a[partitionIndex], a[end]);
	
		return partitionIndex;
	}

	private static void swap(int i, int j) {
		int temp= i;
		i=j;
		j=temp;
	}
}