package com.geeksforgeek.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ReducedForm {
	//code
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int testCase = scan.nextInt();
			
			for(int i=0; i<testCase; i++){
			    int size = scan.nextInt();
			    int arr[] = new int[size];
			    int temp[] = new int[size];
			    for(int j=0; j<size;j++){
			        arr[j]=scan.nextInt();
			        temp[j]=scan.nextInt();
			    }
			    
			    reducedForm(arr, temp);
			}
			
		}
		
		public static void reducedForm(int[] arr, int [] temp){
		    Arrays.sort(temp);
		    
		    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		    int count = -1;
		    for(int a : temp){
		    	map.put(a, ++count);
		    }
		    
		    for(int b : arr){
		    	if(map.containsKey(b)){
		    		System.out.print(map.get(b) + " ");
		    	}
		    }
		    
		  
		    
		}
}
