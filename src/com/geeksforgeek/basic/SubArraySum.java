package com.geeksforgeek.basic;

import java.util.Scanner;

public class SubArraySum {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			int size = scan.nextInt();

			int sum = scan.nextInt();
			
			int arr[] = new int[size];

			for(int j=0; j<size; j++){
				arr[j]=scan.nextInt();
			}
			
			boolean testFlag = subArray(arr,sum);
			
			if(!testFlag){
				System.out.println("-1");
			}

		}	
	

		}

	private static boolean subArray(int[] arr, int sum) {
		boolean flag = false;
		boolean printFlag = false;
		int count =0;
		int j=0;
		for(int i=0; i<arr.length; i++){
			if(flag){
				break;
			}else if(sum==count && !printFlag){
				System.out.println(i + " " + j);
				flag=true;
				break;
			}
			 count=0;
			for(j=i; j<arr.length; j++){
				if(sum==count){
					System.out.println(i+1 + " " + j);
					flag = true;
					printFlag =true;
					break;
				}
				else if(sum>count){
					count+=arr[j];
				}else if(sum<count){
					break;
				}
			}	
			
		
		}
		return flag;
		
	}

}
