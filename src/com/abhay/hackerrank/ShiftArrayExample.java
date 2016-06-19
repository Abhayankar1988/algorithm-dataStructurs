package com.abhay.hackerrank;

import java.util.Scanner;

public class ShiftArrayExample {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int shift = scan.nextInt();
		
		int arr[] = {1,2,3,4,5};
		
		int size = arr.length - shift;
		
		int newArr[] = new int[arr.length];
		int count = -1;
		
		for(int i=size, j=0; j<arr.length; j++,i++){			
			if(i<=arr.length-1 && count<=arr.length){
				++count;
				newArr[j] = arr[i];
			}else if(count<=arr.length){
				i=0;
				newArr[j] = arr[i];
			}
			
		}
		
		for(int a : newArr){
			System.out.println(a);
		}

	}

}
