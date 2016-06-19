package com.abhay.hackerrank;

import java.util.Scanner;

public class OZStrings {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		int testCase = scan.nextInt();

		for(int i=0; i<testCase; i++){
			int N = scan.nextInt();
			int numO = scan.nextInt();
			int numZ = scan.nextInt();
			int result=0;
			String arr[] = new String[N]; 
			for(int k=0; k<N; k++){
				String word = scan.next();
				arr[k] = word;
				
			
				int count =word.toCharArray().length;;
				for(int j=0; j<word.toCharArray().length; j++){

					if(word.charAt(j)=='O' && numO>0){
						--numO;
						--count;
					}else if(word.charAt(j)=='Z' && numZ>0){
						--numZ;
						--count;
					}

					if(count==0){
						++result;
					}
				}

			}

			System.out.println(result);
		}

	}

}
