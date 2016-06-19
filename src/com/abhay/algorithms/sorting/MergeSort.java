package com.abhay.algorithms.sorting;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();

		int[] arr = new int[number];
		for(int i=0; i<number; i++){
			arr[i]= scan.nextInt();
		}

		mergeSort(arr);
		for(int a: arr){
			System.out.println(a);
		}

	}

	private static void mergeSort(int[] arr) {

		int n = arr.length;
		if(n<2)
			return;

		int mid= n/2;
		int left[] = new int[mid];
		int right[] = new int[n-mid];

		for(int i=0;i<=mid-1;i++){
			left[i]=arr[i];

		}
		/*for(int a: left){
				System.out.println(a);
			}*/
		for(int i=mid;i<=n-1;i++){
			right[i-mid]=arr[i];

		}

		mergeSort(left);
		mergeSort(right);
		Merge(left,right,arr);
	}

	private static void Merge(int[] left, int[] right, int[] arr) {

		int n_left=left.length;
		int n_right=right.length;

		int i=0;
		int j=0;
		int k=0;

		while(i<n_left && j<n_right){
			if(left[i]<=right[i]){
				arr[k]=left[i];
				i=i+1;
			}else{
				arr[k]=right[j];
				j=j+1;
			}
			k = k+1;
		}

		while(i<n_left){
			arr[k]=left[i];
			k=k+1;
			i=i+1;
		}
		while(j<n_right){
			arr[k]=right[j];
			k=k+1;
			j=j+1;
		}


	}


}
