package com.geeksforgeek.basic;

import java.util.Scanner;


/**
 * @author abchaubey
 *
 *
	 *Given an array of positive numbers, find the maximum sum of a subsequence with the constraint that no 2 numbers in the sequence
	 * should be adjacent in the array. So 3 2 7 10 should return 13 (sum of 3 and 10) or 3 2 5 10 7 should return 15 (sum of 3, 5 and 7).
	
	Input:
	
	The first line of input contains an integer T denoting the number of test cases.
	The first line of each test case is N,N is the size of array.
	The second line of each test case contains N input C[i].
	
	Output:
	
	Print the maximum sum of a subsequence.
	
	Constraints:
	
	1 ≤ T ≤ 80
	1 ≤ N ≤ 100
	1 ≤ C[i] ≤ 500
	
	Example:
	
	Input:
	2
	6
	5 5 10 100 10 5
	4
	3 2 7 10
	
	Output:
	110
	13
 */
public class MaxSum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		
		for(int i=0; i<testCases;i++){
			int arrSize = scan.nextInt();
			int arrNumber[] = new int[arrSize];
			
			for(int m=0; m<arrSize;m++){
				arrNumber[m]= scan.nextInt();
			}
			
			int max_sum1 = arrNumber[0];
			int max_sum2 =0;
			int new_maxSum =0;
			
			for(int k=1; k<arrNumber.length;k++){
				
				 new_maxSum = max_sum1>max_sum2?max_sum1:max_sum2;	 
				 max_sum1 = max_sum2 + arrNumber[k];
				 max_sum2 = new_maxSum;
				 		
			}
			
			System.out.println(max_sum1>max_sum2?max_sum1:max_sum2);
			
		}
		
		
		
		

		
	}

}
