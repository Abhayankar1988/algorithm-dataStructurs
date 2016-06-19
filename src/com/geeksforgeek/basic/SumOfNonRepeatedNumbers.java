package com.geeksforgeek.basic;

import java.util.HashMap;
import java.util.Scanner;

public class SumOfNonRepeatedNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		
		for(int i=0; i<testCases;i++){
			int arrSize = scan.nextInt();
			int arrNumber[] = new int[arrSize];
			
			for(int m=0; m<arrSize;m++){
				arrNumber[m]= scan.nextInt();
			}
			
			int count =0;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			
			for(int k=0; k<arrNumber.length;k++){
				
				if(map.containsKey(arrNumber[k])){
					
				}else{
					count+=arrNumber[k];
					map.put(arrNumber[k], count);
				}
				
			}
			
			System.out.println(count);
			
		}
		
		
		
		

		
	}

}
