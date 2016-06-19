package com.geeksforgeek.basic;

import java.util.Scanner;

public class MaximumProductOfTwoNos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		
		for(int i=0; i<testCases;i++){
			int arrSize = scan.nextInt();
			int arrNumber[] = new int[arrSize];
			int product =0;
			int max=0;
			int maxIndex =0;
			for(int m=0; m<arrSize;m++){
				arrNumber[m]= scan.nextInt();
				if(max<arrNumber[m]){
					max = arrNumber[m];
					maxIndex =m;
				}
			}
			
			for(int m=0; m<arrSize;m++){
				if(product<max*arrNumber[m] && m!=maxIndex){
					product=max*arrNumber[m];
				}
			}
			
			
			System.out.println(product);	
		}	
	}

}
