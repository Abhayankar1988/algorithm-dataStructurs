package com.abhay.hackerrank;

import java.util.Scanner;

public class UtopianTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++){
			
			int number = scan.nextInt();
			int sum =0;
			for(int m=0; m<=number; m++)
			{
				if(m%2 == 0 ){
					sum = sum + 1;
				}else if (m ==0){
					
					sum = sum +1;
				}else{
					sum = sum*2;
				}
			}
			System.out.println(sum);
		}
	}

}
