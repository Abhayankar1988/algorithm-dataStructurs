package com.geeksforgeek.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MinCostOfRopes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			int size = scan.nextInt();

			int arr[] = new int[size];

			for(int j=0; j<size; j++){

				arr[j]=scan.nextInt();
			}
			
			Arrays.sort(arr);
			
			int count = arr[0] + arr[1];
			
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(count, 1);
			
			for(int j=2; j<arr.length;j++){
				count+=arr[j];
				map.put(count, 1);
			}
			
			int minCost =0;
			for(Integer a : map.keySet()){
				minCost+=a;
			}

			System.out.println(minCost);

		}	
	}
	
}
