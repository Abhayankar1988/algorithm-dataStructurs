package com.geeksforgeek.basic;

import java.util.HashMap;
import java.util.Scanner;

public class SingleNumber {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			int size = scan.nextInt();

			int arr[] = new int[size];

			for(int j=0; j<size; j++){
				arr[j]=scan.nextInt();
			}

			checkSingleNumber(arr);

		}	
	

	}

	private static void checkSingleNumber(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.remove(arr[i]);
			}else{
				map.put(arr[i], 1);
			}
			
		}
		
		System.out.println(map.entrySet().iterator().next().getKey());
	}

}
