package com.abhay.hackerrank;

import java.util.Scanner;

public class AngryProfessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] input = new int[n];
		int count =0;
		int target = 3;
		for(int i=0; i<input.length;i++){
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			if(input[i]<=0){
				++count;
			}
		}
		if(count<=target){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
	}

}
