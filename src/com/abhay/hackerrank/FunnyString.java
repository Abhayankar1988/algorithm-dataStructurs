package com.abhay.hackerrank;

import java.util.Scanner;

public class FunnyString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		boolean flag = false;
		for(int i =0; i<number;i++){
			String originalWord = scan.next();
			StringBuilder sb = new StringBuilder(originalWord);
			String reverseWord = sb.reverse().toString();

			for(int j=0; j<originalWord.length(); j++){
				if((j!=0)){

					if((Math.abs((int)originalWord.charAt(j) - (int)originalWord.charAt(j-1))) == 
							(Math.abs((int)reverseWord.charAt(j) - (int)reverseWord.charAt(j-1)))){
						flag = true;	
					}else{
						flag = false;
						break;
					}



				}

			}

			if(flag){
				System.out.println("Funny");
			}else{
				System.out.println("Not Funny");
			}

		}

	}}
