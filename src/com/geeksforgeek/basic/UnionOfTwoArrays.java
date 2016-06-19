package com.geeksforgeek.basic;

import java.util.Scanner;

public class UnionOfTwoArrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();

		for(int i=0; i<testCases;i++){

			int sizeM = scan.nextInt();

			int sizeN = scan.nextInt();

			int arrM[] = new int[sizeM];

			int arrN[] = new int[sizeN];

			for(int j=0; j<sizeM; j++){
				arrM[j]=scan.nextInt();
			}

			for(int j=0; j<sizeN; j++){
				arrN[j]=scan.nextInt();
			}

			unionArrays(arrM, arrN);
			
			//intersectionArrays(arrM, arrN);

		}	
	}

	private static void unionArrays(int[] arrM, int[] arrN) {

		int m = arrM.length;
		int n = arrN.length;
		int i=0, j=0;
		while(i<m && j<n){
			if(arrM[i]>arrN[j]){
				System.out.print(arrM[i++] + " ");
			}else if(arrM[i]==arrN[j]) {
				System.out.print(arrM[i++] + " ");
				j++;
			}else{
				System.out.print(arrN[j++] + " ");
			}
		}		
		while(i<m){
			System.out.print(arrM[i++] + " ");
		}

		while(j<n){
			System.out.print(arrN[j++] + " ");
		}

	}


	private static void intersectionArrays(int[] arrM, int [] arrN){
		
		int i=0 ,j=0;
		int m = arrM.length;
		int n = arrN.length;
		
		while(i<m && j<n){
			if(arrM[i]==arrN[j]) {
				System.out.println(arrM[i++]);
				j++;
			}
		}

	}

}
