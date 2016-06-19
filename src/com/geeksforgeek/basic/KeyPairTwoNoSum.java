package com.geeksforgeek.basic;

import java.util.Scanner;

public class KeyPairTwoNoSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			int size = scan.nextInt();

			int arr[] = new int[size];
			
			int sum = scan.nextInt();

			for(int j=0; j<size; j++){
				arr[j]=scan.nextInt();
			}

			 boolean testFlag = keyPair(arr, sum);
			 
			 if(testFlag){
				 System.out.println("Yes");
			 }else{
				 System.out.println("No");
			 }

		}	
	}

	private static boolean keyPair(int[] arr, int sum) {
		int count =0;
		boolean flag = false;
		for(int i=0; i<arr.length; i++){
			if(flag){
				break;
			}
			for(int k=i+1; k<arr.length;k++ ){
				count = arr[i]+arr[k];
				if(count==sum){
					flag = true;
					break;
				}
				
			}
		}
		return flag;
	}

}
